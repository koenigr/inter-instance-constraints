// Generated from Inter_Instance.g4 by ANTLR 4.5

  package iicmchecker.constraintReader;
	
  import iicmchecker.constraintReader.ParserHelper;
  import java.util.logging.Logger;
  import java.util.logging.Level;
  import iicmchecker.utils.logging.LoggerFactory;
  import iicmchecker.utils.exceptions.UnexpectedContextException;

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
		T__38=39, T__39=40, T__40=41, T__41=42, MULTILINE_COMMENTS=43, SINGLE_LINE_COMMENTS=44, 
		SET=45, IF=46, THEN=47, NEG=48, KONJ=49, DISJ=50, DEF=51, DESC=52, ARGS=53, 
		WHERE=54, EQUAL=55, NOTEQUAL=56, LOWER=57, LEQ=58, GREATER=59, GEQ=60, 
		MUL=61, DIV=62, ADD=63, SUB=64, GEN=65, YEARS=66, MONTHS=67, DAYS=68, 
		HOURS=69, MINUTES=70, SECONDS=71, CONSTANT=72, VARIABLE=73, CLAUSE=74, 
		NUMBER=75, STRING=76, WS=77, EVENTTYPE=78;
	public static final int
		RULE_file = 0, RULE_define = 1, RULE_explicitSetting = 2, RULE_assignment = 3, 
		RULE_description = 4, RULE_assignmentBody = 5, RULE_clauses = 6, RULE_disjunction = 7, 
		RULE_negation = 8, RULE_atoms = 9, RULE_definedClause = 10, RULE_assignmentHead = 11, 
		RULE_extern = 12, RULE_specification = 13, RULE_enforcement = 14, RULE_status = 15, 
		RULE_conditional = 16, RULE_conditionalBody = 17, RULE_comparison = 18, 
		RULE_equalityExpr = 19, RULE_inequalityExpr = 20, RULE_comparisonArg = 21, 
		RULE_arithmeticExpr = 22, RULE_arithmeticArg = 23, RULE_et = 24, RULE_unknownEvent = 25, 
		RULE_ut = 26, RULE_rt = 27, RULE_tt = 28, RULE_intra = 29, RULE_inter = 30, 
		RULE_interp = 31, RULE_nt = 32, RULE_tp = 33, RULE_dt = 34, RULE_d = 35, 
		RULE_t = 36, RULE_ts = 37, RULE_equality = 38, RULE_inequality = 39, RULE_arithmetic = 40;
	public static final String[] ruleNames = {
		"file", "define", "explicitSetting", "assignment", "description", "assignmentBody", 
		"clauses", "disjunction", "negation", "atoms", "definedClause", "assignmentHead", 
		"extern", "specification", "enforcement", "status", "conditional", "conditionalBody", 
		"comparison", "equalityExpr", "inequalityExpr", "comparisonArg", "arithmeticExpr", 
		"arithmeticArg", "et", "unknownEvent", "ut", "rt", "tt", "intra", "inter", 
		"interp", "nt", "tp", "dt", "d", "t", "ts", "equality", "inequality", 
		"arithmetic"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "','", "')'", "'is related to'", "'is partner of'", "'is in same group as'", 
		"'role'", "'can execute'", "'user'", "'belongs to role'", "'is glb of'", 
		"'is lub'", "'dominates'", "'critical_task_pair('", "'cannot execute'", 
		"'must execute'", "'illegal execution'", "'executed'", "'is assigned to'", 
		"'aborted'", "'completed'", "'started'", "'eventtype of'", "'is'", "'is collaborator of'", 
		"'timestamp of'", "'timeinterval of'", "'and'", "'attribute'", "'of'", 
		"'NUMBER'", "'IS'", "'NUMBER OF'", "'SUM OF'", "'AVG OF'", "'MIN OF'", 
		"'MAX OF'", "'.'", "'tp('", "'T'", "':'", "'ts('", null, null, "'SET'", 
		"'IF'", "'THEN'", "'NOT'", "'AND'", "'OR'", "'DEF'", "'DESC'", null, "'WHERE'", 
		"'='", "'!='", "'<'", "'<='", "'>'", "'>='", "'*'", "'/'", "'+'", "'-'", 
		"'GENERATED'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "MULTILINE_COMMENTS", "SINGLE_LINE_COMMENTS", 
		"SET", "IF", "THEN", "NEG", "KONJ", "DISJ", "DEF", "DESC", "ARGS", "WHERE", 
		"EQUAL", "NOTEQUAL", "LOWER", "LEQ", "GREATER", "GEQ", "MUL", "DIV", "ADD", 
		"SUB", "GEN", "YEARS", "MONTHS", "DAYS", "HOURS", "MINUTES", "SECONDS", 
		"CONSTANT", "VARIABLE", "CLAUSE", "NUMBER", "STRING", "WS", "EVENTTYPE"
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
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(83);
				define();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SET) {
				{
				{
				setState(89);
				explicitSetting();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF || _la==DESC) {
				{
				{
				setState(95);
				assignment();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
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
			setState(104);
			match(DEF);
			setState(105);
			((DefineContext)_localctx).CLAUSE = match(CLAUSE);
			ph.addClause((((DefineContext)_localctx).CLAUSE!=null?((DefineContext)_localctx).CLAUSE.getText():null));
			setState(107);
			match(T__0);
			setState(108);
			((DefineContext)_localctx).ARGS = match(ARGS);
			ph.addArgTypeToClause((((DefineContext)_localctx).CLAUSE!=null?((DefineContext)_localctx).CLAUSE.getText():null), (((DefineContext)_localctx).ARGS!=null?((DefineContext)_localctx).ARGS.getText():null));
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				{
				setState(110);
				match(T__1);
				}
				setState(111);
				((DefineContext)_localctx).ARGS = match(ARGS);
				ph.addArgTypeToClause((((DefineContext)_localctx).CLAUSE!=null?((DefineContext)_localctx).CLAUSE.getText():null), (((DefineContext)_localctx).ARGS!=null?((DefineContext)_localctx).ARGS.getText():null));
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
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
		public ExternContext extern() {
			return getRuleContext(ExternContext.class,0);
		}
		public SpecificationContext specification() {
			return getRuleContext(SpecificationContext.class,0);
		}
		public DefinedClauseContext definedClause() {
			return getRuleContext(DefinedClauseContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(SET);
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
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
			setState(128);
			_la = _input.LA(1);
			if (_la==DESC) {
				{
				setState(127);
				description();
				}
			}

			setState(130);
			match(IF);
			setState(132);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__8) | (1L << T__13) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__38) | (1L << T__41) | (1L << NEG))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (CONSTANT - 72)) | (1L << (VARIABLE - 72)) | (1L << (CLAUSE - 72)) | (1L << (NUMBER - 72)))) != 0)) {
				{
				setState(131);
				assignmentBody();
				}
			}

			setState(134);
			match(THEN);
			setState(135);
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
			setState(137);
			match(DESC);
			setState(138);
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
			setState(140);
			clauses();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KONJ) {
				{
				{
				setState(141);
				match(KONJ);
				setState(142);
				clauses();
				}
				}
				setState(147);
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
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				atoms();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				disjunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
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
			setState(153);
			match(T__0);
			setState(154);
			atoms();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DISJ) {
				{
				{
				setState(155);
				match(DISJ);
				setState(156);
				atoms();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
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
		public List<AtomsContext> atoms() {
			return getRuleContexts(AtomsContext.class);
		}
		public AtomsContext atoms(int i) {
			return getRuleContext(AtomsContext.class,i);
		}
		public List<TerminalNode> KONJ() { return getTokens(Inter_InstanceParser.KONJ); }
		public TerminalNode KONJ(int i) {
			return getToken(Inter_InstanceParser.KONJ, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(NEG);
			setState(165);
			match(T__0);
			setState(166);
			atoms();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KONJ) {
				{
				{
				setState(167);
				match(KONJ);
				setState(168);
				atoms();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
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
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				specification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				status();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				comparison();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				extern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
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
			setState(184);
			((DefinedClauseContext)_localctx).CLAUSE = match(CLAUSE);
			setState(185);
			match(T__0);
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(187);
				match(T__1);
				setState(188);
				_la = _input.LA(1);
				if ( !(_la==CONSTANT || _la==VARIABLE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
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
			setState(199);
			switch (_input.LA(1)) {
			case T__6:
			case T__8:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				enforcement();
				}
				break;
			case CLAUSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
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
			setState(213);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new RelatedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				ut();
				setState(202);
				match(T__3);
				setState(203);
				ut();
				}
				break;
			case 2:
				_localctx = new PartnerofContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				ut();
				setState(206);
				match(T__4);
				setState(207);
				ut();
				}
				break;
			case 3:
				_localctx = new SamegroupContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				ut();
				setState(210);
				match(T__5);
				setState(211);
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
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new RoleTaskContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(T__6);
				setState(216);
				rt();
				setState(217);
				match(T__7);
				setState(218);
				tt();
				}
				break;
			case 2:
				_localctx = new UserTaskContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(T__8);
				setState(221);
				ut();
				setState(222);
				match(T__7);
				setState(223);
				tt();
				}
				break;
			case 3:
				_localctx = new UserRoleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				match(T__8);
				setState(226);
				ut();
				setState(227);
				match(T__9);
				setState(228);
				rt();
				}
				break;
			case 4:
				_localctx = new GlbContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				rt();
				setState(231);
				match(T__10);
				setState(232);
				tt();
				}
				break;
			case 5:
				_localctx = new LubContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				rt();
				setState(235);
				match(T__11);
				setState(236);
				tt();
				}
				break;
			case 6:
				_localctx = new DominateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				rt();
				setState(239);
				match(T__12);
				setState(240);
				rt();
				}
				break;
			case 7:
				_localctx = new CritTaskPairContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				match(T__13);
				setState(243);
				tt();
				setState(244);
				match(T__1);
				setState(245);
				tt();
				setState(246);
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
		try {
			setState(271);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new CannotUserContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(T__8);
				setState(251);
				ut();
				setState(252);
				match(T__14);
				setState(253);
				tt();
				}
				break;
			case 2:
				_localctx = new CannotRoleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(T__6);
				setState(256);
				rt();
				setState(257);
				match(T__14);
				setState(258);
				tt();
				}
				break;
			case 3:
				_localctx = new MustUserContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				match(T__8);
				setState(261);
				ut();
				setState(262);
				match(T__15);
				setState(263);
				tt();
				}
				break;
			case 4:
				_localctx = new MustRoleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				match(T__6);
				setState(266);
				rt();
				setState(267);
				match(T__15);
				setState(268);
				tt();
				}
				break;
			case 5:
				_localctx = new PanicContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
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
	public static class TimestampContext extends StatusContext {
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public TpContext tp() {
			return getRuleContext(TpContext.class,0);
		}
		public TimestampContext(StatusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterTimestamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitTimestamp(this);
		}
	}
	public static class FlexibleEventContext extends StatusContext {
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public EtContext et() {
			return getRuleContext(EtContext.class,0);
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
	public static class TimeintervalContext extends StatusContext {
		public List<TtContext> tt() {
			return getRuleContexts(TtContext.class);
		}
		public TtContext tt(int i) {
			return getRuleContext(TtContext.class,i);
		}
		public TsContext ts() {
			return getRuleContext(TsContext.class,0);
		}
		public TimeintervalContext(StatusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterTimeinterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitTimeinterval(this);
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
	public static class AttributeContext extends StatusContext {
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public List<TerminalNode> CONSTANT() { return getTokens(Inter_InstanceParser.CONSTANT); }
		public TerminalNode CONSTANT(int i) {
			return getToken(Inter_InstanceParser.CONSTANT, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(Inter_InstanceParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(Inter_InstanceParser.VARIABLE, i);
		}
		public TerminalNode NUMBER() { return getToken(Inter_InstanceParser.NUMBER, 0); }
		public AttributeContext(StatusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitAttribute(this);
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
			setState(324);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ExecutedUserContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(T__8);
				setState(274);
				ut();
				setState(275);
				match(T__17);
				setState(276);
				tt();
				}
				break;
			case 2:
				_localctx = new ExecutedRoleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(T__6);
				setState(279);
				rt();
				setState(280);
				match(T__17);
				setState(281);
				tt();
				}
				break;
			case 3:
				_localctx = new AssignedUserContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				ut();
				setState(284);
				match(T__18);
				setState(285);
				tt();
				}
				break;
			case 4:
				_localctx = new AbortedTaskContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				tt();
				setState(288);
				match(T__19);
				}
				break;
			case 5:
				_localctx = new SucceededTaskContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				tt();
				setState(291);
				match(T__20);
				}
				break;
			case 6:
				_localctx = new StartedTaskContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(293);
				tt();
				setState(294);
				match(T__21);
				}
				break;
			case 7:
				_localctx = new FlexibleEventContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(296);
				match(T__22);
				setState(297);
				tt();
				setState(298);
				match(T__23);
				setState(299);
				et();
				}
				break;
			case 8:
				_localctx = new CollaboratorContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(301);
				ut();
				setState(302);
				match(T__24);
				setState(303);
				ut();
				}
				break;
			case 9:
				_localctx = new TimestampContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(305);
				match(T__25);
				setState(306);
				tt();
				setState(307);
				match(T__23);
				setState(308);
				tp();
				}
				break;
			case 10:
				_localctx = new TimeintervalContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(310);
				match(T__26);
				setState(311);
				tt();
				setState(312);
				match(T__27);
				setState(313);
				tt();
				setState(314);
				match(T__23);
				setState(315);
				ts();
				}
				break;
			case 11:
				_localctx = new AttributeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(317);
				match(T__28);
				setState(318);
				_la = _input.LA(1);
				if ( !(_la==CONSTANT || _la==VARIABLE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(319);
				match(T__29);
				setState(320);
				tt();
				setState(321);
				match(T__23);
				setState(322);
				_la = _input.LA(1);
				if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (CONSTANT - 72)) | (1L << (VARIABLE - 72)) | (1L << (NUMBER - 72)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
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
		public TpContext tp() {
			return getRuleContext(TpContext.class,0);
		}
		public TsContext ts() {
			return getRuleContext(TsContext.class,0);
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
		public TpContext tp() {
			return getRuleContext(TpContext.class,0);
		}
		public TsContext ts() {
			return getRuleContext(TsContext.class,0);
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
		public TpContext tp() {
			return getRuleContext(TpContext.class,0);
		}
		public TsContext ts() {
			return getRuleContext(TsContext.class,0);
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
		public TpContext tp() {
			return getRuleContext(TpContext.class,0);
		}
		public TsContext ts() {
			return getRuleContext(TsContext.class,0);
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

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditional);
		try {
			setState(391);
			switch (_input.LA(1)) {
			case T__30:
				_localctx = new NumSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(T__30);
				setState(327);
				match(WHERE);
				setState(328);
				match(T__0);
				setState(329);
				conditionalBody();
				setState(330);
				match(T__2);
				setState(331);
				match(T__31);
				setState(332);
				nt();
				}
				break;
			case T__32:
				_localctx = new NumVarsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(T__32);
				setState(335);
				match(VARIABLE);
				setState(336);
				match(WHERE);
				setState(337);
				match(T__0);
				setState(338);
				conditionalBody();
				setState(339);
				match(T__2);
				setState(340);
				match(T__31);
				setState(341);
				nt();
				}
				break;
			case T__33:
				_localctx = new SumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				match(T__33);
				setState(344);
				match(VARIABLE);
				setState(345);
				match(WHERE);
				setState(346);
				match(T__0);
				setState(347);
				conditionalBody();
				setState(348);
				match(T__2);
				setState(349);
				match(T__31);
				setState(353);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(350);
					nt();
					}
					break;
				case 2:
					{
					setState(351);
					tp();
					}
					break;
				case 3:
					{
					setState(352);
					ts();
					}
					break;
				}
				}
				break;
			case T__34:
				_localctx = new AvgContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(355);
				match(T__34);
				setState(356);
				match(VARIABLE);
				setState(357);
				match(WHERE);
				setState(358);
				match(T__0);
				setState(359);
				conditionalBody();
				setState(360);
				match(T__2);
				setState(361);
				match(T__31);
				setState(365);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(362);
					nt();
					}
					break;
				case 2:
					{
					setState(363);
					tp();
					}
					break;
				case 3:
					{
					setState(364);
					ts();
					}
					break;
				}
				}
				break;
			case T__35:
				_localctx = new MinContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(367);
				match(T__35);
				setState(368);
				match(VARIABLE);
				setState(369);
				match(WHERE);
				setState(370);
				match(T__0);
				setState(371);
				conditionalBody();
				setState(372);
				match(T__2);
				setState(373);
				match(T__31);
				setState(377);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(374);
					nt();
					}
					break;
				case 2:
					{
					setState(375);
					tp();
					}
					break;
				case 3:
					{
					setState(376);
					ts();
					}
					break;
				}
				}
				break;
			case T__36:
				_localctx = new MaxContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(379);
				match(T__36);
				setState(380);
				match(VARIABLE);
				setState(381);
				match(WHERE);
				setState(382);
				match(T__0);
				setState(383);
				conditionalBody();
				setState(384);
				match(T__2);
				setState(385);
				match(T__31);
				setState(389);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(386);
					nt();
					}
					break;
				case 2:
					{
					setState(387);
					tp();
					}
					break;
				case 3:
					{
					setState(388);
					ts();
					}
					break;
				}
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
			setState(393);
			clauses();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KONJ) {
				{
				{
				setState(394);
				match(KONJ);
				setState(395);
				clauses();
				}
				}
				setState(400);
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
			setState(403);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				equalityExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
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
		public List<ComparisonArgContext> comparisonArg() {
			return getRuleContexts(ComparisonArgContext.class);
		}
		public ComparisonArgContext comparisonArg(int i) {
			return getRuleContext(ComparisonArgContext.class,i);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			comparisonArg();
			setState(406);
			equality();
			setState(407);
			comparisonArg();
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
		public List<ComparisonArgContext> comparisonArg() {
			return getRuleContexts(ComparisonArgContext.class);
		}
		public ComparisonArgContext comparisonArg(int i) {
			return getRuleContext(ComparisonArgContext.class,i);
		}
		public InequalityContext inequality() {
			return getRuleContext(InequalityContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			comparisonArg();
			setState(410);
			inequality();
			setState(411);
			comparisonArg();
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

	public static class ComparisonArgContext extends ParserRuleContext {
		public String returnValue;
		public ComparisonArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonArg; }
	 
		public ComparisonArgContext() { }
		public void copyFrom(ComparisonArgContext ctx) {
			super.copyFrom(ctx);
			this.returnValue = ctx.returnValue;
		}
	}
	public static class ComparisonVarContext extends ComparisonArgContext {
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public ComparisonVarContext(ComparisonArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterComparisonVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitComparisonVar(this);
		}
	}
	public static class ComparisonArithmArgContext extends ComparisonArgContext {
		public ArithmeticArgContext arithmeticArg() {
			return getRuleContext(ArithmeticArgContext.class,0);
		}
		public ComparisonArithmArgContext(ComparisonArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterComparisonArithmArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitComparisonArithmArg(this);
		}
	}
	public static class ComparisonConstContext extends ComparisonArgContext {
		public TerminalNode CONSTANT() { return getToken(Inter_InstanceParser.CONSTANT, 0); }
		public ComparisonConstContext(ComparisonArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterComparisonConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitComparisonConst(this);
		}
	}

	public final ComparisonArgContext comparisonArg() throws RecognitionException {
		ComparisonArgContext _localctx = new ComparisonArgContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comparisonArg);
		try {
			setState(416);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new ComparisonVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(VARIABLE);
				}
				break;
			case 2:
				_localctx = new ComparisonConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				match(CONSTANT);
				}
				break;
			case 3:
				_localctx = new ComparisonArithmArgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				arithmeticArg();
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

	public static class ArithmeticExprContext extends ParserRuleContext {
		public String returnValue;
		public List<ArithmeticArgContext> arithmeticArg() {
			return getRuleContexts(ArithmeticArgContext.class);
		}
		public ArithmeticArgContext arithmeticArg(int i) {
			return getRuleContext(ArithmeticArgContext.class,i);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public ArithmeticExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterArithmeticExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitArithmeticExpr(this);
		}
	}

	public final ArithmeticExprContext arithmeticExpr() throws RecognitionException {
		ArithmeticExprContext _localctx = new ArithmeticExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arithmeticExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(T__0);
			setState(419);
			arithmeticArg();
			setState(420);
			arithmetic();
			setState(421);
			arithmeticArg();
			setState(422);
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

	public static class ArithmeticArgContext extends ParserRuleContext {
		public String returnValue;
		public ArithmeticArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticArg; }
	 
		public ArithmeticArgContext() { }
		public void copyFrom(ArithmeticArgContext ctx) {
			super.copyFrom(ctx);
			this.returnValue = ctx.returnValue;
		}
	}
	public static class ArithmeticTSContext extends ArithmeticArgContext {
		public TsContext ts() {
			return getRuleContext(TsContext.class,0);
		}
		public ArithmeticTSContext(ArithmeticArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterArithmeticTS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitArithmeticTS(this);
		}
	}
	public static class ArithmeticNTContext extends ArithmeticArgContext {
		public NtContext nt() {
			return getRuleContext(NtContext.class,0);
		}
		public ArithmeticNTContext(ArithmeticArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterArithmeticNT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitArithmeticNT(this);
		}
	}
	public static class ArithmeticExContext extends ArithmeticArgContext {
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public ArithmeticExContext(ArithmeticArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterArithmeticEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitArithmeticEx(this);
		}
	}
	public static class ArithmeticTPContext extends ArithmeticArgContext {
		public TpContext tp() {
			return getRuleContext(TpContext.class,0);
		}
		public ArithmeticTPContext(ArithmeticArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterArithmeticTP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitArithmeticTP(this);
		}
	}

	public final ArithmeticArgContext arithmeticArg() throws RecognitionException {
		ArithmeticArgContext _localctx = new ArithmeticArgContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arithmeticArg);
		try {
			setState(428);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new ArithmeticNTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				nt();
				}
				break;
			case 2:
				_localctx = new ArithmeticTPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				tp();
				}
				break;
			case 3:
				_localctx = new ArithmeticTSContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				ts();
				}
				break;
			case 4:
				_localctx = new ArithmeticExContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(427);
				arithmeticExpr();
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

	public static class EtContext extends ParserRuleContext {
		public TerminalNode EVENTTYPE() { return getToken(Inter_InstanceParser.EVENTTYPE, 0); }
		public UnknownEventContext unknownEvent() {
			return getRuleContext(UnknownEventContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public EtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_et; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterEt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitEt(this);
		}
	}

	public final EtContext et() throws RecognitionException {
		EtContext _localctx = new EtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_et);
		try {
			setState(433);
			switch (_input.LA(1)) {
			case EVENTTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(EVENTTYPE);
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				unknownEvent();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
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
		enterRule(_localctx, 50, RULE_unknownEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
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
		enterRule(_localctx, 52, RULE_ut);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class RtContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(Inter_InstanceParser.CONSTANT, 0); }
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
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
		enterRule(_localctx, 54, RULE_rt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
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
		enterRule(_localctx, 56, RULE_tt);
		try {
			setState(450);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
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
				setState(444);
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
				setState(447);
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
		enterRule(_localctx, 58, RULE_intra);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
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
		enterRule(_localctx, 60, RULE_inter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(455);
			match(T__37);
			setState(456);
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
		enterRule(_localctx, 62, RULE_interp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(459);
			match(T__37);
			setState(460);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(461);
			match(T__37);
			setState(462);
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
		public NtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nt; }
	 
		public NtContext() { }
		public void copyFrom(NtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumContext extends NtContext {
		public TerminalNode NUMBER() { return getToken(Inter_InstanceParser.NUMBER, 0); }
		public NumContext(NtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitNum(this);
		}
	}
	public static class VarContext extends NtContext {
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public VarContext(NtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitVar(this);
		}
	}

	public final NtContext nt() throws RecognitionException {
		NtContext _localctx = new NtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_nt);
		try {
			setState(466);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(NUMBER);
				}
				break;
			case VARIABLE:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
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
		public String returnValue;
		public TpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tp; }
	 
		public TpContext() { }
		public void copyFrom(TpContext ctx) {
			super.copyFrom(ctx);
			this.returnValue = ctx.returnValue;
		}
	}
	public static class TimeContext extends TpContext {
		public TContext t;
		public TContext t() {
			return getRuleContext(TContext.class,0);
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
		public DtContext dt;
		public DtContext dt() {
			return getRuleContext(DtContext.class,0);
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
		public DContext d;
		public DContext d() {
			return getRuleContext(DContext.class,0);
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
		enterRule(_localctx, 66, RULE_tp);
		try {
			setState(484);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new DateTimeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				match(T__38);
				setState(469);
				((DateTimeContext)_localctx).dt = dt();
				setState(470);
				match(T__2);
				ph.checkDateTime((((DateTimeContext)_localctx).dt!=null?_input.getText(((DateTimeContext)_localctx).dt.start,((DateTimeContext)_localctx).dt.stop):null));
				}
				break;
			case 2:
				_localctx = new DateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(T__38);
				setState(474);
				((DateContext)_localctx).d = d();
				setState(475);
				match(T__2);
				ph.checkDate((((DateContext)_localctx).d!=null?_input.getText(((DateContext)_localctx).d.start,((DateContext)_localctx).d.stop):null));
				}
				break;
			case 3:
				_localctx = new TimeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				match(T__38);
				setState(479);
				((TimeContext)_localctx).t = t();
				setState(480);
				match(T__2);
				ph.checkTime((((TimeContext)_localctx).t!=null?_input.getText(((TimeContext)_localctx).t.start,((TimeContext)_localctx).t.stop):null));
				}
				break;
			case 4:
				_localctx = new VarTPContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(483);
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

	public static class DtContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(Inter_InstanceParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(Inter_InstanceParser.NUMBER, i);
		}
		public DtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterDt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitDt(this);
		}
	}

	public final DtContext dt() throws RecognitionException {
		DtContext _localctx = new DtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(NUMBER);
			setState(487);
			match(SUB);
			setState(488);
			match(NUMBER);
			setState(489);
			match(SUB);
			setState(490);
			match(NUMBER);
			setState(491);
			match(T__39);
			setState(492);
			match(NUMBER);
			setState(503);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(493);
				match(T__40);
				setState(494);
				match(NUMBER);
				setState(501);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(495);
					match(T__40);
					setState(496);
					match(NUMBER);
					setState(499);
					_la = _input.LA(1);
					if (_la==T__37) {
						{
						setState(497);
						match(T__37);
						setState(498);
						match(NUMBER);
						}
					}

					}
				}

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

	public static class DContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(Inter_InstanceParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(Inter_InstanceParser.NUMBER, i);
		}
		public DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitD(this);
		}
	}

	public final DContext d() throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_d);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(NUMBER);
			setState(512);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(506);
				match(SUB);
				setState(507);
				match(NUMBER);
				setState(510);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(508);
					match(SUB);
					setState(509);
					match(NUMBER);
					}
				}

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

	public static class TContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(Inter_InstanceParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(Inter_InstanceParser.NUMBER, i);
		}
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitT(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(T__39);
			setState(515);
			match(NUMBER);
			setState(526);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(516);
				match(T__40);
				setState(517);
				match(NUMBER);
				setState(524);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(518);
					match(T__40);
					setState(519);
					match(NUMBER);
					setState(522);
					_la = _input.LA(1);
					if (_la==T__37) {
						{
						setState(520);
						match(T__37);
						setState(521);
						match(NUMBER);
						}
					}

					}
				}

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

	public static class TsContext extends ParserRuleContext {
		public String returnValue;
		public TsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts; }
	 
		public TsContext() { }
		public void copyFrom(TsContext ctx) {
			super.copyFrom(ctx);
			this.returnValue = ctx.returnValue;
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
	public static class AbsoluteIntervalContext extends TsContext {
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

	public final TsContext ts() throws RecognitionException {
		TsContext _localctx = new TsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ts);
		int _la;
		try {
			setState(549);
			switch (_input.LA(1)) {
			case T__41:
				_localctx = new AbsoluteIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				match(T__41);
				setState(530);
				_la = _input.LA(1);
				if (_la==YEARS) {
					{
					setState(529);
					match(YEARS);
					}
				}

				setState(533);
				_la = _input.LA(1);
				if (_la==MONTHS) {
					{
					setState(532);
					match(MONTHS);
					}
				}

				setState(536);
				_la = _input.LA(1);
				if (_la==DAYS) {
					{
					setState(535);
					match(DAYS);
					}
				}

				setState(539);
				_la = _input.LA(1);
				if (_la==HOURS) {
					{
					setState(538);
					match(HOURS);
					}
				}

				setState(542);
				_la = _input.LA(1);
				if (_la==MINUTES) {
					{
					setState(541);
					match(MINUTES);
					}
				}

				setState(545);
				_la = _input.LA(1);
				if (_la==SECONDS) {
					{
					setState(544);
					match(SECONDS);
					}
				}

				setState(547);
				match(T__2);
				}
				break;
			case VARIABLE:
				_localctx = new VarTSContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
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

	public static class EqualityContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(Inter_InstanceParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(Inter_InstanceParser.NOTEQUAL, 0); }
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitEquality(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_equality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
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

	public static class InequalityContext extends ParserRuleContext {
		public TerminalNode LOWER() { return getToken(Inter_InstanceParser.LOWER, 0); }
		public TerminalNode LEQ() { return getToken(Inter_InstanceParser.LEQ, 0); }
		public TerminalNode GREATER() { return getToken(Inter_InstanceParser.GREATER, 0); }
		public TerminalNode GEQ() { return getToken(Inter_InstanceParser.GEQ, 0); }
		public InequalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inequality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterInequality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitInequality(this);
		}
	}

	public final InequalityContext inequality() throws RecognitionException {
		InequalityContext _localctx = new InequalityContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_inequality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOWER) | (1L << LEQ) | (1L << GREATER) | (1L << GEQ))) != 0)) ) {
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

	public static class ArithmeticContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(Inter_InstanceParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(Inter_InstanceParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(Inter_InstanceParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(Inter_InstanceParser.SUB, 0); }
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
		enterRule(_localctx, 80, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (MUL - 61)) | (1L << (DIV - 61)) | (1L << (ADD - 61)) | (1L << (SUB - 61)))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3P\u0230\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\7\2W\n\2\f\2\16\2Z\13\2\3\2\7\2]\n\2\f\2\16\2`\13\2\3\2\7\2c\n\2\f\2"+
		"\16\2f\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3t\n\3\f"+
		"\3\16\3w\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\177\n\4\3\5\3\5\5\5\u0083\n"+
		"\5\3\5\3\5\5\5\u0087\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u0092"+
		"\n\7\f\7\16\7\u0095\13\7\3\b\3\b\3\b\5\b\u009a\n\b\3\t\3\t\3\t\3\t\7\t"+
		"\u00a0\n\t\f\t\16\t\u00a3\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u00ac\n"+
		"\n\f\n\16\n\u00af\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b9"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\7\f\u00c0\n\f\f\f\16\f\u00c3\13\f\3\f\3\f\3"+
		"\f\3\r\3\r\5\r\u00ca\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00d8\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00fb\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0112\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0147\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0164\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0170\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u017c\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u0188\n\22\5\22\u018a\n\22\3\23\3\23\3\23\7"+
		"\23\u018f\n\23\f\23\16\23\u0192\13\23\3\24\3\24\5\24\u0196\n\24\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u01a3\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u01af\n\31\3\32\3\32"+
		"\3\32\5\32\u01b4\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u01c5\n\36\3\37\3\37\3 \3 \3 \3 \3!\3!"+
		"\3!\3!\3!\3!\3\"\3\"\5\"\u01d5\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\5#\u01e7\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01f6"+
		"\n$\5$\u01f8\n$\5$\u01fa\n$\3%\3%\3%\3%\3%\5%\u0201\n%\5%\u0203\n%\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\5&\u020d\n&\5&\u020f\n&\5&\u0211\n&\3\'\3\'\5\'"+
		"\u0215\n\'\3\'\5\'\u0218\n\'\3\'\5\'\u021b\n\'\3\'\5\'\u021e\n\'\3\'\5"+
		"\'\u0221\n\'\3\'\5\'\u0224\n\'\3\'\3\'\5\'\u0228\n\'\3(\3(\3)\3)\3*\3"+
		"*\3*\2\2+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPR\2\7\3\2JK\4\2JKMM\3\29:\3\2;>\3\2?B\u025b\2T\3\2\2\2\4"+
		"j\3\2\2\2\6z\3\2\2\2\b\u0080\3\2\2\2\n\u008b\3\2\2\2\f\u008e\3\2\2\2\16"+
		"\u0099\3\2\2\2\20\u009b\3\2\2\2\22\u00a6\3\2\2\2\24\u00b8\3\2\2\2\26\u00ba"+
		"\3\2\2\2\30\u00c9\3\2\2\2\32\u00d7\3\2\2\2\34\u00fa\3\2\2\2\36\u0111\3"+
		"\2\2\2 \u0146\3\2\2\2\"\u0189\3\2\2\2$\u018b\3\2\2\2&\u0195\3\2\2\2(\u0197"+
		"\3\2\2\2*\u019b\3\2\2\2,\u01a2\3\2\2\2.\u01a4\3\2\2\2\60\u01ae\3\2\2\2"+
		"\62\u01b3\3\2\2\2\64\u01b5\3\2\2\2\66\u01b7\3\2\2\28\u01b9\3\2\2\2:\u01c4"+
		"\3\2\2\2<\u01c6\3\2\2\2>\u01c8\3\2\2\2@\u01cc\3\2\2\2B\u01d4\3\2\2\2D"+
		"\u01e6\3\2\2\2F\u01e8\3\2\2\2H\u01fb\3\2\2\2J\u0204\3\2\2\2L\u0227\3\2"+
		"\2\2N\u0229\3\2\2\2P\u022b\3\2\2\2R\u022d\3\2\2\2TX\b\2\1\2UW\5\4\3\2"+
		"VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y^\3\2\2\2ZX\3\2\2\2[]\5\6\4\2"+
		"\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_d\3\2\2\2`^\3\2\2\2ac\5\b\5"+
		"\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\2\2"+
		"\3hi\b\2\1\2i\3\3\2\2\2jk\7\65\2\2kl\7L\2\2lm\b\3\1\2mn\7\3\2\2no\7\67"+
		"\2\2ou\b\3\1\2pq\7\4\2\2qr\7\67\2\2rt\b\3\1\2sp\3\2\2\2tw\3\2\2\2us\3"+
		"\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\5\2\2y\5\3\2\2\2z~\7/\2\2{\177"+
		"\5\32\16\2|\177\5\34\17\2}\177\5\26\f\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2"+
		"\177\7\3\2\2\2\u0080\u0082\b\5\1\2\u0081\u0083\5\n\6\2\u0082\u0081\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\7\60\2\2\u0085"+
		"\u0087\5\f\7\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0089\7\61\2\2\u0089\u008a\5\30\r\2\u008a\t\3\2\2\2\u008b\u008c"+
		"\7\66\2\2\u008c\u008d\7J\2\2\u008d\13\3\2\2\2\u008e\u0093\5\16\b\2\u008f"+
		"\u0090\7\63\2\2\u0090\u0092\5\16\b\2\u0091\u008f\3\2\2\2\u0092\u0095\3"+
		"\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\r\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0096\u009a\5\24\13\2\u0097\u009a\5\20\t\2\u0098\u009a\5\22\n"+
		"\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\17"+
		"\3\2\2\2\u009b\u009c\7\3\2\2\u009c\u00a1\5\24\13\2\u009d\u009e\7\64\2"+
		"\2\u009e\u00a0\5\24\13\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a4\u00a5\7\5\2\2\u00a5\21\3\2\2\2\u00a6\u00a7\7\62\2\2\u00a7\u00a8"+
		"\7\3\2\2\u00a8\u00ad\5\24\13\2\u00a9\u00aa\7\63\2\2\u00aa\u00ac\5\24\13"+
		"\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\5\2\2\u00b1"+
		"\23\3\2\2\2\u00b2\u00b9\5\34\17\2\u00b3\u00b9\5 \21\2\u00b4\u00b9\5&\24"+
		"\2\u00b5\u00b9\5\"\22\2\u00b6\u00b9\5\32\16\2\u00b7\u00b9\5\26\f\2\u00b8"+
		"\u00b2\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\25\3\2\2\2\u00ba\u00bb"+
		"\7L\2\2\u00bb\u00bc\7\3\2\2\u00bc\u00c1\t\2\2\2\u00bd\u00be\7\4\2\2\u00be"+
		"\u00c0\t\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c5\7\5\2\2\u00c5\u00c6\b\f\1\2\u00c6\27\3\2\2\2\u00c7\u00ca\5\36\20"+
		"\2\u00c8\u00ca\5\26\f\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\31\3\2\2\2\u00cb\u00cc\5\66\34\2\u00cc\u00cd\7\6\2\2\u00cd\u00ce\5\66"+
		"\34\2\u00ce\u00d8\3\2\2\2\u00cf\u00d0\5\66\34\2\u00d0\u00d1\7\7\2\2\u00d1"+
		"\u00d2\5\66\34\2\u00d2\u00d8\3\2\2\2\u00d3\u00d4\5\66\34\2\u00d4\u00d5"+
		"\7\b\2\2\u00d5\u00d6\5\66\34\2\u00d6\u00d8\3\2\2\2\u00d7\u00cb\3\2\2\2"+
		"\u00d7\u00cf\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8\33\3\2\2\2\u00d9\u00da"+
		"\7\t\2\2\u00da\u00db\58\35\2\u00db\u00dc\7\n\2\2\u00dc\u00dd\5:\36\2\u00dd"+
		"\u00fb\3\2\2\2\u00de\u00df\7\13\2\2\u00df\u00e0\5\66\34\2\u00e0\u00e1"+
		"\7\n\2\2\u00e1\u00e2\5:\36\2\u00e2\u00fb\3\2\2\2\u00e3\u00e4\7\13\2\2"+
		"\u00e4\u00e5\5\66\34\2\u00e5\u00e6\7\f\2\2\u00e6\u00e7\58\35\2\u00e7\u00fb"+
		"\3\2\2\2\u00e8\u00e9\58\35\2\u00e9\u00ea\7\r\2\2\u00ea\u00eb\5:\36\2\u00eb"+
		"\u00fb\3\2\2\2\u00ec\u00ed\58\35\2\u00ed\u00ee\7\16\2\2\u00ee\u00ef\5"+
		":\36\2\u00ef\u00fb\3\2\2\2\u00f0\u00f1\58\35\2\u00f1\u00f2\7\17\2\2\u00f2"+
		"\u00f3\58\35\2\u00f3\u00fb\3\2\2\2\u00f4\u00f5\7\20\2\2\u00f5\u00f6\5"+
		":\36\2\u00f6\u00f7\7\4\2\2\u00f7\u00f8\5:\36\2\u00f8\u00f9\7\5\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00d9\3\2\2\2\u00fa\u00de\3\2\2\2\u00fa\u00e3\3\2"+
		"\2\2\u00fa\u00e8\3\2\2\2\u00fa\u00ec\3\2\2\2\u00fa\u00f0\3\2\2\2\u00fa"+
		"\u00f4\3\2\2\2\u00fb\35\3\2\2\2\u00fc\u00fd\7\13\2\2\u00fd\u00fe\5\66"+
		"\34\2\u00fe\u00ff\7\21\2\2\u00ff\u0100\5:\36\2\u0100\u0112\3\2\2\2\u0101"+
		"\u0102\7\t\2\2\u0102\u0103\58\35\2\u0103\u0104\7\21\2\2\u0104\u0105\5"+
		":\36\2\u0105\u0112\3\2\2\2\u0106\u0107\7\13\2\2\u0107\u0108\5\66\34\2"+
		"\u0108\u0109\7\22\2\2\u0109\u010a\5:\36\2\u010a\u0112\3\2\2\2\u010b\u010c"+
		"\7\t\2\2\u010c\u010d\58\35\2\u010d\u010e\7\22\2\2\u010e\u010f\5:\36\2"+
		"\u010f\u0112\3\2\2\2\u0110\u0112\7\23\2\2\u0111\u00fc\3\2\2\2\u0111\u0101"+
		"\3\2\2\2\u0111\u0106\3\2\2\2\u0111\u010b\3\2\2\2\u0111\u0110\3\2\2\2\u0112"+
		"\37\3\2\2\2\u0113\u0114\7\13\2\2\u0114\u0115\5\66\34\2\u0115\u0116\7\24"+
		"\2\2\u0116\u0117\5:\36\2\u0117\u0147\3\2\2\2\u0118\u0119\7\t\2\2\u0119"+
		"\u011a\58\35\2\u011a\u011b\7\24\2\2\u011b\u011c\5:\36\2\u011c\u0147\3"+
		"\2\2\2\u011d\u011e\5\66\34\2\u011e\u011f\7\25\2\2\u011f\u0120\5:\36\2"+
		"\u0120\u0147\3\2\2\2\u0121\u0122\5:\36\2\u0122\u0123\7\26\2\2\u0123\u0147"+
		"\3\2\2\2\u0124\u0125\5:\36\2\u0125\u0126\7\27\2\2\u0126\u0147\3\2\2\2"+
		"\u0127\u0128\5:\36\2\u0128\u0129\7\30\2\2\u0129\u0147\3\2\2\2\u012a\u012b"+
		"\7\31\2\2\u012b\u012c\5:\36\2\u012c\u012d\7\32\2\2\u012d\u012e\5\62\32"+
		"\2\u012e\u0147\3\2\2\2\u012f\u0130\5\66\34\2\u0130\u0131\7\33\2\2\u0131"+
		"\u0132\5\66\34\2\u0132\u0147\3\2\2\2\u0133\u0134\7\34\2\2\u0134\u0135"+
		"\5:\36\2\u0135\u0136\7\32\2\2\u0136\u0137\5D#\2\u0137\u0147\3\2\2\2\u0138"+
		"\u0139\7\35\2\2\u0139\u013a\5:\36\2\u013a\u013b\7\36\2\2\u013b\u013c\5"+
		":\36\2\u013c\u013d\7\32\2\2\u013d\u013e\5L\'\2\u013e\u0147\3\2\2\2\u013f"+
		"\u0140\7\37\2\2\u0140\u0141\t\2\2\2\u0141\u0142\7 \2\2\u0142\u0143\5:"+
		"\36\2\u0143\u0144\7\32\2\2\u0144\u0145\t\3\2\2\u0145\u0147\3\2\2\2\u0146"+
		"\u0113\3\2\2\2\u0146\u0118\3\2\2\2\u0146\u011d\3\2\2\2\u0146\u0121\3\2"+
		"\2\2\u0146\u0124\3\2\2\2\u0146\u0127\3\2\2\2\u0146\u012a\3\2\2\2\u0146"+
		"\u012f\3\2\2\2\u0146\u0133\3\2\2\2\u0146\u0138\3\2\2\2\u0146\u013f\3\2"+
		"\2\2\u0147!\3\2\2\2\u0148\u0149\7!\2\2\u0149\u014a\78\2\2\u014a\u014b"+
		"\7\3\2\2\u014b\u014c\5$\23\2\u014c\u014d\7\5\2\2\u014d\u014e\7\"\2\2\u014e"+
		"\u014f\5B\"\2\u014f\u018a\3\2\2\2\u0150\u0151\7#\2\2\u0151\u0152\7K\2"+
		"\2\u0152\u0153\78\2\2\u0153\u0154\7\3\2\2\u0154\u0155\5$\23\2\u0155\u0156"+
		"\7\5\2\2\u0156\u0157\7\"\2\2\u0157\u0158\5B\"\2\u0158\u018a\3\2\2\2\u0159"+
		"\u015a\7$\2\2\u015a\u015b\7K\2\2\u015b\u015c\78\2\2\u015c\u015d\7\3\2"+
		"\2\u015d\u015e\5$\23\2\u015e\u015f\7\5\2\2\u015f\u0163\7\"\2\2\u0160\u0164"+
		"\5B\"\2\u0161\u0164\5D#\2\u0162\u0164\5L\'\2\u0163\u0160\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164\u018a\3\2\2\2\u0165\u0166\7%"+
		"\2\2\u0166\u0167\7K\2\2\u0167\u0168\78\2\2\u0168\u0169\7\3\2\2\u0169\u016a"+
		"\5$\23\2\u016a\u016b\7\5\2\2\u016b\u016f\7\"\2\2\u016c\u0170\5B\"\2\u016d"+
		"\u0170\5D#\2\u016e\u0170\5L\'\2\u016f\u016c\3\2\2\2\u016f\u016d\3\2\2"+
		"\2\u016f\u016e\3\2\2\2\u0170\u018a\3\2\2\2\u0171\u0172\7&\2\2\u0172\u0173"+
		"\7K\2\2\u0173\u0174\78\2\2\u0174\u0175\7\3\2\2\u0175\u0176\5$\23\2\u0176"+
		"\u0177\7\5\2\2\u0177\u017b\7\"\2\2\u0178\u017c\5B\"\2\u0179\u017c\5D#"+
		"\2\u017a\u017c\5L\'\2\u017b\u0178\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017a"+
		"\3\2\2\2\u017c\u018a\3\2\2\2\u017d\u017e\7\'\2\2\u017e\u017f\7K\2\2\u017f"+
		"\u0180\78\2\2\u0180\u0181\7\3\2\2\u0181\u0182\5$\23\2\u0182\u0183\7\5"+
		"\2\2\u0183\u0187\7\"\2\2\u0184\u0188\5B\"\2\u0185\u0188\5D#\2\u0186\u0188"+
		"\5L\'\2\u0187\u0184\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188"+
		"\u018a\3\2\2\2\u0189\u0148\3\2\2\2\u0189\u0150\3\2\2\2\u0189\u0159\3\2"+
		"\2\2\u0189\u0165\3\2\2\2\u0189\u0171\3\2\2\2\u0189\u017d\3\2\2\2\u018a"+
		"#\3\2\2\2\u018b\u0190\5\16\b\2\u018c\u018d\7\63\2\2\u018d\u018f\5\16\b"+
		"\2\u018e\u018c\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191"+
		"\3\2\2\2\u0191%\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0196\5(\25\2\u0194"+
		"\u0196\5*\26\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196\'\3\2\2\2"+
		"\u0197\u0198\5,\27\2\u0198\u0199\5N(\2\u0199\u019a\5,\27\2\u019a)\3\2"+
		"\2\2\u019b\u019c\5,\27\2\u019c\u019d\5P)\2\u019d\u019e\5,\27\2\u019e+"+
		"\3\2\2\2\u019f\u01a3\7K\2\2\u01a0\u01a3\7J\2\2\u01a1\u01a3\5\60\31\2\u01a2"+
		"\u019f\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3-\3\2\2\2"+
		"\u01a4\u01a5\7\3\2\2\u01a5\u01a6\5\60\31\2\u01a6\u01a7\5R*\2\u01a7\u01a8"+
		"\5\60\31\2\u01a8\u01a9\7\5\2\2\u01a9/\3\2\2\2\u01aa\u01af\5B\"\2\u01ab"+
		"\u01af\5D#\2\u01ac\u01af\5L\'\2\u01ad\u01af\5.\30\2\u01ae\u01aa\3\2\2"+
		"\2\u01ae\u01ab\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af\61"+
		"\3\2\2\2\u01b0\u01b4\7P\2\2\u01b1\u01b4\5\64\33\2\u01b2\u01b4\7K\2\2\u01b3"+
		"\u01b0\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4\63\3\2\2"+
		"\2\u01b5\u01b6\7J\2\2\u01b6\65\3\2\2\2\u01b7\u01b8\t\2\2\2\u01b8\67\3"+
		"\2\2\2\u01b9\u01ba\t\2\2\2\u01ba9\3\2\2\2\u01bb\u01bc\5<\37\2\u01bc\u01bd"+
		"\b\36\1\2\u01bd\u01c5\3\2\2\2\u01be\u01bf\5> \2\u01bf\u01c0\b\36\1\2\u01c0"+
		"\u01c5\3\2\2\2\u01c1\u01c2\5@!\2\u01c2\u01c3\b\36\1\2\u01c3\u01c5\3\2"+
		"\2\2\u01c4\u01bb\3\2\2\2\u01c4\u01be\3\2\2\2\u01c4\u01c1\3\2\2\2\u01c5"+
		";\3\2\2\2\u01c6\u01c7\t\2\2\2\u01c7=\3\2\2\2\u01c8\u01c9\t\2\2\2\u01c9"+
		"\u01ca\7(\2\2\u01ca\u01cb\t\2\2\2\u01cb?\3\2\2\2\u01cc\u01cd\t\2\2\2\u01cd"+
		"\u01ce\7(\2\2\u01ce\u01cf\t\2\2\2\u01cf\u01d0\7(\2\2\u01d0\u01d1\t\2\2"+
		"\2\u01d1A\3\2\2\2\u01d2\u01d5\7M\2\2\u01d3\u01d5\7K\2\2\u01d4\u01d2\3"+
		"\2\2\2\u01d4\u01d3\3\2\2\2\u01d5C\3\2\2\2\u01d6\u01d7\7)\2\2\u01d7\u01d8"+
		"\5F$\2\u01d8\u01d9\7\5\2\2\u01d9\u01da\b#\1\2\u01da\u01e7\3\2\2\2\u01db"+
		"\u01dc\7)\2\2\u01dc\u01dd\5H%\2\u01dd\u01de\7\5\2\2\u01de\u01df\b#\1\2"+
		"\u01df\u01e7\3\2\2\2\u01e0\u01e1\7)\2\2\u01e1\u01e2\5J&\2\u01e2\u01e3"+
		"\7\5\2\2\u01e3\u01e4\b#\1\2\u01e4\u01e7\3\2\2\2\u01e5\u01e7\7K\2\2\u01e6"+
		"\u01d6\3\2\2\2\u01e6\u01db\3\2\2\2\u01e6\u01e0\3\2\2\2\u01e6\u01e5\3\2"+
		"\2\2\u01e7E\3\2\2\2\u01e8\u01e9\7M\2\2\u01e9\u01ea\7B\2\2\u01ea\u01eb"+
		"\7M\2\2\u01eb\u01ec\7B\2\2\u01ec\u01ed\7M\2\2\u01ed\u01ee\7*\2\2\u01ee"+
		"\u01f9\7M\2\2\u01ef\u01f0\7+\2\2\u01f0\u01f7\7M\2\2\u01f1\u01f2\7+\2\2"+
		"\u01f2\u01f5\7M\2\2\u01f3\u01f4\7(\2\2\u01f4\u01f6\7M\2\2\u01f5\u01f3"+
		"\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f1\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01ef\3\2\2\2\u01f9\u01fa\3\2"+
		"\2\2\u01faG\3\2\2\2\u01fb\u0202\7M\2\2\u01fc\u01fd\7B\2\2\u01fd\u0200"+
		"\7M\2\2\u01fe\u01ff\7B\2\2\u01ff\u0201\7M\2\2\u0200\u01fe\3\2\2\2\u0200"+
		"\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u01fc\3\2\2\2\u0202\u0203\3\2"+
		"\2\2\u0203I\3\2\2\2\u0204\u0205\7*\2\2\u0205\u0210\7M\2\2\u0206\u0207"+
		"\7+\2\2\u0207\u020e\7M\2\2\u0208\u0209\7+\2\2\u0209\u020c\7M\2\2\u020a"+
		"\u020b\7(\2\2\u020b\u020d\7M\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2"+
		"\2\u020d\u020f\3\2\2\2\u020e\u0208\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211"+
		"\3\2\2\2\u0210\u0206\3\2\2\2\u0210\u0211\3\2\2\2\u0211K\3\2\2\2\u0212"+
		"\u0214\7,\2\2\u0213\u0215\7D\2\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2"+
		"\2\u0215\u0217\3\2\2\2\u0216\u0218\7E\2\2\u0217\u0216\3\2\2\2\u0217\u0218"+
		"\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u021b\7F\2\2\u021a\u0219\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u021e\7G\2\2\u021d\u021c\3\2"+
		"\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2\2\2\u021f\u0221\7H\2\2\u0220"+
		"\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u0224\7I"+
		"\2\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\u0228\7\5\2\2\u0226\u0228\7K\2\2\u0227\u0212\3\2\2\2\u0227\u0226\3\2"+
		"\2\2\u0228M\3\2\2\2\u0229\u022a\t\4\2\2\u022aO\3\2\2\2\u022b\u022c\t\5"+
		"\2\2\u022cQ\3\2\2\2\u022d\u022e\t\6\2\2\u022eS\3\2\2\2\60X^du~\u0082\u0086"+
		"\u0093\u0099\u00a1\u00ad\u00b8\u00c1\u00c9\u00d7\u00fa\u0111\u0146\u0163"+
		"\u016f\u017b\u0187\u0189\u0190\u0195\u01a2\u01ae\u01b3\u01c4\u01d4\u01e6"+
		"\u01f5\u01f7\u01f9\u0200\u0202\u020c\u020e\u0210\u0214\u0217\u021a\u021d"+
		"\u0220\u0223\u0227";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}