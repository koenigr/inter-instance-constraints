// Generated from Inter_Instance.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Inter_InstanceParser extends Parser {
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
		T__45=46, T__46=47, T__47=48, MULTILINE_COMMENTS=49, SINGLE_LINE_COMMENTS=50, 
		SET=51, IF=52, THEN=53, KONJ=54, DISJ=55, DEF=56, DESC=57, ARGS=58, WHERE=59, 
		CONSTANT=60, VARIABLE=61, CLAUSE=62, NUMBER=63, WS=64;
	public static final int
		RULE_file = 0, RULE_define = 1, RULE_statement = 2, RULE_explicit = 3, 
		RULE_assignment = 4, RULE_assignmentBody = 5, RULE_clauses = 6, RULE_assignmentHead = 7, 
		RULE_extern = 8, RULE_specification = 9, RULE_enforcement = 10, RULE_status = 11, 
		RULE_conditional = 12, RULE_conditionalBody = 13, RULE_comparison = 14, 
		RULE_equalityParams = 15, RULE_unequalityParams = 16, RULE_arithmetic = 17, 
		RULE_ut = 18, RULE_rt = 19, RULE_tt = 20, RULE_intra = 21, RULE_inter = 22, 
		RULE_interp = 23, RULE_nt = 24, RULE_ct = 25, RULE_ti = 26, RULE_wt = 27, 
		RULE_taut = 28, RULE_input = 29, RULE_inputvar = 30, RULE_output = 31, 
		RULE_outputvar = 32;
	public static final String[] ruleNames = {
		"file", "define", "statement", "explicit", "assignment", "assignmentBody", 
		"clauses", "assignmentHead", "extern", "specification", "enforcement", 
		"status", "conditional", "conditionalBody", "comparison", "equalityParams", 
		"unequalityParams", "arithmetic", "ut", "rt", "tt", "intra", "inter", 
		"interp", "nt", "ct", "ti", "wt", "taut", "input", "inputvar", "output", 
		"outputvar"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "','", "')'", "'is related to'", "'is partner of'", "'is in same group as'", 
		"'role'", "'must execute'", "'user'", "'belongs to role'", "'is glb of'", 
		"'is lub'", "'>('", "'critical_task_pair('", "'cannot execute'", "'must_execute_r('", 
		"'panic'", "'executed'", "'is assigned to'", "'aborted'", "'succeeded'", 
		"'is collaborator of'", "'NUMBER'", "'IS'", "'NUMBER OF'", "'NUMBER OF DIFF'", 
		"'SUM OF'", "'AVG OF'", "'MIN OF'", "'MAX OF'", "'='", "'!='", "'<'", 
		"'<='", "'>'", "'>='", "'*'", "'/'", "'+'", "'-'", "'.Role'", "'.'", "'timestamp('", 
		"'time_interval('", "'??'", "'Input('", "').'", "'Output('", null, null, 
		"'SET'", null, "'THEN'", "'AND'", "'OR'", null, null, null, "'WHERE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "MULTILINE_COMMENTS", "SINGLE_LINE_COMMENTS", "SET", "IF", "THEN", 
		"KONJ", "DISJ", "DEF", "DESC", "ARGS", "WHERE", "CONSTANT", "VARIABLE", 
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

	@Override
	public String getGrammarFileName() { return "Inter_Instance.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Inter_InstanceParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Inter_InstanceParser.EOF, 0); }
		public List<DefineContext> define() {
			return getRuleContexts(DefineContext.class);
		}
		public DefineContext define(int i) {
			return getRuleContext(DefineContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(66);
				define();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << IF) | (1L << DESC))) != 0)) {
				{
				{
				setState(72);
				statement();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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

	public static class DefineContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(Inter_InstanceParser.DEF, 0); }
		public TerminalNode CLAUSE() { return getToken(Inter_InstanceParser.CLAUSE, 0); }
		public List<TerminalNode> ARGS() { return getTokens(Inter_InstanceParser.ARGS); }
		public TerminalNode ARGS(int i) {
			return getToken(Inter_InstanceParser.ARGS, i);
		}
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitDefine(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_define);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(DEF);
			setState(81);
			match(CLAUSE);
			setState(82);
			match(T__0);
			setState(83);
			match(ARGS);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(84);
				match(T__1);
				setState(85);
				match(ARGS);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(T__2);
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

	public static class StatementContext extends ParserRuleContext {
		public ExplicitContext explicit() {
			return getRuleContext(ExplicitContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(95);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				explicit();
				}
				break;
			case IF:
			case DESC:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				assignment();
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

	public static class ExplicitContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(Inter_InstanceParser.SET, 0); }
		public List<ExternContext> extern() {
			return getRuleContexts(ExternContext.class);
		}
		public ExternContext extern(int i) {
			return getRuleContext(ExternContext.class,i);
		}
		public List<SpecificationContext> specification() {
			return getRuleContexts(SpecificationContext.class);
		}
		public SpecificationContext specification(int i) {
			return getRuleContext(SpecificationContext.class,i);
		}
		public ExplicitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterExplicit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitExplicit(this);
		}
	}

	public final ExplicitContext explicit() throws RecognitionException {
		ExplicitContext _localctx = new ExplicitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_explicit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(SET);
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(98);
				extern();
				}
				break;
			case 2:
				{
				setState(99);
				specification();
				}
				break;
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(102);
				match(T__1);
				setState(105);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(103);
					extern();
					}
					break;
				case 2:
					{
					setState(104);
					specification();
					}
					break;
				}
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Inter_InstanceParser.IF, 0); }
		public AssignmentBodyContext assignmentBody() {
			return getRuleContext(AssignmentBodyContext.class,0);
		}
		public TerminalNode THEN() { return getToken(Inter_InstanceParser.THEN, 0); }
		public AssignmentHeadContext assignmentHead() {
			return getRuleContext(AssignmentHeadContext.class,0);
		}
		public TerminalNode DESC() { return getToken(Inter_InstanceParser.DESC, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if (_la==DESC) {
				{
				setState(112);
				match(DESC);
				}
			}

			setState(115);
			match(IF);
			setState(116);
			assignmentBody();
			setState(117);
			match(THEN);
			setState(118);
			assignmentHead();
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

	public static class AssignmentBodyContext extends ParserRuleContext {
		public List<ClausesContext> clauses() {
			return getRuleContexts(ClausesContext.class);
		}
		public ClausesContext clauses(int i) {
			return getRuleContext(ClausesContext.class,i);
		}
		public List<TerminalNode> KONJ() { return getTokens(Inter_InstanceParser.KONJ); }
		public TerminalNode KONJ(int i) {
			return getToken(Inter_InstanceParser.KONJ, i);
		}
		public AssignmentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterAssignmentBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitAssignmentBody(this);
		}
	}

	public final AssignmentBodyContext assignmentBody() throws RecognitionException {
		AssignmentBodyContext _localctx = new AssignmentBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			clauses();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KONJ) {
				{
				{
				setState(121);
				match(KONJ);
				setState(122);
				clauses();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ClausesContext extends ParserRuleContext {
		public SpecificationContext specification() {
			return getRuleContext(SpecificationContext.class,0);
		}
		public StatusContext status() {
			return getRuleContext(StatusContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ExternContext extern() {
			return getRuleContext(ExternContext.class,0);
		}
		public ClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitClauses(this);
		}
	}

	public final ClausesContext clauses() throws RecognitionException {
		ClausesContext _localctx = new ClausesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_clauses);
		try {
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				specification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				status();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				comparison();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				extern();
				}
				break;
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

	public static class AssignmentHeadContext extends ParserRuleContext {
		public EnforcementContext enforcement() {
			return getRuleContext(EnforcementContext.class,0);
		}
		public AssignmentHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterAssignmentHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitAssignmentHead(this);
		}
	}

	public final AssignmentHeadContext assignmentHead() throws RecognitionException {
		AssignmentHeadContext _localctx = new AssignmentHeadContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignmentHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			enforcement();
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

	public static class ExternContext extends ParserRuleContext {
		public List<UtContext> ut() {
			return getRuleContexts(UtContext.class);
		}
		public UtContext ut(int i) {
			return getRuleContext(UtContext.class,i);
		}
		public ExternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterExtern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitExtern(this);
		}
	}

	public final ExternContext extern() throws RecognitionException {
		ExternContext _localctx = new ExternContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_extern);
		try {
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				ut();
				setState(138);
				match(T__3);
				setState(139);
				ut();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				ut();
				setState(142);
				match(T__4);
				setState(143);
				ut();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				ut();
				setState(146);
				match(T__5);
				setState(147);
				ut();
				}
				break;
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

	public static class SpecificationContext extends ParserRuleContext {
		public List<RtContext> rt() {
			return getRuleContexts(RtContext.class);
		}
		public RtContext rt(int i) {
			return getRuleContext(RtContext.class,i);
		}
		public List<TtContext> tt() {
			return getRuleContexts(TtContext.class);
		}
		public TtContext tt(int i) {
			return getRuleContext(TtContext.class,i);
		}
		public UtContext ut() {
			return getRuleContext(UtContext.class,0);
		}
		public SpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitSpecification(this);
		}
	}

	public final SpecificationContext specification() throws RecognitionException {
		SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_specification);
		try {
			setState(186);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(T__6);
				setState(152);
				rt();
				setState(153);
				match(T__7);
				setState(154);
				tt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(T__8);
				setState(157);
				ut();
				setState(158);
				match(T__7);
				setState(159);
				tt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(T__8);
				setState(162);
				ut();
				setState(163);
				match(T__9);
				setState(164);
				rt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				rt();
				setState(167);
				match(T__10);
				setState(168);
				tt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				rt();
				setState(171);
				match(T__11);
				setState(172);
				tt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				match(T__12);
				setState(175);
				rt();
				setState(176);
				match(T__1);
				setState(177);
				rt();
				setState(178);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(180);
				match(T__13);
				setState(181);
				tt();
				setState(182);
				match(T__1);
				setState(183);
				tt();
				setState(184);
				match(T__2);
				}
				break;
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

	public static class EnforcementContext extends ParserRuleContext {
		public UtContext ut() {
			return getRuleContext(UtContext.class,0);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public RtContext rt() {
			return getRuleContext(RtContext.class,0);
		}
		public EnforcementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enforcement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterEnforcement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitEnforcement(this);
		}
	}

	public final EnforcementContext enforcement() throws RecognitionException {
		EnforcementContext _localctx = new EnforcementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_enforcement);
		int _la;
		try {
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(188);
					match(T__8);
					}
				}

				setState(191);
				ut();
				setState(192);
				match(T__14);
				setState(193);
				tt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(T__6);
				setState(196);
				rt();
				setState(197);
				match(T__14);
				setState(198);
				tt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				ut();
				setState(201);
				match(T__7);
				setState(202);
				tt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				match(T__15);
				setState(205);
				rt();
				setState(206);
				match(T__1);
				setState(207);
				tt();
				setState(208);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(210);
				match(T__16);
				}
				break;
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

	public static class StatusContext extends ParserRuleContext {
		public List<UtContext> ut() {
			return getRuleContexts(UtContext.class);
		}
		public UtContext ut(int i) {
			return getRuleContext(UtContext.class,i);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public RtContext rt() {
			return getRuleContext(RtContext.class,0);
		}
		public StatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_status; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitStatus(this);
		}
	}

	public final StatusContext status() throws RecognitionException {
		StatusContext _localctx = new StatusContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_status);
		int _la;
		try {
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(213);
					match(T__8);
					}
				}

				setState(216);
				ut();
				setState(217);
				match(T__17);
				setState(218);
				tt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(T__6);
				setState(221);
				rt();
				setState(222);
				match(T__17);
				setState(223);
				tt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				ut();
				setState(226);
				match(T__18);
				setState(227);
				tt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				tt();
				setState(230);
				match(T__19);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				tt();
				setState(233);
				match(T__20);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(235);
				ut();
				setState(236);
				match(T__21);
				setState(237);
				ut();
				}
				break;
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(Inter_InstanceParser.WHERE, 0); }
		public ConditionalBodyContext conditionalBody() {
			return getRuleContext(ConditionalBodyContext.class,0);
		}
		public NtContext nt() {
			return getRuleContext(NtContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public UtContext ut() {
			return getRuleContext(UtContext.class,0);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditional);
		try {
			setState(313);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(T__22);
				setState(242);
				match(WHERE);
				setState(243);
				conditionalBody();
				setState(244);
				match(T__23);
				setState(245);
				nt();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(T__24);
				setState(251);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(248);
					match(VARIABLE);
					}
					break;
				case 2:
					{
					setState(249);
					ut();
					}
					break;
				case 3:
					{
					setState(250);
					tt();
					}
					break;
				}
				setState(253);
				match(WHERE);
				setState(254);
				conditionalBody();
				setState(255);
				match(T__23);
				setState(256);
				nt();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(T__25);
				setState(262);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(259);
					match(VARIABLE);
					}
					break;
				case 2:
					{
					setState(260);
					ut();
					}
					break;
				case 3:
					{
					setState(261);
					tt();
					}
					break;
				}
				setState(264);
				match(WHERE);
				setState(265);
				conditionalBody();
				setState(266);
				match(T__23);
				setState(267);
				nt();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				match(T__26);
				setState(273);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(270);
					match(VARIABLE);
					}
					break;
				case 2:
					{
					setState(271);
					ut();
					}
					break;
				case 3:
					{
					setState(272);
					tt();
					}
					break;
				}
				setState(275);
				match(WHERE);
				setState(276);
				conditionalBody();
				setState(277);
				match(T__23);
				setState(278);
				nt();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				match(T__27);
				setState(284);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(281);
					match(VARIABLE);
					}
					break;
				case 2:
					{
					setState(282);
					ut();
					}
					break;
				case 3:
					{
					setState(283);
					tt();
					}
					break;
				}
				setState(286);
				match(WHERE);
				setState(287);
				conditionalBody();
				setState(288);
				match(T__23);
				setState(289);
				nt();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 6);
				{
				setState(291);
				match(T__28);
				setState(295);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(292);
					match(VARIABLE);
					}
					break;
				case 2:
					{
					setState(293);
					ut();
					}
					break;
				case 3:
					{
					setState(294);
					tt();
					}
					break;
				}
				setState(297);
				match(WHERE);
				setState(298);
				conditionalBody();
				setState(299);
				match(T__23);
				setState(300);
				nt();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 7);
				{
				setState(302);
				match(T__29);
				setState(306);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(303);
					match(VARIABLE);
					}
					break;
				case 2:
					{
					setState(304);
					ut();
					}
					break;
				case 3:
					{
					setState(305);
					tt();
					}
					break;
				}
				setState(308);
				match(WHERE);
				setState(309);
				conditionalBody();
				setState(310);
				match(T__23);
				setState(311);
				nt();
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

	public static class ConditionalBodyContext extends ParserRuleContext {
		public List<ClausesContext> clauses() {
			return getRuleContexts(ClausesContext.class);
		}
		public ClausesContext clauses(int i) {
			return getRuleContext(ClausesContext.class,i);
		}
		public List<TerminalNode> KONJ() { return getTokens(Inter_InstanceParser.KONJ); }
		public TerminalNode KONJ(int i) {
			return getToken(Inter_InstanceParser.KONJ, i);
		}
		public ConditionalBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterConditionalBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitConditionalBody(this);
		}
	}

	public final ConditionalBodyContext conditionalBody() throws RecognitionException {
		ConditionalBodyContext _localctx = new ConditionalBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditionalBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			clauses();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KONJ) {
				{
				{
				setState(316);
				match(KONJ);
				setState(317);
				clauses();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<EqualityParamsContext> equalityParams() {
			return getRuleContexts(EqualityParamsContext.class);
		}
		public EqualityParamsContext equalityParams(int i) {
			return getRuleContext(EqualityParamsContext.class,i);
		}
		public UnequalityParamsContext unequalityParams() {
			return getRuleContext(UnequalityParamsContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparison);
		int _la;
		try {
			setState(329);
			switch (_input.LA(1)) {
			case T__0:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__47:
			case CONSTANT:
			case VARIABLE:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				equalityParams();
				setState(324);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__31) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(325);
				equalityParams();
				}
				break;
			case T__32:
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(328);
				unequalityParams();
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

	public static class EqualityParamsContext extends ParserRuleContext {
		public UtContext ut() {
			return getRuleContext(UtContext.class,0);
		}
		public RtContext rt() {
			return getRuleContext(RtContext.class,0);
		}
		public CtContext ct() {
			return getRuleContext(CtContext.class,0);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public TiContext ti() {
			return getRuleContext(TiContext.class,0);
		}
		public WtContext wt() {
			return getRuleContext(WtContext.class,0);
		}
		public NtContext nt() {
			return getRuleContext(NtContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public EqualityParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterEqualityParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitEqualityParams(this);
		}
	}

	public final EqualityParamsContext equalityParams() throws RecognitionException {
		EqualityParamsContext _localctx = new EqualityParamsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_equalityParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(331);
				ut();
				}
				break;
			case 2:
				{
				setState(332);
				rt();
				}
				break;
			case 3:
				{
				setState(333);
				ct();
				}
				break;
			case 4:
				{
				setState(334);
				tt();
				}
				break;
			case 5:
				{
				setState(335);
				ti();
				}
				break;
			case 6:
				{
				setState(336);
				wt();
				}
				break;
			case 7:
				{
				setState(337);
				nt();
				}
				break;
			case 8:
				{
				setState(338);
				match(T__0);
				setState(339);
				arithmetic();
				setState(340);
				match(T__2);
				}
				break;
			}
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

	public static class UnequalityParamsContext extends ParserRuleContext {
		public TautContext taut() {
			return getRuleContext(TautContext.class,0);
		}
		public NtContext nt() {
			return getRuleContext(NtContext.class,0);
		}
		public RtContext rt() {
			return getRuleContext(RtContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public UnequalityParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unequalityParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterUnequalityParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitUnequalityParams(this);
		}
	}

	public final UnequalityParamsContext unequalityParams() throws RecognitionException {
		UnequalityParamsContext _localctx = new UnequalityParamsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unequalityParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(344);
				taut();
				}
				break;
			case 2:
				{
				setState(345);
				nt();
				}
				break;
			case 3:
				{
				setState(346);
				rt();
				}
				break;
			case 4:
				{
				setState(347);
				match(T__0);
				setState(348);
				arithmetic();
				setState(349);
				match(T__2);
				}
				break;
			}
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

	public static class ArithmeticContext extends ParserRuleContext {
		public List<NtContext> nt() {
			return getRuleContexts(NtContext.class);
		}
		public NtContext nt(int i) {
			return getRuleContext(NtContext.class,i);
		}
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitArithmetic(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arithmetic);
		int _la;
		try {
			setState(365);
			switch (_input.LA(1)) {
			case T__42:
			case T__43:
			case T__45:
			case T__47:
			case VARIABLE:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				nt();
				setState(354);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(355);
				nt();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(T__0);
				setState(358);
				arithmetic();
				setState(359);
				match(T__2);
				setState(360);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(361);
				match(T__0);
				setState(362);
				arithmetic();
				setState(363);
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

	public static class UtContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(Inter_InstanceParser.CONSTANT, 0); }
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public UtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterUt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitUt(this);
		}
	}

	public final UtContext ut() throws RecognitionException {
		UtContext _localctx = new UtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ut);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class RtContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(Inter_InstanceParser.CONSTANT, 0); }
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public UtContext ut() {
			return getRuleContext(UtContext.class,0);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public RtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterRt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitRt(this);
		}
	}

	public final RtContext rt() throws RecognitionException {
		RtContext _localctx = new RtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rt);
		try {
			setState(377);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(CONSTANT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(VARIABLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				ut();
				setState(372);
				match(T__40);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(374);
				tt();
				setState(375);
				match(T__40);
				}
				break;
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

	public static class TtContext extends ParserRuleContext {
		public IntraContext intra() {
			return getRuleContext(IntraContext.class,0);
		}
		public InterContext inter() {
			return getRuleContext(InterContext.class,0);
		}
		public InterpContext interp() {
			return getRuleContext(InterpContext.class,0);
		}
		public TtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterTt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitTt(this);
		}
	}

	public final TtContext tt() throws RecognitionException {
		TtContext _localctx = new TtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tt);
		try {
			setState(382);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				intra();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				inter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				interp();
				}
				break;
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

	public static class IntraContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(Inter_InstanceParser.CONSTANT, 0); }
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public IntraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterIntra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitIntra(this);
		}
	}

	public final IntraContext intra() throws RecognitionException {
		IntraContext _localctx = new IntraContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_intra);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class InterContext extends ParserRuleContext {
		public List<TerminalNode> CONSTANT() { return getTokens(Inter_InstanceParser.CONSTANT); }
		public TerminalNode CONSTANT(int i) {
			return getToken(Inter_InstanceParser.CONSTANT, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(Inter_InstanceParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(Inter_InstanceParser.VARIABLE, i);
		}
		public InterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterInter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitInter(this);
		}
	}

	public final InterContext inter() throws RecognitionException {
		InterContext _localctx = new InterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_inter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(387);
			match(T__41);
			setState(388);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class InterpContext extends ParserRuleContext {
		public List<TerminalNode> CONSTANT() { return getTokens(Inter_InstanceParser.CONSTANT); }
		public TerminalNode CONSTANT(int i) {
			return getToken(Inter_InstanceParser.CONSTANT, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(Inter_InstanceParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(Inter_InstanceParser.VARIABLE, i);
		}
		public InterpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterInterp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitInterp(this);
		}
	}

	public final InterpContext interp() throws RecognitionException {
		InterpContext _localctx = new InterpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_interp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(391);
			match(T__41);
			setState(392);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(393);
			match(T__41);
			setState(394);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class NtContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(Inter_InstanceParser.NUMBER, 0); }
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public List<TtContext> tt() {
			return getRuleContexts(TtContext.class);
		}
		public TtContext tt(int i) {
			return getRuleContext(TtContext.class,i);
		}
		public TautContext taut() {
			return getRuleContext(TautContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public NtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterNt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitNt(this);
		}
	}

	public final NtContext nt() throws RecognitionException {
		NtContext _localctx = new NtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_nt);
		try {
			setState(412);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(NUMBER);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(VARIABLE);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
				match(T__42);
				setState(399);
				tt();
				setState(400);
				match(T__1);
				setState(401);
				taut();
				setState(402);
				match(T__2);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 4);
				{
				setState(404);
				match(T__43);
				setState(405);
				tt();
				setState(406);
				match(T__1);
				setState(407);
				tt();
				setState(408);
				match(T__2);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 5);
				{
				setState(410);
				output();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 6);
				{
				setState(411);
				input();
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

	public static class CtContext extends ParserRuleContext {
		public CtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterCt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitCt(this);
		}
	}

	public final CtContext ct() throws RecognitionException {
		CtContext _localctx = new CtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(T__44);
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

	public static class TiContext extends ParserRuleContext {
		public TiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ti; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterTi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitTi(this);
		}
	}

	public final TiContext ti() throws RecognitionException {
		TiContext _localctx = new TiContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ti);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T__44);
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

	public static class WtContext extends ParserRuleContext {
		public WtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterWt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitWt(this);
		}
	}

	public final WtContext wt() throws RecognitionException {
		WtContext _localctx = new WtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_wt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(T__44);
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

	public static class TautContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public CtContext ct() {
			return getRuleContext(CtContext.class,0);
		}
		public TautContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_taut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterTaut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitTaut(this);
		}
	}

	public final TautContext taut() throws RecognitionException {
		TautContext _localctx = new TautContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_taut);
		try {
			setState(422);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(VARIABLE);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				ct();
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

	public static class InputContext extends ParserRuleContext {
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public InputvarContext inputvar() {
			return getRuleContext(InputvarContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(T__45);
			setState(425);
			tt();
			setState(426);
			match(T__46);
			setState(427);
			inputvar();
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

	public static class InputvarContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public InputvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterInputvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitInputvar(this);
		}
	}

	public final InputvarContext inputvar() throws RecognitionException {
		InputvarContext _localctx = new InputvarContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_inputvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(VARIABLE);
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

	public static class OutputContext extends ParserRuleContext {
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public OutputvarContext outputvar() {
			return getRuleContext(OutputvarContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(T__47);
			setState(432);
			tt();
			setState(433);
			match(T__46);
			setState(434);
			outputvar();
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

	public static class OutputvarContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public OutputvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterOutputvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitOutputvar(this);
		}
	}

	public final OutputvarContext outputvar() throws RecognitionException {
		OutputvarContext _localctx = new OutputvarContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_outputvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(VARIABLE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3B\u01b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3Y\n\3\f\3\16\3\\\13\3\3\3\3\3\3\4\3"+
		"\4\5\4b\n\4\3\5\3\5\3\5\5\5g\n\5\3\5\3\5\3\5\5\5l\n\5\7\5n\n\5\f\5\16"+
		"\5q\13\5\3\6\5\6t\n\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7~\n\7\f\7\16"+
		"\7\u0081\13\7\3\b\3\b\3\b\3\b\3\b\5\b\u0088\n\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0098\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00bd\n\13\3\f\5\f\u00c0\n\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d6\n"+
		"\f\3\r\5\r\u00d9\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f2\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00fe\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0109\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0114\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u011f\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u012a\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0135\n"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u013c\n\16\3\17\3\17\3\17\7\17\u0141"+
		"\n\17\f\17\16\17\u0144\13\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u014c"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0159"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0162\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0170\n\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u017c\n\25\3\26\3\26\3\26"+
		"\5\26\u0181\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u019f\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\5\36\u01a9\n\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3\"\3\""+
		"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@B\2\6\3\2!\"\3\2#&\3\2\'*\3\2>?\u01e1\2G\3\2\2\2\4R\3\2\2\2\6a\3"+
		"\2\2\2\bc\3\2\2\2\ns\3\2\2\2\fz\3\2\2\2\16\u0087\3\2\2\2\20\u0089\3\2"+
		"\2\2\22\u0097\3\2\2\2\24\u00bc\3\2\2\2\26\u00d5\3\2\2\2\30\u00f1\3\2\2"+
		"\2\32\u013b\3\2\2\2\34\u013d\3\2\2\2\36\u014b\3\2\2\2 \u0158\3\2\2\2\""+
		"\u0161\3\2\2\2$\u016f\3\2\2\2&\u0171\3\2\2\2(\u017b\3\2\2\2*\u0180\3\2"+
		"\2\2,\u0182\3\2\2\2.\u0184\3\2\2\2\60\u0188\3\2\2\2\62\u019e\3\2\2\2\64"+
		"\u01a0\3\2\2\2\66\u01a2\3\2\2\28\u01a4\3\2\2\2:\u01a8\3\2\2\2<\u01aa\3"+
		"\2\2\2>\u01af\3\2\2\2@\u01b1\3\2\2\2B\u01b6\3\2\2\2DF\5\4\3\2ED\3\2\2"+
		"\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HM\3\2\2\2IG\3\2\2\2JL\5\6\4\2KJ\3\2\2"+
		"\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\2\2\3Q\3\3\2"+
		"\2\2RS\7:\2\2ST\7@\2\2TU\7\3\2\2UZ\7<\2\2VW\7\4\2\2WY\7<\2\2XV\3\2\2\2"+
		"Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\5\2\2^\5\3\2"+
		"\2\2_b\5\b\5\2`b\5\n\6\2a_\3\2\2\2a`\3\2\2\2b\7\3\2\2\2cf\7\65\2\2dg\5"+
		"\22\n\2eg\5\24\13\2fd\3\2\2\2fe\3\2\2\2go\3\2\2\2hk\7\4\2\2il\5\22\n\2"+
		"jl\5\24\13\2ki\3\2\2\2kj\3\2\2\2ln\3\2\2\2mh\3\2\2\2nq\3\2\2\2om\3\2\2"+
		"\2op\3\2\2\2p\t\3\2\2\2qo\3\2\2\2rt\7;\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2"+
		"\2uv\7\66\2\2vw\5\f\7\2wx\7\67\2\2xy\5\20\t\2y\13\3\2\2\2z\177\5\16\b"+
		"\2{|\78\2\2|~\5\16\b\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\r\3\2\2\2\u0081\177\3\2\2\2\u0082\u0088\5\24\13\2\u0083"+
		"\u0088\5\30\r\2\u0084\u0088\5\36\20\2\u0085\u0088\5\32\16\2\u0086\u0088"+
		"\5\22\n\2\u0087\u0082\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0084\3\2\2\2"+
		"\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\17\3\2\2\2\u0089\u008a"+
		"\5\26\f\2\u008a\21\3\2\2\2\u008b\u008c\5&\24\2\u008c\u008d\7\6\2\2\u008d"+
		"\u008e\5&\24\2\u008e\u0098\3\2\2\2\u008f\u0090\5&\24\2\u0090\u0091\7\7"+
		"\2\2\u0091\u0092\5&\24\2\u0092\u0098\3\2\2\2\u0093\u0094\5&\24\2\u0094"+
		"\u0095\7\b\2\2\u0095\u0096\5&\24\2\u0096\u0098\3\2\2\2\u0097\u008b\3\2"+
		"\2\2\u0097\u008f\3\2\2\2\u0097\u0093\3\2\2\2\u0098\23\3\2\2\2\u0099\u009a"+
		"\7\t\2\2\u009a\u009b\5(\25\2\u009b\u009c\7\n\2\2\u009c\u009d\5*\26\2\u009d"+
		"\u00bd\3\2\2\2\u009e\u009f\7\13\2\2\u009f\u00a0\5&\24\2\u00a0\u00a1\7"+
		"\n\2\2\u00a1\u00a2\5*\26\2\u00a2\u00bd\3\2\2\2\u00a3\u00a4\7\13\2\2\u00a4"+
		"\u00a5\5&\24\2\u00a5\u00a6\7\f\2\2\u00a6\u00a7\5(\25\2\u00a7\u00bd\3\2"+
		"\2\2\u00a8\u00a9\5(\25\2\u00a9\u00aa\7\r\2\2\u00aa\u00ab\5*\26\2\u00ab"+
		"\u00bd\3\2\2\2\u00ac\u00ad\5(\25\2\u00ad\u00ae\7\16\2\2\u00ae\u00af\5"+
		"*\26\2\u00af\u00bd\3\2\2\2\u00b0\u00b1\7\17\2\2\u00b1\u00b2\5(\25\2\u00b2"+
		"\u00b3\7\4\2\2\u00b3\u00b4\5(\25\2\u00b4\u00b5\7\5\2\2\u00b5\u00bd\3\2"+
		"\2\2\u00b6\u00b7\7\20\2\2\u00b7\u00b8\5*\26\2\u00b8\u00b9\7\4\2\2\u00b9"+
		"\u00ba\5*\26\2\u00ba\u00bb\7\5\2\2\u00bb\u00bd\3\2\2\2\u00bc\u0099\3\2"+
		"\2\2\u00bc\u009e\3\2\2\2\u00bc\u00a3\3\2\2\2\u00bc\u00a8\3\2\2\2\u00bc"+
		"\u00ac\3\2\2\2\u00bc\u00b0\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bd\25\3\2\2"+
		"\2\u00be\u00c0\7\13\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\5&\24\2\u00c2\u00c3\7\21\2\2\u00c3\u00c4\5"+
		"*\26\2\u00c4\u00d6\3\2\2\2\u00c5\u00c6\7\t\2\2\u00c6\u00c7\5(\25\2\u00c7"+
		"\u00c8\7\21\2\2\u00c8\u00c9\5*\26\2\u00c9\u00d6\3\2\2\2\u00ca\u00cb\5"+
		"&\24\2\u00cb\u00cc\7\n\2\2\u00cc\u00cd\5*\26\2\u00cd\u00d6\3\2\2\2\u00ce"+
		"\u00cf\7\22\2\2\u00cf\u00d0\5(\25\2\u00d0\u00d1\7\4\2\2\u00d1\u00d2\5"+
		"*\26\2\u00d2\u00d3\7\5\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d6\7\23\2\2\u00d5"+
		"\u00bf\3\2\2\2\u00d5\u00c5\3\2\2\2\u00d5\u00ca\3\2\2\2\u00d5\u00ce\3\2"+
		"\2\2\u00d5\u00d4\3\2\2\2\u00d6\27\3\2\2\2\u00d7\u00d9\7\13\2\2\u00d8\u00d7"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\5&\24\2\u00db"+
		"\u00dc\7\24\2\2\u00dc\u00dd\5*\26\2\u00dd\u00f2\3\2\2\2\u00de\u00df\7"+
		"\t\2\2\u00df\u00e0\5(\25\2\u00e0\u00e1\7\24\2\2\u00e1\u00e2\5*\26\2\u00e2"+
		"\u00f2\3\2\2\2\u00e3\u00e4\5&\24\2\u00e4\u00e5\7\25\2\2\u00e5\u00e6\5"+
		"*\26\2\u00e6\u00f2\3\2\2\2\u00e7\u00e8\5*\26\2\u00e8\u00e9\7\26\2\2\u00e9"+
		"\u00f2\3\2\2\2\u00ea\u00eb\5*\26\2\u00eb\u00ec\7\27\2\2\u00ec\u00f2\3"+
		"\2\2\2\u00ed\u00ee\5&\24\2\u00ee\u00ef\7\30\2\2\u00ef\u00f0\5&\24\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00d8\3\2\2\2\u00f1\u00de\3\2\2\2\u00f1\u00e3\3\2"+
		"\2\2\u00f1\u00e7\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f2"+
		"\31\3\2\2\2\u00f3\u00f4\7\31\2\2\u00f4\u00f5\7=\2\2\u00f5\u00f6\5\34\17"+
		"\2\u00f6\u00f7\7\32\2\2\u00f7\u00f8\5\62\32\2\u00f8\u013c\3\2\2\2\u00f9"+
		"\u00fd\7\33\2\2\u00fa\u00fe\7?\2\2\u00fb\u00fe\5&\24\2\u00fc\u00fe\5*"+
		"\26\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\7=\2\2\u0100\u0101\5\34\17\2\u0101\u0102\7"+
		"\32\2\2\u0102\u0103\5\62\32\2\u0103\u013c\3\2\2\2\u0104\u0108\7\34\2\2"+
		"\u0105\u0109\7?\2\2\u0106\u0109\5&\24\2\u0107\u0109\5*\26\2\u0108\u0105"+
		"\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010b\7=\2\2\u010b\u010c\5\34\17\2\u010c\u010d\7\32\2\2\u010d\u010e\5"+
		"\62\32\2\u010e\u013c\3\2\2\2\u010f\u0113\7\35\2\2\u0110\u0114\7?\2\2\u0111"+
		"\u0114\5&\24\2\u0112\u0114\5*\26\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\7=\2\2\u0116"+
		"\u0117\5\34\17\2\u0117\u0118\7\32\2\2\u0118\u0119\5\62\32\2\u0119\u013c"+
		"\3\2\2\2\u011a\u011e\7\36\2\2\u011b\u011f\7?\2\2\u011c\u011f\5&\24\2\u011d"+
		"\u011f\5*\26\2\u011e\u011b\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7=\2\2\u0121\u0122\5\34\17\2\u0122"+
		"\u0123\7\32\2\2\u0123\u0124\5\62\32\2\u0124\u013c\3\2\2\2\u0125\u0129"+
		"\7\37\2\2\u0126\u012a\7?\2\2\u0127\u012a\5&\24\2\u0128\u012a\5*\26\2\u0129"+
		"\u0126\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012c\7=\2\2\u012c\u012d\5\34\17\2\u012d\u012e\7\32\2\2\u012e"+
		"\u012f\5\62\32\2\u012f\u013c\3\2\2\2\u0130\u0134\7 \2\2\u0131\u0135\7"+
		"?\2\2\u0132\u0135\5&\24\2\u0133\u0135\5*\26\2\u0134\u0131\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\7="+
		"\2\2\u0137\u0138\5\34\17\2\u0138\u0139\7\32\2\2\u0139\u013a\5\62\32\2"+
		"\u013a\u013c\3\2\2\2\u013b\u00f3\3\2\2\2\u013b\u00f9\3\2\2\2\u013b\u0104"+
		"\3\2\2\2\u013b\u010f\3\2\2\2\u013b\u011a\3\2\2\2\u013b\u0125\3\2\2\2\u013b"+
		"\u0130\3\2\2\2\u013c\33\3\2\2\2\u013d\u0142\5\16\b\2\u013e\u013f\78\2"+
		"\2\u013f\u0141\5\16\b\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\35\3\2\2\2\u0144\u0142\3\2\2"+
		"\2\u0145\u0146\5 \21\2\u0146\u0147\t\2\2\2\u0147\u0148\5 \21\2\u0148\u014c"+
		"\3\2\2\2\u0149\u014a\t\3\2\2\u014a\u014c\5\"\22\2\u014b\u0145\3\2\2\2"+
		"\u014b\u0149\3\2\2\2\u014c\37\3\2\2\2\u014d\u0159\5&\24\2\u014e\u0159"+
		"\5(\25\2\u014f\u0159\5\64\33\2\u0150\u0159\5*\26\2\u0151\u0159\5\66\34"+
		"\2\u0152\u0159\58\35\2\u0153\u0159\5\62\32\2\u0154\u0155\7\3\2\2\u0155"+
		"\u0156\5$\23\2\u0156\u0157\7\5\2\2\u0157\u0159\3\2\2\2\u0158\u014d\3\2"+
		"\2\2\u0158\u014e\3\2\2\2\u0158\u014f\3\2\2\2\u0158\u0150\3\2\2\2\u0158"+
		"\u0151\3\2\2\2\u0158\u0152\3\2\2\2\u0158\u0153\3\2\2\2\u0158\u0154\3\2"+
		"\2\2\u0159!\3\2\2\2\u015a\u0162\5:\36\2\u015b\u0162\5\62\32\2\u015c\u0162"+
		"\5(\25\2\u015d\u015e\7\3\2\2\u015e\u015f\5$\23\2\u015f\u0160\7\5\2\2\u0160"+
		"\u0162\3\2\2\2\u0161\u015a\3\2\2\2\u0161\u015b\3\2\2\2\u0161\u015c\3\2"+
		"\2\2\u0161\u015d\3\2\2\2\u0162#\3\2\2\2\u0163\u0164\5\62\32\2\u0164\u0165"+
		"\t\4\2\2\u0165\u0166\5\62\32\2\u0166\u0170\3\2\2\2\u0167\u0168\7\3\2\2"+
		"\u0168\u0169\5$\23\2\u0169\u016a\7\5\2\2\u016a\u016b\t\4\2\2\u016b\u016c"+
		"\7\3\2\2\u016c\u016d\5$\23\2\u016d\u016e\7\5\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u0163\3\2\2\2\u016f\u0167\3\2\2\2\u0170%\3\2\2\2\u0171\u0172\t\5\2\2"+
		"\u0172\'\3\2\2\2\u0173\u017c\7>\2\2\u0174\u017c\7?\2\2\u0175\u0176\5&"+
		"\24\2\u0176\u0177\7+\2\2\u0177\u017c\3\2\2\2\u0178\u0179\5*\26\2\u0179"+
		"\u017a\7+\2\2\u017a\u017c\3\2\2\2\u017b\u0173\3\2\2\2\u017b\u0174\3\2"+
		"\2\2\u017b\u0175\3\2\2\2\u017b\u0178\3\2\2\2\u017c)\3\2\2\2\u017d\u0181"+
		"\5,\27\2\u017e\u0181\5.\30\2\u017f\u0181\5\60\31\2\u0180\u017d\3\2\2\2"+
		"\u0180\u017e\3\2\2\2\u0180\u017f\3\2\2\2\u0181+\3\2\2\2\u0182\u0183\t"+
		"\5\2\2\u0183-\3\2\2\2\u0184\u0185\t\5\2\2\u0185\u0186\7,\2\2\u0186\u0187"+
		"\t\5\2\2\u0187/\3\2\2\2\u0188\u0189\t\5\2\2\u0189\u018a\7,\2\2\u018a\u018b"+
		"\t\5\2\2\u018b\u018c\7,\2\2\u018c\u018d\t\5\2\2\u018d\61\3\2\2\2\u018e"+
		"\u019f\7A\2\2\u018f\u019f\7?\2\2\u0190\u0191\7-\2\2\u0191\u0192\5*\26"+
		"\2\u0192\u0193\7\4\2\2\u0193\u0194\5:\36\2\u0194\u0195\7\5\2\2\u0195\u019f"+
		"\3\2\2\2\u0196\u0197\7.\2\2\u0197\u0198\5*\26\2\u0198\u0199\7\4\2\2\u0199"+
		"\u019a\5*\26\2\u019a\u019b\7\5\2\2\u019b\u019f\3\2\2\2\u019c\u019f\5@"+
		"!\2\u019d\u019f\5<\37\2\u019e\u018e\3\2\2\2\u019e\u018f\3\2\2\2\u019e"+
		"\u0190\3\2\2\2\u019e\u0196\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019d\3\2"+
		"\2\2\u019f\63\3\2\2\2\u01a0\u01a1\7/\2\2\u01a1\65\3\2\2\2\u01a2\u01a3"+
		"\7/\2\2\u01a3\67\3\2\2\2\u01a4\u01a5\7/\2\2\u01a59\3\2\2\2\u01a6\u01a9"+
		"\7?\2\2\u01a7\u01a9\5\64\33\2\u01a8\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2"+
		"\u01a9;\3\2\2\2\u01aa\u01ab\7\60\2\2\u01ab\u01ac\5*\26\2\u01ac\u01ad\7"+
		"\61\2\2\u01ad\u01ae\5> \2\u01ae=\3\2\2\2\u01af\u01b0\7?\2\2\u01b0?\3\2"+
		"\2\2\u01b1\u01b2\7\62\2\2\u01b2\u01b3\5*\26\2\u01b3\u01b4\7\61\2\2\u01b4"+
		"\u01b5\5B\"\2\u01b5A\3\2\2\2\u01b6\u01b7\7?\2\2\u01b7C\3\2\2\2\"GMZaf"+
		"kos\177\u0087\u0097\u00bc\u00bf\u00d5\u00d8\u00f1\u00fd\u0108\u0113\u011e"+
		"\u0129\u0134\u013b\u0142\u014b\u0158\u0161\u016f\u017b\u0180\u019e\u01a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}