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
		T__9=10, T__10=11, T__11=12, T__12=13, NUM=14, ID=15, ESPACO=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "NUM", "ID", "ESPACO"
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
		"\u0004\u0000\u0010t\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0004\rd\b\r\u000b\r\f\re\u0001\u000e"+
		"\u0001\u000e\u0004\u000ej\b\u000e\u000b\u000e\f\u000ek\u0001\u000f\u0004"+
		"\u000fo\b\u000f\u000b\u000f\f\u000fp\u0001\u000f\u0001\u000f\u0000\u0000"+
		"\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010\u0001\u0000\u0004\u0001\u000009\u0002\u0000A"+
		"Zaz\u0005\u0000-.09AZ__az\u0003\u0000\t\n\r\r  v\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003"+
		"(\u0001\u0000\u0000\u0000\u0005*\u0001\u0000\u0000\u0000\u0007,\u0001"+
		"\u0000\u0000\u0000\t.\u0001\u0000\u0000\u0000\u000b6\u0001\u0000\u0000"+
		"\u0000\rA\u0001\u0000\u0000\u0000\u000fJ\u0001\u0000\u0000\u0000\u0011"+
		"P\u0001\u0000\u0000\u0000\u0013R\u0001\u0000\u0000\u0000\u0015T\u0001"+
		"\u0000\u0000\u0000\u0017X\u0001\u0000\u0000\u0000\u0019\\\u0001\u0000"+
		"\u0000\u0000\u001bc\u0001\u0000\u0000\u0000\u001dg\u0001\u0000\u0000\u0000"+
		"\u001fn\u0001\u0000\u0000\u0000!\"\u0005E\u0000\u0000\"#\u0005X\u0000"+
		"\u0000#$\u0005C\u0000\u0000$%\u0005E\u0000\u0000%&\u0005L\u0000\u0000"+
		"&\'\u0005:\u0000\u0000\'\u0002\u0001\u0000\u0000\u0000()\u0005;\u0000"+
		"\u0000)\u0004\u0001\u0000\u0000\u0000*+\u0005=\u0000\u0000+\u0006\u0001"+
		"\u0000\u0000\u0000,-\u0005,\u0000\u0000-\b\u0001\u0000\u0000\u0000./\u0005"+
		"C\u0000\u0000/0\u0005O\u0000\u000001\u0005L\u0000\u000012\u0005U\u0000"+
		"\u000023\u0005N\u0000\u000034\u0005A\u0000\u000045\u0005:\u0000\u0000"+
		"5\n\u0001\u0000\u0000\u000067\u0005R\u0000\u000078\u0005E\u0000\u0000"+
		"89\u0005S\u0000\u00009:\u0005T\u0000\u0000:;\u0005R\u0000\u0000;<\u0005"+
		"I\u0000\u0000<=\u0005C\u0000\u0000=>\u0005A\u0000\u0000>?\u0005O\u0000"+
		"\u0000?@\u0005:\u0000\u0000@\f\u0001\u0000\u0000\u0000AB\u0005A\u0000"+
		"\u0000BC\u0005G\u0000\u0000CD\u0005R\u0000\u0000DE\u0005U\u0000\u0000"+
		"EF\u0005P\u0000\u0000FG\u0005A\u0000\u0000GH\u0005R\u0000\u0000HI\u0005"+
		":\u0000\u0000I\u000e\u0001\u0000\u0000\u0000JK\u0005C\u0000\u0000KL\u0005"+
		"O\u0000\u0000LM\u0005U\u0000\u0000MN\u0005N\u0000\u0000NO\u0005T\u0000"+
		"\u0000O\u0010\u0001\u0000\u0000\u0000PQ\u0005(\u0000\u0000Q\u0012\u0001"+
		"\u0000\u0000\u0000RS\u0005)\u0000\u0000S\u0014\u0001\u0000\u0000\u0000"+
		"TU\u0005A\u0000\u0000UV\u0005S\u0000\u0000VW\u0005C\u0000\u0000W\u0016"+
		"\u0001\u0000\u0000\u0000XY\u0005D\u0000\u0000YZ\u0005E\u0000\u0000Z[\u0005"+
		"C\u0000\u0000[\u0018\u0001\u0000\u0000\u0000\\]\u0005L\u0000\u0000]^\u0005"+
		"I\u0000\u0000^_\u0005M\u0000\u0000_`\u0005I\u0000\u0000`a\u0005T\u0000"+
		"\u0000a\u001a\u0001\u0000\u0000\u0000bd\u0007\u0000\u0000\u0000cb\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000f\u001c\u0001\u0000\u0000\u0000gi\u0007\u0001"+
		"\u0000\u0000hj\u0007\u0002\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"l\u001e\u0001\u0000\u0000\u0000mo\u0007\u0003\u0000\u0000nm\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0006\u000f\u0000\u0000"+
		"s \u0001\u0000\u0000\u0000\u0004\u0000ekp\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}