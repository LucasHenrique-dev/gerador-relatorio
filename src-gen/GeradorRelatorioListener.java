// Generated from GeradorRelatorio.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GeradorRelatorioParser}.
 */
public interface GeradorRelatorioListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GeradorRelatorioParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GeradorRelatorioParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeradorRelatorioParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GeradorRelatorioParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getTop}
	 * labeled alternative in {@link GeradorRelatorioParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterGetTop(GeradorRelatorioParser.GetTopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getTop}
	 * labeled alternative in {@link GeradorRelatorioParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitGetTop(GeradorRelatorioParser.GetTopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extrairDados}
	 * labeled alternative in {@link GeradorRelatorioParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExtrairDados(GeradorRelatorioParser.ExtrairDadosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extrairDados}
	 * labeled alternative in {@link GeradorRelatorioParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExtrairDados(GeradorRelatorioParser.ExtrairDadosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code estagiosCurso}
	 * labeled alternative in {@link GeradorRelatorioParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterEstagiosCurso(GeradorRelatorioParser.EstagiosCursoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code estagiosCurso}
	 * labeled alternative in {@link GeradorRelatorioParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitEstagiosCurso(GeradorRelatorioParser.EstagiosCursoContext ctx);
}