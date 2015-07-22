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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, MULTILINE_COMMENTS=38, 
		SINGLE_LINE_COMMENTS=39, SET=40, IF=41, THEN=42, NEG=43, KONJ=44, DISJ=45, 
		DEF=46, DESC=47, ARGS=48, WHERE=49, ROLE=50, TASKINSTANCE=51, WORKFLOWINSTANCE=52, 
		WORKFLOW=53, TIMESTAMP=54, EQUAL=55, NOTEQUAL=56, LOWER=57, LEQ=58, GREATER=59, 
		GEQ=60, MUL=61, DIV=62, ADD=63, SUB=64, GEN=65, YEARS=66, MONTHS=67, DAYS=68, 
		HOURS=69, MINUTES=70, SECONDS=71, TIMEINTERVAL=72, DATETIME=73, DATE=74, 
		TIME=75, CONSTANT=76, VARIABLE=77, CLAUSE=78, NUMBER=79, STRING=80, WS=81, 
		EVENTTYPE=82;
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
		"'must execute'", "'panic'", "'executed'", "'is assigned to'", "'aborted'", 
		"'succeeded'", "'started'", "'EventType('", "').'", "'is collaborator of'", 
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
		null, null, "MULTILINE_COMMENTS", "SINGLE_LINE_COMMENTS", "SET", "IF", 
		"THEN", "NEG", "KONJ", "DISJ", "DEF", "DESC", "ARGS", "WHERE", "ROLE", 
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
		public TerminalNode THEN() { return getToken(Inter_InstanceParser.THEN, 0); }
		public AssignmentHeadContext assignmentHead() {
			return getRuleContext(AssignmentHeadContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public AssignmentBodyContext assignmentBody() {
			return getRuleContext(AssignmentBodyContext.class,0);
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
			setState(137);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__8) | (1L << T__13) | (1L << T__22) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << NEG))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (TIMEINTERVAL - 72)) | (1L << (DATETIME - 72)) | (1L << (DATE - 72)) | (1L << (TIME - 72)) | (1L << (CONSTANT - 72)) | (1L << (VARIABLE - 72)) | (1L << (CLAUSE - 72)) | (1L << (NUMBER - 72)))) != 0)) {
				{
				setState(136);
				assignmentBody();
				}
			}

			setState(139);
			match(THEN);
			setState(140);
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
			setState(142);
			match(DESC);
			setState(143);
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
			setState(145);
			clauses();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KONJ) {
				{
				{
				setState(146);
				match(KONJ);
				setState(147);
				clauses();
				}
				}
				setState(152);
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
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				atoms();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				disjunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
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
			setState(158);
			match(T__0);
			setState(159);
			atoms();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DISJ) {
				{
				{
				setState(160);
				match(DISJ);
				setState(161);
				atoms();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
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
			setState(169);
			match(NEG);
			setState(170);
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
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				specification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				status();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				comparison();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				extern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(177);
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
			setState(180);
			((DefinedClauseContext)_localctx).CLAUSE = match(CLAUSE);
			setState(181);
			match(T__0);
			setState(182);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(183);
				match(T__1);
				setState(184);
				_la = _input.LA(1);
				if ( !(_la==CONSTANT || _la==VARIABLE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
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
			setState(195);
			switch (_input.LA(1)) {
			case T__6:
			case T__8:
			case T__16:
			case CONSTANT:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				enforcement();
				}
				break;
			case CLAUSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
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
			setState(209);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new RelatedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				ut();
				setState(198);
				match(T__3);
				setState(199);
				ut();
				}
				break;
			case 2:
				_localctx = new PartnerofContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				ut();
				setState(202);
				match(T__4);
				setState(203);
				ut();
				}
				break;
			case 3:
				_localctx = new SamegroupContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				ut();
				setState(206);
				match(T__5);
				setState(207);
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
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new RoleTaskContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(T__6);
				setState(212);
				rt();
				setState(213);
				match(T__7);
				setState(214);
				tt();
				}
				break;
			case 2:
				_localctx = new UserTaskContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(T__8);
				setState(217);
				ut();
				setState(218);
				match(T__7);
				setState(219);
				tt();
				}
				break;
			case 3:
				_localctx = new UserRoleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(T__8);
				setState(222);
				ut();
				setState(223);
				match(T__9);
				setState(224);
				rt();
				}
				break;
			case 4:
				_localctx = new GlbContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				rt();
				setState(227);
				match(T__10);
				setState(228);
				tt();
				}
				break;
			case 5:
				_localctx = new LubContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				rt();
				setState(231);
				match(T__11);
				setState(232);
				tt();
				}
				break;
			case 6:
				_localctx = new DominateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(234);
				rt();
				setState(235);
				match(T__12);
				setState(236);
				rt();
				}
				break;
			case 7:
				_localctx = new CritTaskPairContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(238);
				match(T__13);
				setState(239);
				tt();
				setState(240);
				match(T__1);
				setState(241);
				tt();
				setState(242);
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
		enterRule(_localctx, 28, RULE_enforcement);
		int _la;
		try {
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new CannotUserContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(246);
					match(T__8);
					}
				}

				setState(249);
				ut();
				setState(250);
				match(T__14);
				setState(251);
				tt();
				}
				break;
			case 2:
				_localctx = new CannotRoleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(T__6);
				setState(254);
				rt();
				setState(255);
				match(T__14);
				setState(256);
				tt();
				}
				break;
			case 3:
				_localctx = new MustUserContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				ut();
				setState(259);
				match(T__15);
				setState(260);
				tt();
				}
				break;
			case 4:
				_localctx = new MustRoleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				match(T__6);
				setState(263);
				rt();
				setState(264);
				match(T__15);
				setState(265);
				tt();
				}
				break;
			case 5:
				_localctx = new PanicContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
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
			setState(306);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new ExecutedUserContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(270);
					match(T__8);
					}
				}

				setState(273);
				ut();
				setState(274);
				match(T__17);
				setState(275);
				tt();
				}
				break;
			case 2:
				_localctx = new ExecutedRoleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(T__6);
				setState(278);
				rt();
				setState(279);
				match(T__17);
				setState(280);
				tt();
				}
				break;
			case 3:
				_localctx = new AssignedUserContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				ut();
				setState(283);
				match(T__18);
				setState(284);
				tt();
				}
				break;
			case 4:
				_localctx = new AbortedTaskContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				tt();
				setState(287);
				match(T__19);
				}
				break;
			case 5:
				_localctx = new SucceededTaskContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(289);
				tt();
				setState(290);
				match(T__20);
				}
				break;
			case 6:
				_localctx = new StartedTaskContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(292);
				tt();
				setState(293);
				match(T__21);
				}
				break;
			case 7:
				_localctx = new FlexibleEventContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(295);
				match(T__22);
				setState(296);
				tt();
				setState(297);
				match(T__23);
				setState(300);
				switch (_input.LA(1)) {
				case EVENTTYPE:
					{
					setState(298);
					event();
					}
					break;
				case CONSTANT:
					{
					setState(299);
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
				setState(302);
				ut();
				setState(303);
				match(T__24);
				setState(304);
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
			setState(356);
			switch (_input.LA(1)) {
			case T__25:
				_localctx = new NumSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(T__25);
				setState(309);
				match(WHERE);
				setState(310);
				conditionalBody();
				setState(311);
				match(T__26);
				setState(312);
				nt();
				}
				break;
			case T__27:
				_localctx = new NumVarsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(T__27);
				setState(315);
				match(VARIABLE);
				setState(316);
				match(WHERE);
				setState(317);
				conditionalBody();
				setState(318);
				match(T__26);
				setState(319);
				nt();
				}
				break;
			case T__28:
				_localctx = new NumDiffContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(T__28);
				setState(322);
				match(VARIABLE);
				setState(323);
				match(WHERE);
				setState(324);
				conditionalBody();
				setState(325);
				match(T__26);
				setState(326);
				nt();
				}
				break;
			case T__29:
				_localctx = new SumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				match(T__29);
				setState(329);
				match(VARIABLE);
				setState(330);
				match(WHERE);
				setState(331);
				conditionalBody();
				setState(332);
				match(T__26);
				setState(333);
				nt();
				}
				break;
			case T__30:
				_localctx = new AvgContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				match(T__30);
				setState(336);
				match(VARIABLE);
				setState(337);
				match(WHERE);
				setState(338);
				conditionalBody();
				setState(339);
				match(T__26);
				setState(340);
				nt();
				}
				break;
			case T__31:
				_localctx = new MinContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(342);
				match(T__31);
				setState(343);
				match(VARIABLE);
				setState(344);
				match(WHERE);
				setState(345);
				conditionalBody();
				setState(346);
				match(T__26);
				setState(347);
				nt();
				}
				break;
			case T__32:
				_localctx = new MaxContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(349);
				match(T__32);
				setState(350);
				match(VARIABLE);
				setState(351);
				match(WHERE);
				setState(352);
				conditionalBody();
				setState(353);
				match(T__26);
				setState(354);
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
			setState(358);
			clauses();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KONJ) {
				{
				{
				setState(359);
				match(KONJ);
				setState(360);
				clauses();
				}
				}
				setState(365);
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
			setState(368);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				equalityExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
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
			setState(402);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(VARIABLE);
				setState(371);
				equality();
				setState(372);
				match(VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				nt();
				setState(375);
				equality();
				setState(376);
				nt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				rt();
				setState(379);
				equality();
				setState(380);
				rt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(382);
				tp();
				setState(383);
				equality();
				setState(384);
				tp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
				ts();
				setState(387);
				equality();
				setState(388);
				ts();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(390);
				wt();
				setState(391);
				equality();
				setState(392);
				wt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(394);
				wi();
				setState(395);
				equality();
				setState(396);
				wi();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(398);
				ut();
				setState(399);
				equality();
				setState(400);
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
			setState(424);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				match(VARIABLE);
				setState(405);
				inequality();
				setState(406);
				match(VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				nt();
				setState(409);
				inequality();
				setState(410);
				nt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				rt();
				setState(413);
				inequality();
				setState(414);
				rt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(416);
				tp();
				setState(417);
				inequality();
				setState(418);
				tp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(420);
				ts();
				setState(421);
				inequality();
				setState(422);
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
			setState(426);
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
			setState(428);
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
			setState(430);
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
			setState(440);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(CONSTANT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(VARIABLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				ut();
				setState(435);
				match(ROLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
				tt();
				setState(438);
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
			setState(451);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
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
				setState(445);
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
				setState(448);
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
			setState(453);
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
			setState(455);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(456);
			match(T__33);
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
			setState(459);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(460);
			match(T__33);
			setState(461);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(462);
			match(T__33);
			setState(463);
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
			setState(478);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(NUMBER);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(VARIABLE);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				match(T__0);
				setState(468);
				nt();
				setState(469);
				arithmetic();
				setState(470);
				nt();
				setState(471);
				match(T__2);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
				match(T__34);
				setState(474);
				tt();
				setState(475);
				match(T__23);
				setState(476);
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
			setState(486);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				match(T__35);
				setState(481);
				tt();
				setState(482);
				match(T__23);
				setState(483);
				match(CONSTANT);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
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
			setState(504);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new DateTimeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				((DateTimeContext)_localctx).DATETIME = match(DATETIME);
				ph.checkDateTime((((DateTimeContext)_localctx).DATETIME!=null?((DateTimeContext)_localctx).DATETIME.getText():null));
				}
				break;
			case 2:
				_localctx = new DateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				((DateContext)_localctx).DATE = match(DATE);
				ph.checkDate((((DateContext)_localctx).DATE!=null?((DateContext)_localctx).DATE.getText():null));
				}
				break;
			case 3:
				_localctx = new TimeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				((TimeContext)_localctx).TIME = match(TIME);
				ph.checkTime((((TimeContext)_localctx).TIME!=null?((TimeContext)_localctx).TIME.getText():null));
				}
				break;
			case 4:
				_localctx = new RelativeTimepointContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(494);
				match(T__0);
				setState(495);
				tp();
				setState(496);
				match(ADD);
				setState(497);
				ts();
				setState(498);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new TimestampContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(500);
				tt();
				setState(501);
				match(TIMESTAMP);
				}
				break;
			case 6:
				_localctx = new VarTPContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(503);
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
			setState(521);
			switch (_input.LA(1)) {
			case TIMEINTERVAL:
				_localctx = new AbsoluteIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				((AbsoluteIntervalContext)_localctx).TIMEINTERVAL = match(TIMEINTERVAL);
				ph.checkTimeInterval((((AbsoluteIntervalContext)_localctx).TIMEINTERVAL!=null?((AbsoluteIntervalContext)_localctx).TIMEINTERVAL.getText():null));
				}
				break;
			case T__0:
				_localctx = new TimedifferenceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(T__0);
				setState(509);
				tp();
				setState(510);
				match(SUB);
				setState(511);
				tp();
				setState(512);
				match(T__2);
				}
				break;
			case T__36:
				_localctx = new TimeintervalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(514);
				match(T__36);
				setState(515);
				tt();
				setState(516);
				match(T__1);
				setState(517);
				tt();
				setState(518);
				match(T__2);
				}
				break;
			case VARIABLE:
				_localctx = new VarTSContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(520);
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
			setState(523);
			tt();
			setState(524);
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
			setState(526);
			tt();
			setState(527);
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
			setState(531);
			switch (_input.LA(1)) {
			case EQUAL:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				match(EQUAL);
				}
				break;
			case NOTEQUAL:
				_localctx = new NoteualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
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
			setState(537);
			switch (_input.LA(1)) {
			case LOWER:
				_localctx = new LowerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				match(LOWER);
				}
				break;
			case LEQ:
				_localctx = new LeqContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				match(LEQ);
				}
				break;
			case GREATER:
				_localctx = new GreaterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(535);
				match(GREATER);
				}
				break;
			case GEQ:
				_localctx = new GeqContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(536);
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
			setState(543);
			switch (_input.LA(1)) {
			case MUL:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				match(MUL);
				}
				break;
			case DIV:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				match(DIV);
				}
				break;
			case ADD:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				match(ADD);
				}
				break;
			case SUB:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(542);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3T\u0224\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\7\2Q\n\2\f\2\16\2"+
		"T\13\2\3\2\7\2W\n\2\f\2\16\2Z\13\2\3\2\7\2]\n\2\f\2\16\2`\13\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3n\n\3\f\3\16\3q\13\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\5\4y\n\4\3\4\3\4\3\4\3\4\5\4\177\n\4\7\4\u0081\n\4"+
		"\f\4\16\4\u0084\13\4\3\5\3\5\5\5\u0088\n\5\3\5\3\5\5\5\u008c\n\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u0097\n\7\f\7\16\7\u009a\13\7\3\b\3"+
		"\b\3\b\5\b\u009f\n\b\3\t\3\t\3\t\3\t\7\t\u00a5\n\t\f\t\16\t\u00a8\13\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b5\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u00bc\n\f\f\f\16\f\u00bf\13\f\3\f\3\f\3\f\3\r\3\r"+
		"\5\r\u00c6\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00d4\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f7\n\17\3\20\5\20"+
		"\u00fa\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u010f\n\20\3\21\5\21\u0112\n"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u012f\n\21\3\21\3\21\3\21\3\21\5\21\u0135\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0167\n\22\3\23\3\23\3\23\7\23\u016c\n\23\f\23\16\23\u016f"+
		"\13\23\3\24\3\24\5\24\u0173\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0195\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01ab\n\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01bb\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01c6\n\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01e1\n\37\3 \3 \3 \3 \3 \3 "+
		"\5 \u01e9\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01fb"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u020c"+
		"\n\"\3#\3#\3#\3$\3$\3$\3%\3%\5%\u0216\n%\3&\3&\3&\3&\5&\u021c\n&\3\'\3"+
		"\'\3\'\3\'\5\'\u0222\n\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\4\4\2\4\4..\3\2NO\u0254\2N\3\2\2"+
		"\2\4d\3\2\2\2\6t\3\2\2\2\b\u0085\3\2\2\2\n\u0090\3\2\2\2\f\u0093\3\2\2"+
		"\2\16\u009e\3\2\2\2\20\u00a0\3\2\2\2\22\u00ab\3\2\2\2\24\u00b4\3\2\2\2"+
		"\26\u00b6\3\2\2\2\30\u00c5\3\2\2\2\32\u00d3\3\2\2\2\34\u00f6\3\2\2\2\36"+
		"\u010e\3\2\2\2 \u0134\3\2\2\2\"\u0166\3\2\2\2$\u0168\3\2\2\2&\u0172\3"+
		"\2\2\2(\u0194\3\2\2\2*\u01aa\3\2\2\2,\u01ac\3\2\2\2.\u01ae\3\2\2\2\60"+
		"\u01b0\3\2\2\2\62\u01ba\3\2\2\2\64\u01c5\3\2\2\2\66\u01c7\3\2\2\28\u01c9"+
		"\3\2\2\2:\u01cd\3\2\2\2<\u01e0\3\2\2\2>\u01e8\3\2\2\2@\u01fa\3\2\2\2B"+
		"\u020b\3\2\2\2D\u020d\3\2\2\2F\u0210\3\2\2\2H\u0215\3\2\2\2J\u021b\3\2"+
		"\2\2L\u0221\3\2\2\2NR\b\2\1\2OQ\5\4\3\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2"+
		"RS\3\2\2\2SX\3\2\2\2TR\3\2\2\2UW\5\6\4\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2"+
		"XY\3\2\2\2Y^\3\2\2\2ZX\3\2\2\2[]\5\b\5\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2"+
		"\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\2\2\3bc\b\2\1\2c\3\3\2\2\2de\7\60"+
		"\2\2ef\7P\2\2fg\b\3\1\2gh\7\3\2\2hi\7\62\2\2io\b\3\1\2jk\7\4\2\2kl\7\62"+
		"\2\2ln\b\3\1\2mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2"+
		"\2\2rs\7\5\2\2s\5\3\2\2\2tx\7*\2\2uy\5\32\16\2vy\5\34\17\2wy\5\26\f\2"+
		"xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\u0082\3\2\2\2z~\t\2\2\2{\177\5\32\16\2"+
		"|\177\5\34\17\2}\177\5\26\f\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\u0081"+
		"\3\2\2\2\u0080z\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\7\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\b\5\1\2"+
		"\u0086\u0088\5\n\6\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008b\7+\2\2\u008a\u008c\5\f\7\2\u008b\u008a\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7,\2\2\u008e\u008f\5\30"+
		"\r\2\u008f\t\3\2\2\2\u0090\u0091\7\61\2\2\u0091\u0092\7N\2\2\u0092\13"+
		"\3\2\2\2\u0093\u0098\5\16\b\2\u0094\u0095\7.\2\2\u0095\u0097\5\16\b\2"+
		"\u0096\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\r\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009f\5\24\13\2\u009c"+
		"\u009f\5\20\t\2\u009d\u009f\5\22\n\2\u009e\u009b\3\2\2\2\u009e\u009c\3"+
		"\2\2\2\u009e\u009d\3\2\2\2\u009f\17\3\2\2\2\u00a0\u00a1\7\3\2\2\u00a1"+
		"\u00a6\5\24\13\2\u00a2\u00a3\7/\2\2\u00a3\u00a5\5\24\13\2\u00a4\u00a2"+
		"\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\5\2\2\u00aa\21\3\2\2"+
		"\2\u00ab\u00ac\7-\2\2\u00ac\u00ad\5\24\13\2\u00ad\23\3\2\2\2\u00ae\u00b5"+
		"\5\34\17\2\u00af\u00b5\5 \21\2\u00b0\u00b5\5&\24\2\u00b1\u00b5\5\"\22"+
		"\2\u00b2\u00b5\5\32\16\2\u00b3\u00b5\5\26\f\2\u00b4\u00ae\3\2\2\2\u00b4"+
		"\u00af\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b4\u00b3\3\2\2\2\u00b5\25\3\2\2\2\u00b6\u00b7\7P\2\2\u00b7\u00b8"+
		"\7\3\2\2\u00b8\u00bd\t\3\2\2\u00b9\u00ba\7\4\2\2\u00ba\u00bc\t\3\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\5\2\2\u00c1"+
		"\u00c2\b\f\1\2\u00c2\27\3\2\2\2\u00c3\u00c6\5\36\20\2\u00c4\u00c6\5\26"+
		"\f\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\31\3\2\2\2\u00c7\u00c8"+
		"\5\60\31\2\u00c8\u00c9\7\6\2\2\u00c9\u00ca\5\60\31\2\u00ca\u00d4\3\2\2"+
		"\2\u00cb\u00cc\5\60\31\2\u00cc\u00cd\7\7\2\2\u00cd\u00ce\5\60\31\2\u00ce"+
		"\u00d4\3\2\2\2\u00cf\u00d0\5\60\31\2\u00d0\u00d1\7\b\2\2\u00d1\u00d2\5"+
		"\60\31\2\u00d2\u00d4\3\2\2\2\u00d3\u00c7\3\2\2\2\u00d3\u00cb\3\2\2\2\u00d3"+
		"\u00cf\3\2\2\2\u00d4\33\3\2\2\2\u00d5\u00d6\7\t\2\2\u00d6\u00d7\5\62\32"+
		"\2\u00d7\u00d8\7\n\2\2\u00d8\u00d9\5\64\33\2\u00d9\u00f7\3\2\2\2\u00da"+
		"\u00db\7\13\2\2\u00db\u00dc\5\60\31\2\u00dc\u00dd\7\n\2\2\u00dd\u00de"+
		"\5\64\33\2\u00de\u00f7\3\2\2\2\u00df\u00e0\7\13\2\2\u00e0\u00e1\5\60\31"+
		"\2\u00e1\u00e2\7\f\2\2\u00e2\u00e3\5\62\32\2\u00e3\u00f7\3\2\2\2\u00e4"+
		"\u00e5\5\62\32\2\u00e5\u00e6\7\r\2\2\u00e6\u00e7\5\64\33\2\u00e7\u00f7"+
		"\3\2\2\2\u00e8\u00e9\5\62\32\2\u00e9\u00ea\7\16\2\2\u00ea\u00eb\5\64\33"+
		"\2\u00eb\u00f7\3\2\2\2\u00ec\u00ed\5\62\32\2\u00ed\u00ee\7\17\2\2\u00ee"+
		"\u00ef\5\62\32\2\u00ef\u00f7\3\2\2\2\u00f0\u00f1\7\20\2\2\u00f1\u00f2"+
		"\5\64\33\2\u00f2\u00f3\7\4\2\2\u00f3\u00f4\5\64\33\2\u00f4\u00f5\7\5\2"+
		"\2\u00f5\u00f7\3\2\2\2\u00f6\u00d5\3\2\2\2\u00f6\u00da\3\2\2\2\u00f6\u00df"+
		"\3\2\2\2\u00f6\u00e4\3\2\2\2\u00f6\u00e8\3\2\2\2\u00f6\u00ec\3\2\2\2\u00f6"+
		"\u00f0\3\2\2\2\u00f7\35\3\2\2\2\u00f8\u00fa\7\13\2\2\u00f9\u00f8\3\2\2"+
		"\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\5\60\31\2\u00fc"+
		"\u00fd\7\21\2\2\u00fd\u00fe\5\64\33\2\u00fe\u010f\3\2\2\2\u00ff\u0100"+
		"\7\t\2\2\u0100\u0101\5\62\32\2\u0101\u0102\7\21\2\2\u0102\u0103\5\64\33"+
		"\2\u0103\u010f\3\2\2\2\u0104\u0105\5\60\31\2\u0105\u0106\7\22\2\2\u0106"+
		"\u0107\5\64\33\2\u0107\u010f\3\2\2\2\u0108\u0109\7\t\2\2\u0109\u010a\5"+
		"\62\32\2\u010a\u010b\7\22\2\2\u010b\u010c\5\64\33\2\u010c\u010f\3\2\2"+
		"\2\u010d\u010f\7\23\2\2\u010e\u00f9\3\2\2\2\u010e\u00ff\3\2\2\2\u010e"+
		"\u0104\3\2\2\2\u010e\u0108\3\2\2\2\u010e\u010d\3\2\2\2\u010f\37\3\2\2"+
		"\2\u0110\u0112\7\13\2\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\5\60\31\2\u0114\u0115\7\24\2\2\u0115\u0116"+
		"\5\64\33\2\u0116\u0135\3\2\2\2\u0117\u0118\7\t\2\2\u0118\u0119\5\62\32"+
		"\2\u0119\u011a\7\24\2\2\u011a\u011b\5\64\33\2\u011b\u0135\3\2\2\2\u011c"+
		"\u011d\5\60\31\2\u011d\u011e\7\25\2\2\u011e\u011f\5\64\33\2\u011f\u0135"+
		"\3\2\2\2\u0120\u0121\5\64\33\2\u0121\u0122\7\26\2\2\u0122\u0135\3\2\2"+
		"\2\u0123\u0124\5\64\33\2\u0124\u0125\7\27\2\2\u0125\u0135\3\2\2\2\u0126"+
		"\u0127\5\64\33\2\u0127\u0128\7\30\2\2\u0128\u0135\3\2\2\2\u0129\u012a"+
		"\7\31\2\2\u012a\u012b\5\64\33\2\u012b\u012e\7\32\2\2\u012c\u012f\5,\27"+
		"\2\u012d\u012f\5.\30\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f\u0135"+
		"\3\2\2\2\u0130\u0131\5\60\31\2\u0131\u0132\7\33\2\2\u0132\u0133\5\60\31"+
		"\2\u0133\u0135\3\2\2\2\u0134\u0111\3\2\2\2\u0134\u0117\3\2\2\2\u0134\u011c"+
		"\3\2\2\2\u0134\u0120\3\2\2\2\u0134\u0123\3\2\2\2\u0134\u0126\3\2\2\2\u0134"+
		"\u0129\3\2\2\2\u0134\u0130\3\2\2\2\u0135!\3\2\2\2\u0136\u0137\7\34\2\2"+
		"\u0137\u0138\7\63\2\2\u0138\u0139\5$\23\2\u0139\u013a\7\35\2\2\u013a\u013b"+
		"\5<\37\2\u013b\u0167\3\2\2\2\u013c\u013d\7\36\2\2\u013d\u013e\7O\2\2\u013e"+
		"\u013f\7\63\2\2\u013f\u0140\5$\23\2\u0140\u0141\7\35\2\2\u0141\u0142\5"+
		"<\37\2\u0142\u0167\3\2\2\2\u0143\u0144\7\37\2\2\u0144\u0145\7O\2\2\u0145"+
		"\u0146\7\63\2\2\u0146\u0147\5$\23\2\u0147\u0148\7\35\2\2\u0148\u0149\5"+
		"<\37\2\u0149\u0167\3\2\2\2\u014a\u014b\7 \2\2\u014b\u014c\7O\2\2\u014c"+
		"\u014d\7\63\2\2\u014d\u014e\5$\23\2\u014e\u014f\7\35\2\2\u014f\u0150\5"+
		"<\37\2\u0150\u0167\3\2\2\2\u0151\u0152\7!\2\2\u0152\u0153\7O\2\2\u0153"+
		"\u0154\7\63\2\2\u0154\u0155\5$\23\2\u0155\u0156\7\35\2\2\u0156\u0157\5"+
		"<\37\2\u0157\u0167\3\2\2\2\u0158\u0159\7\"\2\2\u0159\u015a\7O\2\2\u015a"+
		"\u015b\7\63\2\2\u015b\u015c\5$\23\2\u015c\u015d\7\35\2\2\u015d\u015e\5"+
		"<\37\2\u015e\u0167\3\2\2\2\u015f\u0160\7#\2\2\u0160\u0161\7O\2\2\u0161"+
		"\u0162\7\63\2\2\u0162\u0163\5$\23\2\u0163\u0164\7\35\2\2\u0164\u0165\5"+
		"<\37\2\u0165\u0167\3\2\2\2\u0166\u0136\3\2\2\2\u0166\u013c\3\2\2\2\u0166"+
		"\u0143\3\2\2\2\u0166\u014a\3\2\2\2\u0166\u0151\3\2\2\2\u0166\u0158\3\2"+
		"\2\2\u0166\u015f\3\2\2\2\u0167#\3\2\2\2\u0168\u016d\5\16\b\2\u0169\u016a"+
		"\7.\2\2\u016a\u016c\5\16\b\2\u016b\u0169\3\2\2\2\u016c\u016f\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e%\3\2\2\2\u016f\u016d\3\2\2\2"+
		"\u0170\u0173\5(\25\2\u0171\u0173\5*\26\2\u0172\u0170\3\2\2\2\u0172\u0171"+
		"\3\2\2\2\u0173\'\3\2\2\2\u0174\u0175\7O\2\2\u0175\u0176\5H%\2\u0176\u0177"+
		"\7O\2\2\u0177\u0195\3\2\2\2\u0178\u0179\5<\37\2\u0179\u017a\5H%\2\u017a"+
		"\u017b\5<\37\2\u017b\u0195\3\2\2\2\u017c\u017d\5\62\32\2\u017d\u017e\5"+
		"H%\2\u017e\u017f\5\62\32\2\u017f\u0195\3\2\2\2\u0180\u0181\5@!\2\u0181"+
		"\u0182\5H%\2\u0182\u0183\5@!\2\u0183\u0195\3\2\2\2\u0184\u0185\5B\"\2"+
		"\u0185\u0186\5H%\2\u0186\u0187\5B\"\2\u0187\u0195\3\2\2\2\u0188\u0189"+
		"\5D#\2\u0189\u018a\5H%\2\u018a\u018b\5D#\2\u018b\u0195\3\2\2\2\u018c\u018d"+
		"\5F$\2\u018d\u018e\5H%\2\u018e\u018f\5F$\2\u018f\u0195\3\2\2\2\u0190\u0191"+
		"\5\60\31\2\u0191\u0192\5H%\2\u0192\u0193\5\60\31\2\u0193\u0195\3\2\2\2"+
		"\u0194\u0174\3\2\2\2\u0194\u0178\3\2\2\2\u0194\u017c\3\2\2\2\u0194\u0180"+
		"\3\2\2\2\u0194\u0184\3\2\2\2\u0194\u0188\3\2\2\2\u0194\u018c\3\2\2\2\u0194"+
		"\u0190\3\2\2\2\u0195)\3\2\2\2\u0196\u0197\7O\2\2\u0197\u0198\5J&\2\u0198"+
		"\u0199\7O\2\2\u0199\u01ab\3\2\2\2\u019a\u019b\5<\37\2\u019b\u019c\5J&"+
		"\2\u019c\u019d\5<\37\2\u019d\u01ab\3\2\2\2\u019e\u019f\5\62\32\2\u019f"+
		"\u01a0\5J&\2\u01a0\u01a1\5\62\32\2\u01a1\u01ab\3\2\2\2\u01a2\u01a3\5@"+
		"!\2\u01a3\u01a4\5J&\2\u01a4\u01a5\5@!\2\u01a5\u01ab\3\2\2\2\u01a6\u01a7"+
		"\5B\"\2\u01a7\u01a8\5J&\2\u01a8\u01a9\5B\"\2\u01a9\u01ab\3\2\2\2\u01aa"+
		"\u0196\3\2\2\2\u01aa\u019a\3\2\2\2\u01aa\u019e\3\2\2\2\u01aa\u01a2\3\2"+
		"\2\2\u01aa\u01a6\3\2\2\2\u01ab+\3\2\2\2\u01ac\u01ad\7T\2\2\u01ad-\3\2"+
		"\2\2\u01ae\u01af\7N\2\2\u01af/\3\2\2\2\u01b0\u01b1\t\3\2\2\u01b1\61\3"+
		"\2\2\2\u01b2\u01bb\7N\2\2\u01b3\u01bb\7O\2\2\u01b4\u01b5\5\60\31\2\u01b5"+
		"\u01b6\7\64\2\2\u01b6\u01bb\3\2\2\2\u01b7\u01b8\5\64\33\2\u01b8\u01b9"+
		"\7\64\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b2\3\2\2\2\u01ba\u01b3\3\2\2\2"+
		"\u01ba\u01b4\3\2\2\2\u01ba\u01b7\3\2\2\2\u01bb\63\3\2\2\2\u01bc\u01bd"+
		"\5\66\34\2\u01bd\u01be\b\33\1\2\u01be\u01c6\3\2\2\2\u01bf\u01c0\58\35"+
		"\2\u01c0\u01c1\b\33\1\2\u01c1\u01c6\3\2\2\2\u01c2\u01c3\5:\36\2\u01c3"+
		"\u01c4\b\33\1\2\u01c4\u01c6\3\2\2\2\u01c5\u01bc\3\2\2\2\u01c5\u01bf\3"+
		"\2\2\2\u01c5\u01c2\3\2\2\2\u01c6\65\3\2\2\2\u01c7\u01c8\t\3\2\2\u01c8"+
		"\67\3\2\2\2\u01c9\u01ca\t\3\2\2\u01ca\u01cb\7$\2\2\u01cb\u01cc\t\3\2\2"+
		"\u01cc9\3\2\2\2\u01cd\u01ce\t\3\2\2\u01ce\u01cf\7$\2\2\u01cf\u01d0\t\3"+
		"\2\2\u01d0\u01d1\7$\2\2\u01d1\u01d2\t\3\2\2\u01d2;\3\2\2\2\u01d3\u01e1"+
		"\7Q\2\2\u01d4\u01e1\7O\2\2\u01d5\u01d6\7\3\2\2\u01d6\u01d7\5<\37\2\u01d7"+
		"\u01d8\5L\'\2\u01d8\u01d9\5<\37\2\u01d9\u01da\7\5\2\2\u01da\u01e1\3\2"+
		"\2\2\u01db\u01dc\7%\2\2\u01dc\u01dd\5\64\33\2\u01dd\u01de\7\32\2\2\u01de"+
		"\u01df\7N\2\2\u01df\u01e1\3\2\2\2\u01e0\u01d3\3\2\2\2\u01e0\u01d4\3\2"+
		"\2\2\u01e0\u01d5\3\2\2\2\u01e0\u01db\3\2\2\2\u01e1=\3\2\2\2\u01e2\u01e3"+
		"\7&\2\2\u01e3\u01e4\5\64\33\2\u01e4\u01e5\7\32\2\2\u01e5\u01e6\7N\2\2"+
		"\u01e6\u01e9\3\2\2\2\u01e7\u01e9\7O\2\2\u01e8\u01e2\3\2\2\2\u01e8\u01e7"+
		"\3\2\2\2\u01e9?\3\2\2\2\u01ea\u01eb\7K\2\2\u01eb\u01fb\b!\1\2\u01ec\u01ed"+
		"\7L\2\2\u01ed\u01fb\b!\1\2\u01ee\u01ef\7M\2\2\u01ef\u01fb\b!\1\2\u01f0"+
		"\u01f1\7\3\2\2\u01f1\u01f2\5@!\2\u01f2\u01f3\7A\2\2\u01f3\u01f4\5B\"\2"+
		"\u01f4\u01f5\7\5\2\2\u01f5\u01fb\3\2\2\2\u01f6\u01f7\5\64\33\2\u01f7\u01f8"+
		"\78\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01fb\7O\2\2\u01fa\u01ea\3\2\2\2\u01fa"+
		"\u01ec\3\2\2\2\u01fa\u01ee\3\2\2\2\u01fa\u01f0\3\2\2\2\u01fa\u01f6\3\2"+
		"\2\2\u01fa\u01f9\3\2\2\2\u01fbA\3\2\2\2\u01fc\u01fd\7J\2\2\u01fd\u020c"+
		"\b\"\1\2\u01fe\u01ff\7\3\2\2\u01ff\u0200\5@!\2\u0200\u0201\7B\2\2\u0201"+
		"\u0202\5@!\2\u0202\u0203\7\5\2\2\u0203\u020c\3\2\2\2\u0204\u0205\7\'\2"+
		"\2\u0205\u0206\5\64\33\2\u0206\u0207\7\4\2\2\u0207\u0208\5\64\33\2\u0208"+
		"\u0209\7\5\2\2\u0209\u020c\3\2\2\2\u020a\u020c\7O\2\2\u020b\u01fc\3\2"+
		"\2\2\u020b\u01fe\3\2\2\2\u020b\u0204\3\2\2\2\u020b\u020a\3\2\2\2\u020c"+
		"C\3\2\2\2\u020d\u020e\5\64\33\2\u020e\u020f\7\67\2\2\u020fE\3\2\2\2\u0210"+
		"\u0211\5\64\33\2\u0211\u0212\7\66\2\2\u0212G\3\2\2\2\u0213\u0216\79\2"+
		"\2\u0214\u0216\7:\2\2\u0215\u0213\3\2\2\2\u0215\u0214\3\2\2\2\u0216I\3"+
		"\2\2\2\u0217\u021c\7;\2\2\u0218\u021c\7<\2\2\u0219\u021c\7=\2\2\u021a"+
		"\u021c\7>\2\2\u021b\u0217\3\2\2\2\u021b\u0218\3\2\2\2\u021b\u0219\3\2"+
		"\2\2\u021b\u021a\3\2\2\2\u021cK\3\2\2\2\u021d\u0222\7?\2\2\u021e\u0222"+
		"\7@\2\2\u021f\u0222\7A\2\2\u0220\u0222\7B\2\2\u0221\u021d\3\2\2\2\u0221"+
		"\u021e\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0220\3\2\2\2\u0222M\3\2\2\2"+
		"&RX^ox~\u0082\u0087\u008b\u0098\u009e\u00a6\u00b4\u00bd\u00c5\u00d3\u00f6"+
		"\u00f9\u010e\u0111\u012e\u0134\u0166\u016d\u0172\u0194\u01aa\u01ba\u01c5"+
		"\u01e0\u01e8\u01fa\u020b\u0215\u021b\u0221";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}