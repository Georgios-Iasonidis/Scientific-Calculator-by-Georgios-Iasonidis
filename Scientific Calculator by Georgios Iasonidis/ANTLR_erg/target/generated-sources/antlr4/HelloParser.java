// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, WS=2, ADD=3, MINUS=4, MULTI=5, DIV=6, POW=7, SIN=8, COS=9, TAN=10, 
		COT=11, MOD=12, AND=13, OR=14, NOT=15, XOR=16, NAND=17, LOG=18, FACTORIAL=19, 
		P=20, SQRT=21, E=22, SEMI=23, LEFTPAR=24, RIGHTPAR=25, NUM=26, LOGIC=27;
	public static final String[] tokenNames = {
		"<INVALID>", "ID", "WS", "'+'", "'-'", "'*'", "'/'", "'^'", "'SIN'", "'COS'", 
		"'TAN'", "'COT'", "'%'", "'&&'", "'||'", "'!'", "'XOR'", "'NAND'", "'LOG'", 
		"'FACT'", "P", "'SQRT'", "E", "';'", "'('", "')'", "NUM", "LOGIC"
	};
	public static final int
		RULE_rul = 0, RULE_logic_operations = 1, RULE_add_op = 2, RULE_minus_op = 3, 
		RULE_multi_op = 4, RULE_div_op = 5, RULE_pow_op = 6, RULE_sin_op = 7, 
		RULE_cos_op = 8, RULE_tan_op = 9, RULE_cot_op = 10, RULE_mod_op = 11, 
		RULE_and_op = 12, RULE_or_op = 13, RULE_not_op = 14, RULE_xor_op = 15, 
		RULE_nand_op = 16, RULE_log_op = 17, RULE_factorial_op = 18, RULE_p_op = 19, 
		RULE_sqrt_op = 20, RULE_e_op = 21;
	public static final String[] ruleNames = {
		"rul", "logic_operations", "add_op", "minus_op", "multi_op", "div_op", 
		"pow_op", "sin_op", "cos_op", "tan_op", "cot_op", "mod_op", "and_op", 
		"or_op", "not_op", "xor_op", "nand_op", "log_op", "factorial_op", "p_op", 
		"sqrt_op", "e_op"
	};

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RulContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HelloParser.EOF, 0); }
		public Logic_operationsContext logic_operations(int i) {
			return getRuleContext(Logic_operationsContext.class,i);
		}
		public List<Logic_operationsContext> logic_operations() {
			return getRuleContexts(Logic_operationsContext.class);
		}
		public RulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterRul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitRul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitRul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulContext rul() throws RecognitionException {
		RulContext _localctx = new RulContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44); logic_operations();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIN) | (1L << COS) | (1L << TAN) | (1L << COT) | (1L << NOT) | (1L << LOG) | (1L << P) | (1L << SQRT) | (1L << E) | (1L << NUM) | (1L << LOGIC))) != 0) );
			setState(49); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logic_operationsContext extends ParserRuleContext {
		public Add_opContext add_op() {
			return getRuleContext(Add_opContext.class,0);
		}
		public Div_opContext div_op() {
			return getRuleContext(Div_opContext.class,0);
		}
		public Xor_opContext xor_op() {
			return getRuleContext(Xor_opContext.class,0);
		}
		public Sin_opContext sin_op() {
			return getRuleContext(Sin_opContext.class,0);
		}
		public Tan_opContext tan_op() {
			return getRuleContext(Tan_opContext.class,0);
		}
		public Not_opContext not_op() {
			return getRuleContext(Not_opContext.class,0);
		}
		public Or_opContext or_op() {
			return getRuleContext(Or_opContext.class,0);
		}
		public Cot_opContext cot_op() {
			return getRuleContext(Cot_opContext.class,0);
		}
		public P_opContext p_op() {
			return getRuleContext(P_opContext.class,0);
		}
		public Pow_opContext pow_op() {
			return getRuleContext(Pow_opContext.class,0);
		}
		public Sqrt_opContext sqrt_op() {
			return getRuleContext(Sqrt_opContext.class,0);
		}
		public Cos_opContext cos_op() {
			return getRuleContext(Cos_opContext.class,0);
		}
		public E_opContext e_op() {
			return getRuleContext(E_opContext.class,0);
		}
		public Factorial_opContext factorial_op() {
			return getRuleContext(Factorial_opContext.class,0);
		}
		public And_opContext and_op() {
			return getRuleContext(And_opContext.class,0);
		}
		public Log_opContext log_op() {
			return getRuleContext(Log_opContext.class,0);
		}
		public Multi_opContext multi_op() {
			return getRuleContext(Multi_opContext.class,0);
		}
		public Minus_opContext minus_op() {
			return getRuleContext(Minus_opContext.class,0);
		}
		public Mod_opContext mod_op() {
			return getRuleContext(Mod_opContext.class,0);
		}
		public Nand_opContext nand_op() {
			return getRuleContext(Nand_opContext.class,0);
		}
		public Logic_operationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLogic_operations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLogic_operations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLogic_operations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_operationsContext logic_operations() throws RecognitionException {
		Logic_operationsContext _localctx = new Logic_operationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_logic_operations);
		try {
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51); add_op();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52); minus_op();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53); multi_op();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(54); div_op();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(55); pow_op();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(56); sin_op();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(57); cos_op();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(58); tan_op();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(59); cot_op();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(60); mod_op();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(61); and_op();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(62); or_op();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(63); not_op();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(64); xor_op();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(65); nand_op();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(66); log_op();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(67); factorial_op();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(68); p_op();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(69); sqrt_op();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(70); e_op();
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

	public static class Add_opContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(HelloParser.NUM); }
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public TerminalNode NUM(int i) {
			return getToken(HelloParser.NUM, i);
		}
		public TerminalNode ADD() { return getToken(HelloParser.ADD, 0); }
		public Add_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAdd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAdd_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAdd_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_opContext add_op() throws RecognitionException {
		Add_opContext _localctx = new Add_opContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_add_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(NUM);
			setState(74); match(ADD);
			setState(75); match(NUM);
			setState(76); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Minus_opContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(HelloParser.NUM); }
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public TerminalNode NUM(int i) {
			return getToken(HelloParser.NUM, i);
		}
		public TerminalNode MINUS() { return getToken(HelloParser.MINUS, 0); }
		public Minus_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMinus_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMinus_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMinus_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Minus_opContext minus_op() throws RecognitionException {
		Minus_opContext _localctx = new Minus_opContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_minus_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(NUM);
			setState(79); match(MINUS);
			setState(80); match(NUM);
			setState(81); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multi_opContext extends ParserRuleContext {
		public TerminalNode MULTI() { return getToken(HelloParser.MULTI, 0); }
		public List<TerminalNode> NUM() { return getTokens(HelloParser.NUM); }
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public TerminalNode NUM(int i) {
			return getToken(HelloParser.NUM, i);
		}
		public Multi_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMulti_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMulti_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMulti_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_opContext multi_op() throws RecognitionException {
		Multi_opContext _localctx = new Multi_opContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multi_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(NUM);
			setState(84); match(MULTI);
			setState(85); match(NUM);
			setState(86); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Div_opContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(HelloParser.NUM); }
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public TerminalNode NUM(int i) {
			return getToken(HelloParser.NUM, i);
		}
		public TerminalNode DIV() { return getToken(HelloParser.DIV, 0); }
		public Div_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDiv_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDiv_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDiv_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Div_opContext div_op() throws RecognitionException {
		Div_opContext _localctx = new Div_opContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_div_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(NUM);
			setState(89); match(DIV);
			setState(90); match(NUM);
			setState(91); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pow_opContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(HelloParser.NUM); }
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public TerminalNode NUM(int i) {
			return getToken(HelloParser.NUM, i);
		}
		public TerminalNode POW() { return getToken(HelloParser.POW, 0); }
		public Pow_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pow_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPow_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPow_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitPow_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pow_opContext pow_op() throws RecognitionException {
		Pow_opContext _localctx = new Pow_opContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pow_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(NUM);
			setState(94); match(POW);
			setState(95); match(NUM);
			setState(96); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sin_opContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(HelloParser.NUM, 0); }
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public TerminalNode SIN() { return getToken(HelloParser.SIN, 0); }
		public TerminalNode RIGHTPAR() { return getToken(HelloParser.RIGHTPAR, 0); }
		public TerminalNode LEFTPAR() { return getToken(HelloParser.LEFTPAR, 0); }
		public Sin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSin_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSin_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sin_opContext sin_op() throws RecognitionException {
		Sin_opContext _localctx = new Sin_opContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sin_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(SIN);
			setState(99); match(LEFTPAR);
			setState(100); match(NUM);
			setState(101); match(RIGHTPAR);
			setState(102); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cos_opContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(HelloParser.NUM, 0); }
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public TerminalNode RIGHTPAR() { return getToken(HelloParser.RIGHTPAR, 0); }
		public TerminalNode LEFTPAR() { return getToken(HelloParser.LEFTPAR, 0); }
		public TerminalNode COS() { return getToken(HelloParser.COS, 0); }
		public Cos_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cos_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCos_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCos_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCos_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cos_opContext cos_op() throws RecognitionException {
		Cos_opContext _localctx = new Cos_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cos_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(COS);
			setState(105); match(LEFTPAR);
			setState(106); match(NUM);
			setState(107); match(RIGHTPAR);
			setState(108); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tan_opContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(HelloParser.NUM, 0); }
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public TerminalNode TAN() { return getToken(HelloParser.TAN, 0); }
		public TerminalNode RIGHTPAR() { return getToken(HelloParser.RIGHTPAR, 0); }
		public TerminalNode LEFTPAR() { return getToken(HelloParser.LEFTPAR, 0); }
		public Tan_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tan_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTan_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTan_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTan_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tan_opContext tan_op() throws RecognitionException {
		Tan_opContext _localctx = new Tan_opContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tan_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(TAN);
			setState(111); match(LEFTPAR);
			setState(112); match(NUM);
			setState(113); match(RIGHTPAR);
			setState(114); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cot_opContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(HelloParser.NUM, 0); }
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public TerminalNode COT() { return getToken(HelloParser.COT, 0); }
		public TerminalNode RIGHTPAR() { return getToken(HelloParser.RIGHTPAR, 0); }
		public TerminalNode LEFTPAR() { return getToken(HelloParser.LEFTPAR, 0); }
		public Cot_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cot_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCot_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCot_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCot_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cot_opContext cot_op() throws RecognitionException {
		Cot_opContext _localctx = new Cot_opContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cot_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(COT);
			setState(117); match(LEFTPAR);
			setState(118); match(NUM);
			setState(119); match(RIGHTPAR);
			setState(120); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mod_opContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(HelloParser.NUM); }
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public TerminalNode NUM(int i) {
			return getToken(HelloParser.NUM, i);
		}
		public TerminalNode MOD() { return getToken(HelloParser.MOD, 0); }
		public Mod_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMod_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMod_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMod_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mod_opContext mod_op() throws RecognitionException {
		Mod_opContext _localctx = new Mod_opContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mod_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(NUM);
			setState(123); match(MOD);
			setState(124); match(NUM);
			setState(125); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_opContext extends ParserRuleContext {
		public List<TerminalNode> LOGIC() { return getTokens(HelloParser.LOGIC); }
		public TerminalNode LOGIC(int i) {
			return getToken(HelloParser.LOGIC, i);
		}
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public TerminalNode AND() { return getToken(HelloParser.AND, 0); }
		public And_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAnd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAnd_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAnd_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_opContext and_op() throws RecognitionException {
		And_opContext _localctx = new And_opContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_and_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(LOGIC);
			setState(128); match(AND);
			setState(129); match(LOGIC);
			setState(130); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_opContext extends ParserRuleContext {
		public List<TerminalNode> LOGIC() { return getTokens(HelloParser.LOGIC); }
		public TerminalNode LOGIC(int i) {
			return getToken(HelloParser.LOGIC, i);
		}
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public TerminalNode OR() { return getToken(HelloParser.OR, 0); }
		public Or_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterOr_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitOr_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitOr_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_opContext or_op() throws RecognitionException {
		Or_opContext _localctx = new Or_opContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_or_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(LOGIC);
			setState(133); match(OR);
			setState(134); match(LOGIC);
			setState(135); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not_opContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(HelloParser.NOT, 0); }
		public TerminalNode LOGIC() { return getToken(HelloParser.LOGIC, 0); }
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public Not_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNot_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNot_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitNot_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_opContext not_op() throws RecognitionException {
		Not_opContext _localctx = new Not_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_not_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(NOT);
			setState(138); match(LOGIC);
			setState(139); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xor_opContext extends ParserRuleContext {
		public List<TerminalNode> LOGIC() { return getTokens(HelloParser.LOGIC); }
		public TerminalNode LOGIC(int i) {
			return getToken(HelloParser.LOGIC, i);
		}
		public TerminalNode XOR() { return getToken(HelloParser.XOR, 0); }
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public Xor_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterXor_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitXor_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitXor_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_opContext xor_op() throws RecognitionException {
		Xor_opContext _localctx = new Xor_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_xor_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(LOGIC);
			setState(142); match(XOR);
			setState(143); match(LOGIC);
			setState(144); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nand_opContext extends ParserRuleContext {
		public List<TerminalNode> LOGIC() { return getTokens(HelloParser.LOGIC); }
		public TerminalNode LOGIC(int i) {
			return getToken(HelloParser.LOGIC, i);
		}
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public TerminalNode NAND() { return getToken(HelloParser.NAND, 0); }
		public Nand_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nand_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNand_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNand_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitNand_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nand_opContext nand_op() throws RecognitionException {
		Nand_opContext _localctx = new Nand_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nand_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(LOGIC);
			setState(147); match(NAND);
			setState(148); match(LOGIC);
			setState(149); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Log_opContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(HelloParser.LOG, 0); }
		public TerminalNode NUM() { return getToken(HelloParser.NUM, 0); }
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public TerminalNode RIGHTPAR() { return getToken(HelloParser.RIGHTPAR, 0); }
		public TerminalNode LEFTPAR() { return getToken(HelloParser.LEFTPAR, 0); }
		public Log_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLog_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLog_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLog_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Log_opContext log_op() throws RecognitionException {
		Log_opContext _localctx = new Log_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_log_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(LOG);
			setState(152); match(LEFTPAR);
			setState(153); match(NUM);
			setState(154); match(RIGHTPAR);
			setState(155); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factorial_opContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(HelloParser.NUM, 0); }
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public TerminalNode FACTORIAL() { return getToken(HelloParser.FACTORIAL, 0); }
		public Factorial_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorial_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFactorial_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFactorial_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFactorial_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factorial_opContext factorial_op() throws RecognitionException {
		Factorial_opContext _localctx = new Factorial_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factorial_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); match(NUM);
			setState(158); match(FACTORIAL);
			setState(159); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class P_opContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public TerminalNode P() { return getToken(HelloParser.P, 0); }
		public P_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterP_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitP_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitP_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_opContext p_op() throws RecognitionException {
		P_opContext _localctx = new P_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_p_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); match(P);
			setState(162); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sqrt_opContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(HelloParser.NUM, 0); }
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public TerminalNode SQRT() { return getToken(HelloParser.SQRT, 0); }
		public TerminalNode RIGHTPAR() { return getToken(HelloParser.RIGHTPAR, 0); }
		public TerminalNode LEFTPAR() { return getToken(HelloParser.LEFTPAR, 0); }
		public Sqrt_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrt_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSqrt_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSqrt_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSqrt_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sqrt_opContext sqrt_op() throws RecognitionException {
		Sqrt_opContext _localctx = new Sqrt_opContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sqrt_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(SQRT);
			setState(165); match(LEFTPAR);
			setState(166); match(NUM);
			setState(167); match(RIGHTPAR);
			setState(168); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class E_opContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(HelloParser.SEMI, 0); }
		public TerminalNode E() { return getToken(HelloParser.E, 0); }
		public E_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterE_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitE_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitE_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E_opContext e_op() throws RecognitionException {
		E_opContext _localctx = new E_opContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_e_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(E);
			setState(171); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u00b0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\6\2\60\n\2\r\2"+
		"\16\2\61\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\2\u00ad"+
		"\2/\3\2\2\2\4I\3\2\2\2\6K\3\2\2\2\bP\3\2\2\2\nU\3\2\2\2\fZ\3\2\2\2\16"+
		"_\3\2\2\2\20d\3\2\2\2\22j\3\2\2\2\24p\3\2\2\2\26v\3\2\2\2\30|\3\2\2\2"+
		"\32\u0081\3\2\2\2\34\u0086\3\2\2\2\36\u008b\3\2\2\2 \u008f\3\2\2\2\"\u0094"+
		"\3\2\2\2$\u0099\3\2\2\2&\u009f\3\2\2\2(\u00a3\3\2\2\2*\u00a6\3\2\2\2,"+
		"\u00ac\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3"+
		"\2\2\2\62\63\3\2\2\2\63\64\7\2\2\3\64\3\3\2\2\2\65J\5\6\4\2\66J\5\b\5"+
		"\2\67J\5\n\6\28J\5\f\7\29J\5\16\b\2:J\5\20\t\2;J\5\22\n\2<J\5\24\13\2"+
		"=J\5\26\f\2>J\5\30\r\2?J\5\32\16\2@J\5\34\17\2AJ\5\36\20\2BJ\5 \21\2C"+
		"J\5\"\22\2DJ\5$\23\2EJ\5&\24\2FJ\5(\25\2GJ\5*\26\2HJ\5,\27\2I\65\3\2\2"+
		"\2I\66\3\2\2\2I\67\3\2\2\2I8\3\2\2\2I9\3\2\2\2I:\3\2\2\2I;\3\2\2\2I<\3"+
		"\2\2\2I=\3\2\2\2I>\3\2\2\2I?\3\2\2\2I@\3\2\2\2IA\3\2\2\2IB\3\2\2\2IC\3"+
		"\2\2\2ID\3\2\2\2IE\3\2\2\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\5\3\2\2\2KL"+
		"\7\34\2\2LM\7\5\2\2MN\7\34\2\2NO\7\31\2\2O\7\3\2\2\2PQ\7\34\2\2QR\7\6"+
		"\2\2RS\7\34\2\2ST\7\31\2\2T\t\3\2\2\2UV\7\34\2\2VW\7\7\2\2WX\7\34\2\2"+
		"XY\7\31\2\2Y\13\3\2\2\2Z[\7\34\2\2[\\\7\b\2\2\\]\7\34\2\2]^\7\31\2\2^"+
		"\r\3\2\2\2_`\7\34\2\2`a\7\t\2\2ab\7\34\2\2bc\7\31\2\2c\17\3\2\2\2de\7"+
		"\n\2\2ef\7\32\2\2fg\7\34\2\2gh\7\33\2\2hi\7\31\2\2i\21\3\2\2\2jk\7\13"+
		"\2\2kl\7\32\2\2lm\7\34\2\2mn\7\33\2\2no\7\31\2\2o\23\3\2\2\2pq\7\f\2\2"+
		"qr\7\32\2\2rs\7\34\2\2st\7\33\2\2tu\7\31\2\2u\25\3\2\2\2vw\7\r\2\2wx\7"+
		"\32\2\2xy\7\34\2\2yz\7\33\2\2z{\7\31\2\2{\27\3\2\2\2|}\7\34\2\2}~\7\16"+
		"\2\2~\177\7\34\2\2\177\u0080\7\31\2\2\u0080\31\3\2\2\2\u0081\u0082\7\35"+
		"\2\2\u0082\u0083\7\17\2\2\u0083\u0084\7\35\2\2\u0084\u0085\7\31\2\2\u0085"+
		"\33\3\2\2\2\u0086\u0087\7\35\2\2\u0087\u0088\7\20\2\2\u0088\u0089\7\35"+
		"\2\2\u0089\u008a\7\31\2\2\u008a\35\3\2\2\2\u008b\u008c\7\21\2\2\u008c"+
		"\u008d\7\35\2\2\u008d\u008e\7\31\2\2\u008e\37\3\2\2\2\u008f\u0090\7\35"+
		"\2\2\u0090\u0091\7\22\2\2\u0091\u0092\7\35\2\2\u0092\u0093\7\31\2\2\u0093"+
		"!\3\2\2\2\u0094\u0095\7\35\2\2\u0095\u0096\7\23\2\2\u0096\u0097\7\35\2"+
		"\2\u0097\u0098\7\31\2\2\u0098#\3\2\2\2\u0099\u009a\7\24\2\2\u009a\u009b"+
		"\7\32\2\2\u009b\u009c\7\34\2\2\u009c\u009d\7\33\2\2\u009d\u009e\7\31\2"+
		"\2\u009e%\3\2\2\2\u009f\u00a0\7\34\2\2\u00a0\u00a1\7\25\2\2\u00a1\u00a2"+
		"\7\31\2\2\u00a2\'\3\2\2\2\u00a3\u00a4\7\26\2\2\u00a4\u00a5\7\31\2\2\u00a5"+
		")\3\2\2\2\u00a6\u00a7\7\27\2\2\u00a7\u00a8\7\32\2\2\u00a8\u00a9\7\34\2"+
		"\2\u00a9\u00aa\7\33\2\2\u00aa\u00ab\7\31\2\2\u00ab+\3\2\2\2\u00ac\u00ad"+
		"\7\30\2\2\u00ad\u00ae\7\31\2\2\u00ae-\3\2\2\2\4\61I";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}