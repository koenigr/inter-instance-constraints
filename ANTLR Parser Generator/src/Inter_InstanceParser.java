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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		MULTILINE_COMMENTS=67, SINGLE_LINE_COMMENTS=68, SET=69, IF=70, THEN=71, 
		KONJ=72, DISJ=73, DEF=74, DESC=75, ARGS=76, WHERE=77, ROLE=78, TASKINSTANCE=79, 
		YEAR=80, MONTH=81, DAY=82, HOUR=83, MINUTE=84, SECOND=85, CONSTANT=86, 
		VARIABLE=87, CLAUSE=88, NUMBER=89, STRING=90, WS=91;
	public static final int
		RULE_file = 0, RULE_define = 1, RULE_statement = 2, RULE_explicitSetting = 3, 
		RULE_assignment = 4, RULE_assignmentBody = 5, RULE_clauses = 6, RULE_atoms = 7, 
		RULE_assignmentHead = 8, RULE_extern = 9, RULE_specification = 10, RULE_enforcement = 11, 
		RULE_status = 12, RULE_conditional = 13, RULE_conditionalBody = 14, RULE_comparison = 15, 
		RULE_equalityParams = 16, RULE_inequalityParams = 17, RULE_arithmetic = 18, 
		RULE_event = 19, RULE_unknownEvent = 20, RULE_ut = 21, RULE_rt = 22, RULE_tt = 23, 
		RULE_intra = 24, RULE_inter = 25, RULE_interp = 26, RULE_nt = 27, RULE_tp = 28, 
		RULE_ts = 29, RULE_ti = 30, RULE_wt = 31, RULE_taut = 32, RULE_variable = 33;
	public static final String[] ruleNames = {
		"file", "define", "statement", "explicitSetting", "assignment", "assignmentBody", 
		"clauses", "atoms", "assignmentHead", "extern", "specification", "enforcement", 
		"status", "conditional", "conditionalBody", "comparison", "equalityParams", 
		"inequalityParams", "arithmetic", "event", "unknownEvent", "ut", "rt", 
		"tt", "intra", "inter", "interp", "nt", "tp", "ts", "ti", "wt", "taut", 
		"variable"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "','", "')'", "'is related to'", "'is partner of'", "'is in same group as'", 
		"'role'", "'can execute'", "'user'", "'belongs to role'", "'is glb of'", 
		"'is lub'", "'dominates'", "'critical_task_pair('", "'cannot execute'", 
		"'must execute'", "'mrole'", "'panic'", "'executed'", "'is assigned to'", 
		"'aborted'", "'succeeded'", "'started'", "'EventType('", "').'", "'is collaborator of'", 
		"'in tasks'", "'NUMBER'", "'IS'", "'NUMBER OF'", "'NUMBER OF DIFF'", "'SUM OF'", 
		"'AVG OF'", "'MIN OF'", "'MAX OF'", "'='", "'!='", "'<'", "'<='", "'>'", 
		"'>='", "'*'", "'/'", "'+'", "'-'", "'assign'", "'ate_abort'", "'autoskip'", 
		"'complete'", "'manual_skip'", "'pi_abort'", "'reassign'", "'resume'", 
		"'schedule'", "'start'", "'suspend'", "'withdraw'", "'.'", "'T'", "':'", 
		"'[,.]'", "'P'", "'??'", "'timestamp('", "'timeinterval('", "'Var('", 
		null, null, null, null, "'THEN'", null, null, null, null, null, "'WHERE'", 
		"'.Role'", "'.InstanceID'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "MULTILINE_COMMENTS", "SINGLE_LINE_COMMENTS", 
		"SET", "IF", "THEN", "KONJ", "DISJ", "DEF", "DESC", "ARGS", "WHERE", "ROLE", 
		"TASKINSTANCE", "YEAR", "MONTH", "DAY", "HOUR", "MINUTE", "SECOND", "CONSTANT", 
		"VARIABLE", "CLAUSE", "NUMBER", "STRING", "WS"
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
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(68);
				define();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (SET - 69)) | (1L << (IF - 69)) | (1L << (DESC - 69)))) != 0)) {
				{
				{
				setState(74);
				statement();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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
		public List<TerminalNode> KONJ() { return getTokens(Inter_InstanceParser.KONJ); }
		public TerminalNode KONJ(int i) {
			return getToken(Inter_InstanceParser.KONJ, i);
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
			setState(82);
			match(DEF);
			setState(83);
			match(CLAUSE);
			setState(84);
			match(T__0);
			setState(85);
			match(ARGS);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==KONJ) {
				{
				{
				setState(86);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==KONJ) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(87);
				match(ARGS);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
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
		public ExplicitSettingContext explicitSetting() {
			return getRuleContext(ExplicitSettingContext.class,0);
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
			setState(97);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				explicitSetting();
				}
				break;
			case IF:
			case DESC:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
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

	public static class ExplicitSettingContext extends ParserRuleContext {
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
		public List<TerminalNode> KONJ() { return getTokens(Inter_InstanceParser.KONJ); }
		public TerminalNode KONJ(int i) {
			return getToken(Inter_InstanceParser.KONJ, i);
		}
		public ExplicitSettingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitSetting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterExplicitSetting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitExplicitSetting(this);
		}
	}

	public final ExplicitSettingContext explicitSetting() throws RecognitionException {
		ExplicitSettingContext _localctx = new ExplicitSettingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_explicitSetting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(SET);
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(100);
				extern();
				}
				break;
			case 2:
				{
				setState(101);
				specification();
				}
				break;
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==KONJ) {
				{
				{
				setState(104);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==KONJ) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(107);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(105);
					extern();
					}
					break;
				case 2:
					{
					setState(106);
					specification();
					}
					break;
				}
				}
				}
				setState(113);
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
			setState(115);
			_la = _input.LA(1);
			if (_la==DESC) {
				{
				setState(114);
				match(DESC);
				}
			}

			setState(117);
			match(IF);
			setState(118);
			assignmentBody();
			setState(119);
			match(THEN);
			setState(120);
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
			setState(122);
			clauses();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KONJ) {
				{
				{
				setState(123);
				match(KONJ);
				setState(124);
				clauses();
				}
				}
				setState(129);
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
		public List<AtomsContext> atoms() {
			return getRuleContexts(AtomsContext.class);
		}
		public AtomsContext atoms(int i) {
			return getRuleContext(AtomsContext.class,i);
		}
		public List<TerminalNode> DISJ() { return getTokens(Inter_InstanceParser.DISJ); }
		public TerminalNode DISJ(int i) {
			return getToken(Inter_InstanceParser.DISJ, i);
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
		int _la;
		try {
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				atoms();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__0);
				setState(132);
				atoms();
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DISJ) {
					{
					{
					setState(133);
					match(DISJ);
					setState(134);
					atoms();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
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

	public static class AtomsContext extends ParserRuleContext {
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
		public AtomsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atoms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterAtoms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitAtoms(this);
		}
	}

	public final AtomsContext atoms() throws RecognitionException {
		AtomsContext _localctx = new AtomsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atoms);
		try {
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				specification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				status();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				comparison();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
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
		enterRule(_localctx, 16, RULE_assignmentHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
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
		public ExternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern; }
	 
		public ExternContext() { }
		public void copyFrom(ExternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SamegroupContext extends ExternContext {
		public List<UtContext> ut() {
			return getRuleContexts(UtContext.class);
		}
		public UtContext ut(int i) {
			return getRuleContext(UtContext.class,i);
		}
		public SamegroupContext(ExternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterSamegroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitSamegroup(this);
		}
	}
	public static class PartnerofContext extends ExternContext {
		public List<UtContext> ut() {
			return getRuleContexts(UtContext.class);
		}
		public UtContext ut(int i) {
			return getRuleContext(UtContext.class,i);
		}
		public PartnerofContext(ExternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterPartnerof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitPartnerof(this);
		}
	}
	public static class RelatedContext extends ExternContext {
		public List<UtContext> ut() {
			return getRuleContexts(UtContext.class);
		}
		public UtContext ut(int i) {
			return getRuleContext(UtContext.class,i);
		}
		public RelatedContext(ExternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterRelated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitRelated(this);
		}
	}

	public final ExternContext extern() throws RecognitionException {
		ExternContext _localctx = new ExternContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_extern);
		try {
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new RelatedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				ut();
				setState(154);
				match(T__3);
				setState(155);
				ut();
				}
				break;
			case 2:
				_localctx = new PartnerofContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				ut();
				setState(158);
				match(T__4);
				setState(159);
				ut();
				}
				break;
			case 3:
				_localctx = new SamegroupContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				ut();
				setState(162);
				match(T__5);
				setState(163);
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
		public SpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification; }
	 
		public SpecificationContext() { }
		public void copyFrom(SpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GlbContext extends SpecificationContext {
		public RtContext rt() {
			return getRuleContext(RtContext.class,0);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public GlbContext(SpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterGlb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitGlb(this);
		}
	}
	public static class LubContext extends SpecificationContext {
		public RtContext rt() {
			return getRuleContext(RtContext.class,0);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public LubContext(SpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterLub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitLub(this);
		}
	}
	public static class UserTaskContext extends SpecificationContext {
		public UtContext ut() {
			return getRuleContext(UtContext.class,0);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public UserTaskContext(SpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterUserTask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitUserTask(this);
		}
	}
	public static class DominateContext extends SpecificationContext {
		public List<RtContext> rt() {
			return getRuleContexts(RtContext.class);
		}
		public RtContext rt(int i) {
			return getRuleContext(RtContext.class,i);
		}
		public DominateContext(SpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterDominate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitDominate(this);
		}
	}
	public static class UserRoleContext extends SpecificationContext {
		public UtContext ut() {
			return getRuleContext(UtContext.class,0);
		}
		public RtContext rt() {
			return getRuleContext(RtContext.class,0);
		}
		public UserRoleContext(SpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterUserRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitUserRole(this);
		}
	}
	public static class CritTaskPairContext extends SpecificationContext {
		public List<TtContext> tt() {
			return getRuleContexts(TtContext.class);
		}
		public TtContext tt(int i) {
			return getRuleContext(TtContext.class,i);
		}
		public CritTaskPairContext(SpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterCritTaskPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitCritTaskPair(this);
		}
	}
	public static class RoleTaskContext extends SpecificationContext {
		public RtContext rt() {
			return getRuleContext(RtContext.class,0);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public RoleTaskContext(SpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterRoleTask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitRoleTask(this);
		}
	}

	public final SpecificationContext specification() throws RecognitionException {
		SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_specification);
		try {
			setState(200);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new RoleTaskContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(T__6);
				setState(168);
				rt();
				setState(169);
				match(T__7);
				setState(170);
				tt();
				}
				break;
			case 2:
				_localctx = new UserTaskContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(T__8);
				setState(173);
				ut();
				setState(174);
				match(T__7);
				setState(175);
				tt();
				}
				break;
			case 3:
				_localctx = new UserRoleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(T__8);
				setState(178);
				ut();
				setState(179);
				match(T__9);
				setState(180);
				rt();
				}
				break;
			case 4:
				_localctx = new GlbContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				rt();
				setState(183);
				match(T__10);
				setState(184);
				tt();
				}
				break;
			case 5:
				_localctx = new LubContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				rt();
				setState(187);
				match(T__11);
				setState(188);
				tt();
				}
				break;
			case 6:
				_localctx = new DominateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				rt();
				setState(191);
				match(T__12);
				setState(192);
				rt();
				}
				break;
			case 7:
				_localctx = new CritTaskPairContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(194);
				match(T__13);
				setState(195);
				tt();
				setState(196);
				match(T__1);
				setState(197);
				tt();
				setState(198);
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
		public EnforcementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enforcement; }
	 
		public EnforcementContext() { }
		public void copyFrom(EnforcementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PanicContext extends EnforcementContext {
		public PanicContext(EnforcementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterPanic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitPanic(this);
		}
	}
	public static class MustUserContext extends EnforcementContext {
		public UtContext ut() {
			return getRuleContext(UtContext.class,0);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public MustUserContext(EnforcementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterMustUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitMustUser(this);
		}
	}
	public static class CannotUserContext extends EnforcementContext {
		public UtContext ut() {
			return getRuleContext(UtContext.class,0);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public CannotUserContext(EnforcementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterCannotUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitCannotUser(this);
		}
	}
	public static class CannotRoleContext extends EnforcementContext {
		public RtContext rt() {
			return getRuleContext(RtContext.class,0);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public CannotRoleContext(EnforcementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterCannotRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitCannotRole(this);
		}
	}
	public static class MustRoleContext extends EnforcementContext {
		public RtContext rt() {
			return getRuleContext(RtContext.class,0);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public MustRoleContext(EnforcementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterMustRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitMustRole(this);
		}
	}

	public final EnforcementContext enforcement() throws RecognitionException {
		EnforcementContext _localctx = new EnforcementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enforcement);
		int _la;
		try {
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new CannotUserContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(202);
					match(T__8);
					}
				}

				setState(205);
				ut();
				setState(206);
				match(T__14);
				setState(207);
				tt();
				}
				break;
			case 2:
				_localctx = new CannotRoleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(T__6);
				setState(210);
				rt();
				setState(211);
				match(T__14);
				setState(212);
				tt();
				}
				break;
			case 3:
				_localctx = new MustUserContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				ut();
				setState(215);
				match(T__15);
				setState(216);
				tt();
				}
				break;
			case 4:
				_localctx = new MustRoleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				match(T__16);
				setState(219);
				rt();
				setState(220);
				match(T__15);
				setState(221);
				tt();
				}
				break;
			case 5:
				_localctx = new PanicContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				match(T__17);
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
		public StatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_status; }
	 
		public StatusContext() { }
		public void copyFrom(StatusContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FlexibleEventContext extends StatusContext {
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public UnknownEventContext unknownEvent() {
			return getRuleContext(UnknownEventContext.class,0);
		}
		public FlexibleEventContext(StatusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterFlexibleEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitFlexibleEvent(this);
		}
	}
	public static class SucceededTaskContext extends StatusContext {
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public SucceededTaskContext(StatusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterSucceededTask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitSucceededTask(this);
		}
	}
	public static class CollaboratorExtContext extends StatusContext {
		public List<UtContext> ut() {
			return getRuleContexts(UtContext.class);
		}
		public UtContext ut(int i) {
			return getRuleContext(UtContext.class,i);
		}
		public List<TtContext> tt() {
			return getRuleContexts(TtContext.class);
		}
		public TtContext tt(int i) {
			return getRuleContext(TtContext.class,i);
		}
		public CollaboratorExtContext(StatusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterCollaboratorExt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitCollaboratorExt(this);
		}
	}
	public static class CollaboratorContext extends StatusContext {
		public List<UtContext> ut() {
			return getRuleContexts(UtContext.class);
		}
		public UtContext ut(int i) {
			return getRuleContext(UtContext.class,i);
		}
		public CollaboratorContext(StatusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterCollaborator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitCollaborator(this);
		}
	}
	public static class ExecutedUserContext extends StatusContext {
		public UtContext ut() {
			return getRuleContext(UtContext.class,0);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public ExecutedUserContext(StatusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterExecutedUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitExecutedUser(this);
		}
	}
	public static class AbortedTaskContext extends StatusContext {
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public AbortedTaskContext(StatusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterAbortedTask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitAbortedTask(this);
		}
	}
	public static class AssignedUserContext extends StatusContext {
		public UtContext ut() {
			return getRuleContext(UtContext.class,0);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public AssignedUserContext(StatusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterAssignedUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitAssignedUser(this);
		}
	}
	public static class ExecutedRoleContext extends StatusContext {
		public RtContext rt() {
			return getRuleContext(RtContext.class,0);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public ExecutedRoleContext(StatusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterExecutedRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitExecutedRole(this);
		}
	}
	public static class StartedTaskContext extends StatusContext {
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public StartedTaskContext(StatusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterStartedTask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitStartedTask(this);
		}
	}

	public final StatusContext status() throws RecognitionException {
		StatusContext _localctx = new StatusContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_status);
		int _la;
		try {
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ExecutedUserContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(226);
					match(T__8);
					}
				}

				setState(229);
				ut();
				setState(230);
				match(T__18);
				setState(231);
				tt();
				}
				break;
			case 2:
				_localctx = new ExecutedRoleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(T__6);
				setState(234);
				rt();
				setState(235);
				match(T__18);
				setState(236);
				tt();
				}
				break;
			case 3:
				_localctx = new AssignedUserContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				ut();
				setState(239);
				match(T__19);
				setState(240);
				tt();
				}
				break;
			case 4:
				_localctx = new AbortedTaskContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				tt();
				setState(243);
				match(T__20);
				}
				break;
			case 5:
				_localctx = new SucceededTaskContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				tt();
				setState(246);
				match(T__21);
				}
				break;
			case 6:
				_localctx = new StartedTaskContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(248);
				tt();
				setState(249);
				match(T__22);
				}
				break;
			case 7:
				_localctx = new FlexibleEventContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				match(T__23);
				setState(252);
				tt();
				setState(253);
				match(T__24);
				setState(256);
				switch (_input.LA(1)) {
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
					{
					setState(254);
					event();
					}
					break;
				case CONSTANT:
					{
					setState(255);
					unknownEvent();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				_localctx = new CollaboratorContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(258);
				ut();
				setState(259);
				match(T__25);
				setState(260);
				ut();
				}
				break;
			case 9:
				_localctx = new CollaboratorExtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(262);
				ut();
				setState(263);
				match(T__25);
				setState(264);
				ut();
				setState(265);
				match(T__26);
				setState(266);
				tt();
				setState(267);
				match(T__1);
				setState(268);
				tt();
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
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	 
		public ConditionalContext() { }
		public void copyFrom(ConditionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MinContext extends ConditionalContext {
		public TerminalNode WHERE() { return getToken(Inter_InstanceParser.WHERE, 0); }
		public ConditionalBodyContext conditionalBody() {
			return getRuleContext(ConditionalBodyContext.class,0);
		}
		public List<NtContext> nt() {
			return getRuleContexts(NtContext.class);
		}
		public NtContext nt(int i) {
			return getRuleContext(NtContext.class,i);
		}
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public UtContext ut() {
			return getRuleContext(UtContext.class,0);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public MinContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitMin(this);
		}
	}
	public static class NumSimpleContext extends ConditionalContext {
		public TerminalNode WHERE() { return getToken(Inter_InstanceParser.WHERE, 0); }
		public ConditionalBodyContext conditionalBody() {
			return getRuleContext(ConditionalBodyContext.class,0);
		}
		public NtContext nt() {
			return getRuleContext(NtContext.class,0);
		}
		public NumSimpleContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterNumSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitNumSimple(this);
		}
	}
	public static class NumVarsContext extends ConditionalContext {
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
		public NumVarsContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterNumVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitNumVars(this);
		}
	}
	public static class MaxContext extends ConditionalContext {
		public TerminalNode WHERE() { return getToken(Inter_InstanceParser.WHERE, 0); }
		public ConditionalBodyContext conditionalBody() {
			return getRuleContext(ConditionalBodyContext.class,0);
		}
		public List<NtContext> nt() {
			return getRuleContexts(NtContext.class);
		}
		public NtContext nt(int i) {
			return getRuleContext(NtContext.class,i);
		}
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public UtContext ut() {
			return getRuleContext(UtContext.class,0);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public MaxContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitMax(this);
		}
	}
	public static class SumContext extends ConditionalContext {
		public TerminalNode WHERE() { return getToken(Inter_InstanceParser.WHERE, 0); }
		public ConditionalBodyContext conditionalBody() {
			return getRuleContext(ConditionalBodyContext.class,0);
		}
		public List<NtContext> nt() {
			return getRuleContexts(NtContext.class);
		}
		public NtContext nt(int i) {
			return getRuleContext(NtContext.class,i);
		}
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public UtContext ut() {
			return getRuleContext(UtContext.class,0);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public SumContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitSum(this);
		}
	}
	public static class AvgContext extends ConditionalContext {
		public TerminalNode WHERE() { return getToken(Inter_InstanceParser.WHERE, 0); }
		public ConditionalBodyContext conditionalBody() {
			return getRuleContext(ConditionalBodyContext.class,0);
		}
		public List<NtContext> nt() {
			return getRuleContexts(NtContext.class);
		}
		public NtContext nt(int i) {
			return getRuleContext(NtContext.class,i);
		}
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public UtContext ut() {
			return getRuleContext(UtContext.class,0);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public AvgContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterAvg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitAvg(this);
		}
	}
	public static class NumDiffContext extends ConditionalContext {
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
		public NumDiffContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterNumDiff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitNumDiff(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditional);
		try {
			setState(348);
			switch (_input.LA(1)) {
			case T__27:
				_localctx = new NumSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(T__27);
				setState(273);
				match(WHERE);
				setState(274);
				conditionalBody();
				setState(275);
				match(T__28);
				setState(276);
				nt();
				}
				break;
			case T__29:
				_localctx = new NumVarsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(T__29);
				setState(282);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(279);
					match(VARIABLE);
					}
					break;
				case 2:
					{
					setState(280);
					ut();
					}
					break;
				case 3:
					{
					setState(281);
					tt();
					}
					break;
				}
				setState(284);
				match(WHERE);
				setState(285);
				conditionalBody();
				setState(286);
				match(T__28);
				setState(287);
				nt();
				}
				break;
			case T__30:
				_localctx = new NumDiffContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				match(T__30);
				setState(293);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(290);
					match(VARIABLE);
					}
					break;
				case 2:
					{
					setState(291);
					ut();
					}
					break;
				case 3:
					{
					setState(292);
					tt();
					}
					break;
				}
				setState(295);
				match(WHERE);
				setState(296);
				conditionalBody();
				setState(297);
				match(T__28);
				setState(298);
				nt();
				}
				break;
			case T__31:
				_localctx = new SumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				match(T__31);
				setState(305);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(301);
					match(VARIABLE);
					}
					break;
				case 2:
					{
					setState(302);
					ut();
					}
					break;
				case 3:
					{
					setState(303);
					tt();
					}
					break;
				case 4:
					{
					setState(304);
					nt();
					}
					break;
				}
				setState(307);
				match(WHERE);
				setState(308);
				conditionalBody();
				setState(309);
				match(T__28);
				setState(310);
				nt();
				}
				break;
			case T__32:
				_localctx = new AvgContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(312);
				match(T__32);
				setState(317);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(313);
					match(VARIABLE);
					}
					break;
				case 2:
					{
					setState(314);
					ut();
					}
					break;
				case 3:
					{
					setState(315);
					tt();
					}
					break;
				case 4:
					{
					setState(316);
					nt();
					}
					break;
				}
				setState(319);
				match(WHERE);
				setState(320);
				conditionalBody();
				setState(321);
				match(T__28);
				setState(322);
				nt();
				}
				break;
			case T__33:
				_localctx = new MinContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(324);
				match(T__33);
				setState(329);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(325);
					match(VARIABLE);
					}
					break;
				case 2:
					{
					setState(326);
					ut();
					}
					break;
				case 3:
					{
					setState(327);
					tt();
					}
					break;
				case 4:
					{
					setState(328);
					nt();
					}
					break;
				}
				setState(331);
				match(WHERE);
				setState(332);
				conditionalBody();
				setState(333);
				match(T__28);
				setState(334);
				nt();
				}
				break;
			case T__34:
				_localctx = new MaxContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(336);
				match(T__34);
				setState(341);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(337);
					match(VARIABLE);
					}
					break;
				case 2:
					{
					setState(338);
					ut();
					}
					break;
				case 3:
					{
					setState(339);
					tt();
					}
					break;
				case 4:
					{
					setState(340);
					nt();
					}
					break;
				}
				setState(343);
				match(WHERE);
				setState(344);
				conditionalBody();
				setState(345);
				match(T__28);
				setState(346);
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
		enterRule(_localctx, 28, RULE_conditionalBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			clauses();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KONJ) {
				{
				{
				setState(351);
				match(KONJ);
				setState(352);
				clauses();
				}
				}
				setState(357);
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
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	 
		public ComparisonContext() { }
		public void copyFrom(ComparisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualityContext extends ComparisonContext {
		public List<EqualityParamsContext> equalityParams() {
			return getRuleContexts(EqualityParamsContext.class);
		}
		public EqualityParamsContext equalityParams(int i) {
			return getRuleContext(EqualityParamsContext.class,i);
		}
		public EqualityContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitEquality(this);
		}
	}
	public static class UnequalityContext extends ComparisonContext {
		public List<InequalityParamsContext> inequalityParams() {
			return getRuleContexts(InequalityParamsContext.class);
		}
		public InequalityParamsContext inequalityParams(int i) {
			return getRuleContext(InequalityParamsContext.class,i);
		}
		public UnequalityContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterUnequality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitUnequality(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparison);
		int _la;
		try {
			setState(366);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new EqualityContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				equalityParams();
				setState(359);
				_la = _input.LA(1);
				if ( !(_la==T__35 || _la==T__36) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(360);
				equalityParams();
				}
				break;
			case 2:
				_localctx = new UnequalityContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				inequalityParams();
				setState(363);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(364);
				inequalityParams();
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

	public static class EqualityParamsContext extends ParserRuleContext {
		public NtContext nt() {
			return getRuleContext(NtContext.class,0);
		}
		public RtContext rt() {
			return getRuleContext(RtContext.class,0);
		}
		public TpContext tp() {
			return getRuleContext(TpContext.class,0);
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
		public UtContext ut() {
			return getRuleContext(UtContext.class,0);
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
		enterRule(_localctx, 32, RULE_equalityParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(368);
				nt();
				}
				break;
			case 2:
				{
				setState(369);
				rt();
				}
				break;
			case 3:
				{
				setState(370);
				tp();
				}
				break;
			case 4:
				{
				setState(371);
				tt();
				}
				break;
			case 5:
				{
				setState(372);
				ti();
				}
				break;
			case 6:
				{
				setState(373);
				wt();
				}
				break;
			case 7:
				{
				setState(374);
				ut();
				}
				break;
			case 8:
				{
				setState(375);
				match(T__0);
				setState(376);
				arithmetic();
				setState(377);
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

	public static class InequalityParamsContext extends ParserRuleContext {
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
		public InequalityParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inequalityParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterInequalityParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitInequalityParams(this);
		}
	}

	public final InequalityParamsContext inequalityParams() throws RecognitionException {
		InequalityParamsContext _localctx = new InequalityParamsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inequalityParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(381);
				taut();
				}
				break;
			case 2:
				{
				setState(382);
				nt();
				}
				break;
			case 3:
				{
				setState(383);
				rt();
				}
				break;
			case 4:
				{
				setState(384);
				match(T__0);
				setState(385);
				arithmetic();
				setState(386);
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
		public NtContext nt() {
			return getRuleContext(NtContext.class,0);
		}
		public TautContext taut() {
			return getRuleContext(TautContext.class,0);
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
		enterRule(_localctx, 36, RULE_arithmetic);
		int _la;
		try {
			setState(404);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				nt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				taut();
				setState(392);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(393);
				nt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				taut();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(396);
				match(T__0);
				setState(397);
				arithmetic();
				setState(398);
				match(T__2);
				setState(399);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(400);
				match(T__0);
				setState(401);
				arithmetic();
				setState(402);
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

	public static class EventContext extends ParserRuleContext {
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitEvent(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_event);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0)) ) {
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

	public static class UnknownEventContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(Inter_InstanceParser.CONSTANT, 0); }
		public UnknownEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknownEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterUnknownEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitUnknownEvent(this);
		}
	}

	public final UnknownEventContext unknownEvent() throws RecognitionException {
		UnknownEventContext _localctx = new UnknownEventContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unknownEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(CONSTANT);
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
		enterRule(_localctx, 42, RULE_ut);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
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
		public TerminalNode ROLE() { return getToken(Inter_InstanceParser.ROLE, 0); }
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
		enterRule(_localctx, 44, RULE_rt);
		try {
			setState(420);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				match(CONSTANT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				match(VARIABLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				ut();
				setState(415);
				match(ROLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(417);
				tt();
				setState(418);
				match(ROLE);
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
		enterRule(_localctx, 46, RULE_tt);
		try {
			setState(425);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				intra();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				inter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
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
		enterRule(_localctx, 48, RULE_intra);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
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
		enterRule(_localctx, 50, RULE_inter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(430);
			match(T__57);
			setState(431);
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
		enterRule(_localctx, 52, RULE_interp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(434);
			match(T__57);
			setState(435);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(436);
			match(T__57);
			setState(437);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
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
		enterRule(_localctx, 54, RULE_nt);
		try {
			setState(442);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(NUMBER);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				match(VARIABLE);
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				variable();
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

	public static class TpContext extends ParserRuleContext {
		public TpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tp; }
	 
		public TpContext() { }
		public void copyFrom(TpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimeContext extends TpContext {
		public List<TerminalNode> NUMBER() { return getTokens(Inter_InstanceParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(Inter_InstanceParser.NUMBER, i);
		}
		public TimeContext(TpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitTime(this);
		}
	}
	public static class DateTimeContext extends TpContext {
		public List<TerminalNode> NUMBER() { return getTokens(Inter_InstanceParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(Inter_InstanceParser.NUMBER, i);
		}
		public DateTimeContext(TpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterDateTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitDateTime(this);
		}
	}
	public static class DateContext extends TpContext {
		public List<TerminalNode> NUMBER() { return getTokens(Inter_InstanceParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(Inter_InstanceParser.NUMBER, i);
		}
		public DateContext(TpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitDate(this);
		}
	}

	public final TpContext tp() throws RecognitionException {
		TpContext _localctx = new TpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tp);
		int _la;
		try {
			setState(485);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new DateTimeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(NUMBER);
				setState(445);
				match(T__44);
				setState(446);
				match(NUMBER);
				setState(447);
				match(T__44);
				setState(448);
				match(NUMBER);
				setState(449);
				match(T__58);
				setState(450);
				match(NUMBER);
				setState(461);
				_la = _input.LA(1);
				if (_la==T__59) {
					{
					setState(451);
					match(T__59);
					setState(452);
					match(NUMBER);
					setState(459);
					_la = _input.LA(1);
					if (_la==T__59) {
						{
						setState(453);
						match(T__59);
						setState(454);
						match(NUMBER);
						setState(457);
						_la = _input.LA(1);
						if (_la==T__60) {
							{
							setState(455);
							match(T__60);
							setState(456);
							match(NUMBER);
							}
						}

						}
					}

					}
				}

				}
				break;
			case 2:
				_localctx = new DateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(NUMBER);
				setState(470);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(464);
					match(T__44);
					setState(465);
					match(NUMBER);
					setState(468);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(466);
						match(T__44);
						setState(467);
						match(NUMBER);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new TimeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				match(NUMBER);
				setState(483);
				_la = _input.LA(1);
				if (_la==T__59) {
					{
					setState(473);
					match(T__59);
					setState(474);
					match(NUMBER);
					setState(481);
					_la = _input.LA(1);
					if (_la==T__59) {
						{
						setState(475);
						match(T__59);
						setState(476);
						match(NUMBER);
						setState(479);
						_la = _input.LA(1);
						if (_la==T__60) {
							{
							setState(477);
							match(T__60);
							setState(478);
							match(NUMBER);
							}
						}

						}
					}

					}
				}

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

	public static class TsContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(Inter_InstanceParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(Inter_InstanceParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(Inter_InstanceParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(Inter_InstanceParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(Inter_InstanceParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(Inter_InstanceParser.SECOND, 0); }
		public TsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterTs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitTs(this);
		}
	}

	public final TsContext ts() throws RecognitionException {
		TsContext _localctx = new TsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(T__61);
			setState(489);
			_la = _input.LA(1);
			if (_la==YEAR) {
				{
				setState(488);
				match(YEAR);
				}
			}

			setState(492);
			_la = _input.LA(1);
			if (_la==MONTH) {
				{
				setState(491);
				match(MONTH);
				}
			}

			setState(495);
			_la = _input.LA(1);
			if (_la==DAY) {
				{
				setState(494);
				match(DAY);
				}
			}

			setState(498);
			_la = _input.LA(1);
			if (_la==HOUR) {
				{
				setState(497);
				match(HOUR);
				}
			}

			setState(501);
			_la = _input.LA(1);
			if (_la==MINUTE) {
				{
				setState(500);
				match(MINUTE);
				}
			}

			setState(504);
			_la = _input.LA(1);
			if (_la==SECOND) {
				{
				setState(503);
				match(SECOND);
				}
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

	public static class TiContext extends ParserRuleContext {
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public TerminalNode TASKINSTANCE() { return getToken(Inter_InstanceParser.TASKINSTANCE, 0); }
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
		enterRule(_localctx, 60, RULE_ti);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			tt();
			setState(507);
			match(TASKINSTANCE);
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
		enterRule(_localctx, 62, RULE_wt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(T__62);
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
		public TpContext tp() {
			return getRuleContext(TpContext.class,0);
		}
		public TsContext ts() {
			return getRuleContext(TsContext.class,0);
		}
		public List<TtContext> tt() {
			return getRuleContexts(TtContext.class);
		}
		public TtContext tt(int i) {
			return getRuleContext(TtContext.class,i);
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
		enterRule(_localctx, 64, RULE_taut);
		try {
			setState(524);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(VARIABLE);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				tp();
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 3);
				{
				setState(513);
				ts();
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 4);
				{
				setState(514);
				match(T__63);
				setState(515);
				tt();
				setState(516);
				match(T__2);
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 5);
				{
				setState(518);
				match(T__64);
				setState(519);
				tt();
				setState(520);
				match(T__1);
				setState(521);
				tt();
				setState(522);
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

	public static class VariableContext extends ParserRuleContext {
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(Inter_InstanceParser.CONSTANT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(T__65);
			setState(527);
			tt();
			setState(528);
			match(T__24);
			setState(529);
			match(CONSTANT);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3]\u0216\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\7\2N\n\2\f\2\16\2Q\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3[\n\3\f\3\16\3^\13\3\3\3\3\3\3\4"+
		"\3\4\5\4d\n\4\3\5\3\5\3\5\5\5i\n\5\3\5\3\5\3\5\5\5n\n\5\7\5p\n\5\f\5\16"+
		"\5s\13\5\3\6\5\6v\n\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u0080\n\7\f"+
		"\7\16\7\u0083\13\7\3\b\3\b\3\b\3\b\3\b\7\b\u008a\n\b\f\b\16\b\u008d\13"+
		"\b\3\b\3\b\5\b\u0091\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u0098\n\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a8\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00cb"+
		"\n\f\3\r\5\r\u00ce\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e3\n\r\3\16\5\16\u00e6\n\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0103"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0111\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u011d"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0128\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0134\n\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0140\n\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u014c\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0158\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u015f\n\17\3\20\3\20\3\20\7\20\u0164\n\20\f\20\16\20\u0167\13\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0171\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u017e\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0187\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0197\n\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01a7\n\30\3\31"+
		"\3\31\3\31\5\31\u01ac\n\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\5\35\u01bd\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01cc\n\36\5\36\u01ce\n"+
		"\36\5\36\u01d0\n\36\3\36\3\36\3\36\3\36\3\36\5\36\u01d7\n\36\5\36\u01d9"+
		"\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01e2\n\36\5\36\u01e4\n"+
		"\36\5\36\u01e6\n\36\5\36\u01e8\n\36\3\37\3\37\5\37\u01ec\n\37\3\37\5\37"+
		"\u01ef\n\37\3\37\5\37\u01f2\n\37\3\37\5\37\u01f5\n\37\3\37\5\37\u01f8"+
		"\n\37\3\37\5\37\u01fb\n\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u020f\n\"\3#\3#\3#\3#\3#\3#\2\2$\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\b\4\2\4"+
		"\4JJ\3\2&\'\3\2(+\3\2,/\3\2\60;\3\2XY\u0259\2I\3\2\2\2\4T\3\2\2\2\6c\3"+
		"\2\2\2\be\3\2\2\2\nu\3\2\2\2\f|\3\2\2\2\16\u0090\3\2\2\2\20\u0097\3\2"+
		"\2\2\22\u0099\3\2\2\2\24\u00a7\3\2\2\2\26\u00ca\3\2\2\2\30\u00e2\3\2\2"+
		"\2\32\u0110\3\2\2\2\34\u015e\3\2\2\2\36\u0160\3\2\2\2 \u0170\3\2\2\2\""+
		"\u017d\3\2\2\2$\u0186\3\2\2\2&\u0196\3\2\2\2(\u0198\3\2\2\2*\u019a\3\2"+
		"\2\2,\u019c\3\2\2\2.\u01a6\3\2\2\2\60\u01ab\3\2\2\2\62\u01ad\3\2\2\2\64"+
		"\u01af\3\2\2\2\66\u01b3\3\2\2\28\u01bc\3\2\2\2:\u01e7\3\2\2\2<\u01e9\3"+
		"\2\2\2>\u01fc\3\2\2\2@\u01ff\3\2\2\2B\u020e\3\2\2\2D\u0210\3\2\2\2FH\5"+
		"\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JO\3\2\2\2KI\3\2\2\2LN\5"+
		"\6\4\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7"+
		"\2\2\3S\3\3\2\2\2TU\7L\2\2UV\7Z\2\2VW\7\3\2\2W\\\7N\2\2XY\t\2\2\2Y[\7"+
		"N\2\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_"+
		"`\7\5\2\2`\5\3\2\2\2ad\5\b\5\2bd\5\n\6\2ca\3\2\2\2cb\3\2\2\2d\7\3\2\2"+
		"\2eh\7G\2\2fi\5\24\13\2gi\5\26\f\2hf\3\2\2\2hg\3\2\2\2iq\3\2\2\2jm\t\2"+
		"\2\2kn\5\24\13\2ln\5\26\f\2mk\3\2\2\2ml\3\2\2\2np\3\2\2\2oj\3\2\2\2ps"+
		"\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\t\3\2\2\2sq\3\2\2\2tv\7M\2\2ut\3\2\2\2u"+
		"v\3\2\2\2vw\3\2\2\2wx\7H\2\2xy\5\f\7\2yz\7I\2\2z{\5\22\n\2{\13\3\2\2\2"+
		"|\u0081\5\16\b\2}~\7J\2\2~\u0080\5\16\b\2\177}\3\2\2\2\u0080\u0083\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\r\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0084\u0091\5\20\t\2\u0085\u0086\7\3\2\2\u0086\u008b\5\20\t\2"+
		"\u0087\u0088\7K\2\2\u0088\u008a\5\20\t\2\u0089\u0087\3\2\2\2\u008a\u008d"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u008f\7\5\2\2\u008f\u0091\3\2\2\2\u0090\u0084\3\2"+
		"\2\2\u0090\u0085\3\2\2\2\u0091\17\3\2\2\2\u0092\u0098\5\26\f\2\u0093\u0098"+
		"\5\32\16\2\u0094\u0098\5 \21\2\u0095\u0098\5\34\17\2\u0096\u0098\5\24"+
		"\13\2\u0097\u0092\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\21\3\2\2\2\u0099\u009a\5\30\r"+
		"\2\u009a\23\3\2\2\2\u009b\u009c\5,\27\2\u009c\u009d\7\6\2\2\u009d\u009e"+
		"\5,\27\2\u009e\u00a8\3\2\2\2\u009f\u00a0\5,\27\2\u00a0\u00a1\7\7\2\2\u00a1"+
		"\u00a2\5,\27\2\u00a2\u00a8\3\2\2\2\u00a3\u00a4\5,\27\2\u00a4\u00a5\7\b"+
		"\2\2\u00a5\u00a6\5,\27\2\u00a6\u00a8\3\2\2\2\u00a7\u009b\3\2\2\2\u00a7"+
		"\u009f\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8\25\3\2\2\2\u00a9\u00aa\7\t\2"+
		"\2\u00aa\u00ab\5.\30\2\u00ab\u00ac\7\n\2\2\u00ac\u00ad\5\60\31\2\u00ad"+
		"\u00cb\3\2\2\2\u00ae\u00af\7\13\2\2\u00af\u00b0\5,\27\2\u00b0\u00b1\7"+
		"\n\2\2\u00b1\u00b2\5\60\31\2\u00b2\u00cb\3\2\2\2\u00b3\u00b4\7\13\2\2"+
		"\u00b4\u00b5\5,\27\2\u00b5\u00b6\7\f\2\2\u00b6\u00b7\5.\30\2\u00b7\u00cb"+
		"\3\2\2\2\u00b8\u00b9\5.\30\2\u00b9\u00ba\7\r\2\2\u00ba\u00bb\5\60\31\2"+
		"\u00bb\u00cb\3\2\2\2\u00bc\u00bd\5.\30\2\u00bd\u00be\7\16\2\2\u00be\u00bf"+
		"\5\60\31\2\u00bf\u00cb\3\2\2\2\u00c0\u00c1\5.\30\2\u00c1\u00c2\7\17\2"+
		"\2\u00c2\u00c3\5.\30\2\u00c3\u00cb\3\2\2\2\u00c4\u00c5\7\20\2\2\u00c5"+
		"\u00c6\5\60\31\2\u00c6\u00c7\7\4\2\2\u00c7\u00c8\5\60\31\2\u00c8\u00c9"+
		"\7\5\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00a9\3\2\2\2\u00ca\u00ae\3\2\2\2\u00ca"+
		"\u00b3\3\2\2\2\u00ca\u00b8\3\2\2\2\u00ca\u00bc\3\2\2\2\u00ca\u00c0\3\2"+
		"\2\2\u00ca\u00c4\3\2\2\2\u00cb\27\3\2\2\2\u00cc\u00ce\7\13\2\2\u00cd\u00cc"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\5,\27\2\u00d0"+
		"\u00d1\7\21\2\2\u00d1\u00d2\5\60\31\2\u00d2\u00e3\3\2\2\2\u00d3\u00d4"+
		"\7\t\2\2\u00d4\u00d5\5.\30\2\u00d5\u00d6\7\21\2\2\u00d6\u00d7\5\60\31"+
		"\2\u00d7\u00e3\3\2\2\2\u00d8\u00d9\5,\27\2\u00d9\u00da\7\22\2\2\u00da"+
		"\u00db\5\60\31\2\u00db\u00e3\3\2\2\2\u00dc\u00dd\7\23\2\2\u00dd\u00de"+
		"\5.\30\2\u00de\u00df\7\22\2\2\u00df\u00e0\5\60\31\2\u00e0\u00e3\3\2\2"+
		"\2\u00e1\u00e3\7\24\2\2\u00e2\u00cd\3\2\2\2\u00e2\u00d3\3\2\2\2\u00e2"+
		"\u00d8\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\31\3\2\2"+
		"\2\u00e4\u00e6\7\13\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\5,\27\2\u00e8\u00e9\7\25\2\2\u00e9\u00ea\5"+
		"\60\31\2\u00ea\u0111\3\2\2\2\u00eb\u00ec\7\t\2\2\u00ec\u00ed\5.\30\2\u00ed"+
		"\u00ee\7\25\2\2\u00ee\u00ef\5\60\31\2\u00ef\u0111\3\2\2\2\u00f0\u00f1"+
		"\5,\27\2\u00f1\u00f2\7\26\2\2\u00f2\u00f3\5\60\31\2\u00f3\u0111\3\2\2"+
		"\2\u00f4\u00f5\5\60\31\2\u00f5\u00f6\7\27\2\2\u00f6\u0111\3\2\2\2\u00f7"+
		"\u00f8\5\60\31\2\u00f8\u00f9\7\30\2\2\u00f9\u0111\3\2\2\2\u00fa\u00fb"+
		"\5\60\31\2\u00fb\u00fc\7\31\2\2\u00fc\u0111\3\2\2\2\u00fd\u00fe\7\32\2"+
		"\2\u00fe\u00ff\5\60\31\2\u00ff\u0102\7\33\2\2\u0100\u0103\5(\25\2\u0101"+
		"\u0103\5*\26\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\u0111\3\2"+
		"\2\2\u0104\u0105\5,\27\2\u0105\u0106\7\34\2\2\u0106\u0107\5,\27\2\u0107"+
		"\u0111\3\2\2\2\u0108\u0109\5,\27\2\u0109\u010a\7\34\2\2\u010a\u010b\5"+
		",\27\2\u010b\u010c\7\35\2\2\u010c\u010d\5\60\31\2\u010d\u010e\7\4\2\2"+
		"\u010e\u010f\5\60\31\2\u010f\u0111\3\2\2\2\u0110\u00e5\3\2\2\2\u0110\u00eb"+
		"\3\2\2\2\u0110\u00f0\3\2\2\2\u0110\u00f4\3\2\2\2\u0110\u00f7\3\2\2\2\u0110"+
		"\u00fa\3\2\2\2\u0110\u00fd\3\2\2\2\u0110\u0104\3\2\2\2\u0110\u0108\3\2"+
		"\2\2\u0111\33\3\2\2\2\u0112\u0113\7\36\2\2\u0113\u0114\7O\2\2\u0114\u0115"+
		"\5\36\20\2\u0115\u0116\7\37\2\2\u0116\u0117\58\35\2\u0117\u015f\3\2\2"+
		"\2\u0118\u011c\7 \2\2\u0119\u011d\7Y\2\2\u011a\u011d\5,\27\2\u011b\u011d"+
		"\5\60\31\2\u011c\u0119\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2"+
		"\u011d\u011e\3\2\2\2\u011e\u011f\7O\2\2\u011f\u0120\5\36\20\2\u0120\u0121"+
		"\7\37\2\2\u0121\u0122\58\35\2\u0122\u015f\3\2\2\2\u0123\u0127\7!\2\2\u0124"+
		"\u0128\7Y\2\2\u0125\u0128\5,\27\2\u0126\u0128\5\60\31\2\u0127\u0124\3"+
		"\2\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012a\7O\2\2\u012a\u012b\5\36\20\2\u012b\u012c\7\37\2\2\u012c\u012d\5"+
		"8\35\2\u012d\u015f\3\2\2\2\u012e\u0133\7\"\2\2\u012f\u0134\7Y\2\2\u0130"+
		"\u0134\5,\27\2\u0131\u0134\5\60\31\2\u0132\u0134\58\35\2\u0133\u012f\3"+
		"\2\2\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0136\7O\2\2\u0136\u0137\5\36\20\2\u0137\u0138\7"+
		"\37\2\2\u0138\u0139\58\35\2\u0139\u015f\3\2\2\2\u013a\u013f\7#\2\2\u013b"+
		"\u0140\7Y\2\2\u013c\u0140\5,\27\2\u013d\u0140\5\60\31\2\u013e\u0140\5"+
		"8\35\2\u013f\u013b\3\2\2\2\u013f\u013c\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\7O\2\2\u0142\u0143\5\36"+
		"\20\2\u0143\u0144\7\37\2\2\u0144\u0145\58\35\2\u0145\u015f\3\2\2\2\u0146"+
		"\u014b\7$\2\2\u0147\u014c\7Y\2\2\u0148\u014c\5,\27\2\u0149\u014c\5\60"+
		"\31\2\u014a\u014c\58\35\2\u014b\u0147\3\2\2\2\u014b\u0148\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\7O"+
		"\2\2\u014e\u014f\5\36\20\2\u014f\u0150\7\37\2\2\u0150\u0151\58\35\2\u0151"+
		"\u015f\3\2\2\2\u0152\u0157\7%\2\2\u0153\u0158\7Y\2\2\u0154\u0158\5,\27"+
		"\2\u0155\u0158\5\60\31\2\u0156\u0158\58\35\2\u0157\u0153\3\2\2\2\u0157"+
		"\u0154\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015a\7O\2\2\u015a\u015b\5\36\20\2\u015b\u015c\7\37\2\2\u015c"+
		"\u015d\58\35\2\u015d\u015f\3\2\2\2\u015e\u0112\3\2\2\2\u015e\u0118\3\2"+
		"\2\2\u015e\u0123\3\2\2\2\u015e\u012e\3\2\2\2\u015e\u013a\3\2\2\2\u015e"+
		"\u0146\3\2\2\2\u015e\u0152\3\2\2\2\u015f\35\3\2\2\2\u0160\u0165\5\16\b"+
		"\2\u0161\u0162\7J\2\2\u0162\u0164\5\16\b\2\u0163\u0161\3\2\2\2\u0164\u0167"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\37\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u0169\5\"\22\2\u0169\u016a\t\3\2\2\u016a\u016b\5"+
		"\"\22\2\u016b\u0171\3\2\2\2\u016c\u016d\5$\23\2\u016d\u016e\t\4\2\2\u016e"+
		"\u016f\5$\23\2\u016f\u0171\3\2\2\2\u0170\u0168\3\2\2\2\u0170\u016c\3\2"+
		"\2\2\u0171!\3\2\2\2\u0172\u017e\58\35\2\u0173\u017e\5.\30\2\u0174\u017e"+
		"\5:\36\2\u0175\u017e\5\60\31\2\u0176\u017e\5> \2\u0177\u017e\5@!\2\u0178"+
		"\u017e\5,\27\2\u0179\u017a\7\3\2\2\u017a\u017b\5&\24\2\u017b\u017c\7\5"+
		"\2\2\u017c\u017e\3\2\2\2\u017d\u0172\3\2\2\2\u017d\u0173\3\2\2\2\u017d"+
		"\u0174\3\2\2\2\u017d\u0175\3\2\2\2\u017d\u0176\3\2\2\2\u017d\u0177\3\2"+
		"\2\2\u017d\u0178\3\2\2\2\u017d\u0179\3\2\2\2\u017e#\3\2\2\2\u017f\u0187"+
		"\5B\"\2\u0180\u0187\58\35\2\u0181\u0187\5.\30\2\u0182\u0183\7\3\2\2\u0183"+
		"\u0184\5&\24\2\u0184\u0185\7\5\2\2\u0185\u0187\3\2\2\2\u0186\u017f\3\2"+
		"\2\2\u0186\u0180\3\2\2\2\u0186\u0181\3\2\2\2\u0186\u0182\3\2\2\2\u0187"+
		"%\3\2\2\2\u0188\u0197\58\35\2\u0189\u018a\5B\"\2\u018a\u018b\t\5\2\2\u018b"+
		"\u018c\58\35\2\u018c\u0197\3\2\2\2\u018d\u0197\5B\"\2\u018e\u018f\7\3"+
		"\2\2\u018f\u0190\5&\24\2\u0190\u0191\7\5\2\2\u0191\u0192\t\5\2\2\u0192"+
		"\u0193\7\3\2\2\u0193\u0194\5&\24\2\u0194\u0195\7\5\2\2\u0195\u0197\3\2"+
		"\2\2\u0196\u0188\3\2\2\2\u0196\u0189\3\2\2\2\u0196\u018d\3\2\2\2\u0196"+
		"\u018e\3\2\2\2\u0197\'\3\2\2\2\u0198\u0199\t\6\2\2\u0199)\3\2\2\2\u019a"+
		"\u019b\7X\2\2\u019b+\3\2\2\2\u019c\u019d\t\7\2\2\u019d-\3\2\2\2\u019e"+
		"\u01a7\7X\2\2\u019f\u01a7\7Y\2\2\u01a0\u01a1\5,\27\2\u01a1\u01a2\7P\2"+
		"\2\u01a2\u01a7\3\2\2\2\u01a3\u01a4\5\60\31\2\u01a4\u01a5\7P\2\2\u01a5"+
		"\u01a7\3\2\2\2\u01a6\u019e\3\2\2\2\u01a6\u019f\3\2\2\2\u01a6\u01a0\3\2"+
		"\2\2\u01a6\u01a3\3\2\2\2\u01a7/\3\2\2\2\u01a8\u01ac\5\62\32\2\u01a9\u01ac"+
		"\5\64\33\2\u01aa\u01ac\5\66\34\2\u01ab\u01a8\3\2\2\2\u01ab\u01a9\3\2\2"+
		"\2\u01ab\u01aa\3\2\2\2\u01ac\61\3\2\2\2\u01ad\u01ae\t\7\2\2\u01ae\63\3"+
		"\2\2\2\u01af\u01b0\t\7\2\2\u01b0\u01b1\7<\2\2\u01b1\u01b2\t\7\2\2\u01b2"+
		"\65\3\2\2\2\u01b3\u01b4\t\7\2\2\u01b4\u01b5\7<\2\2\u01b5\u01b6\t\7\2\2"+
		"\u01b6\u01b7\7<\2\2\u01b7\u01b8\t\7\2\2\u01b8\67\3\2\2\2\u01b9\u01bd\7"+
		"[\2\2\u01ba\u01bd\7Y\2\2\u01bb\u01bd\5D#\2\u01bc\u01b9\3\2\2\2\u01bc\u01ba"+
		"\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bd9\3\2\2\2\u01be\u01bf\7[\2\2\u01bf\u01c0"+
		"\7/\2\2\u01c0\u01c1\7[\2\2\u01c1\u01c2\7/\2\2\u01c2\u01c3\7[\2\2\u01c3"+
		"\u01c4\7=\2\2\u01c4\u01cf\7[\2\2\u01c5\u01c6\7>\2\2\u01c6\u01cd\7[\2\2"+
		"\u01c7\u01c8\7>\2\2\u01c8\u01cb\7[\2\2\u01c9\u01ca\7?\2\2\u01ca\u01cc"+
		"\7[\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd"+
		"\u01c7\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01c5\3\2"+
		"\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01e8\3\2\2\2\u01d1\u01d8\7[\2\2\u01d2"+
		"\u01d3\7/\2\2\u01d3\u01d6\7[\2\2\u01d4\u01d5\7/\2\2\u01d5\u01d7\7[\2\2"+
		"\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d2"+
		"\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01e8\3\2\2\2\u01da\u01e5\7[\2\2\u01db"+
		"\u01dc\7>\2\2\u01dc\u01e3\7[\2\2\u01dd\u01de\7>\2\2\u01de\u01e1\7[\2\2"+
		"\u01df\u01e0\7?\2\2\u01e0\u01e2\7[\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2"+
		"\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01dd\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e6\3\2\2\2\u01e5\u01db\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2"+
		"\2\2\u01e7\u01be\3\2\2\2\u01e7\u01d1\3\2\2\2\u01e7\u01da\3\2\2\2\u01e8"+
		";\3\2\2\2\u01e9\u01eb\7@\2\2\u01ea\u01ec\7R\2\2\u01eb\u01ea\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01ef\7S\2\2\u01ee\u01ed\3\2"+
		"\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01f2\7T\2\2\u01f1"+
		"\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f5\7U"+
		"\2\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6"+
		"\u01f8\7V\2\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2"+
		"\2\2\u01f9\u01fb\7W\2\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"=\3\2\2\2\u01fc\u01fd\5\60\31\2\u01fd\u01fe\7Q\2\2\u01fe?\3\2\2\2\u01ff"+
		"\u0200\7A\2\2\u0200A\3\2\2\2\u0201\u020f\7Y\2\2\u0202\u020f\5:\36\2\u0203"+
		"\u020f\5<\37\2\u0204\u0205\7B\2\2\u0205\u0206\5\60\31\2\u0206\u0207\7"+
		"\5\2\2\u0207\u020f\3\2\2\2\u0208\u0209\7C\2\2\u0209\u020a\5\60\31\2\u020a"+
		"\u020b\7\4\2\2\u020b\u020c\5\60\31\2\u020c\u020d\7\5\2\2\u020d\u020f\3"+
		"\2\2\2\u020e\u0201\3\2\2\2\u020e\u0202\3\2\2\2\u020e\u0203\3\2\2\2\u020e"+
		"\u0204\3\2\2\2\u020e\u0208\3\2\2\2\u020fC\3\2\2\2\u0210\u0211\7D\2\2\u0211"+
		"\u0212\5\60\31\2\u0212\u0213\7\33\2\2\u0213\u0214\7X\2\2\u0214E\3\2\2"+
		"\2\64IO\\chmqu\u0081\u008b\u0090\u0097\u00a7\u00ca\u00cd\u00e2\u00e5\u0102"+
		"\u0110\u011c\u0127\u0133\u013f\u014b\u0157\u015e\u0165\u0170\u017d\u0186"+
		"\u0196\u01a6\u01ab\u01bc\u01cb\u01cd\u01cf\u01d6\u01d8\u01e1\u01e3\u01e5"+
		"\u01e7\u01eb\u01ee\u01f1\u01f4\u01f7\u01fa\u020e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}