// Generated from D:/UNI/Semester 8/Compilers/Project/Trial 2/CoolCompiler/src/main/antlr/COOLLexer.g4 by ANTLR 4.13.2
package main.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class COOLLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLASS", "ELSE", "FALSE", "FI", "IF", "IN", "INHERITS", "ISVOID", "LET", 
			"LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "NEW", "OF", "NOT", 
			"TRUE", "AT", "DOT", "COMP", "MUL", "DIV", "ADD", "SUB", "LE", "LT", 
			"EQUAL", "ASSIGN", "DARROW", "COMMA", "SEMICOLON", "COLON", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "TYPE_ID", "ID", "INT", "STRING", "WHITESPACE", 
			"SINGLECOMMENT", "MULTICOMMENT"
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


	public COOLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "COOLLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000-\u011f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#"+
		"\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0005&\u00e4\b&\n&\f"+
		"&\u00e7\t&\u0001\'\u0001\'\u0005\'\u00eb\b\'\n\'\f\'\u00ee\t\'\u0001("+
		"\u0004(\u00f1\b(\u000b(\f(\u00f2\u0001)\u0001)\u0001)\u0001)\u0005)\u00f9"+
		"\b)\n)\f)\u00fc\t)\u0001)\u0001)\u0001*\u0004*\u0101\b*\u000b*\f*\u0102"+
		"\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0005+\u010b\b+\n+\f+\u010e"+
		"\t+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0005,\u0116\b,\n,\f,\u0119"+
		"\t,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001\u0117\u0000-\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O("+
		"Q)S*U+W,Y-\u0001\u0000\b\u0001\u0000AZ\u0004\u000009AZ__az\u0001\u0000"+
		"az\u0001\u000009\u0006\u0000\"\"\\\\bbffnntt\u0003\u0000\n\n\r\r\\\\\u0003"+
		"\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u0126\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"+
		"\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?"+
		"\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000"+
		"\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000"+
		"\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M"+
		"\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000"+
		"\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000"+
		"\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0001["+
		"\u0001\u0000\u0000\u0000\u0003a\u0001\u0000\u0000\u0000\u0005f\u0001\u0000"+
		"\u0000\u0000\u0007l\u0001\u0000\u0000\u0000\to\u0001\u0000\u0000\u0000"+
		"\u000br\u0001\u0000\u0000\u0000\ru\u0001\u0000\u0000\u0000\u000f~\u0001"+
		"\u0000\u0000\u0000\u0011\u0085\u0001\u0000\u0000\u0000\u0013\u0089\u0001"+
		"\u0000\u0000\u0000\u0015\u008e\u0001\u0000\u0000\u0000\u0017\u0093\u0001"+
		"\u0000\u0000\u0000\u0019\u0098\u0001\u0000\u0000\u0000\u001b\u009e\u0001"+
		"\u0000\u0000\u0000\u001d\u00a3\u0001\u0000\u0000\u0000\u001f\u00a8\u0001"+
		"\u0000\u0000\u0000!\u00ac\u0001\u0000\u0000\u0000#\u00af\u0001\u0000\u0000"+
		"\u0000%\u00b3\u0001\u0000\u0000\u0000\'\u00b8\u0001\u0000\u0000\u0000"+
		")\u00ba\u0001\u0000\u0000\u0000+\u00bc\u0001\u0000\u0000\u0000-\u00be"+
		"\u0001\u0000\u0000\u0000/\u00c0\u0001\u0000\u0000\u00001\u00c2\u0001\u0000"+
		"\u0000\u00003\u00c4\u0001\u0000\u0000\u00005\u00c6\u0001\u0000\u0000\u0000"+
		"7\u00c9\u0001\u0000\u0000\u00009\u00cb\u0001\u0000\u0000\u0000;\u00cd"+
		"\u0001\u0000\u0000\u0000=\u00d0\u0001\u0000\u0000\u0000?\u00d3\u0001\u0000"+
		"\u0000\u0000A\u00d5\u0001\u0000\u0000\u0000C\u00d7\u0001\u0000\u0000\u0000"+
		"E\u00d9\u0001\u0000\u0000\u0000G\u00db\u0001\u0000\u0000\u0000I\u00dd"+
		"\u0001\u0000\u0000\u0000K\u00df\u0001\u0000\u0000\u0000M\u00e1\u0001\u0000"+
		"\u0000\u0000O\u00e8\u0001\u0000\u0000\u0000Q\u00f0\u0001\u0000\u0000\u0000"+
		"S\u00f4\u0001\u0000\u0000\u0000U\u0100\u0001\u0000\u0000\u0000W\u0106"+
		"\u0001\u0000\u0000\u0000Y\u0111\u0001\u0000\u0000\u0000[\\\u0005c\u0000"+
		"\u0000\\]\u0005l\u0000\u0000]^\u0005a\u0000\u0000^_\u0005s\u0000\u0000"+
		"_`\u0005s\u0000\u0000`\u0002\u0001\u0000\u0000\u0000ab\u0005e\u0000\u0000"+
		"bc\u0005l\u0000\u0000cd\u0005s\u0000\u0000de\u0005e\u0000\u0000e\u0004"+
		"\u0001\u0000\u0000\u0000fg\u0005f\u0000\u0000gh\u0005a\u0000\u0000hi\u0005"+
		"l\u0000\u0000ij\u0005s\u0000\u0000jk\u0005e\u0000\u0000k\u0006\u0001\u0000"+
		"\u0000\u0000lm\u0005f\u0000\u0000mn\u0005i\u0000\u0000n\b\u0001\u0000"+
		"\u0000\u0000op\u0005i\u0000\u0000pq\u0005f\u0000\u0000q\n\u0001\u0000"+
		"\u0000\u0000rs\u0005i\u0000\u0000st\u0005n\u0000\u0000t\f\u0001\u0000"+
		"\u0000\u0000uv\u0005i\u0000\u0000vw\u0005n\u0000\u0000wx\u0005h\u0000"+
		"\u0000xy\u0005e\u0000\u0000yz\u0005r\u0000\u0000z{\u0005i\u0000\u0000"+
		"{|\u0005t\u0000\u0000|}\u0005s\u0000\u0000}\u000e\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005i\u0000\u0000\u007f\u0080\u0005s\u0000\u0000\u0080\u0081"+
		"\u0005v\u0000\u0000\u0081\u0082\u0005o\u0000\u0000\u0082\u0083\u0005i"+
		"\u0000\u0000\u0083\u0084\u0005d\u0000\u0000\u0084\u0010\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005l\u0000\u0000\u0086\u0087\u0005e\u0000\u0000\u0087"+
		"\u0088\u0005t\u0000\u0000\u0088\u0012\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005l\u0000\u0000\u008a\u008b\u0005o\u0000\u0000\u008b\u008c\u0005o"+
		"\u0000\u0000\u008c\u008d\u0005p\u0000\u0000\u008d\u0014\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005p\u0000\u0000\u008f\u0090\u0005o\u0000\u0000\u0090"+
		"\u0091\u0005o\u0000\u0000\u0091\u0092\u0005l\u0000\u0000\u0092\u0016\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0005t\u0000\u0000\u0094\u0095\u0005h\u0000"+
		"\u0000\u0095\u0096\u0005e\u0000\u0000\u0096\u0097\u0005n\u0000\u0000\u0097"+
		"\u0018\u0001\u0000\u0000\u0000\u0098\u0099\u0005w\u0000\u0000\u0099\u009a"+
		"\u0005h\u0000\u0000\u009a\u009b\u0005i\u0000\u0000\u009b\u009c\u0005l"+
		"\u0000\u0000\u009c\u009d\u0005e\u0000\u0000\u009d\u001a\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005c\u0000\u0000\u009f\u00a0\u0005a\u0000\u0000\u00a0"+
		"\u00a1\u0005s\u0000\u0000\u00a1\u00a2\u0005e\u0000\u0000\u00a2\u001c\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005e\u0000\u0000\u00a4\u00a5\u0005s\u0000"+
		"\u0000\u00a5\u00a6\u0005a\u0000\u0000\u00a6\u00a7\u0005c\u0000\u0000\u00a7"+
		"\u001e\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005n\u0000\u0000\u00a9\u00aa"+
		"\u0005e\u0000\u0000\u00aa\u00ab\u0005w\u0000\u0000\u00ab \u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0005o\u0000\u0000\u00ad\u00ae\u0005f\u0000\u0000"+
		"\u00ae\"\u0001\u0000\u0000\u0000\u00af\u00b0\u0005n\u0000\u0000\u00b0"+
		"\u00b1\u0005o\u0000\u0000\u00b1\u00b2\u0005t\u0000\u0000\u00b2$\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0005t\u0000\u0000\u00b4\u00b5\u0005r\u0000"+
		"\u0000\u00b5\u00b6\u0005u\u0000\u0000\u00b6\u00b7\u0005e\u0000\u0000\u00b7"+
		"&\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005@\u0000\u0000\u00b9(\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0005.\u0000\u0000\u00bb*\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0005~\u0000\u0000\u00bd,\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0005*\u0000\u0000\u00bf.\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005"+
		"/\u0000\u0000\u00c10\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005+\u0000"+
		"\u0000\u00c32\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005-\u0000\u0000\u00c5"+
		"4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005<\u0000\u0000\u00c7\u00c8\u0005"+
		"=\u0000\u0000\u00c86\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005<\u0000"+
		"\u0000\u00ca8\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005=\u0000\u0000\u00cc"+
		":\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005<\u0000\u0000\u00ce\u00cf\u0005"+
		"-\u0000\u0000\u00cf<\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005=\u0000"+
		"\u0000\u00d1\u00d2\u0005>\u0000\u0000\u00d2>\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0005,\u0000\u0000\u00d4@\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005"+
		";\u0000\u0000\u00d6B\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005:\u0000"+
		"\u0000\u00d8D\u0001\u0000\u0000\u0000\u00d9\u00da\u0005(\u0000\u0000\u00da"+
		"F\u0001\u0000\u0000\u0000\u00db\u00dc\u0005)\u0000\u0000\u00dcH\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0005{\u0000\u0000\u00deJ\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0005}\u0000\u0000\u00e0L\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e5\u0007\u0000\u0000\u0000\u00e2\u00e4\u0007\u0001\u0000\u0000\u00e3"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6"+
		"N\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00ec"+
		"\u0007\u0002\u0000\u0000\u00e9\u00eb\u0007\u0001\u0000\u0000\u00ea\u00e9"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00edP\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f1\u0007"+
		"\u0003\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f3R\u0001\u0000\u0000\u0000\u00f4\u00fa\u0005\""+
		"\u0000\u0000\u00f5\u00f6\u0005\\\u0000\u0000\u00f6\u00f9\u0007\u0004\u0000"+
		"\u0000\u00f7\u00f9\b\u0005\u0000\u0000\u00f8\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0005\"\u0000\u0000\u00feT\u0001\u0000\u0000\u0000\u00ff"+
		"\u0101\u0007\u0006\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0006*\u0000\u0000\u0105V\u0001\u0000\u0000\u0000\u0106\u0107\u0005"+
		"-\u0000\u0000\u0107\u0108\u0005-\u0000\u0000\u0108\u010c\u0001\u0000\u0000"+
		"\u0000\u0109\u010b\b\u0007\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000"+
		"\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0110\u0006+\u0000\u0000\u0110"+
		"X\u0001\u0000\u0000\u0000\u0111\u0112\u0005(\u0000\u0000\u0112\u0113\u0005"+
		"*\u0000\u0000\u0113\u0117\u0001\u0000\u0000\u0000\u0114\u0116\t\u0000"+
		"\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000"+
		"\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0005*\u0000\u0000\u011b\u011c\u0005)\u0000\u0000"+
		"\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0006,\u0000\u0000\u011e"+
		"Z\u0001\u0000\u0000\u0000\t\u0000\u00e5\u00ec\u00f2\u00f8\u00fa\u0102"+
		"\u010c\u0117\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}