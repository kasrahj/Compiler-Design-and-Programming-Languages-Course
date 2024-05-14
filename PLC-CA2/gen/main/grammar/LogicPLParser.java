// Generated from C:/Users/ASUS/Desktop/CA2/CA2V8/src/main/grammar\LogicPL.g4 by ANTLR 4.12.0
package main.grammar;

import ast.node.*;
import ast.node.expression.*;
import ast.node.statement.*;
import ast.node.declaration.*;
import ast.node.expression.values.*;
import ast.node.expression.operators.*;
import ast.type.primitiveType.*;
import ast.type.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LogicPLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION=1, BOOLEAN=2, INT=3, FLOAT=4, MAIN=5, PRINT=6, RETURN=7, FOR=8, 
		TRUE=9, FALSE=10, LPAR=11, RPAR=12, COLON=13, COMMA=14, LBRACE=15, RBRACE=16, 
		SEMICOLON=17, ASSIGN=18, LBRACKET=19, RBRACKET=20, QUARYMARK=21, ARROW=22, 
		OR=23, AND=24, EQ=25, GT=26, LT=27, GTE=28, LTE=29, PLUS=30, MINUS=31, 
		MULT=32, DIV=33, MOD=34, NEQ=35, NOT=36, WS=37, COMMENT=38, IDENTIFIER=39, 
		PREDICATE_IDENTIFIER=40, INT_NUMBER=41, FLOAT_NUMBER=42;
	public static final int
		RULE_program = 0, RULE_functionDec = 1, RULE_functionVarDec = 2, RULE_mainBlock = 3, 
		RULE_statement = 4, RULE_assignSmt = 5, RULE_variable = 6, RULE_localVarDeclaration = 7, 
		RULE_varDeclaration = 8, RULE_arrayDeclaration = 9, RULE_arrayInitialValue = 10, 
		RULE_arrayList = 11, RULE_printSmt = 12, RULE_printExpr = 13, RULE_query = 14, 
		RULE_queryType1 = 15, RULE_queryType2 = 16, RULE_returnSmt = 17, RULE_forLoop = 18, 
		RULE_predicate = 19, RULE_implication = 20, RULE_expression = 21, RULE_expression2 = 22, 
		RULE_andExpr = 23, RULE_andExpr2 = 24, RULE_eqExpr = 25, RULE_eqExpr2 = 26, 
		RULE_compExpr = 27, RULE_compExpr2 = 28, RULE_additive = 29, RULE_additive2 = 30, 
		RULE_multicative = 31, RULE_multicative2 = 32, RULE_unary = 33, RULE_other = 34, 
		RULE_functionCall = 35, RULE_value = 36, RULE_numericValue = 37, RULE_identifier = 38, 
		RULE_predicateIdentifier = 39, RULE_type = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "functionDec", "functionVarDec", "mainBlock", "statement", 
			"assignSmt", "variable", "localVarDeclaration", "varDeclaration", "arrayDeclaration", 
			"arrayInitialValue", "arrayList", "printSmt", "printExpr", "query", "queryType1", 
			"queryType2", "returnSmt", "forLoop", "predicate", "implication", "expression", 
			"expression2", "andExpr", "andExpr2", "eqExpr", "eqExpr2", "compExpr", 
			"compExpr2", "additive", "additive2", "multicative", "multicative2", 
			"unary", "other", "functionCall", "value", "numericValue", "identifier", 
			"predicateIdentifier", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "'boolean'", "'int'", "'float'", "'main'", "'print'", 
			"'return'", "'for'", "'true'", "'false'", "'('", "')'", "':'", "','", 
			"'{'", "'}'", "';'", "'='", "'['", "']'", "'?'", "'=>'", "'||'", "'&&'", 
			"'=='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'!='", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNCTION", "BOOLEAN", "INT", "FLOAT", "MAIN", "PRINT", "RETURN", 
			"FOR", "TRUE", "FALSE", "LPAR", "RPAR", "COLON", "COMMA", "LBRACE", "RBRACE", 
			"SEMICOLON", "ASSIGN", "LBRACKET", "RBRACKET", "QUARYMARK", "ARROW", 
			"OR", "AND", "EQ", "GT", "LT", "GTE", "LTE", "PLUS", "MINUS", "MULT", 
			"DIV", "MOD", "NEQ", "NOT", "WS", "COMMENT", "IDENTIFIER", "PREDICATE_IDENTIFIER", 
			"INT_NUMBER", "FLOAT_NUMBER"
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
	public String getGrammarFileName() { return "LogicPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogicPLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program p;
		public FunctionDecContext f;
		public MainBlockContext main;
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public List<FunctionDecContext> functionDec() {
			return getRuleContexts(FunctionDecContext.class);
		}
		public FunctionDecContext functionDec(int i) {
			return getRuleContext(FunctionDecContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ProgramContext)_localctx).p =  new Program(); _localctx.p.setLine(0);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(83);
				((ProgramContext)_localctx).f = functionDec();
				_localctx.p.addFunc(((ProgramContext)_localctx).f.functionDeclaration);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			((ProgramContext)_localctx).main = mainBlock();
			_localctx.p.setMain(((ProgramContext)_localctx).main.main) ;
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDecContext extends ParserRuleContext {
		public FuncDeclaration functionDeclaration;
		public IdentifierContext name;
		public FunctionVarDecContext arg1;
		public FunctionVarDecContext arg;
		public TypeContext returnType;
		public StatementContext stmt;
		public TerminalNode FUNCTION() { return getToken(LogicPLParser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(LogicPLParser.COLON, 0); }
		public TerminalNode LBRACE() { return getToken(LogicPLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LogicPLParser.RBRACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<FunctionVarDecContext> functionVarDec() {
			return getRuleContexts(FunctionVarDecContext.class);
		}
		public FunctionVarDecContext functionVarDec(int i) {
			return getRuleContext(FunctionVarDecContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogicPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogicPLParser.COMMA, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFunctionDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFunctionDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFunctionDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDecContext functionDec() throws RecognitionException {
		FunctionDecContext _localctx = new FunctionDecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<ArgDeclaration> args = new ArrayList<>();
			     ArrayList<Statement> statements = new ArrayList<>();
			setState(95);
			match(FUNCTION);
			setState(96);
			((FunctionDecContext)_localctx).name = identifier();
			setState(97);
			match(LPAR);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) {
				{
				setState(98);
				((FunctionDecContext)_localctx).arg1 = functionVarDec();
				args.add(((FunctionDecContext)_localctx).arg1.argDeclaration);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(100);
					match(COMMA);
					setState(101);
					((FunctionDecContext)_localctx).arg = functionVarDec();
					args.add(((FunctionDecContext)_localctx).arg.argDeclaration);
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(111);
			match(RPAR);
			setState(112);
			match(COLON);
			setState(113);
			((FunctionDecContext)_localctx).returnType = type();
			setState(114);
			match(LBRACE);
			{
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				((FunctionDecContext)_localctx).stmt = statement();
				statements.add(((FunctionDecContext)_localctx).stmt.statementRet);
				}
				}
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1649267444188L) != 0) );
			}
			setState(122);
			match(RBRACE);
			((FunctionDecContext)_localctx).functionDeclaration =  new FuncDeclaration(((FunctionDecContext)_localctx).name.id, ((FunctionDecContext)_localctx).returnType.typeRet, args, statements); _localctx.functionDeclaration.setLine(((FunctionDecContext)_localctx).name.id.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionVarDecContext extends ParserRuleContext {
		public ArgDeclaration argDeclaration;
		public TypeContext t;
		public IdentifierContext arg_iden;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionVarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionVarDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFunctionVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFunctionVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFunctionVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionVarDecContext functionVarDec() throws RecognitionException {
		FunctionVarDecContext _localctx = new FunctionVarDecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionVarDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((FunctionVarDecContext)_localctx).t = type();
			setState(126);
			((FunctionVarDecContext)_localctx).arg_iden = identifier();
			((FunctionVarDecContext)_localctx).argDeclaration =  new ArgDeclaration(((FunctionVarDecContext)_localctx).arg_iden.id, ((FunctionVarDecContext)_localctx).t.typeRet); _localctx.argDeclaration.setLine(((FunctionVarDecContext)_localctx).arg_iden.id.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainBlockContext extends ParserRuleContext {
		public MainDeclaration main;
		public Token m;
		public StatementContext s;
		public TerminalNode LBRACE() { return getToken(LogicPLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LogicPLParser.RBRACE, 0); }
		public TerminalNode MAIN() { return getToken(LogicPLParser.MAIN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterMainBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitMainBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitMainBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Statement> mainStmts = new ArrayList<>();
			setState(130);
			((MainBlockContext)_localctx).m = match(MAIN);
			setState(131);
			match(LBRACE);
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				((MainBlockContext)_localctx).s = statement();
				mainStmts.add(((MainBlockContext)_localctx).s.statementRet);
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1649267444188L) != 0) );
			setState(139);
			match(RBRACE);
			((MainBlockContext)_localctx).main =  new MainDeclaration(mainStmts); _localctx.main.setLine(((MainBlockContext)_localctx).m.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Statement statementRet;
		public AssignSmtContext assignSmt;
		public PredicateContext predicate;
		public ImplicationContext implication;
		public ReturnSmtContext returnSmt;
		public PrintSmtContext printSmt;
		public ForLoopContext forLoop;
		public LocalVarDeclarationContext localVarDeclaration;
		public AssignSmtContext assignSmt() {
			return getRuleContext(AssignSmtContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public ImplicationContext implication() {
			return getRuleContext(ImplicationContext.class,0);
		}
		public ReturnSmtContext returnSmt() {
			return getRuleContext(ReturnSmtContext.class,0);
		}
		public PrintSmtContext printSmt() {
			return getRuleContext(PrintSmtContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public LocalVarDeclarationContext localVarDeclaration() {
			return getRuleContext(LocalVarDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				((StatementContext)_localctx).assignSmt = assignSmt();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).assignSmt.assignRet; 
				}
				break;
			case PREDICATE_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(145);
				((StatementContext)_localctx).predicate = predicate();
				setState(146);
				match(SEMICOLON);
				}
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).predicate.predicateRet; 
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				((StatementContext)_localctx).implication = implication();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).implication.implicationRet; 
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				((StatementContext)_localctx).returnSmt = returnSmt();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).returnSmt.returnRet; 
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				((StatementContext)_localctx).printSmt = printSmt();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).printSmt.printSmtRet; 
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				((StatementContext)_localctx).forLoop = forLoop();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).forLoop.forLoopRet; 
				}
				break;
			case BOOLEAN:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(162);
				((StatementContext)_localctx).localVarDeclaration = localVarDeclaration();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).localVarDeclaration.varDecRet; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignSmtContext extends ParserRuleContext {
		public AssignStmt assignRet;
		public VariableContext var;
		public Token a;
		public ExpressionContext ex;
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(LogicPLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignSmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignSmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAssignSmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAssignSmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAssignSmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignSmtContext assignSmt() throws RecognitionException {
		AssignSmtContext _localctx = new AssignSmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignSmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((AssignSmtContext)_localctx).var = variable();
			setState(168);
			((AssignSmtContext)_localctx).a = match(ASSIGN);
			setState(169);
			((AssignSmtContext)_localctx).ex = expression();
			setState(170);
			match(SEMICOLON);
			 ((AssignSmtContext)_localctx).assignRet =  new AssignStmt(((AssignSmtContext)_localctx).var.var, ((AssignSmtContext)_localctx).ex.expr); _localctx.assignRet.setLine(((AssignSmtContext)_localctx).a.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public Variable var;
		public IdentifierContext i;
		public ExpressionContext e;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(LogicPLParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(LogicPLParser.RBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				((VariableContext)_localctx).i = identifier();
				((VariableContext)_localctx).var =  new Identifier(((VariableContext)_localctx).i.id.getName()); _localctx.var.setLine(((VariableContext)_localctx).i.id.getLine()); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				((VariableContext)_localctx).i = identifier();
				setState(177);
				match(LBRACKET);
				setState(178);
				((VariableContext)_localctx).e = expression();
				setState(179);
				match(RBRACKET);
				((VariableContext)_localctx).var =  new ArrayAccess(((VariableContext)_localctx).i.id.getName(), ((VariableContext)_localctx).e.expr); _localctx.var.setLine(((VariableContext)_localctx).i.id.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVarDeclarationContext extends ParserRuleContext {
		public Statement varDecRet;
		public VarDeclarationContext var;
		public ArrayDeclarationContext arr;
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public LocalVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVarDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterLocalVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitLocalVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitLocalVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVarDeclarationContext localVarDeclaration() throws RecognitionException {
		LocalVarDeclarationContext _localctx = new LocalVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_localVarDeclaration);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				((LocalVarDeclarationContext)_localctx).var = varDeclaration();
				((LocalVarDeclarationContext)_localctx).varDecRet =  ((LocalVarDeclarationContext)_localctx).var.varDecRet; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				((LocalVarDeclarationContext)_localctx).arr = arrayDeclaration();
				((LocalVarDeclarationContext)_localctx).varDecRet =  ((LocalVarDeclarationContext)_localctx).arr.arrDecRet; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDecStmt varDecRet;
		public TypeContext t;
		public IdentifierContext i;
		public ExpressionContext e;
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(LogicPLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((VarDeclarationContext)_localctx).t = type();
			setState(193);
			((VarDeclarationContext)_localctx).i = identifier();
			((VarDeclarationContext)_localctx).varDecRet =  new VarDecStmt(((VarDeclarationContext)_localctx).i.id, ((VarDeclarationContext)_localctx).t.typeRet); _localctx.varDecRet.setLine(((VarDeclarationContext)_localctx).i.id.getLine());
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(195);
				match(ASSIGN);
				setState(196);
				((VarDeclarationContext)_localctx).e = expression();
				_localctx.varDecRet.setInitialExpression(((VarDeclarationContext)_localctx).e.expr);
				}
			}

			setState(201);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclarationContext extends ParserRuleContext {
		public ArrayDecStmt arrDecRet;
		public TypeContext t;
		public Token size;
		public IdentifierContext name;
		public ArrayInitialValueContext arrValues;
		public TerminalNode LBRACKET() { return getToken(LogicPLParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(LogicPLParser.RBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INT_NUMBER() { return getToken(LogicPLParser.INT_NUMBER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrayInitialValueContext arrayInitialValue() {
			return getRuleContext(ArrayInitialValueContext.class,0);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Expression> initialValues = new ArrayList<>();
			setState(204);
			((ArrayDeclarationContext)_localctx).t = type();
			setState(205);
			match(LBRACKET);
			setState(206);
			((ArrayDeclarationContext)_localctx).size = match(INT_NUMBER);
			setState(207);
			match(RBRACKET);
			setState(208);
			((ArrayDeclarationContext)_localctx).name = identifier();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(209);
				((ArrayDeclarationContext)_localctx).arrValues = arrayInitialValue();
				initialValues = ((ArrayDeclarationContext)_localctx).arrValues.initialValues;
				}
			}

			setState(214);
			match(SEMICOLON);
			((ArrayDeclarationContext)_localctx).arrDecRet =  new ArrayDecStmt(((ArrayDeclarationContext)_localctx).name.id, ((ArrayDeclarationContext)_localctx).t.typeRet, (((ArrayDeclarationContext)_localctx).size!=null?Integer.valueOf(((ArrayDeclarationContext)_localctx).size.getText()):0)); _localctx.arrDecRet.setInitialValues(initialValues); _localctx.arrDecRet.setLine(((ArrayDeclarationContext)_localctx).name.id.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitialValueContext extends ParserRuleContext {
		public ArrayList<Expression> initialValues;
		public ArrayListContext arrayList;
		public TerminalNode ASSIGN() { return getToken(LogicPLParser.ASSIGN, 0); }
		public ArrayListContext arrayList() {
			return getRuleContext(ArrayListContext.class,0);
		}
		public ArrayInitialValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitialValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArrayInitialValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArrayInitialValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArrayInitialValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitialValueContext arrayInitialValue() throws RecognitionException {
		ArrayInitialValueContext _localctx = new ArrayInitialValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrayInitialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(ASSIGN);
			setState(218);
			((ArrayInitialValueContext)_localctx).arrayList = arrayList();
			((ArrayInitialValueContext)_localctx).initialValues =  ((ArrayInitialValueContext)_localctx).arrayList.initialValues;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayListContext extends ParserRuleContext {
		public ArrayList<Expression> initialValues;
		public ValueContext val;
		public IdentifierContext i;
		public IdentifierContext id;
		public TerminalNode LBRACKET() { return getToken(LogicPLParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(LogicPLParser.RBRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogicPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogicPLParser.COMMA, i);
		}
		public ArrayListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArrayList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArrayList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArrayList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayListContext arrayList() throws RecognitionException {
		ArrayListContext _localctx = new ArrayListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ArrayListContext)_localctx).initialValues =  new ArrayList<>();
			setState(222);
			match(LBRACKET);
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case MINUS:
			case INT_NUMBER:
			case FLOAT_NUMBER:
				{
				setState(223);
				((ArrayListContext)_localctx).val = value();
				_localctx.initialValues.add(((ArrayListContext)_localctx).val.val);
				}
				break;
			case IDENTIFIER:
				{
				setState(226);
				((ArrayListContext)_localctx).i = identifier();
				_localctx.initialValues.add(((ArrayListContext)_localctx).i.id);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(231);
				match(COMMA);
				setState(238);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case MINUS:
				case INT_NUMBER:
				case FLOAT_NUMBER:
					{
					setState(232);
					((ArrayListContext)_localctx).val = value();
					_localctx.initialValues.add(((ArrayListContext)_localctx).val.val);
					}
					break;
				case IDENTIFIER:
					{
					setState(235);
					((ArrayListContext)_localctx).id = identifier();
					_localctx.initialValues.add(((ArrayListContext)_localctx).i.id);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			match(RBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintSmtContext extends ParserRuleContext {
		public PrintStmt printSmtRet;
		public PrintExprContext p;
		public TerminalNode PRINT() { return getToken(LogicPLParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public PrintExprContext printExpr() {
			return getRuleContext(PrintExprContext.class,0);
		}
		public PrintSmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printSmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterPrintSmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitPrintSmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitPrintSmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintSmtContext printSmt() throws RecognitionException {
		PrintSmtContext _localctx = new PrintSmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printSmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(PRINT);
			setState(248);
			match(LPAR);
			setState(249);
			((PrintSmtContext)_localctx).p = printExpr();
			setState(250);
			match(RPAR);
			setState(251);
			match(SEMICOLON);
			((PrintSmtContext)_localctx).printSmtRet =  new PrintStmt(((PrintSmtContext)_localctx).p.expr); _localctx.printSmtRet.setLine(((PrintSmtContext)_localctx).p.expr.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintExprContext extends ParserRuleContext {
		public Expression expr;
		public VariableContext var;
		public QueryContext q;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public PrintExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitPrintExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExprContext printExpr() throws RecognitionException {
		PrintExprContext _localctx = new PrintExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printExpr);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				((PrintExprContext)_localctx).var = variable();
				((PrintExprContext)_localctx).expr =  ((PrintExprContext)_localctx).var.var;
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				((PrintExprContext)_localctx).q = query();
				((PrintExprContext)_localctx).expr =  ((PrintExprContext)_localctx).q.queryRet;
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

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public QueryExpression queryRet;
		public QueryType1Context q1;
		public QueryType2Context q2;
		public QueryType1Context queryType1() {
			return getRuleContext(QueryType1Context.class,0);
		}
		public QueryType2Context queryType2() {
			return getRuleContext(QueryType2Context.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_query);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				((QueryContext)_localctx).q1 = queryType1();
				((QueryContext)_localctx).queryRet =  ((QueryContext)_localctx).q1.queryRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				((QueryContext)_localctx).q2 = queryType2();
				((QueryContext)_localctx).queryRet =  ((QueryContext)_localctx).q2.queryRet;
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

	@SuppressWarnings("CheckReturnValue")
	public static class QueryType1Context extends ParserRuleContext {
		public QueryExpression queryRet;
		public Token q;
		public PredicateIdentifierContext p;
		public VariableContext var;
		public TerminalNode LBRACKET() { return getToken(LogicPLParser.LBRACKET, 0); }
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public TerminalNode RBRACKET() { return getToken(LogicPLParser.RBRACKET, 0); }
		public TerminalNode QUARYMARK() { return getToken(LogicPLParser.QUARYMARK, 0); }
		public PredicateIdentifierContext predicateIdentifier() {
			return getRuleContext(PredicateIdentifierContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public QueryType1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryType1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterQueryType1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitQueryType1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitQueryType1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryType1Context queryType1() throws RecognitionException {
		QueryType1Context _localctx = new QueryType1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_queryType1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(LBRACKET);
			setState(271);
			((QueryType1Context)_localctx).q = match(QUARYMARK);
			setState(272);
			((QueryType1Context)_localctx).p = predicateIdentifier();
			setState(273);
			match(LPAR);
			setState(274);
			((QueryType1Context)_localctx).var = variable();
			setState(275);
			match(RPAR);
			setState(276);
			match(RBRACKET);
			((QueryType1Context)_localctx).queryRet =  new QueryExpression(((QueryType1Context)_localctx).p.id); _localctx.queryRet.setVar(((QueryType1Context)_localctx).var.var); _localctx.queryRet.setLine(((QueryType1Context)_localctx).q.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class QueryType2Context extends ParserRuleContext {
		public QueryExpression queryRet;
		public PredicateIdentifierContext p;
		public Token q;
		public TerminalNode LBRACKET() { return getToken(LogicPLParser.LBRACKET, 0); }
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public TerminalNode RBRACKET() { return getToken(LogicPLParser.RBRACKET, 0); }
		public PredicateIdentifierContext predicateIdentifier() {
			return getRuleContext(PredicateIdentifierContext.class,0);
		}
		public TerminalNode QUARYMARK() { return getToken(LogicPLParser.QUARYMARK, 0); }
		public QueryType2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryType2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterQueryType2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitQueryType2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitQueryType2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryType2Context queryType2() throws RecognitionException {
		QueryType2Context _localctx = new QueryType2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_queryType2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(LBRACKET);
			setState(280);
			((QueryType2Context)_localctx).p = predicateIdentifier();
			setState(281);
			match(LPAR);
			setState(282);
			((QueryType2Context)_localctx).q = match(QUARYMARK);
			setState(283);
			match(RPAR);
			setState(284);
			match(RBRACKET);
			((QueryType2Context)_localctx).queryRet =  new QueryExpression(((QueryType2Context)_localctx).p.id); _localctx.queryRet.setLine(((QueryType2Context)_localctx).q.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnSmtContext extends ParserRuleContext {
		public ReturnStmt returnRet;
		public Token r;
		public ValueContext v;
		public IdentifierContext i;
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public TerminalNode RETURN() { return getToken(LogicPLParser.RETURN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReturnSmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnSmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterReturnSmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitReturnSmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitReturnSmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnSmtContext returnSmt() throws RecognitionException {
		ReturnSmtContext _localctx = new ReturnSmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnSmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			((ReturnSmtContext)_localctx).r = match(RETURN);
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case MINUS:
			case INT_NUMBER:
			case FLOAT_NUMBER:
				{
				setState(288);
				((ReturnSmtContext)_localctx).v = value();
				((ReturnSmtContext)_localctx).returnRet =  new ReturnStmt(((ReturnSmtContext)_localctx).v.val); _localctx.returnRet.setLine(((ReturnSmtContext)_localctx).v.val.getLine());
				}
				break;
			case IDENTIFIER:
				{
				setState(291);
				((ReturnSmtContext)_localctx).i = identifier();
				((ReturnSmtContext)_localctx).returnRet =  new ReturnStmt(((ReturnSmtContext)_localctx).i.id); _localctx.returnRet.setLine(((ReturnSmtContext)_localctx).i.id.getLine());
				}
				break;
			case SEMICOLON:
				break;
			default:
				break;
			}
			setState(296);
			match(SEMICOLON);
			if(_localctx.returnRet == null){((ReturnSmtContext)_localctx).returnRet =  new ReturnStmt(null);}  _localctx.returnRet.setLine(((ReturnSmtContext)_localctx).r.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public ForloopStmt forLoopRet;
		public Token f;
		public IdentifierContext it;
		public IdentifierContext arr;
		public StatementContext s;
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode COLON() { return getToken(LogicPLParser.COLON, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(LogicPLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LogicPLParser.RBRACE, 0); }
		public TerminalNode FOR() { return getToken(LogicPLParser.FOR, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Statement> stmts = new ArrayList<>();
			setState(300);
			((ForLoopContext)_localctx).f = match(FOR);
			setState(301);
			match(LPAR);
			setState(302);
			((ForLoopContext)_localctx).it = identifier();
			setState(303);
			match(COLON);
			setState(304);
			((ForLoopContext)_localctx).arr = identifier();
			setState(305);
			match(RPAR);
			setState(306);
			match(LBRACE);
			{
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1649267444188L) != 0)) {
				{
				{
				setState(307);
				((ForLoopContext)_localctx).s = statement();
				stmts.add(((ForLoopContext)_localctx).s.statementRet);
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(315);
			match(RBRACE);
			((ForLoopContext)_localctx).forLoopRet =  new ForloopStmt(((ForLoopContext)_localctx).it.id, ((ForLoopContext)_localctx).arr.id, stmts); _localctx.forLoopRet.setLine(((ForLoopContext)_localctx).f.getLine()); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public PredicateStmt predicateRet;
		public PredicateIdentifierContext i;
		public VariableContext var;
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public PredicateIdentifierContext predicateIdentifier() {
			return getRuleContext(PredicateIdentifierContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			((PredicateContext)_localctx).i = predicateIdentifier();
			setState(319);
			match(LPAR);
			setState(320);
			((PredicateContext)_localctx).var = variable();
			setState(321);
			match(RPAR);
			((PredicateContext)_localctx).predicateRet =  new PredicateStmt(((PredicateContext)_localctx).i.id, ((PredicateContext)_localctx).var.var); _localctx.predicateRet.setLine(((PredicateContext)_localctx).i.id.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImplicationContext extends ParserRuleContext {
		public ImplicationStmt implicationRet;
		public ExpressionContext e;
		public StatementContext s;
		public List<TerminalNode> LPAR() { return getTokens(LogicPLParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(LogicPLParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(LogicPLParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(LogicPLParser.RPAR, i);
		}
		public TerminalNode ARROW() { return getToken(LogicPLParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ImplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterImplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitImplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitImplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicationContext implication() throws RecognitionException {
		ImplicationContext _localctx = new ImplicationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_implication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Statement> stmts = new ArrayList<>();
			setState(325);
			match(LPAR);
			setState(326);
			((ImplicationContext)_localctx).e = expression();
			setState(327);
			match(RPAR);
			setState(328);
			match(ARROW);
			setState(329);
			match(LPAR);
			{
			setState(333); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(330);
				((ImplicationContext)_localctx).s = statement();
				stmts.add(((ImplicationContext)_localctx).s.statementRet);
				}
				}
				setState(335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1649267444188L) != 0) );
			}
			setState(337);
			match(RPAR);
			((ImplicationContext)_localctx).implicationRet =  new ImplicationStmt(((ImplicationContext)_localctx).e.expr, stmts); _localctx.implicationRet.setLine(((ImplicationContext)_localctx).e.expr.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression expr;
		public AndExprContext l;
		public Expression2Context r;
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			((ExpressionContext)_localctx).l = andExpr();
			setState(341);
			((ExpressionContext)_localctx).r = expression2();
			if(((ExpressionContext)_localctx).r.expr != null) {((ExpressionContext)_localctx).expr =  new BinaryExpression(((ExpressionContext)_localctx).l.expr, ((ExpressionContext)_localctx).r.expr.getRight(), ((ExpressionContext)_localctx).r.expr.getBinaryOperator()); _localctx.expr.setLine(((ExpressionContext)_localctx).r.expr.getLine());} else {((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).l.expr;}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression2Context extends ParserRuleContext {
		public BinaryExpression expr;
		public BinaryExpression ee;
		public Token OR;
		public AndExprContext l;
		public Expression2Context r;
		public TerminalNode OR() { return getToken(LogicPLParser.OR, 0); }
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitExpression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitExpression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression2Context expression2() throws RecognitionException {
		Expression2Context _localctx = new Expression2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression2);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				((Expression2Context)_localctx).OR = match(OR);
				setState(345);
				((Expression2Context)_localctx).l = andExpr();
				setState(346);
				((Expression2Context)_localctx).r = expression2();
				if(((Expression2Context)_localctx).r.expr != null) {((Expression2Context)_localctx).ee =  new BinaryExpression(((Expression2Context)_localctx).l.expr, ((Expression2Context)_localctx).r.expr.getRight(), ((Expression2Context)_localctx).r.expr.getBinaryOperator()); _localctx.ee.setLine(((Expression2Context)_localctx).r.expr.getLine()); ((Expression2Context)_localctx).expr =  new BinaryExpression(null, _localctx.ee, BinaryOperator.or);} else{((Expression2Context)_localctx).expr =  new BinaryExpression(null, ((Expression2Context)_localctx).l.expr, BinaryOperator.or);}
				_localctx.expr.setLine(((Expression2Context)_localctx).OR.getLine());
				}
				break;
			case RPAR:
			case COMMA:
			case SEMICOLON:
			case RBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				((Expression2Context)_localctx).expr =  null;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ParserRuleContext {
		public Expression expr;
		public EqExprContext l;
		public AndExpr2Context r;
		public EqExprContext eqExpr() {
			return getRuleContext(EqExprContext.class,0);
		}
		public AndExpr2Context andExpr2() {
			return getRuleContext(AndExpr2Context.class,0);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_andExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			((AndExprContext)_localctx).l = eqExpr();
			setState(354);
			((AndExprContext)_localctx).r = andExpr2();
			if(((AndExprContext)_localctx).r.expr != null) {((AndExprContext)_localctx).expr =  new BinaryExpression(((AndExprContext)_localctx).l.expr, ((AndExprContext)_localctx).r.expr.getRight(), ((AndExprContext)_localctx).r.expr.getBinaryOperator()); _localctx.expr.setLine(((AndExprContext)_localctx).r.expr.getLine());} else {((AndExprContext)_localctx).expr =  ((AndExprContext)_localctx).l.expr;}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AndExpr2Context extends ParserRuleContext {
		public BinaryExpression expr;
		public BinaryExpression ee;
		public Token AND;
		public EqExprContext l;
		public AndExpr2Context r;
		public TerminalNode AND() { return getToken(LogicPLParser.AND, 0); }
		public EqExprContext eqExpr() {
			return getRuleContext(EqExprContext.class,0);
		}
		public AndExpr2Context andExpr2() {
			return getRuleContext(AndExpr2Context.class,0);
		}
		public AndExpr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAndExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAndExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAndExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpr2Context andExpr2() throws RecognitionException {
		AndExpr2Context _localctx = new AndExpr2Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_andExpr2);
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				((AndExpr2Context)_localctx).AND = match(AND);
				setState(358);
				((AndExpr2Context)_localctx).l = eqExpr();
				setState(359);
				((AndExpr2Context)_localctx).r = andExpr2();
				if(((AndExpr2Context)_localctx).r.expr != null) {((AndExpr2Context)_localctx).ee =  new BinaryExpression(((AndExpr2Context)_localctx).l.expr, ((AndExpr2Context)_localctx).r.expr.getRight(), ((AndExpr2Context)_localctx).r.expr.getBinaryOperator()); _localctx.ee.setLine(((AndExpr2Context)_localctx).r.expr.getLine()); ((AndExpr2Context)_localctx).expr =  new BinaryExpression(null, _localctx.ee, BinaryOperator.and);} else{((AndExpr2Context)_localctx).expr =  new BinaryExpression(null, ((AndExpr2Context)_localctx).l.expr, BinaryOperator.and);}
				_localctx.expr.setLine(((AndExpr2Context)_localctx).AND.getLine());
				}
				break;
			case RPAR:
			case COMMA:
			case SEMICOLON:
			case RBRACKET:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				((AndExpr2Context)_localctx).expr =  null;
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqExprContext extends ParserRuleContext {
		public Expression expr;
		public CompExprContext l;
		public EqExpr2Context r;
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public EqExpr2Context eqExpr2() {
			return getRuleContext(EqExpr2Context.class,0);
		}
		public EqExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqExprContext eqExpr() throws RecognitionException {
		EqExprContext _localctx = new EqExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_eqExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			((EqExprContext)_localctx).l = compExpr();
			setState(367);
			((EqExprContext)_localctx).r = eqExpr2();
			if(((EqExprContext)_localctx).r.expr != null) {((EqExprContext)_localctx).expr =  new BinaryExpression(((EqExprContext)_localctx).l.expr, ((EqExprContext)_localctx).r.expr.getRight(), ((EqExprContext)_localctx).r.expr.getBinaryOperator()); _localctx.expr.setLine(((EqExprContext)_localctx).r.expr.getLine());} else {((EqExprContext)_localctx).expr =  ((EqExprContext)_localctx).l.expr;}
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqExpr2Context extends ParserRuleContext {
		public BinaryExpression expr;
		public BinaryOperator opt;
		public BinaryExpression ee;
		public Token op;
		public CompExprContext l;
		public EqExpr2Context r;
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public EqExpr2Context eqExpr2() {
			return getRuleContext(EqExpr2Context.class,0);
		}
		public TerminalNode EQ() { return getToken(LogicPLParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(LogicPLParser.NEQ, 0); }
		public EqExpr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterEqExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitEqExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitEqExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqExpr2Context eqExpr2() throws RecognitionException {
		EqExpr2Context _localctx = new EqExpr2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_eqExpr2);
		try {
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
			case NEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQ:
					{
					setState(370);
					((EqExpr2Context)_localctx).op = match(EQ);
					((EqExpr2Context)_localctx).opt =  BinaryOperator.eq;
					}
					break;
				case NEQ:
					{
					setState(372);
					((EqExpr2Context)_localctx).op = match(NEQ);
					((EqExpr2Context)_localctx).opt =  BinaryOperator.neq;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(376);
				((EqExpr2Context)_localctx).l = compExpr();
				setState(377);
				((EqExpr2Context)_localctx).r = eqExpr2();
				if(((EqExpr2Context)_localctx).r.expr != null) {((EqExpr2Context)_localctx).ee =  new BinaryExpression(((EqExpr2Context)_localctx).l.expr, ((EqExpr2Context)_localctx).r.expr.getRight(), ((EqExpr2Context)_localctx).r.expr.getBinaryOperator()); _localctx.ee.setLine(((EqExpr2Context)_localctx).r.expr.getLine()); ((EqExpr2Context)_localctx).expr =  new BinaryExpression(null, _localctx.ee, _localctx.opt);} else{((EqExpr2Context)_localctx).expr =  new BinaryExpression(null, ((EqExpr2Context)_localctx).l.expr, _localctx.opt);}
				_localctx.expr.setLine(((EqExpr2Context)_localctx).op.getLine());
				}
				break;
			case RPAR:
			case COMMA:
			case SEMICOLON:
			case RBRACKET:
			case OR:
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				((EqExpr2Context)_localctx).expr =  null;
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompExprContext extends ParserRuleContext {
		public Expression expr;
		public AdditiveContext l;
		public CompExpr2Context r;
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public CompExpr2Context compExpr2() {
			return getRuleContext(CompExpr2Context.class,0);
		}
		public CompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompExprContext compExpr() throws RecognitionException {
		CompExprContext _localctx = new CompExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_compExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			((CompExprContext)_localctx).l = additive();
			setState(385);
			((CompExprContext)_localctx).r = compExpr2();
			if(((CompExprContext)_localctx).r.expr != null) {((CompExprContext)_localctx).expr =  new BinaryExpression(((CompExprContext)_localctx).l.expr, ((CompExprContext)_localctx).r.expr.getRight(), ((CompExprContext)_localctx).r.expr.getBinaryOperator()); _localctx.expr.setLine(((CompExprContext)_localctx).r.expr.getLine());} else {((CompExprContext)_localctx).expr =  ((CompExprContext)_localctx).l.expr;}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompExpr2Context extends ParserRuleContext {
		public BinaryExpression expr;
		public BinaryOperator opt;
		public BinaryExpression ee;
		public Token op;
		public AdditiveContext l;
		public CompExpr2Context r;
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public CompExpr2Context compExpr2() {
			return getRuleContext(CompExpr2Context.class,0);
		}
		public TerminalNode LT() { return getToken(LogicPLParser.LT, 0); }
		public TerminalNode LTE() { return getToken(LogicPLParser.LTE, 0); }
		public TerminalNode GT() { return getToken(LogicPLParser.GT, 0); }
		public TerminalNode GTE() { return getToken(LogicPLParser.GTE, 0); }
		public CompExpr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterCompExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitCompExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitCompExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompExpr2Context compExpr2() throws RecognitionException {
		CompExpr2Context _localctx = new CompExpr2Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_compExpr2);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GT:
			case LT:
			case GTE:
			case LTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(388);
					((CompExpr2Context)_localctx).op = match(LT);
					((CompExpr2Context)_localctx).opt =  BinaryOperator.lt;
					}
					break;
				case LTE:
					{
					setState(390);
					((CompExpr2Context)_localctx).op = match(LTE);
					((CompExpr2Context)_localctx).opt =  BinaryOperator.lte;
					}
					break;
				case GT:
					{
					setState(392);
					((CompExpr2Context)_localctx).op = match(GT);
					((CompExpr2Context)_localctx).opt =  BinaryOperator.gt;
					}
					break;
				case GTE:
					{
					setState(394);
					((CompExpr2Context)_localctx).op = match(GTE);
					((CompExpr2Context)_localctx).opt =  BinaryOperator.gte;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(398);
				((CompExpr2Context)_localctx).l = additive();
				setState(399);
				((CompExpr2Context)_localctx).r = compExpr2();
				if(((CompExpr2Context)_localctx).r.expr != null) {((CompExpr2Context)_localctx).ee =  new BinaryExpression(((CompExpr2Context)_localctx).l.expr, ((CompExpr2Context)_localctx).r.expr.getRight(), ((CompExpr2Context)_localctx).r.expr.getBinaryOperator()); _localctx.ee.setLine(((CompExpr2Context)_localctx).r.expr.getLine()); ((CompExpr2Context)_localctx).expr =  new BinaryExpression(null, _localctx.ee, _localctx.opt);} else{((CompExpr2Context)_localctx).expr =  new BinaryExpression(null, ((CompExpr2Context)_localctx).l.expr, _localctx.opt);}
				_localctx.expr.setLine(((CompExpr2Context)_localctx).op.getLine());
				}
				break;
			case RPAR:
			case COMMA:
			case SEMICOLON:
			case RBRACKET:
			case OR:
			case AND:
			case EQ:
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				((CompExpr2Context)_localctx).expr =  null;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveContext extends ParserRuleContext {
		public Expression expr;
		public MulticativeContext l;
		public Additive2Context r;
		public MulticativeContext multicative() {
			return getRuleContext(MulticativeContext.class,0);
		}
		public Additive2Context additive2() {
			return getRuleContext(Additive2Context.class,0);
		}
		public AdditiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAdditive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAdditive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveContext additive() throws RecognitionException {
		AdditiveContext _localctx = new AdditiveContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_additive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			((AdditiveContext)_localctx).l = multicative();
			setState(407);
			((AdditiveContext)_localctx).r = additive2();
			if(((AdditiveContext)_localctx).r.expr != null) {((AdditiveContext)_localctx).expr =  new BinaryExpression(((AdditiveContext)_localctx).l.expr, ((AdditiveContext)_localctx).r.expr.getRight(), ((AdditiveContext)_localctx).r.expr.getBinaryOperator()); _localctx.expr.setLine(((AdditiveContext)_localctx).r.expr.getLine());} else {((AdditiveContext)_localctx).expr =  ((AdditiveContext)_localctx).l.expr;}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Additive2Context extends ParserRuleContext {
		public BinaryExpression expr;
		public BinaryOperator opt;
		public BinaryExpression ee;
		public Token op;
		public MulticativeContext l;
		public Additive2Context r;
		public MulticativeContext multicative() {
			return getRuleContext(MulticativeContext.class,0);
		}
		public Additive2Context additive2() {
			return getRuleContext(Additive2Context.class,0);
		}
		public TerminalNode PLUS() { return getToken(LogicPLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LogicPLParser.MINUS, 0); }
		public Additive2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAdditive2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAdditive2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAdditive2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive2Context additive2() throws RecognitionException {
		Additive2Context _localctx = new Additive2Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_additive2);
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(410);
					((Additive2Context)_localctx).op = match(PLUS);
					((Additive2Context)_localctx).opt =  BinaryOperator.add;
					}
					break;
				case MINUS:
					{
					setState(412);
					((Additive2Context)_localctx).op = match(MINUS);
					((Additive2Context)_localctx).opt =  BinaryOperator.sub;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(416);
				((Additive2Context)_localctx).l = multicative();
				setState(417);
				((Additive2Context)_localctx).r = additive2();
				if(((Additive2Context)_localctx).r.expr != null) {((Additive2Context)_localctx).ee =  new BinaryExpression(((Additive2Context)_localctx).l.expr, ((Additive2Context)_localctx).r.expr.getRight(), ((Additive2Context)_localctx).r.expr.getBinaryOperator()); _localctx.ee.setLine(((Additive2Context)_localctx).r.expr.getLine()); ((Additive2Context)_localctx).expr =  new BinaryExpression(null, _localctx.ee, _localctx.opt);} else{((Additive2Context)_localctx).expr =  new BinaryExpression(null, ((Additive2Context)_localctx).l.expr, _localctx.opt);}
				_localctx.expr.setLine(((Additive2Context)_localctx).op.getLine());
				}
				break;
			case RPAR:
			case COMMA:
			case SEMICOLON:
			case RBRACKET:
			case OR:
			case AND:
			case EQ:
			case GT:
			case LT:
			case GTE:
			case LTE:
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				((Additive2Context)_localctx).expr =  null;
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

	@SuppressWarnings("CheckReturnValue")
	public static class MulticativeContext extends ParserRuleContext {
		public Expression expr;
		public UnaryContext l;
		public Multicative2Context r;
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public Multicative2Context multicative2() {
			return getRuleContext(Multicative2Context.class,0);
		}
		public MulticativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multicative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterMulticative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitMulticative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitMulticative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulticativeContext multicative() throws RecognitionException {
		MulticativeContext _localctx = new MulticativeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_multicative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			((MulticativeContext)_localctx).l = unary();
			setState(425);
			((MulticativeContext)_localctx).r = multicative2();
			if(((MulticativeContext)_localctx).r.expr != null) {((MulticativeContext)_localctx).expr =  new BinaryExpression(((MulticativeContext)_localctx).l.expr, ((MulticativeContext)_localctx).r.expr.getRight(), ((MulticativeContext)_localctx).r.expr.getBinaryOperator()); _localctx.expr.setLine(((MulticativeContext)_localctx).r.expr.getLine());} else {((MulticativeContext)_localctx).expr =  ((MulticativeContext)_localctx).l.expr;}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Multicative2Context extends ParserRuleContext {
		public BinaryExpression expr;
		public BinaryOperator opt;
		public BinaryExpression ee;
		public Token op;
		public UnaryContext l;
		public Multicative2Context r;
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public Multicative2Context multicative2() {
			return getRuleContext(Multicative2Context.class,0);
		}
		public TerminalNode MULT() { return getToken(LogicPLParser.MULT, 0); }
		public TerminalNode MOD() { return getToken(LogicPLParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(LogicPLParser.DIV, 0); }
		public Multicative2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multicative2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterMulticative2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitMulticative2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitMulticative2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multicative2Context multicative2() throws RecognitionException {
		Multicative2Context _localctx = new Multicative2Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_multicative2);
		try {
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(428);
					((Multicative2Context)_localctx).op = match(MULT);
					((Multicative2Context)_localctx).opt =  BinaryOperator.mult;
					}
					break;
				case MOD:
					{
					setState(430);
					((Multicative2Context)_localctx).op = match(MOD);
					((Multicative2Context)_localctx).opt =  BinaryOperator.mod;
					}
					break;
				case DIV:
					{
					setState(432);
					((Multicative2Context)_localctx).op = match(DIV);
					((Multicative2Context)_localctx).opt =  BinaryOperator.div;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(436);
				((Multicative2Context)_localctx).l = unary();
				setState(437);
				((Multicative2Context)_localctx).r = multicative2();
				if(((Multicative2Context)_localctx).r.expr != null) {((Multicative2Context)_localctx).ee =  new BinaryExpression(((Multicative2Context)_localctx).l.expr, ((Multicative2Context)_localctx).r.expr.getRight(), ((Multicative2Context)_localctx).r.expr.getBinaryOperator()); _localctx.ee.setLine(((Multicative2Context)_localctx).r.expr.getLine()); ((Multicative2Context)_localctx).expr =  new BinaryExpression(null, _localctx.ee, _localctx.opt);} else{((Multicative2Context)_localctx).expr =  new BinaryExpression(null, ((Multicative2Context)_localctx).l.expr, _localctx.opt);}
				_localctx.expr.setLine(((Multicative2Context)_localctx).op.getLine());
				}
				break;
			case RPAR:
			case COMMA:
			case SEMICOLON:
			case RBRACKET:
			case OR:
			case AND:
			case EQ:
			case GT:
			case LT:
			case GTE:
			case LTE:
			case PLUS:
			case MINUS:
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				((Multicative2Context)_localctx).expr =  null;
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryContext extends ParserRuleContext {
		public Expression expr;
		public UnaryOperator opt;
		public OtherContext otherRet;
		public Token op;
		public OtherContext e;
		public OtherContext other() {
			return getRuleContext(OtherContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LogicPLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LogicPLParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(LogicPLParser.NOT, 0); }
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_unary);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				((UnaryContext)_localctx).otherRet = other();
				((UnaryContext)_localctx).expr =  ((UnaryContext)_localctx).otherRet.expr;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(447);
					((UnaryContext)_localctx).op = match(PLUS);
					((UnaryContext)_localctx).opt =  UnaryOperator.plus;
					}
					break;
				case MINUS:
					{
					setState(449);
					((UnaryContext)_localctx).op = match(MINUS);
					((UnaryContext)_localctx).opt =  UnaryOperator.minus;
					}
					break;
				case NOT:
					{
					setState(451);
					((UnaryContext)_localctx).op = match(NOT);
					((UnaryContext)_localctx).opt =  UnaryOperator.not;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(455);
				((UnaryContext)_localctx).e = other();
				((UnaryContext)_localctx).expr =  new UnaryExpression(_localctx.opt, ((UnaryContext)_localctx).e.expr); _localctx.expr.setLine(((UnaryContext)_localctx).op.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class OtherContext extends ParserRuleContext {
		public Expression expr;
		public ExpressionContext e;
		public VariableContext var;
		public ValueContext val;
		public QueryType1Context q1;
		public FunctionCallContext funcCall;
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public QueryType1Context queryType1() {
			return getRuleContext(QueryType1Context.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public OtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitOther(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitOther(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherContext other() throws RecognitionException {
		OtherContext _localctx = new OtherContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_other);
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				match(LPAR);
				setState(461);
				((OtherContext)_localctx).e = expression();
				setState(462);
				match(RPAR);
				((OtherContext)_localctx).expr =  ((OtherContext)_localctx).e.expr;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				((OtherContext)_localctx).var = variable();
				((OtherContext)_localctx).expr =  ((OtherContext)_localctx).var.var;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(468);
				((OtherContext)_localctx).val = value();
				((OtherContext)_localctx).expr =  ((OtherContext)_localctx).val.val;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
				((OtherContext)_localctx).q1 = queryType1();
				((OtherContext)_localctx).expr =  ((OtherContext)_localctx).q1.queryRet;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(474);
				((OtherContext)_localctx).funcCall = functionCall();
				((OtherContext)_localctx).expr =  ((OtherContext)_localctx).funcCall.fCallRet;
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCall fCallRet;
		public IdentifierContext name;
		public ExpressionContext arg1;
		public ExpressionContext newArg;
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogicPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogicPLParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Expression> args = new ArrayList<Expression>();
			setState(480);
			((FunctionCallContext)_localctx).name = identifier();
			setState(481);
			match(LPAR);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7218766810624L) != 0)) {
				{
				setState(482);
				((FunctionCallContext)_localctx).arg1 = expression();
				args.add(((FunctionCallContext)_localctx).arg1.expr);
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(484);
					match(COMMA);
					setState(485);
					((FunctionCallContext)_localctx).newArg = expression();
					args.add(((FunctionCallContext)_localctx).newArg.expr);
					}
					}
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(495);
			match(RPAR);
			((FunctionCallContext)_localctx).fCallRet =  new FunctionCall(args, ((FunctionCallContext)_localctx).name.id); _localctx.fCallRet.setLine(((FunctionCallContext)_localctx).name.id.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public Value val;
		public NumericValueContext n;
		public Token t;
		public Token f;
		public NumericValueContext numericValue() {
			return getRuleContext(NumericValueContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(LogicPLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LogicPLParser.FALSE, 0); }
		public TerminalNode MINUS() { return getToken(LogicPLParser.MINUS, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_value);
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_NUMBER:
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				((ValueContext)_localctx).n = numericValue();
				((ValueContext)_localctx).val =  ((ValueContext)_localctx).n.val;
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				((ValueContext)_localctx).t = match(TRUE);
				((ValueContext)_localctx).val =  new BooleanValue(true); _localctx.val.setLine(((ValueContext)_localctx).t.getLine()); _localctx.val.setType(new BooleanType());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
				((ValueContext)_localctx).f = match(FALSE);
				((ValueContext)_localctx).val =  new BooleanValue(false); _localctx.val.setLine(((ValueContext)_localctx).f.getLine()); _localctx.val.setType(new BooleanType());
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
				match(MINUS);
				setState(506);
				((ValueContext)_localctx).n = numericValue();
				((ValueContext)_localctx).val =  ((ValueContext)_localctx).n.val; _localctx.val.negateConstant();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumericValueContext extends ParserRuleContext {
		public Value val;
		public Token i;
		public Token f;
		public TerminalNode INT_NUMBER() { return getToken(LogicPLParser.INT_NUMBER, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(LogicPLParser.FLOAT_NUMBER, 0); }
		public NumericValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterNumericValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitNumericValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitNumericValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericValueContext numericValue() throws RecognitionException {
		NumericValueContext _localctx = new NumericValueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_numericValue);
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				((NumericValueContext)_localctx).i = match(INT_NUMBER);
				((NumericValueContext)_localctx).val =  new IntValue((((NumericValueContext)_localctx).i!=null?Integer.valueOf(((NumericValueContext)_localctx).i.getText()):0)); _localctx.val.setLine(((NumericValueContext)_localctx).i.getLine()); _localctx.val.setType(new IntType());
				}
				break;
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				((NumericValueContext)_localctx).f = match(FLOAT_NUMBER);
				((NumericValueContext)_localctx).val =  new FloatValue(Float.parseFloat((((NumericValueContext)_localctx).f!=null?((NumericValueContext)_localctx).f.getText():null))); _localctx.val.setLine(((NumericValueContext)_localctx).f.getLine()); _localctx.val.setType(new FloatType());
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public Identifier id;
		public Token i;
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			((IdentifierContext)_localctx).i = match(IDENTIFIER);
			((IdentifierContext)_localctx).id =  new Identifier((((IdentifierContext)_localctx).i!=null?((IdentifierContext)_localctx).i.getText():null)); _localctx.id.setLine(((IdentifierContext)_localctx).i.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateIdentifierContext extends ParserRuleContext {
		public Identifier id;
		public Token i;
		public TerminalNode PREDICATE_IDENTIFIER() { return getToken(LogicPLParser.PREDICATE_IDENTIFIER, 0); }
		public PredicateIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterPredicateIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitPredicateIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitPredicateIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateIdentifierContext predicateIdentifier() throws RecognitionException {
		PredicateIdentifierContext _localctx = new PredicateIdentifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_predicateIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			((PredicateIdentifierContext)_localctx).i = match(PREDICATE_IDENTIFIER);
			((PredicateIdentifierContext)_localctx).id =  new Identifier((((PredicateIdentifierContext)_localctx).i!=null?((PredicateIdentifierContext)_localctx).i.getText():null)); _localctx.id.setLine(((PredicateIdentifierContext)_localctx).i.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Type typeRet;
		public Token b;
		public Token i;
		public Token f;
		public TerminalNode BOOLEAN() { return getToken(LogicPLParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(LogicPLParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LogicPLParser.FLOAT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_type);
		try {
			setState(529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				((TypeContext)_localctx).b = match(BOOLEAN);
				((TypeContext)_localctx).typeRet =  new BooleanType();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				((TypeContext)_localctx).i = match(INT);
				((TypeContext)_localctx).typeRet =  new IntType();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				((TypeContext)_localctx).f = match(FLOAT);
				((TypeContext)_localctx).typeRet =  new FloatType();
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

	public static final String _serializedATN =
		"\u0004\u0001*\u0214\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000W"+
		"\b\u0000\n\u0000\f\u0000Z\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001i\b\u0001"+
		"\n\u0001\f\u0001l\t\u0001\u0003\u0001n\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"w\b\u0001\u000b\u0001\f\u0001x\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u0088\b\u0003\u000b"+
		"\u0003\f\u0003\u0089\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a6\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b7\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00bf"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00c8\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d5\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e6\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00ef\b\u000b\u0005\u000b\u00f1\b\u000b\n\u000b"+
		"\f\u000b\u00f4\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0105\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u010d\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0127"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0137\b\u0012\n\u0012\f\u0012"+
		"\u013a\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0004\u0014\u014e\b\u0014\u000b\u0014\f\u0014\u014f\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0160\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u016d\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u0177\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u017f\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u018d"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0195\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u019f"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u01a7\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01b3\b \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01bb\b \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01c6\b!\u0001!\u0001"+
		"!\u0001!\u0003!\u01cb\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u01de\b\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0005#\u01e9\b#\n#\f#\u01ec\t#\u0003#\u01ee"+
		"\b#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0003$\u01fe\b$\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u0204\b%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001("+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0212\b(\u0001(\u0000\u0000"+
		")\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNP\u0000\u0000\u021e\u0000R\u0001"+
		"\u0000\u0000\u0000\u0002^\u0001\u0000\u0000\u0000\u0004}\u0001\u0000\u0000"+
		"\u0000\u0006\u0081\u0001\u0000\u0000\u0000\b\u00a5\u0001\u0000\u0000\u0000"+
		"\n\u00a7\u0001\u0000\u0000\u0000\f\u00b6\u0001\u0000\u0000\u0000\u000e"+
		"\u00be\u0001\u0000\u0000\u0000\u0010\u00c0\u0001\u0000\u0000\u0000\u0012"+
		"\u00cb\u0001\u0000\u0000\u0000\u0014\u00d9\u0001\u0000\u0000\u0000\u0016"+
		"\u00dd\u0001\u0000\u0000\u0000\u0018\u00f7\u0001\u0000\u0000\u0000\u001a"+
		"\u0104\u0001\u0000\u0000\u0000\u001c\u010c\u0001\u0000\u0000\u0000\u001e"+
		"\u010e\u0001\u0000\u0000\u0000 \u0117\u0001\u0000\u0000\u0000\"\u011f"+
		"\u0001\u0000\u0000\u0000$\u012b\u0001\u0000\u0000\u0000&\u013e\u0001\u0000"+
		"\u0000\u0000(\u0144\u0001\u0000\u0000\u0000*\u0154\u0001\u0000\u0000\u0000"+
		",\u015f\u0001\u0000\u0000\u0000.\u0161\u0001\u0000\u0000\u00000\u016c"+
		"\u0001\u0000\u0000\u00002\u016e\u0001\u0000\u0000\u00004\u017e\u0001\u0000"+
		"\u0000\u00006\u0180\u0001\u0000\u0000\u00008\u0194\u0001\u0000\u0000\u0000"+
		":\u0196\u0001\u0000\u0000\u0000<\u01a6\u0001\u0000\u0000\u0000>\u01a8"+
		"\u0001\u0000\u0000\u0000@\u01ba\u0001\u0000\u0000\u0000B\u01ca\u0001\u0000"+
		"\u0000\u0000D\u01dd\u0001\u0000\u0000\u0000F\u01df\u0001\u0000\u0000\u0000"+
		"H\u01fd\u0001\u0000\u0000\u0000J\u0203\u0001\u0000\u0000\u0000L\u0205"+
		"\u0001\u0000\u0000\u0000N\u0208\u0001\u0000\u0000\u0000P\u0211\u0001\u0000"+
		"\u0000\u0000RX\u0006\u0000\uffff\uffff\u0000ST\u0003\u0002\u0001\u0000"+
		"TU\u0006\u0000\uffff\uffff\u0000UW\u0001\u0000\u0000\u0000VS\u0001\u0000"+
		"\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"[\\\u0003\u0006\u0003\u0000\\]\u0006\u0000\uffff\uffff\u0000]\u0001\u0001"+
		"\u0000\u0000\u0000^_\u0006\u0001\uffff\uffff\u0000_`\u0005\u0001\u0000"+
		"\u0000`a\u0003L&\u0000am\u0005\u000b\u0000\u0000bc\u0003\u0004\u0002\u0000"+
		"cj\u0006\u0001\uffff\uffff\u0000de\u0005\u000e\u0000\u0000ef\u0003\u0004"+
		"\u0002\u0000fg\u0006\u0001\uffff\uffff\u0000gi\u0001\u0000\u0000\u0000"+
		"hd\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000mb\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000op\u0005\f\u0000\u0000pq\u0005\r\u0000\u0000qr\u0003"+
		"P(\u0000rv\u0005\u000f\u0000\u0000st\u0003\b\u0004\u0000tu\u0006\u0001"+
		"\uffff\uffff\u0000uw\u0001\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z{\u0005\u0010\u0000\u0000{|\u0006\u0001"+
		"\uffff\uffff\u0000|\u0003\u0001\u0000\u0000\u0000}~\u0003P(\u0000~\u007f"+
		"\u0003L&\u0000\u007f\u0080\u0006\u0002\uffff\uffff\u0000\u0080\u0005\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0006\u0003\uffff\uffff\u0000\u0082\u0083"+
		"\u0005\u0005\u0000\u0000\u0083\u0087\u0005\u000f\u0000\u0000\u0084\u0085"+
		"\u0003\b\u0004\u0000\u0085\u0086\u0006\u0003\uffff\uffff\u0000\u0086\u0088"+
		"\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0005\u0010\u0000\u0000\u008c\u008d\u0006\u0003\uffff\uffff\u0000\u008d"+
		"\u0007\u0001\u0000\u0000\u0000\u008e\u008f\u0003\n\u0005\u0000\u008f\u0090"+
		"\u0006\u0004\uffff\uffff\u0000\u0090\u00a6\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0003&\u0013\u0000\u0092\u0093\u0005\u0011\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0006\u0004\uffff\uffff\u0000\u0095"+
		"\u00a6\u0001\u0000\u0000\u0000\u0096\u0097\u0003(\u0014\u0000\u0097\u0098"+
		"\u0006\u0004\uffff\uffff\u0000\u0098\u00a6\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0003\"\u0011\u0000\u009a\u009b\u0006\u0004\uffff\uffff\u0000\u009b"+
		"\u00a6\u0001\u0000\u0000\u0000\u009c\u009d\u0003\u0018\f\u0000\u009d\u009e"+
		"\u0006\u0004\uffff\uffff\u0000\u009e\u00a6\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0003$\u0012\u0000\u00a0\u00a1\u0006\u0004\uffff\uffff\u0000\u00a1"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003\u000e\u0007\u0000\u00a3"+
		"\u00a4\u0006\u0004\uffff\uffff\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a5\u008e\u0001\u0000\u0000\u0000\u00a5\u0091\u0001\u0000\u0000\u0000"+
		"\u00a5\u0096\u0001\u0000\u0000\u0000\u00a5\u0099\u0001\u0000\u0000\u0000"+
		"\u00a5\u009c\u0001\u0000\u0000\u0000\u00a5\u009f\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a2\u0001\u0000\u0000\u0000\u00a6\t\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0003\f\u0006\u0000\u00a8\u00a9\u0005\u0012\u0000\u0000\u00a9\u00aa"+
		"\u0003*\u0015\u0000\u00aa\u00ab\u0005\u0011\u0000\u0000\u00ab\u00ac\u0006"+
		"\u0005\uffff\uffff\u0000\u00ac\u000b\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0003L&\u0000\u00ae\u00af\u0006\u0006\uffff\uffff\u0000\u00af\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0003L&\u0000\u00b1\u00b2\u0005\u0013\u0000"+
		"\u0000\u00b2\u00b3\u0003*\u0015\u0000\u00b3\u00b4\u0005\u0014\u0000\u0000"+
		"\u00b4\u00b5\u0006\u0006\uffff\uffff\u0000\u00b5\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b6\u00ad\u0001\u0000\u0000\u0000\u00b6\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b7\r\u0001\u0000\u0000\u0000\u00b8\u00b9\u0003\u0010\b\u0000"+
		"\u00b9\u00ba\u0006\u0007\uffff\uffff\u0000\u00ba\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0003\u0012\t\u0000\u00bc\u00bd\u0006\u0007\uffff\uffff"+
		"\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00b8\u0001\u0000\u0000"+
		"\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00bf\u000f\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0003P(\u0000\u00c1\u00c2\u0003L&\u0000\u00c2\u00c7"+
		"\u0006\b\uffff\uffff\u0000\u00c3\u00c4\u0005\u0012\u0000\u0000\u00c4\u00c5"+
		"\u0003*\u0015\u0000\u00c5\u00c6\u0006\b\uffff\uffff\u0000\u00c6\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c3\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0005\u0011\u0000\u0000\u00ca\u0011\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0006\t\uffff\uffff\u0000\u00cc\u00cd\u0003P(\u0000\u00cd\u00ce\u0005"+
		"\u0013\u0000\u0000\u00ce\u00cf\u0005)\u0000\u0000\u00cf\u00d0\u0005\u0014"+
		"\u0000\u0000\u00d0\u00d4\u0003L&\u0000\u00d1\u00d2\u0003\u0014\n\u0000"+
		"\u00d2\u00d3\u0006\t\uffff\uffff\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0011\u0000\u0000"+
		"\u00d7\u00d8\u0006\t\uffff\uffff\u0000\u00d8\u0013\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0005\u0012\u0000\u0000\u00da\u00db\u0003\u0016\u000b\u0000"+
		"\u00db\u00dc\u0006\n\uffff\uffff\u0000\u00dc\u0015\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0006\u000b\uffff\uffff\u0000\u00de\u00e5\u0005\u0013\u0000"+
		"\u0000\u00df\u00e0\u0003H$\u0000\u00e0\u00e1\u0006\u000b\uffff\uffff\u0000"+
		"\u00e1\u00e6\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003L&\u0000\u00e3\u00e4"+
		"\u0006\u000b\uffff\uffff\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5"+
		"\u00df\u0001\u0000\u0000\u0000\u00e5\u00e2\u0001\u0000\u0000\u0000\u00e6"+
		"\u00f2\u0001\u0000\u0000\u0000\u00e7\u00ee\u0005\u000e\u0000\u0000\u00e8"+
		"\u00e9\u0003H$\u0000\u00e9\u00ea\u0006\u000b\uffff\uffff\u0000\u00ea\u00ef"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0003L&\u0000\u00ec\u00ed\u0006\u000b"+
		"\uffff\uffff\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f0\u00e7\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0005\u0014\u0000\u0000\u00f6\u0017\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0005\u0006\u0000\u0000\u00f8\u00f9\u0005"+
		"\u000b\u0000\u0000\u00f9\u00fa\u0003\u001a\r\u0000\u00fa\u00fb\u0005\f"+
		"\u0000\u0000\u00fb\u00fc\u0005\u0011\u0000\u0000\u00fc\u00fd\u0006\f\uffff"+
		"\uffff\u0000\u00fd\u0019\u0001\u0000\u0000\u0000\u00fe\u00ff\u0003\f\u0006"+
		"\u0000\u00ff\u0100\u0006\r\uffff\uffff\u0000\u0100\u0105\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0003\u001c\u000e\u0000\u0102\u0103\u0006\r\uffff\uffff"+
		"\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u00fe\u0001\u0000\u0000"+
		"\u0000\u0104\u0101\u0001\u0000\u0000\u0000\u0105\u001b\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0003\u001e\u000f\u0000\u0107\u0108\u0006\u000e\uffff"+
		"\uffff\u0000\u0108\u010d\u0001\u0000\u0000\u0000\u0109\u010a\u0003 \u0010"+
		"\u0000\u010a\u010b\u0006\u000e\uffff\uffff\u0000\u010b\u010d\u0001\u0000"+
		"\u0000\u0000\u010c\u0106\u0001\u0000\u0000\u0000\u010c\u0109\u0001\u0000"+
		"\u0000\u0000\u010d\u001d\u0001\u0000\u0000\u0000\u010e\u010f\u0005\u0013"+
		"\u0000\u0000\u010f\u0110\u0005\u0015\u0000\u0000\u0110\u0111\u0003N\'"+
		"\u0000\u0111\u0112\u0005\u000b\u0000\u0000\u0112\u0113\u0003\f\u0006\u0000"+
		"\u0113\u0114\u0005\f\u0000\u0000\u0114\u0115\u0005\u0014\u0000\u0000\u0115"+
		"\u0116\u0006\u000f\uffff\uffff\u0000\u0116\u001f\u0001\u0000\u0000\u0000"+
		"\u0117\u0118\u0005\u0013\u0000\u0000\u0118\u0119\u0003N\'\u0000\u0119"+
		"\u011a\u0005\u000b\u0000\u0000\u011a\u011b\u0005\u0015\u0000\u0000\u011b"+
		"\u011c\u0005\f\u0000\u0000\u011c\u011d\u0005\u0014\u0000\u0000\u011d\u011e"+
		"\u0006\u0010\uffff\uffff\u0000\u011e!\u0001\u0000\u0000\u0000\u011f\u0126"+
		"\u0005\u0007\u0000\u0000\u0120\u0121\u0003H$\u0000\u0121\u0122\u0006\u0011"+
		"\uffff\uffff\u0000\u0122\u0127\u0001\u0000\u0000\u0000\u0123\u0124\u0003"+
		"L&\u0000\u0124\u0125\u0006\u0011\uffff\uffff\u0000\u0125\u0127\u0001\u0000"+
		"\u0000\u0000\u0126\u0120\u0001\u0000\u0000\u0000\u0126\u0123\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0005\u0011\u0000\u0000\u0129\u012a\u0006\u0011"+
		"\uffff\uffff\u0000\u012a#\u0001\u0000\u0000\u0000\u012b\u012c\u0006\u0012"+
		"\uffff\uffff\u0000\u012c\u012d\u0005\b\u0000\u0000\u012d\u012e\u0005\u000b"+
		"\u0000\u0000\u012e\u012f\u0003L&\u0000\u012f\u0130\u0005\r\u0000\u0000"+
		"\u0130\u0131\u0003L&\u0000\u0131\u0132\u0005\f\u0000\u0000\u0132\u0138"+
		"\u0005\u000f\u0000\u0000\u0133\u0134\u0003\b\u0004\u0000\u0134\u0135\u0006"+
		"\u0012\uffff\uffff\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0133"+
		"\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136"+
		"\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013b"+
		"\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0005\u0010\u0000\u0000\u013c\u013d\u0006\u0012\uffff\uffff\u0000\u013d"+
		"%\u0001\u0000\u0000\u0000\u013e\u013f\u0003N\'\u0000\u013f\u0140\u0005"+
		"\u000b\u0000\u0000\u0140\u0141\u0003\f\u0006\u0000\u0141\u0142\u0005\f"+
		"\u0000\u0000\u0142\u0143\u0006\u0013\uffff\uffff\u0000\u0143\'\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u0006\u0014\uffff\uffff\u0000\u0145\u0146\u0005"+
		"\u000b\u0000\u0000\u0146\u0147\u0003*\u0015\u0000\u0147\u0148\u0005\f"+
		"\u0000\u0000\u0148\u0149\u0005\u0016\u0000\u0000\u0149\u014d\u0005\u000b"+
		"\u0000\u0000\u014a\u014b\u0003\b\u0004\u0000\u014b\u014c\u0006\u0014\uffff"+
		"\uffff\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u014a\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000"+
		"\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0005\f\u0000\u0000\u0152\u0153\u0006\u0014\uffff"+
		"\uffff\u0000\u0153)\u0001\u0000\u0000\u0000\u0154\u0155\u0003.\u0017\u0000"+
		"\u0155\u0156\u0003,\u0016\u0000\u0156\u0157\u0006\u0015\uffff\uffff\u0000"+
		"\u0157+\u0001\u0000\u0000\u0000\u0158\u0159\u0005\u0017\u0000\u0000\u0159"+
		"\u015a\u0003.\u0017\u0000\u015a\u015b\u0003,\u0016\u0000\u015b\u015c\u0006"+
		"\u0016\uffff\uffff\u0000\u015c\u015d\u0006\u0016\uffff\uffff\u0000\u015d"+
		"\u0160\u0001\u0000\u0000\u0000\u015e\u0160\u0006\u0016\uffff\uffff\u0000"+
		"\u015f\u0158\u0001\u0000\u0000\u0000\u015f\u015e\u0001\u0000\u0000\u0000"+
		"\u0160-\u0001\u0000\u0000\u0000\u0161\u0162\u00032\u0019\u0000\u0162\u0163"+
		"\u00030\u0018\u0000\u0163\u0164\u0006\u0017\uffff\uffff\u0000\u0164/\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0005\u0018\u0000\u0000\u0166\u0167\u0003"+
		"2\u0019\u0000\u0167\u0168\u00030\u0018\u0000\u0168\u0169\u0006\u0018\uffff"+
		"\uffff\u0000\u0169\u016a\u0006\u0018\uffff\uffff\u0000\u016a\u016d\u0001"+
		"\u0000\u0000\u0000\u016b\u016d\u0006\u0018\uffff\uffff\u0000\u016c\u0165"+
		"\u0001\u0000\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016d1\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u00036\u001b\u0000\u016f\u0170\u00034\u001a"+
		"\u0000\u0170\u0171\u0006\u0019\uffff\uffff\u0000\u01713\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0005\u0019\u0000\u0000\u0173\u0177\u0006\u001a\uffff"+
		"\uffff\u0000\u0174\u0175\u0005#\u0000\u0000\u0175\u0177\u0006\u001a\uffff"+
		"\uffff\u0000\u0176\u0172\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000"+
		"\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u00036\u001b"+
		"\u0000\u0179\u017a\u00034\u001a\u0000\u017a\u017b\u0006\u001a\uffff\uffff"+
		"\u0000\u017b\u017c\u0006\u001a\uffff\uffff\u0000\u017c\u017f\u0001\u0000"+
		"\u0000\u0000\u017d\u017f\u0006\u001a\uffff\uffff\u0000\u017e\u0176\u0001"+
		"\u0000\u0000\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017f5\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0003:\u001d\u0000\u0181\u0182\u00038\u001c\u0000"+
		"\u0182\u0183\u0006\u001b\uffff\uffff\u0000\u01837\u0001\u0000\u0000\u0000"+
		"\u0184\u0185\u0005\u001b\u0000\u0000\u0185\u018d\u0006\u001c\uffff\uffff"+
		"\u0000\u0186\u0187\u0005\u001d\u0000\u0000\u0187\u018d\u0006\u001c\uffff"+
		"\uffff\u0000\u0188\u0189\u0005\u001a\u0000\u0000\u0189\u018d\u0006\u001c"+
		"\uffff\uffff\u0000\u018a\u018b\u0005\u001c\u0000\u0000\u018b\u018d\u0006"+
		"\u001c\uffff\uffff\u0000\u018c\u0184\u0001\u0000\u0000\u0000\u018c\u0186"+
		"\u0001\u0000\u0000\u0000\u018c\u0188\u0001\u0000\u0000\u0000\u018c\u018a"+
		"\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0003:\u001d\u0000\u018f\u0190\u00038\u001c\u0000\u0190\u0191\u0006\u001c"+
		"\uffff\uffff\u0000\u0191\u0192\u0006\u001c\uffff\uffff\u0000\u0192\u0195"+
		"\u0001\u0000\u0000\u0000\u0193\u0195\u0006\u001c\uffff\uffff\u0000\u0194"+
		"\u018c\u0001\u0000\u0000\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0195"+
		"9\u0001\u0000\u0000\u0000\u0196\u0197\u0003>\u001f\u0000\u0197\u0198\u0003"+
		"<\u001e\u0000\u0198\u0199\u0006\u001d\uffff\uffff\u0000\u0199;\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u0005\u001e\u0000\u0000\u019b\u019f\u0006\u001e"+
		"\uffff\uffff\u0000\u019c\u019d\u0005\u001f\u0000\u0000\u019d\u019f\u0006"+
		"\u001e\uffff\uffff\u0000\u019e\u019a\u0001\u0000\u0000\u0000\u019e\u019c"+
		"\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a1"+
		"\u0003>\u001f\u0000\u01a1\u01a2\u0003<\u001e\u0000\u01a2\u01a3\u0006\u001e"+
		"\uffff\uffff\u0000\u01a3\u01a4\u0006\u001e\uffff\uffff\u0000\u01a4\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a7\u0006\u001e\uffff\uffff\u0000\u01a6"+
		"\u019e\u0001\u0000\u0000\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a7"+
		"=\u0001\u0000\u0000\u0000\u01a8\u01a9\u0003B!\u0000\u01a9\u01aa\u0003"+
		"@ \u0000\u01aa\u01ab\u0006\u001f\uffff\uffff\u0000\u01ab?\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ad\u0005 \u0000\u0000\u01ad\u01b3\u0006 \uffff\uffff"+
		"\u0000\u01ae\u01af\u0005\"\u0000\u0000\u01af\u01b3\u0006 \uffff\uffff"+
		"\u0000\u01b0\u01b1\u0005!\u0000\u0000\u01b1\u01b3\u0006 \uffff\uffff\u0000"+
		"\u01b2\u01ac\u0001\u0000\u0000\u0000\u01b2\u01ae\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b5\u0003B!\u0000\u01b5\u01b6\u0003@ \u0000\u01b6\u01b7\u0006"+
		" \uffff\uffff\u0000\u01b7\u01b8\u0006 \uffff\uffff\u0000\u01b8\u01bb\u0001"+
		"\u0000\u0000\u0000\u01b9\u01bb\u0006 \uffff\uffff\u0000\u01ba\u01b2\u0001"+
		"\u0000\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bbA\u0001\u0000"+
		"\u0000\u0000\u01bc\u01bd\u0003D\"\u0000\u01bd\u01be\u0006!\uffff\uffff"+
		"\u0000\u01be\u01cb\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005\u001e\u0000"+
		"\u0000\u01c0\u01c6\u0006!\uffff\uffff\u0000\u01c1\u01c2\u0005\u001f\u0000"+
		"\u0000\u01c2\u01c6\u0006!\uffff\uffff\u0000\u01c3\u01c4\u0005$\u0000\u0000"+
		"\u01c4\u01c6\u0006!\uffff\uffff\u0000\u01c5\u01bf\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c1\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c8\u0003D\"\u0000\u01c8"+
		"\u01c9\u0006!\uffff\uffff\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca"+
		"\u01bc\u0001\u0000\u0000\u0000\u01ca\u01c5\u0001\u0000\u0000\u0000\u01cb"+
		"C\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005\u000b\u0000\u0000\u01cd\u01ce"+
		"\u0003*\u0015\u0000\u01ce\u01cf\u0005\f\u0000\u0000\u01cf\u01d0\u0006"+
		"\"\uffff\uffff\u0000\u01d0\u01de\u0001\u0000\u0000\u0000\u01d1\u01d2\u0003"+
		"\f\u0006\u0000\u01d2\u01d3\u0006\"\uffff\uffff\u0000\u01d3\u01de\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d5\u0003H$\u0000\u01d5\u01d6\u0006\"\uffff"+
		"\uffff\u0000\u01d6\u01de\u0001\u0000\u0000\u0000\u01d7\u01d8\u0003\u001e"+
		"\u000f\u0000\u01d8\u01d9\u0006\"\uffff\uffff\u0000\u01d9\u01de\u0001\u0000"+
		"\u0000\u0000\u01da\u01db\u0003F#\u0000\u01db\u01dc\u0006\"\uffff\uffff"+
		"\u0000\u01dc\u01de\u0001\u0000\u0000\u0000\u01dd\u01cc\u0001\u0000\u0000"+
		"\u0000\u01dd\u01d1\u0001\u0000\u0000\u0000\u01dd\u01d4\u0001\u0000\u0000"+
		"\u0000\u01dd\u01d7\u0001\u0000\u0000\u0000\u01dd\u01da\u0001\u0000\u0000"+
		"\u0000\u01deE\u0001\u0000\u0000\u0000\u01df\u01e0\u0006#\uffff\uffff\u0000"+
		"\u01e0\u01e1\u0003L&\u0000\u01e1\u01ed\u0005\u000b\u0000\u0000\u01e2\u01e3"+
		"\u0003*\u0015\u0000\u01e3\u01ea\u0006#\uffff\uffff\u0000\u01e4\u01e5\u0005"+
		"\u000e\u0000\u0000\u01e5\u01e6\u0003*\u0015\u0000\u01e6\u01e7\u0006#\uffff"+
		"\uffff\u0000\u01e7\u01e9\u0001\u0000\u0000\u0000\u01e8\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e9\u01ec\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000"+
		"\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ee\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ed\u01e2\u0001\u0000"+
		"\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f0\u0005\f\u0000\u0000\u01f0\u01f1\u0006#\uffff"+
		"\uffff\u0000\u01f1G\u0001\u0000\u0000\u0000\u01f2\u01f3\u0003J%\u0000"+
		"\u01f3\u01f4\u0006$\uffff\uffff\u0000\u01f4\u01fe\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f6\u0005\t\u0000\u0000\u01f6\u01fe\u0006$\uffff\uffff\u0000"+
		"\u01f7\u01f8\u0005\n\u0000\u0000\u01f8\u01fe\u0006$\uffff\uffff\u0000"+
		"\u01f9\u01fa\u0005\u001f\u0000\u0000\u01fa\u01fb\u0003J%\u0000\u01fb\u01fc"+
		"\u0006$\uffff\uffff\u0000\u01fc\u01fe\u0001\u0000\u0000\u0000\u01fd\u01f2"+
		"\u0001\u0000\u0000\u0000\u01fd\u01f5\u0001\u0000\u0000\u0000\u01fd\u01f7"+
		"\u0001\u0000\u0000\u0000\u01fd\u01f9\u0001\u0000\u0000\u0000\u01feI\u0001"+
		"\u0000\u0000\u0000\u01ff\u0200\u0005)\u0000\u0000\u0200\u0204\u0006%\uffff"+
		"\uffff\u0000\u0201\u0202\u0005*\u0000\u0000\u0202\u0204\u0006%\uffff\uffff"+
		"\u0000\u0203\u01ff\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000"+
		"\u0000\u0204K\u0001\u0000\u0000\u0000\u0205\u0206\u0005\'\u0000\u0000"+
		"\u0206\u0207\u0006&\uffff\uffff\u0000\u0207M\u0001\u0000\u0000\u0000\u0208"+
		"\u0209\u0005(\u0000\u0000\u0209\u020a\u0006\'\uffff\uffff\u0000\u020a"+
		"O\u0001\u0000\u0000\u0000\u020b\u020c\u0005\u0002\u0000\u0000\u020c\u0212"+
		"\u0006(\uffff\uffff\u0000\u020d\u020e\u0005\u0003\u0000\u0000\u020e\u0212"+
		"\u0006(\uffff\uffff\u0000\u020f\u0210\u0005\u0004\u0000\u0000\u0210\u0212"+
		"\u0006(\uffff\uffff\u0000\u0211\u020b\u0001\u0000\u0000\u0000\u0211\u020d"+
		"\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0212Q\u0001"+
		"\u0000\u0000\u0000$Xjmx\u0089\u00a5\u00b6\u00be\u00c7\u00d4\u00e5\u00ee"+
		"\u00f2\u0104\u010c\u0126\u0138\u014f\u015f\u016c\u0176\u017e\u018c\u0194"+
		"\u019e\u01a6\u01b2\u01ba\u01c5\u01ca\u01dd\u01ea\u01ed\u01fd\u0203\u0211";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}