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
		T__9=10, T__10=11, T__11=12, T__12=13, NUM=14, ID=15, ESPACO=16;
	public static final int
		RULE_program = 0, RULE_igualdade = 1, RULE_sequenciaID = 2, RULE_sequenciaIgualdade = 3, 
		RULE_elemSlct = 4, RULE_sequenciaSelect = 5, RULE_slct = 6, RULE_whr = 7, 
		RULE_aggr = 8, RULE_fun = 9, RULE_ordem = 10, RULE_len = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "igualdade", "sequenciaID", "sequenciaIgualdade", "elemSlct", 
			"sequenciaSelect", "slct", "whr", "aggr", "fun", "ordem", "len"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'EXCEL:'", "';'", "'='", "','", "'COLUNA:'", "'RESTRICAO:'", "'AGRUPAR:'", 
			"'COUNT'", "'('", "')'", "'ASC'", "'DEC'", "'LIMIT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "NUM", "ID", "ESPACO"
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
		public SlctContext slct() {
			return getRuleContext(SlctContext.class,0);
		}
		public OrdemContext ordem() {
			return getRuleContext(OrdemContext.class,0);
		}
		public LenContext len() {
			return getRuleContext(LenContext.class,0);
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
			setState(24);
			match(T__0);
			setState(25);
			match(ID);
			setState(26);
			match(T__1);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(27);
				slct();
				}
			}

			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__11) {
				{
				setState(30);
				ordem();
				}
			}

			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(33);
				len();
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
	public static class IgualdadeContext extends ParserRuleContext {
		public IgualdadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igualdade; }
	 
		public IgualdadeContext() { }
		public void copyFrom(IgualdadeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IguContext extends IgualdadeContext {
		public List<TerminalNode> ID() { return getTokens(GeradorRelatorioParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GeradorRelatorioParser.ID, i);
		}
		public TerminalNode NUM() { return getToken(GeradorRelatorioParser.NUM, 0); }
		public IguContext(IgualdadeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterIgu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitIgu(this);
		}
	}

	public final IgualdadeContext igualdade() throws RecognitionException {
		IgualdadeContext _localctx = new IgualdadeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_igualdade);
		int _la;
		try {
			_localctx = new IguContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(ID);
			setState(37);
			match(T__2);
			setState(38);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class SequenciaIDContext extends ParserRuleContext {
		public SequenciaIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenciaID; }
	 
		public SequenciaIDContext() { }
		public void copyFrom(SequenciaIDContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SeqIDContext extends SequenciaIDContext {
		public List<TerminalNode> ID() { return getTokens(GeradorRelatorioParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GeradorRelatorioParser.ID, i);
		}
		public SeqIDContext(SequenciaIDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterSeqID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitSeqID(this);
		}
	}

	public final SequenciaIDContext sequenciaID() throws RecognitionException {
		SequenciaIDContext _localctx = new SequenciaIDContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sequenciaID);
		try {
			int _alt;
			_localctx = new SeqIDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(40);
					match(ID);
					setState(41);
					match(T__3);
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(47);
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
	public static class SequenciaIgualdadeContext extends ParserRuleContext {
		public SequenciaIgualdadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenciaIgualdade; }
	 
		public SequenciaIgualdadeContext() { }
		public void copyFrom(SequenciaIgualdadeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SeqIguContext extends SequenciaIgualdadeContext {
		public List<IgualdadeContext> igualdade() {
			return getRuleContexts(IgualdadeContext.class);
		}
		public IgualdadeContext igualdade(int i) {
			return getRuleContext(IgualdadeContext.class,i);
		}
		public SeqIguContext(SequenciaIgualdadeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterSeqIgu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitSeqIgu(this);
		}
	}

	public final SequenciaIgualdadeContext sequenciaIgualdade() throws RecognitionException {
		SequenciaIgualdadeContext _localctx = new SequenciaIgualdadeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sequenciaIgualdade);
		try {
			int _alt;
			_localctx = new SeqIguContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(49);
					igualdade();
					setState(50);
					match(T__3);
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(57);
			igualdade();
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
	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoContext extends ElemSlctContext {
		public FunContext fun() {
			return getRuleContext(FunContext.class,0);
		}
		public FuncaoContext(ElemSlctContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitFuncao(this);
		}
	}

	public final ElemSlctContext elemSlct() throws RecognitionException {
		ElemSlctContext _localctx = new ElemSlctContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elemSlct);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new StrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(ID);
				}
				break;
			case T__7:
				_localctx = new FuncaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				fun();
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
	public static class SequenciaSelectContext extends ParserRuleContext {
		public SequenciaSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenciaSelect; }
	 
		public SequenciaSelectContext() { }
		public void copyFrom(SequenciaSelectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SeqSelectContext extends SequenciaSelectContext {
		public List<ElemSlctContext> elemSlct() {
			return getRuleContexts(ElemSlctContext.class);
		}
		public ElemSlctContext elemSlct(int i) {
			return getRuleContext(ElemSlctContext.class,i);
		}
		public SeqSelectContext(SequenciaSelectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterSeqSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitSeqSelect(this);
		}
	}

	public final SequenciaSelectContext sequenciaSelect() throws RecognitionException {
		SequenciaSelectContext _localctx = new SequenciaSelectContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sequenciaSelect);
		try {
			int _alt;
			_localctx = new SeqSelectContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(63);
					elemSlct();
					setState(64);
					match(T__3);
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(71);
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
		public SequenciaSelectContext sequenciaSelect() {
			return getRuleContext(SequenciaSelectContext.class,0);
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
		enterRule(_localctx, 12, RULE_slct);
		int _la;
		try {
			_localctx = new SelectContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__4);
			setState(74);
			sequenciaSelect();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(75);
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
		public SequenciaIgualdadeContext sequenciaIgualdade() {
			return getRuleContext(SequenciaIgualdadeContext.class,0);
		}
		public AggrContext aggr() {
			return getRuleContext(AggrContext.class,0);
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
		enterRule(_localctx, 14, RULE_whr);
		int _la;
		try {
			_localctx = new WhereContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__5);
			setState(79);
			sequenciaIgualdade();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(80);
				aggr();
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
	public static class AggrContext extends ParserRuleContext {
		public AggrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggr; }
	 
		public AggrContext() { }
		public void copyFrom(AggrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AgruparContext extends AggrContext {
		public SequenciaIDContext sequenciaID() {
			return getRuleContext(SequenciaIDContext.class,0);
		}
		public AgruparContext(AggrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterAgrupar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitAgrupar(this);
		}
	}

	public final AggrContext aggr() throws RecognitionException {
		AggrContext _localctx = new AggrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_aggr);
		try {
			_localctx = new AgruparContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__6);
			setState(84);
			sequenciaID();
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
	public static class FunContext extends ParserRuleContext {
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
	 
		public FunContext() { }
		public void copyFrom(FunContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CountContext extends FunContext {
		public TerminalNode ID() { return getToken(GeradorRelatorioParser.ID, 0); }
		public CountContext(FunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitCount(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fun);
		try {
			_localctx = new CountContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__7);
			setState(87);
			match(T__8);
			setState(88);
			match(ID);
			setState(89);
			match(T__9);
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
	public static class OrdemContext extends ParserRuleContext {
		public OrdemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordem; }
	 
		public OrdemContext() { }
		public void copyFrom(OrdemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CrescenteContext extends OrdemContext {
		public CrescenteContext(OrdemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterCrescente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitCrescente(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecrescenteContext extends OrdemContext {
		public DecrescenteContext(OrdemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterDecrescente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitDecrescente(this);
		}
	}

	public final OrdemContext ordem() throws RecognitionException {
		OrdemContext _localctx = new OrdemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ordem);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				_localctx = new CrescenteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(T__10);
				}
				break;
			case T__11:
				_localctx = new DecrescenteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(T__11);
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
	public static class LenContext extends ParserRuleContext {
		public LenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len; }
	 
		public LenContext() { }
		public void copyFrom(LenContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LimitContext extends LenContext {
		public TerminalNode NUM() { return getToken(GeradorRelatorioParser.NUM, 0); }
		public LimitContext(LenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitLimit(this);
		}
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_len);
		try {
			_localctx = new LimitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__12);
			setState(96);
			match(NUM);
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
		"\u0004\u0001\u0010c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001d\b\u0000\u0001"+
		"\u0000\u0003\u0000 \b\u0000\u0001\u0000\u0003\u0000#\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002"+
		"+\b\u0002\n\u0002\f\u0002.\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u00035\b\u0003\n\u0003\f\u00038\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004>\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005C\b\u0005\n\u0005\f\u0005"+
		"F\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006M\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"R\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0003\n^\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0000\u0001\u0001\u0000\u000e\u000f`\u0000\u0018\u0001\u0000\u0000"+
		"\u0000\u0002$\u0001\u0000\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u0006"+
		"6\u0001\u0000\u0000\u0000\b=\u0001\u0000\u0000\u0000\nD\u0001\u0000\u0000"+
		"\u0000\fI\u0001\u0000\u0000\u0000\u000eN\u0001\u0000\u0000\u0000\u0010"+
		"S\u0001\u0000\u0000\u0000\u0012V\u0001\u0000\u0000\u0000\u0014]\u0001"+
		"\u0000\u0000\u0000\u0016_\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0001"+
		"\u0000\u0000\u0019\u001a\u0005\u000f\u0000\u0000\u001a\u001c\u0005\u0002"+
		"\u0000\u0000\u001b\u001d\u0003\f\u0006\u0000\u001c\u001b\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001f\u0001\u0000\u0000"+
		"\u0000\u001e \u0003\u0014\n\u0000\u001f\u001e\u0001\u0000\u0000\u0000"+
		"\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!#\u0003\u0016"+
		"\u000b\u0000\"!\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\u0001"+
		"\u0001\u0000\u0000\u0000$%\u0005\u000f\u0000\u0000%&\u0005\u0003\u0000"+
		"\u0000&\'\u0007\u0000\u0000\u0000\'\u0003\u0001\u0000\u0000\u0000()\u0005"+
		"\u000f\u0000\u0000)+\u0005\u0004\u0000\u0000*(\u0001\u0000\u0000\u0000"+
		"+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0005\u000f"+
		"\u0000\u00000\u0005\u0001\u0000\u0000\u000012\u0003\u0002\u0001\u0000"+
		"23\u0005\u0004\u0000\u000035\u0001\u0000\u0000\u000041\u0001\u0000\u0000"+
		"\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u000079\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0003"+
		"\u0002\u0001\u0000:\u0007\u0001\u0000\u0000\u0000;>\u0005\u000f\u0000"+
		"\u0000<>\u0003\u0012\t\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000"+
		"\u0000>\t\u0001\u0000\u0000\u0000?@\u0003\b\u0004\u0000@A\u0005\u0004"+
		"\u0000\u0000AC\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000CF\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0003\b\u0004\u0000"+
		"H\u000b\u0001\u0000\u0000\u0000IJ\u0005\u0005\u0000\u0000JL\u0003\n\u0005"+
		"\u0000KM\u0003\u000e\u0007\u0000LK\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000M\r\u0001\u0000\u0000\u0000NO\u0005\u0006\u0000\u0000OQ\u0003"+
		"\u0006\u0003\u0000PR\u0003\u0010\b\u0000QP\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000R\u000f\u0001\u0000\u0000\u0000ST\u0005\u0007\u0000"+
		"\u0000TU\u0003\u0004\u0002\u0000U\u0011\u0001\u0000\u0000\u0000VW\u0005"+
		"\b\u0000\u0000WX\u0005\t\u0000\u0000XY\u0005\u000f\u0000\u0000YZ\u0005"+
		"\n\u0000\u0000Z\u0013\u0001\u0000\u0000\u0000[^\u0005\u000b\u0000\u0000"+
		"\\^\u0005\f\u0000\u0000][\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000"+
		"\u0000^\u0015\u0001\u0000\u0000\u0000_`\u0005\r\u0000\u0000`a\u0005\u000e"+
		"\u0000\u0000a\u0017\u0001\u0000\u0000\u0000\n\u001c\u001f\",6=DLQ]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}