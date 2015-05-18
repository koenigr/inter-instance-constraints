package antlr4;

// Generated from Inter_Instance.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Inter_InstanceLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, ID=3, WS=4;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "ID", "WS"
	};


	public Inter_InstanceLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Inter_Instance.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\6\"\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\6\4\30\n\4\r\4\16\4\31\3\5\6\5\35\n\5\r\5\16\5\36\3\5\3\5\2\2\6\3\3\5"+
		"\4\7\5\t\6\3\2\4\3\2c|\5\2\13\f\17\17\"\"#\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\3\13\3\2\2\2\5\20\3\2\2\2\7\27\3\2\2\2\t\34\3\2\2"+
		"\2\13\f\7f\2\2\f\r\7g\2\2\r\16\7r\2\2\16\17\7r\2\2\17\4\3\2\2\2\20\21"+
		"\7j\2\2\21\22\7g\2\2\22\23\7n\2\2\23\24\7n\2\2\24\25\7q\2\2\25\6\3\2\2"+
		"\2\26\30\t\2\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2"+
		"\2\32\b\3\2\2\2\33\35\t\3\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2"+
		"\2\36\37\3\2\2\2\37 \3\2\2\2 !\b\5\2\2!\n\3\2\2\2\5\2\31\36\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}