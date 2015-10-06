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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, MULTILINE_COMMENTS=44, 
		SINGLE_LINE_COMMENTS=45, SET=46, IF=47, THEN=48, NEG=49, KONJ=50, DISJ=51, 
		DEF=52, DESC=53, ARGS=54, WHERE=55, EQUAL=56, NOTEQUAL=57, LOWER=58, LEQ=59, 
		GREATER=60, GEQ=61, MUL=62, DIV=63, ADD=64, SUB=65, GEN=66, YEARS=67, 
		MONTHS=68, DAYS=69, HOURS=70, MINUTES=71, SECONDS=72, CONSTANT=73, VARIABLE=74, 
		CLAUSE=75, NUMBER=76, STRING=77, WS=78, EVENTTYPE=79;
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
		"'is lub'", "'dominates'", "'and'", "'are critical task pairs'", "'cannot execute'", 
		"'must execute'", "'illegal execution'", "'executed'", "'taskname of'", 
		"'is'", "'is assigned to'", "'aborted'", "'completed'", "'started'", "'eventtype of'", 
		"'is collaborator of'", "'timestamp of'", "'timeinterval of'", "'attribute'", 
		"'of'", "'NUMBER'", "'IS'", "'NUMBER OF'", "'SUM OF'", "'AVG OF'", "'MIN OF'", 
		"'MAX OF'", "'.'", "'tp('", "'T'", "':'", "'ts('", null, null, "'SET'", 
		"'IF'", "'THEN'", "'NOT'", "'AND'", "'OR'", "'DEF'", "'DESC'", null, "'WHERE'", 
		"'='", "'!='", "'<'", "'<='", "'>'", "'>='", "'*'", "'/'", "'+'", "'-'", 
		"'GENERATED'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "MULTILINE_COMMENTS", 
		"SINGLE_LINE_COMMENTS", "SET", "IF", "THEN", "NEG", "KONJ", "DISJ", "DEF", 
		"DESC", "ARGS", "WHERE", "EQUAL", "NOTEQUAL", "LOWER", "LEQ", "GREATER", 
		"GEQ", "MUL", "DIV", "ADD", "SUB", "GEN", "YEARS", "MONTHS", "DAYS", "HOURS", 
		"MINUTES", "SECONDS", "CONSTANT", "VARIABLE", "CLAUSE", "NUMBER", "STRING", 
		"WS", "EVENTTYPE"
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
			setState(119);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
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
			setState(121);
			match(SET);
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(122);
				extern();
				}
				break;
			case 2:
				{
				setState(123);
				specification();
				}
				break;
			case 3:
				{
				setState(124);
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
			setState(129);
			_la = _input.LA(1);
			if (_la==DESC) {
				{
				setState(128);
				description();
				}
			}

			setState(131);
			match(IF);
			setState(133);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__8) | (1L << T__19) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << T__42) | (1L << NEG))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (CONSTANT - 73)) | (1L << (VARIABLE - 73)) | (1L << (CLAUSE - 73)) | (1L << (NUMBER - 73)))) != 0)) {
				{
				setState(132);
				assignmentBody();
				}
			}

			setState(135);
			match(THEN);
			setState(136);
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
			setState(138);
			match(DESC);
			setState(139);
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
			setState(141);
			clauses();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KONJ) {
				{
				{
				setState(142);
				match(KONJ);
				setState(143);
				clauses();
				}
				}
				setState(148);
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
			setState(152);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				atoms();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				disjunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
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
			setState(154);
			match(T__0);
			setState(155);
			atoms();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DISJ) {
				{
				{
				setState(156);
				match(DISJ);
				setState(157);
				atoms();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
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
			setState(165);
			match(NEG);
			setState(166);
			match(T__0);
			setState(167);
			atoms();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KONJ) {
				{
				{
				setState(168);
				match(KONJ);
				setState(169);
				atoms();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
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
			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				specification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				status();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				comparison();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				extern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
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
		public int i =  0;
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
			setState(185);
			((DefinedClauseContext)_localctx).CLAUSE = match(CLAUSE);
			setState(198);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(186);
				match(T__0);
				setState(187);
				_la = _input.LA(1);
				if ( !(_la==CONSTANT || _la==VARIABLE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				_localctx.i++;
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(189);
					match(T__1);
					setState(190);
					_la = _input.LA(1);
					if ( !(_la==CONSTANT || _la==VARIABLE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					_localctx.i++;
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197);
				match(T__2);
				}
			}

			 ph.existsClause((((DefinedClauseContext)_localctx).CLAUSE!=null?((DefinedClauseContext)_localctx).CLAUSE.getText():null),_localctx.i);
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
			setState(204);
			switch (_input.LA(1)) {
			case T__6:
			case T__8:
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				enforcement();
				}
				break;
			case CLAUSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
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
			setState(218);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new RelatedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				ut();
				setState(207);
				match(T__3);
				setState(208);
				ut();
				}
				break;
			case 2:
				_localctx = new PartnerofContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				ut();
				setState(211);
				match(T__4);
				setState(212);
				ut();
				}
				break;
			case 3:
				_localctx = new SamegroupContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				ut();
				setState(215);
				match(T__5);
				setState(216);
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
			setState(252);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new RoleTaskContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(T__6);
				setState(221);
				rt();
				setState(222);
				match(T__7);
				setState(223);
				tt();
				}
				break;
			case 2:
				_localctx = new UserTaskContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(T__8);
				setState(226);
				ut();
				setState(227);
				match(T__7);
				setState(228);
				tt();
				}
				break;
			case 3:
				_localctx = new UserRoleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(T__8);
				setState(231);
				ut();
				setState(232);
				match(T__9);
				setState(233);
				rt();
				}
				break;
			case 4:
				_localctx = new GlbContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				rt();
				setState(236);
				match(T__10);
				setState(237);
				tt();
				}
				break;
			case 5:
				_localctx = new LubContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(239);
				rt();
				setState(240);
				match(T__11);
				setState(241);
				tt();
				}
				break;
			case 6:
				_localctx = new DominateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				rt();
				setState(244);
				match(T__12);
				setState(245);
				rt();
				}
				break;
			case 7:
				_localctx = new CritTaskPairContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(247);
				tt();
				setState(248);
				match(T__13);
				setState(249);
				tt();
				setState(250);
				match(T__14);
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
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new CannotUserContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(T__8);
				setState(255);
				ut();
				setState(256);
				match(T__15);
				setState(257);
				tt();
				}
				break;
			case 2:
				_localctx = new CannotRoleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(T__6);
				setState(260);
				rt();
				setState(261);
				match(T__15);
				setState(262);
				tt();
				}
				break;
			case 3:
				_localctx = new MustUserContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(T__8);
				setState(265);
				ut();
				setState(266);
				match(T__16);
				setState(267);
				tt();
				}
				break;
			case 4:
				_localctx = new MustRoleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				match(T__6);
				setState(270);
				rt();
				setState(271);
				match(T__16);
				setState(272);
				tt();
				}
				break;
			case 5:
				_localctx = new PanicContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
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
	public static class TaskNameContext extends StatusContext {
		public TtContext tt() {
			return getRuleContext(TtContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(Inter_InstanceParser.CONSTANT, 0); }
		public TaskNameContext(StatusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterTaskName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitTaskName(this);
		}
	}

	public final StatusContext status() throws RecognitionException {
		StatusContext _localctx = new StatusContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_status);
		int _la;
		try {
			setState(333);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ExecutedUserContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(T__8);
				setState(278);
				ut();
				setState(279);
				match(T__18);
				setState(280);
				tt();
				}
				break;
			case 2:
				_localctx = new ExecutedRoleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(T__6);
				setState(283);
				rt();
				setState(284);
				match(T__18);
				setState(285);
				tt();
				}
				break;
			case 3:
				_localctx = new TaskNameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(T__19);
				setState(288);
				tt();
				setState(289);
				match(T__20);
				setState(290);
				match(CONSTANT);
				}
				break;
			case 4:
				_localctx = new AssignedUserContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				ut();
				setState(293);
				match(T__21);
				setState(294);
				tt();
				}
				break;
			case 5:
				_localctx = new AbortedTaskContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				tt();
				setState(297);
				match(T__22);
				}
				break;
			case 6:
				_localctx = new SucceededTaskContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(299);
				tt();
				setState(300);
				match(T__23);
				}
				break;
			case 7:
				_localctx = new StartedTaskContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(302);
				tt();
				setState(303);
				match(T__24);
				}
				break;
			case 8:
				_localctx = new FlexibleEventContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(305);
				match(T__25);
				setState(306);
				tt();
				setState(307);
				match(T__20);
				setState(308);
				et();
				}
				break;
			case 9:
				_localctx = new CollaboratorContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(310);
				ut();
				setState(311);
				match(T__26);
				setState(312);
				ut();
				}
				break;
			case 10:
				_localctx = new TimestampContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(314);
				match(T__27);
				setState(315);
				tt();
				setState(316);
				match(T__20);
				setState(317);
				tp();
				}
				break;
			case 11:
				_localctx = new TimeintervalContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(319);
				match(T__28);
				setState(320);
				tt();
				setState(321);
				match(T__13);
				setState(322);
				tt();
				setState(323);
				match(T__20);
				setState(324);
				ts();
				}
				break;
			case 12:
				_localctx = new AttributeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(326);
				match(T__29);
				setState(327);
				_la = _input.LA(1);
				if ( !(_la==CONSTANT || _la==VARIABLE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(328);
				match(T__30);
				setState(329);
				tt();
				setState(330);
				match(T__20);
				setState(331);
				_la = _input.LA(1);
				if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (CONSTANT - 73)) | (1L << (VARIABLE - 73)) | (1L << (NUMBER - 73)))) != 0)) ) {
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
			setState(400);
			switch (_input.LA(1)) {
			case T__31:
				_localctx = new NumSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(T__31);
				setState(336);
				match(WHERE);
				setState(337);
				match(T__0);
				setState(338);
				conditionalBody();
				setState(339);
				match(T__2);
				setState(340);
				match(T__32);
				setState(341);
				nt();
				}
				break;
			case T__33:
				_localctx = new NumVarsContext(_localctx);
				enterOuterAlt(_localctx, 2);
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
				match(T__32);
				setState(350);
				nt();
				}
				break;
			case T__34:
				_localctx = new SumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				match(T__34);
				setState(353);
				match(VARIABLE);
				setState(354);
				match(WHERE);
				setState(355);
				match(T__0);
				setState(356);
				conditionalBody();
				setState(357);
				match(T__2);
				setState(358);
				match(T__32);
				setState(362);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(359);
					nt();
					}
					break;
				case 2:
					{
					setState(360);
					tp();
					}
					break;
				case 3:
					{
					setState(361);
					ts();
					}
					break;
				}
				}
				break;
			case T__35:
				_localctx = new AvgContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				match(T__35);
				setState(365);
				match(VARIABLE);
				setState(366);
				match(WHERE);
				setState(367);
				match(T__0);
				setState(368);
				conditionalBody();
				setState(369);
				match(T__2);
				setState(370);
				match(T__32);
				setState(374);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(371);
					nt();
					}
					break;
				case 2:
					{
					setState(372);
					tp();
					}
					break;
				case 3:
					{
					setState(373);
					ts();
					}
					break;
				}
				}
				break;
			case T__36:
				_localctx = new MinContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(376);
				match(T__36);
				setState(377);
				match(VARIABLE);
				setState(378);
				match(WHERE);
				setState(379);
				match(T__0);
				setState(380);
				conditionalBody();
				setState(381);
				match(T__2);
				setState(382);
				match(T__32);
				setState(386);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(383);
					nt();
					}
					break;
				case 2:
					{
					setState(384);
					tp();
					}
					break;
				case 3:
					{
					setState(385);
					ts();
					}
					break;
				}
				}
				break;
			case T__37:
				_localctx = new MaxContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(388);
				match(T__37);
				setState(389);
				match(VARIABLE);
				setState(390);
				match(WHERE);
				setState(391);
				match(T__0);
				setState(392);
				conditionalBody();
				setState(393);
				match(T__2);
				setState(394);
				match(T__32);
				setState(398);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(395);
					nt();
					}
					break;
				case 2:
					{
					setState(396);
					tp();
					}
					break;
				case 3:
					{
					setState(397);
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
			setState(402);
			clauses();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KONJ) {
				{
				{
				setState(403);
				match(KONJ);
				setState(404);
				clauses();
				}
				}
				setState(409);
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
			setState(412);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				equalityExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
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
			setState(414);
			comparisonArg();
			setState(415);
			equality();
			setState(416);
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
			setState(418);
			comparisonArg();
			setState(419);
			inequality();
			setState(420);
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
			setState(425);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new ComparisonVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(VARIABLE);
				}
				break;
			case 2:
				_localctx = new ComparisonConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				match(CONSTANT);
				}
				break;
			case 3:
				_localctx = new ComparisonArithmArgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
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
			setState(427);
			match(T__0);
			setState(428);
			arithmeticArg();
			setState(429);
			arithmetic();
			setState(430);
			arithmeticArg();
			setState(431);
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
			setState(437);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new ArithmeticNTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				nt();
				}
				break;
			case 2:
				_localctx = new ArithmeticTPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				tp();
				}
				break;
			case 3:
				_localctx = new ArithmeticTSContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
				ts();
				}
				break;
			case 4:
				_localctx = new ArithmeticExContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
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
			setState(442);
			switch (_input.LA(1)) {
			case EVENTTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(EVENTTYPE);
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				unknownEvent();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
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
			setState(444);
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
			setState(446);
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
			setState(448);
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
			setState(459);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
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
				setState(453);
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
				setState(456);
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
			setState(463);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(464);
			match(T__38);
			setState(465);
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
			setState(467);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(468);
			match(T__38);
			setState(469);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(470);
			match(T__38);
			setState(471);
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
			setState(475);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				match(NUMBER);
				}
				break;
			case VARIABLE:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
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
			setState(493);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new DateTimeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				match(T__39);
				setState(478);
				((DateTimeContext)_localctx).dt = dt();
				setState(479);
				match(T__2);
				ph.checkDateTime((((DateTimeContext)_localctx).dt!=null?_input.getText(((DateTimeContext)_localctx).dt.start,((DateTimeContext)_localctx).dt.stop):null));
				}
				break;
			case 2:
				_localctx = new DateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(T__39);
				setState(483);
				((DateContext)_localctx).d = d();
				setState(484);
				match(T__2);
				ph.checkDate((((DateContext)_localctx).d!=null?_input.getText(((DateContext)_localctx).d.start,((DateContext)_localctx).d.stop):null));
				}
				break;
			case 3:
				_localctx = new TimeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				match(T__39);
				setState(488);
				((TimeContext)_localctx).t = t();
				setState(489);
				match(T__2);
				ph.checkTime((((TimeContext)_localctx).t!=null?_input.getText(((TimeContext)_localctx).t.start,((TimeContext)_localctx).t.stop):null));
				}
				break;
			case 4:
				_localctx = new VarTPContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(492);
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
			setState(495);
			match(NUMBER);
			setState(496);
			match(SUB);
			setState(497);
			match(NUMBER);
			setState(498);
			match(SUB);
			setState(499);
			match(NUMBER);
			setState(500);
			match(T__40);
			setState(501);
			match(NUMBER);
			setState(512);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(502);
				match(T__41);
				setState(503);
				match(NUMBER);
				setState(510);
				_la = _input.LA(1);
				if (_la==T__41) {
					{
					setState(504);
					match(T__41);
					setState(505);
					match(NUMBER);
					setState(508);
					_la = _input.LA(1);
					if (_la==T__38) {
						{
						setState(506);
						match(T__38);
						setState(507);
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
			setState(514);
			match(NUMBER);
			setState(521);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(515);
				match(SUB);
				setState(516);
				match(NUMBER);
				setState(519);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(517);
					match(SUB);
					setState(518);
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
			setState(523);
			match(T__40);
			setState(524);
			match(NUMBER);
			setState(535);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(525);
				match(T__41);
				setState(526);
				match(NUMBER);
				setState(533);
				_la = _input.LA(1);
				if (_la==T__41) {
					{
					setState(527);
					match(T__41);
					setState(528);
					match(NUMBER);
					setState(531);
					_la = _input.LA(1);
					if (_la==T__38) {
						{
						setState(529);
						match(T__38);
						setState(530);
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
			setState(558);
			switch (_input.LA(1)) {
			case T__42:
				_localctx = new AbsoluteIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				match(T__42);
				setState(539);
				_la = _input.LA(1);
				if (_la==YEARS) {
					{
					setState(538);
					match(YEARS);
					}
				}

				setState(542);
				_la = _input.LA(1);
				if (_la==MONTHS) {
					{
					setState(541);
					match(MONTHS);
					}
				}

				setState(545);
				_la = _input.LA(1);
				if (_la==DAYS) {
					{
					setState(544);
					match(DAYS);
					}
				}

				setState(548);
				_la = _input.LA(1);
				if (_la==HOURS) {
					{
					setState(547);
					match(HOURS);
					}
				}

				setState(551);
				_la = _input.LA(1);
				if (_la==MINUTES) {
					{
					setState(550);
					match(MINUTES);
					}
				}

				setState(554);
				_la = _input.LA(1);
				if (_la==SECONDS) {
					{
					setState(553);
					match(SECONDS);
					}
				}

				setState(556);
				match(T__2);
				}
				break;
			case VARIABLE:
				_localctx = new VarTSContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
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
			setState(560);
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
			setState(562);
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
			setState(564);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (MUL - 62)) | (1L << (DIV - 62)) | (1L << (ADD - 62)) | (1L << (SUB - 62)))) != 0)) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3Q\u0239\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\7\2W\n\2\f\2\16\2Z\13\2\3\2\7\2]\n\2\f\2\16\2`\13\2\3\2\7\2c\n\2\f\2"+
		"\16\2f\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3t\n\3\f"+
		"\3\16\3w\13\3\3\3\5\3z\n\3\3\4\3\4\3\4\3\4\5\4\u0080\n\4\3\5\3\5\5\5\u0084"+
		"\n\5\3\5\3\5\5\5\u0088\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u0093"+
		"\n\7\f\7\16\7\u0096\13\7\3\b\3\b\3\b\5\b\u009b\n\b\3\t\3\t\3\t\3\t\7\t"+
		"\u00a1\n\t\f\t\16\t\u00a4\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u00ad\n"+
		"\n\f\n\16\n\u00b0\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ba"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c3\n\f\f\f\16\f\u00c6\13\f\3"+
		"\f\5\f\u00c9\n\f\3\f\3\f\3\r\3\r\5\r\u00cf\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00dd\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00ff\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0116\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0150\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u016d\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0179\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u0185\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0191"+
		"\n\22\5\22\u0193\n\22\3\23\3\23\3\23\7\23\u0198\n\23\f\23\16\23\u019b"+
		"\13\23\3\24\3\24\5\24\u019f\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\5\27\u01ac\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\5\31\u01b8\n\31\3\32\3\32\3\32\5\32\u01bd\n\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5"+
		"\36\u01ce\n\36\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\5\"\u01de"+
		"\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01f0\n#\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01ff\n$\5$\u0201\n$\5$\u0203\n"+
		"$\3%\3%\3%\3%\3%\5%\u020a\n%\5%\u020c\n%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0216"+
		"\n&\5&\u0218\n&\5&\u021a\n&\3\'\3\'\5\'\u021e\n\'\3\'\5\'\u0221\n\'\3"+
		"\'\5\'\u0224\n\'\3\'\5\'\u0227\n\'\3\'\5\'\u022a\n\'\3\'\5\'\u022d\n\'"+
		"\3\'\3\'\5\'\u0231\n\'\3(\3(\3)\3)\3*\3*\3*\2\2+\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\7\3\2KL\4\2KL"+
		"NN\3\2:;\3\2<?\3\2@C\u0267\2T\3\2\2\2\4j\3\2\2\2\6{\3\2\2\2\b\u0081\3"+
		"\2\2\2\n\u008c\3\2\2\2\f\u008f\3\2\2\2\16\u009a\3\2\2\2\20\u009c\3\2\2"+
		"\2\22\u00a7\3\2\2\2\24\u00b9\3\2\2\2\26\u00bb\3\2\2\2\30\u00ce\3\2\2\2"+
		"\32\u00dc\3\2\2\2\34\u00fe\3\2\2\2\36\u0115\3\2\2\2 \u014f\3\2\2\2\"\u0192"+
		"\3\2\2\2$\u0194\3\2\2\2&\u019e\3\2\2\2(\u01a0\3\2\2\2*\u01a4\3\2\2\2,"+
		"\u01ab\3\2\2\2.\u01ad\3\2\2\2\60\u01b7\3\2\2\2\62\u01bc\3\2\2\2\64\u01be"+
		"\3\2\2\2\66\u01c0\3\2\2\28\u01c2\3\2\2\2:\u01cd\3\2\2\2<\u01cf\3\2\2\2"+
		">\u01d1\3\2\2\2@\u01d5\3\2\2\2B\u01dd\3\2\2\2D\u01ef\3\2\2\2F\u01f1\3"+
		"\2\2\2H\u0204\3\2\2\2J\u020d\3\2\2\2L\u0230\3\2\2\2N\u0232\3\2\2\2P\u0234"+
		"\3\2\2\2R\u0236\3\2\2\2TX\b\2\1\2UW\5\4\3\2VU\3\2\2\2WZ\3\2\2\2XV\3\2"+
		"\2\2XY\3\2\2\2Y^\3\2\2\2ZX\3\2\2\2[]\5\6\4\2\\[\3\2\2\2]`\3\2\2\2^\\\3"+
		"\2\2\2^_\3\2\2\2_d\3\2\2\2`^\3\2\2\2ac\5\b\5\2ba\3\2\2\2cf\3\2\2\2db\3"+
		"\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\2\2\3hi\b\2\1\2i\3\3\2\2\2jk"+
		"\7\66\2\2kl\7M\2\2ly\b\3\1\2mn\7\3\2\2no\78\2\2ou\b\3\1\2pq\7\4\2\2qr"+
		"\78\2\2rt\b\3\1\2sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu"+
		"\3\2\2\2xz\7\5\2\2ym\3\2\2\2yz\3\2\2\2z\5\3\2\2\2{\177\7\60\2\2|\u0080"+
		"\5\32\16\2}\u0080\5\34\17\2~\u0080\5\26\f\2\177|\3\2\2\2\177}\3\2\2\2"+
		"\177~\3\2\2\2\u0080\7\3\2\2\2\u0081\u0083\b\5\1\2\u0082\u0084\5\n\6\2"+
		"\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087"+
		"\7\61\2\2\u0086\u0088\5\f\7\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2"+
		"\u0088\u0089\3\2\2\2\u0089\u008a\7\62\2\2\u008a\u008b\5\30\r\2\u008b\t"+
		"\3\2\2\2\u008c\u008d\7\67\2\2\u008d\u008e\7K\2\2\u008e\13\3\2\2\2\u008f"+
		"\u0094\5\16\b\2\u0090\u0091\7\64\2\2\u0091\u0093\5\16\b\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\r\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009b\5\24\13\2\u0098\u009b\5\20"+
		"\t\2\u0099\u009b\5\22\n\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\17\3\2\2\2\u009c\u009d\7\3\2\2\u009d\u00a2\5\24\13"+
		"\2\u009e\u009f\7\65\2\2\u009f\u00a1\5\24\13\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\5\2\2\u00a6\21\3\2\2\2\u00a7\u00a8"+
		"\7\63\2\2\u00a8\u00a9\7\3\2\2\u00a9\u00ae\5\24\13\2\u00aa\u00ab\7\64\2"+
		"\2\u00ab\u00ad\5\24\13\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b1\u00b2\7\5\2\2\u00b2\23\3\2\2\2\u00b3\u00ba\5\34\17\2\u00b4"+
		"\u00ba\5 \21\2\u00b5\u00ba\5&\24\2\u00b6\u00ba\5\"\22\2\u00b7\u00ba\5"+
		"\32\16\2\u00b8\u00ba\5\26\f\2\u00b9\u00b3\3\2\2\2\u00b9\u00b4\3\2\2\2"+
		"\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\25\3\2\2\2\u00bb\u00c8\7M\2\2\u00bc\u00bd\7\3\2\2\u00bd"+
		"\u00be\t\2\2\2\u00be\u00c4\b\f\1\2\u00bf\u00c0\7\4\2\2\u00c0\u00c1\t\2"+
		"\2\2\u00c1\u00c3\b\f\1\2\u00c2\u00bf\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c7\u00c9\7\5\2\2\u00c8\u00bc\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\b\f\1\2\u00cb\27\3\2\2\2\u00cc\u00cf\5\36\20"+
		"\2\u00cd\u00cf\5\26\f\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf"+
		"\31\3\2\2\2\u00d0\u00d1\5\66\34\2\u00d1\u00d2\7\6\2\2\u00d2\u00d3\5\66"+
		"\34\2\u00d3\u00dd\3\2\2\2\u00d4\u00d5\5\66\34\2\u00d5\u00d6\7\7\2\2\u00d6"+
		"\u00d7\5\66\34\2\u00d7\u00dd\3\2\2\2\u00d8\u00d9\5\66\34\2\u00d9\u00da"+
		"\7\b\2\2\u00da\u00db\5\66\34\2\u00db\u00dd\3\2\2\2\u00dc\u00d0\3\2\2\2"+
		"\u00dc\u00d4\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd\33\3\2\2\2\u00de\u00df"+
		"\7\t\2\2\u00df\u00e0\58\35\2\u00e0\u00e1\7\n\2\2\u00e1\u00e2\5:\36\2\u00e2"+
		"\u00ff\3\2\2\2\u00e3\u00e4\7\13\2\2\u00e4\u00e5\5\66\34\2\u00e5\u00e6"+
		"\7\n\2\2\u00e6\u00e7\5:\36\2\u00e7\u00ff\3\2\2\2\u00e8\u00e9\7\13\2\2"+
		"\u00e9\u00ea\5\66\34\2\u00ea\u00eb\7\f\2\2\u00eb\u00ec\58\35\2\u00ec\u00ff"+
		"\3\2\2\2\u00ed\u00ee\58\35\2\u00ee\u00ef\7\r\2\2\u00ef\u00f0\5:\36\2\u00f0"+
		"\u00ff\3\2\2\2\u00f1\u00f2\58\35\2\u00f2\u00f3\7\16\2\2\u00f3\u00f4\5"+
		":\36\2\u00f4\u00ff\3\2\2\2\u00f5\u00f6\58\35\2\u00f6\u00f7\7\17\2\2\u00f7"+
		"\u00f8\58\35\2\u00f8\u00ff\3\2\2\2\u00f9\u00fa\5:\36\2\u00fa\u00fb\7\20"+
		"\2\2\u00fb\u00fc\5:\36\2\u00fc\u00fd\7\21\2\2\u00fd\u00ff\3\2\2\2\u00fe"+
		"\u00de\3\2\2\2\u00fe\u00e3\3\2\2\2\u00fe\u00e8\3\2\2\2\u00fe\u00ed\3\2"+
		"\2\2\u00fe\u00f1\3\2\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f9\3\2\2\2\u00ff"+
		"\35\3\2\2\2\u0100\u0101\7\13\2\2\u0101\u0102\5\66\34\2\u0102\u0103\7\22"+
		"\2\2\u0103\u0104\5:\36\2\u0104\u0116\3\2\2\2\u0105\u0106\7\t\2\2\u0106"+
		"\u0107\58\35\2\u0107\u0108\7\22\2\2\u0108\u0109\5:\36\2\u0109\u0116\3"+
		"\2\2\2\u010a\u010b\7\13\2\2\u010b\u010c\5\66\34\2\u010c\u010d\7\23\2\2"+
		"\u010d\u010e\5:\36\2\u010e\u0116\3\2\2\2\u010f\u0110\7\t\2\2\u0110\u0111"+
		"\58\35\2\u0111\u0112\7\23\2\2\u0112\u0113\5:\36\2\u0113\u0116\3\2\2\2"+
		"\u0114\u0116\7\24\2\2\u0115\u0100\3\2\2\2\u0115\u0105\3\2\2\2\u0115\u010a"+
		"\3\2\2\2\u0115\u010f\3\2\2\2\u0115\u0114\3\2\2\2\u0116\37\3\2\2\2\u0117"+
		"\u0118\7\13\2\2\u0118\u0119\5\66\34\2\u0119\u011a\7\25\2\2\u011a\u011b"+
		"\5:\36\2\u011b\u0150\3\2\2\2\u011c\u011d\7\t\2\2\u011d\u011e\58\35\2\u011e"+
		"\u011f\7\25\2\2\u011f\u0120\5:\36\2\u0120\u0150\3\2\2\2\u0121\u0122\7"+
		"\26\2\2\u0122\u0123\5:\36\2\u0123\u0124\7\27\2\2\u0124\u0125\7K\2\2\u0125"+
		"\u0150\3\2\2\2\u0126\u0127\5\66\34\2\u0127\u0128\7\30\2\2\u0128\u0129"+
		"\5:\36\2\u0129\u0150\3\2\2\2\u012a\u012b\5:\36\2\u012b\u012c\7\31\2\2"+
		"\u012c\u0150\3\2\2\2\u012d\u012e\5:\36\2\u012e\u012f\7\32\2\2\u012f\u0150"+
		"\3\2\2\2\u0130\u0131\5:\36\2\u0131\u0132\7\33\2\2\u0132\u0150\3\2\2\2"+
		"\u0133\u0134\7\34\2\2\u0134\u0135\5:\36\2\u0135\u0136\7\27\2\2\u0136\u0137"+
		"\5\62\32\2\u0137\u0150\3\2\2\2\u0138\u0139\5\66\34\2\u0139\u013a\7\35"+
		"\2\2\u013a\u013b\5\66\34\2\u013b\u0150\3\2\2\2\u013c\u013d\7\36\2\2\u013d"+
		"\u013e\5:\36\2\u013e\u013f\7\27\2\2\u013f\u0140\5D#\2\u0140\u0150\3\2"+
		"\2\2\u0141\u0142\7\37\2\2\u0142\u0143\5:\36\2\u0143\u0144\7\20\2\2\u0144"+
		"\u0145\5:\36\2\u0145\u0146\7\27\2\2\u0146\u0147\5L\'\2\u0147\u0150\3\2"+
		"\2\2\u0148\u0149\7 \2\2\u0149\u014a\t\2\2\2\u014a\u014b\7!\2\2\u014b\u014c"+
		"\5:\36\2\u014c\u014d\7\27\2\2\u014d\u014e\t\3\2\2\u014e\u0150\3\2\2\2"+
		"\u014f\u0117\3\2\2\2\u014f\u011c\3\2\2\2\u014f\u0121\3\2\2\2\u014f\u0126"+
		"\3\2\2\2\u014f\u012a\3\2\2\2\u014f\u012d\3\2\2\2\u014f\u0130\3\2\2\2\u014f"+
		"\u0133\3\2\2\2\u014f\u0138\3\2\2\2\u014f\u013c\3\2\2\2\u014f\u0141\3\2"+
		"\2\2\u014f\u0148\3\2\2\2\u0150!\3\2\2\2\u0151\u0152\7\"\2\2\u0152\u0153"+
		"\79\2\2\u0153\u0154\7\3\2\2\u0154\u0155\5$\23\2\u0155\u0156\7\5\2\2\u0156"+
		"\u0157\7#\2\2\u0157\u0158\5B\"\2\u0158\u0193\3\2\2\2\u0159\u015a\7$\2"+
		"\2\u015a\u015b\7L\2\2\u015b\u015c\79\2\2\u015c\u015d\7\3\2\2\u015d\u015e"+
		"\5$\23\2\u015e\u015f\7\5\2\2\u015f\u0160\7#\2\2\u0160\u0161\5B\"\2\u0161"+
		"\u0193\3\2\2\2\u0162\u0163\7%\2\2\u0163\u0164\7L\2\2\u0164\u0165\79\2"+
		"\2\u0165\u0166\7\3\2\2\u0166\u0167\5$\23\2\u0167\u0168\7\5\2\2\u0168\u016c"+
		"\7#\2\2\u0169\u016d\5B\"\2\u016a\u016d\5D#\2\u016b\u016d\5L\'\2\u016c"+
		"\u0169\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d\u0193\3\2"+
		"\2\2\u016e\u016f\7&\2\2\u016f\u0170\7L\2\2\u0170\u0171\79\2\2\u0171\u0172"+
		"\7\3\2\2\u0172\u0173\5$\23\2\u0173\u0174\7\5\2\2\u0174\u0178\7#\2\2\u0175"+
		"\u0179\5B\"\2\u0176\u0179\5D#\2\u0177\u0179\5L\'\2\u0178\u0175\3\2\2\2"+
		"\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179\u0193\3\2\2\2\u017a\u017b"+
		"\7\'\2\2\u017b\u017c\7L\2\2\u017c\u017d\79\2\2\u017d\u017e\7\3\2\2\u017e"+
		"\u017f\5$\23\2\u017f\u0180\7\5\2\2\u0180\u0184\7#\2\2\u0181\u0185\5B\""+
		"\2\u0182\u0185\5D#\2\u0183\u0185\5L\'\2\u0184\u0181\3\2\2\2\u0184\u0182"+
		"\3\2\2\2\u0184\u0183\3\2\2\2\u0185\u0193\3\2\2\2\u0186\u0187\7(\2\2\u0187"+
		"\u0188\7L\2\2\u0188\u0189\79\2\2\u0189\u018a\7\3\2\2\u018a\u018b\5$\23"+
		"\2\u018b\u018c\7\5\2\2\u018c\u0190\7#\2\2\u018d\u0191\5B\"\2\u018e\u0191"+
		"\5D#\2\u018f\u0191\5L\'\2\u0190\u018d\3\2\2\2\u0190\u018e\3\2\2\2\u0190"+
		"\u018f\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0151\3\2\2\2\u0192\u0159\3\2"+
		"\2\2\u0192\u0162\3\2\2\2\u0192\u016e\3\2\2\2\u0192\u017a\3\2\2\2\u0192"+
		"\u0186\3\2\2\2\u0193#\3\2\2\2\u0194\u0199\5\16\b\2\u0195\u0196\7\64\2"+
		"\2\u0196\u0198\5\16\b\2\u0197\u0195\3\2\2\2\u0198\u019b\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a%\3\2\2\2\u019b\u0199\3\2\2\2"+
		"\u019c\u019f\5(\25\2\u019d\u019f\5*\26\2\u019e\u019c\3\2\2\2\u019e\u019d"+
		"\3\2\2\2\u019f\'\3\2\2\2\u01a0\u01a1\5,\27\2\u01a1\u01a2\5N(\2\u01a2\u01a3"+
		"\5,\27\2\u01a3)\3\2\2\2\u01a4\u01a5\5,\27\2\u01a5\u01a6\5P)\2\u01a6\u01a7"+
		"\5,\27\2\u01a7+\3\2\2\2\u01a8\u01ac\7L\2\2\u01a9\u01ac\7K\2\2\u01aa\u01ac"+
		"\5\60\31\2\u01ab\u01a8\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2"+
		"\u01ac-\3\2\2\2\u01ad\u01ae\7\3\2\2\u01ae\u01af\5\60\31\2\u01af\u01b0"+
		"\5R*\2\u01b0\u01b1\5\60\31\2\u01b1\u01b2\7\5\2\2\u01b2/\3\2\2\2\u01b3"+
		"\u01b8\5B\"\2\u01b4\u01b8\5D#\2\u01b5\u01b8\5L\'\2\u01b6\u01b8\5.\30\2"+
		"\u01b7\u01b3\3\2\2\2\u01b7\u01b4\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b6"+
		"\3\2\2\2\u01b8\61\3\2\2\2\u01b9\u01bd\7Q\2\2\u01ba\u01bd\5\64\33\2\u01bb"+
		"\u01bd\7L\2\2\u01bc\u01b9\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb\3\2"+
		"\2\2\u01bd\63\3\2\2\2\u01be\u01bf\7K\2\2\u01bf\65\3\2\2\2\u01c0\u01c1"+
		"\t\2\2\2\u01c1\67\3\2\2\2\u01c2\u01c3\t\2\2\2\u01c39\3\2\2\2\u01c4\u01c5"+
		"\5<\37\2\u01c5\u01c6\b\36\1\2\u01c6\u01ce\3\2\2\2\u01c7\u01c8\5> \2\u01c8"+
		"\u01c9\b\36\1\2\u01c9\u01ce\3\2\2\2\u01ca\u01cb\5@!\2\u01cb\u01cc\b\36"+
		"\1\2\u01cc\u01ce\3\2\2\2\u01cd\u01c4\3\2\2\2\u01cd\u01c7\3\2\2\2\u01cd"+
		"\u01ca\3\2\2\2\u01ce;\3\2\2\2\u01cf\u01d0\t\2\2\2\u01d0=\3\2\2\2\u01d1"+
		"\u01d2\t\2\2\2\u01d2\u01d3\7)\2\2\u01d3\u01d4\t\2\2\2\u01d4?\3\2\2\2\u01d5"+
		"\u01d6\t\2\2\2\u01d6\u01d7\7)\2\2\u01d7\u01d8\t\2\2\2\u01d8\u01d9\7)\2"+
		"\2\u01d9\u01da\t\2\2\2\u01daA\3\2\2\2\u01db\u01de\7N\2\2\u01dc\u01de\7"+
		"L\2\2\u01dd\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01deC\3\2\2\2\u01df\u01e0"+
		"\7*\2\2\u01e0\u01e1\5F$\2\u01e1\u01e2\7\5\2\2\u01e2\u01e3\b#\1\2\u01e3"+
		"\u01f0\3\2\2\2\u01e4\u01e5\7*\2\2\u01e5\u01e6\5H%\2\u01e6\u01e7\7\5\2"+
		"\2\u01e7\u01e8\b#\1\2\u01e8\u01f0\3\2\2\2\u01e9\u01ea\7*\2\2\u01ea\u01eb"+
		"\5J&\2\u01eb\u01ec\7\5\2\2\u01ec\u01ed\b#\1\2\u01ed\u01f0\3\2\2\2\u01ee"+
		"\u01f0\7L\2\2\u01ef\u01df\3\2\2\2\u01ef\u01e4\3\2\2\2\u01ef\u01e9\3\2"+
		"\2\2\u01ef\u01ee\3\2\2\2\u01f0E\3\2\2\2\u01f1\u01f2\7N\2\2\u01f2\u01f3"+
		"\7C\2\2\u01f3\u01f4\7N\2\2\u01f4\u01f5\7C\2\2\u01f5\u01f6\7N\2\2\u01f6"+
		"\u01f7\7+\2\2\u01f7\u0202\7N\2\2\u01f8\u01f9\7,\2\2\u01f9\u0200\7N\2\2"+
		"\u01fa\u01fb\7,\2\2\u01fb\u01fe\7N\2\2\u01fc\u01fd\7)\2\2\u01fd\u01ff"+
		"\7N\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201\3\2\2\2\u0200"+
		"\u01fa\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u01f8\3\2"+
		"\2\2\u0202\u0203\3\2\2\2\u0203G\3\2\2\2\u0204\u020b\7N\2\2\u0205\u0206"+
		"\7C\2\2\u0206\u0209\7N\2\2\u0207\u0208\7C\2\2\u0208\u020a\7N\2\2\u0209"+
		"\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u0205\3\2"+
		"\2\2\u020b\u020c\3\2\2\2\u020cI\3\2\2\2\u020d\u020e\7+\2\2\u020e\u0219"+
		"\7N\2\2\u020f\u0210\7,\2\2\u0210\u0217\7N\2\2\u0211\u0212\7,\2\2\u0212"+
		"\u0215\7N\2\2\u0213\u0214\7)\2\2\u0214\u0216\7N\2\2\u0215\u0213\3\2\2"+
		"\2\u0215\u0216\3\2\2\2\u0216\u0218\3\2\2\2\u0217\u0211\3\2\2\2\u0217\u0218"+
		"\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u020f\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"K\3\2\2\2\u021b\u021d\7-\2\2\u021c\u021e\7E\2\2\u021d\u021c\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u0220\3\2\2\2\u021f\u0221\7F\2\2\u0220\u021f\3\2"+
		"\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u0224\7G\2\2\u0223"+
		"\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0226\3\2\2\2\u0225\u0227\7H"+
		"\2\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228"+
		"\u022a\7I\2\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2"+
		"\2\2\u022b\u022d\7J\2\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u0231\7\5\2\2\u022f\u0231\7L\2\2\u0230\u021b\3\2"+
		"\2\2\u0230\u022f\3\2\2\2\u0231M\3\2\2\2\u0232\u0233\t\4\2\2\u0233O\3\2"+
		"\2\2\u0234\u0235\t\5\2\2\u0235Q\3\2\2\2\u0236\u0237\t\6\2\2\u0237S\3\2"+
		"\2\2\62X^duy\177\u0083\u0087\u0094\u009a\u00a2\u00ae\u00b9\u00c4\u00c8"+
		"\u00ce\u00dc\u00fe\u0115\u014f\u016c\u0178\u0184\u0190\u0192\u0199\u019e"+
		"\u01ab\u01b7\u01bc\u01cd\u01dd\u01ef\u01fe\u0200\u0202\u0209\u020b\u0215"+
		"\u0217\u0219\u021d\u0220\u0223\u0226\u0229\u022c\u0230";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}