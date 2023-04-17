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
	 * Enter a parse tree produced by the {@code IgualdadeID}
	 * labeled alternative in {@link GeradorRelatorioParser#igu}.
	 * @param ctx the parse tree
	 */
	void enterIgualdadeID(GeradorRelatorioParser.IgualdadeIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IgualdadeID}
	 * labeled alternative in {@link GeradorRelatorioParser#igu}.
	 * @param ctx the parse tree
	 */
	void exitIgualdadeID(GeradorRelatorioParser.IgualdadeIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IgualdadeNum}
	 * labeled alternative in {@link GeradorRelatorioParser#igu}.
	 * @param ctx the parse tree
	 */
	void enterIgualdadeNum(GeradorRelatorioParser.IgualdadeNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IgualdadeNum}
	 * labeled alternative in {@link GeradorRelatorioParser#igu}.
	 * @param ctx the parse tree
	 */
	void exitIgualdadeNum(GeradorRelatorioParser.IgualdadeNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparadorMaior}
	 * labeled alternative in {@link GeradorRelatorioParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComparadorMaior(GeradorRelatorioParser.ComparadorMaiorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparadorMaior}
	 * labeled alternative in {@link GeradorRelatorioParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComparadorMaior(GeradorRelatorioParser.ComparadorMaiorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparadorMenor}
	 * labeled alternative in {@link GeradorRelatorioParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComparadorMenor(GeradorRelatorioParser.ComparadorMenorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparadorMenor}
	 * labeled alternative in {@link GeradorRelatorioParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComparadorMenor(GeradorRelatorioParser.ComparadorMenorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparadorMaiorIgual}
	 * labeled alternative in {@link GeradorRelatorioParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComparadorMaiorIgual(GeradorRelatorioParser.ComparadorMaiorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparadorMaiorIgual}
	 * labeled alternative in {@link GeradorRelatorioParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComparadorMaiorIgual(GeradorRelatorioParser.ComparadorMaiorIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparadorMenorIgual}
	 * labeled alternative in {@link GeradorRelatorioParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComparadorMenorIgual(GeradorRelatorioParser.ComparadorMenorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparadorMenorIgual}
	 * labeled alternative in {@link GeradorRelatorioParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComparadorMenorIgual(GeradorRelatorioParser.ComparadorMenorIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparadorIntervaloAberto}
	 * labeled alternative in {@link GeradorRelatorioParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComparadorIntervaloAberto(GeradorRelatorioParser.ComparadorIntervaloAbertoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparadorIntervaloAberto}
	 * labeled alternative in {@link GeradorRelatorioParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComparadorIntervaloAberto(GeradorRelatorioParser.ComparadorIntervaloAbertoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparadorIntervaloFechado}
	 * labeled alternative in {@link GeradorRelatorioParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComparadorIntervaloFechado(GeradorRelatorioParser.ComparadorIntervaloFechadoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparadorIntervaloFechado}
	 * labeled alternative in {@link GeradorRelatorioParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComparadorIntervaloFechado(GeradorRelatorioParser.ComparadorIntervaloFechadoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparadorIntervaloSemiabertoEsquerda}
	 * labeled alternative in {@link GeradorRelatorioParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComparadorIntervaloSemiabertoEsquerda(GeradorRelatorioParser.ComparadorIntervaloSemiabertoEsquerdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparadorIntervaloSemiabertoEsquerda}
	 * labeled alternative in {@link GeradorRelatorioParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComparadorIntervaloSemiabertoEsquerda(GeradorRelatorioParser.ComparadorIntervaloSemiabertoEsquerdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparadorIntervaloSemiabertoDireita}
	 * labeled alternative in {@link GeradorRelatorioParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComparadorIntervaloSemiabertoDireita(GeradorRelatorioParser.ComparadorIntervaloSemiabertoDireitaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparadorIntervaloSemiabertoDireita}
	 * labeled alternative in {@link GeradorRelatorioParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComparadorIntervaloSemiabertoDireita(GeradorRelatorioParser.ComparadorIntervaloSemiabertoDireitaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegacaoExcalmacao}
	 * labeled alternative in {@link GeradorRelatorioParser#neg}.
	 * @param ctx the parse tree
	 */
	void enterNegacaoExcalmacao(GeradorRelatorioParser.NegacaoExcalmacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegacaoExcalmacao}
	 * labeled alternative in {@link GeradorRelatorioParser#neg}.
	 * @param ctx the parse tree
	 */
	void exitNegacaoExcalmacao(GeradorRelatorioParser.NegacaoExcalmacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegacaoNot}
	 * labeled alternative in {@link GeradorRelatorioParser#neg}.
	 * @param ctx the parse tree
	 */
	void enterNegacaoNot(GeradorRelatorioParser.NegacaoNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegacaoNot}
	 * labeled alternative in {@link GeradorRelatorioParser#neg}.
	 * @param ctx the parse tree
	 */
	void exitNegacaoNot(GeradorRelatorioParser.NegacaoNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LikeDireita}
	 * labeled alternative in {@link GeradorRelatorioParser#lk}.
	 * @param ctx the parse tree
	 */
	void enterLikeDireita(GeradorRelatorioParser.LikeDireitaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LikeDireita}
	 * labeled alternative in {@link GeradorRelatorioParser#lk}.
	 * @param ctx the parse tree
	 */
	void exitLikeDireita(GeradorRelatorioParser.LikeDireitaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LikeEsquerda}
	 * labeled alternative in {@link GeradorRelatorioParser#lk}.
	 * @param ctx the parse tree
	 */
	void enterLikeEsquerda(GeradorRelatorioParser.LikeEsquerdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LikeEsquerda}
	 * labeled alternative in {@link GeradorRelatorioParser#lk}.
	 * @param ctx the parse tree
	 */
	void exitLikeEsquerda(GeradorRelatorioParser.LikeEsquerdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LikeDuplo}
	 * labeled alternative in {@link GeradorRelatorioParser#lk}.
	 * @param ctx the parse tree
	 */
	void enterLikeDuplo(GeradorRelatorioParser.LikeDuploContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LikeDuplo}
	 * labeled alternative in {@link GeradorRelatorioParser#lk}.
	 * @param ctx the parse tree
	 */
	void exitLikeDuplo(GeradorRelatorioParser.LikeDuploContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsNull}
	 * labeled alternative in {@link GeradorRelatorioParser#nul}.
	 * @param ctx the parse tree
	 */
	void enterIsNull(GeradorRelatorioParser.IsNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsNull}
	 * labeled alternative in {@link GeradorRelatorioParser#nul}.
	 * @param ctx the parse tree
	 */
	void exitIsNull(GeradorRelatorioParser.IsNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsNotNull}
	 * labeled alternative in {@link GeradorRelatorioParser#nul}.
	 * @param ctx the parse tree
	 */
	void enterIsNotNull(GeradorRelatorioParser.IsNotNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsNotNull}
	 * labeled alternative in {@link GeradorRelatorioParser#nul}.
	 * @param ctx the parse tree
	 */
	void exitIsNotNull(GeradorRelatorioParser.IsNotNullContext ctx);
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
	 * Enter a parse tree produced by the {@code SequenciaSelect}
	 * labeled alternative in {@link GeradorRelatorioParser#seqSlct}.
	 * @param ctx the parse tree
	 */
	void enterSequenciaSelect(GeradorRelatorioParser.SequenciaSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SequenciaSelect}
	 * labeled alternative in {@link GeradorRelatorioParser#seqSlct}.
	 * @param ctx the parse tree
	 */
	void exitSequenciaSelect(GeradorRelatorioParser.SequenciaSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code From}
	 * labeled alternative in {@link GeradorRelatorioParser#frm}.
	 * @param ctx the parse tree
	 */
	void enterFrom(GeradorRelatorioParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by the {@code From}
	 * labeled alternative in {@link GeradorRelatorioParser#frm}.
	 * @param ctx the parse tree
	 */
	void exitFrom(GeradorRelatorioParser.FromContext ctx);
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
	 * Enter a parse tree produced by the {@code Igualdade}
	 * labeled alternative in {@link GeradorRelatorioParser#opWhr}.
	 * @param ctx the parse tree
	 */
	void enterIgualdade(GeradorRelatorioParser.IgualdadeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Igualdade}
	 * labeled alternative in {@link GeradorRelatorioParser#opWhr}.
	 * @param ctx the parse tree
	 */
	void exitIgualdade(GeradorRelatorioParser.IgualdadeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparacao}
	 * labeled alternative in {@link GeradorRelatorioParser#opWhr}.
	 * @param ctx the parse tree
	 */
	void enterComparacao(GeradorRelatorioParser.ComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparacao}
	 * labeled alternative in {@link GeradorRelatorioParser#opWhr}.
	 * @param ctx the parse tree
	 */
	void exitComparacao(GeradorRelatorioParser.ComparacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negacao}
	 * labeled alternative in {@link GeradorRelatorioParser#opWhr}.
	 * @param ctx the parse tree
	 */
	void enterNegacao(GeradorRelatorioParser.NegacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negacao}
	 * labeled alternative in {@link GeradorRelatorioParser#opWhr}.
	 * @param ctx the parse tree
	 */
	void exitNegacao(GeradorRelatorioParser.NegacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Like}
	 * labeled alternative in {@link GeradorRelatorioParser#opWhr}.
	 * @param ctx the parse tree
	 */
	void enterLike(GeradorRelatorioParser.LikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Like}
	 * labeled alternative in {@link GeradorRelatorioParser#opWhr}.
	 * @param ctx the parse tree
	 */
	void exitLike(GeradorRelatorioParser.LikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Nulidade}
	 * labeled alternative in {@link GeradorRelatorioParser#opWhr}.
	 * @param ctx the parse tree
	 */
	void enterNulidade(GeradorRelatorioParser.NulidadeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nulidade}
	 * labeled alternative in {@link GeradorRelatorioParser#opWhr}.
	 * @param ctx the parse tree
	 */
	void exitNulidade(GeradorRelatorioParser.NulidadeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SequenciaWhere}
	 * labeled alternative in {@link GeradorRelatorioParser#seqWhr}.
	 * @param ctx the parse tree
	 */
	void enterSequenciaWhere(GeradorRelatorioParser.SequenciaWhereContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SequenciaWhere}
	 * labeled alternative in {@link GeradorRelatorioParser#seqWhr}.
	 * @param ctx the parse tree
	 */
	void exitSequenciaWhere(GeradorRelatorioParser.SequenciaWhereContext ctx);
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
}