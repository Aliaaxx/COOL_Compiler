// Generated from D:/UNI/Semester 8/Compilers/Project/Trial 2/CoolCompiler/src/main/antlr/COOLParser.g4 by ANTLR 4.13.2
package main.generated.main.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class COOLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, ELSE=2, FALSE=3, FI=4, IF=5, IN=6, INHERITS=7, ISVOID=8, LET=9, 
		LOOP=10, POOL=11, THEN=12, WHILE=13, CASE=14, ESAC=15, NEW=16, OF=17, 
		NOT=18, TRUE=19, AT=20, DOT=21, COMP=22, MUL=23, DIV=24, ADD=25, SUB=26, 
		LE=27, LT=28, EQUAL=29, ASSIGN=30, DARROW=31, COMMA=32, SEMICOLON=33, 
		COLON=34, LPAREN=35, RPAREN=36, LBRACE=37, RBRACE=38, TYPE_ID=39, ID=40, 
		INT=41, STRING=42, WHITESPACE=43, SINGLECOMMENT=44, MULTICOMMENT=45;
	public static final int
		RULE_program = 0, RULE_classDef = 1, RULE_feature = 2, RULE_formal = 3, 
		RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDef", "feature", "formal", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'else'", "'false'", "'fi'", "'if'", "'in'", "'inherits'", 
			"'isvoid'", "'let'", "'loop'", "'pool'", "'then'", "'while'", "'case'", 
			"'esac'", "'new'", "'of'", "'not'", "'true'", "'@'", "'.'", "'~'", "'*'", 
			"'/'", "'+'", "'-'", "'<='", "'<'", "'='", "'<-'", "'=>'", "','", "';'", 
			"':'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "ELSE", "FALSE", "FI", "IF", "IN", "INHERITS", "ISVOID", 
			"LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "NEW", "OF", 
			"NOT", "TRUE", "AT", "DOT", "COMP", "MUL", "DIV", "ADD", "SUB", "LE", 
			"LT", "EQUAL", "ASSIGN", "DARROW", "COMMA", "SEMICOLON", "COLON", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "TYPE_ID", "ID", "INT", "STRING", "WHITESPACE", 
			"SINGLECOMMENT", "MULTICOMMENT"
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
	public String getGrammarFileName() { return "COOLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public COOLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(COOLParser.EOF, 0); }
		public List<ClassDefContext> classDef() {
			return getRuleContexts(ClassDefContext.class);
		}
		public ClassDefContext classDef(int i) {
			return getRuleContext(ClassDefContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(COOLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(COOLParser.SEMICOLON, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				classDef();
				setState(11);
				match(SEMICOLON);
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
			setState(17);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(COOLParser.CLASS, 0); }
		public List<TerminalNode> TYPE_ID() { return getTokens(COOLParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(COOLParser.TYPE_ID, i);
		}
		public TerminalNode LBRACE() { return getToken(COOLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(COOLParser.RBRACE, 0); }
		public TerminalNode INHERITS() { return getToken(COOLParser.INHERITS, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(COOLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(COOLParser.SEMICOLON, i);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(CLASS);
			setState(20);
			match(TYPE_ID);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(21);
				match(INHERITS);
				setState(22);
				match(TYPE_ID);
				}
			}

			setState(25);
			match(LBRACE);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(26);
				feature();
				setState(27);
				match(SEMICOLON);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(RBRACE);
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
	public static class FeatureContext extends ParserRuleContext {
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	 
		public FeatureContext() { }
		public void copyFrom(FeatureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeFeatureContext extends FeatureContext {
		public TerminalNode ID() { return getToken(COOLParser.ID, 0); }
		public TerminalNode COLON() { return getToken(COOLParser.COLON, 0); }
		public TerminalNode TYPE_ID() { return getToken(COOLParser.TYPE_ID, 0); }
		public TerminalNode ASSIGN() { return getToken(COOLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttributeFeatureContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterAttributeFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitAttributeFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitAttributeFeature(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodFeatureContext extends FeatureContext {
		public TerminalNode ID() { return getToken(COOLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(COOLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(COOLParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(COOLParser.COLON, 0); }
		public TerminalNode TYPE_ID() { return getToken(COOLParser.TYPE_ID, 0); }
		public TerminalNode LBRACE() { return getToken(COOLParser.LBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(COOLParser.RBRACE, 0); }
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(COOLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(COOLParser.COMMA, i);
		}
		public MethodFeatureContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterMethodFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitMethodFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitMethodFeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		int _la;
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new MethodFeatureContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(ID);
				setState(37);
				match(LPAREN);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(38);
					formal();
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(39);
						match(COMMA);
						setState(40);
						formal();
						}
						}
						setState(45);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(48);
				match(RPAREN);
				setState(49);
				match(COLON);
				setState(50);
				match(TYPE_ID);
				setState(51);
				match(LBRACE);
				setState(52);
				expr(0);
				setState(53);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new AttributeFeatureContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(ID);
				setState(56);
				match(COLON);
				setState(57);
				match(TYPE_ID);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(58);
					match(ASSIGN);
					setState(59);
					expr(0);
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FormalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(COOLParser.ID, 0); }
		public TerminalNode COLON() { return getToken(COOLParser.COLON, 0); }
		public TerminalNode TYPE_ID() { return getToken(COOLParser.TYPE_ID, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitFormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ID);
			setState(65);
			match(COLON);
			setState(66);
			match(TYPE_ID);
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprWhileContext extends ExprContext {
		public TerminalNode WHILE() { return getToken(COOLParser.WHILE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LOOP() { return getToken(COOLParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(COOLParser.POOL, 0); }
		public ExprWhileContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprComparisonContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(COOLParser.LT, 0); }
		public TerminalNode LE() { return getToken(COOLParser.LE, 0); }
		public TerminalNode EQUAL() { return getToken(COOLParser.EQUAL, 0); }
		public ExprComparisonContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParenContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(COOLParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(COOLParser.RPAREN, 0); }
		public ExprParenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(COOLParser.STRING, 0); }
		public ExprStringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprCaseContext extends ExprContext {
		public TerminalNode CASE() { return getToken(COOLParser.CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OF() { return getToken(COOLParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(COOLParser.ESAC, 0); }
		public List<TerminalNode> ID() { return getTokens(COOLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(COOLParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(COOLParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(COOLParser.COLON, i);
		}
		public List<TerminalNode> TYPE_ID() { return getTokens(COOLParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(COOLParser.TYPE_ID, i);
		}
		public List<TerminalNode> DARROW() { return getTokens(COOLParser.DARROW); }
		public TerminalNode DARROW(int i) {
			return getToken(COOLParser.DARROW, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(COOLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(COOLParser.SEMICOLON, i);
		}
		public ExprCaseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprCase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprFalseContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(COOLParser.FALSE, 0); }
		public ExprFalseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIntContext extends ExprContext {
		public TerminalNode INT() { return getToken(COOLParser.INT, 0); }
		public ExprIntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprSelfDispatchContext extends ExprContext {
		public TerminalNode ID() { return getToken(COOLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(COOLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(COOLParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(COOLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(COOLParser.COMMA, i);
		}
		public ExprSelfDispatchContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprSelfDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprSelfDispatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprSelfDispatch(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNegContext extends ExprContext {
		public TerminalNode COMP() { return getToken(COOLParser.COMP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNegContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprTrueContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(COOLParser.TRUE, 0); }
		public ExprTrueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(COOLParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprDispatchContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOT() { return getToken(COOLParser.DOT, 0); }
		public TerminalNode ID() { return getToken(COOLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(COOLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(COOLParser.RPAREN, 0); }
		public TerminalNode AT() { return getToken(COOLParser.AT, 0); }
		public TerminalNode TYPE_ID() { return getToken(COOLParser.TYPE_ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(COOLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(COOLParser.COMMA, i);
		}
		public ExprDispatchContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprDispatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprDispatch(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBlockContext extends ExprContext {
		public TerminalNode LBRACE() { return getToken(COOLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(COOLParser.RBRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(COOLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(COOLParser.SEMICOLON, i);
		}
		public ExprBlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAddSubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(COOLParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(COOLParser.SUB, 0); }
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMulDivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(COOLParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(COOLParser.DIV, 0); }
		public ExprMulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLetContext extends ExprContext {
		public TerminalNode LET() { return getToken(COOLParser.LET, 0); }
		public List<TerminalNode> ID() { return getTokens(COOLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(COOLParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(COOLParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(COOLParser.COLON, i);
		}
		public List<TerminalNode> TYPE_ID() { return getTokens(COOLParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(COOLParser.TYPE_ID, i);
		}
		public TerminalNode IN() { return getToken(COOLParser.IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(COOLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(COOLParser.ASSIGN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(COOLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(COOLParser.COMMA, i);
		}
		public ExprLetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprLet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIsvoidContext extends ExprContext {
		public TerminalNode ISVOID() { return getToken(COOLParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprIsvoidContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprIsvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprIsvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprIsvoid(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNewContext extends ExprContext {
		public TerminalNode NEW() { return getToken(COOLParser.NEW, 0); }
		public TerminalNode TYPE_ID() { return getToken(COOLParser.TYPE_ID, 0); }
		public ExprNewContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprNew(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAssignContext extends ExprContext {
		public TerminalNode ID() { return getToken(COOLParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(COOLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprAssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIfContext extends ExprContext {
		public TerminalNode IF() { return getToken(COOLParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(COOLParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(COOLParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(COOLParser.FI, 0); }
		public ExprIfContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIdContext extends ExprContext {
		public TerminalNode ID() { return getToken(COOLParser.ID, 0); }
		public ExprIdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).enterExprId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof COOLParserListener ) ((COOLParserListener)listener).exitExprId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof COOLParserVisitor ) return ((COOLParserVisitor<? extends T>)visitor).visitExprId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new ExprAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(69);
				match(ID);
				setState(70);
				match(ASSIGN);
				setState(71);
				expr(21);
				}
				break;
			case 2:
				{
				_localctx = new ExprSelfDispatchContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(ID);
				setState(73);
				match(LPAREN);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7868385157928L) != 0)) {
					{
					setState(74);
					expr(0);
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(75);
						match(COMMA);
						setState(76);
						expr(0);
						}
						}
						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(84);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new ExprIfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(IF);
				setState(86);
				expr(0);
				setState(87);
				match(THEN);
				setState(88);
				expr(0);
				setState(89);
				match(ELSE);
				setState(90);
				expr(0);
				setState(91);
				match(FI);
				}
				break;
			case 4:
				{
				_localctx = new ExprWhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(WHILE);
				setState(94);
				expr(0);
				setState(95);
				match(LOOP);
				setState(96);
				expr(0);
				setState(97);
				match(POOL);
				}
				break;
			case 5:
				{
				_localctx = new ExprBlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(LBRACE);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7868385157928L) != 0)) {
					{
					{
					setState(100);
					expr(0);
					setState(101);
					match(SEMICOLON);
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				match(RBRACE);
				}
				break;
			case 6:
				{
				_localctx = new ExprLetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(LET);
				setState(110);
				match(ID);
				setState(111);
				match(COLON);
				setState(112);
				match(TYPE_ID);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(113);
					match(ASSIGN);
					setState(114);
					expr(0);
					}
				}

				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(117);
					match(COMMA);
					setState(118);
					match(ID);
					setState(119);
					match(COLON);
					setState(120);
					match(TYPE_ID);
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(121);
						match(ASSIGN);
						setState(122);
						expr(0);
						}
					}

					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				match(IN);
				setState(131);
				expr(15);
				}
				break;
			case 7:
				{
				_localctx = new ExprCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(CASE);
				setState(133);
				expr(0);
				setState(134);
				match(OF);
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(135);
					match(ID);
					setState(136);
					match(COLON);
					setState(137);
					match(TYPE_ID);
					setState(138);
					match(DARROW);
					setState(139);
					expr(0);
					setState(140);
					match(SEMICOLON);
					}
					}
					setState(144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(146);
				match(ESAC);
				}
				break;
			case 8:
				{
				_localctx = new ExprNewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(NEW);
				setState(149);
				match(TYPE_ID);
				}
				break;
			case 9:
				{
				_localctx = new ExprIsvoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(ISVOID);
				setState(151);
				expr(12);
				}
				break;
			case 10:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(NOT);
				setState(153);
				expr(8);
				}
				break;
			case 11:
				{
				_localctx = new ExprNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(COMP);
				setState(155);
				expr(7);
				}
				break;
			case 12:
				{
				_localctx = new ExprParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(LPAREN);
				setState(157);
				expr(0);
				setState(158);
				match(RPAREN);
				}
				break;
			case 13:
				{
				_localctx = new ExprIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(ID);
				}
				break;
			case 14:
				{
				_localctx = new ExprIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(INT);
				}
				break;
			case 15:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(STRING);
				}
				break;
			case 16:
				{
				_localctx = new ExprTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(TRUE);
				}
				break;
			case 17:
				{
				_localctx = new ExprFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(168);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(169);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(171);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(172);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprComparisonContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(174);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(175);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprDispatchContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(179);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AT) {
							{
							setState(177);
							match(AT);
							setState(178);
							match(TYPE_ID);
							}
						}

						setState(181);
						match(DOT);
						setState(182);
						match(ID);
						setState(183);
						match(LPAREN);
						setState(192);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7868385157928L) != 0)) {
							{
							setState(184);
							expr(0);
							setState(189);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(185);
								match(COMMA);
								setState(186);
								expr(0);
								}
								}
								setState(191);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(194);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 20);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u00c9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0018\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u001e\b\u0001\n\u0001\f\u0001!\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002*\b\u0002\n\u0002\f\u0002-\t\u0002\u0003\u0002/\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002=\b\u0002\u0003\u0002?\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004N\b"+
		"\u0004\n\u0004\f\u0004Q\t\u0004\u0003\u0004S\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004h\b\u0004\n\u0004\f\u0004k\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004t\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004|\b\u0004\u0005\u0004~\b\u0004\n\u0004\f\u0004\u0081"+
		"\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0004\u0004\u008f\b\u0004\u000b\u0004\f\u0004\u0090\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u00a6\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00b4\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00bc\b\u0004"+
		"\n\u0004\f\u0004\u00bf\t\u0004\u0003\u0004\u00c1\b\u0004\u0001\u0004\u0005"+
		"\u0004\u00c4\b\u0004\n\u0004\f\u0004\u00c7\t\u0004\u0001\u0004\u0000\u0001"+
		"\b\u0005\u0000\u0002\u0004\u0006\b\u0000\u0003\u0001\u0000\u0017\u0018"+
		"\u0001\u0000\u0019\u001a\u0001\u0000\u001b\u001d\u00e8\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0002\u0013\u0001\u0000\u0000\u0000\u0004>\u0001\u0000\u0000"+
		"\u0000\u0006@\u0001\u0000\u0000\u0000\b\u00a5\u0001\u0000\u0000\u0000"+
		"\n\u000b\u0003\u0002\u0001\u0000\u000b\f\u0005!\u0000\u0000\f\u000e\u0001"+
		"\u0000\u0000\u0000\r\n\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000"+
		"\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000"+
		"\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0012\u0005\u0000\u0000"+
		"\u0001\u0012\u0001\u0001\u0000\u0000\u0000\u0013\u0014\u0005\u0001\u0000"+
		"\u0000\u0014\u0017\u0005\'\u0000\u0000\u0015\u0016\u0005\u0007\u0000\u0000"+
		"\u0016\u0018\u0005\'\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019"+
		"\u001f\u0005%\u0000\u0000\u001a\u001b\u0003\u0004\u0002\u0000\u001b\u001c"+
		"\u0005!\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001a\u0001"+
		"\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000"+
		"!\u001f\u0001\u0000\u0000\u0000\"#\u0005&\u0000\u0000#\u0003\u0001\u0000"+
		"\u0000\u0000$%\u0005(\u0000\u0000%.\u0005#\u0000\u0000&+\u0003\u0006\u0003"+
		"\u0000\'(\u0005 \u0000\u0000(*\u0003\u0006\u0003\u0000)\'\u0001\u0000"+
		"\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		".&\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u000001\u0005$\u0000\u000012\u0005\"\u0000\u000023\u0005\'\u0000\u0000"+
		"34\u0005%\u0000\u000045\u0003\b\u0004\u000056\u0005&\u0000\u00006?\u0001"+
		"\u0000\u0000\u000078\u0005(\u0000\u000089\u0005\"\u0000\u00009<\u0005"+
		"\'\u0000\u0000:;\u0005\u001e\u0000\u0000;=\u0003\b\u0004\u0000<:\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000"+
		">$\u0001\u0000\u0000\u0000>7\u0001\u0000\u0000\u0000?\u0005\u0001\u0000"+
		"\u0000\u0000@A\u0005(\u0000\u0000AB\u0005\"\u0000\u0000BC\u0005\'\u0000"+
		"\u0000C\u0007\u0001\u0000\u0000\u0000DE\u0006\u0004\uffff\uffff\u0000"+
		"EF\u0005(\u0000\u0000FG\u0005\u001e\u0000\u0000G\u00a6\u0003\b\u0004\u0015"+
		"HI\u0005(\u0000\u0000IR\u0005#\u0000\u0000JO\u0003\b\u0004\u0000KL\u0005"+
		" \u0000\u0000LN\u0003\b\u0004\u0000MK\u0001\u0000\u0000\u0000NQ\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RJ\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T\u00a6\u0005"+
		"$\u0000\u0000UV\u0005\u0005\u0000\u0000VW\u0003\b\u0004\u0000WX\u0005"+
		"\f\u0000\u0000XY\u0003\b\u0004\u0000YZ\u0005\u0002\u0000\u0000Z[\u0003"+
		"\b\u0004\u0000[\\\u0005\u0004\u0000\u0000\\\u00a6\u0001\u0000\u0000\u0000"+
		"]^\u0005\r\u0000\u0000^_\u0003\b\u0004\u0000_`\u0005\n\u0000\u0000`a\u0003"+
		"\b\u0004\u0000ab\u0005\u000b\u0000\u0000b\u00a6\u0001\u0000\u0000\u0000"+
		"ci\u0005%\u0000\u0000de\u0003\b\u0004\u0000ef\u0005!\u0000\u0000fh\u0001"+
		"\u0000\u0000\u0000gd\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000l\u00a6\u0005&\u0000\u0000mn\u0005\t\u0000"+
		"\u0000no\u0005(\u0000\u0000op\u0005\"\u0000\u0000ps\u0005\'\u0000\u0000"+
		"qr\u0005\u001e\u0000\u0000rt\u0003\b\u0004\u0000sq\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000t\u007f\u0001\u0000\u0000\u0000uv\u0005 \u0000"+
		"\u0000vw\u0005(\u0000\u0000wx\u0005\"\u0000\u0000x{\u0005\'\u0000\u0000"+
		"yz\u0005\u001e\u0000\u0000z|\u0003\b\u0004\u0000{y\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000}u\u0001\u0000\u0000"+
		"\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0006\u0000\u0000\u0083"+
		"\u00a6\u0003\b\u0004\u000f\u0084\u0085\u0005\u000e\u0000\u0000\u0085\u0086"+
		"\u0003\b\u0004\u0000\u0086\u008e\u0005\u0011\u0000\u0000\u0087\u0088\u0005"+
		"(\u0000\u0000\u0088\u0089\u0005\"\u0000\u0000\u0089\u008a\u0005\'\u0000"+
		"\u0000\u008a\u008b\u0005\u001f\u0000\u0000\u008b\u008c\u0003\b\u0004\u0000"+
		"\u008c\u008d\u0005!\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e"+
		"\u0087\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u000f\u0000\u0000\u0093"+
		"\u00a6\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0010\u0000\u0000\u0095"+
		"\u00a6\u0005\'\u0000\u0000\u0096\u0097\u0005\b\u0000\u0000\u0097\u00a6"+
		"\u0003\b\u0004\f\u0098\u0099\u0005\u0012\u0000\u0000\u0099\u00a6\u0003"+
		"\b\u0004\b\u009a\u009b\u0005\u0016\u0000\u0000\u009b\u00a6\u0003\b\u0004"+
		"\u0007\u009c\u009d\u0005#\u0000\u0000\u009d\u009e\u0003\b\u0004\u0000"+
		"\u009e\u009f\u0005$\u0000\u0000\u009f\u00a6\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a6\u0005(\u0000\u0000\u00a1\u00a6\u0005)\u0000\u0000\u00a2\u00a6\u0005"+
		"*\u0000\u0000\u00a3\u00a6\u0005\u0013\u0000\u0000\u00a4\u00a6\u0005\u0003"+
		"\u0000\u0000\u00a5D\u0001\u0000\u0000\u0000\u00a5H\u0001\u0000\u0000\u0000"+
		"\u00a5U\u0001\u0000\u0000\u0000\u00a5]\u0001\u0000\u0000\u0000\u00a5c"+
		"\u0001\u0000\u0000\u0000\u00a5m\u0001\u0000\u0000\u0000\u00a5\u0084\u0001"+
		"\u0000\u0000\u0000\u00a5\u0094\u0001\u0000\u0000\u0000\u00a5\u0096\u0001"+
		"\u0000\u0000\u0000\u00a5\u0098\u0001\u0000\u0000\u0000\u00a5\u009a\u0001"+
		"\u0000\u0000\u0000\u00a5\u009c\u0001\u0000\u0000\u0000\u00a5\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a1\u0001\u0000\u0000\u0000\u00a5\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00c5\u0001\u0000\u0000\u0000\u00a7\u00a8\n\u000b"+
		"\u0000\u0000\u00a8\u00a9\u0007\u0000\u0000\u0000\u00a9\u00c4\u0003\b\u0004"+
		"\f\u00aa\u00ab\n\n\u0000\u0000\u00ab\u00ac\u0007\u0001\u0000\u0000\u00ac"+
		"\u00c4\u0003\b\u0004\u000b\u00ad\u00ae\n\t\u0000\u0000\u00ae\u00af\u0007"+
		"\u0002\u0000\u0000\u00af\u00c4\u0003\b\u0004\n\u00b0\u00b3\n\u0014\u0000"+
		"\u0000\u00b1\u00b2\u0005\u0014\u0000\u0000\u00b2\u00b4\u0005\'\u0000\u0000"+
		"\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0015\u0000\u0000"+
		"\u00b6\u00b7\u0005(\u0000\u0000\u00b7\u00c0\u0005#\u0000\u0000\u00b8\u00bd"+
		"\u0003\b\u0004\u0000\u00b9\u00ba\u0005 \u0000\u0000\u00ba\u00bc\u0003"+
		"\b\u0004\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c0\u00b8\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4\u0005$\u0000"+
		"\u0000\u00c3\u00a7\u0001\u0000\u0000\u0000\u00c3\u00aa\u0001\u0000\u0000"+
		"\u0000\u00c3\u00ad\u0001\u0000\u0000\u0000\u00c3\u00b0\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\t\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c5\u0001\u0000\u0000\u0000\u0014\u000f\u0017\u001f+.<>ORis{"+
		"\u007f\u0090\u00a5\u00b3\u00bd\u00c0\u00c3\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}