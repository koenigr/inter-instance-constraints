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
		T__41=1, T__40=2, T__39=3, T__38=4, T__37=5, T__36=6, T__35=7, T__34=8, 
		T__33=9, T__32=10, T__31=11, T__30=12, T__29=13, T__28=14, T__27=15, T__26=16, 
		T__25=17, T__24=18, T__23=19, T__22=20, T__21=21, T__20=22, T__19=23, 
		T__18=24, T__17=25, T__16=26, T__15=27, T__14=28, T__13=29, T__12=30, 
		T__11=31, T__10=32, T__9=33, T__8=34, T__7=35, T__6=36, T__5=37, T__4=38, 
		T__3=39, T__2=40, T__1=41, T__0=42, STRING=43, CONSTANT=44, VARIABLE=45, 
		STRING_NUM=46, NUMBER=47, WS=48;
	public static final String[] tokenNames = {
		"<INVALID>", "'THEN'", "'role('", "'avg('", "'succeeded('", "'count('", 
		"','", "'time_interval('", "'<'", "'lub('", "'<='", "'user('", "'workflow'", 
		"'cannot_do_r('", "'mint('", "'must_execute_u('", "'IF'", "'executed_u('", 
		"'timestamp ('", "'cannot_do_u('", "'glb('", "'SET'", "'related('", "'>('", 
		"'AND'", "')'", "'partner_of('", "'sum('", "'='", "';'", "'kp'", "'max('", 
		"'must_execute_r('", "'aborted('", "'critical_task_pair('", "'>'", "'executed_r('", 
		"'??'", "'same_group('", "'belong('", "'>='", "'assigned('", "'collaborator('", 
		"STRING", "CONSTANT", "VARIABLE", "STRING_NUM", "NUMBER", "WS"
	};
	public static final int
		RULE_file = 0, RULE_statement = 1, RULE_explicit = 2, RULE_assignment = 3, 
		RULE_assignmentBody = 4, RULE_assignmentHead = 5, RULE_staticdynamic = 6, 
		RULE_staticdynamicBody = 7, RULE_staticdynamicHead = 8, RULE_derivation = 9, 
		RULE_derivationBody = 10, RULE_derivationHead = 11, RULE_extern = 12, 
		RULE_specification = 13, RULE_enforcement = 14, RULE_status = 15, RULE_conditional = 16, 
		RULE_comparison = 17, RULE_user = 18, RULE_role = 19, RULE_task = 20, 
		RULE_nt = 21, RULE_ut = 22, RULE_rt = 23, RULE_ct = 24, RULE_tt = 25, 
		RULE_ti = 26, RULE_wt = 27, RULE_taut = 28;
	public static final String[] ruleNames = {
		"file", "statement", "explicit", "assignment", "assignmentBody", "assignmentHead", 
		"staticdynamic", "staticdynamicBody", "staticdynamicHead", "derivation", 
		"derivationBody", "derivationHead", "extern", "specification", "enforcement", 
		"status", "conditional", "comparison", "user", "role", "task", "nt", "ut", 
		"rt", "ct", "tt", "ti", "wt", "taut"
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26 || _la==T__21) {
				{
				{
				setState(58); statement();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64); match(EOF);
			}
		}
		catch (RecognitionException re) {
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
			setState(70);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66); explicit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67); assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68); staticdynamic();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69); derivation();
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
			setState(72); match(T__21);
			setState(75);
			switch (_input.LA(1)) {
			case T__20:
			case T__16:
			case T__4:
				{
				setState(73); extern();
				}
				break;
			case T__40:
			case T__33:
			case T__31:
			case T__22:
			case T__19:
			case T__8:
			case T__3:
				{
				setState(74); specification();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(77); match(T__13);
			}
		}
		catch (RecognitionException re) {
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
			setState(79); match(T__26);
			setState(80); assignmentBody();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(81); match(T__18);
				setState(82); assignmentBody();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88); match(T__41);
			setState(89); assignmentHead();
			setState(90); match(T__13);
			}
		}
		catch (RecognitionException re) {
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
			setState(97);
			switch (_input.LA(1)) {
			case T__40:
			case T__33:
			case T__31:
			case T__22:
			case T__19:
			case T__8:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); specification();
				}
				break;
			case T__38:
			case T__25:
			case T__9:
			case T__6:
			case T__1:
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); status();
				}
				break;
			case T__30:
			case T__12:
			case T__5:
			case CONSTANT:
			case VARIABLE:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(94); comparison();
				}
				break;
			case T__39:
			case T__37:
			case T__35:
			case T__28:
			case T__24:
			case T__15:
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(95); conditional();
				}
				break;
			case T__20:
			case T__16:
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(96); extern();
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
			setState(99); enforcement();
			}
		}
		catch (RecognitionException re) {
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
			setState(101); match(T__26);
			setState(102); staticdynamicBody();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(103); match(T__18);
				setState(104); staticdynamicBody();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110); match(T__41);
			setState(111); staticdynamicHead();
			setState(112); match(T__13);
			}
		}
		catch (RecognitionException re) {
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
			setState(117);
			switch (_input.LA(1)) {
			case T__40:
			case T__33:
			case T__31:
			case T__22:
			case T__19:
			case T__8:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); specification();
				}
				break;
			case T__30:
			case T__12:
			case T__5:
			case CONSTANT:
			case VARIABLE:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); comparison();
				}
				break;
			case T__39:
			case T__37:
			case T__35:
			case T__28:
			case T__24:
			case T__15:
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(116); conditional();
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
			setState(121);
			switch (_input.LA(1)) {
			case T__29:
			case T__27:
			case T__23:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(119); enforcement();
				}
				break;
			case T__40:
			case T__33:
			case T__31:
			case T__22:
			case T__19:
			case T__8:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(120); specification();
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
			setState(123); match(T__26);
			setState(124); derivationBody();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(125); match(T__18);
				setState(126); derivationBody();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132); match(T__41);
			setState(133); derivationHead();
			setState(134); match(T__13);
			}
		}
		catch (RecognitionException re) {
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
			setState(138);
			switch (_input.LA(1)) {
			case T__40:
			case T__33:
			case T__31:
			case T__22:
			case T__19:
			case T__8:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(136); specification();
				}
				break;
			case T__38:
			case T__25:
			case T__9:
			case T__6:
			case T__1:
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(137); status();
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
			setState(142);
			switch (_input.LA(1)) {
			case T__29:
			case T__27:
			case T__23:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(140); enforcement();
				}
				break;
			case T__40:
			case T__33:
			case T__31:
			case T__22:
			case T__19:
			case T__8:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(141); specification();
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
			setState(162);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(144); match(T__20);
				setState(145); user();
				setState(146); match(T__36);
				setState(147); user();
				setState(148); match(T__17);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(150); match(T__16);
				setState(151); user();
				setState(152); match(T__36);
				setState(153); user();
				setState(154); match(T__17);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(156); match(T__4);
				setState(157); user();
				setState(158); match(T__36);
				setState(159); user();
				setState(160); match(T__17);
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
			setState(206);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(164); match(T__40);
				setState(165); role();
				setState(166); match(T__36);
				setState(167); task();
				setState(168); match(T__17);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(170); match(T__31);
				setState(171); user();
				setState(172); match(T__36);
				setState(173); task();
				setState(174); match(T__17);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176); match(T__3);
				setState(177); user();
				setState(178); match(T__36);
				setState(179); role();
				setState(180); match(T__17);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(182); match(T__22);
				setState(183); role();
				setState(184); match(T__36);
				setState(185); task();
				setState(186); match(T__17);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 5);
				{
				setState(188); match(T__33);
				setState(189); role();
				setState(190); match(T__36);
				setState(191); task();
				setState(192); match(T__17);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 6);
				{
				setState(194); match(T__19);
				setState(195); role();
				setState(196); match(T__36);
				setState(197); role();
				setState(198); match(T__17);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(200); match(T__8);
				setState(201); task();
				setState(202); match(T__36);
				setState(203); task();
				setState(204); match(T__17);
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
			setState(232);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(208); match(T__23);
				setState(209); user();
				setState(210); match(T__36);
				setState(211); task();
				setState(212); match(T__17);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(214); match(T__29);
				setState(215); role();
				setState(216); match(T__36);
				setState(217); task();
				setState(218); match(T__17);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(220); match(T__27);
				setState(221); user();
				setState(222); match(T__36);
				setState(223); task();
				setState(224); match(T__17);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(226); match(T__10);
				setState(227); role();
				setState(228); match(T__36);
				setState(229); task();
				setState(230); match(T__17);
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
			setState(266);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(234); match(T__25);
				setState(235); user();
				setState(236); match(T__36);
				setState(237); task();
				setState(238); match(T__17);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(240); match(T__6);
				setState(241); role();
				setState(242); match(T__36);
				setState(243); task();
				setState(244); match(T__17);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(246); match(T__1);
				setState(247); user();
				setState(248); match(T__36);
				setState(249); task();
				setState(250); match(T__17);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(252); match(T__9);
				setState(253); task();
				setState(254); match(T__17);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 5);
				{
				setState(256); match(T__38);
				setState(257); task();
				setState(258); match(T__17);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(260); match(T__0);
				setState(261); user();
				setState(262); match(T__36);
				setState(263); user();
				setState(264); match(T__17);
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
		public SpecificationContext specification() {
			return getRuleContext(SpecificationContext.class,0);
		}
		public StatusContext status() {
			return getRuleContext(StatusContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public NtContext nt() {
			return getRuleContext(NtContext.class,0);
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
			setState(340);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268); match(T__37);
				setState(272);
				switch (_input.LA(1)) {
				case T__40:
				case T__33:
				case T__31:
				case T__22:
				case T__19:
				case T__8:
				case T__3:
					{
					setState(269); specification();
					}
					break;
				case T__38:
				case T__25:
				case T__9:
				case T__6:
				case T__1:
				case T__0:
					{
					setState(270); status();
					}
					break;
				case T__30:
				case T__12:
				case T__5:
				case CONSTANT:
				case VARIABLE:
				case NUMBER:
					{
					setState(271); comparison();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(274); match(T__36);
				setState(275); nt();
				setState(276); match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278); match(T__37);
				setState(279); user();
				setState(280); match(T__36);
				setState(284);
				switch (_input.LA(1)) {
				case T__40:
				case T__33:
				case T__31:
				case T__22:
				case T__19:
				case T__8:
				case T__3:
					{
					setState(281); specification();
					}
					break;
				case T__38:
				case T__25:
				case T__9:
				case T__6:
				case T__1:
				case T__0:
					{
					setState(282); status();
					}
					break;
				case T__30:
				case T__12:
				case T__5:
				case CONSTANT:
				case VARIABLE:
				case NUMBER:
					{
					setState(283); comparison();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(286); match(T__36);
				setState(287); nt();
				setState(288); match(T__17);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290); match(T__39);
				setState(291); user();
				setState(292); match(T__36);
				setState(296);
				switch (_input.LA(1)) {
				case T__40:
				case T__33:
				case T__31:
				case T__22:
				case T__19:
				case T__8:
				case T__3:
					{
					setState(293); specification();
					}
					break;
				case T__38:
				case T__25:
				case T__9:
				case T__6:
				case T__1:
				case T__0:
					{
					setState(294); status();
					}
					break;
				case T__30:
				case T__12:
				case T__5:
				case CONSTANT:
				case VARIABLE:
				case NUMBER:
					{
					setState(295); comparison();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(298); match(T__36);
				setState(299); nt();
				setState(300); match(T__17);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302); match(T__28);
				setState(303); user();
				setState(304); match(T__36);
				setState(308);
				switch (_input.LA(1)) {
				case T__40:
				case T__33:
				case T__31:
				case T__22:
				case T__19:
				case T__8:
				case T__3:
					{
					setState(305); specification();
					}
					break;
				case T__38:
				case T__25:
				case T__9:
				case T__6:
				case T__1:
				case T__0:
					{
					setState(306); status();
					}
					break;
				case T__30:
				case T__12:
				case T__5:
				case CONSTANT:
				case VARIABLE:
				case NUMBER:
					{
					setState(307); comparison();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(310); match(T__36);
				setState(311); nt();
				setState(312); match(T__17);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(314); match(T__11);
				setState(315); user();
				setState(316); match(T__36);
				setState(320);
				switch (_input.LA(1)) {
				case T__40:
				case T__33:
				case T__31:
				case T__22:
				case T__19:
				case T__8:
				case T__3:
					{
					setState(317); specification();
					}
					break;
				case T__38:
				case T__25:
				case T__9:
				case T__6:
				case T__1:
				case T__0:
					{
					setState(318); status();
					}
					break;
				case T__30:
				case T__12:
				case T__5:
				case CONSTANT:
				case VARIABLE:
				case NUMBER:
					{
					setState(319); comparison();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(322); match(T__36);
				setState(323); nt();
				setState(324); match(T__17);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(326); match(T__15);
				setState(327); user();
				setState(328); match(T__36);
				setState(332);
				switch (_input.LA(1)) {
				case T__40:
				case T__33:
				case T__31:
				case T__22:
				case T__19:
				case T__8:
				case T__3:
					{
					setState(329); specification();
					}
					break;
				case T__38:
				case T__25:
				case T__9:
				case T__6:
				case T__1:
				case T__0:
					{
					setState(330); status();
					}
					break;
				case T__30:
				case T__12:
				case T__5:
				case CONSTANT:
				case VARIABLE:
				case NUMBER:
					{
					setState(331); comparison();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(334); match(T__36);
				setState(335); nt();
				setState(336); match(T__17);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(338); match(T__24);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(339); match(T__35);
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
			setState(370);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(342); ut();
					}
					break;
				case 2:
					{
					setState(343); rt();
					}
					break;
				case 3:
					{
					setState(344); ct();
					}
					break;
				case 4:
					{
					setState(345); tt();
					}
					break;
				case 5:
					{
					setState(346); ti();
					}
					break;
				case 6:
					{
					setState(347); wt();
					}
					break;
				case 7:
					{
					setState(348); nt();
					}
					break;
				}
				setState(351); match(T__14);
				setState(359);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(352); ut();
					}
					break;
				case 2:
					{
					setState(353); rt();
					}
					break;
				case 3:
					{
					setState(354); ct();
					}
					break;
				case 4:
					{
					setState(355); tt();
					}
					break;
				case 5:
					{
					setState(356); ti();
					}
					break;
				case 6:
					{
					setState(357); wt();
					}
					break;
				case 7:
					{
					setState(358); nt();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(361); taut();
					}
					break;
				case NUMBER:
					{
					setState(362); nt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(365);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__32) | (1L << T__7) | (1L << T__2))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(368);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(366); taut();
					}
					break;
				case NUMBER:
					{
					setState(367); nt();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		enterRule(_localctx, 36, RULE_user);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
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
		enterRule(_localctx, 38, RULE_role);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
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
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public TerminalNode CONSTANT() { return getToken(Inter_InstanceParser.CONSTANT, 0); }
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
		enterRule(_localctx, 40, RULE_task);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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
		enterRule(_localctx, 42, RULE_nt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378); match(NUMBER);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 44, RULE_ut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380); user();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 46, RULE_rt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382); role();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 48, RULE_ct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); match(T__5);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 50, RULE_tt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386); task();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 52, RULE_ti);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388); task();
			}
		}
		catch (RecognitionException re) {
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
			setState(390); match(T__30);
			}
		}
		catch (RecognitionException re) {
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
			enterOuterAlt(_localctx, 1);
			{
			setState(392); match(T__12);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u018d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3I\n\3\3\4\3\4\3\4\5\4N\n\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\7\5V\n\5\f\5\16\5Y\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\5\6d\n\6\3\7\3\7\3\b\3\b\3\b\3\b\7\bl\n\b\f\b\16\bo\13\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\5\tx\n\t\3\n\3\n\5\n|\n\n\3\13\3\13\3\13\3\13\7"+
		"\13\u0082\n\13\f\13\16\13\u0085\13\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f"+
		"\u008d\n\f\3\r\3\r\5\r\u0091\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a5\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00d1\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00eb\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u010d\n\21\3\22\3\22\3\22\3\22\5\22"+
		"\u0113\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u011f"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u012b\n\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0137\n\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0143\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u014f\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0157\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0160\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u016a\n\23\3"+
		"\23\3\23\5\23\u016e\n\23\3\23\3\23\3\23\5\23\u0173\n\23\5\23\u0175\n\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\4\6\2\n\n\f\f%%**\3\2."+
		"/\u01b2\2?\3\2\2\2\4H\3\2\2\2\6J\3\2\2\2\bQ\3\2\2\2\nc\3\2\2\2\fe\3\2"+
		"\2\2\16g\3\2\2\2\20w\3\2\2\2\22{\3\2\2\2\24}\3\2\2\2\26\u008c\3\2\2\2"+
		"\30\u0090\3\2\2\2\32\u00a4\3\2\2\2\34\u00d0\3\2\2\2\36\u00ea\3\2\2\2 "+
		"\u010c\3\2\2\2\"\u0156\3\2\2\2$\u0174\3\2\2\2&\u0176\3\2\2\2(\u0178\3"+
		"\2\2\2*\u017a\3\2\2\2,\u017c\3\2\2\2.\u017e\3\2\2\2\60\u0180\3\2\2\2\62"+
		"\u0182\3\2\2\2\64\u0184\3\2\2\2\66\u0186\3\2\2\28\u0188\3\2\2\2:\u018a"+
		"\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A"+
		"?\3\2\2\2BC\7\2\2\3C\3\3\2\2\2DI\5\6\4\2EI\5\b\5\2FI\5\16\b\2GI\5\24\13"+
		"\2HD\3\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\5\3\2\2\2JM\7\27\2\2KN\5\32"+
		"\16\2LN\5\34\17\2MK\3\2\2\2ML\3\2\2\2NO\3\2\2\2OP\7\37\2\2P\7\3\2\2\2"+
		"QR\7\22\2\2RW\5\n\6\2ST\7\32\2\2TV\5\n\6\2US\3\2\2\2VY\3\2\2\2WU\3\2\2"+
		"\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\3\2\2[\\\5\f\7\2\\]\7\37\2\2]\t\3"+
		"\2\2\2^d\5\34\17\2_d\5 \21\2`d\5$\23\2ad\5\"\22\2bd\5\32\16\2c^\3\2\2"+
		"\2c_\3\2\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\13\3\2\2\2ef\5\36\20\2f\r"+
		"\3\2\2\2gh\7\22\2\2hm\5\20\t\2ij\7\32\2\2jl\5\20\t\2ki\3\2\2\2lo\3\2\2"+
		"\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\3\2\2qr\5\22\n\2rs\7\37"+
		"\2\2s\17\3\2\2\2tx\5\34\17\2ux\5$\23\2vx\5\"\22\2wt\3\2\2\2wu\3\2\2\2"+
		"wv\3\2\2\2x\21\3\2\2\2y|\5\36\20\2z|\5\34\17\2{y\3\2\2\2{z\3\2\2\2|\23"+
		"\3\2\2\2}~\7\22\2\2~\u0083\5\26\f\2\177\u0080\7\32\2\2\u0080\u0082\5\26"+
		"\f\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\3\2\2\u0087"+
		"\u0088\5\30\r\2\u0088\u0089\7\37\2\2\u0089\25\3\2\2\2\u008a\u008d\5\34"+
		"\17\2\u008b\u008d\5 \21\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\27\3\2\2\2\u008e\u0091\5\36\20\2\u008f\u0091\5\34\17\2\u0090\u008e\3"+
		"\2\2\2\u0090\u008f\3\2\2\2\u0091\31\3\2\2\2\u0092\u0093\7\30\2\2\u0093"+
		"\u0094\5&\24\2\u0094\u0095\7\b\2\2\u0095\u0096\5&\24\2\u0096\u0097\7\33"+
		"\2\2\u0097\u00a5\3\2\2\2\u0098\u0099\7\34\2\2\u0099\u009a\5&\24\2\u009a"+
		"\u009b\7\b\2\2\u009b\u009c\5&\24\2\u009c\u009d\7\33\2\2\u009d\u00a5\3"+
		"\2\2\2\u009e\u009f\7(\2\2\u009f\u00a0\5&\24\2\u00a0\u00a1\7\b\2\2\u00a1"+
		"\u00a2\5&\24\2\u00a2\u00a3\7\33\2\2\u00a3\u00a5\3\2\2\2\u00a4\u0092\3"+
		"\2\2\2\u00a4\u0098\3\2\2\2\u00a4\u009e\3\2\2\2\u00a5\33\3\2\2\2\u00a6"+
		"\u00a7\7\4\2\2\u00a7\u00a8\5(\25\2\u00a8\u00a9\7\b\2\2\u00a9\u00aa\5*"+
		"\26\2\u00aa\u00ab\7\33\2\2\u00ab\u00d1\3\2\2\2\u00ac\u00ad\7\r\2\2\u00ad"+
		"\u00ae\5&\24\2\u00ae\u00af\7\b\2\2\u00af\u00b0\5*\26\2\u00b0\u00b1\7\33"+
		"\2\2\u00b1\u00d1\3\2\2\2\u00b2\u00b3\7)\2\2\u00b3\u00b4\5&\24\2\u00b4"+
		"\u00b5\7\b\2\2\u00b5\u00b6\5(\25\2\u00b6\u00b7\7\33\2\2\u00b7\u00d1\3"+
		"\2\2\2\u00b8\u00b9\7\26\2\2\u00b9\u00ba\5(\25\2\u00ba\u00bb\7\b\2\2\u00bb"+
		"\u00bc\5*\26\2\u00bc\u00bd\7\33\2\2\u00bd\u00d1\3\2\2\2\u00be\u00bf\7"+
		"\13\2\2\u00bf\u00c0\5(\25\2\u00c0\u00c1\7\b\2\2\u00c1\u00c2\5*\26\2\u00c2"+
		"\u00c3\7\33\2\2\u00c3\u00d1\3\2\2\2\u00c4\u00c5\7\31\2\2\u00c5\u00c6\5"+
		"(\25\2\u00c6\u00c7\7\b\2\2\u00c7\u00c8\5(\25\2\u00c8\u00c9\7\33\2\2\u00c9"+
		"\u00d1\3\2\2\2\u00ca\u00cb\7$\2\2\u00cb\u00cc\5*\26\2\u00cc\u00cd\7\b"+
		"\2\2\u00cd\u00ce\5*\26\2\u00ce\u00cf\7\33\2\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00a6\3\2\2\2\u00d0\u00ac\3\2\2\2\u00d0\u00b2\3\2\2\2\u00d0\u00b8\3\2"+
		"\2\2\u00d0\u00be\3\2\2\2\u00d0\u00c4\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d1"+
		"\35\3\2\2\2\u00d2\u00d3\7\25\2\2\u00d3\u00d4\5&\24\2\u00d4\u00d5\7\b\2"+
		"\2\u00d5\u00d6\5*\26\2\u00d6\u00d7\7\33\2\2\u00d7\u00eb\3\2\2\2\u00d8"+
		"\u00d9\7\17\2\2\u00d9\u00da\5(\25\2\u00da\u00db\7\b\2\2\u00db\u00dc\5"+
		"*\26\2\u00dc\u00dd\7\33\2\2\u00dd\u00eb\3\2\2\2\u00de\u00df\7\21\2\2\u00df"+
		"\u00e0\5&\24\2\u00e0\u00e1\7\b\2\2\u00e1\u00e2\5*\26\2\u00e2\u00e3\7\33"+
		"\2\2\u00e3\u00eb\3\2\2\2\u00e4\u00e5\7\"\2\2\u00e5\u00e6\5(\25\2\u00e6"+
		"\u00e7\7\b\2\2\u00e7\u00e8\5*\26\2\u00e8\u00e9\7\33\2\2\u00e9\u00eb\3"+
		"\2\2\2\u00ea\u00d2\3\2\2\2\u00ea\u00d8\3\2\2\2\u00ea\u00de\3\2\2\2\u00ea"+
		"\u00e4\3\2\2\2\u00eb\37\3\2\2\2\u00ec\u00ed\7\23\2\2\u00ed\u00ee\5&\24"+
		"\2\u00ee\u00ef\7\b\2\2\u00ef\u00f0\5*\26\2\u00f0\u00f1\7\33\2\2\u00f1"+
		"\u010d\3\2\2\2\u00f2\u00f3\7&\2\2\u00f3\u00f4\5(\25\2\u00f4\u00f5\7\b"+
		"\2\2\u00f5\u00f6\5*\26\2\u00f6\u00f7\7\33\2\2\u00f7\u010d\3\2\2\2\u00f8"+
		"\u00f9\7+\2\2\u00f9\u00fa\5&\24\2\u00fa\u00fb\7\b\2\2\u00fb\u00fc\5*\26"+
		"\2\u00fc\u00fd\7\33\2\2\u00fd\u010d\3\2\2\2\u00fe\u00ff\7#\2\2\u00ff\u0100"+
		"\5*\26\2\u0100\u0101\7\33\2\2\u0101\u010d\3\2\2\2\u0102\u0103\7\6\2\2"+
		"\u0103\u0104\5*\26\2\u0104\u0105\7\33\2\2\u0105\u010d\3\2\2\2\u0106\u0107"+
		"\7,\2\2\u0107\u0108\5&\24\2\u0108\u0109\7\b\2\2\u0109\u010a\5&\24\2\u010a"+
		"\u010b\7\33\2\2\u010b\u010d\3\2\2\2\u010c\u00ec\3\2\2\2\u010c\u00f2\3"+
		"\2\2\2\u010c\u00f8\3\2\2\2\u010c\u00fe\3\2\2\2\u010c\u0102\3\2\2\2\u010c"+
		"\u0106\3\2\2\2\u010d!\3\2\2\2\u010e\u0112\7\7\2\2\u010f\u0113\5\34\17"+
		"\2\u0110\u0113\5 \21\2\u0111\u0113\5$\23\2\u0112\u010f\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7\b\2\2\u0115"+
		"\u0116\5,\27\2\u0116\u0117\7\33\2\2\u0117\u0157\3\2\2\2\u0118\u0119\7"+
		"\7\2\2\u0119\u011a\5&\24\2\u011a\u011e\7\b\2\2\u011b\u011f\5\34\17\2\u011c"+
		"\u011f\5 \21\2\u011d\u011f\5$\23\2\u011e\u011b\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7\b\2\2\u0121"+
		"\u0122\5,\27\2\u0122\u0123\7\33\2\2\u0123\u0157\3\2\2\2\u0124\u0125\7"+
		"\5\2\2\u0125\u0126\5&\24\2\u0126\u012a\7\b\2\2\u0127\u012b\5\34\17\2\u0128"+
		"\u012b\5 \21\2\u0129\u012b\5$\23\2\u012a\u0127\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7\b\2\2\u012d"+
		"\u012e\5,\27\2\u012e\u012f\7\33\2\2\u012f\u0157\3\2\2\2\u0130\u0131\7"+
		"\20\2\2\u0131\u0132\5&\24\2\u0132\u0136\7\b\2\2\u0133\u0137\5\34\17\2"+
		"\u0134\u0137\5 \21\2\u0135\u0137\5$\23\2\u0136\u0133\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7\b\2\2\u0139"+
		"\u013a\5,\27\2\u013a\u013b\7\33\2\2\u013b\u0157\3\2\2\2\u013c\u013d\7"+
		"!\2\2\u013d\u013e\5&\24\2\u013e\u0142\7\b\2\2\u013f\u0143\5\34\17\2\u0140"+
		"\u0143\5 \21\2\u0141\u0143\5$\23\2\u0142\u013f\3\2\2\2\u0142\u0140\3\2"+
		"\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7\b\2\2\u0145"+
		"\u0146\5,\27\2\u0146\u0147\7\33\2\2\u0147\u0157\3\2\2\2\u0148\u0149\7"+
		"\35\2\2\u0149\u014a\5&\24\2\u014a\u014e\7\b\2\2\u014b\u014f\5\34\17\2"+
		"\u014c\u014f\5 \21\2\u014d\u014f\5$\23\2\u014e\u014b\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\7\b\2\2\u0151"+
		"\u0152\5,\27\2\u0152\u0153\7\33\2\2\u0153\u0157\3\2\2\2\u0154\u0157\7"+
		"\24\2\2\u0155\u0157\7\t\2\2\u0156\u010e\3\2\2\2\u0156\u0118\3\2\2\2\u0156"+
		"\u0124\3\2\2\2\u0156\u0130\3\2\2\2\u0156\u013c\3\2\2\2\u0156\u0148\3\2"+
		"\2\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157#\3\2\2\2\u0158\u0160"+
		"\5.\30\2\u0159\u0160\5\60\31\2\u015a\u0160\5\62\32\2\u015b\u0160\5\64"+
		"\33\2\u015c\u0160\5\66\34\2\u015d\u0160\58\35\2\u015e\u0160\5,\27\2\u015f"+
		"\u0158\3\2\2\2\u015f\u0159\3\2\2\2\u015f\u015a\3\2\2\2\u015f\u015b\3\2"+
		"\2\2\u015f\u015c\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0169\7\36\2\2\u0162\u016a\5.\30\2\u0163\u016a\5"+
		"\60\31\2\u0164\u016a\5\62\32\2\u0165\u016a\5\64\33\2\u0166\u016a\5\66"+
		"\34\2\u0167\u016a\58\35\2\u0168\u016a\5,\27\2\u0169\u0162\3\2\2\2\u0169"+
		"\u0163\3\2\2\2\u0169\u0164\3\2\2\2\u0169\u0165\3\2\2\2\u0169\u0166\3\2"+
		"\2\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a\u0175\3\2\2\2\u016b"+
		"\u016e\5:\36\2\u016c\u016e\5,\27\2\u016d\u016b\3\2\2\2\u016d\u016c\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\u0172\t\2\2\2\u0170\u0173\5:\36\2\u0171"+
		"\u0173\5,\27\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173\u0175\3\2"+
		"\2\2\u0174\u015f\3\2\2\2\u0174\u016d\3\2\2\2\u0175%\3\2\2\2\u0176\u0177"+
		"\t\3\2\2\u0177\'\3\2\2\2\u0178\u0179\t\3\2\2\u0179)\3\2\2\2\u017a\u017b"+
		"\t\3\2\2\u017b+\3\2\2\2\u017c\u017d\7\61\2\2\u017d-\3\2\2\2\u017e\u017f"+
		"\5&\24\2\u017f/\3\2\2\2\u0180\u0181\5(\25\2\u0181\61\3\2\2\2\u0182\u0183"+
		"\7\'\2\2\u0183\63\3\2\2\2\u0184\u0185\5*\26\2\u0185\65\3\2\2\2\u0186\u0187"+
		"\5*\26\2\u0187\67\3\2\2\2\u0188\u0189\7\16\2\2\u01899\3\2\2\2\u018a\u018b"+
		"\7 \2\2\u018b;\3\2\2\2\35?HMWcmw{\u0083\u008c\u0090\u00a4\u00d0\u00ea"+
		"\u010c\u0112\u011e\u012a\u0136\u0142\u014e\u0156\u015f\u0169\u016d\u0172"+
		"\u0174";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}