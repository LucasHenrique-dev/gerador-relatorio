// Generated from GeradorRelatorio.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GeradorRelatorioLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NUM=15, ID=16, EXTENSAO=17, 
		APOSTROFO=18, ESPACO=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "NUM", "ID", "EXTENSAO", 
			"APOSTROFO", "ESPACO"
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


	public GeradorRelatorioLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GeradorRelatorio.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0013\u0081\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0004\u000eh\b\u000e\u000b\u000e\f\u000e"+
		"i\u0001\u000f\u0001\u000f\u0005\u000fn\b\u000f\n\u000f\f\u000fq\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012|\b\u0012\u000b\u0012"+
		"\f\u0012}\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\u0001\u0000\u0005\u0001\u000009\u0002\u0000AZaz"+
		"\u0006\u0000  --09AZ__az\u0001\u0000\'\'\u0003\u0000\t\n\r\r  \u0083\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003.\u0001\u0000\u0000\u0000"+
		"\u00050\u0001\u0000\u0000\u0000\u00072\u0001\u0000\u0000\u0000\t4\u0001"+
		"\u0000\u0000\u0000\u000b7\u0001\u0000\u0000\u0000\r:\u0001\u0000\u0000"+
		"\u0000\u000f=\u0001\u0000\u0000\u0000\u0011A\u0001\u0000\u0000\u0000\u0013"+
		"D\u0001\u0000\u0000\u0000\u0015I\u0001\u0000\u0000\u0000\u0017K\u0001"+
		"\u0000\u0000\u0000\u0019S\u0001\u0000\u0000\u0000\u001b[\u0001\u0000\u0000"+
		"\u0000\u001dg\u0001\u0000\u0000\u0000\u001fk\u0001\u0000\u0000\u0000!"+
		"r\u0001\u0000\u0000\u0000#x\u0001\u0000\u0000\u0000%{\u0001\u0000\u0000"+
		"\u0000\'(\u0005E\u0000\u0000()\u0005X\u0000\u0000)*\u0005C\u0000\u0000"+
		"*+\u0005E\u0000\u0000+,\u0005L\u0000\u0000,-\u0005:\u0000\u0000-\u0002"+
		"\u0001\u0000\u0000\u0000./\u0005=\u0000\u0000/\u0004\u0001\u0000\u0000"+
		"\u000001\u0005>\u0000\u00001\u0006\u0001\u0000\u0000\u000023\u0005<\u0000"+
		"\u00003\b\u0001\u0000\u0000\u000045\u0005>\u0000\u000056\u0005=\u0000"+
		"\u00006\n\u0001\u0000\u0000\u000078\u0005<\u0000\u000089\u0005=\u0000"+
		"\u00009\f\u0001\u0000\u0000\u0000:;\u0005!\u0000\u0000;<\u0005=\u0000"+
		"\u0000<\u000e\u0001\u0000\u0000\u0000=>\u0005N\u0000\u0000>?\u0005O\u0000"+
		"\u0000?@\u0005T\u0000\u0000@\u0010\u0001\u0000\u0000\u0000AB\u0005.\u0000"+
		"\u0000BC\u0005.\u0000\u0000C\u0012\u0001\u0000\u0000\u0000DE\u0005N\u0000"+
		"\u0000EF\u0005U\u0000\u0000FG\u0005L\u0000\u0000GH\u0005L\u0000\u0000"+
		"H\u0014\u0001\u0000\u0000\u0000IJ\u0005,\u0000\u0000J\u0016\u0001\u0000"+
		"\u0000\u0000KL\u0005P\u0000\u0000LM\u0005A\u0000\u0000MN\u0005G\u0000"+
		"\u0000NO\u0005I\u0000\u0000OP\u0005N\u0000\u0000PQ\u0005A\u0000\u0000"+
		"QR\u0005:\u0000\u0000R\u0018\u0001\u0000\u0000\u0000ST\u0005C\u0000\u0000"+
		"TU\u0005O\u0000\u0000UV\u0005L\u0000\u0000VW\u0005U\u0000\u0000WX\u0005"+
		"N\u0000\u0000XY\u0005A\u0000\u0000YZ\u0005:\u0000\u0000Z\u001a\u0001\u0000"+
		"\u0000\u0000[\\\u0005R\u0000\u0000\\]\u0005E\u0000\u0000]^\u0005S\u0000"+
		"\u0000^_\u0005T\u0000\u0000_`\u0005R\u0000\u0000`a\u0005I\u0000\u0000"+
		"ab\u0005C\u0000\u0000bc\u0005A\u0000\u0000cd\u0005O\u0000\u0000de\u0005"+
		":\u0000\u0000e\u001c\u0001\u0000\u0000\u0000fh\u0007\u0000\u0000\u0000"+
		"gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000j\u001e\u0001\u0000\u0000\u0000ko\u0007"+
		"\u0001\u0000\u0000ln\u0007\u0002\u0000\u0000ml\u0001\u0000\u0000\u0000"+
		"nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000p \u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rs\u0005.\u0000"+
		"\u0000st\u0005x\u0000\u0000tu\u0005l\u0000\u0000uv\u0005s\u0000\u0000"+
		"vw\u0005x\u0000\u0000w\"\u0001\u0000\u0000\u0000xy\u0007\u0003\u0000\u0000"+
		"y$\u0001\u0000\u0000\u0000z|\u0007\u0004\u0000\u0000{z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0006\u0012\u0000"+
		"\u0000\u0080&\u0001\u0000\u0000\u0000\u0004\u0000io}\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}