// Generated from Inter_Instance.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__46=1, T__45=2, T__44=3, T__43=4, T__42=5, T__41=6, T__40=7, T__39=8, 
		T__38=9, T__37=10, T__36=11, T__35=12, T__34=13, T__33=14, T__32=15, T__31=16, 
		T__30=17, T__29=18, T__28=19, T__27=20, T__26=21, T__25=22, T__24=23, 
		T__23=24, T__22=25, T__21=26, T__20=27, T__19=28, T__18=29, T__17=30, 
		T__16=31, T__15=32, T__14=33, T__13=34, T__12=35, T__11=36, T__10=37, 
		T__9=38, T__8=39, T__7=40, T__6=41, T__5=42, T__4=43, T__3=44, T__2=45, 
		T__1=46, T__0=47, STRING=48, CONSTANT=49, VARIABLE=50, STRING_NUM=51, 
		NUMBER=52, COMMENTS=53, WS=54;
	public static final String[] tokenNames = {
		"<INVALID>", "'THEN'", "'role('", "'avg('", "'succeeded('", "'count('", 
		"','", "'*'", "'-'", "'('", "'time_interval('", "'<'", "'lub('", "'timestamp('", 
		"'<='", "'user('", "'workflow'", "'cannot_do_r('", "'must_execute_u('", 
		"'IF'", "'executed_u('", "'cannot_do_u('", "'glb('", "'SET'", "'related('", 
		"'>('", "'AND'", "')'", "'.'", "'partner_of('", "'sum('", "'+'", "'='", 
		"';'", "'max('", "'must_execute_r('", "'aborted('", "'critical_task_pair('", 
		"'>'", "'executed_r('", "'??'", "'same_group('", "'belong('", "'/'", "'>='", 
		"'assigned('", "'min('", "'collaborator('", "STRING", "CONSTANT", "VARIABLE", 
		"STRING_NUM", "NUMBER", "COMMENTS", "WS"
	};
	public static final int
		RULE_file = 0, RULE_statement = 1, RULE_explicit = 2, RULE_assignment = 3, 
		RULE_assignmentBody = 4, RULE_assignmentHead = 5, RULE_staticdynamic = 6, 
		RULE_staticdynamicBody = 7, RULE_staticdynamicHead = 8, RULE_derivation = 9, 
		RULE_derivationBody = 10, RULE_derivationHead = 11, RULE_extern = 12, 
		RULE_specification = 13, RULE_enforcement = 14, RULE_status = 15, RULE_conditional = 16, 
		RULE_comparison = 17, RULE_arithmetic = 18, RULE_user = 19, RULE_role = 20, 
		RULE_task = 21, RULE_intra = 22, RULE_inter = 23, RULE_interp = 24, RULE_nt = 25, 
		RULE_ut = 26, RULE_rt = 27, RULE_ct = 28, RULE_tt = 29, RULE_ti = 30, 
		RULE_wt = 31, RULE_taut = 32;
	public static final String[] ruleNames = {
		"file", "statement", "explicit", "assignment", "assignmentBody", "assignmentHead", 
		"staticdynamic", "staticdynamicBody", "staticdynamicHead", "derivation", 
		"derivationBody", "derivationHead", "extern", "specification", "enforcement", 
		"status", "conditional", "comparison", "arithmetic", "user", "role", "task", 
		"intra", "inter", "interp", "nt", "ut", "rt", "ct", "tt", "ti", "wt", 
		"taut"
	};

	@Override
	public String getGrammarFileName() { return "Inter_Instance.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode EOF() { return getToken(Inter_InstanceParser.EOF, 0); }
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
			while (_la==T__28 || _la==T__24) {
				{
				{
				setState(66); statement();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72); match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		public DerivationContext derivation() {
			return getRuleContext(DerivationContext.class,0);
		}
		public ExplicitContext explicit() {
			return getRuleContext(ExplicitContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StaticdynamicContext staticdynamic() {
			return getRuleContext(StaticdynamicContext.class,0);
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
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); explicit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76); staticdynamic();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77); derivation();
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

	public static class ExplicitContext extends ParserRuleContext {
		public SpecificationContext specification() {
			return getRuleContext(SpecificationContext.class,0);
		}
		public ExternContext extern() {
			return getRuleContext(ExternContext.class,0);
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
		enterRule(_localctx, 4, RULE_explicit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(T__24);
			setState(83);
			switch (_input.LA(1)) {
			case T__23:
			case T__18:
			case T__6:
				{
				setState(81); extern();
				}
				break;
			case T__45:
			case T__35:
			case T__32:
			case T__25:
			case T__22:
			case T__10:
			case T__5:
				{
				setState(82); specification();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(85); match(T__14);
			}
		}
		catch (RecognitionException re) {
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
		public AssignmentHeadContext assignmentHead() {
			return getRuleContext(AssignmentHeadContext.class,0);
		}
		public List<AssignmentBodyContext> assignmentBody() {
			return getRuleContexts(AssignmentBodyContext.class);
		}
		public AssignmentBodyContext assignmentBody(int i) {
			return getRuleContext(AssignmentBodyContext.class,i);
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
			setState(87); match(T__28);
			setState(88); assignmentBody();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(89); match(T__21);
				setState(90); assignmentBody();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96); match(T__46);
			setState(97); assignmentHead();
			setState(98); match(T__14);
			}
		}
		catch (RecognitionException re) {
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
		try {
			setState(105);
			switch (_input.LA(1)) {
			case T__45:
			case T__35:
			case T__32:
			case T__25:
			case T__22:
			case T__10:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(100); specification();
				}
				break;
			case T__43:
			case T__27:
			case T__11:
			case T__8:
			case T__2:
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(101); status();
				}
				break;
			case T__38:
			case T__37:
			case T__34:
			case T__31:
			case T__7:
			case CONSTANT:
			case VARIABLE:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(102); comparison();
				}
				break;
			case T__44:
			case T__42:
			case T__17:
			case T__13:
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(103); conditional();
				}
				break;
			case T__23:
			case T__18:
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(104); extern();
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
		enterRule(_localctx, 10, RULE_assignmentHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); enforcement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticdynamicContext extends ParserRuleContext {
		public StaticdynamicHeadContext staticdynamicHead() {
			return getRuleContext(StaticdynamicHeadContext.class,0);
		}
		public StaticdynamicBodyContext staticdynamicBody(int i) {
			return getRuleContext(StaticdynamicBodyContext.class,i);
		}
		public List<StaticdynamicBodyContext> staticdynamicBody() {
			return getRuleContexts(StaticdynamicBodyContext.class);
		}
		public StaticdynamicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticdynamic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterStaticdynamic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitStaticdynamic(this);
		}
	}

	public final StaticdynamicContext staticdynamic() throws RecognitionException {
		StaticdynamicContext _localctx = new StaticdynamicContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_staticdynamic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(T__28);
			setState(110); staticdynamicBody();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(111); match(T__21);
				setState(112); staticdynamicBody();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118); match(T__46);
			setState(119); staticdynamicHead();
			setState(120); match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticdynamicBodyContext extends ParserRuleContext {
		public SpecificationContext specification() {
			return getRuleContext(SpecificationContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public StaticdynamicBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticdynamicBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterStaticdynamicBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitStaticdynamicBody(this);
		}
	}

	public final StaticdynamicBodyContext staticdynamicBody() throws RecognitionException {
		StaticdynamicBodyContext _localctx = new StaticdynamicBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_staticdynamicBody);
		try {
			setState(125);
			switch (_input.LA(1)) {
			case T__45:
			case T__35:
			case T__32:
			case T__25:
			case T__22:
			case T__10:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(122); specification();
				}
				break;
			case T__38:
			case T__37:
			case T__34:
			case T__31:
			case T__7:
			case CONSTANT:
			case VARIABLE:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); comparison();
				}
				break;
			case T__44:
			case T__42:
			case T__17:
			case T__13:
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(124); conditional();
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

	public static class StaticdynamicHeadContext extends ParserRuleContext {
		public SpecificationContext specification() {
			return getRuleContext(SpecificationContext.class,0);
		}
		public EnforcementContext enforcement() {
			return getRuleContext(EnforcementContext.class,0);
		}
		public StaticdynamicHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticdynamicHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterStaticdynamicHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitStaticdynamicHead(this);
		}
	}

	public final StaticdynamicHeadContext staticdynamicHead() throws RecognitionException {
		StaticdynamicHeadContext _localctx = new StaticdynamicHeadContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_staticdynamicHead);
		try {
			setState(129);
			switch (_input.LA(1)) {
			case T__30:
			case T__29:
			case T__26:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(127); enforcement();
				}
				break;
			case T__45:
			case T__35:
			case T__32:
			case T__25:
			case T__22:
			case T__10:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(128); specification();
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

	public static class DerivationContext extends ParserRuleContext {
		public DerivationBodyContext derivationBody(int i) {
			return getRuleContext(DerivationBodyContext.class,i);
		}
		public DerivationHeadContext derivationHead() {
			return getRuleContext(DerivationHeadContext.class,0);
		}
		public List<DerivationBodyContext> derivationBody() {
			return getRuleContexts(DerivationBodyContext.class);
		}
		public DerivationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derivation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterDerivation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitDerivation(this);
		}
	}

	public final DerivationContext derivation() throws RecognitionException {
		DerivationContext _localctx = new DerivationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_derivation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); match(T__28);
			setState(132); derivationBody();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(133); match(T__21);
				setState(134); derivationBody();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140); match(T__46);
			setState(141); derivationHead();
			setState(142); match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DerivationBodyContext extends ParserRuleContext {
		public SpecificationContext specification() {
			return getRuleContext(SpecificationContext.class,0);
		}
		public StatusContext status() {
			return getRuleContext(StatusContext.class,0);
		}
		public DerivationBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derivationBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterDerivationBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitDerivationBody(this);
		}
	}

	public final DerivationBodyContext derivationBody() throws RecognitionException {
		DerivationBodyContext _localctx = new DerivationBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_derivationBody);
		try {
			setState(146);
			switch (_input.LA(1)) {
			case T__45:
			case T__35:
			case T__32:
			case T__25:
			case T__22:
			case T__10:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(144); specification();
				}
				break;
			case T__43:
			case T__27:
			case T__11:
			case T__8:
			case T__2:
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(145); status();
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

	public static class DerivationHeadContext extends ParserRuleContext {
		public SpecificationContext specification() {
			return getRuleContext(SpecificationContext.class,0);
		}
		public EnforcementContext enforcement() {
			return getRuleContext(EnforcementContext.class,0);
		}
		public DerivationHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derivationHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterDerivationHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitDerivationHead(this);
		}
	}

	public final DerivationHeadContext derivationHead() throws RecognitionException {
		DerivationHeadContext _localctx = new DerivationHeadContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_derivationHead);
		try {
			setState(150);
			switch (_input.LA(1)) {
			case T__30:
			case T__29:
			case T__26:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(148); enforcement();
				}
				break;
			case T__45:
			case T__35:
			case T__32:
			case T__25:
			case T__22:
			case T__10:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(149); specification();
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
		public List<UserContext> user() {
			return getRuleContexts(UserContext.class);
		}
		public UserContext user(int i) {
			return getRuleContext(UserContext.class,i);
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
		enterRule(_localctx, 24, RULE_extern);
		try {
			setState(170);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(152); match(T__23);
				setState(153); user();
				setState(154); match(T__41);
				setState(155); user();
				setState(156); match(T__20);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(158); match(T__18);
				setState(159); user();
				setState(160); match(T__41);
				setState(161); user();
				setState(162); match(T__20);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(164); match(T__6);
				setState(165); user();
				setState(166); match(T__41);
				setState(167); user();
				setState(168); match(T__20);
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

	public static class SpecificationContext extends ParserRuleContext {
		public List<RoleContext> role() {
			return getRuleContexts(RoleContext.class);
		}
		public RoleContext role(int i) {
			return getRuleContext(RoleContext.class,i);
		}
		public List<TaskContext> task() {
			return getRuleContexts(TaskContext.class);
		}
		public TaskContext task(int i) {
			return getRuleContext(TaskContext.class,i);
		}
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
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
		enterRule(_localctx, 26, RULE_specification);
		try {
			setState(214);
			switch (_input.LA(1)) {
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); match(T__45);
				setState(173); role();
				setState(174); match(T__41);
				setState(175); task();
				setState(176); match(T__20);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(178); match(T__32);
				setState(179); user();
				setState(180); match(T__41);
				setState(181); task();
				setState(182); match(T__20);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(184); match(T__5);
				setState(185); user();
				setState(186); match(T__41);
				setState(187); role();
				setState(188); match(T__20);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(190); match(T__25);
				setState(191); role();
				setState(192); match(T__41);
				setState(193); task();
				setState(194); match(T__20);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 5);
				{
				setState(196); match(T__35);
				setState(197); role();
				setState(198); match(T__41);
				setState(199); task();
				setState(200); match(T__20);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 6);
				{
				setState(202); match(T__22);
				setState(203); role();
				setState(204); match(T__41);
				setState(205); role();
				setState(206); match(T__20);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(208); match(T__10);
				setState(209); task();
				setState(210); match(T__41);
				setState(211); task();
				setState(212); match(T__20);
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

	public static class EnforcementContext extends ParserRuleContext {
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public TaskContext task() {
			return getRuleContext(TaskContext.class,0);
		}
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
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
		enterRule(_localctx, 28, RULE_enforcement);
		try {
			setState(240);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(216); match(T__26);
				setState(217); user();
				setState(218); match(T__41);
				setState(219); task();
				setState(220); match(T__20);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(222); match(T__30);
				setState(223); role();
				setState(224); match(T__41);
				setState(225); task();
				setState(226); match(T__20);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(228); match(T__29);
				setState(229); user();
				setState(230); match(T__41);
				setState(231); task();
				setState(232); match(T__20);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(234); match(T__12);
				setState(235); role();
				setState(236); match(T__41);
				setState(237); task();
				setState(238); match(T__20);
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

	public static class StatusContext extends ParserRuleContext {
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public TaskContext task() {
			return getRuleContext(TaskContext.class,0);
		}
		public List<UserContext> user() {
			return getRuleContexts(UserContext.class);
		}
		public UserContext user(int i) {
			return getRuleContext(UserContext.class,i);
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
		enterRule(_localctx, 30, RULE_status);
		try {
			setState(274);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(242); match(T__27);
				setState(243); user();
				setState(244); match(T__41);
				setState(245); task();
				setState(246); match(T__20);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(248); match(T__8);
				setState(249); role();
				setState(250); match(T__41);
				setState(251); task();
				setState(252); match(T__20);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(254); match(T__2);
				setState(255); user();
				setState(256); match(T__41);
				setState(257); task();
				setState(258); match(T__20);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(260); match(T__11);
				setState(261); task();
				setState(262); match(T__20);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 5);
				{
				setState(264); match(T__43);
				setState(265); task();
				setState(266); match(T__20);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(268); match(T__0);
				setState(269); user();
				setState(270); match(T__41);
				setState(271); user();
				setState(272); match(T__20);
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public SpecificationContext specification() {
			return getRuleContext(SpecificationContext.class,0);
		}
		public StatusContext status() {
			return getRuleContext(StatusContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public List<NtContext> nt() {
			return getRuleContexts(NtContext.class);
		}
		public NtContext nt(int i) {
			return getRuleContext(NtContext.class,i);
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
		enterRule(_localctx, 32, RULE_conditional);
		try {
			setState(361);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276); match(T__42);
				setState(280);
				switch (_input.LA(1)) {
				case T__45:
				case T__35:
				case T__32:
				case T__25:
				case T__22:
				case T__10:
				case T__5:
					{
					setState(277); specification();
					}
					break;
				case T__43:
				case T__27:
				case T__11:
				case T__8:
				case T__2:
				case T__0:
					{
					setState(278); status();
					}
					break;
				case T__38:
				case T__37:
				case T__34:
				case T__31:
				case T__7:
				case CONSTANT:
				case VARIABLE:
				case NUMBER:
					{
					setState(279); comparison();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(282); match(T__41);
				setState(283); nt();
				setState(284); match(T__20);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286); match(T__42);
				setState(289);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(287); match(VARIABLE);
					}
					break;
				case 2:
					{
					setState(288); nt();
					}
					break;
				}
				setState(291); match(T__41);
				setState(295);
				switch (_input.LA(1)) {
				case T__45:
				case T__35:
				case T__32:
				case T__25:
				case T__22:
				case T__10:
				case T__5:
					{
					setState(292); specification();
					}
					break;
				case T__43:
				case T__27:
				case T__11:
				case T__8:
				case T__2:
				case T__0:
					{
					setState(293); status();
					}
					break;
				case T__38:
				case T__37:
				case T__34:
				case T__31:
				case T__7:
				case CONSTANT:
				case VARIABLE:
				case NUMBER:
					{
					setState(294); comparison();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(297); match(T__41);
				setState(298); nt();
				setState(299); match(T__20);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(301); match(T__44);
				setState(304);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(302); match(VARIABLE);
					}
					break;
				case 2:
					{
					setState(303); nt();
					}
					break;
				}
				setState(306); match(T__41);
				setState(310);
				switch (_input.LA(1)) {
				case T__45:
				case T__35:
				case T__32:
				case T__25:
				case T__22:
				case T__10:
				case T__5:
					{
					setState(307); specification();
					}
					break;
				case T__43:
				case T__27:
				case T__11:
				case T__8:
				case T__2:
				case T__0:
					{
					setState(308); status();
					}
					break;
				case T__38:
				case T__37:
				case T__34:
				case T__31:
				case T__7:
				case CONSTANT:
				case VARIABLE:
				case NUMBER:
					{
					setState(309); comparison();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(312); match(T__41);
				setState(313); nt();
				setState(314); match(T__20);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(316); match(T__1);
				setState(319);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(317); match(VARIABLE);
					}
					break;
				case 2:
					{
					setState(318); nt();
					}
					break;
				}
				setState(321); match(T__41);
				setState(325);
				switch (_input.LA(1)) {
				case T__45:
				case T__35:
				case T__32:
				case T__25:
				case T__22:
				case T__10:
				case T__5:
					{
					setState(322); specification();
					}
					break;
				case T__43:
				case T__27:
				case T__11:
				case T__8:
				case T__2:
				case T__0:
					{
					setState(323); status();
					}
					break;
				case T__38:
				case T__37:
				case T__34:
				case T__31:
				case T__7:
				case CONSTANT:
				case VARIABLE:
				case NUMBER:
					{
					setState(324); comparison();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(327); match(T__41);
				setState(328); nt();
				setState(329); match(T__20);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(331); match(T__13);
				setState(334);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(332); match(VARIABLE);
					}
					break;
				case 2:
					{
					setState(333); nt();
					}
					break;
				}
				setState(336); match(T__41);
				setState(340);
				switch (_input.LA(1)) {
				case T__45:
				case T__35:
				case T__32:
				case T__25:
				case T__22:
				case T__10:
				case T__5:
					{
					setState(337); specification();
					}
					break;
				case T__43:
				case T__27:
				case T__11:
				case T__8:
				case T__2:
				case T__0:
					{
					setState(338); status();
					}
					break;
				case T__38:
				case T__37:
				case T__34:
				case T__31:
				case T__7:
				case CONSTANT:
				case VARIABLE:
				case NUMBER:
					{
					setState(339); comparison();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(342); match(T__41);
				setState(343); nt();
				setState(344); match(T__20);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(346); match(T__17);
				setState(349);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(347); match(VARIABLE);
					}
					break;
				case 2:
					{
					setState(348); nt();
					}
					break;
				}
				setState(351); match(T__41);
				setState(355);
				switch (_input.LA(1)) {
				case T__45:
				case T__35:
				case T__32:
				case T__25:
				case T__22:
				case T__10:
				case T__5:
					{
					setState(352); specification();
					}
					break;
				case T__43:
				case T__27:
				case T__11:
				case T__8:
				case T__2:
				case T__0:
					{
					setState(353); status();
					}
					break;
				case T__38:
				case T__37:
				case T__34:
				case T__31:
				case T__7:
				case CONSTANT:
				case VARIABLE:
				case NUMBER:
					{
					setState(354); comparison();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(357); match(T__41);
				setState(358); nt();
				setState(359); match(T__20);
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

	public static class ComparisonContext extends ParserRuleContext {
		public RtContext rt(int i) {
			return getRuleContext(RtContext.class,i);
		}
		public CtContext ct(int i) {
			return getRuleContext(CtContext.class,i);
		}
		public WtContext wt(int i) {
			return getRuleContext(WtContext.class,i);
		}
		public List<RtContext> rt() {
			return getRuleContexts(RtContext.class);
		}
		public List<TiContext> ti() {
			return getRuleContexts(TiContext.class);
		}
		public List<CtContext> ct() {
			return getRuleContexts(CtContext.class);
		}
		public TtContext tt(int i) {
			return getRuleContext(TtContext.class,i);
		}
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public List<TautContext> taut() {
			return getRuleContexts(TautContext.class);
		}
		public List<TtContext> tt() {
			return getRuleContexts(TtContext.class);
		}
		public TiContext ti(int i) {
			return getRuleContext(TiContext.class,i);
		}
		public List<UtContext> ut() {
			return getRuleContexts(UtContext.class);
		}
		public TautContext taut(int i) {
			return getRuleContext(TautContext.class,i);
		}
		public List<NtContext> nt() {
			return getRuleContexts(NtContext.class);
		}
		public UtContext ut(int i) {
			return getRuleContext(UtContext.class,i);
		}
		public NtContext nt(int i) {
			return getRuleContext(NtContext.class,i);
		}
		public List<WtContext> wt() {
			return getRuleContexts(WtContext.class);
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
		enterRule(_localctx, 34, RULE_comparison);
		int _la;
		try {
			setState(407);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(363); ut();
					}
					break;
				case 2:
					{
					setState(364); rt();
					}
					break;
				case 3:
					{
					setState(365); ct();
					}
					break;
				case 4:
					{
					setState(366); tt();
					}
					break;
				case 5:
					{
					setState(367); ti();
					}
					break;
				case 6:
					{
					setState(368); wt();
					}
					break;
				case 7:
					{
					setState(369); nt();
					}
					break;
				case 8:
					{
					setState(370); match(T__38);
					setState(371); arithmetic();
					setState(372); match(T__20);
					}
					break;
				}
				setState(376); match(T__15);
				setState(388);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(377); ut();
					}
					break;
				case 2:
					{
					setState(378); rt();
					}
					break;
				case 3:
					{
					setState(379); ct();
					}
					break;
				case 4:
					{
					setState(380); tt();
					}
					break;
				case 5:
					{
					setState(381); ti();
					}
					break;
				case 6:
					{
					setState(382); wt();
					}
					break;
				case 7:
					{
					setState(383); nt();
					}
					break;
				case 8:
					{
					setState(384); match(T__38);
					setState(385); arithmetic();
					setState(386); match(T__20);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(390); taut();
					}
					break;
				case 2:
					{
					setState(391); nt();
					}
					break;
				case 3:
					{
					setState(392); match(T__38);
					setState(393); arithmetic();
					setState(394); match(T__20);
					}
					break;
				}
				setState(398);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__33) | (1L << T__9) | (1L << T__3))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(405);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(399); taut();
					}
					break;
				case 2:
					{
					setState(400); nt();
					}
					break;
				case 3:
					{
					setState(401); match(T__38);
					setState(402); arithmetic();
					setState(403); match(T__20);
					}
					break;
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

	public static class ArithmeticContext extends ParserRuleContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public List<NtContext> nt() {
			return getRuleContexts(NtContext.class);
		}
		public NtContext nt(int i) {
			return getRuleContext(NtContext.class,i);
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
			setState(421);
			switch (_input.LA(1)) {
			case T__37:
			case T__34:
			case VARIABLE:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(409); nt();
				setState(410);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__39) | (1L << T__16) | (1L << T__4))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(411); nt();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(413); match(T__38);
				setState(414); arithmetic();
				setState(415); match(T__20);
				setState(416);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__39) | (1L << T__16) | (1L << T__4))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(417); match(T__38);
				setState(418); arithmetic();
				setState(419); match(T__20);
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

	public static class UserContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public TerminalNode CONSTANT() { return getToken(Inter_InstanceParser.CONSTANT, 0); }
		public UserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitUser(this);
		}
	}

	public final UserContext user() throws RecognitionException {
		UserContext _localctx = new UserContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_user);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoleContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public TerminalNode CONSTANT() { return getToken(Inter_InstanceParser.CONSTANT, 0); }
		public RoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitRole(this);
		}
	}

	public final RoleContext role() throws RecognitionException {
		RoleContext _localctx = new RoleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_role);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TaskContext extends ParserRuleContext {
		public InterpContext interp() {
			return getRuleContext(InterpContext.class,0);
		}
		public InterContext inter() {
			return getRuleContext(InterContext.class,0);
		}
		public IntraContext intra() {
			return getRuleContext(IntraContext.class,0);
		}
		public TaskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterTask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitTask(this);
		}
	}

	public final TaskContext task() throws RecognitionException {
		TaskContext _localctx = new TaskContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_task);
		try {
			setState(430);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427); intra();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428); inter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(429); interp();
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
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public TerminalNode CONSTANT() { return getToken(Inter_InstanceParser.CONSTANT, 0); }
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
			setState(432);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> VARIABLE() { return getTokens(Inter_InstanceParser.VARIABLE); }
		public TerminalNode CONSTANT(int i) {
			return getToken(Inter_InstanceParser.CONSTANT, i);
		}
		public TerminalNode VARIABLE(int i) {
			return getToken(Inter_InstanceParser.VARIABLE, i);
		}
		public List<TerminalNode> CONSTANT() { return getTokens(Inter_InstanceParser.CONSTANT); }
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
			setState(434);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(435); match(T__19);
			setState(436);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> VARIABLE() { return getTokens(Inter_InstanceParser.VARIABLE); }
		public TerminalNode CONSTANT(int i) {
			return getToken(Inter_InstanceParser.CONSTANT, i);
		}
		public TerminalNode VARIABLE(int i) {
			return getToken(Inter_InstanceParser.VARIABLE, i);
		}
		public List<TerminalNode> CONSTANT() { return getTokens(Inter_InstanceParser.CONSTANT); }
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
			setState(438);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(439); match(T__19);
			setState(440);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(441); match(T__19);
			setState(442);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public List<TaskContext> task() {
			return getRuleContexts(TaskContext.class);
		}
		public TautContext taut() {
			return getRuleContext(TautContext.class,0);
		}
		public TaskContext task(int i) {
			return getRuleContext(TaskContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(Inter_InstanceParser.NUMBER, 0); }
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
			setState(458);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(444); match(NUMBER);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(445); match(VARIABLE);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(446); match(T__34);
				setState(447); task();
				setState(448); match(T__41);
				setState(449); taut();
				setState(450); match(T__20);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 4);
				{
				setState(452); match(T__37);
				setState(453); task();
				setState(454); match(T__41);
				setState(455); task();
				setState(456); match(T__20);
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
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460); user();
			}
		}
		catch (RecognitionException re) {
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
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
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
		enterRule(_localctx, 54, RULE_rt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462); role();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 56, RULE_ct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464); match(T__7);
			}
		}
		catch (RecognitionException re) {
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
		public TaskContext task() {
			return getRuleContext(TaskContext.class,0);
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
		enterRule(_localctx, 58, RULE_tt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466); task();
			}
		}
		catch (RecognitionException re) {
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
		public TaskContext task() {
			return getRuleContext(TaskContext.class,0);
		}
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
			setState(468); task();
			}
		}
		catch (RecognitionException re) {
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
			setState(470); match(T__31);
			}
		}
		catch (RecognitionException re) {
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
			enterOuterAlt(_localctx, 1);
			{
			setState(472); match(VARIABLE);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u01dd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3Q\n"+
		"\3\3\4\3\4\3\4\5\4V\n\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5^\n\5\f\5\16\5a\13"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6l\n\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\7\bt\n\b\f\b\16\bw\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u0080\n\t\3"+
		"\n\3\n\5\n\u0084\n\n\3\13\3\13\3\13\3\13\7\13\u008a\n\13\f\13\16\13\u008d"+
		"\13\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u0095\n\f\3\r\3\r\5\r\u0099\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00ad\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d9\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f3\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0115\n\21\3\22\3\22\3\22\3\22\5\22\u011b\n\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u0124\n\22\3\22\3\22\3\22\3\22\5\22\u012a\n\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0133\n\22\3\22\3\22\3\22\3\22\5\22"+
		"\u0139\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0142\n\22\3\22\3"+
		"\22\3\22\3\22\5\22\u0148\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u0151\n\22\3\22\3\22\3\22\3\22\5\22\u0157\n\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u0160\n\22\3\22\3\22\3\22\3\22\5\22\u0166\n\22\3\22"+
		"\3\22\3\22\3\22\5\22\u016c\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0179\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0187\n\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u018f\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0198\n\23\5\23\u019a"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u01a8\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\5\27\u01b1\n\27\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01cd\n\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\2\2#"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\5"+
		"\6\2\r\r\20\20((..\5\2\t\n!!--\3\2\63\64\u020b\2G\3\2\2\2\4P\3\2\2\2\6"+
		"R\3\2\2\2\bY\3\2\2\2\nk\3\2\2\2\fm\3\2\2\2\16o\3\2\2\2\20\177\3\2\2\2"+
		"\22\u0083\3\2\2\2\24\u0085\3\2\2\2\26\u0094\3\2\2\2\30\u0098\3\2\2\2\32"+
		"\u00ac\3\2\2\2\34\u00d8\3\2\2\2\36\u00f2\3\2\2\2 \u0114\3\2\2\2\"\u016b"+
		"\3\2\2\2$\u0199\3\2\2\2&\u01a7\3\2\2\2(\u01a9\3\2\2\2*\u01ab\3\2\2\2,"+
		"\u01b0\3\2\2\2.\u01b2\3\2\2\2\60\u01b4\3\2\2\2\62\u01b8\3\2\2\2\64\u01cc"+
		"\3\2\2\2\66\u01ce\3\2\2\28\u01d0\3\2\2\2:\u01d2\3\2\2\2<\u01d4\3\2\2\2"+
		">\u01d6\3\2\2\2@\u01d8\3\2\2\2B\u01da\3\2\2\2DF\5\4\3\2ED\3\2\2\2FI\3"+
		"\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\2\2\3K\3\3\2\2\2LQ"+
		"\5\6\4\2MQ\5\b\5\2NQ\5\16\b\2OQ\5\24\13\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2"+
		"\2PO\3\2\2\2Q\5\3\2\2\2RU\7\31\2\2SV\5\32\16\2TV\5\34\17\2US\3\2\2\2U"+
		"T\3\2\2\2VW\3\2\2\2WX\7#\2\2X\7\3\2\2\2YZ\7\25\2\2Z_\5\n\6\2[\\\7\34\2"+
		"\2\\^\5\n\6\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2"+
		"\2\2bc\7\3\2\2cd\5\f\7\2de\7#\2\2e\t\3\2\2\2fl\5\34\17\2gl\5 \21\2hl\5"+
		"$\23\2il\5\"\22\2jl\5\32\16\2kf\3\2\2\2kg\3\2\2\2kh\3\2\2\2ki\3\2\2\2"+
		"kj\3\2\2\2l\13\3\2\2\2mn\5\36\20\2n\r\3\2\2\2op\7\25\2\2pu\5\20\t\2qr"+
		"\7\34\2\2rt\5\20\t\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2"+
		"wu\3\2\2\2xy\7\3\2\2yz\5\22\n\2z{\7#\2\2{\17\3\2\2\2|\u0080\5\34\17\2"+
		"}\u0080\5$\23\2~\u0080\5\"\22\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2"+
		"\u0080\21\3\2\2\2\u0081\u0084\5\36\20\2\u0082\u0084\5\34\17\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0082\3\2\2\2\u0084\23\3\2\2\2\u0085\u0086\7\25\2\2\u0086"+
		"\u008b\5\26\f\2\u0087\u0088\7\34\2\2\u0088\u008a\5\26\f\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\3\2\2\u008f\u0090\5\30"+
		"\r\2\u0090\u0091\7#\2\2\u0091\25\3\2\2\2\u0092\u0095\5\34\17\2\u0093\u0095"+
		"\5 \21\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\27\3\2\2\2\u0096"+
		"\u0099\5\36\20\2\u0097\u0099\5\34\17\2\u0098\u0096\3\2\2\2\u0098\u0097"+
		"\3\2\2\2\u0099\31\3\2\2\2\u009a\u009b\7\32\2\2\u009b\u009c\5(\25\2\u009c"+
		"\u009d\7\b\2\2\u009d\u009e\5(\25\2\u009e\u009f\7\35\2\2\u009f\u00ad\3"+
		"\2\2\2\u00a0\u00a1\7\37\2\2\u00a1\u00a2\5(\25\2\u00a2\u00a3\7\b\2\2\u00a3"+
		"\u00a4\5(\25\2\u00a4\u00a5\7\35\2\2\u00a5\u00ad\3\2\2\2\u00a6\u00a7\7"+
		"+\2\2\u00a7\u00a8\5(\25\2\u00a8\u00a9\7\b\2\2\u00a9\u00aa\5(\25\2\u00aa"+
		"\u00ab\7\35\2\2\u00ab\u00ad\3\2\2\2\u00ac\u009a\3\2\2\2\u00ac\u00a0\3"+
		"\2\2\2\u00ac\u00a6\3\2\2\2\u00ad\33\3\2\2\2\u00ae\u00af\7\4\2\2\u00af"+
		"\u00b0\5*\26\2\u00b0\u00b1\7\b\2\2\u00b1\u00b2\5,\27\2\u00b2\u00b3\7\35"+
		"\2\2\u00b3\u00d9\3\2\2\2\u00b4\u00b5\7\21\2\2\u00b5\u00b6\5(\25\2\u00b6"+
		"\u00b7\7\b\2\2\u00b7\u00b8\5,\27\2\u00b8\u00b9\7\35\2\2\u00b9\u00d9\3"+
		"\2\2\2\u00ba\u00bb\7,\2\2\u00bb\u00bc\5(\25\2\u00bc\u00bd\7\b\2\2\u00bd"+
		"\u00be\5*\26\2\u00be\u00bf\7\35\2\2\u00bf\u00d9\3\2\2\2\u00c0\u00c1\7"+
		"\30\2\2\u00c1\u00c2\5*\26\2\u00c2\u00c3\7\b\2\2\u00c3\u00c4\5,\27\2\u00c4"+
		"\u00c5\7\35\2\2\u00c5\u00d9\3\2\2\2\u00c6\u00c7\7\16\2\2\u00c7\u00c8\5"+
		"*\26\2\u00c8\u00c9\7\b\2\2\u00c9\u00ca\5,\27\2\u00ca\u00cb\7\35\2\2\u00cb"+
		"\u00d9\3\2\2\2\u00cc\u00cd\7\33\2\2\u00cd\u00ce\5*\26\2\u00ce\u00cf\7"+
		"\b\2\2\u00cf\u00d0\5*\26\2\u00d0\u00d1\7\35\2\2\u00d1\u00d9\3\2\2\2\u00d2"+
		"\u00d3\7\'\2\2\u00d3\u00d4\5,\27\2\u00d4\u00d5\7\b\2\2\u00d5\u00d6\5,"+
		"\27\2\u00d6\u00d7\7\35\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00ae\3\2\2\2\u00d8"+
		"\u00b4\3\2\2\2\u00d8\u00ba\3\2\2\2\u00d8\u00c0\3\2\2\2\u00d8\u00c6\3\2"+
		"\2\2\u00d8\u00cc\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d9\35\3\2\2\2\u00da\u00db"+
		"\7\27\2\2\u00db\u00dc\5(\25\2\u00dc\u00dd\7\b\2\2\u00dd\u00de\5,\27\2"+
		"\u00de\u00df\7\35\2\2\u00df\u00f3\3\2\2\2\u00e0\u00e1\7\23\2\2\u00e1\u00e2"+
		"\5*\26\2\u00e2\u00e3\7\b\2\2\u00e3\u00e4\5,\27\2\u00e4\u00e5\7\35\2\2"+
		"\u00e5\u00f3\3\2\2\2\u00e6\u00e7\7\24\2\2\u00e7\u00e8\5(\25\2\u00e8\u00e9"+
		"\7\b\2\2\u00e9\u00ea\5,\27\2\u00ea\u00eb\7\35\2\2\u00eb\u00f3\3\2\2\2"+
		"\u00ec\u00ed\7%\2\2\u00ed\u00ee\5*\26\2\u00ee\u00ef\7\b\2\2\u00ef\u00f0"+
		"\5,\27\2\u00f0\u00f1\7\35\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00da\3\2\2\2"+
		"\u00f2\u00e0\3\2\2\2\u00f2\u00e6\3\2\2\2\u00f2\u00ec\3\2\2\2\u00f3\37"+
		"\3\2\2\2\u00f4\u00f5\7\26\2\2\u00f5\u00f6\5(\25\2\u00f6\u00f7\7\b\2\2"+
		"\u00f7\u00f8\5,\27\2\u00f8\u00f9\7\35\2\2\u00f9\u0115\3\2\2\2\u00fa\u00fb"+
		"\7)\2\2\u00fb\u00fc\5*\26\2\u00fc\u00fd\7\b\2\2\u00fd\u00fe\5,\27\2\u00fe"+
		"\u00ff\7\35\2\2\u00ff\u0115\3\2\2\2\u0100\u0101\7/\2\2\u0101\u0102\5("+
		"\25\2\u0102\u0103\7\b\2\2\u0103\u0104\5,\27\2\u0104\u0105\7\35\2\2\u0105"+
		"\u0115\3\2\2\2\u0106\u0107\7&\2\2\u0107\u0108\5,\27\2\u0108\u0109\7\35"+
		"\2\2\u0109\u0115\3\2\2\2\u010a\u010b\7\6\2\2\u010b\u010c\5,\27\2\u010c"+
		"\u010d\7\35\2\2\u010d\u0115\3\2\2\2\u010e\u010f\7\61\2\2\u010f\u0110\5"+
		"(\25\2\u0110\u0111\7\b\2\2\u0111\u0112\5(\25\2\u0112\u0113\7\35\2\2\u0113"+
		"\u0115\3\2\2\2\u0114\u00f4\3\2\2\2\u0114\u00fa\3\2\2\2\u0114\u0100\3\2"+
		"\2\2\u0114\u0106\3\2\2\2\u0114\u010a\3\2\2\2\u0114\u010e\3\2\2\2\u0115"+
		"!\3\2\2\2\u0116\u011a\7\7\2\2\u0117\u011b\5\34\17\2\u0118\u011b\5 \21"+
		"\2\u0119\u011b\5$\23\2\u011a\u0117\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u0119"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\7\b\2\2\u011d\u011e\5\64\33\2"+
		"\u011e\u011f\7\35\2\2\u011f\u016c\3\2\2\2\u0120\u0123\7\7\2\2\u0121\u0124"+
		"\7\64\2\2\u0122\u0124\5\64\33\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2"+
		"\2\u0124\u0125\3\2\2\2\u0125\u0129\7\b\2\2\u0126\u012a\5\34\17\2\u0127"+
		"\u012a\5 \21\2\u0128\u012a\5$\23\2\u0129\u0126\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7\b\2\2\u012c"+
		"\u012d\5\64\33\2\u012d\u012e\7\35\2\2\u012e\u016c\3\2\2\2\u012f\u0132"+
		"\7\5\2\2\u0130\u0133\7\64\2\2\u0131\u0133\5\64\33\2\u0132\u0130\3\2\2"+
		"\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0138\7\b\2\2\u0135\u0139"+
		"\5\34\17\2\u0136\u0139\5 \21\2\u0137\u0139\5$\23\2\u0138\u0135\3\2\2\2"+
		"\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b"+
		"\7\b\2\2\u013b\u013c\5\64\33\2\u013c\u013d\7\35\2\2\u013d\u016c\3\2\2"+
		"\2\u013e\u0141\7\60\2\2\u013f\u0142\7\64\2\2\u0140\u0142\5\64\33\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0147\7\b"+
		"\2\2\u0144\u0148\5\34\17\2\u0145\u0148\5 \21\2\u0146\u0148\5$\23\2\u0147"+
		"\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\u014a\7\b\2\2\u014a\u014b\5\64\33\2\u014b\u014c\7\35\2\2\u014c"+
		"\u016c\3\2\2\2\u014d\u0150\7$\2\2\u014e\u0151\7\64\2\2\u014f\u0151\5\64"+
		"\33\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0156\7\b\2\2\u0153\u0157\5\34\17\2\u0154\u0157\5 \21\2\u0155\u0157\5"+
		"$\23\2\u0156\u0153\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u0159\7\b\2\2\u0159\u015a\5\64\33\2\u015a\u015b\7"+
		"\35\2\2\u015b\u016c\3\2\2\2\u015c\u015f\7 \2\2\u015d\u0160\7\64\2\2\u015e"+
		"\u0160\5\64\33\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160\u0161\3"+
		"\2\2\2\u0161\u0165\7\b\2\2\u0162\u0166\5\34\17\2\u0163\u0166\5 \21\2\u0164"+
		"\u0166\5$\23\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2"+
		"\2\2\u0166\u0167\3\2\2\2\u0167\u0168\7\b\2\2\u0168\u0169\5\64\33\2\u0169"+
		"\u016a\7\35\2\2\u016a\u016c\3\2\2\2\u016b\u0116\3\2\2\2\u016b\u0120\3"+
		"\2\2\2\u016b\u012f\3\2\2\2\u016b\u013e\3\2\2\2\u016b\u014d\3\2\2\2\u016b"+
		"\u015c\3\2\2\2\u016c#\3\2\2\2\u016d\u0179\5\66\34\2\u016e\u0179\58\35"+
		"\2\u016f\u0179\5:\36\2\u0170\u0179\5<\37\2\u0171\u0179\5> \2\u0172\u0179"+
		"\5@!\2\u0173\u0179\5\64\33\2\u0174\u0175\7\13\2\2\u0175\u0176\5&\24\2"+
		"\u0176\u0177\7\35\2\2\u0177\u0179\3\2\2\2\u0178\u016d\3\2\2\2\u0178\u016e"+
		"\3\2\2\2\u0178\u016f\3\2\2\2\u0178\u0170\3\2\2\2\u0178\u0171\3\2\2\2\u0178"+
		"\u0172\3\2\2\2\u0178\u0173\3\2\2\2\u0178\u0174\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u0186\7\"\2\2\u017b\u0187\5\66\34\2\u017c\u0187\58\35\2\u017d"+
		"\u0187\5:\36\2\u017e\u0187\5<\37\2\u017f\u0187\5> \2\u0180\u0187\5@!\2"+
		"\u0181\u0187\5\64\33\2\u0182\u0183\7\13\2\2\u0183\u0184\5&\24\2\u0184"+
		"\u0185\7\35\2\2\u0185\u0187\3\2\2\2\u0186\u017b\3\2\2\2\u0186\u017c\3"+
		"\2\2\2\u0186\u017d\3\2\2\2\u0186\u017e\3\2\2\2\u0186\u017f\3\2\2\2\u0186"+
		"\u0180\3\2\2\2\u0186\u0181\3\2\2\2\u0186\u0182\3\2\2\2\u0187\u019a\3\2"+
		"\2\2\u0188\u018f\5B\"\2\u0189\u018f\5\64\33\2\u018a\u018b\7\13\2\2\u018b"+
		"\u018c\5&\24\2\u018c\u018d\7\35\2\2\u018d\u018f\3\2\2\2\u018e\u0188\3"+
		"\2\2\2\u018e\u0189\3\2\2\2\u018e\u018a\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0197\t\2\2\2\u0191\u0198\5B\"\2\u0192\u0198\5\64\33\2\u0193\u0194\7"+
		"\13\2\2\u0194\u0195\5&\24\2\u0195\u0196\7\35\2\2\u0196\u0198\3\2\2\2\u0197"+
		"\u0191\3\2\2\2\u0197\u0192\3\2\2\2\u0197\u0193\3\2\2\2\u0198\u019a\3\2"+
		"\2\2\u0199\u0178\3\2\2\2\u0199\u018e\3\2\2\2\u019a%\3\2\2\2\u019b\u019c"+
		"\5\64\33\2\u019c\u019d\t\3\2\2\u019d\u019e\5\64\33\2\u019e\u01a8\3\2\2"+
		"\2\u019f\u01a0\7\13\2\2\u01a0\u01a1\5&\24\2\u01a1\u01a2\7\35\2\2\u01a2"+
		"\u01a3\t\3\2\2\u01a3\u01a4\7\13\2\2\u01a4\u01a5\5&\24\2\u01a5\u01a6\7"+
		"\35\2\2\u01a6\u01a8\3\2\2\2\u01a7\u019b\3\2\2\2\u01a7\u019f\3\2\2\2\u01a8"+
		"\'\3\2\2\2\u01a9\u01aa\t\4\2\2\u01aa)\3\2\2\2\u01ab\u01ac\t\4\2\2\u01ac"+
		"+\3\2\2\2\u01ad\u01b1\5.\30\2\u01ae\u01b1\5\60\31\2\u01af\u01b1\5\62\32"+
		"\2\u01b0\u01ad\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1-"+
		"\3\2\2\2\u01b2\u01b3\t\4\2\2\u01b3/\3\2\2\2\u01b4\u01b5\t\4\2\2\u01b5"+
		"\u01b6\7\36\2\2\u01b6\u01b7\t\4\2\2\u01b7\61\3\2\2\2\u01b8\u01b9\t\4\2"+
		"\2\u01b9\u01ba\7\36\2\2\u01ba\u01bb\t\4\2\2\u01bb\u01bc\7\36\2\2\u01bc"+
		"\u01bd\t\4\2\2\u01bd\63\3\2\2\2\u01be\u01cd\7\66\2\2\u01bf\u01cd\7\64"+
		"\2\2\u01c0\u01c1\7\17\2\2\u01c1\u01c2\5,\27\2\u01c2\u01c3\7\b\2\2\u01c3"+
		"\u01c4\5B\"\2\u01c4\u01c5\7\35\2\2\u01c5\u01cd\3\2\2\2\u01c6\u01c7\7\f"+
		"\2\2\u01c7\u01c8\5,\27\2\u01c8\u01c9\7\b\2\2\u01c9\u01ca\5,\27\2\u01ca"+
		"\u01cb\7\35\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01be\3\2\2\2\u01cc\u01bf\3"+
		"\2\2\2\u01cc\u01c0\3\2\2\2\u01cc\u01c6\3\2\2\2\u01cd\65\3\2\2\2\u01ce"+
		"\u01cf\5(\25\2\u01cf\67\3\2\2\2\u01d0\u01d1\5*\26\2\u01d19\3\2\2\2\u01d2"+
		"\u01d3\7*\2\2\u01d3;\3\2\2\2\u01d4\u01d5\5,\27\2\u01d5=\3\2\2\2\u01d6"+
		"\u01d7\5,\27\2\u01d7?\3\2\2\2\u01d8\u01d9\7\22\2\2\u01d9A\3\2\2\2\u01da"+
		"\u01db\7\64\2\2\u01dbC\3\2\2\2%GPU_ku\177\u0083\u008b\u0094\u0098\u00ac"+
		"\u00d8\u00f2\u0114\u011a\u0123\u0129\u0132\u0138\u0141\u0147\u0150\u0156"+
		"\u015f\u0165\u016b\u0178\u0186\u018e\u0197\u0199\u01a7\u01b0\u01cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}