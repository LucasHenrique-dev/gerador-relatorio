// Generated from GeradorRelatorio.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GeradorRelatorioParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NUM=15, ID=16, EXTENSAO=17, 
		APOSTROFO=18, ESPACO=19;
	public static final int
		RULE_program = 0, RULE_igu = 1, RULE_comp = 2, RULE_neg = 3, RULE_lk = 4, 
		RULE_nul = 5, RULE_elemSlct = 6, RULE_seqSlct = 7, RULE_frm = 8, RULE_slct = 9, 
		RULE_opWhr = 10, RULE_seqWhr = 11, RULE_whr = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "igu", "comp", "neg", "lk", "nul", "elemSlct", "seqSlct", 
			"frm", "slct", "opWhr", "seqWhr", "whr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'EXCEL:'", "'='", "'>'", "'<'", "'>='", "'<='", "'!='", "'NOT'", 
			"'..'", "'NULL'", "','", "'PAGINA:'", "'COLUNA:'", "'RESTRICAO:'", null, 
			null, "'.xlsx'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NUM", "ID", "EXTENSAO", "APOSTROFO", "ESPACO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GeradorRelatorio.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GeradorRelatorioParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ProgramContext {
		public TerminalNode ID() { return getToken(GeradorRelatorioParser.ID, 0); }
		public TerminalNode EXTENSAO() { return getToken(GeradorRelatorioParser.EXTENSAO, 0); }
		public FrmContext frm() {
			return getRuleContext(FrmContext.class,0);
		}
		public SlctContext slct() {
			return getRuleContext(SlctContext.class,0);
		}
		public ProgramaContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitPrograma(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgramaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			match(ID);
			setState(28);
			match(EXTENSAO);
			setState(29);
			frm();
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(30);
				slct();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IguContext extends ParserRuleContext {
		public IguContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igu; }
	 
		public IguContext() { }
		public void copyFrom(IguContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IgualdadeNumContext extends IguContext {
		public TerminalNode ID() { return getToken(GeradorRelatorioParser.ID, 0); }
		public TerminalNode NUM() { return getToken(GeradorRelatorioParser.NUM, 0); }
		public IgualdadeNumContext(IguContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterIgualdadeNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitIgualdadeNum(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IgualdadeIDContext extends IguContext {
		public List<TerminalNode> ID() { return getTokens(GeradorRelatorioParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GeradorRelatorioParser.ID, i);
		}
		public IgualdadeIDContext(IguContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterIgualdadeID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitIgualdadeID(this);
		}
	}

	public final IguContext igu() throws RecognitionException {
		IguContext _localctx = new IguContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_igu);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new IgualdadeIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(ID);
				setState(34);
				match(T__1);
				setState(35);
				match(ID);
				}
				break;
			case 2:
				_localctx = new IgualdadeNumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(ID);
				setState(37);
				match(T__1);
				setState(38);
				match(NUM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompContext extends ParserRuleContext {
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
	 
		public CompContext() { }
		public void copyFrom(CompContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparadorMenorContext extends CompContext {
		public TerminalNode ID() { return getToken(GeradorRelatorioParser.ID, 0); }
		public TerminalNode NUM() { return getToken(GeradorRelatorioParser.NUM, 0); }
		public ComparadorMenorContext(CompContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterComparadorMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitComparadorMenor(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparadorIntervaloSemiabertoEsquerdaContext extends CompContext {
		public List<TerminalNode> NUM() { return getTokens(GeradorRelatorioParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GeradorRelatorioParser.NUM, i);
		}
		public TerminalNode ID() { return getToken(GeradorRelatorioParser.ID, 0); }
		public ComparadorIntervaloSemiabertoEsquerdaContext(CompContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterComparadorIntervaloSemiabertoEsquerda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitComparadorIntervaloSemiabertoEsquerda(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparadorIntervaloAbertoContext extends CompContext {
		public List<TerminalNode> NUM() { return getTokens(GeradorRelatorioParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GeradorRelatorioParser.NUM, i);
		}
		public TerminalNode ID() { return getToken(GeradorRelatorioParser.ID, 0); }
		public ComparadorIntervaloAbertoContext(CompContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterComparadorIntervaloAberto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitComparadorIntervaloAberto(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparadorIntervaloSemiabertoDireitaContext extends CompContext {
		public List<TerminalNode> NUM() { return getTokens(GeradorRelatorioParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GeradorRelatorioParser.NUM, i);
		}
		public TerminalNode ID() { return getToken(GeradorRelatorioParser.ID, 0); }
		public ComparadorIntervaloSemiabertoDireitaContext(CompContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterComparadorIntervaloSemiabertoDireita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitComparadorIntervaloSemiabertoDireita(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparadorMenorIgualContext extends CompContext {
		public TerminalNode ID() { return getToken(GeradorRelatorioParser.ID, 0); }
		public TerminalNode NUM() { return getToken(GeradorRelatorioParser.NUM, 0); }
		public ComparadorMenorIgualContext(CompContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterComparadorMenorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitComparadorMenorIgual(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparadorMaiorIgualContext extends CompContext {
		public TerminalNode ID() { return getToken(GeradorRelatorioParser.ID, 0); }
		public TerminalNode NUM() { return getToken(GeradorRelatorioParser.NUM, 0); }
		public ComparadorMaiorIgualContext(CompContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterComparadorMaiorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitComparadorMaiorIgual(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparadorMaiorContext extends CompContext {
		public TerminalNode ID() { return getToken(GeradorRelatorioParser.ID, 0); }
		public TerminalNode NUM() { return getToken(GeradorRelatorioParser.NUM, 0); }
		public ComparadorMaiorContext(CompContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterComparadorMaior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitComparadorMaior(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparadorIntervaloFechadoContext extends CompContext {
		public List<TerminalNode> NUM() { return getTokens(GeradorRelatorioParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GeradorRelatorioParser.NUM, i);
		}
		public TerminalNode ID() { return getToken(GeradorRelatorioParser.ID, 0); }
		public ComparadorIntervaloFechadoContext(CompContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterComparadorIntervaloFechado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitComparadorIntervaloFechado(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comp);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ComparadorMaiorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(ID);
				setState(42);
				match(T__2);
				setState(43);
				match(NUM);
				}
				break;
			case 2:
				_localctx = new ComparadorMenorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(ID);
				setState(45);
				match(T__3);
				setState(46);
				match(NUM);
				}
				break;
			case 3:
				_localctx = new ComparadorMaiorIgualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(ID);
				setState(48);
				match(T__4);
				setState(49);
				match(NUM);
				}
				break;
			case 4:
				_localctx = new ComparadorMenorIgualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				match(ID);
				setState(51);
				match(T__5);
				setState(52);
				match(NUM);
				}
				break;
			case 5:
				_localctx = new ComparadorIntervaloAbertoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				match(NUM);
				setState(54);
				match(T__3);
				setState(55);
				match(ID);
				setState(56);
				match(T__3);
				setState(57);
				match(NUM);
				}
				break;
			case 6:
				_localctx = new ComparadorIntervaloFechadoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				match(NUM);
				setState(59);
				match(T__5);
				setState(60);
				match(ID);
				setState(61);
				match(T__5);
				setState(62);
				match(NUM);
				}
				break;
			case 7:
				_localctx = new ComparadorIntervaloSemiabertoEsquerdaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				match(NUM);
				setState(64);
				match(T__3);
				setState(65);
				match(ID);
				setState(66);
				match(T__5);
				setState(67);
				match(NUM);
				}
				break;
			case 8:
				_localctx = new ComparadorIntervaloSemiabertoDireitaContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(68);
				match(NUM);
				setState(69);
				match(T__5);
				setState(70);
				match(ID);
				setState(71);
				match(T__3);
				setState(72);
				match(NUM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NegContext extends ParserRuleContext {
		public NegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neg; }
	 
		public NegContext() { }
		public void copyFrom(NegContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegacaoNotContext extends NegContext {
		public TerminalNode ID() { return getToken(GeradorRelatorioParser.ID, 0); }
		public NegacaoNotContext(NegContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterNegacaoNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitNegacaoNot(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegacaoExcalmacaoContext extends NegContext {
		public List<TerminalNode> ID() { return getTokens(GeradorRelatorioParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GeradorRelatorioParser.ID, i);
		}
		public NegacaoExcalmacaoContext(NegContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterNegacaoExcalmacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitNegacaoExcalmacao(this);
		}
	}

	public final NegContext neg() throws RecognitionException {
		NegContext _localctx = new NegContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_neg);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new NegacaoExcalmacaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(ID);
				setState(76);
				match(T__6);
				setState(77);
				match(ID);
				}
				break;
			case T__7:
				_localctx = new NegacaoNotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(T__7);
				setState(79);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LkContext extends ParserRuleContext {
		public LkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lk; }
	 
		public LkContext() { }
		public void copyFrom(LkContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LikeDireitaContext extends LkContext {
		public List<TerminalNode> ID() { return getTokens(GeradorRelatorioParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GeradorRelatorioParser.ID, i);
		}
		public List<TerminalNode> APOSTROFO() { return getTokens(GeradorRelatorioParser.APOSTROFO); }
		public TerminalNode APOSTROFO(int i) {
			return getToken(GeradorRelatorioParser.APOSTROFO, i);
		}
		public LikeDireitaContext(LkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterLikeDireita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitLikeDireita(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LikeEsquerdaContext extends LkContext {
		public List<TerminalNode> ID() { return getTokens(GeradorRelatorioParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GeradorRelatorioParser.ID, i);
		}
		public List<TerminalNode> APOSTROFO() { return getTokens(GeradorRelatorioParser.APOSTROFO); }
		public TerminalNode APOSTROFO(int i) {
			return getToken(GeradorRelatorioParser.APOSTROFO, i);
		}
		public LikeEsquerdaContext(LkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterLikeEsquerda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitLikeEsquerda(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LikeDuploContext extends LkContext {
		public List<TerminalNode> ID() { return getTokens(GeradorRelatorioParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GeradorRelatorioParser.ID, i);
		}
		public List<TerminalNode> APOSTROFO() { return getTokens(GeradorRelatorioParser.APOSTROFO); }
		public TerminalNode APOSTROFO(int i) {
			return getToken(GeradorRelatorioParser.APOSTROFO, i);
		}
		public LikeDuploContext(LkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterLikeDuplo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitLikeDuplo(this);
		}
	}

	public final LkContext lk() throws RecognitionException {
		LkContext _localctx = new LkContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lk);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new LikeDireitaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(ID);
				setState(83);
				match(T__1);
				setState(84);
				match(APOSTROFO);
				setState(85);
				match(ID);
				setState(86);
				match(T__8);
				setState(87);
				match(APOSTROFO);
				}
				break;
			case 2:
				_localctx = new LikeEsquerdaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(ID);
				setState(89);
				match(T__1);
				setState(90);
				match(APOSTROFO);
				setState(91);
				match(T__8);
				setState(92);
				match(ID);
				setState(93);
				match(APOSTROFO);
				}
				break;
			case 3:
				_localctx = new LikeDuploContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(ID);
				setState(95);
				match(T__1);
				setState(96);
				match(APOSTROFO);
				setState(97);
				match(T__8);
				setState(98);
				match(ID);
				setState(99);
				match(T__8);
				setState(100);
				match(APOSTROFO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NulContext extends ParserRuleContext {
		public NulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nul; }
	 
		public NulContext() { }
		public void copyFrom(NulContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsNotNullContext extends NulContext {
		public TerminalNode ID() { return getToken(GeradorRelatorioParser.ID, 0); }
		public IsNotNullContext(NulContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterIsNotNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitIsNotNull(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsNullContext extends NulContext {
		public TerminalNode ID() { return getToken(GeradorRelatorioParser.ID, 0); }
		public IsNullContext(NulContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterIsNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitIsNull(this);
		}
	}

	public final NulContext nul() throws RecognitionException {
		NulContext _localctx = new NulContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nul);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IsNullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(ID);
				setState(104);
				match(T__1);
				setState(105);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new IsNotNullContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(ID);
				setState(107);
				match(T__6);
				setState(108);
				match(T__9);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElemSlctContext extends ParserRuleContext {
		public ElemSlctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemSlct; }
	 
		public ElemSlctContext() { }
		public void copyFrom(ElemSlctContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrContext extends ElemSlctContext {
		public TerminalNode ID() { return getToken(GeradorRelatorioParser.ID, 0); }
		public StrContext(ElemSlctContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitStr(this);
		}
	}

	public final ElemSlctContext elemSlct() throws RecognitionException {
		ElemSlctContext _localctx = new ElemSlctContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elemSlct);
		try {
			_localctx = new StrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeqSlctContext extends ParserRuleContext {
		public SeqSlctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqSlct; }
	 
		public SeqSlctContext() { }
		public void copyFrom(SeqSlctContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SequenciaSelectContext extends SeqSlctContext {
		public List<ElemSlctContext> elemSlct() {
			return getRuleContexts(ElemSlctContext.class);
		}
		public ElemSlctContext elemSlct(int i) {
			return getRuleContext(ElemSlctContext.class,i);
		}
		public SequenciaSelectContext(SeqSlctContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterSequenciaSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitSequenciaSelect(this);
		}
	}

	public final SeqSlctContext seqSlct() throws RecognitionException {
		SeqSlctContext _localctx = new SeqSlctContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_seqSlct);
		try {
			int _alt;
			_localctx = new SequenciaSelectContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113);
					elemSlct();
					setState(114);
					match(T__10);
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(121);
			elemSlct();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FrmContext extends ParserRuleContext {
		public FrmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frm; }
	 
		public FrmContext() { }
		public void copyFrom(FrmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FromContext extends FrmContext {
		public TerminalNode ID() { return getToken(GeradorRelatorioParser.ID, 0); }
		public FromContext(FrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitFrom(this);
		}
	}

	public final FrmContext frm() throws RecognitionException {
		FrmContext _localctx = new FrmContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_frm);
		try {
			_localctx = new FromContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__11);
			setState(124);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SlctContext extends ParserRuleContext {
		public SlctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slct; }
	 
		public SlctContext() { }
		public void copyFrom(SlctContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectContext extends SlctContext {
		public SeqSlctContext seqSlct() {
			return getRuleContext(SeqSlctContext.class,0);
		}
		public WhrContext whr() {
			return getRuleContext(WhrContext.class,0);
		}
		public SelectContext(SlctContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitSelect(this);
		}
	}

	public final SlctContext slct() throws RecognitionException {
		SlctContext _localctx = new SlctContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_slct);
		int _la;
		try {
			_localctx = new SelectContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__12);
			setState(127);
			seqSlct();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(128);
				whr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpWhrContext extends ParserRuleContext {
		public OpWhrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opWhr; }
	 
		public OpWhrContext() { }
		public void copyFrom(OpWhrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LikeContext extends OpWhrContext {
		public LkContext lk() {
			return getRuleContext(LkContext.class,0);
		}
		public LikeContext(OpWhrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitLike(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NulidadeContext extends OpWhrContext {
		public NulContext nul() {
			return getRuleContext(NulContext.class,0);
		}
		public NulidadeContext(OpWhrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterNulidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitNulidade(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparacaoContext extends OpWhrContext {
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public ComparacaoContext(OpWhrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterComparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitComparacao(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegacaoContext extends OpWhrContext {
		public NegContext neg() {
			return getRuleContext(NegContext.class,0);
		}
		public NegacaoContext(OpWhrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterNegacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitNegacao(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IgualdadeContext extends OpWhrContext {
		public IguContext igu() {
			return getRuleContext(IguContext.class,0);
		}
		public IgualdadeContext(OpWhrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterIgualdade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitIgualdade(this);
		}
	}

	public final OpWhrContext opWhr() throws RecognitionException {
		OpWhrContext _localctx = new OpWhrContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_opWhr);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new IgualdadeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				igu();
				}
				break;
			case 2:
				_localctx = new ComparacaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				comp();
				}
				break;
			case 3:
				_localctx = new NegacaoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				neg();
				}
				break;
			case 4:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				lk();
				}
				break;
			case 5:
				_localctx = new NulidadeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				nul();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeqWhrContext extends ParserRuleContext {
		public SeqWhrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqWhr; }
	 
		public SeqWhrContext() { }
		public void copyFrom(SeqWhrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SequenciaWhereContext extends SeqWhrContext {
		public List<OpWhrContext> opWhr() {
			return getRuleContexts(OpWhrContext.class);
		}
		public OpWhrContext opWhr(int i) {
			return getRuleContext(OpWhrContext.class,i);
		}
		public SequenciaWhereContext(SeqWhrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterSequenciaWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitSequenciaWhere(this);
		}
	}

	public final SeqWhrContext seqWhr() throws RecognitionException {
		SeqWhrContext _localctx = new SeqWhrContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_seqWhr);
		try {
			int _alt;
			_localctx = new SequenciaWhereContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(138);
					opWhr();
					setState(139);
					match(T__10);
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(146);
			opWhr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhrContext extends ParserRuleContext {
		public WhrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whr; }
	 
		public WhrContext() { }
		public void copyFrom(WhrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhereContext extends WhrContext {
		public SeqWhrContext seqWhr() {
			return getRuleContext(SeqWhrContext.class,0);
		}
		public WhereContext(WhrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitWhere(this);
		}
	}

	public final WhrContext whr() throws RecognitionException {
		WhrContext _localctx = new WhrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whr);
		try {
			_localctx = new WhereContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__13);
			setState(149);
			seqWhr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0013\u0098\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000 \b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002J\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003Q\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004f\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005n\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007u\b\u0007\n\u0007\f\u0007x\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0082\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0089\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u008e\b\u000b\n\u000b"+
		"\f\u000b\u0091\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u0000\u0000\u009e\u0000\u001a\u0001\u0000\u0000\u0000"+
		"\u0002\'\u0001\u0000\u0000\u0000\u0004I\u0001\u0000\u0000\u0000\u0006"+
		"P\u0001\u0000\u0000\u0000\be\u0001\u0000\u0000\u0000\nm\u0001\u0000\u0000"+
		"\u0000\fo\u0001\u0000\u0000\u0000\u000ev\u0001\u0000\u0000\u0000\u0010"+
		"{\u0001\u0000\u0000\u0000\u0012~\u0001\u0000\u0000\u0000\u0014\u0088\u0001"+
		"\u0000\u0000\u0000\u0016\u008f\u0001\u0000\u0000\u0000\u0018\u0094\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0005\u0001\u0000\u0000\u001b\u001c\u0005"+
		"\u0010\u0000\u0000\u001c\u001d\u0005\u0011\u0000\u0000\u001d\u001f\u0003"+
		"\u0010\b\u0000\u001e \u0003\u0012\t\u0000\u001f\u001e\u0001\u0000\u0000"+
		"\u0000\u001f \u0001\u0000\u0000\u0000 \u0001\u0001\u0000\u0000\u0000!"+
		"\"\u0005\u0010\u0000\u0000\"#\u0005\u0002\u0000\u0000#(\u0005\u0010\u0000"+
		"\u0000$%\u0005\u0010\u0000\u0000%&\u0005\u0002\u0000\u0000&(\u0005\u000f"+
		"\u0000\u0000\'!\u0001\u0000\u0000\u0000\'$\u0001\u0000\u0000\u0000(\u0003"+
		"\u0001\u0000\u0000\u0000)*\u0005\u0010\u0000\u0000*+\u0005\u0003\u0000"+
		"\u0000+J\u0005\u000f\u0000\u0000,-\u0005\u0010\u0000\u0000-.\u0005\u0004"+
		"\u0000\u0000.J\u0005\u000f\u0000\u0000/0\u0005\u0010\u0000\u000001\u0005"+
		"\u0005\u0000\u00001J\u0005\u000f\u0000\u000023\u0005\u0010\u0000\u0000"+
		"34\u0005\u0006\u0000\u00004J\u0005\u000f\u0000\u000056\u0005\u000f\u0000"+
		"\u000067\u0005\u0004\u0000\u000078\u0005\u0010\u0000\u000089\u0005\u0004"+
		"\u0000\u00009J\u0005\u000f\u0000\u0000:;\u0005\u000f\u0000\u0000;<\u0005"+
		"\u0006\u0000\u0000<=\u0005\u0010\u0000\u0000=>\u0005\u0006\u0000\u0000"+
		">J\u0005\u000f\u0000\u0000?@\u0005\u000f\u0000\u0000@A\u0005\u0004\u0000"+
		"\u0000AB\u0005\u0010\u0000\u0000BC\u0005\u0006\u0000\u0000CJ\u0005\u000f"+
		"\u0000\u0000DE\u0005\u000f\u0000\u0000EF\u0005\u0006\u0000\u0000FG\u0005"+
		"\u0010\u0000\u0000GH\u0005\u0004\u0000\u0000HJ\u0005\u000f\u0000\u0000"+
		"I)\u0001\u0000\u0000\u0000I,\u0001\u0000\u0000\u0000I/\u0001\u0000\u0000"+
		"\u0000I2\u0001\u0000\u0000\u0000I5\u0001\u0000\u0000\u0000I:\u0001\u0000"+
		"\u0000\u0000I?\u0001\u0000\u0000\u0000ID\u0001\u0000\u0000\u0000J\u0005"+
		"\u0001\u0000\u0000\u0000KL\u0005\u0010\u0000\u0000LM\u0005\u0007\u0000"+
		"\u0000MQ\u0005\u0010\u0000\u0000NO\u0005\b\u0000\u0000OQ\u0005\u0010\u0000"+
		"\u0000PK\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000Q\u0007\u0001"+
		"\u0000\u0000\u0000RS\u0005\u0010\u0000\u0000ST\u0005\u0002\u0000\u0000"+
		"TU\u0005\u0012\u0000\u0000UV\u0005\u0010\u0000\u0000VW\u0005\t\u0000\u0000"+
		"Wf\u0005\u0012\u0000\u0000XY\u0005\u0010\u0000\u0000YZ\u0005\u0002\u0000"+
		"\u0000Z[\u0005\u0012\u0000\u0000[\\\u0005\t\u0000\u0000\\]\u0005\u0010"+
		"\u0000\u0000]f\u0005\u0012\u0000\u0000^_\u0005\u0010\u0000\u0000_`\u0005"+
		"\u0002\u0000\u0000`a\u0005\u0012\u0000\u0000ab\u0005\t\u0000\u0000bc\u0005"+
		"\u0010\u0000\u0000cd\u0005\t\u0000\u0000df\u0005\u0012\u0000\u0000eR\u0001"+
		"\u0000\u0000\u0000eX\u0001\u0000\u0000\u0000e^\u0001\u0000\u0000\u0000"+
		"f\t\u0001\u0000\u0000\u0000gh\u0005\u0010\u0000\u0000hi\u0005\u0002\u0000"+
		"\u0000in\u0005\n\u0000\u0000jk\u0005\u0010\u0000\u0000kl\u0005\u0007\u0000"+
		"\u0000ln\u0005\n\u0000\u0000mg\u0001\u0000\u0000\u0000mj\u0001\u0000\u0000"+
		"\u0000n\u000b\u0001\u0000\u0000\u0000op\u0005\u0010\u0000\u0000p\r\u0001"+
		"\u0000\u0000\u0000qr\u0003\f\u0006\u0000rs\u0005\u000b\u0000\u0000su\u0001"+
		"\u0000\u0000\u0000tq\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000yz\u0003\f\u0006\u0000z\u000f\u0001\u0000"+
		"\u0000\u0000{|\u0005\f\u0000\u0000|}\u0005\u0010\u0000\u0000}\u0011\u0001"+
		"\u0000\u0000\u0000~\u007f\u0005\r\u0000\u0000\u007f\u0081\u0003\u000e"+
		"\u0007\u0000\u0080\u0082\u0003\u0018\f\u0000\u0081\u0080\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0013\u0001\u0000\u0000"+
		"\u0000\u0083\u0089\u0003\u0002\u0001\u0000\u0084\u0089\u0003\u0004\u0002"+
		"\u0000\u0085\u0089\u0003\u0006\u0003\u0000\u0086\u0089\u0003\b\u0004\u0000"+
		"\u0087\u0089\u0003\n\u0005\u0000\u0088\u0083\u0001\u0000\u0000\u0000\u0088"+
		"\u0084\u0001\u0000\u0000\u0000\u0088\u0085\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u0015\u0001\u0000\u0000\u0000\u008a\u008b\u0003\u0014\n\u0000\u008b\u008c"+
		"\u0005\u000b\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008a"+
		"\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092"+
		"\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0003\u0014\n\u0000\u0093\u0017\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		"\u000e\u0000\u0000\u0095\u0096\u0003\u0016\u000b\u0000\u0096\u0019\u0001"+
		"\u0000\u0000\u0000\n\u001f\'IPemv\u0081\u0088\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}