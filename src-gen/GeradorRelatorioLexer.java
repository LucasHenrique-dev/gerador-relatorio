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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, NUM=6, STRING=7, ESPACO=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "NUM", "STRING", "ESPACO"
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
		"\u0004\u0000\b`\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005Q\b\u0005"+
		"\u000b\u0005\f\u0005R\u0001\u0006\u0004\u0006V\b\u0006\u000b\u0006\f\u0006"+
		"W\u0001\u0007\u0004\u0007[\b\u0007\u000b\u0007\f\u0007\\\u0001\u0007\u0001"+
		"\u0007\u0000\u0000\b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0001\u0000\u0003\u0001\u000009\u0006"+
		"\u0000  .:AZ\\\\__az\u0003\u0000\t\n\r\r  b\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0001\u0011\u0001\u0000\u0000\u0000\u0003"+
		"-\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000\u00071\u0001"+
		"\u0000\u0000\u0000\t>\u0001\u0000\u0000\u0000\u000bP\u0001\u0000\u0000"+
		"\u0000\rU\u0001\u0000\u0000\u0000\u000fZ\u0001\u0000\u0000\u0000\u0011"+
		"\u0012\u0005g\u0000\u0000\u0012\u0013\u0005e\u0000\u0000\u0013\u0014\u0005"+
		"t\u0000\u0000\u0014\u0015\u0005T\u0000\u0000\u0015\u0016\u0005o\u0000"+
		"\u0000\u0016\u0017\u0005p\u0000\u0000\u0017\u0018\u0005E\u0000\u0000\u0018"+
		"\u0019\u0005m\u0000\u0000\u0019\u001a\u0005p\u0000\u0000\u001a\u001b\u0005"+
		"r\u0000\u0000\u001b\u001c\u0005e\u0000\u0000\u001c\u001d\u0005s\u0000"+
		"\u0000\u001d\u001e\u0005a\u0000\u0000\u001e\u001f\u0005s\u0000\u0000\u001f"+
		" \u0005M\u0000\u0000 !\u0005a\u0000\u0000!\"\u0005i\u0000\u0000\"#\u0005"+
		"s\u0000\u0000#$\u0005C\u0000\u0000$%\u0005o\u0000\u0000%&\u0005n\u0000"+
		"\u0000&\'\u0005t\u0000\u0000\'(\u0005r\u0000\u0000()\u0005a\u0000\u0000"+
		")*\u0005t\u0000\u0000*+\u0005a\u0000\u0000+,\u0005m\u0000\u0000,\u0002"+
		"\u0001\u0000\u0000\u0000-.\u0005(\u0000\u0000.\u0004\u0001\u0000\u0000"+
		"\u0000/0\u0005)\u0000\u00000\u0006\u0001\u0000\u0000\u000012\u0005e\u0000"+
		"\u000023\u0005x\u0000\u000034\u0005t\u0000\u000045\u0005r\u0000\u0000"+
		"56\u0005a\u0000\u000067\u0005i\u0000\u000078\u0005r\u0000\u000089\u0005"+
		"D\u0000\u00009:\u0005a\u0000\u0000:;\u0005d\u0000\u0000;<\u0005o\u0000"+
		"\u0000<=\u0005s\u0000\u0000=\b\u0001\u0000\u0000\u0000>?\u0005e\u0000"+
		"\u0000?@\u0005s\u0000\u0000@A\u0005t\u0000\u0000AB\u0005a\u0000\u0000"+
		"BC\u0005g\u0000\u0000CD\u0005i\u0000\u0000DE\u0005o\u0000\u0000EF\u0005"+
		"s\u0000\u0000FG\u0005P\u0000\u0000GH\u0005o\u0000\u0000HI\u0005r\u0000"+
		"\u0000IJ\u0005C\u0000\u0000JK\u0005u\u0000\u0000KL\u0005r\u0000\u0000"+
		"LM\u0005s\u0000\u0000MN\u0005o\u0000\u0000N\n\u0001\u0000\u0000\u0000"+
		"OQ\u0007\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\f\u0001\u0000"+
		"\u0000\u0000TV\u0007\u0001\u0000\u0000UT\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"X\u000e\u0001\u0000\u0000\u0000Y[\u0007\u0002\u0000\u0000ZY\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]"+
		"\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0006\u0007\u0000"+
		"\u0000_\u0010\u0001\u0000\u0000\u0000\u0004\u0000RW\\\u0001\u0006\u0000"+
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