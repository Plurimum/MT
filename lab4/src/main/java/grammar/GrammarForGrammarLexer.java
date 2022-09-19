// Generated from D:/ITMO/MT/lab4/src/main/java/grammar\GrammarForGrammar.g4 by ANTLR 4.9.2
package grammar;

import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarForGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REGEXP=1, INH=2, SYN=3, CODE=4, SEMICOLON=5, OR=6, EPS=7, RO_OB=8, RO_CB=9, 
		SQ_OB=10, SQ_CB=11, CU_OB=12, CU_CB=13, TR_OB=14, TR_CB=15, GRAMMAR=16, 
		T_NAME=17, NAME=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"REGEXP", "INH", "SYN", "CODE", "SEMICOLON", "OR", "EPS", "RO_OB", "RO_CB", 
			"SQ_OB", "SQ_CB", "CU_OB", "CU_CB", "TR_OB", "TR_CB", "GRAMMAR", "T_NAME", 
			"NAME", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "';'", "'|'", "'@eps'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "'<'", "'>'", "'grammar'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "REGEXP", "INH", "SYN", "CODE", "SEMICOLON", "OR", "EPS", "RO_OB", 
			"RO_CB", "SQ_OB", "SQ_CB", "CU_OB", "CU_CB", "TR_OB", "TR_CB", "GRAMMAR", 
			"T_NAME", "NAME", "WS"
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


	public GrammarForGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarForGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3"+
		"\3\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4"+
		"\3\4\3\4\3\5\3\5\7\5G\n\5\f\5\16\5J\13\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\6\22p\n\22"+
		"\r\22\16\22q\3\23\6\23u\n\23\r\23\16\23v\3\23\7\23z\n\23\f\23\16\23}\13"+
		"\23\3\24\6\24\u0080\n\24\r\24\16\24\u0081\3\24\3\24\6-\66?H\2\25\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25\3\2\5\3\2C\\\3\2c|\5\2\13\f\17\17\"\"\2\u008c\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5\62\3\2\2\2\7;\3\2\2\2\tD\3\2\2\2\13"+
		"M\3\2\2\2\rO\3\2\2\2\17Q\3\2\2\2\21V\3\2\2\2\23X\3\2\2\2\25Z\3\2\2\2\27"+
		"\\\3\2\2\2\31^\3\2\2\2\33`\3\2\2\2\35b\3\2\2\2\37d\3\2\2\2!f\3\2\2\2#"+
		"o\3\2\2\2%t\3\2\2\2\'\177\3\2\2\2)-\7$\2\2*,\13\2\2\2+*\3\2\2\2,/\3\2"+
		"\2\2-.\3\2\2\2-+\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7$\2\2\61\4\3\2\2"+
		"\2\62\66\5\21\t\2\63\65\13\2\2\2\64\63\3\2\2\2\658\3\2\2\2\66\67\3\2\2"+
		"\2\66\64\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\5\23\n\2:\6\3\2\2\2;?\5\25"+
		"\13\2<>\13\2\2\2=<\3\2\2\2>A\3\2\2\2?@\3\2\2\2?=\3\2\2\2@B\3\2\2\2A?\3"+
		"\2\2\2BC\5\27\f\2C\b\3\2\2\2DH\5\35\17\2EG\13\2\2\2FE\3\2\2\2GJ\3\2\2"+
		"\2HI\3\2\2\2HF\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\5\37\20\2L\n\3\2\2\2MN\7"+
		"=\2\2N\f\3\2\2\2OP\7~\2\2P\16\3\2\2\2QR\7B\2\2RS\7g\2\2ST\7r\2\2TU\7u"+
		"\2\2U\20\3\2\2\2VW\7*\2\2W\22\3\2\2\2XY\7+\2\2Y\24\3\2\2\2Z[\7]\2\2[\26"+
		"\3\2\2\2\\]\7_\2\2]\30\3\2\2\2^_\7}\2\2_\32\3\2\2\2`a\7\177\2\2a\34\3"+
		"\2\2\2bc\7>\2\2c\36\3\2\2\2de\7@\2\2e \3\2\2\2fg\7i\2\2gh\7t\2\2hi\7c"+
		"\2\2ij\7o\2\2jk\7o\2\2kl\7c\2\2lm\7t\2\2m\"\3\2\2\2np\t\2\2\2on\3\2\2"+
		"\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r$\3\2\2\2su\t\3\2\2ts\3\2\2\2uv\3\2\2"+
		"\2vt\3\2\2\2vw\3\2\2\2w{\3\2\2\2xz\t\2\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2"+
		"\2{|\3\2\2\2|&\3\2\2\2}{\3\2\2\2~\u0080\t\4\2\2\177~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\b\24\2\2\u0084(\3\2\2\2\13\2-\66?Hqv{\u0081\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}