// Generated from D:/ITMO/MT/lab3/src/main/java\Expression.g4 by ANTLR 4.9.2

import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, NUM=2, OB=3, CB=4, ASSIGN=5, ADD=6, SUB=7, MUL=8, DIV=9, SEMICOLON=10, 
		WS=11;
	public static final int
		RULE_s = 0, RULE_assign = 1, RULE_exp = 2, RULE_addSub = 3, RULE_mulDiv = 4, 
		RULE_mulDivRight = 5, RULE_single = 6, RULE_num = 7, RULE_var = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "assign", "exp", "addSub", "mulDiv", "mulDivRight", "single", "num", 
			"var"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'='", "'+'", "'-'", "'*'", "'/'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VAR", "NUM", "OB", "CB", "ASSIGN", "ADD", "SUB", "MUL", "DIV", 
			"SEMICOLON", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public StringBuilder output;
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);

		    Map<String, Integer> vars = new HashMap<>();
		    StringBuilder output = new StringBuilder();
		    ((SContext)_localctx).output =  output;

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(18);
				assign(vars, output);
				}
				}
				setState(23);
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

	public static class AssignContext extends ParserRuleContext {
		public Map <String, Integer> vars;
		public StringBuilder output;
		public VarContext var;
		public ExpContext exp;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ExpressionParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ExpressionParser.SEMICOLON, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AssignContext(ParserRuleContext parent, int invokingState, Map <String, Integer> vars, StringBuilder output) {
			super(parent, invokingState);
			this.vars = vars;
			this.output = output;
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign(Map <String, Integer> vars,StringBuilder output) throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState(), vars, output);
		enterRule(_localctx, 2, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((AssignContext)_localctx).var = var();
			setState(25);
			match(ASSIGN);
			setState(26);
			((AssignContext)_localctx).exp = exp(vars);
			setState(27);
			match(SEMICOLON);
			 _localctx.vars.put((((AssignContext)_localctx).var!=null?_input.getText(((AssignContext)_localctx).var.start,((AssignContext)_localctx).var.stop):null), ((AssignContext)_localctx).exp.val);
			        _localctx.output.append((((AssignContext)_localctx).var!=null?_input.getText(((AssignContext)_localctx).var.start,((AssignContext)_localctx).var.stop):null) + " = " + ((AssignContext)_localctx).exp.val + ";\n"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public Map <String, Integer> vars;
		public int val;
		public MulDivContext mulDiv;
		public AddSubContext addSub;
		public MulDivContext mulDiv() {
			return getRuleContext(MulDivContext.class,0);
		}
		public AddSubContext addSub() {
			return getRuleContext(AddSubContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpContext(ParserRuleContext parent, int invokingState, Map <String, Integer> vars) {
			super(parent, invokingState);
			this.vars = vars;
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp(Map <String, Integer> vars) throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState(), vars);
		enterRule(_localctx, 4, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			((ExpContext)_localctx).mulDiv = mulDiv(vars);
			setState(31);
			((ExpContext)_localctx).addSub = addSub(vars, ((ExpContext)_localctx).mulDiv.val);
			 ((ExpContext)_localctx).val =  ((ExpContext)_localctx).addSub.val; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddSubContext extends ParserRuleContext {
		public Map <String, Integer> vars;
		public int acc;
		public int val;
		public MulDivContext mulDiv;
		public AddSubContext addSub;
		public TerminalNode ADD() { return getToken(ExpressionParser.ADD, 0); }
		public MulDivContext mulDiv() {
			return getRuleContext(MulDivContext.class,0);
		}
		public AddSubContext addSub() {
			return getRuleContext(AddSubContext.class,0);
		}
		public TerminalNode SUB() { return getToken(ExpressionParser.SUB, 0); }
		public AddSubContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AddSubContext(ParserRuleContext parent, int invokingState, Map <String, Integer> vars, int acc) {
			super(parent, invokingState);
			this.vars = vars;
			this.acc = acc;
		}
		@Override public int getRuleIndex() { return RULE_addSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubContext addSub(Map <String, Integer> vars,int acc) throws RecognitionException {
		AddSubContext _localctx = new AddSubContext(_ctx, getState(), vars, acc);
		enterRule(_localctx, 6, RULE_addSub);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(ADD);
				setState(35);
				((AddSubContext)_localctx).mulDiv = mulDiv(vars);
				 ((AddSubContext)_localctx).acc =  _localctx.acc + ((AddSubContext)_localctx).mulDiv.val; 
				setState(37);
				((AddSubContext)_localctx).addSub = addSub(vars, _localctx.acc);
				 ((AddSubContext)_localctx).val =  ((AddSubContext)_localctx).addSub.val; 
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(SUB);
				setState(41);
				((AddSubContext)_localctx).mulDiv = mulDiv(vars);
				 ((AddSubContext)_localctx).acc =  _localctx.acc - ((AddSubContext)_localctx).mulDiv.val; 
				setState(43);
				((AddSubContext)_localctx).addSub = addSub(vars, _localctx.acc);
				 ((AddSubContext)_localctx).val =  ((AddSubContext)_localctx).addSub.val; 
				}
				break;
			case CB:
			case SEMICOLON:
				enterOuterAlt(_localctx, 3);
				{
				 ((AddSubContext)_localctx).val =  _localctx.acc; 
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

	public static class MulDivContext extends ParserRuleContext {
		public Map <String, Integer> vars;
		public int val;
		public SingleContext single;
		public MulDivRightContext mulDivRight;
		public SingleContext single() {
			return getRuleContext(SingleContext.class,0);
		}
		public MulDivRightContext mulDivRight() {
			return getRuleContext(MulDivRightContext.class,0);
		}
		public MulDivContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MulDivContext(ParserRuleContext parent, int invokingState, Map <String, Integer> vars) {
			super(parent, invokingState);
			this.vars = vars;
		}
		@Override public int getRuleIndex() { return RULE_mulDiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivContext mulDiv(Map <String, Integer> vars) throws RecognitionException {
		MulDivContext _localctx = new MulDivContext(_ctx, getState(), vars);
		enterRule(_localctx, 8, RULE_mulDiv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			((MulDivContext)_localctx).single = single(vars);
			setState(50);
			((MulDivContext)_localctx).mulDivRight = mulDivRight(vars, ((MulDivContext)_localctx).single.val);
			 ((MulDivContext)_localctx).val =  ((MulDivContext)_localctx).mulDivRight.val; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulDivRightContext extends ParserRuleContext {
		public Map <String, Integer> vars;
		public int acc;
		public int val;
		public SingleContext single;
		public MulDivRightContext mulDivRight;
		public TerminalNode MUL() { return getToken(ExpressionParser.MUL, 0); }
		public SingleContext single() {
			return getRuleContext(SingleContext.class,0);
		}
		public MulDivRightContext mulDivRight() {
			return getRuleContext(MulDivRightContext.class,0);
		}
		public TerminalNode DIV() { return getToken(ExpressionParser.DIV, 0); }
		public MulDivRightContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MulDivRightContext(ParserRuleContext parent, int invokingState, Map <String, Integer> vars, int acc) {
			super(parent, invokingState);
			this.vars = vars;
			this.acc = acc;
		}
		@Override public int getRuleIndex() { return RULE_mulDivRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterMulDivRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitMulDivRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitMulDivRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivRightContext mulDivRight(Map <String, Integer> vars,int acc) throws RecognitionException {
		MulDivRightContext _localctx = new MulDivRightContext(_ctx, getState(), vars, acc);
		enterRule(_localctx, 10, RULE_mulDivRight);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(MUL);
				setState(54);
				((MulDivRightContext)_localctx).single = single(vars);
				 ((MulDivRightContext)_localctx).acc =  _localctx.acc * ((MulDivRightContext)_localctx).single.val; 
				setState(56);
				((MulDivRightContext)_localctx).mulDivRight = mulDivRight(vars, _localctx.acc);
				 ((MulDivRightContext)_localctx).val =  ((MulDivRightContext)_localctx).mulDivRight.val; 
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(DIV);
				setState(60);
				((MulDivRightContext)_localctx).single = single(vars);
				 ((MulDivRightContext)_localctx).acc =  _localctx.acc / ((MulDivRightContext)_localctx).single.val; 
				setState(62);
				((MulDivRightContext)_localctx).mulDivRight = mulDivRight(vars, _localctx.acc);
				 ((MulDivRightContext)_localctx).val =  ((MulDivRightContext)_localctx).mulDivRight.val; 
				}
				break;
			case CB:
			case ADD:
			case SUB:
			case SEMICOLON:
				enterOuterAlt(_localctx, 3);
				{
				 ((MulDivRightContext)_localctx).val =  _localctx.acc; 
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

	public static class SingleContext extends ParserRuleContext {
		public Map <String, Integer> vars;
		public int val;
		public ExpContext exp;
		public NumContext num;
		public VarContext var;
		public TerminalNode OB() { return getToken(ExpressionParser.OB, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CB() { return getToken(ExpressionParser.CB, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public SingleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SingleContext(ParserRuleContext parent, int invokingState, Map <String, Integer> vars) {
			super(parent, invokingState);
			this.vars = vars;
		}
		@Override public int getRuleIndex() { return RULE_single; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleContext single(Map <String, Integer> vars) throws RecognitionException {
		SingleContext _localctx = new SingleContext(_ctx, getState(), vars);
		enterRule(_localctx, 12, RULE_single);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OB:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(OB);
				setState(69);
				((SingleContext)_localctx).exp = exp(vars);
				setState(70);
				match(CB);
				 ((SingleContext)_localctx).val =  ((SingleContext)_localctx).exp.val; 
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				((SingleContext)_localctx).num = num();
				 ((SingleContext)_localctx).val =  Integer.parseInt((((SingleContext)_localctx).num!=null?_input.getText(((SingleContext)_localctx).num.start,((SingleContext)_localctx).num.stop):null)); 
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				((SingleContext)_localctx).var = var();

				        Integer varValue = _localctx.vars.get((((SingleContext)_localctx).var!=null?_input.getText(((SingleContext)_localctx).var.start,((SingleContext)_localctx).var.stop):null));
				        ((SingleContext)_localctx).val =  varValue == null ? 0 : varValue;
				    
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ExpressionParser.NUM, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ExpressionParser.VAR, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\rX\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\62\n\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7E\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bR\n\b\3\t\3\t\3\n\3\n\3\n\2"+
		"\2\13\2\4\6\b\n\f\16\20\22\2\2\2U\2\27\3\2\2\2\4\32\3\2\2\2\6 \3\2\2\2"+
		"\b\61\3\2\2\2\n\63\3\2\2\2\fD\3\2\2\2\16Q\3\2\2\2\20S\3\2\2\2\22U\3\2"+
		"\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2"+
		"\2\2\30\3\3\2\2\2\31\27\3\2\2\2\32\33\5\22\n\2\33\34\7\7\2\2\34\35\5\6"+
		"\4\2\35\36\7\f\2\2\36\37\b\3\1\2\37\5\3\2\2\2 !\5\n\6\2!\"\5\b\5\2\"#"+
		"\b\4\1\2#\7\3\2\2\2$%\7\b\2\2%&\5\n\6\2&\'\b\5\1\2\'(\5\b\5\2()\b\5\1"+
		"\2)\62\3\2\2\2*+\7\t\2\2+,\5\n\6\2,-\b\5\1\2-.\5\b\5\2./\b\5\1\2/\62\3"+
		"\2\2\2\60\62\b\5\1\2\61$\3\2\2\2\61*\3\2\2\2\61\60\3\2\2\2\62\t\3\2\2"+
		"\2\63\64\5\16\b\2\64\65\5\f\7\2\65\66\b\6\1\2\66\13\3\2\2\2\678\7\n\2"+
		"\289\5\16\b\29:\b\7\1\2:;\5\f\7\2;<\b\7\1\2<E\3\2\2\2=>\7\13\2\2>?\5\16"+
		"\b\2?@\b\7\1\2@A\5\f\7\2AB\b\7\1\2BE\3\2\2\2CE\b\7\1\2D\67\3\2\2\2D=\3"+
		"\2\2\2DC\3\2\2\2E\r\3\2\2\2FG\7\5\2\2GH\5\6\4\2HI\7\6\2\2IJ\b\b\1\2JR"+
		"\3\2\2\2KL\5\20\t\2LM\b\b\1\2MR\3\2\2\2NO\5\22\n\2OP\b\b\1\2PR\3\2\2\2"+
		"QF\3\2\2\2QK\3\2\2\2QN\3\2\2\2R\17\3\2\2\2ST\7\4\2\2T\21\3\2\2\2UV\7\3"+
		"\2\2V\23\3\2\2\2\6\27\61DQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}