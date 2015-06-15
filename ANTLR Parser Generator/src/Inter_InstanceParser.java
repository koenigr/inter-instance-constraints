// Generated from Inter_Instance.g4 by ANTLR 4.5

  import parser.ParserHelper;
  import java.util.logging.Logger;
  import java.util.logging.Level;
  import logging.LoggerFactory;
  import exceptions.UnexpectedContextException;

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
		MINUTES=81, SECONDS=82, TIMEINTERVAL=83, DATETIME=84, DATE=85, TIME=86, 
		CONSTANT=87, VARIABLE=88, CLAUSE=89, NUMBER=90, STRING=91, WS=92;
	public static final int
		RULE_file = 0, RULE_define = 1, RULE_explicitSetting = 2, RULE_assignment = 3, 
		RULE_description = 4, RULE_assignmentBody = 5, RULE_clauses = 6, RULE_atoms = 7, 
		RULE_definedClause = 8, RULE_assignmentHead = 9, RULE_extern = 10, RULE_specification = 11, 
		RULE_enforcement = 12, RULE_status = 13, RULE_conditional = 14, RULE_conditionalBody = 15, 
		RULE_comparison = 16, RULE_equalityExpr = 17, RULE_inequalityExpr = 18, 
		RULE_event = 19, RULE_unknownEvent = 20, RULE_ut = 21, RULE_rt = 22, RULE_tt = 23, 
		RULE_intra = 24, RULE_inter = 25, RULE_interp = 26, RULE_nt = 27, RULE_tp = 28, 
		RULE_ts = 29, RULE_wt = 30, RULE_wi = 31, RULE_vt = 32, RULE_equality = 33, 
		RULE_inequality = 34, RULE_arithmetic = 35;
	public static final String[] ruleNames = {
		"file", "define", "explicitSetting", "assignment", "description", "assignmentBody", 
		"clauses", "atoms", "definedClause", "assignmentHead", "extern", "specification", 
		"enforcement", "status", "conditional", "conditionalBody", "comparison", 
		"equalityExpr", "inequalityExpr", "event", "unknownEvent", "ut", "rt", 
		"tt", "intra", "inter", "interp", "nt", "tp", "ts", "wt", "wi", "vt", 
		"equality", "inequality", "arithmetic"
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
		null, "'DESC'", null, "'WHERE'", "'.Role'", "'.InstanceID'", null, "'.Workflow'", 
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
		"DAYS", "HOURS", "MINUTES", "SECONDS", "TIMEINTERVAL", "DATETIME", "DATE", 
		"TIME", "CONSTANT", "VARIABLE", "CLAUSE", "NUMBER", "STRING", "WS"
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


	  ParserHelper ph = new ParserHelper();
	  enum Context { UNKNOWN, INTRA, INTER, INTERP};
	  Context context = Context.UNKNOWN;
	  Logger logger = LoggerFactory.getLogger();
	  

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
			 logger.severe("Start parsing..."); 
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(73);
				define();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SET) {
				{
				{
				setState(79);
				explicitSetting();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF || _la==DESC) {
				{
				{
				setState(85);
				assignment();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(EOF);
			 logger.severe("End of parsing..."); 
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
		public Token CLAUSE;
		public Token ARGS;
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
			setState(94);
			match(DEF);
			setState(95);
			((DefineContext)_localctx).CLAUSE = match(CLAUSE);
			ph.addClause((((DefineContext)_localctx).CLAUSE!=null?((DefineContext)_localctx).CLAUSE.getText():null));
			setState(97);
			match(T__0);
			setState(98);
			((DefineContext)_localctx).ARGS = match(ARGS);
			ph.addArgTypeToClause((((DefineContext)_localctx).CLAUSE!=null?((DefineContext)_localctx).CLAUSE.getText():null), (((DefineContext)_localctx).ARGS!=null?((DefineContext)_localctx).ARGS.getText():null));
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				{
				setState(100);
				match(T__1);
				}
				setState(101);
				((DefineContext)_localctx).ARGS = match(ARGS);
				ph.addArgTypeToClause((((DefineContext)_localctx).CLAUSE!=null?((DefineContext)_localctx).CLAUSE.getText():null), (((DefineContext)_localctx).ARGS!=null?((DefineContext)_localctx).ARGS.getText():null));
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
			setState(110);
			match(SET);
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(111);
				extern();
				}
				break;
			case 2:
				{
				setState(112);
				specification();
				}
				break;
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==KONJ) {
				{
				{
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==KONJ) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(118);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(116);
					extern();
					}
					break;
				case 2:
					{
					setState(117);
					specification();
					}
					break;
				}
				}
				}
				setState(124);
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
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
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
			 context = Context.UNKNOWN;
			setState(127);
			_la = _input.LA(1);
			if (_la==DESC) {
				{
				setState(126);
				description();
				}
			}

			setState(129);
			match(IF);
			setState(130);
			assignmentBody();
			setState(131);
			match(THEN);
			setState(132);
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

	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode DESC() { return getToken(Inter_InstanceParser.DESC, 0); }
		public TerminalNode CONSTANT() { return getToken(Inter_InstanceParser.CONSTANT, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitDescription(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(DESC);
			setState(135);
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
			setState(137);
			clauses();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KONJ) {
				{
				{
				setState(138);
				match(KONJ);
				setState(139);
				clauses();
				}
				}
				setState(144);
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
			setState(157);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				atoms();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(T__0);
				setState(147);
				atoms();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DISJ) {
					{
					{
					setState(148);
					match(DISJ);
					setState(149);
					atoms();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(155);
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
		public DefinedClauseContext definedClause() {
			return getRuleContext(DefinedClauseContext.class,0);
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
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				specification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				status();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				comparison();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				extern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(164);
				definedClause();
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

	public static class DefinedClauseContext extends ParserRuleContext {
		public Token CLAUSE;
		public TerminalNode CLAUSE() { return getToken(Inter_InstanceParser.CLAUSE, 0); }
		public List<TerminalNode> CONSTANT() { return getTokens(Inter_InstanceParser.CONSTANT); }
		public TerminalNode CONSTANT(int i) {
			return getToken(Inter_InstanceParser.CONSTANT, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(Inter_InstanceParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(Inter_InstanceParser.VARIABLE, i);
		}
		public DefinedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterDefinedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitDefinedClause(this);
		}
	}

	public final DefinedClauseContext definedClause() throws RecognitionException {
		DefinedClauseContext _localctx = new DefinedClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_definedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((DefinedClauseContext)_localctx).CLAUSE = match(CLAUSE);
			setState(168);
			match(T__0);
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(170);
				match(T__1);
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==CONSTANT || _la==VARIABLE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			match(T__2);
			 if(!ph.existsClause((((DefinedClauseContext)_localctx).CLAUSE!=null?((DefinedClauseContext)_localctx).CLAUSE.getText():null))) {
								System.out.println("Unknown clause " + (((DefinedClauseContext)_localctx).CLAUSE!=null?((DefinedClauseContext)_localctx).CLAUSE.getText():null));
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
		enterRule(_localctx, 18, RULE_assignmentHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
		enterRule(_localctx, 20, RULE_extern);
		try {
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new RelatedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				ut();
				setState(183);
				match(T__3);
				setState(184);
				ut();
				}
				break;
			case 2:
				_localctx = new PartnerofContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				ut();
				setState(187);
				match(T__4);
				setState(188);
				ut();
				}
				break;
			case 3:
				_localctx = new SamegroupContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				ut();
				setState(191);
				match(T__5);
				setState(192);
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
		enterRule(_localctx, 22, RULE_specification);
		try {
			setState(229);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new RoleTaskContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(T__6);
				setState(197);
				rt();
				setState(198);
				match(T__7);
				setState(199);
				tt();
				}
				break;
			case 2:
				_localctx = new UserTaskContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(T__8);
				setState(202);
				ut();
				setState(203);
				match(T__7);
				setState(204);
				tt();
				}
				break;
			case 3:
				_localctx = new UserRoleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(T__8);
				setState(207);
				ut();
				setState(208);
				match(T__9);
				setState(209);
				rt();
				}
				break;
			case 4:
				_localctx = new GlbContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				rt();
				setState(212);
				match(T__10);
				setState(213);
				tt();
				}
				break;
			case 5:
				_localctx = new LubContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				rt();
				setState(216);
				match(T__11);
				setState(217);
				tt();
				}
				break;
			case 6:
				_localctx = new DominateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(219);
				rt();
				setState(220);
				match(T__12);
				setState(221);
				rt();
				}
				break;
			case 7:
				_localctx = new CritTaskPairContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(223);
				match(T__13);
				setState(224);
				tt();
				setState(225);
				match(T__1);
				setState(226);
				tt();
				setState(227);
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
		enterRule(_localctx, 24, RULE_enforcement);
		int _la;
		try {
			setState(254);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new CannotUserContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(231);
					match(T__8);
					}
				}

				setState(234);
				ut();
				setState(235);
				match(T__14);
				setState(236);
				tt();
				}
				break;
			case 2:
				_localctx = new CannotRoleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(T__6);
				setState(239);
				((CannotRoleContext)_localctx).r = rt();
				setState(240);
				match(T__14);
				setState(241);
				tt();
				System.out.println((((CannotRoleContext)_localctx).r!=null?_input.getText(((CannotRoleContext)_localctx).r.start,((CannotRoleContext)_localctx).r.stop):null));
				}
				break;
			case 3:
				_localctx = new MustUserContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				ut();
				setState(245);
				match(T__15);
				setState(246);
				tt();
				}
				break;
			case 4:
				_localctx = new MustRoleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				match(T__16);
				setState(249);
				rt();
				setState(250);
				match(T__15);
				setState(251);
				tt();
				}
				break;
			case 5:
				_localctx = new PanicContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
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
		enterRule(_localctx, 26, RULE_status);
		int _la;
		try {
			setState(300);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ExecutedUserContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(256);
					match(T__8);
					}
				}

				setState(259);
				ut();
				setState(260);
				match(T__18);
				setState(261);
				tt();
				}
				break;
			case 2:
				_localctx = new ExecutedRoleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(T__6);
				setState(264);
				rt();
				setState(265);
				match(T__18);
				setState(266);
				tt();
				}
				break;
			case 3:
				_localctx = new AssignedUserContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				ut();
				setState(269);
				match(T__19);
				setState(270);
				tt();
				}
				break;
			case 4:
				_localctx = new AbortedTaskContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				tt();
				setState(273);
				match(T__20);
				}
				break;
			case 5:
				_localctx = new SucceededTaskContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(275);
				tt();
				setState(276);
				match(T__21);
				}
				break;
			case 6:
				_localctx = new StartedTaskContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(278);
				tt();
				setState(279);
				match(T__22);
				}
				break;
			case 7:
				_localctx = new FlexibleEventContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(281);
				match(T__23);
				setState(282);
				tt();
				setState(283);
				match(T__24);
				setState(286);
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
					setState(284);
					event();
					}
					break;
				case CONSTANT:
					{
					setState(285);
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
				setState(288);
				ut();
				setState(289);
				match(T__25);
				setState(290);
				ut();
				}
				break;
			case 9:
				_localctx = new CollaboratorExtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(292);
				ut();
				setState(293);
				match(T__25);
				setState(294);
				ut();
				setState(295);
				match(T__26);
				setState(296);
				tt();
				setState(297);
				match(T__1);
				setState(298);
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
		enterRule(_localctx, 28, RULE_conditional);
		try {
			setState(350);
			switch (_input.LA(1)) {
			case T__27:
				_localctx = new NumSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(T__27);
				setState(303);
				match(WHERE);
				setState(304);
				conditionalBody();
				setState(305);
				match(T__28);
				setState(306);
				nt();
				}
				break;
			case T__29:
				_localctx = new NumVarsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(T__29);
				setState(309);
				match(VARIABLE);
				setState(310);
				match(WHERE);
				setState(311);
				conditionalBody();
				setState(312);
				match(T__28);
				setState(313);
				nt();
				}
				break;
			case T__30:
				_localctx = new NumDiffContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(T__30);
				setState(316);
				match(VARIABLE);
				setState(317);
				match(WHERE);
				setState(318);
				conditionalBody();
				setState(319);
				match(T__28);
				setState(320);
				nt();
				}
				break;
			case T__31:
				_localctx = new SumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				match(T__31);
				setState(323);
				match(VARIABLE);
				setState(324);
				match(WHERE);
				setState(325);
				conditionalBody();
				setState(326);
				match(T__28);
				setState(327);
				nt();
				}
				break;
			case T__32:
				_localctx = new AvgContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(329);
				match(T__32);
				setState(330);
				match(VARIABLE);
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
			case T__33:
				_localctx = new MinContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(336);
				match(T__33);
				setState(337);
				match(VARIABLE);
				setState(338);
				match(WHERE);
				setState(339);
				conditionalBody();
				setState(340);
				match(T__28);
				setState(341);
				nt();
				}
				break;
			case T__34:
				_localctx = new MaxContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(343);
				match(T__34);
				setState(344);
				match(VARIABLE);
				setState(345);
				match(WHERE);
				setState(346);
				conditionalBody();
				setState(347);
				match(T__28);
				setState(348);
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
		enterRule(_localctx, 30, RULE_conditionalBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			clauses();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KONJ) {
				{
				{
				setState(353);
				match(KONJ);
				setState(354);
				clauses();
				}
				}
				setState(359);
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
		enterRule(_localctx, 32, RULE_comparison);
		try {
			setState(362);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				equalityExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
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
		enterRule(_localctx, 34, RULE_equalityExpr);
		try {
			setState(396);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(VARIABLE);
				setState(365);
				equality();
				setState(366);
				match(VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				nt();
				setState(369);
				equality();
				setState(370);
				nt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				rt();
				setState(373);
				equality();
				setState(374);
				rt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(376);
				tp();
				setState(377);
				equality();
				setState(378);
				tp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(380);
				ts();
				setState(381);
				equality();
				setState(382);
				ts();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(384);
				wt();
				setState(385);
				equality();
				setState(386);
				wt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(388);
				wi();
				setState(389);
				equality();
				setState(390);
				wi();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(392);
				ut();
				setState(393);
				equality();
				setState(394);
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
		enterRule(_localctx, 36, RULE_inequalityExpr);
		try {
			setState(418);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(VARIABLE);
				setState(399);
				inequality();
				setState(400);
				match(VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				nt();
				setState(403);
				inequality();
				setState(404);
				nt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				rt();
				setState(407);
				inequality();
				setState(408);
				rt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(410);
				tp();
				setState(411);
				inequality();
				setState(412);
				tp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(414);
				ts();
				setState(415);
				inequality();
				setState(416);
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
		enterRule(_localctx, 38, RULE_event);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
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
		enterRule(_localctx, 40, RULE_unknownEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
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
			setState(434);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(CONSTANT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(VARIABLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				ut();
				setState(429);
				match(ROLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
				tt();
				setState(432);
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
		public IntraContext intra;
		public InterContext inter;
		public InterpContext interp;
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
			setState(445);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				((TtContext)_localctx).intra = intra();
				 
									if (context == Context.UNKNOWN) {
										context = Context.INTRA;
									} else if (context != Context.INTRA) {
									logger.log(Level.SEVERE, ""
										, new UnexpectedContextException((((TtContext)_localctx).intra!=null?_input.getText(((TtContext)_localctx).intra.start,((TtContext)_localctx).intra.stop):null), "INTRA",  context.toString())
									);
									}
								
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				((TtContext)_localctx).inter = inter();
				 
									if (context == Context.UNKNOWN) {
										context = Context.INTER;
									} else if (context != Context.INTER) {
									logger.log(Level.SEVERE, ""
										, new UnexpectedContextException((((TtContext)_localctx).inter!=null?_input.getText(((TtContext)_localctx).inter.start,((TtContext)_localctx).inter.stop):null), "INTER",  context.toString())
									);
									}
								
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
				((TtContext)_localctx).interp = interp();
				 
									if (context == Context.UNKNOWN) {
										context = Context.INTERP;
									} else if (context != Context.INTERP) {
									logger.log(Level.SEVERE, ""
										, new UnexpectedContextException((((TtContext)_localctx).interp!=null?_input.getText(((TtContext)_localctx).interp.start,((TtContext)_localctx).interp.stop):null), "INTERP", context.toString())
									);
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
			setState(447);
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
			setState(449);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(450);
			match(T__47);
			setState(451);
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
			setState(453);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(454);
			match(T__47);
			setState(455);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(456);
			match(T__47);
			setState(457);
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
		enterRule(_localctx, 54, RULE_nt);
		try {
			setState(467);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(NUMBER);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				match(T__0);
				setState(461);
				nt();
				setState(462);
				arithmetic();
				setState(463);
				nt();
				setState(464);
				match(T__2);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
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
		public Token TIME;
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
		public Token DATE;
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
		enterRule(_localctx, 56, RULE_tp);
		try {
			setState(486);
			switch (_input.LA(1)) {
			case DATETIME:
				_localctx = new DateTimeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				((DateTimeContext)_localctx).DATETIME = match(DATETIME);
				ph.checkDateTime((((DateTimeContext)_localctx).DATETIME!=null?((DateTimeContext)_localctx).DATETIME.getText():null));
				}
				break;
			case DATE:
				_localctx = new DateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				((DateContext)_localctx).DATE = match(DATE);
				ph.checkDate((((DateContext)_localctx).DATE!=null?((DateContext)_localctx).DATE.getText():null));
				}
				break;
			case TIME:
				_localctx = new TimeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(473);
				((TimeContext)_localctx).TIME = match(TIME);
				ph.checkTime((((TimeContext)_localctx).TIME!=null?((TimeContext)_localctx).TIME.getText():null));
				}
				break;
			case T__0:
				_localctx = new RelativeTimepointContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				match(T__0);
				setState(476);
				tp();
				setState(477);
				match(ADD);
				setState(478);
				ts();
				setState(479);
				match(T__2);
				}
				break;
			case T__48:
				_localctx = new TimestampContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(481);
				match(T__48);
				setState(482);
				tt();
				setState(483);
				match(T__2);
				}
				break;
			case VARIABLE:
				_localctx = new VarTPContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(485);
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
		public Token TIMEINTERVAL;
		public TerminalNode TIMEINTERVAL() { return getToken(Inter_InstanceParser.TIMEINTERVAL, 0); }
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
		enterRule(_localctx, 58, RULE_ts);
		try {
			setState(503);
			switch (_input.LA(1)) {
			case TIMEINTERVAL:
				_localctx = new AbsoluteIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				((AbsoluteIntervalContext)_localctx).TIMEINTERVAL = match(TIMEINTERVAL);
				ph.checkTimeInterval((((AbsoluteIntervalContext)_localctx).TIMEINTERVAL!=null?((AbsoluteIntervalContext)_localctx).TIMEINTERVAL.getText():null));
				}
				break;
			case T__0:
				_localctx = new TimedifferenceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				match(T__0);
				setState(491);
				tp();
				setState(492);
				match(SUB);
				setState(493);
				tp();
				setState(494);
				match(T__2);
				}
				break;
			case T__49:
				_localctx = new TimeintervalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				match(T__49);
				setState(497);
				tt();
				setState(498);
				match(T__1);
				setState(499);
				tt();
				setState(500);
				match(T__2);
				}
				break;
			case VARIABLE:
				_localctx = new VarTSContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(502);
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
		enterRule(_localctx, 60, RULE_wt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			tt();
			setState(506);
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
		enterRule(_localctx, 62, RULE_wi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			tt();
			setState(509);
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
		enterRule(_localctx, 64, RULE_vt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(T__50);
			setState(512);
			tt();
			setState(513);
			match(T__24);
			setState(514);
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
		enterRule(_localctx, 66, RULE_equality);
		try {
			setState(518);
			switch (_input.LA(1)) {
			case EQUAL:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				match(EQUAL);
				}
				break;
			case NOTEQUAL:
				_localctx = new NoteualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
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
		enterRule(_localctx, 68, RULE_inequality);
		try {
			setState(524);
			switch (_input.LA(1)) {
			case LOWER:
				_localctx = new LowerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				match(LOWER);
				}
				break;
			case LEQ:
				_localctx = new LeqContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				match(LEQ);
				}
				break;
			case GREATER:
				_localctx = new GreaterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(522);
				match(GREATER);
				}
				break;
			case GEQ:
				_localctx = new GeqContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(523);
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
		enterRule(_localctx, 70, RULE_arithmetic);
		try {
			setState(530);
			switch (_input.LA(1)) {
			case MUL:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				match(MUL);
				}
				break;
			case DIV:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				match(DIV);
				}
				break;
			case ADD:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				match(ADD);
				}
				break;
			case SUB:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(529);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3^\u0217\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\7\2M\n\2\f\2\16\2P\13\2\3\2\7\2"+
		"S\n\2\f\2\16\2V\13\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3j\n\3\f\3\16\3m\13\3\3\3\3\3\3\4\3\4\3"+
		"\4\5\4t\n\4\3\4\3\4\3\4\5\4y\n\4\7\4{\n\4\f\4\16\4~\13\4\3\5\3\5\5\5\u0082"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u008f\n\7\f\7\16"+
		"\7\u0092\13\7\3\b\3\b\3\b\3\b\3\b\7\b\u0099\n\b\f\b\16\b\u009c\13\b\3"+
		"\b\3\b\5\b\u00a0\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a8\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\7\n\u00af\n\n\f\n\16\n\u00b2\13\n\3\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c5\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e8\n\r\3\16\5"+
		"\16\u00eb\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0101\n\16\3\17\5\17"+
		"\u0104\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0121\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u012f\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0161\n\20"+
		"\3\21\3\21\3\21\7\21\u0166\n\21\f\21\16\21\u0169\13\21\3\22\3\22\5\22"+
		"\u016d\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u018f\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u01a5\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u01b5\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u01c0\n\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01d6\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u01e9\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01fa\n\37\3 \3 \3 \3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\5#\u0209\n#\3$\3$\3$\3$\5$\u020f\n$\3%\3%\3"+
		"%\3%\5%\u0215\n%\3%\2\2&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFH\2\5\4\2\4\4;;\3\2YZ\3\2&\61\u0243\2J\3\2\2\2"+
		"\4`\3\2\2\2\6p\3\2\2\2\b\177\3\2\2\2\n\u0088\3\2\2\2\f\u008b\3\2\2\2\16"+
		"\u009f\3\2\2\2\20\u00a7\3\2\2\2\22\u00a9\3\2\2\2\24\u00b6\3\2\2\2\26\u00c4"+
		"\3\2\2\2\30\u00e7\3\2\2\2\32\u0100\3\2\2\2\34\u012e\3\2\2\2\36\u0160\3"+
		"\2\2\2 \u0162\3\2\2\2\"\u016c\3\2\2\2$\u018e\3\2\2\2&\u01a4\3\2\2\2(\u01a6"+
		"\3\2\2\2*\u01a8\3\2\2\2,\u01aa\3\2\2\2.\u01b4\3\2\2\2\60\u01bf\3\2\2\2"+
		"\62\u01c1\3\2\2\2\64\u01c3\3\2\2\2\66\u01c7\3\2\2\28\u01d5\3\2\2\2:\u01e8"+
		"\3\2\2\2<\u01f9\3\2\2\2>\u01fb\3\2\2\2@\u01fe\3\2\2\2B\u0201\3\2\2\2D"+
		"\u0208\3\2\2\2F\u020e\3\2\2\2H\u0214\3\2\2\2JN\b\2\1\2KM\5\4\3\2LK\3\2"+
		"\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OT\3\2\2\2PN\3\2\2\2QS\5\6\4\2RQ\3\2"+
		"\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UZ\3\2\2\2VT\3\2\2\2WY\5\b\5\2XW\3\2"+
		"\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\2\2\3^_\b"+
		"\2\1\2_\3\3\2\2\2`a\7=\2\2ab\7[\2\2bc\b\3\1\2cd\7\3\2\2de\7?\2\2ek\b\3"+
		"\1\2fg\7\4\2\2gh\7?\2\2hj\b\3\1\2if\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2"+
		"\2\2ln\3\2\2\2mk\3\2\2\2no\7\5\2\2o\5\3\2\2\2ps\78\2\2qt\5\26\f\2rt\5"+
		"\30\r\2sq\3\2\2\2sr\3\2\2\2t|\3\2\2\2ux\t\2\2\2vy\5\26\f\2wy\5\30\r\2"+
		"xv\3\2\2\2xw\3\2\2\2y{\3\2\2\2zu\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2"+
		"}\7\3\2\2\2~|\3\2\2\2\177\u0081\b\5\1\2\u0080\u0082\5\n\6\2\u0081\u0080"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\79\2\2\u0084"+
		"\u0085\5\f\7\2\u0085\u0086\7:\2\2\u0086\u0087\5\24\13\2\u0087\t\3\2\2"+
		"\2\u0088\u0089\7>\2\2\u0089\u008a\7Y\2\2\u008a\13\3\2\2\2\u008b\u0090"+
		"\5\16\b\2\u008c\u008d\7;\2\2\u008d\u008f\5\16\b\2\u008e\u008c\3\2\2\2"+
		"\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\r\3"+
		"\2\2\2\u0092\u0090\3\2\2\2\u0093\u00a0\5\20\t\2\u0094\u0095\7\3\2\2\u0095"+
		"\u009a\5\20\t\2\u0096\u0097\7<\2\2\u0097\u0099\5\20\t\2\u0098\u0096\3"+
		"\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\5\2\2\u009e\u00a0\3\2"+
		"\2\2\u009f\u0093\3\2\2\2\u009f\u0094\3\2\2\2\u00a0\17\3\2\2\2\u00a1\u00a8"+
		"\5\30\r\2\u00a2\u00a8\5\34\17\2\u00a3\u00a8\5\"\22\2\u00a4\u00a8\5\36"+
		"\20\2\u00a5\u00a8\5\26\f\2\u00a6\u00a8\5\22\n\2\u00a7\u00a1\3\2\2\2\u00a7"+
		"\u00a2\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a6\3\2\2\2\u00a8\21\3\2\2\2\u00a9\u00aa\7[\2\2\u00aa\u00ab"+
		"\7\3\2\2\u00ab\u00b0\t\3\2\2\u00ac\u00ad\7\4\2\2\u00ad\u00af\t\3\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\5\2\2\u00b4"+
		"\u00b5\b\n\1\2\u00b5\23\3\2\2\2\u00b6\u00b7\5\32\16\2\u00b7\25\3\2\2\2"+
		"\u00b8\u00b9\5,\27\2\u00b9\u00ba\7\6\2\2\u00ba\u00bb\5,\27\2\u00bb\u00c5"+
		"\3\2\2\2\u00bc\u00bd\5,\27\2\u00bd\u00be\7\7\2\2\u00be\u00bf\5,\27\2\u00bf"+
		"\u00c5\3\2\2\2\u00c0\u00c1\5,\27\2\u00c1\u00c2\7\b\2\2\u00c2\u00c3\5,"+
		"\27\2\u00c3\u00c5\3\2\2\2\u00c4\u00b8\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4"+
		"\u00c0\3\2\2\2\u00c5\27\3\2\2\2\u00c6\u00c7\7\t\2\2\u00c7\u00c8\5.\30"+
		"\2\u00c8\u00c9\7\n\2\2\u00c9\u00ca\5\60\31\2\u00ca\u00e8\3\2\2\2\u00cb"+
		"\u00cc\7\13\2\2\u00cc\u00cd\5,\27\2\u00cd\u00ce\7\n\2\2\u00ce\u00cf\5"+
		"\60\31\2\u00cf\u00e8\3\2\2\2\u00d0\u00d1\7\13\2\2\u00d1\u00d2\5,\27\2"+
		"\u00d2\u00d3\7\f\2\2\u00d3\u00d4\5.\30\2\u00d4\u00e8\3\2\2\2\u00d5\u00d6"+
		"\5.\30\2\u00d6\u00d7\7\r\2\2\u00d7\u00d8\5\60\31\2\u00d8\u00e8\3\2\2\2"+
		"\u00d9\u00da\5.\30\2\u00da\u00db\7\16\2\2\u00db\u00dc\5\60\31\2\u00dc"+
		"\u00e8\3\2\2\2\u00dd\u00de\5.\30\2\u00de\u00df\7\17\2\2\u00df\u00e0\5"+
		".\30\2\u00e0\u00e8\3\2\2\2\u00e1\u00e2\7\20\2\2\u00e2\u00e3\5\60\31\2"+
		"\u00e3\u00e4\7\4\2\2\u00e4\u00e5\5\60\31\2\u00e5\u00e6\7\5\2\2\u00e6\u00e8"+
		"\3\2\2\2\u00e7\u00c6\3\2\2\2\u00e7\u00cb\3\2\2\2\u00e7\u00d0\3\2\2\2\u00e7"+
		"\u00d5\3\2\2\2\u00e7\u00d9\3\2\2\2\u00e7\u00dd\3\2\2\2\u00e7\u00e1\3\2"+
		"\2\2\u00e8\31\3\2\2\2\u00e9\u00eb\7\13\2\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\5,\27\2\u00ed\u00ee\7\21\2\2"+
		"\u00ee\u00ef\5\60\31\2\u00ef\u0101\3\2\2\2\u00f0\u00f1\7\t\2\2\u00f1\u00f2"+
		"\5.\30\2\u00f2\u00f3\7\21\2\2\u00f3\u00f4\5\60\31\2\u00f4\u00f5\b\16\1"+
		"\2\u00f5\u0101\3\2\2\2\u00f6\u00f7\5,\27\2\u00f7\u00f8\7\22\2\2\u00f8"+
		"\u00f9\5\60\31\2\u00f9\u0101\3\2\2\2\u00fa\u00fb\7\23\2\2\u00fb\u00fc"+
		"\5.\30\2\u00fc\u00fd\7\22\2\2\u00fd\u00fe\5\60\31\2\u00fe\u0101\3\2\2"+
		"\2\u00ff\u0101\7\24\2\2\u0100\u00ea\3\2\2\2\u0100\u00f0\3\2\2\2\u0100"+
		"\u00f6\3\2\2\2\u0100\u00fa\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\33\3\2\2"+
		"\2\u0102\u0104\7\13\2\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\5,\27\2\u0106\u0107\7\25\2\2\u0107\u0108\5"+
		"\60\31\2\u0108\u012f\3\2\2\2\u0109\u010a\7\t\2\2\u010a\u010b\5.\30\2\u010b"+
		"\u010c\7\25\2\2\u010c\u010d\5\60\31\2\u010d\u012f\3\2\2\2\u010e\u010f"+
		"\5,\27\2\u010f\u0110\7\26\2\2\u0110\u0111\5\60\31\2\u0111\u012f\3\2\2"+
		"\2\u0112\u0113\5\60\31\2\u0113\u0114\7\27\2\2\u0114\u012f\3\2\2\2\u0115"+
		"\u0116\5\60\31\2\u0116\u0117\7\30\2\2\u0117\u012f\3\2\2\2\u0118\u0119"+
		"\5\60\31\2\u0119\u011a\7\31\2\2\u011a\u012f\3\2\2\2\u011b\u011c\7\32\2"+
		"\2\u011c\u011d\5\60\31\2\u011d\u0120\7\33\2\2\u011e\u0121\5(\25\2\u011f"+
		"\u0121\5*\26\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u012f\3\2"+
		"\2\2\u0122\u0123\5,\27\2\u0123\u0124\7\34\2\2\u0124\u0125\5,\27\2\u0125"+
		"\u012f\3\2\2\2\u0126\u0127\5,\27\2\u0127\u0128\7\34\2\2\u0128\u0129\5"+
		",\27\2\u0129\u012a\7\35\2\2\u012a\u012b\5\60\31\2\u012b\u012c\7\4\2\2"+
		"\u012c\u012d\5\60\31\2\u012d\u012f\3\2\2\2\u012e\u0103\3\2\2\2\u012e\u0109"+
		"\3\2\2\2\u012e\u010e\3\2\2\2\u012e\u0112\3\2\2\2\u012e\u0115\3\2\2\2\u012e"+
		"\u0118\3\2\2\2\u012e\u011b\3\2\2\2\u012e\u0122\3\2\2\2\u012e\u0126\3\2"+
		"\2\2\u012f\35\3\2\2\2\u0130\u0131\7\36\2\2\u0131\u0132\7@\2\2\u0132\u0133"+
		"\5 \21\2\u0133\u0134\7\37\2\2\u0134\u0135\58\35\2\u0135\u0161\3\2\2\2"+
		"\u0136\u0137\7 \2\2\u0137\u0138\7Z\2\2\u0138\u0139\7@\2\2\u0139\u013a"+
		"\5 \21\2\u013a\u013b\7\37\2\2\u013b\u013c\58\35\2\u013c\u0161\3\2\2\2"+
		"\u013d\u013e\7!\2\2\u013e\u013f\7Z\2\2\u013f\u0140\7@\2\2\u0140\u0141"+
		"\5 \21\2\u0141\u0142\7\37\2\2\u0142\u0143\58\35\2\u0143\u0161\3\2\2\2"+
		"\u0144\u0145\7\"\2\2\u0145\u0146\7Z\2\2\u0146\u0147\7@\2\2\u0147\u0148"+
		"\5 \21\2\u0148\u0149\7\37\2\2\u0149\u014a\58\35\2\u014a\u0161\3\2\2\2"+
		"\u014b\u014c\7#\2\2\u014c\u014d\7Z\2\2\u014d\u014e\7@\2\2\u014e\u014f"+
		"\5 \21\2\u014f\u0150\7\37\2\2\u0150\u0151\58\35\2\u0151\u0161\3\2\2\2"+
		"\u0152\u0153\7$\2\2\u0153\u0154\7Z\2\2\u0154\u0155\7@\2\2\u0155\u0156"+
		"\5 \21\2\u0156\u0157\7\37\2\2\u0157\u0158\58\35\2\u0158\u0161\3\2\2\2"+
		"\u0159\u015a\7%\2\2\u015a\u015b\7Z\2\2\u015b\u015c\7@\2\2\u015c\u015d"+
		"\5 \21\2\u015d\u015e\7\37\2\2\u015e\u015f\58\35\2\u015f\u0161\3\2\2\2"+
		"\u0160\u0130\3\2\2\2\u0160\u0136\3\2\2\2\u0160\u013d\3\2\2\2\u0160\u0144"+
		"\3\2\2\2\u0160\u014b\3\2\2\2\u0160\u0152\3\2\2\2\u0160\u0159\3\2\2\2\u0161"+
		"\37\3\2\2\2\u0162\u0167\5\16\b\2\u0163\u0164\7;\2\2\u0164\u0166\5\16\b"+
		"\2\u0165\u0163\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168"+
		"\3\2\2\2\u0168!\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016d\5$\23\2\u016b"+
		"\u016d\5&\24\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d#\3\2\2\2"+
		"\u016e\u016f\7Z\2\2\u016f\u0170\5D#\2\u0170\u0171\7Z\2\2\u0171\u018f\3"+
		"\2\2\2\u0172\u0173\58\35\2\u0173\u0174\5D#\2\u0174\u0175\58\35\2\u0175"+
		"\u018f\3\2\2\2\u0176\u0177\5.\30\2\u0177\u0178\5D#\2\u0178\u0179\5.\30"+
		"\2\u0179\u018f\3\2\2\2\u017a\u017b\5:\36\2\u017b\u017c\5D#\2\u017c\u017d"+
		"\5:\36\2\u017d\u018f\3\2\2\2\u017e\u017f\5<\37\2\u017f\u0180\5D#\2\u0180"+
		"\u0181\5<\37\2\u0181\u018f\3\2\2\2\u0182\u0183\5> \2\u0183\u0184\5D#\2"+
		"\u0184\u0185\5> \2\u0185\u018f\3\2\2\2\u0186\u0187\5@!\2\u0187\u0188\5"+
		"D#\2\u0188\u0189\5@!\2\u0189\u018f\3\2\2\2\u018a\u018b\5,\27\2\u018b\u018c"+
		"\5D#\2\u018c\u018d\5,\27\2\u018d\u018f\3\2\2\2\u018e\u016e\3\2\2\2\u018e"+
		"\u0172\3\2\2\2\u018e\u0176\3\2\2\2\u018e\u017a\3\2\2\2\u018e\u017e\3\2"+
		"\2\2\u018e\u0182\3\2\2\2\u018e\u0186\3\2\2\2\u018e\u018a\3\2\2\2\u018f"+
		"%\3\2\2\2\u0190\u0191\7Z\2\2\u0191\u0192\5F$\2\u0192\u0193\7Z\2\2\u0193"+
		"\u01a5\3\2\2\2\u0194\u0195\58\35\2\u0195\u0196\5F$\2\u0196\u0197\58\35"+
		"\2\u0197\u01a5\3\2\2\2\u0198\u0199\5.\30\2\u0199\u019a\5F$\2\u019a\u019b"+
		"\5.\30\2\u019b\u01a5\3\2\2\2\u019c\u019d\5:\36\2\u019d\u019e\5F$\2\u019e"+
		"\u019f\5:\36\2\u019f\u01a5\3\2\2\2\u01a0\u01a1\5<\37\2\u01a1\u01a2\5F"+
		"$\2\u01a2\u01a3\5<\37\2\u01a3\u01a5\3\2\2\2\u01a4\u0190\3\2\2\2\u01a4"+
		"\u0194\3\2\2\2\u01a4\u0198\3\2\2\2\u01a4\u019c\3\2\2\2\u01a4\u01a0\3\2"+
		"\2\2\u01a5\'\3\2\2\2\u01a6\u01a7\t\4\2\2\u01a7)\3\2\2\2\u01a8\u01a9\7"+
		"Y\2\2\u01a9+\3\2\2\2\u01aa\u01ab\t\3\2\2\u01ab-\3\2\2\2\u01ac\u01b5\7"+
		"Y\2\2\u01ad\u01b5\7Z\2\2\u01ae\u01af\5,\27\2\u01af\u01b0\7A\2\2\u01b0"+
		"\u01b5\3\2\2\2\u01b1\u01b2\5\60\31\2\u01b2\u01b3\7A\2\2\u01b3\u01b5\3"+
		"\2\2\2\u01b4\u01ac\3\2\2\2\u01b4\u01ad\3\2\2\2\u01b4\u01ae\3\2\2\2\u01b4"+
		"\u01b1\3\2\2\2\u01b5/\3\2\2\2\u01b6\u01b7\5\62\32\2\u01b7\u01b8\b\31\1"+
		"\2\u01b8\u01c0\3\2\2\2\u01b9\u01ba\5\64\33\2\u01ba\u01bb\b\31\1\2\u01bb"+
		"\u01c0\3\2\2\2\u01bc\u01bd\5\66\34\2\u01bd\u01be\b\31\1\2\u01be\u01c0"+
		"\3\2\2\2\u01bf\u01b6\3\2\2\2\u01bf\u01b9\3\2\2\2\u01bf\u01bc\3\2\2\2\u01c0"+
		"\61\3\2\2\2\u01c1\u01c2\t\3\2\2\u01c2\63\3\2\2\2\u01c3\u01c4\t\3\2\2\u01c4"+
		"\u01c5\7\62\2\2\u01c5\u01c6\t\3\2\2\u01c6\65\3\2\2\2\u01c7\u01c8\t\3\2"+
		"\2\u01c8\u01c9\7\62\2\2\u01c9\u01ca\t\3\2\2\u01ca\u01cb\7\62\2\2\u01cb"+
		"\u01cc\t\3\2\2\u01cc\67\3\2\2\2\u01cd\u01d6\7\\\2\2\u01ce\u01cf\7\3\2"+
		"\2\u01cf\u01d0\58\35\2\u01d0\u01d1\5H%\2\u01d1\u01d2\58\35\2\u01d2\u01d3"+
		"\7\5\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d6\7Z\2\2\u01d5\u01cd\3\2\2\2\u01d5"+
		"\u01ce\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d69\3\2\2\2\u01d7\u01d8\7V\2\2\u01d8"+
		"\u01e9\b\36\1\2\u01d9\u01da\7W\2\2\u01da\u01e9\b\36\1\2\u01db\u01dc\7"+
		"X\2\2\u01dc\u01e9\b\36\1\2\u01dd\u01de\7\3\2\2\u01de\u01df\5:\36\2\u01df"+
		"\u01e0\7M\2\2\u01e0\u01e1\5<\37\2\u01e1\u01e2\7\5\2\2\u01e2\u01e9\3\2"+
		"\2\2\u01e3\u01e4\7\63\2\2\u01e4\u01e5\5\60\31\2\u01e5\u01e6\7\5\2\2\u01e6"+
		"\u01e9\3\2\2\2\u01e7\u01e9\7Z\2\2\u01e8\u01d7\3\2\2\2\u01e8\u01d9\3\2"+
		"\2\2\u01e8\u01db\3\2\2\2\u01e8\u01dd\3\2\2\2\u01e8\u01e3\3\2\2\2\u01e8"+
		"\u01e7\3\2\2\2\u01e9;\3\2\2\2\u01ea\u01eb\7U\2\2\u01eb\u01fa\b\37\1\2"+
		"\u01ec\u01ed\7\3\2\2\u01ed\u01ee\5:\36\2\u01ee\u01ef\7N\2\2\u01ef\u01f0"+
		"\5:\36\2\u01f0\u01f1\7\5\2\2\u01f1\u01fa\3\2\2\2\u01f2\u01f3\7\64\2\2"+
		"\u01f3\u01f4\5\60\31\2\u01f4\u01f5\7\4\2\2\u01f5\u01f6\5\60\31\2\u01f6"+
		"\u01f7\7\5\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01fa\7Z\2\2\u01f9\u01ea\3\2"+
		"\2\2\u01f9\u01ec\3\2\2\2\u01f9\u01f2\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa"+
		"=\3\2\2\2\u01fb\u01fc\5\60\31\2\u01fc\u01fd\7D\2\2\u01fd?\3\2\2\2\u01fe"+
		"\u01ff\5\60\31\2\u01ff\u0200\7C\2\2\u0200A\3\2\2\2\u0201\u0202\7\65\2"+
		"\2\u0202\u0203\5\60\31\2\u0203\u0204\7\33\2\2\u0204\u0205\7Y\2\2\u0205"+
		"C\3\2\2\2\u0206\u0209\7E\2\2\u0207\u0209\7F\2\2\u0208\u0206\3\2\2\2\u0208"+
		"\u0207\3\2\2\2\u0209E\3\2\2\2\u020a\u020f\7G\2\2\u020b\u020f\7H\2\2\u020c"+
		"\u020f\7I\2\2\u020d\u020f\7J\2\2\u020e\u020a\3\2\2\2\u020e\u020b\3\2\2"+
		"\2\u020e\u020c\3\2\2\2\u020e\u020d\3\2\2\2\u020fG\3\2\2\2\u0210\u0215"+
		"\7K\2\2\u0211\u0215\7L\2\2\u0212\u0215\7M\2\2\u0213\u0215\7N\2\2\u0214"+
		"\u0210\3\2\2\2\u0214\u0211\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0213\3\2"+
		"\2\2\u0215I\3\2\2\2#NTZksx|\u0081\u0090\u009a\u009f\u00a7\u00b0\u00c4"+
		"\u00e7\u00ea\u0100\u0103\u0120\u012e\u0160\u0167\u016c\u018e\u01a4\u01b4"+
		"\u01bf\u01d5\u01e8\u01f9\u0208\u020e\u0214";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}