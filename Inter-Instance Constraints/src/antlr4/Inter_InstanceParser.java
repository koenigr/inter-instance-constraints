package antlr4;

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
		T__1=1, T__0=2, ID=3, WS=4;
	public static final String[] tokenNames = {
		"<INVALID>", "'depp'", "'hello'", "ID", "WS"
	};
	public static final int
		RULE_r = 0;
	public static final String[] ruleNames = {
		"r"
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
	public static class RContext extends ParserRuleContext {
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
	 
		public RContext() { }
		public void copyFrom(RContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WerContext extends RContext {
		public TerminalNode ID() { return getToken(Inter_InstanceParser.ID, 0); }
		public WerContext(RContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterWer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitWer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Inter_InstanceVisitor ) return ((Inter_InstanceVisitor<? extends T>)visitor).visitWer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeppContext extends RContext {
		public DeppContext(RContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).enterDepp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Inter_InstanceListener ) ((Inter_InstanceListener)listener).exitDepp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Inter_InstanceVisitor ) return ((Inter_InstanceVisitor<? extends T>)visitor).visitDepp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			setState(6);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new WerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2); match(T__0);
				setState(3); match(ID);
				}
				break;
			case 2:
				_localctx = new DeppContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(4); match(T__0);
				setState(5); match(T__1);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\6\13\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\5\2\t\n\2\3\2\2\2\3\2\2\2\n\2\b\3\2\2\2\4\5\7\4\2\2\5\t\7"+
		"\5\2\2\6\7\7\4\2\2\7\t\7\3\2\2\b\4\3\2\2\2\b\6\3\2\2\2\t\3\3\2\2\2\3\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}