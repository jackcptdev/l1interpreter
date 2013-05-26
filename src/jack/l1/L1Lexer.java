// Generated from L1.g4 by ANTLR 4.0
package jack.l1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class L1Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, RETURN=2, TRUE=3, FALSE=4, THEN=5, SIGN=6, NL=7, COMA=8, ADD=9, 
		SUB=10, MUL=11, DIV=12, ASSIGN=13, AND=14, OR=15, G=16, GE=17, L=18, LE=19, 
		EQ=20, NEQ=21, LB=22, RB=23, LP=24, RP=25, LR=26, RR=27, DEMA=28, IF=29, 
		ELSE=30, FUN_DEF=31, ID=32, NUMBER=33, STRING=34, WS=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'print'", "'return'", "'true'", "'false'", "'then'", "'!'", "NL", "','", 
		"'+'", "'-'", "'*'", "'/'", "'='", "'&&'", "'||'", "'>'", "'>='", "'<'", 
		"'<='", "'=='", "'!='", "'('", "')'", "'['", "']'", "'{'", "'}'", "';'", 
		"'if'", "'else'", "'defun'", "ID", "NUMBER", "STRING", "WS"
	};
	public static final String[] ruleNames = {
		"PRINT", "RETURN", "TRUE", "FALSE", "THEN", "SIGN", "NL", "COMA", "ADD", 
		"SUB", "MUL", "DIV", "ASSIGN", "AND", "OR", "G", "GE", "L", "LE", "EQ", 
		"NEQ", "LB", "RB", "LP", "RP", "LR", "RR", "DEMA", "IF", "ELSE", "FUN_DEF", 
		"ID", "NUMBER", "STRING", "ESC", "WS", "DIGIT"
	};


	public L1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "L1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 35: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4%\u00dc\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\5\bn\n\b\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3 \3!\6!\u00b1\n!\r!\16!\u00b2\3\"\6\"\u00b6\n\"\r\"\16\"\u00b7\3"+
		"\"\3\"\6\"\u00bc\n\"\r\"\16\"\u00bd\3\"\6\"\u00c1\n\"\r\"\16\"\u00c2\5"+
		"\"\u00c5\n\"\3#\3#\3#\7#\u00ca\n#\f#\16#\u00cd\13#\3#\3#\3$\3$\3$\3%\6"+
		"%\u00d5\n%\r%\16%\u00d6\3%\3%\3&\3&\3\u00cb\'\3\3\1\5\4\1\7\5\1\t\6\1"+
		"\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20"+
		"\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63"+
		"\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G\2\1I%\2K\2\1\3"+
		"\2\6\5C\\c|~~\b$$^^ddppttvv\4\13\13\"\"\3\62;\u00e2\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2I\3\2\2\2\3M\3\2\2\2\5S\3"+
		"\2\2\2\7Z\3\2\2\2\t_\3\2\2\2\13e\3\2\2\2\rj\3\2\2\2\17m\3\2\2\2\21q\3"+
		"\2\2\2\23s\3\2\2\2\25u\3\2\2\2\27w\3\2\2\2\31y\3\2\2\2\33{\3\2\2\2\35"+
		"}\3\2\2\2\37\u0080\3\2\2\2!\u0083\3\2\2\2#\u0085\3\2\2\2%\u0088\3\2\2"+
		"\2\'\u008a\3\2\2\2)\u008d\3\2\2\2+\u0090\3\2\2\2-\u0093\3\2\2\2/\u0095"+
		"\3\2\2\2\61\u0097\3\2\2\2\63\u0099\3\2\2\2\65\u009b\3\2\2\2\67\u009d\3"+
		"\2\2\29\u009f\3\2\2\2;\u00a1\3\2\2\2=\u00a4\3\2\2\2?\u00a9\3\2\2\2A\u00b0"+
		"\3\2\2\2C\u00c4\3\2\2\2E\u00c6\3\2\2\2G\u00d0\3\2\2\2I\u00d4\3\2\2\2K"+
		"\u00da\3\2\2\2MN\7r\2\2NO\7t\2\2OP\7k\2\2PQ\7p\2\2QR\7v\2\2R\4\3\2\2\2"+
		"ST\7t\2\2TU\7g\2\2UV\7v\2\2VW\7w\2\2WX\7t\2\2XY\7p\2\2Y\6\3\2\2\2Z[\7"+
		"v\2\2[\\\7t\2\2\\]\7w\2\2]^\7g\2\2^\b\3\2\2\2_`\7h\2\2`a\7c\2\2ab\7n\2"+
		"\2bc\7u\2\2cd\7g\2\2d\n\3\2\2\2ef\7v\2\2fg\7j\2\2gh\7g\2\2hi\7p\2\2i\f"+
		"\3\2\2\2jk\7#\2\2k\16\3\2\2\2ln\7\17\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2"+
		"op\7\f\2\2p\20\3\2\2\2qr\7.\2\2r\22\3\2\2\2st\7-\2\2t\24\3\2\2\2uv\7/"+
		"\2\2v\26\3\2\2\2wx\7,\2\2x\30\3\2\2\2yz\7\61\2\2z\32\3\2\2\2{|\7?\2\2"+
		"|\34\3\2\2\2}~\7(\2\2~\177\7(\2\2\177\36\3\2\2\2\u0080\u0081\7~\2\2\u0081"+
		"\u0082\7~\2\2\u0082 \3\2\2\2\u0083\u0084\7@\2\2\u0084\"\3\2\2\2\u0085"+
		"\u0086\7@\2\2\u0086\u0087\7?\2\2\u0087$\3\2\2\2\u0088\u0089\7>\2\2\u0089"+
		"&\3\2\2\2\u008a\u008b\7>\2\2\u008b\u008c\7?\2\2\u008c(\3\2\2\2\u008d\u008e"+
		"\7?\2\2\u008e\u008f\7?\2\2\u008f*\3\2\2\2\u0090\u0091\7#\2\2\u0091\u0092"+
		"\7?\2\2\u0092,\3\2\2\2\u0093\u0094\7*\2\2\u0094.\3\2\2\2\u0095\u0096\7"+
		"+\2\2\u0096\60\3\2\2\2\u0097\u0098\7]\2\2\u0098\62\3\2\2\2\u0099\u009a"+
		"\7_\2\2\u009a\64\3\2\2\2\u009b\u009c\7}\2\2\u009c\66\3\2\2\2\u009d\u009e"+
		"\7\177\2\2\u009e8\3\2\2\2\u009f\u00a0\7=\2\2\u00a0:\3\2\2\2\u00a1\u00a2"+
		"\7k\2\2\u00a2\u00a3\7h\2\2\u00a3<\3\2\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6"+
		"\7n\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7g\2\2\u00a8>\3\2\2\2\u00a9\u00aa"+
		"\7f\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad\7w\2\2\u00ad"+
		"\u00ae\7p\2\2\u00ae@\3\2\2\2\u00af\u00b1\t\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3B\3\2\2\2"+
		"\u00b4\u00b6\5K&\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\7\60\2\2"+
		"\u00ba\u00bc\5K&\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c5\3\2\2\2\u00bf\u00c1\5K&\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00b5\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c5"+
		"D\3\2\2\2\u00c6\u00cb\7$\2\2\u00c7\u00ca\5G$\2\u00c8\u00ca\13\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00cf\7$\2\2\u00cfF\3\2\2\2\u00d0\u00d1\7^\2\2\u00d1\u00d2\t\3\2\2\u00d2"+
		"H\3\2\2\2\u00d3\u00d5\t\4\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9"+
		"\b%\2\2\u00d9J\3\2\2\2\u00da\u00db\t\5\2\2\u00dbL\3\2\2\2\f\2m\u00b2\u00b7"+
		"\u00bd\u00c2\u00c4\u00c9\u00cb\u00d6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}