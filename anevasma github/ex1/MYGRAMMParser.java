// Generated from MYGRAMM.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MYGRAMMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, DECLARE=2, INTEGER=3, REAL=4, COMMA=5, SEMICOLON=6, L_PAR=7, 
		R_PAR=8, PLUS=9, MINUS=10, STAR=11, SLASH=12, ASSIGN=13, NULL=14, LETTER=15, 
		NUMBER=16, INPUT=17, PRINT=18, ENDDECLARE=19, ENDPROGRAM=20, WS=21, NEWLINE=22;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_varlist = 2, RULE_statements = 3, 
		RULE_statement = 4, RULE_input_tail = 5, RULE_print_tail = 6, RULE_assign_tail = 7, 
		RULE_expression = 8, RULE_sign = 9, RULE_term = 10, RULE_factor = 11, 
		RULE_numerical_constant = 12, RULE_variable = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declarations", "varlist", "statements", "statement", "input_tail", 
			"print_tail", "assign_tail", "expression", "sign", "term", "factor", 
			"numerical_constant", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'declare'", "'integer'", "'real'", "','", "';'", 
			"'('", "')'", "'+'", "'-'", "'*'", "'/'", "':='", "' '", null, null, 
			"'input'", "'print'", "'enddeclare'", "'endprogram'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "DECLARE", "INTEGER", "REAL", "COMMA", "SEMICOLON", 
			"L_PAR", "R_PAR", "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "NULL", 
			"LETTER", "NUMBER", "INPUT", "PRINT", "ENDDECLARE", "ENDPROGRAM", "WS", 
			"NEWLINE"
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
	public String getGrammarFileName() { return "MYGRAMM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MYGRAMMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(MYGRAMMParser.PROGRAM, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ENDPROGRAM() { return getToken(MYGRAMMParser.ENDPROGRAM, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(PROGRAM);
			setState(29);
			declarations();
			setState(30);
			statements();
			setState(31);
			match(ENDPROGRAM);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public List<TerminalNode> DECLARE() { return getTokens(MYGRAMMParser.DECLARE); }
		public TerminalNode DECLARE(int i) {
			return getToken(MYGRAMMParser.DECLARE, i);
		}
		public List<VarlistContext> varlist() {
			return getRuleContexts(VarlistContext.class);
		}
		public VarlistContext varlist(int i) {
			return getRuleContext(VarlistContext.class,i);
		}
		public List<TerminalNode> ENDDECLARE() { return getTokens(MYGRAMMParser.ENDDECLARE); }
		public TerminalNode ENDDECLARE(int i) {
			return getToken(MYGRAMMParser.ENDDECLARE, i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DECLARE) {
				{
				{
				setState(33);
				match(DECLARE);
				setState(34);
				varlist();
				setState(35);
				match(ENDDECLARE);
				}
				}
				setState(41);
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

	public static class VarlistContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MYGRAMMParser.INTEGER, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MYGRAMMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MYGRAMMParser.COMMA, i);
		}
		public TerminalNode REAL() { return getToken(MYGRAMMParser.REAL, 0); }
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).exitVarlist(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varlist);
		int _la;
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(INTEGER);
				setState(43);
				variable();
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(44);
					match(COMMA);
					setState(45);
					variable();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(REAL);
				setState(52);
				variable();
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(53);
					match(COMMA);
					setState(54);
					variable();
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MYGRAMMParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MYGRAMMParser.SEMICOLON, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			statement();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(63);
				match(SEMICOLON);
				setState(64);
				statement();
				}
				}
				setState(69);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(MYGRAMMParser.INPUT, 0); }
		public Input_tailContext input_tail() {
			return getRuleContext(Input_tailContext.class,0);
		}
		public TerminalNode PRINT() { return getToken(MYGRAMMParser.PRINT, 0); }
		public Print_tailContext print_tail() {
			return getRuleContext(Print_tailContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Assign_tailContext assign_tail() {
			return getRuleContext(Assign_tailContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(INPUT);
				setState(71);
				input_tail();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(PRINT);
				setState(73);
				print_tail();
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				variable();
				setState(75);
				assign_tail();
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

	public static class Input_tailContext extends ParserRuleContext {
		public TerminalNode L_PAR() { return getToken(MYGRAMMParser.L_PAR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode R_PAR() { return getToken(MYGRAMMParser.R_PAR, 0); }
		public Input_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).enterInput_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).exitInput_tail(this);
		}
	}

	public final Input_tailContext input_tail() throws RecognitionException {
		Input_tailContext _localctx = new Input_tailContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_input_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(L_PAR);
			setState(80);
			variable();
			setState(81);
			match(R_PAR);
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

	public static class Print_tailContext extends ParserRuleContext {
		public TerminalNode L_PAR() { return getToken(MYGRAMMParser.L_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAR() { return getToken(MYGRAMMParser.R_PAR, 0); }
		public Print_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).enterPrint_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).exitPrint_tail(this);
		}
	}

	public final Print_tailContext print_tail() throws RecognitionException {
		Print_tailContext _localctx = new Print_tailContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(L_PAR);
			setState(84);
			expression();
			setState(85);
			match(R_PAR);
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

	public static class Assign_tailContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(MYGRAMMParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assign_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).enterAssign_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).exitAssign_tail(this);
		}
	}

	public final Assign_tailContext assign_tail() throws RecognitionException {
		Assign_tailContext _localctx = new Assign_tailContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(ASSIGN);
			setState(88);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(MYGRAMMParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MYGRAMMParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(MYGRAMMParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(MYGRAMMParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			sign();
			setState(91);
			term();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(96);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(92);
					match(PLUS);
					setState(93);
					term();
					}
					break;
				case MINUS:
					{
					setState(94);
					match(MINUS);
					setState(95);
					term();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(100);
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MYGRAMMParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MYGRAMMParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sign);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(MINUS);
				}
				break;
			case L_PAR:
			case LETTER:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(MYGRAMMParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(MYGRAMMParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(MYGRAMMParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(MYGRAMMParser.SLASH, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			factor();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR || _la==SLASH) {
				{
				setState(111);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(107);
					match(STAR);
					setState(108);
					factor();
					}
					break;
				case SLASH:
					{
					setState(109);
					match(SLASH);
					setState(110);
					factor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(115);
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

	public static class FactorContext extends ParserRuleContext {
		public Numerical_constantContext numerical_constant() {
			return getRuleContext(Numerical_constantContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode L_PAR() { return getToken(MYGRAMMParser.L_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAR() { return getToken(MYGRAMMParser.R_PAR, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_factor);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				numerical_constant();
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				variable();
				}
				break;
			case L_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(L_PAR);
				setState(119);
				expression();
				setState(120);
				match(R_PAR);
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

	public static class Numerical_constantContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MYGRAMMParser.NUMBER, 0); }
		public Numerical_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerical_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).enterNumerical_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).exitNumerical_constant(this);
		}
	}

	public final Numerical_constantContext numerical_constant() throws RecognitionException {
		Numerical_constantContext _localctx = new Numerical_constantContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_numerical_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(NUMBER);
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

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(MYGRAMMParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(MYGRAMMParser.LETTER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(MYGRAMMParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MYGRAMMParser.NUMBER, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYGRAMMListener ) ((MYGRAMMListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable);
		int _la;
		try {
			int _alt;
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(126);
						match(LETTER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(129); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LETTER) {
					{
					{
					setState(131);
					match(LETTER);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(137);
					match(LETTER);
					}
					}
					setState(140); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LETTER );
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUMBER) {
					{
					{
					setState(142);
					match(NUMBER);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u0099\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\4\3\4\3\4\3\4\7\4\61\n\4\f\4\16\4\64"+
		"\13\4\3\4\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\5\4?\n\4\3\5\3\5\3\5\7\5"+
		"D\n\5\f\5\16\5G\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6P\n\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\nc\n\n\f\n"+
		"\16\nf\13\n\3\13\3\13\3\13\5\13k\n\13\3\f\3\f\3\f\3\f\3\f\7\fr\n\f\f\f"+
		"\16\fu\13\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r}\n\r\3\16\3\16\3\17\6\17\u0082"+
		"\n\17\r\17\16\17\u0083\3\17\7\17\u0087\n\17\f\17\16\17\u008a\13\17\3\17"+
		"\6\17\u008d\n\17\r\17\16\17\u008e\3\17\7\17\u0092\n\17\f\17\16\17\u0095"+
		"\13\17\5\17\u0097\n\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\2\2\2\u009e\2\36\3\2\2\2\4)\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nO\3\2\2\2"+
		"\fQ\3\2\2\2\16U\3\2\2\2\20Y\3\2\2\2\22\\\3\2\2\2\24j\3\2\2\2\26l\3\2\2"+
		"\2\30|\3\2\2\2\32~\3\2\2\2\34\u0096\3\2\2\2\36\37\7\3\2\2\37 \5\4\3\2"+
		" !\5\b\5\2!\"\7\26\2\2\"\3\3\2\2\2#$\7\4\2\2$%\5\6\4\2%&\7\25\2\2&(\3"+
		"\2\2\2\'#\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\5\3\2\2\2+)\3\2\2\2"+
		",-\7\5\2\2-\62\5\34\17\2./\7\7\2\2/\61\5\34\17\2\60.\3\2\2\2\61\64\3\2"+
		"\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63?\3\2\2\2\64\62\3\2\2\2\65\66\7\6\2"+
		"\2\66;\5\34\17\2\678\7\7\2\28:\5\34\17\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2"+
		"\2;<\3\2\2\2<?\3\2\2\2=;\3\2\2\2>,\3\2\2\2>\65\3\2\2\2?\7\3\2\2\2@E\5"+
		"\n\6\2AB\7\b\2\2BD\5\n\6\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\t"+
		"\3\2\2\2GE\3\2\2\2HI\7\23\2\2IP\5\f\7\2JK\7\24\2\2KP\5\16\b\2LM\5\34\17"+
		"\2MN\5\20\t\2NP\3\2\2\2OH\3\2\2\2OJ\3\2\2\2OL\3\2\2\2P\13\3\2\2\2QR\7"+
		"\t\2\2RS\5\34\17\2ST\7\n\2\2T\r\3\2\2\2UV\7\t\2\2VW\5\22\n\2WX\7\n\2\2"+
		"X\17\3\2\2\2YZ\7\17\2\2Z[\5\22\n\2[\21\3\2\2\2\\]\5\24\13\2]d\5\26\f\2"+
		"^_\7\13\2\2_c\5\26\f\2`a\7\f\2\2ac\5\26\f\2b^\3\2\2\2b`\3\2\2\2cf\3\2"+
		"\2\2db\3\2\2\2de\3\2\2\2e\23\3\2\2\2fd\3\2\2\2gk\7\13\2\2hk\7\f\2\2ik"+
		"\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\25\3\2\2\2ls\5\30\r\2mn\7\r\2"+
		"\2nr\5\30\r\2op\7\16\2\2pr\5\30\r\2qm\3\2\2\2qo\3\2\2\2ru\3\2\2\2sq\3"+
		"\2\2\2st\3\2\2\2t\27\3\2\2\2us\3\2\2\2v}\5\32\16\2w}\5\34\17\2xy\7\t\2"+
		"\2yz\5\22\n\2z{\7\n\2\2{}\3\2\2\2|v\3\2\2\2|w\3\2\2\2|x\3\2\2\2}\31\3"+
		"\2\2\2~\177\7\22\2\2\177\33\3\2\2\2\u0080\u0082\7\21\2\2\u0081\u0080\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0088\3\2\2\2\u0085\u0087\7\21\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0097\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008d\7\21\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3"+
		"\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0093\3\2\2\2\u0090"+
		"\u0092\7\22\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3"+
		"\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0081\3\2\2\2\u0096\u008c\3\2\2\2\u0097\35\3\2\2\2\23)\62;>EObdjqs|\u0083"+
		"\u0088\u008e\u0093\u0096";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}