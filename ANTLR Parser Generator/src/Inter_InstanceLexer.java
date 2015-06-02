// Generated from Inter_Instance.g4 by ANTLR 4.5
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
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, MULTILINE_COMMENTS=50, SINGLE_LINE_COMMENTS=51, 
		SET=52, IF=53, THEN=54, KONJ=55, DISJ=56, DEF=57, DESC=58, ARGS=59, WHERE=60, 
		CONSTANT=61, VARIABLE=62, CLAUSE=63, NUMBER=64, WS=65;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"MULTILINE_COMMENTS", "SINGLE_LINE_COMMENTS", "SET", "IF", "THEN", "KONJ", 
		"DISJ", "DEF", "DESC", "ARGS", "WHERE", "CONSTANT", "VARIABLE", "CLAUSE", 
		"NUMBER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "','", "')'", "'is related to'", "'is partner of'", "'is in same group as'", 
		"'role'", "'must execute'", "'user'", "'belongs to role'", "'is glb of'", 
		"'is lub'", "'dominates'", "'critical_task_pair('", "'cannot execute'", 
		"'mrole'", "'panic'", "'executed'", "'is assigned to'", "'aborted'", "'succeeded'", 
		"'is collaborator of'", "'in tasks'", "'NUMBER'", "'IS'", "'NUMBER OF'", 
		"'NUMBER OF DIFF'", "'SUM OF'", "'AVG OF'", "'MIN OF'", "'MAX OF'", "'='", 
		"'!='", "'<'", "'<='", "'>'", "'>='", "'*'", "'/'", "'+'", "'-'", "'.Role'", 
		"'.'", "'timestamp('", "'time_interval('", "'??'", "'Input('", "').'", 
		"'Output('", null, null, "'SET'", null, "'THEN'", "'AND'", "'OR'", null, 
		null, null, "'WHERE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "MULTILINE_COMMENTS", "SINGLE_LINE_COMMENTS", "SET", "IF", 
		"THEN", "KONJ", "DISJ", "DEF", "DESC", "ARGS", "WHERE", "CONSTANT", "VARIABLE", 
		"CLAUSE", "NUMBER", "WS"
	};
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


	public Inter_InstanceLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Inter_Instance.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2C\u0292\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3&"+
		"\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u0204\n\63\f\63\16\63\u0207"+
		"\13\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u0212\n\64\f"+
		"\64\16\64\u0215\13\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0227\n\66\3\67\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\5:\u0247\n:\3;\3;\3;\3;\3;\3;\7;\u024f\n;\f;\16;\u0252\13;\3;\3"+
		";\7;\u0256\n;\f;\16;\u0259\13;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\5<\u026b\n<\3=\3=\3=\3=\3=\3=\3>\3>\7>\u0275\n>\f>\16>\u0278"+
		"\13>\3>\3>\3?\6?\u027d\n?\r?\16?\u027e\3@\6@\u0282\n@\r@\16@\u0283\3A"+
		"\3A\6A\u0288\nA\rA\16A\u0289\3B\6B\u028d\nB\rB\16B\u028e\3B\3B\7\u0205"+
		"\u0213\u0250\u0257\u0276\2C\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\3\2\b\3\2"+
		"\"\"\5\2\62;C\\c|\4\2aac|\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\u02a5\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\3\u0085"+
		"\3\2\2\2\5\u0087\3\2\2\2\7\u0089\3\2\2\2\t\u008b\3\2\2\2\13\u0099\3\2"+
		"\2\2\r\u00a7\3\2\2\2\17\u00bb\3\2\2\2\21\u00c0\3\2\2\2\23\u00cd\3\2\2"+
		"\2\25\u00d2\3\2\2\2\27\u00e2\3\2\2\2\31\u00ec\3\2\2\2\33\u00f3\3\2\2\2"+
		"\35\u00fd\3\2\2\2\37\u0111\3\2\2\2!\u0120\3\2\2\2#\u0126\3\2\2\2%\u012c"+
		"\3\2\2\2\'\u0135\3\2\2\2)\u0144\3\2\2\2+\u014c\3\2\2\2-\u0156\3\2\2\2"+
		"/\u0169\3\2\2\2\61\u0172\3\2\2\2\63\u0179\3\2\2\2\65\u017c\3\2\2\2\67"+
		"\u0186\3\2\2\29\u0195\3\2\2\2;\u019c\3\2\2\2=\u01a3\3\2\2\2?\u01aa\3\2"+
		"\2\2A\u01b1\3\2\2\2C\u01b3\3\2\2\2E\u01b6\3\2\2\2G\u01b8\3\2\2\2I\u01bb"+
		"\3\2\2\2K\u01bd\3\2\2\2M\u01c0\3\2\2\2O\u01c2\3\2\2\2Q\u01c4\3\2\2\2S"+
		"\u01c6\3\2\2\2U\u01c8\3\2\2\2W\u01ce\3\2\2\2Y\u01d0\3\2\2\2[\u01db\3\2"+
		"\2\2]\u01ea\3\2\2\2_\u01ed\3\2\2\2a\u01f4\3\2\2\2c\u01f7\3\2\2\2e\u01ff"+
		"\3\2\2\2g\u020d\3\2\2\2i\u021a\3\2\2\2k\u0226\3\2\2\2m\u0228\3\2\2\2o"+
		"\u022d\3\2\2\2q\u0231\3\2\2\2s\u0246\3\2\2\2u\u0248\3\2\2\2w\u026a\3\2"+
		"\2\2y\u026c\3\2\2\2{\u0272\3\2\2\2}\u027c\3\2\2\2\177\u0281\3\2\2\2\u0081"+
		"\u0285\3\2\2\2\u0083\u028c\3\2\2\2\u0085\u0086\7*\2\2\u0086\4\3\2\2\2"+
		"\u0087\u0088\7.\2\2\u0088\6\3\2\2\2\u0089\u008a\7+\2\2\u008a\b\3\2\2\2"+
		"\u008b\u008c\7k\2\2\u008c\u008d\7u\2\2\u008d\u008e\7\"\2\2\u008e\u008f"+
		"\7t\2\2\u008f\u0090\7g\2\2\u0090\u0091\7n\2\2\u0091\u0092\7c\2\2\u0092"+
		"\u0093\7v\2\2\u0093\u0094\7g\2\2\u0094\u0095\7f\2\2\u0095\u0096\7\"\2"+
		"\2\u0096\u0097\7v\2\2\u0097\u0098\7q\2\2\u0098\n\3\2\2\2\u0099\u009a\7"+
		"k\2\2\u009a\u009b\7u\2\2\u009b\u009c\7\"\2\2\u009c\u009d\7r\2\2\u009d"+
		"\u009e\7c\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7p\2\2"+
		"\u00a1\u00a2\7g\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7\"\2\2\u00a4\u00a5"+
		"\7q\2\2\u00a5\u00a6\7h\2\2\u00a6\f\3\2\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9"+
		"\7u\2\2\u00a9\u00aa\7\"\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7p\2\2\u00ac"+
		"\u00ad\7\"\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7o\2"+
		"\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7\"\2\2\u00b2\u00b3\7i\2\2\u00b3\u00b4"+
		"\7t\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7w\2\2\u00b6\u00b7\7r\2\2\u00b7"+
		"\u00b8\7\"\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7u\2\2\u00ba\16\3\2\2\2"+
		"\u00bb\u00bc\7t\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7n\2\2\u00be\u00bf"+
		"\7g\2\2\u00bf\20\3\2\2\2\u00c0\u00c1\7o\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3"+
		"\7u\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7\"\2\2\u00c5\u00c6\7g\2\2\u00c6"+
		"\u00c7\7z\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7w\2\2"+
		"\u00ca\u00cb\7v\2\2\u00cb\u00cc\7g\2\2\u00cc\22\3\2\2\2\u00cd\u00ce\7"+
		"w\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7t\2\2\u00d1\24"+
		"\3\2\2\2\u00d2\u00d3\7d\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7n\2\2\u00d5"+
		"\u00d6\7q\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7i\2\2\u00d8\u00d9\7u\2\2"+
		"\u00d9\u00da\7\"\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd"+
		"\7\"\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7n\2\2\u00e0"+
		"\u00e1\7g\2\2\u00e1\26\3\2\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7u\2\2\u00e4"+
		"\u00e5\7\"\2\2\u00e5\u00e6\7i\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7d\2"+
		"\2\u00e8\u00e9\7\"\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7h\2\2\u00eb\30"+
		"\3\2\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef\7\"\2\2\u00ef"+
		"\u00f0\7n\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7d\2\2\u00f2\32\3\2\2\2\u00f3"+
		"\u00f4\7f\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7o\2\2\u00f6\u00f7\7k\2\2"+
		"\u00f7\u00f8\7p\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb"+
		"\7g\2\2\u00fb\u00fc\7u\2\2\u00fc\34\3\2\2\2\u00fd\u00fe\7e\2\2\u00fe\u00ff"+
		"\7t\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7v\2\2\u0101\u0102\7k\2\2\u0102"+
		"\u0103\7e\2\2\u0103\u0104\7c\2\2\u0104\u0105\7n\2\2\u0105\u0106\7a\2\2"+
		"\u0106\u0107\7v\2\2\u0107\u0108\7c\2\2\u0108\u0109\7u\2\2\u0109\u010a"+
		"\7m\2\2\u010a\u010b\7a\2\2\u010b\u010c\7r\2\2\u010c\u010d\7c\2\2\u010d"+
		"\u010e\7k\2\2\u010e\u010f\7t\2\2\u010f\u0110\7*\2\2\u0110\36\3\2\2\2\u0111"+
		"\u0112\7e\2\2\u0112\u0113\7c\2\2\u0113\u0114\7p\2\2\u0114\u0115\7p\2\2"+
		"\u0115\u0116\7q\2\2\u0116\u0117\7v\2\2\u0117\u0118\7\"\2\2\u0118\u0119"+
		"\7g\2\2\u0119\u011a\7z\2\2\u011a\u011b\7g\2\2\u011b\u011c\7e\2\2\u011c"+
		"\u011d\7w\2\2\u011d\u011e\7v\2\2\u011e\u011f\7g\2\2\u011f \3\2\2\2\u0120"+
		"\u0121\7o\2\2\u0121\u0122\7t\2\2\u0122\u0123\7q\2\2\u0123\u0124\7n\2\2"+
		"\u0124\u0125\7g\2\2\u0125\"\3\2\2\2\u0126\u0127\7r\2\2\u0127\u0128\7c"+
		"\2\2\u0128\u0129\7p\2\2\u0129\u012a\7k\2\2\u012a\u012b\7e\2\2\u012b$\3"+
		"\2\2\2\u012c\u012d\7g\2\2\u012d\u012e\7z\2\2\u012e\u012f\7g\2\2\u012f"+
		"\u0130\7e\2\2\u0130\u0131\7w\2\2\u0131\u0132\7v\2\2\u0132\u0133\7g\2\2"+
		"\u0133\u0134\7f\2\2\u0134&\3\2\2\2\u0135\u0136\7k\2\2\u0136\u0137\7u\2"+
		"\2\u0137\u0138\7\"\2\2\u0138\u0139\7c\2\2\u0139\u013a\7u\2\2\u013a\u013b"+
		"\7u\2\2\u013b\u013c\7k\2\2\u013c\u013d\7i\2\2\u013d\u013e\7p\2\2\u013e"+
		"\u013f\7g\2\2\u013f\u0140\7f\2\2\u0140\u0141\7\"\2\2\u0141\u0142\7v\2"+
		"\2\u0142\u0143\7q\2\2\u0143(\3\2\2\2\u0144\u0145\7c\2\2\u0145\u0146\7"+
		"d\2\2\u0146\u0147\7q\2\2\u0147\u0148\7t\2\2\u0148\u0149\7v\2\2\u0149\u014a"+
		"\7g\2\2\u014a\u014b\7f\2\2\u014b*\3\2\2\2\u014c\u014d\7u\2\2\u014d\u014e"+
		"\7w\2\2\u014e\u014f\7e\2\2\u014f\u0150\7e\2\2\u0150\u0151\7g\2\2\u0151"+
		"\u0152\7g\2\2\u0152\u0153\7f\2\2\u0153\u0154\7g\2\2\u0154\u0155\7f\2\2"+
		"\u0155,\3\2\2\2\u0156\u0157\7k\2\2\u0157\u0158\7u\2\2\u0158\u0159\7\""+
		"\2\2\u0159\u015a\7e\2\2\u015a\u015b\7q\2\2\u015b\u015c\7n\2\2\u015c\u015d"+
		"\7n\2\2\u015d\u015e\7c\2\2\u015e\u015f\7d\2\2\u015f\u0160\7q\2\2\u0160"+
		"\u0161\7t\2\2\u0161\u0162\7c\2\2\u0162\u0163\7v\2\2\u0163\u0164\7q\2\2"+
		"\u0164\u0165\7t\2\2\u0165\u0166\7\"\2\2\u0166\u0167\7q\2\2\u0167\u0168"+
		"\7h\2\2\u0168.\3\2\2\2\u0169\u016a\7k\2\2\u016a\u016b\7p\2\2\u016b\u016c"+
		"\7\"\2\2\u016c\u016d\7v\2\2\u016d\u016e\7c\2\2\u016e\u016f\7u\2\2\u016f"+
		"\u0170\7m\2\2\u0170\u0171\7u\2\2\u0171\60\3\2\2\2\u0172\u0173\7P\2\2\u0173"+
		"\u0174\7W\2\2\u0174\u0175\7O\2\2\u0175\u0176\7D\2\2\u0176\u0177\7G\2\2"+
		"\u0177\u0178\7T\2\2\u0178\62\3\2\2\2\u0179\u017a\7K\2\2\u017a\u017b\7"+
		"U\2\2\u017b\64\3\2\2\2\u017c\u017d\7P\2\2\u017d\u017e\7W\2\2\u017e\u017f"+
		"\7O\2\2\u017f\u0180\7D\2\2\u0180\u0181\7G\2\2\u0181\u0182\7T\2\2\u0182"+
		"\u0183\7\"\2\2\u0183\u0184\7Q\2\2\u0184\u0185\7H\2\2\u0185\66\3\2\2\2"+
		"\u0186\u0187\7P\2\2\u0187\u0188\7W\2\2\u0188\u0189\7O\2\2\u0189\u018a"+
		"\7D\2\2\u018a\u018b\7G\2\2\u018b\u018c\7T\2\2\u018c\u018d\7\"\2\2\u018d"+
		"\u018e\7Q\2\2\u018e\u018f\7H\2\2\u018f\u0190\7\"\2\2\u0190\u0191\7F\2"+
		"\2\u0191\u0192\7K\2\2\u0192\u0193\7H\2\2\u0193\u0194\7H\2\2\u01948\3\2"+
		"\2\2\u0195\u0196\7U\2\2\u0196\u0197\7W\2\2\u0197\u0198\7O\2\2\u0198\u0199"+
		"\7\"\2\2\u0199\u019a\7Q\2\2\u019a\u019b\7H\2\2\u019b:\3\2\2\2\u019c\u019d"+
		"\7C\2\2\u019d\u019e\7X\2\2\u019e\u019f\7I\2\2\u019f\u01a0\7\"\2\2\u01a0"+
		"\u01a1\7Q\2\2\u01a1\u01a2\7H\2\2\u01a2<\3\2\2\2\u01a3\u01a4\7O\2\2\u01a4"+
		"\u01a5\7K\2\2\u01a5\u01a6\7P\2\2\u01a6\u01a7\7\"\2\2\u01a7\u01a8\7Q\2"+
		"\2\u01a8\u01a9\7H\2\2\u01a9>\3\2\2\2\u01aa\u01ab\7O\2\2\u01ab\u01ac\7"+
		"C\2\2\u01ac\u01ad\7Z\2\2\u01ad\u01ae\7\"\2\2\u01ae\u01af\7Q\2\2\u01af"+
		"\u01b0\7H\2\2\u01b0@\3\2\2\2\u01b1\u01b2\7?\2\2\u01b2B\3\2\2\2\u01b3\u01b4"+
		"\7#\2\2\u01b4\u01b5\7?\2\2\u01b5D\3\2\2\2\u01b6\u01b7\7>\2\2\u01b7F\3"+
		"\2\2\2\u01b8\u01b9\7>\2\2\u01b9\u01ba\7?\2\2\u01baH\3\2\2\2\u01bb\u01bc"+
		"\7@\2\2\u01bcJ\3\2\2\2\u01bd\u01be\7@\2\2\u01be\u01bf\7?\2\2\u01bfL\3"+
		"\2\2\2\u01c0\u01c1\7,\2\2\u01c1N\3\2\2\2\u01c2\u01c3\7\61\2\2\u01c3P\3"+
		"\2\2\2\u01c4\u01c5\7-\2\2\u01c5R\3\2\2\2\u01c6\u01c7\7/\2\2\u01c7T\3\2"+
		"\2\2\u01c8\u01c9\7\60\2\2\u01c9\u01ca\7T\2\2\u01ca\u01cb\7q\2\2\u01cb"+
		"\u01cc\7n\2\2\u01cc\u01cd\7g\2\2\u01cdV\3\2\2\2\u01ce\u01cf\7\60\2\2\u01cf"+
		"X\3\2\2\2\u01d0\u01d1\7v\2\2\u01d1\u01d2\7k\2\2\u01d2\u01d3\7o\2\2\u01d3"+
		"\u01d4\7g\2\2\u01d4\u01d5\7u\2\2\u01d5\u01d6\7v\2\2\u01d6\u01d7\7c\2\2"+
		"\u01d7\u01d8\7o\2\2\u01d8\u01d9\7r\2\2\u01d9\u01da\7*\2\2\u01daZ\3\2\2"+
		"\2\u01db\u01dc\7v\2\2\u01dc\u01dd\7k\2\2\u01dd\u01de\7o\2\2\u01de\u01df"+
		"\7g\2\2\u01df\u01e0\7a\2\2\u01e0\u01e1\7k\2\2\u01e1\u01e2\7p\2\2\u01e2"+
		"\u01e3\7v\2\2\u01e3\u01e4\7g\2\2\u01e4\u01e5\7t\2\2\u01e5\u01e6\7x\2\2"+
		"\u01e6\u01e7\7c\2\2\u01e7\u01e8\7n\2\2\u01e8\u01e9\7*\2\2\u01e9\\\3\2"+
		"\2\2\u01ea\u01eb\7A\2\2\u01eb\u01ec\7A\2\2\u01ec^\3\2\2\2\u01ed\u01ee"+
		"\7K\2\2\u01ee\u01ef\7p\2\2\u01ef\u01f0\7r\2\2\u01f0\u01f1\7w\2\2\u01f1"+
		"\u01f2\7v\2\2\u01f2\u01f3\7*\2\2\u01f3`\3\2\2\2\u01f4\u01f5\7+\2\2\u01f5"+
		"\u01f6\7\60\2\2\u01f6b\3\2\2\2\u01f7\u01f8\7Q\2\2\u01f8\u01f9\7w\2\2\u01f9"+
		"\u01fa\7v\2\2\u01fa\u01fb\7r\2\2\u01fb\u01fc\7w\2\2\u01fc\u01fd\7v\2\2"+
		"\u01fd\u01fe\7*\2\2\u01fed\3\2\2\2\u01ff\u0200\7\61\2\2\u0200\u0201\7"+
		",\2\2\u0201\u0205\3\2\2\2\u0202\u0204\13\2\2\2\u0203\u0202\3\2\2\2\u0204"+
		"\u0207\3\2\2\2\u0205\u0206\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0208\3\2"+
		"\2\2\u0207\u0205\3\2\2\2\u0208\u0209\7,\2\2\u0209\u020a\7\61\2\2\u020a"+
		"\u020b\3\2\2\2\u020b\u020c\b\63\2\2\u020cf\3\2\2\2\u020d\u020e\7\61\2"+
		"\2\u020e\u020f\7\61\2\2\u020f\u0213\3\2\2\2\u0210\u0212\13\2\2\2\u0211"+
		"\u0210\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0214\3\2\2\2\u0213\u0211\3\2"+
		"\2\2\u0214\u0216\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0217\7\f\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u0219\b\64\2\2\u0219h\3\2\2\2\u021a\u021b\7U\2\2"+
		"\u021b\u021c\7G\2\2\u021c\u021d\7V\2\2\u021dj\3\2\2\2\u021e\u021f\7K\2"+
		"\2\u021f\u0227\7H\2\2\u0220\u0221\7k\2\2\u0221\u0227\7h\2\2\u0222\u0223"+
		"\7K\2\2\u0223\u0227\7h\2\2\u0224\u0225\7k\2\2\u0225\u0227\7H\2\2\u0226"+
		"\u021e\3\2\2\2\u0226\u0220\3\2\2\2\u0226\u0222\3\2\2\2\u0226\u0224\3\2"+
		"\2\2\u0227l\3\2\2\2\u0228\u0229\7V\2\2\u0229\u022a\7J\2\2\u022a\u022b"+
		"\7G\2\2\u022b\u022c\7P\2\2\u022cn\3\2\2\2\u022d\u022e\7C\2\2\u022e\u022f"+
		"\7P\2\2\u022f\u0230\7F\2\2\u0230p\3\2\2\2\u0231\u0232\7Q\2\2\u0232\u0233"+
		"\7T\2\2\u0233r\3\2\2\2\u0234\u0235\7F\2\2\u0235\u0236\7G\2\2\u0236\u0247"+
		"\7H\2\2\u0237\u0238\7F\2\2\u0238\u0239\7G\2\2\u0239\u023a\7H\2\2\u023a"+
		"\u023b\7K\2\2\u023b\u023c\7P\2\2\u023c\u0247\7G\2\2\u023d\u023e\7f\2\2"+
		"\u023e\u023f\7g\2\2\u023f\u0240\7h\2\2\u0240\u0241\7k\2\2\u0241\u0242"+
		"\7p\2\2\u0242\u0247\7g\2\2\u0243\u0244\7f\2\2\u0244\u0245\7g\2\2\u0245"+
		"\u0247\7h\2\2\u0246\u0234\3\2\2\2\u0246\u0237\3\2\2\2\u0246\u023d\3\2"+
		"\2\2\u0246\u0243\3\2\2\2\u0247t\3\2\2\2\u0248\u0249\7F\2\2\u0249\u024a"+
		"\7G\2\2\u024a\u024b\7U\2\2\u024b\u024c\7E\2\2\u024c\u0250\3\2\2\2\u024d"+
		"\u024f\t\2\2\2\u024e\u024d\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u0251\3\2"+
		"\2\2\u0250\u024e\3\2\2\2\u0251\u0253\3\2\2\2\u0252\u0250\3\2\2\2\u0253"+
		"\u0257\7$\2\2\u0254\u0256\13\2\2\2\u0255\u0254\3\2\2\2\u0256\u0259\3\2"+
		"\2\2\u0257\u0258\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u025a\3\2\2\2\u0259"+
		"\u0257\3\2\2\2\u025a\u025b\7$\2\2\u025bv\3\2\2\2\u025c\u025d\7W\2\2\u025d"+
		"\u026b\7V\2\2\u025e\u025f\7T\2\2\u025f\u026b\7V\2\2\u0260\u0261\7V\2\2"+
		"\u0261\u026b\7V\2\2\u0262\u0263\7Y\2\2\u0263\u026b\7V\2\2\u0264\u0265"+
		"\7V\2\2\u0265\u0266\7c\2\2\u0266\u0267\7w\2\2\u0267\u026b\7V\2\2\u0268"+
		"\u0269\7P\2\2\u0269\u026b\7V\2\2\u026a\u025c\3\2\2\2\u026a\u025e\3\2\2"+
		"\2\u026a\u0260\3\2\2\2\u026a\u0262\3\2\2\2\u026a\u0264\3\2\2\2\u026a\u0268"+
		"\3\2\2\2\u026bx\3\2\2\2\u026c\u026d\7Y\2\2\u026d\u026e\7J\2\2\u026e\u026f"+
		"\7G\2\2\u026f\u0270\7T\2\2\u0270\u0271\7G\2\2\u0271z\3\2\2\2\u0272\u0276"+
		"\7)\2\2\u0273\u0275\13\2\2\2\u0274\u0273\3\2\2\2\u0275\u0278\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u0279\3\2\2\2\u0278\u0276\3\2"+
		"\2\2\u0279\u027a\7)\2\2\u027a|\3\2\2\2\u027b\u027d\t\3\2\2\u027c\u027b"+
		"\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
		"~\3\2\2\2\u0280\u0282\t\4\2\2\u0281\u0280\3\2\2\2\u0282\u0283\3\2\2\2"+
		"\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0080\3\2\2\2\u0285\u0287"+
		"\t\5\2\2\u0286\u0288\t\6\2\2\u0287\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u0082\3\2\2\2\u028b\u028d\t\7"+
		"\2\2\u028c\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028c\3\2\2\2\u028e"+
		"\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\bB\2\2\u0291\u0084\3\2"+
		"\2\2\17\2\u0205\u0213\u0226\u0246\u0250\u0257\u026a\u0276\u027e\u0283"+
		"\u0289\u028e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}