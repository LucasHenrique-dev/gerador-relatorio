import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.Trees;
import java.util.*;
import java.util.regex.*;
import java.io.*;

public class Main {

    static Pattern classNamePatern = Pattern.compile("[a-zA-Z]+[$]([A-Za-z]+)Context");
    static String getRule(ParseTree t) {
       String className = t.getClass().getName();
       Matcher m = classNamePatern.matcher(className);
       if (m.find()) {
         return m.group(1);
       }
       return null;
    }

    public static int avalie(ParseTree t) {
        String ruleName = getRule(t);
        switch (ruleName) {
        case "GetTop":
            System.out.printf("Executou: getTop");
           return 0;
        case "ExtrairDados":
            System.out.printf("Executou: extrairDados");
           return 0;
        case "EstagiosCurso":
            System.out.printf("Executou: estagiosCurso");
           return 0;
        default:
            throw new RuntimeException("Nao ser compilar " + ruleName + " no codigo : " + t.getText());
        }

    }

    public static void main(String args[]) throws Exception {
//        StringBuffer input = new StringBuffer("getTopEmpresasMaisContratam(5)");
        // CharStream input = CharStreams.fromString("getTopEmpresasMaisContratam(5)");
        CharStream input = CharStreams.fromString("getTopEmpresasMaisContratam(5)");
        GeradorRelatorioLexer lexer = new GeradorRelatorioLexer(input);
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        GeradorRelatorioParser parser = new GeradorRelatorioParser( tokens );
        ParserRuleContext tree = parser.exp();
        System.out.printf("Tree = %s\n", tree.toStringTree(parser));
        avalie(tree);
    }
}