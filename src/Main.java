import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.Trees;
import java.util.*;
import java.util.regex.*;
import java.io.*;
//IMPORT API EXCEL JAVA
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Main {

    //VARIAVEIS API EXCEL//////////////////////////////
    static Fillo fillo = new Fillo();
    static Connection connection;
    static Recordset recordset;
    ///////////////////////////////////////////////////

    //VARIAVEIS SUPORTE////////////////////////////////
    static StringBuilder query = new StringBuilder();
    ///////////////////////////////////////////////////

    //FUNCOES DE SUPORTE///////////////////////////////
    static void conectarExcel(String excel) throws FilloException {
        System.out.printf("Excel: %s\n",excel);
        connection = fillo.getConnection(excel);
    }

    static void exibirQuerySQL(Recordset recordset) throws FilloException {       
        String[] colunas = recordset.getFieldNames().toArray(new String[0]);
            
        // Itera sobre os registros do recordset
        while (recordset.next()) {
            // Exibe os valores de cada coluna
            for (String coluna : colunas) {
                String valor = recordset.getField(coluna);
                System.out.print(" | " + coluna + ": " + valor);
            }
            System.out.printf(" |\n");
        }
    }
    ///////////////////////////////////////////////////

    static Pattern classNamePatern = Pattern.compile("[a-zA-Z]+[$]([A-Za-z]+)Context");
    static String getRule(ParseTree t) {
       String className = t.getClass().getName();
       Matcher m = classNamePatern.matcher(className);
       if (m.find()) {
         return m.group(1);
       }
       return null;
    }

    public static String avalie(ParseTree t) throws FilloException {
        int Quantidadefilhos;
        String ruleName = getRule(t);
        // System.out.printf("Regra: %s\n",ruleName);
        String temporaryString = new String();
        switch (ruleName) {
            case "Programa":
                Quantidadefilhos = t.getChildCount();

                String excel = t.getChild(1).getText().trim();
                String extensao = t.getChild(2).getText();

                // System.out.printf("Filhos: %d\n",Quantidadefilhos);
                conectarExcel(excel+extensao);

                query = new StringBuilder(avalie(t.getChild(3)));
                if (Quantidadefilhos > 4)
                    query = new StringBuilder(avalie(t.getChild(4)));
                else query = new StringBuilder("SELECT * " + query);

                return query+"";
            case "IgualdadeID":
                return query + t.getChild(0).getText() + " = \'" + t.getChild(2).getText() + "\' ";
            case "IgualdadeNum":
                System.out.printf("Entrei IgualdadeNum\n");
                return query + t.getChild(0).getText() + " = " + t.getChild(2).getText() + " ";
            case "ComparadorMaior":
            case "ComparadorMenor":
            case "ComparadorMaiorIgual":
            case "ComparadorMenorIgual":
                return query + t.getChild(0).getText() + t.getChild(1).getText() + t.getChild(2).getText() + " ";
            case "ComparadorIntervaloAberto":
            case "ComparadorIntervaloFechado":
            case "ComparadorIntervaloSemiabertoEsquerda":
            case "ComparadorIntervaloSemiabertoDireita":
                return query + t.getChild(0).getText() + t.getChild(1).getText() + t.getChild(2).getText() + t.getChild(3).getText() + t.getChild(4).getText()+" ";
            case "NegacaoExcalmacao":

                return query + t.getChild(0).getText() + " = " + t.getChild(2).getText() + " ";
            case "NegacaoNot":

                return query + t.getChild(0).getText() + " = " + t.getChild(2).getText() + " ";
            case "LikeDireita":

                return query + t.getChild(0).getText() + " = " + t.getChild(2).getText() + " ";
            case "LikeEsquerda":

                return query + t.getChild(0).getText() + " = " + t.getChild(2).getText() + " ";
            case "LikeDuplo":

                return query + t.getChild(0).getText() + " = " + t.getChild(2).getText() + " ";
            case "IsNull":

                return query + t.getChild(0).getText() + " = " + t.getChild(2).getText() + " ";
            case "IsNotNull":

                return query + t.getChild(0).getText() + " = " + t.getChild(2).getText() + " ";
            case "Str":
                return t.getText() + " " + query;
            case "SequenciaSelect":
                for (int i = t.getChildCount() - 1; i >= 0; i--) {
                    String filho = t.getChild(i).getText();
                    
                    if (filho.equals(",")) query.insert(0, ", ");
                    else {
                        // System.out.printf("Filho: %s\n", t.getChild(i).getText());
                        query = new StringBuilder(avalie(t.getChild(i)));
                    }
                }

                return query+"";
            case "From":

                return query + "FROM " + t.getChild(1).getText() + " ";
            case "Select":
                Quantidadefilhos = t.getChildCount();
                query = new StringBuilder("SELECT " + avalie(t.getChild(1)));

                if (Quantidadefilhos > 2) query = new StringBuilder(avalie(t.getChild(2)));
                return query+"";
            case "Igualdade":

                return avalie(t.getChild(0));
            case "Comparacao":

                return avalie(t.getChild(0));
            case "Negacao":

                return avalie(t.getChild(0));
            case "Like":

                return avalie(t.getChild(0));
            case "Nulidade":

                return avalie(t.getChild(0));
            case "SequenciaWhere":
                Quantidadefilhos = t.getChildCount();
                for (int i = 0; i < Quantidadefilhos; i++) {
                    String filho = t.getChild(i).getText();

                    if (filho.equals(",")) query.append("AND ");
                    else {
                        // System.out.printf("Filho: %s\n", t.getChild(i).getText());
                        query = new StringBuilder(avalie(t.getChild(i)));
                    }
                }
            
                return query+"";
            case "Where":
                query.append("WHERE ");
                
                return avalie(t.getChild(1));
            default:
                throw new RuntimeException("Nao ser compilar " + ruleName + " no codigo : " + t.getText());
        }

    }

    public static void main(String args[]) throws Exception {
        // CharStream input = CharStreams.fromString("getTopEmpresasMaisContratam(5)");
        CharStream input = CharStreams.fromFileName("input2.txt");
        GeradorRelatorioLexer lexer = new GeradorRelatorioLexer(input);
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        GeradorRelatorioParser parser = new GeradorRelatorioParser( tokens );
        ParserRuleContext tree = parser.program();
        System.out.printf("Tree = %s\n", tree.toStringTree(parser));

        query = new StringBuilder(avalie(tree));
        System.out.printf("Query: %s\n", query);
        //query = new StringBuilder("SELECT DISTINCT curso FROM CONTROLE");
        recordset = connection.executeQuery(query+"");

        exibirQuerySQL(recordset);

        recordset.close();
        connection.close();
    }
}
