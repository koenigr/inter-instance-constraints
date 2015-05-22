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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, STRING=52, 
		CONSTANT=53, VARIABLE=54, STRING_NUM=55, NUMBER=56, COMMENTS=57, WS=58;
	public static final int
		RULE_file = 0, RULE_statement = 1, RULE_explicit = 2, RULE_assignment = 3, 
		RULE_assignmentBody = 4, RULE_assignmentHead = 5, RULE_staticdynamic = 6, 
		RULE_staticdynamicBody = 7, RULE_staticdynamicHead = 8, RULE_derivation = 9, 
		RULE_derivationBody = 10, RULE_derivationHead = 11, RULE_extern = 12, 
		RULE_specification = 13, RULE_enforcement = 14, RULE_status = 15, RULE_conditional = 16, 
		RULE_comparison = 17, RULE_arithmetic = 18, RULE_user = 19, RULE_role = 20, 
		RULE_task = 21, RULE_intra = 22, RULE_inter = 23, RULE_interp = 24, RULE_nt = 25, 
		RULE_ut = 26, RULE_rt = 27, RULE_ct = 28, RULE_tt = 29, RULE_ti = 30, 
		RULE_wt = 31, RULE_taut = 32, RULE_input = 33, RULE_inputvar = 34, RULE_output = 35, 
		RULE_outputvar = 36;
	public static final String[] ruleNames = {
		"file", "statement", "explicit", "assignment", "assignmentBody", "assignmentHead", 
		"staticdynamic", "staticdynamicBody", "staticdynamicHead", "derivation", 
		"derivationBody", "derivationHead", "extern", "specification", "enforcement", 
		"status", "conditional", "comparison", "arithmetic", "user", "role", "task", 
		"intra", "inter", "interp", "nt", "ut", "rt", "ct", "tt", "ti", "wt", 
		"taut", "input", "inputvar", "output", "outputvar"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SET'", "'IF'", "'AND'", "'THEN'", "'related('", "','", "')'", 
		"'partner_of('", "'same_group('", "'role('", "'user('", "'belong('", "'glb('", 
		"'lub('", "'>('", "'critical_task_pair('", "'cannot_do_u('", "'cannot_do_r('", 
		"'must_execute_u('", "'must_execute_r('", "'panic'", "'executed_u('", 
		"'executed_r('", "'assigned('", "'aborted('", "'succeeded('", "'collaborator('", 
		"'count('", "'avg('", "'min('", "'max('", "'sum('", "'('", "'='", "'!='", 
		"'<'", "'<='", "'>'", "'>='", "'*'", "'/'", "'+'", "'-'", "'.'", "'timestamp('", 
		"'time_interval('", "'??'", "'workflow'", "'Input('", "').'", "'Output('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "STRING", "CONSTANT", "VARIABLE", "STRING_NUM", 
		"NUMBER", "COMMENTS", "WS"
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
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
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

	public static class StatementContext extends ParserRuleContext {
		public ExplicitContext explicit() {
			return getRuleContext(ExplicitContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StaticdynamicContext staticdynamic() {
			return getRuleContext(StaticdynamicContext.class,0);
		}
		public DerivationContext derivation() {
			return getRuleContext(DerivationContext.class,0);
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
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				explicit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				staticdynamic();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				derivation();
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
		public ExternContext extern() {
			return getRuleContext(ExternContext.class,0);
		}
		public SpecificationContext specification() {
			return getRuleContext(SpecificationContext.class,0);
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
			setState(88);
			match(T__0);
			setState(91);
			switch (_input.LA(1)) {
			case T__4:
			case T__7:
			case T__8:
				{
				setState(89);
				extern();
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				{
				setState(90);
				specification();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public List<AssignmentBodyContext> assignmentBody() {
			return getRuleContexts(AssignmentBodyContext.class);
		}
		public AssignmentBodyContext assignmentBody(int i) {
			return getRuleContext(AssignmentBodyContext.class,i);
		}
		public AssignmentHeadContext assignmentHead() {
			return getRuleContext(AssignmentHeadContext.class,0);
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
			setState(93);
			match(T__1);
			setState(94);
			assignmentBody();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(95);
				match(T__2);
				setState(96);
				assignmentBody();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(T__3);
			setState(103);
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
			setState(110);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				specification();
				}
				break;
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				status();
				}
				break;
			case T__32:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case CONSTANT:
			case VARIABLE:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				comparison();
				}
				break;
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				conditional();
				}
				break;
			case T__4:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				extern();
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
			setState(112);
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

	public static class StaticdynamicContext extends ParserRuleContext {
		public List<StaticdynamicBodyContext> staticdynamicBody() {
			return getRuleContexts(StaticdynamicBodyContext.class);
		}
		public StaticdynamicBodyContext staticdynamicBody(int i) {
			return getRuleContext(StaticdynamicBodyContext.class,i);
		}
		public StaticdynamicHeadContext staticdynamicHead() {
			return getRuleContext(StaticdynamicHeadContext.class,0);
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
			setState(114);
			match(T__1);
			setState(115);
			staticdynamicBody();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(116);
				match(T__2);
				setState(117);
				staticdynamicBody();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(T__3);
			setState(124);
			staticdynamicHead();
			}
		}
		catch (RecognitionException re) {
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
			setState(129);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				specification();
				}
				break;
			case T__32:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case CONSTANT:
			case VARIABLE:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				comparison();
				}
				break;
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				conditional();
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
		public EnforcementContext enforcement() {
			return getRuleContext(EnforcementContext.class,0);
		}
		public SpecificationContext specification() {
			return getRuleContext(SpecificationContext.class,0);
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
			setState(133);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				enforcement();
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				specification();
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
		public List<DerivationBodyContext> derivationBody() {
			return getRuleContexts(DerivationBodyContext.class);
		}
		public DerivationBodyContext derivationBody(int i) {
			return getRuleContext(DerivationBodyContext.class,i);
		}
		public DerivationHeadContext derivationHead() {
			return getRuleContext(DerivationHeadContext.class,0);
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
			setState(135);
			match(T__1);
			setState(136);
			derivationBody();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(137);
				match(T__2);
				setState(138);
				derivationBody();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(T__3);
			setState(145);
			derivationHead();
			}
		}
		catch (RecognitionException re) {
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
			setState(149);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				specification();
				}
				break;
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				status();
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
		public EnforcementContext enforcement() {
			return getRuleContext(EnforcementContext.class,0);
		}
		public SpecificationContext specification() {
			return getRuleContext(SpecificationContext.class,0);
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
			setState(153);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				enforcement();
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				specification();
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
			setState(173);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(T__4);
				setState(156);
				user();
				setState(157);
				match(T__5);
				setState(158);
				user();
				setState(159);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(T__7);
				setState(162);
				user();
				setState(163);
				match(T__5);
				setState(164);
				user();
				setState(165);
				match(T__6);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(T__8);
				setState(168);
				user();
				setState(169);
				match(T__5);
				setState(170);
				user();
				setState(171);
				match(T__6);
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
			setState(217);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(T__9);
				setState(176);
				role();
				setState(177);
				match(T__5);
				setState(178);
				task();
				setState(179);
				match(T__6);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(T__10);
				setState(182);
				user();
				setState(183);
				match(T__5);
				setState(184);
				task();
				setState(185);
				match(T__6);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(T__11);
				setState(188);
				user();
				setState(189);
				match(T__5);
				setState(190);
				role();
				setState(191);
				match(T__6);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				match(T__12);
				setState(194);
				role();
				setState(195);
				match(T__5);
				setState(196);
				task();
				setState(197);
				match(T__6);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				match(T__13);
				setState(200);
				role();
				setState(201);
				match(T__5);
				setState(202);
				task();
				setState(203);
				match(T__6);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				match(T__14);
				setState(206);
				role();
				setState(207);
				match(T__5);
				setState(208);
				role();
				setState(209);
				match(T__6);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(211);
				match(T__15);
				setState(212);
				task();
				setState(213);
				match(T__5);
				setState(214);
				task();
				setState(215);
				match(T__6);
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
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public TaskContext task() {
			return getRuleContext(TaskContext.class,0);
		}
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
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
			setState(244);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(T__16);
				setState(220);
				user();
				setState(221);
				match(T__5);
				setState(222);
				task();
				setState(223);
				match(T__6);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(T__17);
				setState(226);
				role();
				setState(227);
				match(T__5);
				setState(228);
				task();
				setState(229);
				match(T__6);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(T__18);
				setState(232);
				user();
				setState(233);
				match(T__5);
				setState(234);
				task();
				setState(235);
				match(T__6);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				match(T__19);
				setState(238);
				role();
				setState(239);
				match(T__5);
				setState(240);
				task();
				setState(241);
				match(T__6);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				match(T__20);
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
		public List<UserContext> user() {
			return getRuleContexts(UserContext.class);
		}
		public UserContext user(int i) {
			return getRuleContext(UserContext.class,i);
		}
		public TaskContext task() {
			return getRuleContext(TaskContext.class,0);
		}
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
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
			setState(278);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(T__21);
				setState(247);
				user();
				setState(248);
				match(T__5);
				setState(249);
				task();
				setState(250);
				match(T__6);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(T__22);
				setState(253);
				role();
				setState(254);
				match(T__5);
				setState(255);
				task();
				setState(256);
				match(T__6);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(T__23);
				setState(259);
				user();
				setState(260);
				match(T__5);
				setState(261);
				task();
				setState(262);
				match(T__6);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				match(T__24);
				setState(265);
				task();
				setState(266);
				match(T__6);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				match(T__25);
				setState(269);
				task();
				setState(270);
				match(T__6);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 6);
				{
				setState(272);
				match(T__26);
				setState(273);
				user();
				setState(274);
				match(T__5);
				setState(275);
				user();
				setState(276);
				match(T__6);
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
		public List<NtContext> nt() {
			return getRuleContexts(NtContext.class);
		}
		public NtContext nt(int i) {
			return getRuleContext(NtContext.class,i);
		}
		public SpecificationContext specification() {
			return getRuleContext(SpecificationContext.class,0);
		}
		public StatusContext status() {
			return getRuleContext(StatusContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
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
			setState(358);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(T__27);
				setState(284);
				switch (_input.LA(1)) {
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
					{
					setState(281);
					specification();
					}
					break;
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
					{
					setState(282);
					status();
					}
					break;
				case T__32:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case CONSTANT:
				case VARIABLE:
				case NUMBER:
					{
					setState(283);
					comparison();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(286);
				match(T__5);
				setState(287);
				nt();
				setState(288);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(T__27);
				{
				setState(291);
				nt();
				}
				setState(292);
				match(T__5);
				setState(296);
				switch (_input.LA(1)) {
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
					{
					setState(293);
					specification();
					}
					break;
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
					{
					setState(294);
					status();
					}
					break;
				case T__32:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case CONSTANT:
				case VARIABLE:
				case NUMBER:
					{
					setState(295);
					comparison();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(298);
				match(T__5);
				setState(299);
				nt();
				setState(300);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				match(T__28);
				{
				setState(303);
				nt();
				}
				setState(304);
				match(T__5);
				setState(310);
				switch (_input.LA(1)) {
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
					{
					setState(305);
					specification();
					}
					break;
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
					{
					setState(306);
					status();
					}
					break;
				case T__32:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case CONSTANT:
				case VARIABLE:
				case NUMBER:
					{
					setState(307);
					comparison();
					}
					break;
				case T__50:
					{
					setState(308);
					output();
					}
					break;
				case T__48:
					{
					setState(309);
					input();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(312);
				match(T__5);
				setState(313);
				nt();
				setState(314);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
				match(T__29);
				{
				setState(317);
				nt();
				}
				setState(318);
				match(T__5);
				setState(324);
				switch (_input.LA(1)) {
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
					{
					setState(319);
					specification();
					}
					break;
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
					{
					setState(320);
					status();
					}
					break;
				case T__32:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case CONSTANT:
				case VARIABLE:
				case NUMBER:
					{
					setState(321);
					comparison();
					}
					break;
				case T__50:
					{
					setState(322);
					output();
					}
					break;
				case T__48:
					{
					setState(323);
					input();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(326);
				match(T__5);
				setState(327);
				nt();
				setState(328);
				match(T__6);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(330);
				match(T__30);
				{
				setState(331);
				nt();
				}
				setState(332);
				match(T__5);
				setState(338);
				switch (_input.LA(1)) {
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
					{
					setState(333);
					specification();
					}
					break;
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
					{
					setState(334);
					status();
					}
					break;
				case T__32:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case CONSTANT:
				case VARIABLE:
				case NUMBER:
					{
					setState(335);
					comparison();
					}
					break;
				case T__50:
					{
					setState(336);
					output();
					}
					break;
				case T__48:
					{
					setState(337);
					input();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(340);
				match(T__5);
				setState(341);
				nt();
				setState(342);
				match(T__6);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(344);
				match(T__31);
				{
				setState(345);
				nt();
				}
				setState(346);
				match(T__5);
				setState(352);
				switch (_input.LA(1)) {
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
					{
					setState(347);
					specification();
					}
					break;
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
					{
					setState(348);
					status();
					}
					break;
				case T__32:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case CONSTANT:
				case VARIABLE:
				case NUMBER:
					{
					setState(349);
					comparison();
					}
					break;
				case T__50:
					{
					setState(350);
					output();
					}
					break;
				case T__48:
					{
					setState(351);
					input();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(354);
				match(T__5);
				setState(355);
				nt();
				setState(356);
				match(T__6);
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
		public List<UtContext> ut() {
			return getRuleContexts(UtContext.class);
		}
		public UtContext ut(int i) {
			return getRuleContext(UtContext.class,i);
		}
		public List<RtContext> rt() {
			return getRuleContexts(RtContext.class);
		}
		public RtContext rt(int i) {
			return getRuleContext(RtContext.class,i);
		}
		public List<CtContext> ct() {
			return getRuleContexts(CtContext.class);
		}
		public CtContext ct(int i) {
			return getRuleContext(CtContext.class,i);
		}
		public List<TtContext> tt() {
			return getRuleContexts(TtContext.class);
		}
		public TtContext tt(int i) {
			return getRuleContext(TtContext.class,i);
		}
		public List<TiContext> ti() {
			return getRuleContexts(TiContext.class);
		}
		public TiContext ti(int i) {
			return getRuleContext(TiContext.class,i);
		}
		public List<WtContext> wt() {
			return getRuleContexts(WtContext.class);
		}
		public WtContext wt(int i) {
			return getRuleContext(WtContext.class,i);
		}
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
		public List<TautContext> taut() {
			return getRuleContexts(TautContext.class);
		}
		public TautContext taut(int i) {
			return getRuleContext(TautContext.class,i);
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
			setState(404);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(360);
					ut();
					}
					break;
				case 2:
					{
					setState(361);
					rt();
					}
					break;
				case 3:
					{
					setState(362);
					ct();
					}
					break;
				case 4:
					{
					setState(363);
					tt();
					}
					break;
				case 5:
					{
					setState(364);
					ti();
					}
					break;
				case 6:
					{
					setState(365);
					wt();
					}
					break;
				case 7:
					{
					setState(366);
					nt();
					}
					break;
				case 8:
					{
					setState(367);
					match(T__32);
					setState(368);
					arithmetic();
					setState(369);
					match(T__6);
					}
					break;
				}
				setState(373);
				_la = _input.LA(1);
				if ( !(_la==T__33 || _la==T__34) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(385);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(374);
					ut();
					}
					break;
				case 2:
					{
					setState(375);
					rt();
					}
					break;
				case 3:
					{
					setState(376);
					ct();
					}
					break;
				case 4:
					{
					setState(377);
					tt();
					}
					break;
				case 5:
					{
					setState(378);
					ti();
					}
					break;
				case 6:
					{
					setState(379);
					wt();
					}
					break;
				case 7:
					{
					setState(380);
					nt();
					}
					break;
				case 8:
					{
					setState(381);
					match(T__32);
					setState(382);
					arithmetic();
					setState(383);
					match(T__6);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(387);
					taut();
					}
					break;
				case 2:
					{
					setState(388);
					nt();
					}
					break;
				case 3:
					{
					setState(389);
					match(T__32);
					setState(390);
					arithmetic();
					setState(391);
					match(T__6);
					}
					break;
				}
				setState(395);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(402);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(396);
					taut();
					}
					break;
				case 2:
					{
					setState(397);
					nt();
					}
					break;
				case 3:
					{
					setState(398);
					match(T__32);
					setState(399);
					arithmetic();
					setState(400);
					match(T__6);
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
		enterRule(_localctx, 36, RULE_arithmetic);
		int _la;
		try {
			setState(418);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case VARIABLE:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				nt();
				setState(407);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(408);
				nt();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(T__32);
				setState(411);
				arithmetic();
				setState(412);
				match(T__6);
				setState(413);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(414);
				match(T__32);
				setState(415);
				arithmetic();
				setState(416);
				match(T__6);
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
		public TerminalNode CONSTANT() { return getToken(Inter_InstanceParser.CONSTANT, 0); }
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
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
			setState(420);
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

	public static class RoleContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(Inter_InstanceParser.CONSTANT, 0); }
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
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
			setState(422);
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

	public static class TaskContext extends ParserRuleContext {
		public IntraContext intra() {
			return getRuleContext(IntraContext.class,0);
		}
		public InterContext inter() {
			return getRuleContext(InterContext.class,0);
		}
		public InterpContext interp() {
			return getRuleContext(InterpContext.class,0);
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
			setState(427);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				intra();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				inter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
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
			setState(429);
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
			setState(431);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(432);
			match(T__43);
			setState(433);
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
			setState(435);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(436);
			match(T__43);
			setState(437);
			_la = _input.LA(1);
			if ( !(_la==CONSTANT || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(438);
			match(T__43);
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

	public static class NtContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(Inter_InstanceParser.NUMBER, 0); }
		public TerminalNode VARIABLE() { return getToken(Inter_InstanceParser.VARIABLE, 0); }
		public List<TaskContext> task() {
			return getRuleContexts(TaskContext.class);
		}
		public TaskContext task(int i) {
			return getRuleContext(TaskContext.class,i);
		}
		public TautContext taut() {
			return getRuleContext(TautContext.class,0);
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
		enterRule(_localctx, 50, RULE_nt);
		try {
			setState(455);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				match(NUMBER);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(VARIABLE);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 3);
				{
				setState(443);
				match(T__44);
				setState(444);
				task();
				setState(445);
				match(T__5);
				setState(446);
				taut();
				setState(447);
				match(T__6);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 4);
				{
				setState(449);
				match(T__45);
				setState(450);
				task();
				setState(451);
				match(T__5);
				setState(452);
				task();
				setState(453);
				match(T__6);
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
			setState(457);
			user();
			}
		}
		catch (RecognitionException re) {
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
			setState(459);
			role();
			}
		}
		catch (RecognitionException re) {
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
			setState(461);
			match(T__46);
			}
		}
		catch (RecognitionException re) {
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
			setState(463);
			task();
			}
		}
		catch (RecognitionException re) {
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
			setState(465);
			task();
			}
		}
		catch (RecognitionException re) {
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
			setState(467);
			match(T__47);
			}
		}
		catch (RecognitionException re) {
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
			setState(469);
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

	public static class InputContext extends ParserRuleContext {
		public TaskContext task() {
			return getRuleContext(TaskContext.class,0);
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
		enterRule(_localctx, 66, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(T__48);
			setState(472);
			task();
			setState(473);
			match(T__49);
			setState(474);
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
		enterRule(_localctx, 68, RULE_inputvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
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
		public TaskContext task() {
			return getRuleContext(TaskContext.class,0);
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
		enterRule(_localctx, 70, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(T__50);
			setState(479);
			task();
			setState(480);
			match(T__49);
			setState(481);
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
		enterRule(_localctx, 72, RULE_outputvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3<\u01e8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\5\3Y\n\3\3\4\3\4\3\4\5\4^\n\4\3\5\3\5\3\5\3\5\7\5d"+
		"\n\5\f\5\16\5g\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6q\n\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u0084"+
		"\n\t\3\n\3\n\5\n\u0088\n\n\3\13\3\13\3\13\3\13\7\13\u008e\n\13\f\13\16"+
		"\13\u0091\13\13\3\13\3\13\3\13\3\f\3\f\5\f\u0098\n\f\3\r\3\r\5\r\u009c"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00b0\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00dc\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f7\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u0119\n\21\3\22\3\22\3\22\3\22\5\22\u011f\n\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u012b\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0139\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0147\n\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0155\n\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0163"+
		"\n\22\3\22\3\22\3\22\3\22\5\22\u0169\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u0176\n\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0184\n\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u018c\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0195\n"+
		"\23\5\23\u0197\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u01a5\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\5\27\u01ae"+
		"\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u01ca\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\2\2\'\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\6\3\2$%\3\2&)\3"+
		"\2*-\3\2\678\u0216\2O\3\2\2\2\4X\3\2\2\2\6Z\3\2\2\2\b_\3\2\2\2\np\3\2"+
		"\2\2\fr\3\2\2\2\16t\3\2\2\2\20\u0083\3\2\2\2\22\u0087\3\2\2\2\24\u0089"+
		"\3\2\2\2\26\u0097\3\2\2\2\30\u009b\3\2\2\2\32\u00af\3\2\2\2\34\u00db\3"+
		"\2\2\2\36\u00f6\3\2\2\2 \u0118\3\2\2\2\"\u0168\3\2\2\2$\u0196\3\2\2\2"+
		"&\u01a4\3\2\2\2(\u01a6\3\2\2\2*\u01a8\3\2\2\2,\u01ad\3\2\2\2.\u01af\3"+
		"\2\2\2\60\u01b1\3\2\2\2\62\u01b5\3\2\2\2\64\u01c9\3\2\2\2\66\u01cb\3\2"+
		"\2\28\u01cd\3\2\2\2:\u01cf\3\2\2\2<\u01d1\3\2\2\2>\u01d3\3\2\2\2@\u01d5"+
		"\3\2\2\2B\u01d7\3\2\2\2D\u01d9\3\2\2\2F\u01de\3\2\2\2H\u01e0\3\2\2\2J"+
		"\u01e5\3\2\2\2LN\5\4\3\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2"+
		"\2\2QO\3\2\2\2RS\7\2\2\3S\3\3\2\2\2TY\5\6\4\2UY\5\b\5\2VY\5\16\b\2WY\5"+
		"\24\13\2XT\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\5\3\2\2\2Z]\7\3\2\2"+
		"[^\5\32\16\2\\^\5\34\17\2][\3\2\2\2]\\\3\2\2\2^\7\3\2\2\2_`\7\4\2\2`e"+
		"\5\n\6\2ab\7\5\2\2bd\5\n\6\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f"+
		"h\3\2\2\2ge\3\2\2\2hi\7\6\2\2ij\5\f\7\2j\t\3\2\2\2kq\5\34\17\2lq\5 \21"+
		"\2mq\5$\23\2nq\5\"\22\2oq\5\32\16\2pk\3\2\2\2pl\3\2\2\2pm\3\2\2\2pn\3"+
		"\2\2\2po\3\2\2\2q\13\3\2\2\2rs\5\36\20\2s\r\3\2\2\2tu\7\4\2\2uz\5\20\t"+
		"\2vw\7\5\2\2wy\5\20\t\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2"+
		"\2\2|z\3\2\2\2}~\7\6\2\2~\177\5\22\n\2\177\17\3\2\2\2\u0080\u0084\5\34"+
		"\17\2\u0081\u0084\5$\23\2\u0082\u0084\5\"\22\2\u0083\u0080\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\21\3\2\2\2\u0085\u0088\5\36\20"+
		"\2\u0086\u0088\5\34\17\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\23\3\2\2\2\u0089\u008a\7\4\2\2\u008a\u008f\5\26\f\2\u008b\u008c\7\5\2"+
		"\2\u008c\u008e\5\26\f\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0092\u0093\7\6\2\2\u0093\u0094\5\30\r\2\u0094\25\3\2\2\2\u0095\u0098"+
		"\5\34\17\2\u0096\u0098\5 \21\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2"+
		"\u0098\27\3\2\2\2\u0099\u009c\5\36\20\2\u009a\u009c\5\34\17\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009a\3\2\2\2\u009c\31\3\2\2\2\u009d\u009e\7\7\2\2\u009e"+
		"\u009f\5(\25\2\u009f\u00a0\7\b\2\2\u00a0\u00a1\5(\25\2\u00a1\u00a2\7\t"+
		"\2\2\u00a2\u00b0\3\2\2\2\u00a3\u00a4\7\n\2\2\u00a4\u00a5\5(\25\2\u00a5"+
		"\u00a6\7\b\2\2\u00a6\u00a7\5(\25\2\u00a7\u00a8\7\t\2\2\u00a8\u00b0\3\2"+
		"\2\2\u00a9\u00aa\7\13\2\2\u00aa\u00ab\5(\25\2\u00ab\u00ac\7\b\2\2\u00ac"+
		"\u00ad\5(\25\2\u00ad\u00ae\7\t\2\2\u00ae\u00b0\3\2\2\2\u00af\u009d\3\2"+
		"\2\2\u00af\u00a3\3\2\2\2\u00af\u00a9\3\2\2\2\u00b0\33\3\2\2\2\u00b1\u00b2"+
		"\7\f\2\2\u00b2\u00b3\5*\26\2\u00b3\u00b4\7\b\2\2\u00b4\u00b5\5,\27\2\u00b5"+
		"\u00b6\7\t\2\2\u00b6\u00dc\3\2\2\2\u00b7\u00b8\7\r\2\2\u00b8\u00b9\5("+
		"\25\2\u00b9\u00ba\7\b\2\2\u00ba\u00bb\5,\27\2\u00bb\u00bc\7\t\2\2\u00bc"+
		"\u00dc\3\2\2\2\u00bd\u00be\7\16\2\2\u00be\u00bf\5(\25\2\u00bf\u00c0\7"+
		"\b\2\2\u00c0\u00c1\5*\26\2\u00c1\u00c2\7\t\2\2\u00c2\u00dc\3\2\2\2\u00c3"+
		"\u00c4\7\17\2\2\u00c4\u00c5\5*\26\2\u00c5\u00c6\7\b\2\2\u00c6\u00c7\5"+
		",\27\2\u00c7\u00c8\7\t\2\2\u00c8\u00dc\3\2\2\2\u00c9\u00ca\7\20\2\2\u00ca"+
		"\u00cb\5*\26\2\u00cb\u00cc\7\b\2\2\u00cc\u00cd\5,\27\2\u00cd\u00ce\7\t"+
		"\2\2\u00ce\u00dc\3\2\2\2\u00cf\u00d0\7\21\2\2\u00d0\u00d1\5*\26\2\u00d1"+
		"\u00d2\7\b\2\2\u00d2\u00d3\5*\26\2\u00d3\u00d4\7\t\2\2\u00d4\u00dc\3\2"+
		"\2\2\u00d5\u00d6\7\22\2\2\u00d6\u00d7\5,\27\2\u00d7\u00d8\7\b\2\2\u00d8"+
		"\u00d9\5,\27\2\u00d9\u00da\7\t\2\2\u00da\u00dc\3\2\2\2\u00db\u00b1\3\2"+
		"\2\2\u00db\u00b7\3\2\2\2\u00db\u00bd\3\2\2\2\u00db\u00c3\3\2\2\2\u00db"+
		"\u00c9\3\2\2\2\u00db\u00cf\3\2\2\2\u00db\u00d5\3\2\2\2\u00dc\35\3\2\2"+
		"\2\u00dd\u00de\7\23\2\2\u00de\u00df\5(\25\2\u00df\u00e0\7\b\2\2\u00e0"+
		"\u00e1\5,\27\2\u00e1\u00e2\7\t\2\2\u00e2\u00f7\3\2\2\2\u00e3\u00e4\7\24"+
		"\2\2\u00e4\u00e5\5*\26\2\u00e5\u00e6\7\b\2\2\u00e6\u00e7\5,\27\2\u00e7"+
		"\u00e8\7\t\2\2\u00e8\u00f7\3\2\2\2\u00e9\u00ea\7\25\2\2\u00ea\u00eb\5"+
		"(\25\2\u00eb\u00ec\7\b\2\2\u00ec\u00ed\5,\27\2\u00ed\u00ee\7\t\2\2\u00ee"+
		"\u00f7\3\2\2\2\u00ef\u00f0\7\26\2\2\u00f0\u00f1\5*\26\2\u00f1\u00f2\7"+
		"\b\2\2\u00f2\u00f3\5,\27\2\u00f3\u00f4\7\t\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f7\7\27\2\2\u00f6\u00dd\3\2\2\2\u00f6\u00e3\3\2\2\2\u00f6\u00e9\3"+
		"\2\2\2\u00f6\u00ef\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\37\3\2\2\2\u00f8"+
		"\u00f9\7\30\2\2\u00f9\u00fa\5(\25\2\u00fa\u00fb\7\b\2\2\u00fb\u00fc\5"+
		",\27\2\u00fc\u00fd\7\t\2\2\u00fd\u0119\3\2\2\2\u00fe\u00ff\7\31\2\2\u00ff"+
		"\u0100\5*\26\2\u0100\u0101\7\b\2\2\u0101\u0102\5,\27\2\u0102\u0103\7\t"+
		"\2\2\u0103\u0119\3\2\2\2\u0104\u0105\7\32\2\2\u0105\u0106\5(\25\2\u0106"+
		"\u0107\7\b\2\2\u0107\u0108\5,\27\2\u0108\u0109\7\t\2\2\u0109\u0119\3\2"+
		"\2\2\u010a\u010b\7\33\2\2\u010b\u010c\5,\27\2\u010c\u010d\7\t\2\2\u010d"+
		"\u0119\3\2\2\2\u010e\u010f\7\34\2\2\u010f\u0110\5,\27\2\u0110\u0111\7"+
		"\t\2\2\u0111\u0119\3\2\2\2\u0112\u0113\7\35\2\2\u0113\u0114\5(\25\2\u0114"+
		"\u0115\7\b\2\2\u0115\u0116\5(\25\2\u0116\u0117\7\t\2\2\u0117\u0119\3\2"+
		"\2\2\u0118\u00f8\3\2\2\2\u0118\u00fe\3\2\2\2\u0118\u0104\3\2\2\2\u0118"+
		"\u010a\3\2\2\2\u0118\u010e\3\2\2\2\u0118\u0112\3\2\2\2\u0119!\3\2\2\2"+
		"\u011a\u011e\7\36\2\2\u011b\u011f\5\34\17\2\u011c\u011f\5 \21\2\u011d"+
		"\u011f\5$\23\2\u011e\u011b\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7\b\2\2\u0121\u0122\5\64\33\2\u0122"+
		"\u0123\7\t\2\2\u0123\u0169\3\2\2\2\u0124\u0125\7\36\2\2\u0125\u0126\5"+
		"\64\33\2\u0126\u012a\7\b\2\2\u0127\u012b\5\34\17\2\u0128\u012b\5 \21\2"+
		"\u0129\u012b\5$\23\2\u012a\u0127\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u0129"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7\b\2\2\u012d\u012e\5\64\33\2"+
		"\u012e\u012f\7\t\2\2\u012f\u0169\3\2\2\2\u0130\u0131\7\37\2\2\u0131\u0132"+
		"\5\64\33\2\u0132\u0138\7\b\2\2\u0133\u0139\5\34\17\2\u0134\u0139\5 \21"+
		"\2\u0135\u0139\5$\23\2\u0136\u0139\5H%\2\u0137\u0139\5D#\2\u0138\u0133"+
		"\3\2\2\2\u0138\u0134\3\2\2\2\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\7\b\2\2\u013b\u013c\5\64"+
		"\33\2\u013c\u013d\7\t\2\2\u013d\u0169\3\2\2\2\u013e\u013f\7 \2\2\u013f"+
		"\u0140\5\64\33\2\u0140\u0146\7\b\2\2\u0141\u0147\5\34\17\2\u0142\u0147"+
		"\5 \21\2\u0143\u0147\5$\23\2\u0144\u0147\5H%\2\u0145\u0147\5D#\2\u0146"+
		"\u0141\3\2\2\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7\b\2\2\u0149"+
		"\u014a\5\64\33\2\u014a\u014b\7\t\2\2\u014b\u0169\3\2\2\2\u014c\u014d\7"+
		"!\2\2\u014d\u014e\5\64\33\2\u014e\u0154\7\b\2\2\u014f\u0155\5\34\17\2"+
		"\u0150\u0155\5 \21\2\u0151\u0155\5$\23\2\u0152\u0155\5H%\2\u0153\u0155"+
		"\5D#\2\u0154\u014f\3\2\2\2\u0154\u0150\3\2\2\2\u0154\u0151\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\7\b"+
		"\2\2\u0157\u0158\5\64\33\2\u0158\u0159\7\t\2\2\u0159\u0169\3\2\2\2\u015a"+
		"\u015b\7\"\2\2\u015b\u015c\5\64\33\2\u015c\u0162\7\b\2\2\u015d\u0163\5"+
		"\34\17\2\u015e\u0163\5 \21\2\u015f\u0163\5$\23\2\u0160\u0163\5H%\2\u0161"+
		"\u0163\5D#\2\u0162\u015d\3\2\2\2\u0162\u015e\3\2\2\2\u0162\u015f\3\2\2"+
		"\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165"+
		"\7\b\2\2\u0165\u0166\5\64\33\2\u0166\u0167\7\t\2\2\u0167\u0169\3\2\2\2"+
		"\u0168\u011a\3\2\2\2\u0168\u0124\3\2\2\2\u0168\u0130\3\2\2\2\u0168\u013e"+
		"\3\2\2\2\u0168\u014c\3\2\2\2\u0168\u015a\3\2\2\2\u0169#\3\2\2\2\u016a"+
		"\u0176\5\66\34\2\u016b\u0176\58\35\2\u016c\u0176\5:\36\2\u016d\u0176\5"+
		"<\37\2\u016e\u0176\5> \2\u016f\u0176\5@!\2\u0170\u0176\5\64\33\2\u0171"+
		"\u0172\7#\2\2\u0172\u0173\5&\24\2\u0173\u0174\7\t\2\2\u0174\u0176\3\2"+
		"\2\2\u0175\u016a\3\2\2\2\u0175\u016b\3\2\2\2\u0175\u016c\3\2\2\2\u0175"+
		"\u016d\3\2\2\2\u0175\u016e\3\2\2\2\u0175\u016f\3\2\2\2\u0175\u0170\3\2"+
		"\2\2\u0175\u0171\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0183\t\2\2\2\u0178"+
		"\u0184\5\66\34\2\u0179\u0184\58\35\2\u017a\u0184\5:\36\2\u017b\u0184\5"+
		"<\37\2\u017c\u0184\5> \2\u017d\u0184\5@!\2\u017e\u0184\5\64\33\2\u017f"+
		"\u0180\7#\2\2\u0180\u0181\5&\24\2\u0181\u0182\7\t\2\2\u0182\u0184\3\2"+
		"\2\2\u0183\u0178\3\2\2\2\u0183\u0179\3\2\2\2\u0183\u017a\3\2\2\2\u0183"+
		"\u017b\3\2\2\2\u0183\u017c\3\2\2\2\u0183\u017d\3\2\2\2\u0183\u017e\3\2"+
		"\2\2\u0183\u017f\3\2\2\2\u0184\u0197\3\2\2\2\u0185\u018c\5B\"\2\u0186"+
		"\u018c\5\64\33\2\u0187\u0188\7#\2\2\u0188\u0189\5&\24\2\u0189\u018a\7"+
		"\t\2\2\u018a\u018c\3\2\2\2\u018b\u0185\3\2\2\2\u018b\u0186\3\2\2\2\u018b"+
		"\u0187\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0194\t\3\2\2\u018e\u0195\5B"+
		"\"\2\u018f\u0195\5\64\33\2\u0190\u0191\7#\2\2\u0191\u0192\5&\24\2\u0192"+
		"\u0193\7\t\2\2\u0193\u0195\3\2\2\2\u0194\u018e\3\2\2\2\u0194\u018f\3\2"+
		"\2\2\u0194\u0190\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0175\3\2\2\2\u0196"+
		"\u018b\3\2\2\2\u0197%\3\2\2\2\u0198\u0199\5\64\33\2\u0199\u019a\t\4\2"+
		"\2\u019a\u019b\5\64\33\2\u019b\u01a5\3\2\2\2\u019c\u019d\7#\2\2\u019d"+
		"\u019e\5&\24\2\u019e\u019f\7\t\2\2\u019f\u01a0\t\4\2\2\u01a0\u01a1\7#"+
		"\2\2\u01a1\u01a2\5&\24\2\u01a2\u01a3\7\t\2\2\u01a3\u01a5\3\2\2\2\u01a4"+
		"\u0198\3\2\2\2\u01a4\u019c\3\2\2\2\u01a5\'\3\2\2\2\u01a6\u01a7\t\5\2\2"+
		"\u01a7)\3\2\2\2\u01a8\u01a9\t\5\2\2\u01a9+\3\2\2\2\u01aa\u01ae\5.\30\2"+
		"\u01ab\u01ae\5\60\31\2\u01ac\u01ae\5\62\32\2\u01ad\u01aa\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae-\3\2\2\2\u01af\u01b0\t\5\2\2"+
		"\u01b0/\3\2\2\2\u01b1\u01b2\t\5\2\2\u01b2\u01b3\7.\2\2\u01b3\u01b4\t\5"+
		"\2\2\u01b4\61\3\2\2\2\u01b5\u01b6\t\5\2\2\u01b6\u01b7\7.\2\2\u01b7\u01b8"+
		"\t\5\2\2\u01b8\u01b9\7.\2\2\u01b9\u01ba\t\5\2\2\u01ba\63\3\2\2\2\u01bb"+
		"\u01ca\7:\2\2\u01bc\u01ca\78\2\2\u01bd\u01be\7/\2\2\u01be\u01bf\5,\27"+
		"\2\u01bf\u01c0\7\b\2\2\u01c0\u01c1\5B\"\2\u01c1\u01c2\7\t\2\2\u01c2\u01ca"+
		"\3\2\2\2\u01c3\u01c4\7\60\2\2\u01c4\u01c5\5,\27\2\u01c5\u01c6\7\b\2\2"+
		"\u01c6\u01c7\5,\27\2\u01c7\u01c8\7\t\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01bb"+
		"\3\2\2\2\u01c9\u01bc\3\2\2\2\u01c9\u01bd\3\2\2\2\u01c9\u01c3\3\2\2\2\u01ca"+
		"\65\3\2\2\2\u01cb\u01cc\5(\25\2\u01cc\67\3\2\2\2\u01cd\u01ce\5*\26\2\u01ce"+
		"9\3\2\2\2\u01cf\u01d0\7\61\2\2\u01d0;\3\2\2\2\u01d1\u01d2\5,\27\2\u01d2"+
		"=\3\2\2\2\u01d3\u01d4\5,\27\2\u01d4?\3\2\2\2\u01d5\u01d6\7\62\2\2\u01d6"+
		"A\3\2\2\2\u01d7\u01d8\78\2\2\u01d8C\3\2\2\2\u01d9\u01da\7\63\2\2\u01da"+
		"\u01db\5,\27\2\u01db\u01dc\7\64\2\2\u01dc\u01dd\5F$\2\u01ddE\3\2\2\2\u01de"+
		"\u01df\78\2\2\u01dfG\3\2\2\2\u01e0\u01e1\7\65\2\2\u01e1\u01e2\5,\27\2"+
		"\u01e2\u01e3\7\64\2\2\u01e3\u01e4\5J&\2\u01e4I\3\2\2\2\u01e5\u01e6\78"+
		"\2\2\u01e6K\3\2\2\2 OX]epz\u0083\u0087\u008f\u0097\u009b\u00af\u00db\u00f6"+
		"\u0118\u011e\u012a\u0138\u0146\u0154\u0162\u0168\u0175\u0183\u018b\u0194"+
		"\u0196\u01a4\u01ad\u01c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}