// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, WS=2, ADD=3, MINUS=4, MULTI=5, DIV=6, POW=7, SIN=8, COS=9, TAN=10, 
		COT=11, MOD=12, AND=13, OR=14, NOT=15, XOR=16, NAND=17, LOG=18, FACTORIAL=19, 
		P=20, SQRT=21, E=22, SEMI=23, LEFTPAR=24, RIGHTPAR=25, NUM=26, LOGIC=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'"
	};
	public static final String[] ruleNames = {
		"ID", "WS", "ADD", "MINUS", "MULTI", "DIV", "POW", "SIN", "COS", "TAN", 
		"COT", "MOD", "AND", "OR", "NOT", "XOR", "NAND", "LOG", "FACTORIAL", "P", 
		"SQRT", "E", "SEMI", "LEFTPAR", "RIGHTPAR", "NUM", "LOGIC"
	};


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\6\2;\n\2\r\2\16\2<\3\3\6\3@\n"+
		"\3\r\3\16\3A\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\6\33"+
		"\u008c\n\33\r\33\16\33\u008d\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\5\34\u0099\n\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\35\3\2\5\3\2c|\5\2\13\f\17\17\"\"\3\2\62;\u009d\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\3:\3\2\2\2\5?\3\2\2\2"+
		"\7E\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2"+
		"\23S\3\2\2\2\25W\3\2\2\2\27[\3\2\2\2\31_\3\2\2\2\33a\3\2\2\2\35d\3\2\2"+
		"\2\37g\3\2\2\2!i\3\2\2\2#m\3\2\2\2%r\3\2\2\2\'v\3\2\2\2){\3\2\2\2+}\3"+
		"\2\2\2-\u0082\3\2\2\2/\u0084\3\2\2\2\61\u0086\3\2\2\2\63\u0088\3\2\2\2"+
		"\65\u008b\3\2\2\2\67\u0098\3\2\2\29;\t\2\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2"+
		"\2\2<=\3\2\2\2=\4\3\2\2\2>@\t\3\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3"+
		"\2\2\2BC\3\2\2\2CD\b\3\2\2D\6\3\2\2\2EF\7-\2\2F\b\3\2\2\2GH\7/\2\2H\n"+
		"\3\2\2\2IJ\7,\2\2J\f\3\2\2\2KL\7\61\2\2L\16\3\2\2\2MN\7`\2\2N\20\3\2\2"+
		"\2OP\7u\2\2PQ\7k\2\2QR\7p\2\2R\22\3\2\2\2ST\7e\2\2TU\7q\2\2UV\7u\2\2V"+
		"\24\3\2\2\2WX\7v\2\2XY\7c\2\2YZ\7p\2\2Z\26\3\2\2\2[\\\7e\2\2\\]\7q\2\2"+
		"]^\7v\2\2^\30\3\2\2\2_`\7\'\2\2`\32\3\2\2\2ab\7(\2\2bc\7(\2\2c\34\3\2"+
		"\2\2de\7~\2\2ef\7~\2\2f\36\3\2\2\2gh\7#\2\2h \3\2\2\2ij\7z\2\2jk\7q\2"+
		"\2kl\7t\2\2l\"\3\2\2\2mn\7p\2\2no\7c\2\2op\7p\2\2pq\7f\2\2q$\3\2\2\2r"+
		"s\7n\2\2st\7q\2\2tu\7i\2\2u&\3\2\2\2vw\7h\2\2wx\7c\2\2xy\7e\2\2yz\7v\2"+
		"\2z(\3\2\2\2{|\7\u03c2\2\2|*\3\2\2\2}~\7u\2\2~\177\7s\2\2\177\u0080\7"+
		"t\2\2\u0080\u0081\7v\2\2\u0081,\3\2\2\2\u0082\u0083\7g\2\2\u0083.\3\2"+
		"\2\2\u0084\u0085\7=\2\2\u0085\60\3\2\2\2\u0086\u0087\7*\2\2\u0087\62\3"+
		"\2\2\2\u0088\u0089\7+\2\2\u0089\64\3\2\2\2\u008a\u008c\t\4\2\2\u008b\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\66\3\2\2\2\u008f\u0090\7V\2\2\u0090\u0091\7T\2\2\u0091\u0092\7W\2\2\u0092"+
		"\u0099\7G\2\2\u0093\u0094\7H\2\2\u0094\u0095\7C\2\2\u0095\u0096\7N\2\2"+
		"\u0096\u0097\7U\2\2\u0097\u0099\7G\2\2\u0098\u008f\3\2\2\2\u0098\u0093"+
		"\3\2\2\2\u00998\3\2\2\2\7\2<A\u008d\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}