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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, MULTILINE_COMMENTS=52, 
		SINGLE_LINE_COMMENTS=53, SET=54, IF=55, THEN=56, KONJ=57, DISJ=58, DEF=59, 
		DESC=60, ARGS=61, WHERE=62, ROLE=63, TASKINSTANCE=64, WORKFLOWINSTANCE=65, 
		WORKFLOW=66, EQUAL=67, NOTEQUAL=68, LOWER=69, LEQ=70, GREATER=71, GEQ=72, 
		MUL=73, DIV=74, ADD=75, SUB=76, YEARS=77, MONTHS=78, DAYS=79, HOURS=80, 
		MINUTES=81, SECONDS=82, DATETIME=83, DATE=84, TIME=85, CONSTANT=86, VARIABLE=87, 
		CLAUSE=88, NUMBER=89, STRING=90, WS=91;
	public static final int
		RULE_file = 0, RULE_define = 1, RULE_explicitSetting = 2, RULE_assignment = 3, 
		RULE_assignmentBody = 4, RULE_clauses = 5, RULE_atoms = 6, RULE_assignmentHead = 7, 
		RULE_extern = 8, RULE_specification = 9, RULE_enforcement = 10, RULE_status = 11, 
		RULE_conditional = 12, RULE_conditionalBody = 13, RULE_comparison = 14, 
		RULE_equalityExpr = 15, RULE_inequalityExpr = 16, RULE_event = 17, RULE_unknownEvent = 18, 
		RULE_ut = 19, RULE_rt = 20, RULE_tt = 21, RULE_intra = 22, RULE_inter = 23, 
		RULE_interp = 24, RULE_nt = 25, RULE_tp = 26, RULE_ts = 27, RULE_wt = 28, 
		RULE_wi = 29, RULE_vt = 30, RULE_equality = 31, RULE_inequality = 32, 
		RULE_arithmetic = 33;
	public static final String[] ruleNames = {
		"file", "define", "explicitSetting", "assignment", "assignmentBody", "clauses", 
		"atoms", "assignmentHead", "extern", "specification", "enforcement", "status", 
		"conditional", "conditionalBody", "comparison", "equalityExpr", "inequalityExpr", 
		"event", "unknownEvent", "ut", "rt", "tt", "intra", "inter", "interp", 
		"nt", "tp", "ts", "wt", "wi", "vt", "equality", "inequality", "arithmetic"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "','", "')'", "'is related to'", "'is partner of'", "'is in same group as'", 
		"'role'", "'can execute'", "'user'", "'belongs to role'", "'is glb of'", 
		"'is lub'", "'dominates'", "'critical_task_pair('", "'cannot execute'", 
		"'must execute'", "'mrole'", "'panic'", "'executed'", "'is assigned to'", 
		"'aborted'", "'succeeded'", "'started'", "'EventType('", "').'", "'is collaborator of'", 
		"'in tasks'", "'NUMBER'", "'IS'", "'NUMBER OF'", "'NUMBER OF DIFF'", "'SUM OF'", 
		"'AVG OF'", "'MIN OF'", "'MAX OF'", "'assign'", "'ate_abort'", "'autoskip'", 
		"'complete'", "'manual_skip'", "'pi_abort'", "'reassign'", "'resume'", 
		"'schedule'", "'start'", "'suspend'", "'withdraw'", "'.'", "'timestamp('", 
		"'timeinterval('", "'Var('", null, null, null, null, "'THEN'", null, null, 
		null, null, null, "'WHERE'", "'.Role'", "'.InstanceID'", null, "'.Workflow'", 
		"'='", "'!='", "'<'", "'<='", "'>'", "'>='", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "MULTILINE_COMMENTS", "SINGLE_LINE_COMMENTS", 
		"SET", "IF", "THEN", "KONJ", "DISJ", "DEF", "DESC", "ARGS", "WHERE", "ROLE", 
		"TASKINSTANCE", "WORKFLOWINSTANCE", "WORKFLOW", "EQUAL", "NOTEQUAL", "LOWER", 
		"LEQ", "GREATER", "GEQ", "MUL", "DIV", "ADD", "SUB", "YEARS", "MONTHS", 
		"DAYS", "HOURS", "MINUTES", "SECONDS", "DATETIME", "DATE", "TIME", "CONSTANT", 
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


		public void checkDate(String sdate) { // TODO kann man solche Funktionen auch in ein extra file verschieben?
			String[] tmpArr = sdate.split("[-T:]"); // TODO gibt es eine praktische Konvention, wie man einen DateString testet?
			if (tmpArr[0] != null) {}
			if (tmpArr[1] != null) {
				if (Integer.parseInt(tmpArr[1]) < 1 || Integer.parseInt(tmpArr[1])>12) {
					System.out.println("Month must be a value between 1 and 12");
				}
			}
			if (tmpArr[2] != null) {}
			if (tmpArr[3] != null) {}
			if (tmpArr[4] != null) {}
			if (tmpArr[5] != null) {}
		}

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
		public List<ExplicitSettingContext> explicitSetting() {
			return getRuleContexts(ExplicitSettingContext.class);
		}
		public ExplicitSettingContext explicitSetting(int i) {
			return getRuleContext(ExplicitSettingContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
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
			while (_la==SET) {
				{
				{
				setState(74);
				explicitSetting();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF || _la==DESC) {
				{
				{
				setState(80);
				assignment();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
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
			setState(88);
			match(DEF);
			setState(89);
			match(CLAUSE);
			setState(90);
			match(T__0);
			setState(91);
			match(ARGS);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==KONJ) {
				{
				{
				setState(92);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==KONJ) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(93);
				match(ARGS);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
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
		enterRule(_localctx, 4, RULE_explicitSetting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(SET);
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(102);
				extern();
				}
				break;
			case 2:
				{
				setState(103);
				specification();
				}
				break;
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==KONJ) {
				{
				{
				setState(106);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==KONJ) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(109);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(107);
					extern();
					}
					break;
				case 2:
					{
					setState(108);
					specification();
					}
					break;
				}
				}
				}
				setState(115);
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
		enterRule(_localctx, 6, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if (_la==DESC) {
				{
				setState(116);
				match(DESC);
				}
			}

			setState(119);
			match(IF);
			setState(120);
			assignmentBody();
			setState(121);
			match(THEN);
			setState(122);
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
		enterRule(_localctx, 8, RULE_assignmentBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			clauses();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KONJ) {
				{
				{
				setState(125);
				match(KONJ);
				setState(126);
				clauses();
				}
				}
				setState(131);
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
		enterRule(_localctx, 10, RULE_clauses);
		int _la;
		try {
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				atoms();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(T__0);
				setState(134);
				atoms();
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DISJ) {
					{
					{
					setState(135);
					match(DISJ);
					setState(136);
					atoms();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
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
		enterRule(_localctx, 12, RULE_atoms);
		try {
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				specification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				status();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				comparison();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
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
			setState(153);
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
		enterRule(_localctx, 16, RULE_extern);
		try {
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new RelatedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				ut();
				setState(156);
				match(T__3);
				setState(157);
				ut();
				}
				break;
			case 2:
				_localctx = new PartnerofContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				ut();
				setState(160);
				match(T__4);
				setState(161);
				ut();
				}
				break;
			case 3:
				_localctx = new SamegroupContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				ut();
				setState(164);
				match(T__5);
				setState(165);
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
		enterRule(_localctx, 18, RULE_specification);
		try {
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new RoleTaskContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(T__6);
				setState(170);
				rt();
				setState(171);
				match(T__7);
				setState(172);
				tt();
				}
				break;
			case 2:
				_localctx = new UserTaskContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(T__8);
				setState(175);
				ut();
				setState(176);
				match(T__7);
				setState(177);
				tt();
				}
				break;
			case 3:
				_localctx = new UserRoleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(T__8);
				setState(180);
				ut();
				setState(181);
				match(T__9);
				setState(182);
				rt();
				}
				break;
			case 4:
				_localctx = new GlbContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				rt();
				setState(185);
				match(T__10);
				setState(186);
				tt();
				}
				break;
			case 5:
				_localctx = new LubContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				rt();
				setState(189);
				match(T__11);
				setState(190);
				tt();
				}
				break;
			case 6:
				_localctx = new DominateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(192);
				rt();
				setState(193);
				match(T__12);
				setState(194);
				rt();
				}
				break;
			case 7:
				_localctx = new CritTaskPairContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(196);
				match(T__13);
				setState(197);
				tt();
				setState(198);
				match(T__1);
				setState(199);
				tt();
				setState(200);
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
		public RtContext r;
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public RtContext rt() {
			return getRuleContext(RtContext.class,0);
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
		enterRule(_localctx, 20, RULE_enforcement);
		int _la;
		try {
			setState(227);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new CannotUserContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(204);
					match(T__8);
					}
				}

				setState(207);
				ut();
				setState(208);
				match(T__14);
				setState(209);
				tt();
				}
				break;
			case 2:
				_localctx = new CannotRoleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(T__6);
				setState(212);
				((CannotRoleContext)_localctx).r = rt();
				setState(213);
				match(T__14);
				setState(214);
				tt();
				System.out.println((((CannotRoleContext)_localctx).r!=null?_input.getText(((CannotRoleContext)_localctx).r.start,((CannotRoleContext)_localctx).r.stop):null));
				}
				break;
			case 3:
				_localctx = new MustUserContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				ut();
				setState(218);
				match(T__15);
				setState(219);
				tt();
				}
				break;
			case 4:
				_localctx = new MustRoleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				match(T__16);
				setState(222);
				rt();
				setState(223);
				match(T__15);
				setState(224);
				tt();
				}
				break;
			case 5:
				_localctx = new PanicContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
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
		enterRule(_localctx, 22, RULE_status);
		int _la;
		try {
			setState(273);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ExecutedUserContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(229);
					match(T__8);
					}
				}

				setState(232);
				ut();
				setState(233);
				match(T__18);
				setState(234);
				tt();
				}
				break;
			case 2:
				_localctx = new ExecutedRoleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(T__6);
				setState(237);
				rt();
				setState(238);
				match(T__18);
				setState(239);
				tt();
				}
				break;
			case 3:
				_localctx = new AssignedUserContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				ut();
				setState(242);
				match(T__19);
				setState(243);
				tt();
				}
				break;
			case 4:
				_localctx = new AbortedTaskContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				tt();
				setState(246);
				match(T__20);
				}
				break;
			case 5:
				_localctx = new SucceededTaskContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				tt();
				setState(249);
				match(T__21);
				}
				break;
			case 6:
				_localctx = new StartedTaskContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				tt();
				setState(252);
				match(T__22);
				}
				break;
			case 7:
				_localctx = new FlexibleEventContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(254);
				match(T__23);
				setState(255);
				tt();
				setState(256);
				match(T__24);
				setState(259);
				switch (_input.LA(1)) {
				case T__35:
				case T__36:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
					{
					setState(257);
					event();
					}
					break;
				case CONSTANT:
					{
					setState(258);
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
				setState(261);
				ut();
				setState(262);
				match(T__25);
				setState(263);
				ut();
				}
				break;
			case 9:
				_localctx = new CollaboratorExtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(265);
				ut();
				setState(266);
				match(T__25);
				setState(267);
				ut();
				setState(268);
				match(T__26);
				setState(269);
				tt();
				setState(270);
				match(T__1);
				setState(271);
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
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public TerminalNode WHERE() { return getToken(Inter_InstanceParser.WHERE, 0); }
		public ConditionalBodyContext conditionalBody() {
			return getRuleContext(ConditionalBodyContext.class,0);
		}
		public NtContext nt() {
			return getRuleContext(NtContext.class,0);
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
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public TerminalNode WHERE() { return getToken(Inter_InstanceParser.WHERE, 0); }
		public ConditionalBodyContext conditionalBody() {
			return getRuleContext(ConditionalBodyContext.class,0);
		}
		public NtContext nt() {
			return getRuleContext(NtContext.class,0);
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
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public TerminalNode WHERE() { return getToken(Inter_InstanceParser.WHERE, 0); }
		public ConditionalBodyContext conditionalBody() {
			return getRuleContext(ConditionalBodyContext.class,0);
		}
		public NtContext nt() {
			return getRuleContext(NtContext.class,0);
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
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public TerminalNode WHERE() { return getToken(Inter_InstanceParser.WHERE, 0); }
		public ConditionalBodyContext conditionalBody() {
			return getRuleContext(ConditionalBodyContext.class,0);
		}
		public NtContext nt() {
			return getRuleContext(NtContext.class,0);
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
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public TerminalNode WHERE() { return getToken(Inter_InstanceParser.WHERE, 0); }
		public ConditionalBodyContext conditionalBody() {
			return getRuleContext(ConditionalBodyContext.class,0);
		}
		public NtContext nt() {
			return getRuleContext(NtContext.class,0);
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
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public TerminalNode WHERE() { return getToken(Inter_InstanceParser.WHERE, 0); }
		public ConditionalBodyContext conditionalBody() {
			return getRuleContext(ConditionalBodyContext.class,0);
		}
		public NtContext nt() {
			return getRuleContext(NtContext.class,0);
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
		enterRule(_localctx, 24, RULE_conditional);
		try {
			setState(323);
			switch (_input.LA(1)) {
			case T__27:
				_localctx = new NumSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(T__27);
				setState(276);
				match(WHERE);
				setState(277);
				conditionalBody();
				setState(278);
				match(T__28);
				setState(279);
				nt();
				}
				break;
			case T__29:
				_localctx = new NumVarsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(T__29);
				setState(282);
				match(VARIABLE);
				setState(283);
				match(WHERE);
				setState(284);
				conditionalBody();
				setState(285);
				match(T__28);
				setState(286);
				nt();
				}
				break;
			case T__30:
				_localctx = new NumDiffContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				match(T__30);
				setState(289);
				match(VARIABLE);
				setState(290);
				match(WHERE);
				setState(291);
				conditionalBody();
				setState(292);
				match(T__28);
				setState(293);
				nt();
				}
				break;
			case T__31:
				_localctx = new SumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				match(T__31);
				setState(296);
				match(VARIABLE);
				setState(297);
				match(WHERE);
				setState(298);
				conditionalBody();
				setState(299);
				match(T__28);
				setState(300);
				nt();
				}
				break;
			case T__32:
				_localctx = new AvgContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				match(T__32);
				setState(303);
				match(VARIABLE);
				setState(304);
				match(WHERE);
				setState(305);
				conditionalBody();
				setState(306);
				match(T__28);
				setState(307);
				nt();
				}
				break;
			case T__33:
				_localctx = new MinContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(309);
				match(T__33);
				setState(310);
				match(VARIABLE);
				setState(311);
				match(WHERE);
				setState(312);
				conditionalBody();
				setState(313);
				match(T__28);
				setState(314);
				nt();
				}
				break;
			case T__34:
				_localctx = new MaxContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(316);
				match(T__34);
				setState(317);
				match(VARIABLE);
				setState(318);
				match(WHERE);
				setState(319);
				conditionalBody();
				setState(320);
				match(T__28);
				setState(321);
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
			setState(325);
			clauses();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KONJ) {
				{
				{
				setState(326);
				match(KONJ);
				setState(327);
				clauses();
				}
				}
				setState(332);
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
		public EqualityExprContext equalityExpr() {
			return getRuleContext(EqualityExprContext.class,0);
		}
		public InequalityExprContext inequalityExpr() {
			return getRuleContext(InequalityExprContext.class,0);
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
		try {
			setState(335);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				equalityExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				inequalityExpr();
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

	public static class EqualityExprContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(Inter_InstanceParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(Inter_InstanceParser.VARIABLE, i);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public List<NtContext> nt() {
			return getRuleContexts(NtContext.class);
		}
		public NtContext nt(int i) {
			return getRuleContext(NtContext.class,i);
		}
		public List<RtContext> rt() {
			return getRuleContexts(RtContext.class);
		}
		public RtContext rt(int i) {
			return getRuleContext(RtContext.class,i);
		}
		public List<TpContext> tp() {
			return getRuleContexts(TpContext.class);
		}
		public TpContext tp(int i) {
			return getRuleContext(TpContext.class,i);
		}
		public List<TsContext> ts() {
			return getRuleContexts(TsContext.class);
		}
		public TsContext ts(int i) {
			return getRuleContext(TsContext.class,i);
		}
		public List<WtContext> wt() {
			return getRuleContexts(WtContext.class);
		}
		public WtContext wt(int i) {
			return getRuleContext(WtContext.class,i);
		}
		public List<WiContext> wi() {
			return getRuleContexts(WiContext.class);
		}
		public WiContext wi(int i) {
			return getRuleContext(WiContext.class,i);
		}
		public List<UtContext> ut() {
			return getRuleContexts(UtContext.class);
		}
		public UtContext ut(int i) {
			return getRuleContext(UtContext.class,i);
		}
		public EqualityExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitEqualityExpr(this);
		}
	}

	public final EqualityExprContext equalityExpr() throws RecognitionException {
		EqualityExprContext _localctx = new EqualityExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_equalityExpr);
		try {
			setState(369);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(VARIABLE);
				setState(338);
				equality();
				setState(339);
				match(VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				nt();
				setState(342);
				equality();
				setState(343);
				nt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				rt();
				setState(346);
				equality();
				setState(347);
				rt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(349);
				tp();
				setState(350);
				equality();
				setState(351);
				tp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
				ts();
				setState(354);
				equality();
				setState(355);
				ts();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(357);
				wt();
				setState(358);
				equality();
				setState(359);
				wt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(361);
				wi();
				setState(362);
				equality();
				setState(363);
				wi();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(365);
				ut();
				setState(366);
				equality();
				setState(367);
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

	public static class InequalityExprContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(Inter_InstanceParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(Inter_InstanceParser.VARIABLE, i);
		}
		public InequalityContext inequality() {
			return getRuleContext(InequalityContext.class,0);
		}
		public List<NtContext> nt() {
			return getRuleContexts(NtContext.class);
		}
		public NtContext nt(int i) {
			return getRuleContext(NtContext.class,i);
		}
		public List<RtContext> rt() {
			return getRuleContexts(RtContext.class);
		}
		public RtContext rt(int i) {
			return getRuleContext(RtContext.class,i);
		}
		public List<TpContext> tp() {
			return getRuleContexts(TpContext.class);
		}
		public TpContext tp(int i) {
			return getRuleContext(TpContext.class,i);
		}
		public List<TsContext> ts() {
			return getRuleContexts(TsContext.class);
		}
		public TsContext ts(int i) {
			return getRuleContext(TsContext.class,i);
		}
		public InequalityExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inequalityExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterInequalityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitInequalityExpr(this);
		}
	}

	public final InequalityExprContext inequalityExpr() throws RecognitionException {
		InequalityExprContext _localctx = new InequalityExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inequalityExpr);
		try {
			setState(391);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				match(VARIABLE);
				setState(372);
				inequality();
				setState(373);
				match(VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				nt();
				setState(376);
				inequality();
				setState(377);
				nt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				rt();
				setState(380);
				inequality();
				setState(381);
				rt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(383);
				tp();
				setState(384);
				inequality();
				setState(385);
				tp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(387);
				ts();
				setState(388);
				inequality();
				setState(389);
				ts();
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
		enterRule(_localctx, 34, RULE_event);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) ) {
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
		enterRule(_localctx, 36, RULE_unknownEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
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
		enterRule(_localctx, 38, RULE_ut);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
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
		enterRule(_localctx, 40, RULE_rt);
		try {
			setState(407);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(CONSTANT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(VARIABLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				ut();
				setState(402);
				match(ROLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(404);
				tt();
				setState(405);
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
		enterRule(_localctx, 42, RULE_tt);
		try {
			setState(412);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				intra();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				inter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
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
		enterRule(_localctx, 44, RULE_intra);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
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
		enterRule(_localctx, 46, RULE_inter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(417);
			match(T__47);
			setState(418);
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
		enterRule(_localctx, 48, RULE_interp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(421);
			match(T__47);
			setState(422);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(423);
			match(T__47);
			setState(424);
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
		public List<NtContext> nt() {
			return getRuleContexts(NtContext.class);
		}
		public NtContext nt(int i) {
			return getRuleContext(NtContext.class,i);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
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
		enterRule(_localctx, 50, RULE_nt);
		try {
			setState(434);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(NUMBER);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(T__0);
				setState(428);
				nt();
				setState(429);
				arithmetic();
				setState(430);
				nt();
				setState(431);
				match(T__2);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				match(VARIABLE);
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
	public static class TimestampContext extends TpContext {
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public TimestampContext(TpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterTimestamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitTimestamp(this);
		}
	}
	public static class TimeContext extends TpContext {
		public TerminalNode TIME() { return getToken(Inter_InstanceParser.TIME, 0); }
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
	public static class VarTPContext extends TpContext {
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public VarTPContext(TpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterVarTP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitVarTP(this);
		}
	}
	public static class DateTimeContext extends TpContext {
		public Token DATETIME;
		public TerminalNode DATETIME() { return getToken(Inter_InstanceParser.DATETIME, 0); }
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
	public static class RelativeTimepointContext extends TpContext {
		public TpContext tp() {
			return getRuleContext(TpContext.class,0);
		}
		public TerminalNode ADD() { return getToken(Inter_InstanceParser.ADD, 0); }
		public TsContext ts() {
			return getRuleContext(TsContext.class,0);
		}
		public RelativeTimepointContext(TpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterRelativeTimepoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitRelativeTimepoint(this);
		}
	}
	public static class DateContext extends TpContext {
		public TerminalNode DATE() { return getToken(Inter_InstanceParser.DATE, 0); }
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
		enterRule(_localctx, 52, RULE_tp);
		try {
			setState(451);
			switch (_input.LA(1)) {
			case DATETIME:
				_localctx = new DateTimeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				((DateTimeContext)_localctx).DATETIME = match(DATETIME);
				checkDate((((DateTimeContext)_localctx).DATETIME!=null?((DateTimeContext)_localctx).DATETIME.getText():null));
				}
				break;
			case DATE:
				_localctx = new DateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				match(DATE);
				}
				break;
			case TIME:
				_localctx = new TimeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				match(TIME);
				}
				break;
			case T__0:
				_localctx = new RelativeTimepointContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(440);
				match(T__0);
				setState(441);
				tp();
				setState(442);
				match(ADD);
				setState(443);
				ts();
				setState(444);
				match(T__2);
				}
				break;
			case T__48:
				_localctx = new TimestampContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(446);
				match(T__48);
				setState(447);
				tt();
				setState(448);
				match(T__2);
				}
				break;
			case VARIABLE:
				_localctx = new VarTPContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(450);
				match(VARIABLE);
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

	public static class TsContext extends ParserRuleContext {
		public TsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts; }
	 
		public TsContext() { }
		public void copyFrom(TsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarTSContext extends TsContext {
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public VarTSContext(TsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterVarTS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitVarTS(this);
		}
	}
	public static class TimeintervalContext extends TsContext {
		public List<TtContext> tt() {
			return getRuleContexts(TtContext.class);
		}
		public TtContext tt(int i) {
			return getRuleContext(TtContext.class,i);
		}
		public TimeintervalContext(TsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterTimeinterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitTimeinterval(this);
		}
	}
	public static class AbsoluteIntervalContext extends TsContext {
		public Token DAYS;
		public TerminalNode YEARS() { return getToken(Inter_InstanceParser.YEARS, 0); }
		public TerminalNode MONTHS() { return getToken(Inter_InstanceParser.MONTHS, 0); }
		public TerminalNode DAYS() { return getToken(Inter_InstanceParser.DAYS, 0); }
		public TerminalNode HOURS() { return getToken(Inter_InstanceParser.HOURS, 0); }
		public TerminalNode MINUTES() { return getToken(Inter_InstanceParser.MINUTES, 0); }
		public TerminalNode SECONDS() { return getToken(Inter_InstanceParser.SECONDS, 0); }
		public AbsoluteIntervalContext(TsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterAbsoluteInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitAbsoluteInterval(this);
		}
	}
	public static class TimedifferenceContext extends TsContext {
		public List<TpContext> tp() {
			return getRuleContexts(TpContext.class);
		}
		public TpContext tp(int i) {
			return getRuleContext(TpContext.class,i);
		}
		public TerminalNode SUB() { return getToken(Inter_InstanceParser.SUB, 0); }
		public TimedifferenceContext(TsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterTimedifference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitTimedifference(this);
		}
	}

	public final TsContext ts() throws RecognitionException {
		TsContext _localctx = new TsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ts);
		int _la;
		try {
			setState(485);
			switch (_input.LA(1)) {
			case T__2:
			case T__28:
			case THEN:
			case KONJ:
			case DISJ:
			case EQUAL:
			case NOTEQUAL:
			case LOWER:
			case LEQ:
			case GREATER:
			case GEQ:
			case YEARS:
			case MONTHS:
			case DAYS:
			case HOURS:
			case MINUTES:
			case SECONDS:
				_localctx = new AbsoluteIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				_la = _input.LA(1);
				if (_la==YEARS) {
					{
					setState(453);
					match(YEARS);
					}
				}

				setState(457);
				_la = _input.LA(1);
				if (_la==MONTHS) {
					{
					setState(456);
					match(MONTHS);
					}
				}

				setState(460);
				_la = _input.LA(1);
				if (_la==DAYS) {
					{
					setState(459);
					((AbsoluteIntervalContext)_localctx).DAYS = match(DAYS);
					}
				}

				setState(463);
				_la = _input.LA(1);
				if (_la==HOURS) {
					{
					setState(462);
					match(HOURS);
					}
				}

				setState(466);
				_la = _input.LA(1);
				if (_la==MINUTES) {
					{
					setState(465);
					match(MINUTES);
					}
				}

				setState(469);
				_la = _input.LA(1);
				if (_la==SECONDS) {
					{
					setState(468);
					match(SECONDS);
					}
				}

				System.out.println((((AbsoluteIntervalContext)_localctx).DAYS!=null?((AbsoluteIntervalContext)_localctx).DAYS.getText():null));
				}
				break;
			case T__0:
				_localctx = new TimedifferenceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				match(T__0);
				setState(473);
				tp();
				setState(474);
				match(SUB);
				setState(475);
				tp();
				setState(476);
				match(T__2);
				}
				break;
			case T__49:
				_localctx = new TimeintervalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				match(T__49);
				setState(479);
				tt();
				setState(480);
				match(T__1);
				setState(481);
				tt();
				setState(482);
				match(T__2);
				}
				break;
			case VARIABLE:
				_localctx = new VarTSContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				match(VARIABLE);
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

	public static class WtContext extends ParserRuleContext {
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public TerminalNode WORKFLOW() { return getToken(Inter_InstanceParser.WORKFLOW, 0); }
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
		enterRule(_localctx, 56, RULE_wt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			tt();
			setState(488);
			match(WORKFLOW);
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

	public static class WiContext extends ParserRuleContext {
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public TerminalNode WORKFLOWINSTANCE() { return getToken(Inter_InstanceParser.WORKFLOWINSTANCE, 0); }
		public WiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterWi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitWi(this);
		}
	}

	public final WiContext wi() throws RecognitionException {
		WiContext _localctx = new WiContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_wi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			tt();
			setState(491);
			match(WORKFLOWINSTANCE);
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

	public static class VtContext extends ParserRuleContext {
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(Inter_InstanceParser.CONSTANT, 0); }
		public VtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterVt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitVt(this);
		}
	}

	public final VtContext vt() throws RecognitionException {
		VtContext _localctx = new VtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_vt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(T__50);
			setState(494);
			tt();
			setState(495);
			match(T__24);
			setState(496);
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

	public static class EqualityContext extends ParserRuleContext {
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
	 
		public EqualityContext() { }
		public void copyFrom(EqualityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NoteualContext extends EqualityContext {
		public TerminalNode NOTEQUAL() { return getToken(Inter_InstanceParser.NOTEQUAL, 0); }
		public NoteualContext(EqualityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterNoteual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitNoteual(this);
		}
	}
	public static class EqualContext extends EqualityContext {
		public TerminalNode EQUAL() { return getToken(Inter_InstanceParser.EQUAL, 0); }
		public EqualContext(EqualityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitEqual(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_equality);
		try {
			setState(500);
			switch (_input.LA(1)) {
			case EQUAL:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				match(EQUAL);
				}
				break;
			case NOTEQUAL:
				_localctx = new NoteualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				match(NOTEQUAL);
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

	public static class InequalityContext extends ParserRuleContext {
		public InequalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inequality; }
	 
		public InequalityContext() { }
		public void copyFrom(InequalityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GeqContext extends InequalityContext {
		public TerminalNode GEQ() { return getToken(Inter_InstanceParser.GEQ, 0); }
		public GeqContext(InequalityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterGeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitGeq(this);
		}
	}
	public static class GreaterContext extends InequalityContext {
		public TerminalNode GREATER() { return getToken(Inter_InstanceParser.GREATER, 0); }
		public GreaterContext(InequalityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitGreater(this);
		}
	}
	public static class LowerContext extends InequalityContext {
		public TerminalNode LOWER() { return getToken(Inter_InstanceParser.LOWER, 0); }
		public LowerContext(InequalityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterLower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitLower(this);
		}
	}
	public static class LeqContext extends InequalityContext {
		public TerminalNode LEQ() { return getToken(Inter_InstanceParser.LEQ, 0); }
		public LeqContext(InequalityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterLeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitLeq(this);
		}
	}

	public final InequalityContext inequality() throws RecognitionException {
		InequalityContext _localctx = new InequalityContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_inequality);
		try {
			setState(506);
			switch (_input.LA(1)) {
			case LOWER:
				_localctx = new LowerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				match(LOWER);
				}
				break;
			case LEQ:
				_localctx = new LeqContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				match(LEQ);
				}
				break;
			case GREATER:
				_localctx = new GreaterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				match(GREATER);
				}
				break;
			case GEQ:
				_localctx = new GeqContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
				match(GEQ);
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

	public static class ArithmeticContext extends ParserRuleContext {
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
	 
		public ArithmeticContext() { }
		public void copyFrom(ArithmeticContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubContext extends ArithmeticContext {
		public TerminalNode SUB() { return getToken(Inter_InstanceParser.SUB, 0); }
		public SubContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitSub(this);
		}
	}
	public static class DivContext extends ArithmeticContext {
		public TerminalNode DIV() { return getToken(Inter_InstanceParser.DIV, 0); }
		public DivContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitDiv(this);
		}
	}
	public static class AddContext extends ArithmeticContext {
		public TerminalNode ADD() { return getToken(Inter_InstanceParser.ADD, 0); }
		public AddContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitAdd(this);
		}
	}
	public static class MulContext extends ArithmeticContext {
		public TerminalNode MUL() { return getToken(Inter_InstanceParser.MUL, 0); }
		public MulContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitMul(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arithmetic);
		try {
			setState(512);
			switch (_input.LA(1)) {
			case MUL:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				match(MUL);
				}
				break;
			case DIV:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				match(DIV);
				}
				break;
			case ADD:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				match(ADD);
				}
				break;
			case SUB:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(511);
				match(SUB);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3]\u0205\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\7\2N\n\2\f\2\16\2Q\13"+
		"\2\3\2\7\2T\n\2\f\2\16\2W\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3a\n"+
		"\3\f\3\16\3d\13\3\3\3\3\3\3\4\3\4\3\4\5\4k\n\4\3\4\3\4\3\4\5\4p\n\4\7"+
		"\4r\n\4\f\4\16\4u\13\4\3\5\5\5x\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7"+
		"\6\u0082\n\6\f\6\16\6\u0085\13\6\3\7\3\7\3\7\3\7\3\7\7\7\u008c\n\7\f\7"+
		"\16\7\u008f\13\7\3\7\3\7\5\7\u0093\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u009a\n"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00aa\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00cd\n\13\3\f\5\f\u00d0\n\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00e6\n\f\3\r\5\r\u00e9\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u0106\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0114"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0146\n\16\3\17\3\17\3\17\7\17"+
		"\u014b\n\17\f\17\16\17\u014e\13\17\3\20\3\20\5\20\u0152\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0174\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u018a\n\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u019a\n\26\3\27\3\27\3\27\5\27\u019f\n\27\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\5\33\u01b5\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01c6\n\34\3\35\5\35\u01c9\n\35\3"+
		"\35\5\35\u01cc\n\35\3\35\5\35\u01cf\n\35\3\35\5\35\u01d2\n\35\3\35\5\35"+
		"\u01d5\n\35\3\35\5\35\u01d8\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01e8\n\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\5!\u01f7\n!\3\"\3\"\3\"\3\"\5\"\u01fd"+
		"\n\"\3#\3#\3#\3#\5#\u0203\n#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\5\4\2\4\4;;\3\2&\61\3\2XY\u0237\2"+
		"I\3\2\2\2\4Z\3\2\2\2\6g\3\2\2\2\bw\3\2\2\2\n~\3\2\2\2\f\u0092\3\2\2\2"+
		"\16\u0099\3\2\2\2\20\u009b\3\2\2\2\22\u00a9\3\2\2\2\24\u00cc\3\2\2\2\26"+
		"\u00e5\3\2\2\2\30\u0113\3\2\2\2\32\u0145\3\2\2\2\34\u0147\3\2\2\2\36\u0151"+
		"\3\2\2\2 \u0173\3\2\2\2\"\u0189\3\2\2\2$\u018b\3\2\2\2&\u018d\3\2\2\2"+
		"(\u018f\3\2\2\2*\u0199\3\2\2\2,\u019e\3\2\2\2.\u01a0\3\2\2\2\60\u01a2"+
		"\3\2\2\2\62\u01a6\3\2\2\2\64\u01b4\3\2\2\2\66\u01c5\3\2\2\28\u01e7\3\2"+
		"\2\2:\u01e9\3\2\2\2<\u01ec\3\2\2\2>\u01ef\3\2\2\2@\u01f6\3\2\2\2B\u01fc"+
		"\3\2\2\2D\u0202\3\2\2\2FH\5\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2"+
		"\2\2JO\3\2\2\2KI\3\2\2\2LN\5\6\4\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2"+
		"\2\2PU\3\2\2\2QO\3\2\2\2RT\5\b\5\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2"+
		"\2\2VX\3\2\2\2WU\3\2\2\2XY\7\2\2\3Y\3\3\2\2\2Z[\7=\2\2[\\\7Z\2\2\\]\7"+
		"\3\2\2]b\7?\2\2^_\t\2\2\2_a\7?\2\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2"+
		"\2\2ce\3\2\2\2db\3\2\2\2ef\7\5\2\2f\5\3\2\2\2gj\78\2\2hk\5\22\n\2ik\5"+
		"\24\13\2jh\3\2\2\2ji\3\2\2\2ks\3\2\2\2lo\t\2\2\2mp\5\22\n\2np\5\24\13"+
		"\2om\3\2\2\2on\3\2\2\2pr\3\2\2\2ql\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2"+
		"\2t\7\3\2\2\2us\3\2\2\2vx\7>\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\79\2"+
		"\2z{\5\n\6\2{|\7:\2\2|}\5\20\t\2}\t\3\2\2\2~\u0083\5\f\7\2\177\u0080\7"+
		";\2\2\u0080\u0082\5\f\7\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\13\3\2\2\2\u0085\u0083\3\2\2"+
		"\2\u0086\u0093\5\16\b\2\u0087\u0088\7\3\2\2\u0088\u008d\5\16\b\2\u0089"+
		"\u008a\7<\2\2\u008a\u008c\5\16\b\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0091\7\5\2\2\u0091\u0093\3\2\2\2\u0092\u0086\3\2"+
		"\2\2\u0092\u0087\3\2\2\2\u0093\r\3\2\2\2\u0094\u009a\5\24\13\2\u0095\u009a"+
		"\5\30\r\2\u0096\u009a\5\36\20\2\u0097\u009a\5\32\16\2\u0098\u009a\5\22"+
		"\n\2\u0099\u0094\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u0096\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\17\3\2\2\2\u009b\u009c\5\26\f"+
		"\2\u009c\21\3\2\2\2\u009d\u009e\5(\25\2\u009e\u009f\7\6\2\2\u009f\u00a0"+
		"\5(\25\2\u00a0\u00aa\3\2\2\2\u00a1\u00a2\5(\25\2\u00a2\u00a3\7\7\2\2\u00a3"+
		"\u00a4\5(\25\2\u00a4\u00aa\3\2\2\2\u00a5\u00a6\5(\25\2\u00a6\u00a7\7\b"+
		"\2\2\u00a7\u00a8\5(\25\2\u00a8\u00aa\3\2\2\2\u00a9\u009d\3\2\2\2\u00a9"+
		"\u00a1\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa\23\3\2\2\2\u00ab\u00ac\7\t\2"+
		"\2\u00ac\u00ad\5*\26\2\u00ad\u00ae\7\n\2\2\u00ae\u00af\5,\27\2\u00af\u00cd"+
		"\3\2\2\2\u00b0\u00b1\7\13\2\2\u00b1\u00b2\5(\25\2\u00b2\u00b3\7\n\2\2"+
		"\u00b3\u00b4\5,\27\2\u00b4\u00cd\3\2\2\2\u00b5\u00b6\7\13\2\2\u00b6\u00b7"+
		"\5(\25\2\u00b7\u00b8\7\f\2\2\u00b8\u00b9\5*\26\2\u00b9\u00cd\3\2\2\2\u00ba"+
		"\u00bb\5*\26\2\u00bb\u00bc\7\r\2\2\u00bc\u00bd\5,\27\2\u00bd\u00cd\3\2"+
		"\2\2\u00be\u00bf\5*\26\2\u00bf\u00c0\7\16\2\2\u00c0\u00c1\5,\27\2\u00c1"+
		"\u00cd\3\2\2\2\u00c2\u00c3\5*\26\2\u00c3\u00c4\7\17\2\2\u00c4\u00c5\5"+
		"*\26\2\u00c5\u00cd\3\2\2\2\u00c6\u00c7\7\20\2\2\u00c7\u00c8\5,\27\2\u00c8"+
		"\u00c9\7\4\2\2\u00c9\u00ca\5,\27\2\u00ca\u00cb\7\5\2\2\u00cb\u00cd\3\2"+
		"\2\2\u00cc\u00ab\3\2\2\2\u00cc\u00b0\3\2\2\2\u00cc\u00b5\3\2\2\2\u00cc"+
		"\u00ba\3\2\2\2\u00cc\u00be\3\2\2\2\u00cc\u00c2\3\2\2\2\u00cc\u00c6\3\2"+
		"\2\2\u00cd\25\3\2\2\2\u00ce\u00d0\7\13\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\5(\25\2\u00d2\u00d3\7\21\2\2"+
		"\u00d3\u00d4\5,\27\2\u00d4\u00e6\3\2\2\2\u00d5\u00d6\7\t\2\2\u00d6\u00d7"+
		"\5*\26\2\u00d7\u00d8\7\21\2\2\u00d8\u00d9\5,\27\2\u00d9\u00da\b\f\1\2"+
		"\u00da\u00e6\3\2\2\2\u00db\u00dc\5(\25\2\u00dc\u00dd\7\22\2\2\u00dd\u00de"+
		"\5,\27\2\u00de\u00e6\3\2\2\2\u00df\u00e0\7\23\2\2\u00e0\u00e1\5*\26\2"+
		"\u00e1\u00e2\7\22\2\2\u00e2\u00e3\5,\27\2\u00e3\u00e6\3\2\2\2\u00e4\u00e6"+
		"\7\24\2\2\u00e5\u00cf\3\2\2\2\u00e5\u00d5\3\2\2\2\u00e5\u00db\3\2\2\2"+
		"\u00e5\u00df\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\27\3\2\2\2\u00e7\u00e9"+
		"\7\13\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2"+
		"\u00ea\u00eb\5(\25\2\u00eb\u00ec\7\25\2\2\u00ec\u00ed\5,\27\2\u00ed\u0114"+
		"\3\2\2\2\u00ee\u00ef\7\t\2\2\u00ef\u00f0\5*\26\2\u00f0\u00f1\7\25\2\2"+
		"\u00f1\u00f2\5,\27\2\u00f2\u0114\3\2\2\2\u00f3\u00f4\5(\25\2\u00f4\u00f5"+
		"\7\26\2\2\u00f5\u00f6\5,\27\2\u00f6\u0114\3\2\2\2\u00f7\u00f8\5,\27\2"+
		"\u00f8\u00f9\7\27\2\2\u00f9\u0114\3\2\2\2\u00fa\u00fb\5,\27\2\u00fb\u00fc"+
		"\7\30\2\2\u00fc\u0114\3\2\2\2\u00fd\u00fe\5,\27\2\u00fe\u00ff\7\31\2\2"+
		"\u00ff\u0114\3\2\2\2\u0100\u0101\7\32\2\2\u0101\u0102\5,\27\2\u0102\u0105"+
		"\7\33\2\2\u0103\u0106\5$\23\2\u0104\u0106\5&\24\2\u0105\u0103\3\2\2\2"+
		"\u0105\u0104\3\2\2\2\u0106\u0114\3\2\2\2\u0107\u0108\5(\25\2\u0108\u0109"+
		"\7\34\2\2\u0109\u010a\5(\25\2\u010a\u0114\3\2\2\2\u010b\u010c\5(\25\2"+
		"\u010c\u010d\7\34\2\2\u010d\u010e\5(\25\2\u010e\u010f\7\35\2\2\u010f\u0110"+
		"\5,\27\2\u0110\u0111\7\4\2\2\u0111\u0112\5,\27\2\u0112\u0114\3\2\2\2\u0113"+
		"\u00e8\3\2\2\2\u0113\u00ee\3\2\2\2\u0113\u00f3\3\2\2\2\u0113\u00f7\3\2"+
		"\2\2\u0113\u00fa\3\2\2\2\u0113\u00fd\3\2\2\2\u0113\u0100\3\2\2\2\u0113"+
		"\u0107\3\2\2\2\u0113\u010b\3\2\2\2\u0114\31\3\2\2\2\u0115\u0116\7\36\2"+
		"\2\u0116\u0117\7@\2\2\u0117\u0118\5\34\17\2\u0118\u0119\7\37\2\2\u0119"+
		"\u011a\5\64\33\2\u011a\u0146\3\2\2\2\u011b\u011c\7 \2\2\u011c\u011d\7"+
		"Y\2\2\u011d\u011e\7@\2\2\u011e\u011f\5\34\17\2\u011f\u0120\7\37\2\2\u0120"+
		"\u0121\5\64\33\2\u0121\u0146\3\2\2\2\u0122\u0123\7!\2\2\u0123\u0124\7"+
		"Y\2\2\u0124\u0125\7@\2\2\u0125\u0126\5\34\17\2\u0126\u0127\7\37\2\2\u0127"+
		"\u0128\5\64\33\2\u0128\u0146\3\2\2\2\u0129\u012a\7\"\2\2\u012a\u012b\7"+
		"Y\2\2\u012b\u012c\7@\2\2\u012c\u012d\5\34\17\2\u012d\u012e\7\37\2\2\u012e"+
		"\u012f\5\64\33\2\u012f\u0146\3\2\2\2\u0130\u0131\7#\2\2\u0131\u0132\7"+
		"Y\2\2\u0132\u0133\7@\2\2\u0133\u0134\5\34\17\2\u0134\u0135\7\37\2\2\u0135"+
		"\u0136\5\64\33\2\u0136\u0146\3\2\2\2\u0137\u0138\7$\2\2\u0138\u0139\7"+
		"Y\2\2\u0139\u013a\7@\2\2\u013a\u013b\5\34\17\2\u013b\u013c\7\37\2\2\u013c"+
		"\u013d\5\64\33\2\u013d\u0146\3\2\2\2\u013e\u013f\7%\2\2\u013f\u0140\7"+
		"Y\2\2\u0140\u0141\7@\2\2\u0141\u0142\5\34\17\2\u0142\u0143\7\37\2\2\u0143"+
		"\u0144\5\64\33\2\u0144\u0146\3\2\2\2\u0145\u0115\3\2\2\2\u0145\u011b\3"+
		"\2\2\2\u0145\u0122\3\2\2\2\u0145\u0129\3\2\2\2\u0145\u0130\3\2\2\2\u0145"+
		"\u0137\3\2\2\2\u0145\u013e\3\2\2\2\u0146\33\3\2\2\2\u0147\u014c\5\f\7"+
		"\2\u0148\u0149\7;\2\2\u0149\u014b\5\f\7\2\u014a\u0148\3\2\2\2\u014b\u014e"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\35\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0152\5 \21\2\u0150\u0152\5\"\22\2\u0151\u014f\3"+
		"\2\2\2\u0151\u0150\3\2\2\2\u0152\37\3\2\2\2\u0153\u0154\7Y\2\2\u0154\u0155"+
		"\5@!\2\u0155\u0156\7Y\2\2\u0156\u0174\3\2\2\2\u0157\u0158\5\64\33\2\u0158"+
		"\u0159\5@!\2\u0159\u015a\5\64\33\2\u015a\u0174\3\2\2\2\u015b\u015c\5*"+
		"\26\2\u015c\u015d\5@!\2\u015d\u015e\5*\26\2\u015e\u0174\3\2\2\2\u015f"+
		"\u0160\5\66\34\2\u0160\u0161\5@!\2\u0161\u0162\5\66\34\2\u0162\u0174\3"+
		"\2\2\2\u0163\u0164\58\35\2\u0164\u0165\5@!\2\u0165\u0166\58\35\2\u0166"+
		"\u0174\3\2\2\2\u0167\u0168\5:\36\2\u0168\u0169\5@!\2\u0169\u016a\5:\36"+
		"\2\u016a\u0174\3\2\2\2\u016b\u016c\5<\37\2\u016c\u016d\5@!\2\u016d\u016e"+
		"\5<\37\2\u016e\u0174\3\2\2\2\u016f\u0170\5(\25\2\u0170\u0171\5@!\2\u0171"+
		"\u0172\5(\25\2\u0172\u0174\3\2\2\2\u0173\u0153\3\2\2\2\u0173\u0157\3\2"+
		"\2\2\u0173\u015b\3\2\2\2\u0173\u015f\3\2\2\2\u0173\u0163\3\2\2\2\u0173"+
		"\u0167\3\2\2\2\u0173\u016b\3\2\2\2\u0173\u016f\3\2\2\2\u0174!\3\2\2\2"+
		"\u0175\u0176\7Y\2\2\u0176\u0177\5B\"\2\u0177\u0178\7Y\2\2\u0178\u018a"+
		"\3\2\2\2\u0179\u017a\5\64\33\2\u017a\u017b\5B\"\2\u017b\u017c\5\64\33"+
		"\2\u017c\u018a\3\2\2\2\u017d\u017e\5*\26\2\u017e\u017f\5B\"\2\u017f\u0180"+
		"\5*\26\2\u0180\u018a\3\2\2\2\u0181\u0182\5\66\34\2\u0182\u0183\5B\"\2"+
		"\u0183\u0184\5\66\34\2\u0184\u018a\3\2\2\2\u0185\u0186\58\35\2\u0186\u0187"+
		"\5B\"\2\u0187\u0188\58\35\2\u0188\u018a\3\2\2\2\u0189\u0175\3\2\2\2\u0189"+
		"\u0179\3\2\2\2\u0189\u017d\3\2\2\2\u0189\u0181\3\2\2\2\u0189\u0185\3\2"+
		"\2\2\u018a#\3\2\2\2\u018b\u018c\t\3\2\2\u018c%\3\2\2\2\u018d\u018e\7X"+
		"\2\2\u018e\'\3\2\2\2\u018f\u0190\t\4\2\2\u0190)\3\2\2\2\u0191\u019a\7"+
		"X\2\2\u0192\u019a\7Y\2\2\u0193\u0194\5(\25\2\u0194\u0195\7A\2\2\u0195"+
		"\u019a\3\2\2\2\u0196\u0197\5,\27\2\u0197\u0198\7A\2\2\u0198\u019a\3\2"+
		"\2\2\u0199\u0191\3\2\2\2\u0199\u0192\3\2\2\2\u0199\u0193\3\2\2\2\u0199"+
		"\u0196\3\2\2\2\u019a+\3\2\2\2\u019b\u019f\5.\30\2\u019c\u019f\5\60\31"+
		"\2\u019d\u019f\5\62\32\2\u019e\u019b\3\2\2\2\u019e\u019c\3\2\2\2\u019e"+
		"\u019d\3\2\2\2\u019f-\3\2\2\2\u01a0\u01a1\t\4\2\2\u01a1/\3\2\2\2\u01a2"+
		"\u01a3\t\4\2\2\u01a3\u01a4\7\62\2\2\u01a4\u01a5\t\4\2\2\u01a5\61\3\2\2"+
		"\2\u01a6\u01a7\t\4\2\2\u01a7\u01a8\7\62\2\2\u01a8\u01a9\t\4\2\2\u01a9"+
		"\u01aa\7\62\2\2\u01aa\u01ab\t\4\2\2\u01ab\63\3\2\2\2\u01ac\u01b5\7[\2"+
		"\2\u01ad\u01ae\7\3\2\2\u01ae\u01af\5\64\33\2\u01af\u01b0\5D#\2\u01b0\u01b1"+
		"\5\64\33\2\u01b1\u01b2\7\5\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b5\7Y\2\2"+
		"\u01b4\u01ac\3\2\2\2\u01b4\u01ad\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\65"+
		"\3\2\2\2\u01b6\u01b7\7U\2\2\u01b7\u01c6\b\34\1\2\u01b8\u01c6\7V\2\2\u01b9"+
		"\u01c6\7W\2\2\u01ba\u01bb\7\3\2\2\u01bb\u01bc\5\66\34\2\u01bc\u01bd\7"+
		"M\2\2\u01bd\u01be\58\35\2\u01be\u01bf\7\5\2\2\u01bf\u01c6\3\2\2\2\u01c0"+
		"\u01c1\7\63\2\2\u01c1\u01c2\5,\27\2\u01c2\u01c3\7\5\2\2\u01c3\u01c6\3"+
		"\2\2\2\u01c4\u01c6\7Y\2\2\u01c5\u01b6\3\2\2\2\u01c5\u01b8\3\2\2\2\u01c5"+
		"\u01b9\3\2\2\2\u01c5\u01ba\3\2\2\2\u01c5\u01c0\3\2\2\2\u01c5\u01c4\3\2"+
		"\2\2\u01c6\67\3\2\2\2\u01c7\u01c9\7O\2\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9"+
		"\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01cc\7P\2\2\u01cb\u01ca\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01cf\7Q\2\2\u01ce\u01cd\3\2"+
		"\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01d2\7R\2\2\u01d1"+
		"\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d5\7S"+
		"\2\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6"+
		"\u01d8\7T\2\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9\u01e8\b\35\1\2\u01da\u01db\7\3\2\2\u01db\u01dc\5\66\34\2\u01dc"+
		"\u01dd\7N\2\2\u01dd\u01de\5\66\34\2\u01de\u01df\7\5\2\2\u01df\u01e8\3"+
		"\2\2\2\u01e0\u01e1\7\64\2\2\u01e1\u01e2\5,\27\2\u01e2\u01e3\7\4\2\2\u01e3"+
		"\u01e4\5,\27\2\u01e4\u01e5\7\5\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e8\7Y"+
		"\2\2\u01e7\u01c8\3\2\2\2\u01e7\u01da\3\2\2\2\u01e7\u01e0\3\2\2\2\u01e7"+
		"\u01e6\3\2\2\2\u01e89\3\2\2\2\u01e9\u01ea\5,\27\2\u01ea\u01eb\7D\2\2\u01eb"+
		";\3\2\2\2\u01ec\u01ed\5,\27\2\u01ed\u01ee\7C\2\2\u01ee=\3\2\2\2\u01ef"+
		"\u01f0\7\65\2\2\u01f0\u01f1\5,\27\2\u01f1\u01f2\7\33\2\2\u01f2\u01f3\7"+
		"X\2\2\u01f3?\3\2\2\2\u01f4\u01f7\7E\2\2\u01f5\u01f7\7F\2\2\u01f6\u01f4"+
		"\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7A\3\2\2\2\u01f8\u01fd\7G\2\2\u01f9\u01fd"+
		"\7H\2\2\u01fa\u01fd\7I\2\2\u01fb\u01fd\7J\2\2\u01fc\u01f8\3\2\2\2\u01fc"+
		"\u01f9\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fdC\3\2\2\2"+
		"\u01fe\u0203\7K\2\2\u01ff\u0203\7L\2\2\u0200\u0203\7M\2\2\u0201\u0203"+
		"\7N\2\2\u0202\u01fe\3\2\2\2\u0202\u01ff\3\2\2\2\u0202\u0200\3\2\2\2\u0202"+
		"\u0201\3\2\2\2\u0203E\3\2\2\2(IOUbjosw\u0083\u008d\u0092\u0099\u00a9\u00cc"+
		"\u00cf\u00e5\u00e8\u0105\u0113\u0145\u014c\u0151\u0173\u0189\u0199\u019e"+
		"\u01b4\u01c5\u01c8\u01cb\u01ce\u01d1\u01d4\u01d7\u01e7\u01f6\u01fc\u0202";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}