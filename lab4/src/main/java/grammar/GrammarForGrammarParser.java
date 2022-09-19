// Generated from D:/ITMO/MT/lab4/src/main/java/grammar\GrammarForGrammar.g4 by ANTLR 4.9.2
package grammar;

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
public class GrammarForGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REGEXP=1, INH=2, SYN=3, CODE=4, SEMICOLON=5, OR=6, EPS=7, RO_OB=8, RO_CB=9, 
		SQ_OB=10, SQ_CB=11, CU_OB=12, CU_CB=13, TR_OB=14, TR_CB=15, GRAMMAR=16, 
		T_NAME=17, NAME=18, WS=19;
	public static final int
		RULE_s = 0, RULE_rule = 1, RULE_inh = 2, RULE_syn = 3, RULE_ntRule = 4, 
		RULE_sequence = 5, RULE_subsequence = 6, RULE_eps = 7, RULE_code = 8, 
		RULE_name = 9, RULE_tRule = 10, RULE_grName = 11, RULE_regexp = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "rule", "inh", "syn", "ntRule", "sequence", "subsequence", "eps", 
			"code", "name", "tRule", "grName", "regexp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "';'", "'|'", "'@eps'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "'<'", "'>'", "'grammar'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "REGEXP", "INH", "SYN", "CODE", "SEMICOLON", "OR", "EPS", "RO_OB", 
			"RO_CB", "SQ_OB", "SQ_CB", "CU_OB", "CU_CB", "TR_OB", "TR_CB", "GRAMMAR", 
			"T_NAME", "NAME", "WS"
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
	public String getGrammarFileName() { return "GrammarForGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarForGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public Grammar grammar;
		public GrNameContext grName;
		public GrNameContext grName() {
			return getRuleContext(GrNameContext.class,0);
		}
		public List<RuleContext> rule() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);

		    Grammar grammar = new Grammar("", new ArrayList<>(), new ArrayList<>());
		    ((SContext)_localctx).grammar =  grammar;

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			((SContext)_localctx).grName = grName();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_NAME || _la==NAME) {
				{
				{
				setState(27);
				rule(grammar);
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.grammar.name = ((SContext)_localctx).grName.n; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleContext extends ParserRuleContext {
		public Grammar grammar;
		public NtRuleContext ntRule() {
			return getRuleContext(NtRuleContext.class,0);
		}
		public TRuleContext tRule() {
			return getRuleContext(TRuleContext.class,0);
		}
		public RuleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RuleContext(ParserRuleContext parent, int invokingState, Grammar grammar) {
			super(parent, invokingState);
			this.grammar = grammar;
		}
		@Override public int getRuleIndex() { return RULE_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule(Grammar grammar) throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState(), grammar);
		enterRule(_localctx, 2, RULE_rule);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				ntRule(grammar);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				tRule(grammar);
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

	public static class InhContext extends ParserRuleContext {
		public TerminalNode INH() { return getToken(GrammarForGrammarParser.INH, 0); }
		public InhContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterInh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitInh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitInh(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InhContext inh() throws RecognitionException {
		InhContext _localctx = new InhContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(INH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynContext extends ParserRuleContext {
		public TerminalNode SYN() { return getToken(GrammarForGrammarParser.SYN, 0); }
		public SynContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterSyn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitSyn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitSyn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynContext syn() throws RecognitionException {
		SynContext _localctx = new SynContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_syn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(SYN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NtRuleContext extends ParserRuleContext {
		public Grammar grammar;
		public NameContext name;
		public InhContext inh;
		public SynContext syn;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public InhContext inh() {
			return getRuleContext(InhContext.class,0);
		}
		public SynContext syn() {
			return getRuleContext(SynContext.class,0);
		}
		public TerminalNode CU_OB() { return getToken(GrammarForGrammarParser.CU_OB, 0); }
		public List<SequenceContext> sequence() {
			return getRuleContexts(SequenceContext.class);
		}
		public SequenceContext sequence(int i) {
			return getRuleContext(SequenceContext.class,i);
		}
		public TerminalNode CU_CB() { return getToken(GrammarForGrammarParser.CU_CB, 0); }
		public List<TerminalNode> OR() { return getTokens(GrammarForGrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GrammarForGrammarParser.OR, i);
		}
		public NtRuleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NtRuleContext(ParserRuleContext parent, int invokingState, Grammar grammar) {
			super(parent, invokingState);
			this.grammar = grammar;
		}
		@Override public int getRuleIndex() { return RULE_ntRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterNtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitNtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitNtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NtRuleContext ntRule(Grammar grammar) throws RecognitionException {
		NtRuleContext _localctx = new NtRuleContext(_ctx, getState(), grammar);
		enterRule(_localctx, 8, RULE_ntRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			((NtRuleContext)_localctx).name = name();
			setState(44);
			((NtRuleContext)_localctx).inh = inh();
			setState(45);
			((NtRuleContext)_localctx).syn = syn();
			setState(46);
			match(CU_OB);
			setState(47);
			sequence(grammar, new RuleDeclaration((((NtRuleContext)_localctx).name!=null?_input.getText(((NtRuleContext)_localctx).name.start,((NtRuleContext)_localctx).name.stop):null), (((NtRuleContext)_localctx).inh!=null?_input.getText(((NtRuleContext)_localctx).inh.start,((NtRuleContext)_localctx).inh.stop):null), (((NtRuleContext)_localctx).syn!=null?_input.getText(((NtRuleContext)_localctx).syn.start,((NtRuleContext)_localctx).syn.stop):null)));
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(48);
				match(OR);
				setState(49);
				sequence(grammar, new RuleDeclaration((((NtRuleContext)_localctx).name!=null?_input.getText(((NtRuleContext)_localctx).name.start,((NtRuleContext)_localctx).name.stop):null), (((NtRuleContext)_localctx).inh!=null?_input.getText(((NtRuleContext)_localctx).inh.start,((NtRuleContext)_localctx).inh.stop):null), (((NtRuleContext)_localctx).syn!=null?_input.getText(((NtRuleContext)_localctx).syn.start,((NtRuleContext)_localctx).syn.stop):null)));
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(CU_CB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceContext extends ParserRuleContext {
		public Grammar grammar;
		public RuleDeclaration decl;
		public SubsequenceContext subsequence;
		public CodeContext code;
		public List<SubsequenceContext> subsequence() {
			return getRuleContexts(SubsequenceContext.class);
		}
		public SubsequenceContext subsequence(int i) {
			return getRuleContext(SubsequenceContext.class,i);
		}
		public EpsContext eps() {
			return getRuleContext(EpsContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SequenceContext(ParserRuleContext parent, int invokingState, Grammar grammar, RuleDeclaration decl) {
			super(parent, invokingState);
			this.grammar = grammar;
			this.decl = decl;
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence(Grammar grammar,RuleDeclaration decl) throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState(), grammar, decl);
		enterRule(_localctx, 10, RULE_sequence);

		    List<Sequence> sequences = new ArrayList<>();

		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NAME:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(57);
					((SequenceContext)_localctx).subsequence = subsequence();
					 sequences.add(((SequenceContext)_localctx).subsequence.seq); 
					}
					}
					setState(62); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_NAME || _la==NAME );
				 _localctx.grammar.rules.add(new Rule(_localctx.decl, new RuleBody(sequences))); 
				}
				break;
			case EPS:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				eps();
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODE) {
					{
					setState(67);
					((SequenceContext)_localctx).code = code();
					}
				}

				 _localctx.grammar.rules.add(new Rule(_localctx.decl, new RuleBody(List.of(new Sequence(List.of(), (((SequenceContext)_localctx).code!=null?_input.getText(((SequenceContext)_localctx).code.start,((SequenceContext)_localctx).code.stop):null)))))); 
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

	public static class SubsequenceContext extends ParserRuleContext {
		public Sequence seq;
		public NameContext name;
		public InhContext inh;
		public CodeContext code;
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<InhContext> inh() {
			return getRuleContexts(InhContext.class);
		}
		public InhContext inh(int i) {
			return getRuleContext(InhContext.class,i);
		}
		public SubsequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subsequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterSubsequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitSubsequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitSubsequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubsequenceContext subsequence() throws RecognitionException {
		SubsequenceContext _localctx = new SubsequenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_subsequence);

		    List<Element> elements = new ArrayList<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				((SubsequenceContext)_localctx).name = name();
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INH) {
					{
					setState(75);
					((SubsequenceContext)_localctx).inh = inh();
					}
				}

				 elements.add(new Element((((SubsequenceContext)_localctx).name!=null?_input.getText(((SubsequenceContext)_localctx).name.start,((SubsequenceContext)_localctx).name.stop):null), (((SubsequenceContext)_localctx).inh!=null?_input.getText(((SubsequenceContext)_localctx).inh.start,((SubsequenceContext)_localctx).inh.stop):null))); 
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_NAME || _la==NAME );
			setState(84);
			((SubsequenceContext)_localctx).code = code();
			 ((SubsequenceContext)_localctx).seq =  new Sequence(elements, (((SubsequenceContext)_localctx).code!=null?_input.getText(((SubsequenceContext)_localctx).code.start,((SubsequenceContext)_localctx).code.stop):null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EpsContext extends ParserRuleContext {
		public TerminalNode EPS() { return getToken(GrammarForGrammarParser.EPS, 0); }
		public EpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterEps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitEps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitEps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EpsContext eps() throws RecognitionException {
		EpsContext _localctx = new EpsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_eps);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(EPS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeContext extends ParserRuleContext {
		public TerminalNode CODE() { return getToken(GrammarForGrammarParser.CODE, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(CODE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammarForGrammarParser.NAME, 0); }
		public TerminalNode T_NAME() { return getToken(GrammarForGrammarParser.T_NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==T_NAME || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class TRuleContext extends ParserRuleContext {
		public Grammar grammar;
		public NameContext name;
		public RegexpContext regexp;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode CU_OB() { return getToken(GrammarForGrammarParser.CU_OB, 0); }
		public RegexpContext regexp() {
			return getRuleContext(RegexpContext.class,0);
		}
		public TerminalNode CU_CB() { return getToken(GrammarForGrammarParser.CU_CB, 0); }
		public TRuleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TRuleContext(ParserRuleContext parent, int invokingState, Grammar grammar) {
			super(parent, invokingState);
			this.grammar = grammar;
		}
		@Override public int getRuleIndex() { return RULE_tRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterTRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitTRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitTRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TRuleContext tRule(Grammar grammar) throws RecognitionException {
		TRuleContext _localctx = new TRuleContext(_ctx, getState(), grammar);
		enterRule(_localctx, 20, RULE_tRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((TRuleContext)_localctx).name = name();
			setState(94);
			match(CU_OB);
			setState(95);
			((TRuleContext)_localctx).regexp = regexp();
			setState(96);
			match(CU_CB);
			 _localctx.grammar.terminals.add(new Terminal((((TRuleContext)_localctx).name!=null?_input.getText(((TRuleContext)_localctx).name.start,((TRuleContext)_localctx).name.stop):null), (((TRuleContext)_localctx).regexp!=null?_input.getText(((TRuleContext)_localctx).regexp.start,((TRuleContext)_localctx).regexp.stop):null))); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrNameContext extends ParserRuleContext {
		public String n;
		public NameContext name;
		public TerminalNode GRAMMAR() { return getToken(GrammarForGrammarParser.GRAMMAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarForGrammarParser.SEMICOLON, 0); }
		public GrNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterGrName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitGrName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitGrName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrNameContext grName() throws RecognitionException {
		GrNameContext _localctx = new GrNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_grName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(GRAMMAR);
			setState(100);
			((GrNameContext)_localctx).name = name();
			setState(101);
			match(SEMICOLON);
			 ((GrNameContext)_localctx).n =  (((GrNameContext)_localctx).name!=null?_input.getText(((GrNameContext)_localctx).name.start,((GrNameContext)_localctx).name.stop):null); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegexpContext extends ParserRuleContext {
		public TerminalNode REGEXP() { return getToken(GrammarForGrammarParser.REGEXP, 0); }
		public RegexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterRegexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitRegexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitRegexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexpContext regexp() throws RecognitionException {
		RegexpContext _localctx = new RegexpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_regexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(REGEXP);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25m\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2\3\2\3"+
		"\3\3\3\5\3(\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\65\n\6"+
		"\f\6\16\68\13\6\3\6\3\6\3\7\3\7\3\7\6\7?\n\7\r\7\16\7@\3\7\3\7\3\7\3\7"+
		"\5\7G\n\7\3\7\3\7\5\7K\n\7\3\b\3\b\5\bO\n\b\3\b\3\b\6\bS\n\b\r\b\16\b"+
		"T\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\2\3\3\2\23\24\2g\2\34\3\2\2\2\4\'\3\2\2\2\6)\3\2\2\2\b+\3\2\2\2\n-\3"+
		"\2\2\2\fJ\3\2\2\2\16R\3\2\2\2\20Y\3\2\2\2\22[\3\2\2\2\24]\3\2\2\2\26_"+
		"\3\2\2\2\30e\3\2\2\2\32j\3\2\2\2\34 \5\30\r\2\35\37\5\4\3\2\36\35\3\2"+
		"\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\b\2\1\2"+
		"$\3\3\2\2\2%(\5\n\6\2&(\5\26\f\2\'%\3\2\2\2\'&\3\2\2\2(\5\3\2\2\2)*\7"+
		"\4\2\2*\7\3\2\2\2+,\7\5\2\2,\t\3\2\2\2-.\5\24\13\2./\5\6\4\2/\60\5\b\5"+
		"\2\60\61\7\16\2\2\61\66\5\f\7\2\62\63\7\b\2\2\63\65\5\f\7\2\64\62\3\2"+
		"\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29"+
		":\7\17\2\2:\13\3\2\2\2;<\5\16\b\2<=\b\7\1\2=?\3\2\2\2>;\3\2\2\2?@\3\2"+
		"\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\b\7\1\2CK\3\2\2\2DF\5\20\t\2EG\5"+
		"\22\n\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\b\7\1\2IK\3\2\2\2J>\3\2\2\2JD"+
		"\3\2\2\2K\r\3\2\2\2LN\5\24\13\2MO\5\6\4\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2"+
		"\2PQ\b\b\1\2QS\3\2\2\2RL\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2"+
		"\2VW\5\22\n\2WX\b\b\1\2X\17\3\2\2\2YZ\7\t\2\2Z\21\3\2\2\2[\\\7\6\2\2\\"+
		"\23\3\2\2\2]^\t\2\2\2^\25\3\2\2\2_`\5\24\13\2`a\7\16\2\2ab\5\32\16\2b"+
		"c\7\17\2\2cd\b\f\1\2d\27\3\2\2\2ef\7\22\2\2fg\5\24\13\2gh\7\7\2\2hi\b"+
		"\r\1\2i\31\3\2\2\2jk\7\3\2\2k\33\3\2\2\2\n \'\66@FJNT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}