// Generated from MYGRAMM.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MYGRAMMLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, DECLARE=2, INTEGER=3, REAL=4, COMMA=5, SEMICOLON=6, L_PAR=7, 
		R_PAR=8, PLUS=9, MINUS=10, STAR=11, SLASH=12, ASSIGN=13, NULL=14, LETTER=15, 
		NUMBER=16, INPUT=17, PRINT=18, ENDDECLARE=19, ENDPROGRAM=20, WS=21, NEWLINE=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "DECLARE", "INTEGER", "REAL", "COMMA", "SEMICOLON", "L_PAR", 
			"R_PAR", "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "NULL", "LETTER", 
			"NUMBER", "INPUT", "PRINT", "ENDDECLARE", "ENDPROGRAM", "WS", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'declare'", "'integer'", "'real'", "','", "';'", 
			"'('", "')'", "'+'", "'-'", "'*'", "'/'", "':='", "' '", null, null, 
			"'input'", "'print'", "'enddeclare'", "'endprogram'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "DECLARE", "INTEGER", "REAL", "COMMA", "SEMICOLON", 
			"L_PAR", "R_PAR", "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "NULL", 
			"LETTER", "NUMBER", "INPUT", "PRINT", "ENDDECLARE", "ENDPROGRAM", "WS", 
			"NEWLINE"
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


	public MYGRAMMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MYGRAMM.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00a7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\21\6\21g\n\21\r\21\16\21h\3\21\6\21l\n\21\r\21\16\21m\3\21\3\21"+
		"\6\21r\n\21\r\21\16\21s\5\21v\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\6\26\u009b\n\26\r\26\16\26\u009c\3\26\3\26\3\27\6\27\u00a2\n\27\r\27"+
		"\16\27\u00a3\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\6"+
		"\4\2C\\c|\3\2\62;\5\2\13\13\17\17\"\"\3\2\f\f\2\u00ac\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\67\3\2\2\2\7"+
		"?\3\2\2\2\tG\3\2\2\2\13L\3\2\2\2\rN\3\2\2\2\17P\3\2\2\2\21R\3\2\2\2\23"+
		"T\3\2\2\2\25V\3\2\2\2\27X\3\2\2\2\31Z\3\2\2\2\33\\\3\2\2\2\35_\3\2\2\2"+
		"\37c\3\2\2\2!u\3\2\2\2#w\3\2\2\2%}\3\2\2\2\'\u0083\3\2\2\2)\u008e\3\2"+
		"\2\2+\u009a\3\2\2\2-\u00a1\3\2\2\2/\60\7r\2\2\60\61\7t\2\2\61\62\7q\2"+
		"\2\62\63\7i\2\2\63\64\7t\2\2\64\65\7c\2\2\65\66\7o\2\2\66\4\3\2\2\2\67"+
		"8\7f\2\289\7g\2\29:\7e\2\2:;\7n\2\2;<\7c\2\2<=\7t\2\2=>\7g\2\2>\6\3\2"+
		"\2\2?@\7k\2\2@A\7p\2\2AB\7v\2\2BC\7g\2\2CD\7i\2\2DE\7g\2\2EF\7t\2\2F\b"+
		"\3\2\2\2GH\7t\2\2HI\7g\2\2IJ\7c\2\2JK\7n\2\2K\n\3\2\2\2LM\7.\2\2M\f\3"+
		"\2\2\2NO\7=\2\2O\16\3\2\2\2PQ\7*\2\2Q\20\3\2\2\2RS\7+\2\2S\22\3\2\2\2"+
		"TU\7-\2\2U\24\3\2\2\2VW\7/\2\2W\26\3\2\2\2XY\7,\2\2Y\30\3\2\2\2Z[\7\61"+
		"\2\2[\32\3\2\2\2\\]\7<\2\2]^\7?\2\2^\34\3\2\2\2_`\7\"\2\2`a\3\2\2\2ab"+
		"\b\17\2\2b\36\3\2\2\2cd\t\2\2\2d \3\2\2\2eg\t\3\2\2fe\3\2\2\2gh\3\2\2"+
		"\2hf\3\2\2\2hi\3\2\2\2iv\3\2\2\2jl\t\3\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2"+
		"\2mn\3\2\2\2no\3\2\2\2oq\13\2\2\2pr\t\3\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2"+
		"\2\2st\3\2\2\2tv\3\2\2\2uf\3\2\2\2uk\3\2\2\2v\"\3\2\2\2wx\7k\2\2xy\7p"+
		"\2\2yz\7r\2\2z{\7w\2\2{|\7v\2\2|$\3\2\2\2}~\7r\2\2~\177\7t\2\2\177\u0080"+
		"\7k\2\2\u0080\u0081\7p\2\2\u0081\u0082\7v\2\2\u0082&\3\2\2\2\u0083\u0084"+
		"\7g\2\2\u0084\u0085\7p\2\2\u0085\u0086\7f\2\2\u0086\u0087\7f\2\2\u0087"+
		"\u0088\7g\2\2\u0088\u0089\7e\2\2\u0089\u008a\7n\2\2\u008a\u008b\7c\2\2"+
		"\u008b\u008c\7t\2\2\u008c\u008d\7g\2\2\u008d(\3\2\2\2\u008e\u008f\7g\2"+
		"\2\u008f\u0090\7p\2\2\u0090\u0091\7f\2\2\u0091\u0092\7r\2\2\u0092\u0093"+
		"\7t\2\2\u0093\u0094\7q\2\2\u0094\u0095\7i\2\2\u0095\u0096\7t\2\2\u0096"+
		"\u0097\7c\2\2\u0097\u0098\7o\2\2\u0098*\3\2\2\2\u0099\u009b\t\4\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\26\2\2\u009f,\3\2\2\2\u00a0\u00a2"+
		"\t\5\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\27\2\2\u00a6.\3\2\2\2"+
		"\t\2hmsu\u009c\u00a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}