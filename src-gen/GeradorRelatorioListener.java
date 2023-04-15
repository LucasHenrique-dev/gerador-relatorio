// Generated from GeradorRelatorio.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GeradorRelatorioParser}.
 */
public interface GeradorRelatorioListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Programa}
	 * labeled alternative in {@link GeradorRelatorioParser#program}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GeradorRelatorioParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Programa}
	 * labeled alternative in {@link GeradorRelatorioParser#program}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GeradorRelatorioParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Igu}
	 * labeled alternative in {@link GeradorRelatorioParser#igualdade}.
	 * @param ctx the parse tree
	 */
	void enterIgu(GeradorRelatorioParser.IguContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Igu}
	 * labeled alternative in {@link GeradorRelatorioParser#igualdade}.
	 * @param ctx the parse tree
	 */
	void exitIgu(GeradorRelatorioParser.IguContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SeqID}
	 * labeled alternative in {@link GeradorRelatorioParser#sequenciaID}.
	 * @param ctx the parse tree
	 */
	void enterSeqID(GeradorRelatorioParser.SeqIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SeqID}
	 * labeled alternative in {@link GeradorRelatorioParser#sequenciaID}.
	 * @param ctx the parse tree
	 */
	void exitSeqID(GeradorRelatorioParser.SeqIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SeqIgu}
	 * labeled alternative in {@link GeradorRelatorioParser#sequenciaIgualdade}.
	 * @param ctx the parse tree
	 */
	void enterSeqIgu(GeradorRelatorioParser.SeqIguContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SeqIgu}
	 * labeled alternative in {@link GeradorRelatorioParser#sequenciaIgualdade}.
	 * @param ctx the parse tree
	 */
	void exitSeqIgu(GeradorRelatorioParser.SeqIguContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Str}
	 * labeled alternative in {@link GeradorRelatorioParser#elemSlct}.
	 * @param ctx the parse tree
	 */
	void enterStr(GeradorRelatorioParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Str}
	 * labeled alternative in {@link GeradorRelatorioParser#elemSlct}.
	 * @param ctx the parse tree
	 */
	void exitStr(GeradorRelatorioParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Funcao}
	 * labeled alternative in {@link GeradorRelatorioParser#elemSlct}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(GeradorRelatorioParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Funcao}
	 * labeled alternative in {@link GeradorRelatorioParser#elemSlct}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(GeradorRelatorioParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SeqSelect}
	 * labeled alternative in {@link GeradorRelatorioParser#sequenciaSelect}.
	 * @param ctx the parse tree
	 */
	void enterSeqSelect(GeradorRelatorioParser.SeqSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SeqSelect}
	 * labeled alternative in {@link GeradorRelatorioParser#sequenciaSelect}.
	 * @param ctx the parse tree
	 */
	void exitSeqSelect(GeradorRelatorioParser.SeqSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Select}
	 * labeled alternative in {@link GeradorRelatorioParser#slct}.
	 * @param ctx the parse tree
	 */
	void enterSelect(GeradorRelatorioParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Select}
	 * labeled alternative in {@link GeradorRelatorioParser#slct}.
	 * @param ctx the parse tree
	 */
	void exitSelect(GeradorRelatorioParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Where}
	 * labeled alternative in {@link GeradorRelatorioParser#whr}.
	 * @param ctx the parse tree
	 */
	void enterWhere(GeradorRelatorioParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Where}
	 * labeled alternative in {@link GeradorRelatorioParser#whr}.
	 * @param ctx the parse tree
	 */
	void exitWhere(GeradorRelatorioParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Agrupar}
	 * labeled alternative in {@link GeradorRelatorioParser#aggr}.
	 * @param ctx the parse tree
	 */
	void enterAgrupar(GeradorRelatorioParser.AgruparContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Agrupar}
	 * labeled alternative in {@link GeradorRelatorioParser#aggr}.
	 * @param ctx the parse tree
	 */
	void exitAgrupar(GeradorRelatorioParser.AgruparContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Count}
	 * labeled alternative in {@link GeradorRelatorioParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterCount(GeradorRelatorioParser.CountContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Count}
	 * labeled alternative in {@link GeradorRelatorioParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitCount(GeradorRelatorioParser.CountContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ascendente}
	 * labeled alternative in {@link GeradorRelatorioParser#elemOrdem}.
	 * @param ctx the parse tree
	 */
	void enterAscendente(GeradorRelatorioParser.AscendenteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ascendente}
	 * labeled alternative in {@link GeradorRelatorioParser#elemOrdem}.
	 * @param ctx the parse tree
	 */
	void exitAscendente(GeradorRelatorioParser.AscendenteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Decrescente}
	 * labeled alternative in {@link GeradorRelatorioParser#elemOrdem}.
	 * @param ctx the parse tree
	 */
	void enterDecrescente(GeradorRelatorioParser.DecrescenteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Decrescente}
	 * labeled alternative in {@link GeradorRelatorioParser#elemOrdem}.
	 * @param ctx the parse tree
	 */
	void exitDecrescente(GeradorRelatorioParser.DecrescenteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ordem}
	 * labeled alternative in {@link GeradorRelatorioParser#ord}.
	 * @param ctx the parse tree
	 */
	void enterOrdem(GeradorRelatorioParser.OrdemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ordem}
	 * labeled alternative in {@link GeradorRelatorioParser#ord}.
	 * @param ctx the parse tree
	 */
	void exitOrdem(GeradorRelatorioParser.OrdemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Limit}
	 * labeled alternative in {@link GeradorRelatorioParser#len}.
	 * @param ctx the parse tree
	 */
	void enterLimit(GeradorRelatorioParser.LimitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Limit}
	 * labeled alternative in {@link GeradorRelatorioParser#len}.
	 * @param ctx the parse tree
	 */
	void exitLimit(GeradorRelatorioParser.LimitContext ctx);
}