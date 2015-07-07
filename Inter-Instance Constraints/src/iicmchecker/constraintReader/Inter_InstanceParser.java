// Generated from Inter_Instance.g4 by ANTLR 4.5

  package iicmchecker.constraintReader;
	
  import iicmchecker.constraintReader.ParserHelper;
  import java.util.logging.Logger;
  import java.util.logging.Level;
  import iicmchecker.logging.LoggerFactory;
  import iicmchecker.exceptions.UnexpectedContextException;

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
		MULTILINE_COMMENTS=39, SINGLE_LINE_COMMENTS=40, SET=41, IF=42, THEN=43, 
		NEG=44, KONJ=45, DISJ=46, DEF=47, DESC=48, ARGS=49, WHERE=50, ROLE=51, 
		TASKINSTANCE=52, WORKFLOWINSTANCE=53, WORKFLOW=54, TIMESTAMP=55, EQUAL=56, 
		NOTEQUAL=57, LOWER=58, LEQ=59, GREATER=60, GEQ=61, MUL=62, DIV=63, ADD=64, 
		SUB=65, GEN=66, YEARS=67, MONTHS=68, DAYS=69, HOURS=70, MINUTES=71, SECONDS=72, 
		TIMEINTERVAL=73, DATETIME=74, DATE=75, TIME=76, CONSTANT=77, VARIABLE=78, 
		CLAUSE=79, NUMBER=80, STRING=81, WS=82, EVENTTYPE=83;
	public static final int
		RULE_file = 0, RULE_define = 1, RULE_explicitSetting = 2, RULE_assignment = 3, 
		RULE_description = 4, RULE_assignmentBody = 5, RULE_clauses = 6, RULE_disjunction = 7, 
		RULE_negation = 8, RULE_atoms = 9, RULE_definedClause = 10, RULE_assignmentHead = 11, 
		RULE_extern = 12, RULE_specification = 13, RULE_enforcement = 14, RULE_status = 15, 
		RULE_conditional = 16, RULE_conditionalBody = 17, RULE_comparison = 18, 
		RULE_equalityExpr = 19, RULE_inequalityExpr = 20, RULE_event = 21, RULE_unknownEvent = 22, 
		RULE_ut = 23, RULE_rt = 24, RULE_tt = 25, RULE_intra = 26, RULE_inter = 27, 
		RULE_interp = 28, RULE_nt = 29, RULE_st = 30, RULE_tp = 31, RULE_ts = 32, 
		RULE_wt = 33, RULE_wi = 34, RULE_equality = 35, RULE_inequality = 36, 
		RULE_arithmetic = 37;
	public static final String[] ruleNames = {
		"file", "define", "explicitSetting", "assignment", "description", "assignmentBody", 
		"clauses", "disjunction", "negation", "atoms", "definedClause", "assignmentHead", 
		"extern", "specification", "enforcement", "status", "conditional", "conditionalBody", 
		"comparison", "equalityExpr", "inequalityExpr", "event", "unknownEvent", 
		"ut", "rt", "tt", "intra", "inter", "interp", "nt", "st", "tp", "ts", 
		"wt", "wi", "equality", "inequality", "arithmetic"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "','", "')'", "'is related to'", "'is partner of'", "'is in same group as'", 
		"'role'", "'can execute'", "'user'", "'belongs to role'", "'is glb of'", 
		"'is lub'", "'dominates'", "'critical_task_pair('", "'cannot execute'", 
		"'must execute'", "'mrole'", "'panic'", "'executed'", "'is assigned to'", 
		"'aborted'", "'succeeded'", "'started'", "'EventType('", "').'", "'is collaborator of'", 
		"'NUMBER'", "'IS'", "'NUMBER OF'", "'NUMBER OF DIFF'", "'SUM OF'", "'AVG OF'", 
		"'MIN OF'", "'MAX OF'", "'.'", "'Num_Var('", "'String_Var('", "'timeinterval('", 
		null, null, null, null, "'THEN'", null, null, null, null, null, null, 
		"'WHERE'", "'.Role'", "'.InstanceID'", null, "'.Workflow'", "'.Timestamp'", 
		"'='", "'!='", "'<'", "'<='", "'>'", "'>='", "'*'", "'/'", "'+'", "'-'", 
		"'GENERATED'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "MULTILINE_COMMENTS", "SINGLE_LINE_COMMENTS", "SET", 
		"IF", "THEN", "NEG", "KONJ", "DISJ", "DEF", "DESC", "ARGS", "WHERE", "ROLE", 
		"TASKINSTANCE", "WORKFLOWINSTANCE", "WORKFLOW", "TIMESTAMP", "EQUAL", 
		"NOTEQUAL", "LOWER", "LEQ", "GREATER", "GEQ", "MUL", "DIV", "ADD", "SUB", 
		"GEN", "YEARS", "MONTHS", "DAYS", "HOURS", "MINUTES", "SECONDS", "TIMEINTERVAL", 
		"DATETIME", "DATE", "TIME", "CONSTANT", "VARIABLE", "CLAUSE", "NUMBER", 
		"STRING", "WS", "EVENTTYPE"
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
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(77);
				define();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SET) {
				{
				{
				setState(83);
				explicitSetting();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF || _la==DESC) {
				{
				{
				setState(89);
				assignment();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
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
			setState(98);
			match(DEF);
			setState(99);
			((DefineContext)_localctx).CLAUSE = match(CLAUSE);
			ph.addClause((((DefineContext)_localctx).CLAUSE!=null?((DefineContext)_localctx).CLAUSE.getText():null));
			setState(101);
			match(T__0);
			setState(102);
			((DefineContext)_localctx).ARGS = match(ARGS);
			ph.addArgTypeToClause((((DefineContext)_localctx).CLAUSE!=null?((DefineContext)_localctx).CLAUSE.getText():null), (((DefineContext)_localctx).ARGS!=null?((DefineContext)_localctx).ARGS.getText():null));
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				{
				setState(104);
				match(T__1);
				}
				setState(105);
				((DefineContext)_localctx).ARGS = match(ARGS);
				ph.addArgTypeToClause((((DefineContext)_localctx).CLAUSE!=null?((DefineContext)_localctx).CLAUSE.getText():null), (((DefineContext)_localctx).ARGS!=null?((DefineContext)_localctx).ARGS.getText():null));
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
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
		public List<DefinedClauseContext> definedClause() {
			return getRuleContexts(DefinedClauseContext.class);
		}
		public DefinedClauseContext definedClause(int i) {
			return getRuleContext(DefinedClauseContext.class,i);
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
			setState(114);
			match(SET);
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(115);
				extern();
				}
				break;
			case 2:
				{
				setState(116);
				specification();
				}
				break;
			case 3:
				{
				setState(117);
				definedClause();
				}
				break;
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==KONJ) {
				{
				{
				setState(120);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==KONJ) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(124);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(121);
					extern();
					}
					break;
				case 2:
					{
					setState(122);
					specification();
					}
					break;
				case 3:
					{
					setState(123);
					definedClause();
					}
					break;
				}
				}
				}
				setState(130);
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
			setState(133);
			_la = _input.LA(1);
			if (_la==DESC) {
				{
				setState(132);
				description();
				}
			}

			setState(135);
			match(IF);
			setState(136);
			assignmentBody();
			setState(137);
			match(THEN);
			setState(138);
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
			setState(140);
			match(DESC);
			setState(141);
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
			setState(143);
			clauses();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KONJ) {
				{
				{
				setState(144);
				match(KONJ);
				setState(145);
				clauses();
				}
				}
				setState(150);
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
		public AtomsContext atoms() {
			return getRuleContext(AtomsContext.class,0);
		}
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
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
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				atoms();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				disjunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				negation();
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

	public static class DisjunctionContext extends ParserRuleContext {
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
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitDisjunction(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_disjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__0);
			setState(157);
			atoms();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DISJ) {
				{
				{
				setState(158);
				match(DISJ);
				setState(159);
				atoms();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
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

	public static class NegationContext extends ParserRuleContext {
		public TerminalNode NEG() { return getToken(Inter_InstanceParser.NEG, 0); }
		public AtomsContext atoms() {
			return getRuleContext(AtomsContext.class,0);
		}
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitNegation(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(NEG);
			setState(168);
			atoms();
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
		enterRule(_localctx, 18, RULE_atoms);
		try {
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				specification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				status();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				comparison();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				extern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
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
		enterRule(_localctx, 20, RULE_definedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			((DefinedClauseContext)_localctx).CLAUSE = match(CLAUSE);
			setState(179);
			match(T__0);
			setState(180);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(181);
				match(T__1);
				setState(182);
				_la = _input.LA(1);
				if ( !(_la==CONSTANT || _la==VARIABLE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(T__2);
			 ph.existsClause((((DefinedClauseContext)_localctx).CLAUSE!=null?((DefinedClauseContext)_localctx).CLAUSE.getText():null));
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
		public DefinedClauseContext definedClause() {
			return getRuleContext(DefinedClauseContext.class,0);
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
		enterRule(_localctx, 22, RULE_assignmentHead);
		try {
			setState(193);
			switch (_input.LA(1)) {
			case T__6:
			case T__8:
			case T__16:
			case T__17:
			case CONSTANT:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				enforcement();
				}
				break;
			case CLAUSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				definedClause();
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
		enterRule(_localctx, 24, RULE_extern);
		try {
			setState(207);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new RelatedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				ut();
				setState(196);
				match(T__3);
				setState(197);
				ut();
				}
				break;
			case 2:
				_localctx = new PartnerofContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				ut();
				setState(200);
				match(T__4);
				setState(201);
				ut();
				}
				break;
			case 3:
				_localctx = new SamegroupContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				ut();
				setState(204);
				match(T__5);
				setState(205);
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
		enterRule(_localctx, 26, RULE_specification);
		try {
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new RoleTaskContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(T__6);
				setState(210);
				rt();
				setState(211);
				match(T__7);
				setState(212);
				tt();
				}
				break;
			case 2:
				_localctx = new UserTaskContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(T__8);
				setState(215);
				ut();
				setState(216);
				match(T__7);
				setState(217);
				tt();
				}
				break;
			case 3:
				_localctx = new UserRoleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(T__8);
				setState(220);
				ut();
				setState(221);
				match(T__9);
				setState(222);
				rt();
				}
				break;
			case 4:
				_localctx = new GlbContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				rt();
				setState(225);
				match(T__10);
				setState(226);
				tt();
				}
				break;
			case 5:
				_localctx = new LubContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				rt();
				setState(229);
				match(T__11);
				setState(230);
				tt();
				}
				break;
			case 6:
				_localctx = new DominateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				rt();
				setState(233);
				match(T__12);
				setState(234);
				rt();
				}
				break;
			case 7:
				_localctx = new CritTaskPairContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(236);
				match(T__13);
				setState(237);
				tt();
				setState(238);
				match(T__1);
				setState(239);
				tt();
				setState(240);
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
		enterRule(_localctx, 28, RULE_enforcement);
		int _la;
		try {
			setState(266);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new CannotUserContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(244);
					match(T__8);
					}
				}

				setState(247);
				ut();
				setState(248);
				match(T__14);
				setState(249);
				tt();
				}
				break;
			case 2:
				_localctx = new CannotRoleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(T__6);
				setState(252);
				((CannotRoleContext)_localctx).r = rt();
				setState(253);
				match(T__14);
				setState(254);
				tt();
				}
				break;
			case 3:
				_localctx = new MustUserContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				ut();
				setState(257);
				match(T__15);
				setState(258);
				tt();
				}
				break;
			case 4:
				_localctx = new MustRoleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				match(T__16);
				setState(261);
				rt();
				setState(262);
				match(T__15);
				setState(263);
				tt();
				}
				break;
			case 5:
				_localctx = new PanicContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
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
		enterRule(_localctx, 30, RULE_status);
		int _la;
		try {
			setState(304);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new ExecutedUserContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(268);
					match(T__8);
					}
				}

				setState(271);
				ut();
				setState(272);
				match(T__18);
				setState(273);
				tt();
				}
				break;
			case 2:
				_localctx = new ExecutedRoleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(T__6);
				setState(276);
				rt();
				setState(277);
				match(T__18);
				setState(278);
				tt();
				}
				break;
			case 3:
				_localctx = new AssignedUserContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				ut();
				setState(281);
				match(T__19);
				setState(282);
				tt();
				}
				break;
			case 4:
				_localctx = new AbortedTaskContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				tt();
				setState(285);
				match(T__20);
				}
				break;
			case 5:
				_localctx = new SucceededTaskContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				tt();
				setState(288);
				match(T__21);
				}
				break;
			case 6:
				_localctx = new StartedTaskContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(290);
				tt();
				setState(291);
				match(T__22);
				}
				break;
			case 7:
				_localctx = new FlexibleEventContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(293);
				match(T__23);
				setState(294);
				tt();
				setState(295);
				match(T__24);
				setState(298);
				switch (_input.LA(1)) {
				case EVENTTYPE:
					{
					setState(296);
					event();
					}
					break;
				case CONSTANT:
					{
					setState(297);
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
				setState(300);
				ut();
				setState(301);
				match(T__25);
				setState(302);
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
		enterRule(_localctx, 32, RULE_conditional);
		try {
			setState(354);
			switch (_input.LA(1)) {
			case T__26:
				_localctx = new NumSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(T__26);
				setState(307);
				match(WHERE);
				setState(308);
				conditionalBody();
				setState(309);
				match(T__27);
				setState(310);
				nt();
				}
				break;
			case T__28:
				_localctx = new NumVarsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(T__28);
				setState(313);
				match(VARIABLE);
				setState(314);
				match(WHERE);
				setState(315);
				conditionalBody();
				setState(316);
				match(T__27);
				setState(317);
				nt();
				}
				break;
			case T__29:
				_localctx = new NumDiffContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				match(T__29);
				setState(320);
				match(VARIABLE);
				setState(321);
				match(WHERE);
				setState(322);
				conditionalBody();
				setState(323);
				match(T__27);
				setState(324);
				nt();
				}
				break;
			case T__30:
				_localctx = new SumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				match(T__30);
				setState(327);
				match(VARIABLE);
				setState(328);
				match(WHERE);
				setState(329);
				conditionalBody();
				setState(330);
				match(T__27);
				setState(331);
				nt();
				}
				break;
			case T__31:
				_localctx = new AvgContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(333);
				match(T__31);
				setState(334);
				match(VARIABLE);
				setState(335);
				match(WHERE);
				setState(336);
				conditionalBody();
				setState(337);
				match(T__27);
				setState(338);
				nt();
				}
				break;
			case T__32:
				_localctx = new MinContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(340);
				match(T__32);
				setState(341);
				match(VARIABLE);
				setState(342);
				match(WHERE);
				setState(343);
				conditionalBody();
				setState(344);
				match(T__27);
				setState(345);
				nt();
				}
				break;
			case T__33:
				_localctx = new MaxContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(347);
				match(T__33);
				setState(348);
				match(VARIABLE);
				setState(349);
				match(WHERE);
				setState(350);
				conditionalBody();
				setState(351);
				match(T__27);
				setState(352);
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
		enterRule(_localctx, 34, RULE_conditionalBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			clauses();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KONJ) {
				{
				{
				setState(357);
				match(KONJ);
				setState(358);
				clauses();
				}
				}
				setState(363);
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
		enterRule(_localctx, 36, RULE_comparison);
		try {
			setState(366);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				equalityExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
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
		enterRule(_localctx, 38, RULE_equalityExpr);
		try {
			setState(400);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(VARIABLE);
				setState(369);
				equality();
				setState(370);
				match(VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				nt();
				setState(373);
				equality();
				setState(374);
				nt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				rt();
				setState(377);
				equality();
				setState(378);
				rt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(380);
				tp();
				setState(381);
				equality();
				setState(382);
				tp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(384);
				ts();
				setState(385);
				equality();
				setState(386);
				ts();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(388);
				wt();
				setState(389);
				equality();
				setState(390);
				wt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(392);
				wi();
				setState(393);
				equality();
				setState(394);
				wi();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(396);
				ut();
				setState(397);
				equality();
				setState(398);
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
		enterRule(_localctx, 40, RULE_inequalityExpr);
		try {
			setState(422);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				match(VARIABLE);
				setState(403);
				inequality();
				setState(404);
				match(VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				nt();
				setState(407);
				inequality();
				setState(408);
				nt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
				rt();
				setState(411);
				inequality();
				setState(412);
				rt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(414);
				tp();
				setState(415);
				inequality();
				setState(416);
				tp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(418);
				ts();
				setState(419);
				inequality();
				setState(420);
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
		public TerminalNode EVENTTYPE() { return getToken(Inter_InstanceParser.EVENTTYPE, 0); }
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
		enterRule(_localctx, 42, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(EVENTTYPE);
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
		enterRule(_localctx, 44, RULE_unknownEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
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
		enterRule(_localctx, 46, RULE_ut);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
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
		enterRule(_localctx, 48, RULE_rt);
		try {
			setState(438);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(CONSTANT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(VARIABLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				ut();
				setState(433);
				match(ROLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				tt();
				setState(436);
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
		enterRule(_localctx, 50, RULE_tt);
		try {
			setState(449);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
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
				setState(443);
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
				setState(446);
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
		enterRule(_localctx, 52, RULE_intra);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 54, RULE_inter);
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
			match(T__34);
			setState(455);
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
		enterRule(_localctx, 56, RULE_interp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(458);
			match(T__34);
			setState(459);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(460);
			match(T__34);
			setState(461);
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
		public List<NtContext> nt() {
			return getRuleContexts(NtContext.class);
		}
		public NtContext nt(int i) {
			return getRuleContext(NtContext.class,i);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(Inter_InstanceParser.CONSTANT, 0); }
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
		enterRule(_localctx, 58, RULE_nt);
		try {
			setState(476);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(NUMBER);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(VARIABLE);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				match(T__0);
				setState(466);
				nt();
				setState(467);
				arithmetic();
				setState(468);
				nt();
				setState(469);
				match(T__2);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
				match(T__35);
				setState(472);
				tt();
				setState(473);
				match(T__24);
				setState(474);
				match(CONSTANT);
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

	public static class StContext extends ParserRuleContext {
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(Inter_InstanceParser.CONSTANT, 0); }
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public StContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitSt(this);
		}
	}

	public final StContext st() throws RecognitionException {
		StContext _localctx = new StContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_st);
		try {
			setState(484);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(T__36);
				setState(479);
				tt();
				setState(480);
				match(T__24);
				setState(481);
				match(CONSTANT);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
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
		public TerminalNode TIMESTAMP() { return getToken(Inter_InstanceParser.TIMESTAMP, 0); }
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
		enterRule(_localctx, 62, RULE_tp);
		try {
			setState(502);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new DateTimeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				((DateTimeContext)_localctx).DATETIME = match(DATETIME);
				ph.checkDateTime((((DateTimeContext)_localctx).DATETIME!=null?((DateTimeContext)_localctx).DATETIME.getText():null));
				}
				break;
			case 2:
				_localctx = new DateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				((DateContext)_localctx).DATE = match(DATE);
				ph.checkDate((((DateContext)_localctx).DATE!=null?((DateContext)_localctx).DATE.getText():null));
				}
				break;
			case 3:
				_localctx = new TimeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				((TimeContext)_localctx).TIME = match(TIME);
				ph.checkTime((((TimeContext)_localctx).TIME!=null?((TimeContext)_localctx).TIME.getText():null));
				}
				break;
			case 4:
				_localctx = new RelativeTimepointContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(492);
				match(T__0);
				setState(493);
				tp();
				setState(494);
				match(ADD);
				setState(495);
				ts();
				setState(496);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new TimestampContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(498);
				tt();
				setState(499);
				match(TIMESTAMP);
				}
				break;
			case 6:
				_localctx = new VarTPContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(501);
				match(VARIABLE);
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
		enterRule(_localctx, 64, RULE_ts);
		try {
			setState(519);
			switch (_input.LA(1)) {
			case TIMEINTERVAL:
				_localctx = new AbsoluteIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				((AbsoluteIntervalContext)_localctx).TIMEINTERVAL = match(TIMEINTERVAL);
				ph.checkTimeInterval((((AbsoluteIntervalContext)_localctx).TIMEINTERVAL!=null?((AbsoluteIntervalContext)_localctx).TIMEINTERVAL.getText():null));
				}
				break;
			case T__0:
				_localctx = new TimedifferenceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				match(T__0);
				setState(507);
				tp();
				setState(508);
				match(SUB);
				setState(509);
				tp();
				setState(510);
				match(T__2);
				}
				break;
			case T__37:
				_localctx = new TimeintervalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(512);
				match(T__37);
				setState(513);
				tt();
				setState(514);
				match(T__1);
				setState(515);
				tt();
				setState(516);
				match(T__2);
				}
				break;
			case VARIABLE:
				_localctx = new VarTSContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(518);
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
		enterRule(_localctx, 66, RULE_wt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			tt();
			setState(522);
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
		enterRule(_localctx, 68, RULE_wi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			tt();
			setState(525);
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
		enterRule(_localctx, 70, RULE_equality);
		try {
			setState(529);
			switch (_input.LA(1)) {
			case EQUAL:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				match(EQUAL);
				}
				break;
			case NOTEQUAL:
				_localctx = new NoteualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
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
		enterRule(_localctx, 72, RULE_inequality);
		try {
			setState(535);
			switch (_input.LA(1)) {
			case LOWER:
				_localctx = new LowerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				match(LOWER);
				}
				break;
			case LEQ:
				_localctx = new LeqContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				match(LEQ);
				}
				break;
			case GREATER:
				_localctx = new GreaterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				match(GREATER);
				}
				break;
			case GEQ:
				_localctx = new GeqContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(534);
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
		enterRule(_localctx, 74, RULE_arithmetic);
		try {
			setState(541);
			switch (_input.LA(1)) {
			case MUL:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				match(MUL);
				}
				break;
			case DIV:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				match(DIV);
				}
				break;
			case ADD:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(539);
				match(ADD);
				}
				break;
			case SUB:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(540);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3U\u0222\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\7\2Q\n\2\f\2\16\2"+
		"T\13\2\3\2\7\2W\n\2\f\2\16\2Z\13\2\3\2\7\2]\n\2\f\2\16\2`\13\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3n\n\3\f\3\16\3q\13\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\5\4y\n\4\3\4\3\4\3\4\3\4\5\4\177\n\4\7\4\u0081\n\4"+
		"\f\4\16\4\u0084\13\4\3\5\3\5\5\5\u0088\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\7\7\u0095\n\7\f\7\16\7\u0098\13\7\3\b\3\b\3\b\5\b\u009d"+
		"\n\b\3\t\3\t\3\t\3\t\7\t\u00a3\n\t\f\t\16\t\u00a6\13\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b3\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u00ba\n\f\f\f\16\f\u00bd\13\f\3\f\3\f\3\f\3\r\3\r\5\r\u00c4\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d2"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f5\n\17\3\20\5\20\u00f8\n\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u010d\n\20\3\21\5\21\u0110\n\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u012d\n\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0133\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u0165\n\22\3\23\3\23\3\23\7\23\u016a\n\23\f\23\16\23\u016d\13\23\3\24"+
		"\3\24\5\24\u0171\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0193\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u01a9\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01b9\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u01c4\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u01df\n\37\3 \3 \3 \3 \3 \3 \5 \u01e7\n \3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01f9\n!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u020a\n\"\3#\3#\3"+
		"#\3$\3$\3$\3%\3%\5%\u0214\n%\3&\3&\3&\3&\5&\u021a\n&\3\'\3\'\3\'\3\'\5"+
		"\'\u0220\n\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJL\2\4\4\2\4\4//\3\2OP\u0251\2N\3\2\2\2\4d\3\2\2"+
		"\2\6t\3\2\2\2\b\u0085\3\2\2\2\n\u008e\3\2\2\2\f\u0091\3\2\2\2\16\u009c"+
		"\3\2\2\2\20\u009e\3\2\2\2\22\u00a9\3\2\2\2\24\u00b2\3\2\2\2\26\u00b4\3"+
		"\2\2\2\30\u00c3\3\2\2\2\32\u00d1\3\2\2\2\34\u00f4\3\2\2\2\36\u010c\3\2"+
		"\2\2 \u0132\3\2\2\2\"\u0164\3\2\2\2$\u0166\3\2\2\2&\u0170\3\2\2\2(\u0192"+
		"\3\2\2\2*\u01a8\3\2\2\2,\u01aa\3\2\2\2.\u01ac\3\2\2\2\60\u01ae\3\2\2\2"+
		"\62\u01b8\3\2\2\2\64\u01c3\3\2\2\2\66\u01c5\3\2\2\28\u01c7\3\2\2\2:\u01cb"+
		"\3\2\2\2<\u01de\3\2\2\2>\u01e6\3\2\2\2@\u01f8\3\2\2\2B\u0209\3\2\2\2D"+
		"\u020b\3\2\2\2F\u020e\3\2\2\2H\u0213\3\2\2\2J\u0219\3\2\2\2L\u021f\3\2"+
		"\2\2NR\b\2\1\2OQ\5\4\3\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SX\3\2"+
		"\2\2TR\3\2\2\2UW\5\6\4\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y^\3\2"+
		"\2\2ZX\3\2\2\2[]\5\b\5\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3"+
		"\2\2\2`^\3\2\2\2ab\7\2\2\3bc\b\2\1\2c\3\3\2\2\2de\7\61\2\2ef\7Q\2\2fg"+
		"\b\3\1\2gh\7\3\2\2hi\7\63\2\2io\b\3\1\2jk\7\4\2\2kl\7\63\2\2ln\b\3\1\2"+
		"mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\5\2\2"+
		"s\5\3\2\2\2tx\7+\2\2uy\5\32\16\2vy\5\34\17\2wy\5\26\f\2xu\3\2\2\2xv\3"+
		"\2\2\2xw\3\2\2\2y\u0082\3\2\2\2z~\t\2\2\2{\177\5\32\16\2|\177\5\34\17"+
		"\2}\177\5\26\f\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\u0081\3\2\2\2\u0080"+
		"z\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\7\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\b\5\1\2\u0086\u0088\5"+
		"\n\6\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\7,\2\2\u008a\u008b\5\f\7\2\u008b\u008c\7-\2\2\u008c\u008d\5\30"+
		"\r\2\u008d\t\3\2\2\2\u008e\u008f\7\62\2\2\u008f\u0090\7O\2\2\u0090\13"+
		"\3\2\2\2\u0091\u0096\5\16\b\2\u0092\u0093\7/\2\2\u0093\u0095\5\16\b\2"+
		"\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\r\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009d\5\24\13\2\u009a"+
		"\u009d\5\20\t\2\u009b\u009d\5\22\n\2\u009c\u0099\3\2\2\2\u009c\u009a\3"+
		"\2\2\2\u009c\u009b\3\2\2\2\u009d\17\3\2\2\2\u009e\u009f\7\3\2\2\u009f"+
		"\u00a4\5\24\13\2\u00a0\u00a1\7\60\2\2\u00a1\u00a3\5\24\13\2\u00a2\u00a0"+
		"\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\5\2\2\u00a8\21\3\2\2"+
		"\2\u00a9\u00aa\7.\2\2\u00aa\u00ab\5\24\13\2\u00ab\23\3\2\2\2\u00ac\u00b3"+
		"\5\34\17\2\u00ad\u00b3\5 \21\2\u00ae\u00b3\5&\24\2\u00af\u00b3\5\"\22"+
		"\2\u00b0\u00b3\5\32\16\2\u00b1\u00b3\5\26\f\2\u00b2\u00ac\3\2\2\2\u00b2"+
		"\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b2\u00b1\3\2\2\2\u00b3\25\3\2\2\2\u00b4\u00b5\7Q\2\2\u00b5\u00b6"+
		"\7\3\2\2\u00b6\u00bb\t\3\2\2\u00b7\u00b8\7\4\2\2\u00b8\u00ba\t\3\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\5\2\2\u00bf"+
		"\u00c0\b\f\1\2\u00c0\27\3\2\2\2\u00c1\u00c4\5\36\20\2\u00c2\u00c4\5\26"+
		"\f\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\31\3\2\2\2\u00c5\u00c6"+
		"\5\60\31\2\u00c6\u00c7\7\6\2\2\u00c7\u00c8\5\60\31\2\u00c8\u00d2\3\2\2"+
		"\2\u00c9\u00ca\5\60\31\2\u00ca\u00cb\7\7\2\2\u00cb\u00cc\5\60\31\2\u00cc"+
		"\u00d2\3\2\2\2\u00cd\u00ce\5\60\31\2\u00ce\u00cf\7\b\2\2\u00cf\u00d0\5"+
		"\60\31\2\u00d0\u00d2\3\2\2\2\u00d1\u00c5\3\2\2\2\u00d1\u00c9\3\2\2\2\u00d1"+
		"\u00cd\3\2\2\2\u00d2\33\3\2\2\2\u00d3\u00d4\7\t\2\2\u00d4\u00d5\5\62\32"+
		"\2\u00d5\u00d6\7\n\2\2\u00d6\u00d7\5\64\33\2\u00d7\u00f5\3\2\2\2\u00d8"+
		"\u00d9\7\13\2\2\u00d9\u00da\5\60\31\2\u00da\u00db\7\n\2\2\u00db\u00dc"+
		"\5\64\33\2\u00dc\u00f5\3\2\2\2\u00dd\u00de\7\13\2\2\u00de\u00df\5\60\31"+
		"\2\u00df\u00e0\7\f\2\2\u00e0\u00e1\5\62\32\2\u00e1\u00f5\3\2\2\2\u00e2"+
		"\u00e3\5\62\32\2\u00e3\u00e4\7\r\2\2\u00e4\u00e5\5\64\33\2\u00e5\u00f5"+
		"\3\2\2\2\u00e6\u00e7\5\62\32\2\u00e7\u00e8\7\16\2\2\u00e8\u00e9\5\64\33"+
		"\2\u00e9\u00f5\3\2\2\2\u00ea\u00eb\5\62\32\2\u00eb\u00ec\7\17\2\2\u00ec"+
		"\u00ed\5\62\32\2\u00ed\u00f5\3\2\2\2\u00ee\u00ef\7\20\2\2\u00ef\u00f0"+
		"\5\64\33\2\u00f0\u00f1\7\4\2\2\u00f1\u00f2\5\64\33\2\u00f2\u00f3\7\5\2"+
		"\2\u00f3\u00f5\3\2\2\2\u00f4\u00d3\3\2\2\2\u00f4\u00d8\3\2\2\2\u00f4\u00dd"+
		"\3\2\2\2\u00f4\u00e2\3\2\2\2\u00f4\u00e6\3\2\2\2\u00f4\u00ea\3\2\2\2\u00f4"+
		"\u00ee\3\2\2\2\u00f5\35\3\2\2\2\u00f6\u00f8\7\13\2\2\u00f7\u00f6\3\2\2"+
		"\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\5\60\31\2\u00fa"+
		"\u00fb\7\21\2\2\u00fb\u00fc\5\64\33\2\u00fc\u010d\3\2\2\2\u00fd\u00fe"+
		"\7\t\2\2\u00fe\u00ff\5\62\32\2\u00ff\u0100\7\21\2\2\u0100\u0101\5\64\33"+
		"\2\u0101\u010d\3\2\2\2\u0102\u0103\5\60\31\2\u0103\u0104\7\22\2\2\u0104"+
		"\u0105\5\64\33\2\u0105\u010d\3\2\2\2\u0106\u0107\7\23\2\2\u0107\u0108"+
		"\5\62\32\2\u0108\u0109\7\22\2\2\u0109\u010a\5\64\33\2\u010a\u010d\3\2"+
		"\2\2\u010b\u010d\7\24\2\2\u010c\u00f7\3\2\2\2\u010c\u00fd\3\2\2\2\u010c"+
		"\u0102\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u010b\3\2\2\2\u010d\37\3\2\2"+
		"\2\u010e\u0110\7\13\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\5\60\31\2\u0112\u0113\7\25\2\2\u0113\u0114"+
		"\5\64\33\2\u0114\u0133\3\2\2\2\u0115\u0116\7\t\2\2\u0116\u0117\5\62\32"+
		"\2\u0117\u0118\7\25\2\2\u0118\u0119\5\64\33\2\u0119\u0133\3\2\2\2\u011a"+
		"\u011b\5\60\31\2\u011b\u011c\7\26\2\2\u011c\u011d\5\64\33\2\u011d\u0133"+
		"\3\2\2\2\u011e\u011f\5\64\33\2\u011f\u0120\7\27\2\2\u0120\u0133\3\2\2"+
		"\2\u0121\u0122\5\64\33\2\u0122\u0123\7\30\2\2\u0123\u0133\3\2\2\2\u0124"+
		"\u0125\5\64\33\2\u0125\u0126\7\31\2\2\u0126\u0133\3\2\2\2\u0127\u0128"+
		"\7\32\2\2\u0128\u0129\5\64\33\2\u0129\u012c\7\33\2\2\u012a\u012d\5,\27"+
		"\2\u012b\u012d\5.\30\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d\u0133"+
		"\3\2\2\2\u012e\u012f\5\60\31\2\u012f\u0130\7\34\2\2\u0130\u0131\5\60\31"+
		"\2\u0131\u0133\3\2\2\2\u0132\u010f\3\2\2\2\u0132\u0115\3\2\2\2\u0132\u011a"+
		"\3\2\2\2\u0132\u011e\3\2\2\2\u0132\u0121\3\2\2\2\u0132\u0124\3\2\2\2\u0132"+
		"\u0127\3\2\2\2\u0132\u012e\3\2\2\2\u0133!\3\2\2\2\u0134\u0135\7\35\2\2"+
		"\u0135\u0136\7\64\2\2\u0136\u0137\5$\23\2\u0137\u0138\7\36\2\2\u0138\u0139"+
		"\5<\37\2\u0139\u0165\3\2\2\2\u013a\u013b\7\37\2\2\u013b\u013c\7P\2\2\u013c"+
		"\u013d\7\64\2\2\u013d\u013e\5$\23\2\u013e\u013f\7\36\2\2\u013f\u0140\5"+
		"<\37\2\u0140\u0165\3\2\2\2\u0141\u0142\7 \2\2\u0142\u0143\7P\2\2\u0143"+
		"\u0144\7\64\2\2\u0144\u0145\5$\23\2\u0145\u0146\7\36\2\2\u0146\u0147\5"+
		"<\37\2\u0147\u0165\3\2\2\2\u0148\u0149\7!\2\2\u0149\u014a\7P\2\2\u014a"+
		"\u014b\7\64\2\2\u014b\u014c\5$\23\2\u014c\u014d\7\36\2\2\u014d\u014e\5"+
		"<\37\2\u014e\u0165\3\2\2\2\u014f\u0150\7\"\2\2\u0150\u0151\7P\2\2\u0151"+
		"\u0152\7\64\2\2\u0152\u0153\5$\23\2\u0153\u0154\7\36\2\2\u0154\u0155\5"+
		"<\37\2\u0155\u0165\3\2\2\2\u0156\u0157\7#\2\2\u0157\u0158\7P\2\2\u0158"+
		"\u0159\7\64\2\2\u0159\u015a\5$\23\2\u015a\u015b\7\36\2\2\u015b\u015c\5"+
		"<\37\2\u015c\u0165\3\2\2\2\u015d\u015e\7$\2\2\u015e\u015f\7P\2\2\u015f"+
		"\u0160\7\64\2\2\u0160\u0161\5$\23\2\u0161\u0162\7\36\2\2\u0162\u0163\5"+
		"<\37\2\u0163\u0165\3\2\2\2\u0164\u0134\3\2\2\2\u0164\u013a\3\2\2\2\u0164"+
		"\u0141\3\2\2\2\u0164\u0148\3\2\2\2\u0164\u014f\3\2\2\2\u0164\u0156\3\2"+
		"\2\2\u0164\u015d\3\2\2\2\u0165#\3\2\2\2\u0166\u016b\5\16\b\2\u0167\u0168"+
		"\7/\2\2\u0168\u016a\5\16\b\2\u0169\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c%\3\2\2\2\u016d\u016b\3\2\2\2"+
		"\u016e\u0171\5(\25\2\u016f\u0171\5*\26\2\u0170\u016e\3\2\2\2\u0170\u016f"+
		"\3\2\2\2\u0171\'\3\2\2\2\u0172\u0173\7P\2\2\u0173\u0174\5H%\2\u0174\u0175"+
		"\7P\2\2\u0175\u0193\3\2\2\2\u0176\u0177\5<\37\2\u0177\u0178\5H%\2\u0178"+
		"\u0179\5<\37\2\u0179\u0193\3\2\2\2\u017a\u017b\5\62\32\2\u017b\u017c\5"+
		"H%\2\u017c\u017d\5\62\32\2\u017d\u0193\3\2\2\2\u017e\u017f\5@!\2\u017f"+
		"\u0180\5H%\2\u0180\u0181\5@!\2\u0181\u0193\3\2\2\2\u0182\u0183\5B\"\2"+
		"\u0183\u0184\5H%\2\u0184\u0185\5B\"\2\u0185\u0193\3\2\2\2\u0186\u0187"+
		"\5D#\2\u0187\u0188\5H%\2\u0188\u0189\5D#\2\u0189\u0193\3\2\2\2\u018a\u018b"+
		"\5F$\2\u018b\u018c\5H%\2\u018c\u018d\5F$\2\u018d\u0193\3\2\2\2\u018e\u018f"+
		"\5\60\31\2\u018f\u0190\5H%\2\u0190\u0191\5\60\31\2\u0191\u0193\3\2\2\2"+
		"\u0192\u0172\3\2\2\2\u0192\u0176\3\2\2\2\u0192\u017a\3\2\2\2\u0192\u017e"+
		"\3\2\2\2\u0192\u0182\3\2\2\2\u0192\u0186\3\2\2\2\u0192\u018a\3\2\2\2\u0192"+
		"\u018e\3\2\2\2\u0193)\3\2\2\2\u0194\u0195\7P\2\2\u0195\u0196\5J&\2\u0196"+
		"\u0197\7P\2\2\u0197\u01a9\3\2\2\2\u0198\u0199\5<\37\2\u0199\u019a\5J&"+
		"\2\u019a\u019b\5<\37\2\u019b\u01a9\3\2\2\2\u019c\u019d\5\62\32\2\u019d"+
		"\u019e\5J&\2\u019e\u019f\5\62\32\2\u019f\u01a9\3\2\2\2\u01a0\u01a1\5@"+
		"!\2\u01a1\u01a2\5J&\2\u01a2\u01a3\5@!\2\u01a3\u01a9\3\2\2\2\u01a4\u01a5"+
		"\5B\"\2\u01a5\u01a6\5J&\2\u01a6\u01a7\5B\"\2\u01a7\u01a9\3\2\2\2\u01a8"+
		"\u0194\3\2\2\2\u01a8\u0198\3\2\2\2\u01a8\u019c\3\2\2\2\u01a8\u01a0\3\2"+
		"\2\2\u01a8\u01a4\3\2\2\2\u01a9+\3\2\2\2\u01aa\u01ab\7U\2\2\u01ab-\3\2"+
		"\2\2\u01ac\u01ad\7O\2\2\u01ad/\3\2\2\2\u01ae\u01af\t\3\2\2\u01af\61\3"+
		"\2\2\2\u01b0\u01b9\7O\2\2\u01b1\u01b9\7P\2\2\u01b2\u01b3\5\60\31\2\u01b3"+
		"\u01b4\7\65\2\2\u01b4\u01b9\3\2\2\2\u01b5\u01b6\5\64\33\2\u01b6\u01b7"+
		"\7\65\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b0\3\2\2\2\u01b8\u01b1\3\2\2\2"+
		"\u01b8\u01b2\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b9\63\3\2\2\2\u01ba\u01bb"+
		"\5\66\34\2\u01bb\u01bc\b\33\1\2\u01bc\u01c4\3\2\2\2\u01bd\u01be\58\35"+
		"\2\u01be\u01bf\b\33\1\2\u01bf\u01c4\3\2\2\2\u01c0\u01c1\5:\36\2\u01c1"+
		"\u01c2\b\33\1\2\u01c2\u01c4\3\2\2\2\u01c3\u01ba\3\2\2\2\u01c3\u01bd\3"+
		"\2\2\2\u01c3\u01c0\3\2\2\2\u01c4\65\3\2\2\2\u01c5\u01c6\t\3\2\2\u01c6"+
		"\67\3\2\2\2\u01c7\u01c8\t\3\2\2\u01c8\u01c9\7%\2\2\u01c9\u01ca\t\3\2\2"+
		"\u01ca9\3\2\2\2\u01cb\u01cc\t\3\2\2\u01cc\u01cd\7%\2\2\u01cd\u01ce\t\3"+
		"\2\2\u01ce\u01cf\7%\2\2\u01cf\u01d0\t\3\2\2\u01d0;\3\2\2\2\u01d1\u01df"+
		"\7R\2\2\u01d2\u01df\7P\2\2\u01d3\u01d4\7\3\2\2\u01d4\u01d5\5<\37\2\u01d5"+
		"\u01d6\5L\'\2\u01d6\u01d7\5<\37\2\u01d7\u01d8\7\5\2\2\u01d8\u01df\3\2"+
		"\2\2\u01d9\u01da\7&\2\2\u01da\u01db\5\64\33\2\u01db\u01dc\7\33\2\2\u01dc"+
		"\u01dd\7O\2\2\u01dd\u01df\3\2\2\2\u01de\u01d1\3\2\2\2\u01de\u01d2\3\2"+
		"\2\2\u01de\u01d3\3\2\2\2\u01de\u01d9\3\2\2\2\u01df=\3\2\2\2\u01e0\u01e1"+
		"\7\'\2\2\u01e1\u01e2\5\64\33\2\u01e2\u01e3\7\33\2\2\u01e3\u01e4\7O\2\2"+
		"\u01e4\u01e7\3\2\2\2\u01e5\u01e7\7P\2\2\u01e6\u01e0\3\2\2\2\u01e6\u01e5"+
		"\3\2\2\2\u01e7?\3\2\2\2\u01e8\u01e9\7L\2\2\u01e9\u01f9\b!\1\2\u01ea\u01eb"+
		"\7M\2\2\u01eb\u01f9\b!\1\2\u01ec\u01ed\7N\2\2\u01ed\u01f9\b!\1\2\u01ee"+
		"\u01ef\7\3\2\2\u01ef\u01f0\5@!\2\u01f0\u01f1\7B\2\2\u01f1\u01f2\5B\"\2"+
		"\u01f2\u01f3\7\5\2\2\u01f3\u01f9\3\2\2\2\u01f4\u01f5\5\64\33\2\u01f5\u01f6"+
		"\79\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f9\7P\2\2\u01f8\u01e8\3\2\2\2\u01f8"+
		"\u01ea\3\2\2\2\u01f8\u01ec\3\2\2\2\u01f8\u01ee\3\2\2\2\u01f8\u01f4\3\2"+
		"\2\2\u01f8\u01f7\3\2\2\2\u01f9A\3\2\2\2\u01fa\u01fb\7K\2\2\u01fb\u020a"+
		"\b\"\1\2\u01fc\u01fd\7\3\2\2\u01fd\u01fe\5@!\2\u01fe\u01ff\7C\2\2\u01ff"+
		"\u0200\5@!\2\u0200\u0201\7\5\2\2\u0201\u020a\3\2\2\2\u0202\u0203\7(\2"+
		"\2\u0203\u0204\5\64\33\2\u0204\u0205\7\4\2\2\u0205\u0206\5\64\33\2\u0206"+
		"\u0207\7\5\2\2\u0207\u020a\3\2\2\2\u0208\u020a\7P\2\2\u0209\u01fa\3\2"+
		"\2\2\u0209\u01fc\3\2\2\2\u0209\u0202\3\2\2\2\u0209\u0208\3\2\2\2\u020a"+
		"C\3\2\2\2\u020b\u020c\5\64\33\2\u020c\u020d\78\2\2\u020dE\3\2\2\2\u020e"+
		"\u020f\5\64\33\2\u020f\u0210\7\67\2\2\u0210G\3\2\2\2\u0211\u0214\7:\2"+
		"\2\u0212\u0214\7;\2\2\u0213\u0211\3\2\2\2\u0213\u0212\3\2\2\2\u0214I\3"+
		"\2\2\2\u0215\u021a\7<\2\2\u0216\u021a\7=\2\2\u0217\u021a\7>\2\2\u0218"+
		"\u021a\7?\2\2\u0219\u0215\3\2\2\2\u0219\u0216\3\2\2\2\u0219\u0217\3\2"+
		"\2\2\u0219\u0218\3\2\2\2\u021aK\3\2\2\2\u021b\u0220\7@\2\2\u021c\u0220"+
		"\7A\2\2\u021d\u0220\7B\2\2\u021e\u0220\7C\2\2\u021f\u021b\3\2\2\2\u021f"+
		"\u021c\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u021e\3\2\2\2\u0220M\3\2\2\2"+
		"%RX^ox~\u0082\u0087\u0096\u009c\u00a4\u00b2\u00bb\u00c3\u00d1\u00f4\u00f7"+
		"\u010c\u010f\u012c\u0132\u0164\u016b\u0170\u0192\u01a8\u01b8\u01c3\u01de"+
		"\u01e6\u01f8\u0209\u0213\u0219\u021f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}