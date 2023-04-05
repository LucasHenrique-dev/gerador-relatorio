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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, NUM=6, STRING=7, ESPACO=8;
	public static final int
		RULE_program = 0, RULE_exp = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'getTopEmpresasMaisContratam'", "'('", "')'", "'extrairDados'", 
			"'estagiosPorCurso'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "NUM", "STRING", "ESPACO"
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
		public TerminalNode EOF() { return getToken(GeradorRelatorioParser.EOF, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				exp();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 50L) != 0) );
			setState(9);
			match(EOF);
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
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EstagiosCursoContext extends ExpContext {
		public TerminalNode STRING() { return getToken(GeradorRelatorioParser.STRING, 0); }
		public EstagiosCursoContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterEstagiosCurso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitEstagiosCurso(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetTopContext extends ExpContext {
		public TerminalNode NUM() { return getToken(GeradorRelatorioParser.NUM, 0); }
		public GetTopContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterGetTop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitGetTop(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExtrairDadosContext extends ExpContext {
		public TerminalNode STRING() { return getToken(GeradorRelatorioParser.STRING, 0); }
		public ExtrairDadosContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).enterExtrairDados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeradorRelatorioListener ) ((GeradorRelatorioListener)listener).exitExtrairDados(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exp);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new GetTopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				match(T__0);
				setState(12);
				match(T__1);
				setState(13);
				match(NUM);
				setState(14);
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new ExtrairDadosContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(T__3);
				setState(16);
				match(T__1);
				setState(17);
				match(STRING);
				setState(18);
				match(T__2);
				}
				break;
			case T__4:
				_localctx = new EstagiosCursoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(19);
				match(T__4);
				setState(20);
				match(T__1);
				setState(21);
				match(STRING);
				setState(22);
				match(T__2);
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

	public static final String _serializedATN =
		"\u0004\u0001\b\u001a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0004\u0000\u0006\b\u0000\u000b\u0000\f\u0000\u0007\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0018\b\u0001\u0001\u0001\u0000\u0000\u0002\u0000"+
		"\u0002\u0000\u0000\u001a\u0000\u0005\u0001\u0000\u0000\u0000\u0002\u0017"+
		"\u0001\u0000\u0000\u0000\u0004\u0006\u0003\u0002\u0001\u0000\u0005\u0004"+
		"\u0001\u0000\u0000\u0000\u0006\u0007\u0001\u0000\u0000\u0000\u0007\u0005"+
		"\u0001\u0000\u0000\u0000\u0007\b\u0001\u0000\u0000\u0000\b\t\u0001\u0000"+
		"\u0000\u0000\t\n\u0005\u0000\u0000\u0001\n\u0001\u0001\u0000\u0000\u0000"+
		"\u000b\f\u0005\u0001\u0000\u0000\f\r\u0005\u0002\u0000\u0000\r\u000e\u0005"+
		"\u0006\u0000\u0000\u000e\u0018\u0005\u0003\u0000\u0000\u000f\u0010\u0005"+
		"\u0004\u0000\u0000\u0010\u0011\u0005\u0002\u0000\u0000\u0011\u0012\u0005"+
		"\u0007\u0000\u0000\u0012\u0018\u0005\u0003\u0000\u0000\u0013\u0014\u0005"+
		"\u0005\u0000\u0000\u0014\u0015\u0005\u0002\u0000\u0000\u0015\u0016\u0005"+
		"\u0007\u0000\u0000\u0016\u0018\u0005\u0003\u0000\u0000\u0017\u000b\u0001"+
		"\u0000\u0000\u0000\u0017\u000f\u0001\u0000\u0000\u0000\u0017\u0013\u0001"+
		"\u0000\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0002\u0007\u0017";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}