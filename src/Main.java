import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.Trees;
import java.util.*;
import java.util.regex.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
//        StringBuffer input = new StringBuffer("getTopEmpresasMaisContratam(5)");
        CharStream input = CharStreams.fromString("getTopEmpresasMaisContratam(5)");
        GeradorRelatorioLexer lexer = new GeradorRelatorioLexer(input);
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        GeradorRelatorioParser parser = new GeradorRelatorioParser( tokens );
        ParserRuleContext tree = parser.exp();
        System.out.printf("Tree = %s\n", tree.toStringTree(parser));
    }
}