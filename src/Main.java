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
    static void conectarExcel(ParseTree t, String excel) throws FilloException {
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

                String excel = t.getChild(1).getText();
                // System.out.printf("Filhos: %d\n",Quantidadefilhos);
                conectarExcel(t, excel);
                if (Quantidadefilhos > 2)
                    query = new StringBuilder(avalie(t.getChild(2)));
                else
                    query = new StringBuilder("SELECT * " + query + "FROM CONTROLE");
                if (Quantidadefilhos > 3)
                    query = new StringBuilder(avalie(t.getChild(3)));
                if (Quantidadefilhos > 4)
                    query = new StringBuilder(avalie(t.getChild(4)));

                return query+"";
            case "IguID":

                return query + t.getChild(0).getText() + " = \'" + t.getChild(2).getText() + "\' ";
            case "IguNum":

                return query + t.getChild(0).getText() + " = " + t.getChild(2).getText() + " ";
            case "SeqIgu":
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
        case "Str":
            return t.getText() + " " + query;
        case "SeqSelect":
            for (int i = t.getChildCount() - 1; i >= 0; i--) {
                String filho = t.getChild(i).getText();
                
                if (filho.equals(",")) query.insert(0, ", ");
                else {
                    // System.out.printf("Filho: %s\n", t.getChild(i).getText());
                    query = new StringBuilder(avalie(t.getChild(i)));
                }
            }

            return query+"";
        case "Select":
            Quantidadefilhos = t.getChildCount();
            query = new StringBuilder(avalie(t.getChild(1)) + "FROM CONTROLE ");

            if (Quantidadefilhos > 2) query = new StringBuilder(avalie(t.getChild(2)));
            return "SELECT " + query;
        case "Where":
            Quantidadefilhos = t.getChildCount();
            query.append("WHERE ");
            query = new StringBuilder(avalie(t.getChild(1)));

            if(Quantidadefilhos > 2) {
                query = new StringBuilder(avalie(t.getChild(2)));
            }
            return query+"";
        default:
            throw new RuntimeException("Nao sei compilar " + ruleName + " no codigo : " + t.getText());
        }

    }

    public static void main(String args[]) throws Exception {
        // CharStream input = CharStreams.fromString("getTopEmpresasMaisContratam(5)");
        CharStream input = CharStreams.fromFileName("input.txt");
        // CharStream input = CharStreams.fromString("getTopEmpresasMaisContratam(5)");
        GeradorRelatorioLexer lexer = new GeradorRelatorioLexer(input);
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        GeradorRelatorioParser parser = new GeradorRelatorioParser( tokens );
        ParserRuleContext tree = parser.program();
        System.out.printf("Tree = %s\n", tree.toStringTree(parser));

        query = new StringBuilder(avalie(tree));
        System.out.printf("Query: %s\n", query);
        query = new StringBuilder("SELECT CPF FROM CONTROLE ASC");
        recordset = connection.executeQuery(query+"");

        exibirQuerySQL(recordset);

        recordset.close();
        connection.close();
    }
}
