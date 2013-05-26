// Generated from L1.g4 by ANTLR 4.0
package jack.l1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class L1Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, RETURN=2, TRUE=3, FALSE=4, THEN=5, SIGN=6, NL=7, COMA=8, ADD=9, 
		SUB=10, MUL=11, DIV=12, ASSIGN=13, AND=14, OR=15, G=16, GE=17, L=18, LE=19, 
		EQ=20, NEQ=21, LB=22, RB=23, LP=24, RP=25, LR=26, RR=27, DEMA=28, IF=29, 
		ELSE=30, FUN_DEF=31, ID=32, NUMBER=33, STRING=34, WS=35;
	public static final String[] tokenNames = {
		"<INVALID>", "'print'", "'return'", "'true'", "'false'", "'then'", "'!'", 
		"NL", "','", "'+'", "'-'", "'*'", "'/'", "'='", "'&&'", "'||'", "'>'", 
		"'>='", "'<'", "'<='", "'=='", "'!='", "'('", "')'", "'['", "']'", "'{'", 
		"'}'", "';'", "'if'", "'else'", "'defun'", "ID", "NUMBER", "STRING", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat1e = 1, RULE_parameters = 2, RULE_b = 3, RULE_stat = 4, 
		RULE_elist = 5, RULE_e = 6;
	public static final String[] ruleNames = {
		"prog", "stat1e", "parameters", "b", "stat", "elist", "e"
	};

	@Override
	public String getGrammarFileName() { return "L1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public L1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LprogContext extends ProgContext {
		public List<TerminalNode> NL() { return getTokens(L1Parser.NL); }
		public TerminalNode EOF() { return getToken(L1Parser.EOF, 0); }
		public List<Stat1eContext> stat1e() {
			return getRuleContexts(Stat1eContext.class);
		}
		public Stat1eContext stat1e(int i) {
			return getRuleContext(Stat1eContext.class,i);
		}
		public TerminalNode NL(int i) {
			return getToken(L1Parser.NL, i);
		}
		public LprogContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLprog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new LprogContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << RETURN) | (1L << TRUE) | (1L << FALSE) | (1L << SIGN) | (1L << NL) | (1L << SUB) | (1L << LB) | (1L << LP) | (1L << IF) | (1L << FUN_DEF) | (1L << ID) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(24);
				switch (_input.LA(1)) {
				case PRINT:
				case RETURN:
				case TRUE:
				case FALSE:
				case SIGN:
				case SUB:
				case LB:
				case LP:
				case IF:
				case FUN_DEF:
				case ID:
				case NUMBER:
				case STRING:
					{
					setState(14); stat1e();
					setState(21);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(16);
						_la = _input.LA(1);
						if (_la==DEMA) {
							{
							setState(15); match(DEMA);
							}
						}

						}
						break;

					case 2:
						{
						setState(19);
						switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
						case 1:
							{
							setState(18); match(NL);
							}
							break;
						}
						}
						break;
					}
					}
					break;
				case NL:
					{
					setState(23); match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stat1eContext extends ParserRuleContext {
		public Stat1eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat1e; }
	 
		public Stat1eContext() { }
		public void copyFrom(Stat1eContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LexprContext extends Stat1eContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public LexprContext(Stat1eContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LstatContext extends Stat1eContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public LstatContext(Stat1eContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLstat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LfunctionContext extends Stat1eContext {
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public TerminalNode ID() { return getToken(L1Parser.ID, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode FUN_DEF() { return getToken(L1Parser.FUN_DEF, 0); }
		public LfunctionContext(Stat1eContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat1eContext stat1e() throws RecognitionException {
		Stat1eContext _localctx = new Stat1eContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat1e);
		int _la;
		try {
			setState(41);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new LexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31); e(0);
				}
				break;

			case 2:
				_localctx = new LstatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32); stat();
				}
				break;

			case 3:
				_localctx = new LfunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(33); match(FUN_DEF);
				setState(34); match(ID);
				setState(35); match(LB);
				setState(37);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(36); parameters();
					}
				}

				setState(39); match(RB);
				setState(40); b();
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

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode ID(int i) {
			return getToken(L1Parser.ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(L1Parser.ID); }
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(ID);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(44); match(COMA);
				setState(45); match(ID);
				}
				}
				setState(50);
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

	public static class BContext extends ParserRuleContext {
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
	 
		public BContext() { }
		public void copyFrom(BContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LblockContext extends BContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<BContext> b() {
			return getRuleContexts(BContext.class);
		}
		public List<TerminalNode> NL() { return getTokens(L1Parser.NL); }
		public BContext b(int i) {
			return getRuleContext(BContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public TerminalNode NL(int i) {
			return getToken(L1Parser.NL, i);
		}
		public LblockContext(BContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_b);
		int _la;
		try {
			_localctx = new LblockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(51); match(LR);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << RETURN) | (1L << TRUE) | (1L << FALSE) | (1L << SIGN) | (1L << NL) | (1L << SUB) | (1L << LB) | (1L << LP) | (1L << LR) | (1L << IF) | (1L << ID) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(55);
				switch (_input.LA(1)) {
				case NL:
					{
					setState(52); match(NL);
					}
					break;
				case LR:
					{
					setState(53); b();
					}
					break;
				case PRINT:
				case RETURN:
				case TRUE:
				case FALSE:
				case SIGN:
				case SUB:
				case LB:
				case LP:
				case IF:
				case ID:
				case NUMBER:
				case STRING:
					{
					setState(54); stat();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60); match(RR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LreturnContext extends StatContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public LreturnContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLreturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LdemaexprContext extends StatContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public LdemaexprContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLdemaexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LprintContext extends StatContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public LprintContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLprint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LassignstatContext extends StatContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public LassignstatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLassignstat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LifstatContext extends StatContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public List<BContext> b() {
			return getRuleContexts(BContext.class);
		}
		public BContext b(int i) {
			return getRuleContext(BContext.class,i);
		}
		public LifstatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLifstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stat);
		int _la;
		try {
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new LifstatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62); match(IF);
				setState(63); e(0);
				setState(64); match(THEN);
				setState(65); b();
				setState(68);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(66); match(ELSE);
					setState(67); b();
					}
				}

				}
				break;

			case 2:
				_localctx = new LassignstatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70); e(0);
				setState(71); match(ASSIGN);
				setState(72); e(0);
				setState(73); match(DEMA);
				}
				break;

			case 3:
				_localctx = new LdemaexprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(75); e(0);
				setState(76); match(DEMA);
				}
				break;

			case 4:
				_localctx = new LreturnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(78); match(RETURN);
				setState(79); e(0);
				setState(80); match(DEMA);
				}
				break;

			case 5:
				_localctx = new LprintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(82); match(PRINT);
				setState(83); e(0);
				setState(84); match(DEMA);
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

	public static class ElistContext extends ParserRuleContext {
		public ElistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elist; }
	 
		public ElistContext() { }
		public void copyFrom(ElistContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LparamsvalueContext extends ElistContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public LparamsvalueContext(ElistContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLparamsvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElistContext elist() throws RecognitionException {
		ElistContext _localctx = new ElistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elist);
		int _la;
		try {
			_localctx = new LparamsvalueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(88); e(0);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(89); match(COMA);
				setState(90); e(0);
				}
				}
				setState(95);
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

	public static class EContext extends ParserRuleContext {
		public int _p;
		public EContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_e; }
	 
		public EContext() { }
		public void copyFrom(EContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class LcomaContext extends EContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public LcomaContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLcoma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LorContext extends EContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public LorContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LnumberContext extends EContext {
		public TerminalNode NUMBER() { return getToken(L1Parser.NUMBER, 0); }
		public LnumberContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLnumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LandContext extends EContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public LandContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LsubAddContext extends EContext {
		public Token op;
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public LsubAddContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLsubAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LnegativeContext extends EContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public LnegativeContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLnegative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LarrayvisitContext extends EContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public LarrayvisitContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLarrayvisit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LidContext extends EContext {
		public TerminalNode ID() { return getToken(L1Parser.ID, 0); }
		public LidContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LmuldivContext extends EContext {
		public Token op;
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public LmuldivContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLmuldiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LbooleannagativeContext extends EContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public LbooleannagativeContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLbooleannagative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtrueContext extends EContext {
		public TerminalNode TRUE() { return getToken(L1Parser.TRUE, 0); }
		public LtrueContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLtrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LfalseContext extends EContext {
		public TerminalNode FALSE() { return getToken(L1Parser.FALSE, 0); }
		public LfalseContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLfalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LconditionContext extends EContext {
		public Token op;
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public LconditionContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLcondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LarraydefContext extends EContext {
		public ElistContext elist() {
			return getRuleContext(ElistContext.class,0);
		}
		public LarraydefContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLarraydef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LstringContext extends EContext {
		public TerminalNode STRING() { return getToken(L1Parser.STRING, 0); }
		public LstringContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LcallfunContext extends EContext {
		public TerminalNode ID() { return getToken(L1Parser.ID, 0); }
		public ElistContext elist() {
			return getRuleContext(ElistContext.class,0);
		}
		public LcallfunContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof L1Visitor ) return ((L1Visitor<? extends T>)visitor).visitLcallfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EContext _localctx = new EContext(_ctx, _parentState, _p);
		EContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, RULE_e);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new LbooleannagativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(97); match(SIGN);
				setState(98); e(8);
				}
				break;

			case 2:
				{
				_localctx = new LnegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(99); match(SUB);
				}
				setState(100); e(6);
				}
				break;

			case 3:
				{
				_localctx = new LtrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101); match(TRUE);
				}
				break;

			case 4:
				{
				_localctx = new LfalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102); match(FALSE);
				}
				break;

			case 5:
				{
				_localctx = new LnumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103); match(NUMBER);
				}
				break;

			case 6:
				{
				_localctx = new LstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104); match(STRING);
				}
				break;

			case 7:
				{
				_localctx = new LidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105); match(ID);
				}
				break;

			case 8:
				{
				_localctx = new LcallfunContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106); match(ID);
				setState(107); match(LB);
				setState(109);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << SIGN) | (1L << SUB) | (1L << LB) | (1L << LP) | (1L << ID) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(108); elist();
					}
				}

				setState(111); match(RB);
				}
				break;

			case 9:
				{
				_localctx = new LarraydefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112); match(LP);
				setState(113); elist();
				setState(114); match(RP);
				}
				break;

			case 10:
				{
				_localctx = new LcomaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116); match(LB);
				setState(117); e(0);
				setState(118); match(RB);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(142);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new LmuldivContext(new EContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(122);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(123);
						((LmuldivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((LmuldivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(124); e(8);
						}
						break;

					case 2:
						{
						_localctx = new LsubAddContext(new EContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(125);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(126);
						((LsubAddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((LsubAddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(127); e(6);
						}
						break;

					case 3:
						{
						_localctx = new LconditionContext(new EContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(128);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(129);
						((LconditionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << G) | (1L << GE) | (1L << L) | (1L << LE) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
							((LconditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(130); e(5);
						}
						break;

					case 4:
						{
						_localctx = new LandContext(new EContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(131);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(132); match(AND);
						setState(133); e(4);
						}
						break;

					case 5:
						{
						_localctx = new LorContext(new EContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(134);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(135); match(OR);
						setState(136); e(3);
						}
						break;

					case 6:
						{
						_localctx = new LarrayvisitContext(new EContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(137);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(138); match(LP);
						setState(139); e(0);
						setState(140); match(RP);
						}
						break;
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6: return e_sempred((EContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 7 >= _localctx._p;

		case 1: return 5 >= _localctx._p;

		case 2: return 4 >= _localctx._p;

		case 3: return 3 >= _localctx._p;

		case 4: return 2 >= _localctx._p;

		case 5: return 9 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3%\u0096\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3"+
		"\2\3\2\5\2\23\n\2\3\2\5\2\26\n\2\5\2\30\n\2\3\2\7\2\33\n\2\f\2\16\2\36"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3(\n\3\3\3\3\3\5\3,\n\3\3\4\3"+
		"\4\3\4\7\4\61\n\4\f\4\16\4\64\13\4\3\5\3\5\3\5\3\5\7\5:\n\5\f\5\16\5="+
		"\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6G\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6Y\n\6\3\7\3\7\3\7\7\7^\n\7"+
		"\f\7\16\7a\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bp\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b{\n\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0091"+
		"\n\b\f\b\16\b\u0094\13\b\3\b\2\t\2\4\6\b\n\f\16\2\5\3\r\16\3\13\f\3\22"+
		"\27\u00b0\2\34\3\2\2\2\4+\3\2\2\2\6-\3\2\2\2\b\65\3\2\2\2\nX\3\2\2\2\f"+
		"Z\3\2\2\2\16z\3\2\2\2\20\27\5\4\3\2\21\23\7\36\2\2\22\21\3\2\2\2\22\23"+
		"\3\2\2\2\23\30\3\2\2\2\24\26\7\t\2\2\25\24\3\2\2\2\25\26\3\2\2\2\26\30"+
		"\3\2\2\2\27\22\3\2\2\2\27\25\3\2\2\2\30\33\3\2\2\2\31\33\7\t\2\2\32\20"+
		"\3\2\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37"+
		"\3\2\2\2\36\34\3\2\2\2\37 \7\1\2\2 \3\3\2\2\2!,\5\16\b\2\",\5\n\6\2#$"+
		"\7!\2\2$%\7\"\2\2%\'\7\30\2\2&(\5\6\4\2\'&\3\2\2\2\'(\3\2\2\2()\3\2\2"+
		"\2)*\7\31\2\2*,\5\b\5\2+!\3\2\2\2+\"\3\2\2\2+#\3\2\2\2,\5\3\2\2\2-\62"+
		"\7\"\2\2./\7\n\2\2/\61\7\"\2\2\60.\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2"+
		"\62\63\3\2\2\2\63\7\3\2\2\2\64\62\3\2\2\2\65;\7\34\2\2\66:\7\t\2\2\67"+
		":\5\b\5\28:\5\n\6\29\66\3\2\2\29\67\3\2\2\298\3\2\2\2:=\3\2\2\2;9\3\2"+
		"\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\35\2\2?\t\3\2\2\2@A\7\37\2\2AB"+
		"\5\16\b\2BC\7\7\2\2CF\5\b\5\2DE\7 \2\2EG\5\b\5\2FD\3\2\2\2FG\3\2\2\2G"+
		"Y\3\2\2\2HI\5\16\b\2IJ\7\17\2\2JK\5\16\b\2KL\7\36\2\2LY\3\2\2\2MN\5\16"+
		"\b\2NO\7\36\2\2OY\3\2\2\2PQ\7\4\2\2QR\5\16\b\2RS\7\36\2\2SY\3\2\2\2TU"+
		"\7\3\2\2UV\5\16\b\2VW\7\36\2\2WY\3\2\2\2X@\3\2\2\2XH\3\2\2\2XM\3\2\2\2"+
		"XP\3\2\2\2XT\3\2\2\2Y\13\3\2\2\2Z_\5\16\b\2[\\\7\n\2\2\\^\5\16\b\2][\3"+
		"\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\r\3\2\2\2a_\3\2\2\2bc\b\b\1\2cd"+
		"\7\b\2\2d{\5\16\b\2ef\7\f\2\2f{\5\16\b\2g{\7\5\2\2h{\7\6\2\2i{\7#\2\2"+
		"j{\7$\2\2k{\7\"\2\2lm\7\"\2\2mo\7\30\2\2np\5\f\7\2on\3\2\2\2op\3\2\2\2"+
		"pq\3\2\2\2q{\7\31\2\2rs\7\32\2\2st\5\f\7\2tu\7\33\2\2u{\3\2\2\2vw\7\30"+
		"\2\2wx\5\16\b\2xy\7\31\2\2y{\3\2\2\2zb\3\2\2\2ze\3\2\2\2zg\3\2\2\2zh\3"+
		"\2\2\2zi\3\2\2\2zj\3\2\2\2zk\3\2\2\2zl\3\2\2\2zr\3\2\2\2zv\3\2\2\2{\u0092"+
		"\3\2\2\2|}\6\b\2\3}~\t\2\2\2~\u0091\5\16\b\2\177\u0080\6\b\3\3\u0080\u0081"+
		"\t\3\2\2\u0081\u0091\5\16\b\2\u0082\u0083\6\b\4\3\u0083\u0084\t\4\2\2"+
		"\u0084\u0091\5\16\b\2\u0085\u0086\6\b\5\3\u0086\u0087\7\20\2\2\u0087\u0091"+
		"\5\16\b\2\u0088\u0089\6\b\6\3\u0089\u008a\7\21\2\2\u008a\u0091\5\16\b"+
		"\2\u008b\u008c\6\b\7\3\u008c\u008d\7\32\2\2\u008d\u008e\5\16\b\2\u008e"+
		"\u008f\7\33\2\2\u008f\u0091\3\2\2\2\u0090|\3\2\2\2\u0090\177\3\2\2\2\u0090"+
		"\u0082\3\2\2\2\u0090\u0085\3\2\2\2\u0090\u0088\3\2\2\2\u0090\u008b\3\2"+
		"\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\17\3\2\2\2\u0094\u0092\3\2\2\2\23\22\25\27\32\34\'+\629;FX_oz\u0090\u0092";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}