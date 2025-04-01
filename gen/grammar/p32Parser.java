// Generated from /home/mateusz/IdeaProjects/modprojekt/src/grammar/p32.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class p32Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, STRING=42, WS=43;
	public static final int
		RULE_program = 0, RULE_head = 1, RULE_body = 2, RULE_headElement = 3, 
		RULE_bodyElement = 4, RULE_heading = 5, RULE_content = 6, RULE_tableHeader = 7, 
		RULE_tableRow = 8, RULE_tableCell = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "head", "body", "headElement", "bodyElement", "heading", "content", 
			"tableHeader", "tableRow", "tableCell"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|{'", "'}|'", "'!{'", "'}!'", "';'", "'/;'", "'*'", "'/*'", "'@'", 
			"'/@'", "'?'", "'/?'", "'`'", "'/`'", "'%'", "'/%'", "'-'", "'/-'", "'&'", 
			"'/&'", "'$'", "'/$'", "'/|'", "'='", "'/='", "'^'", "'/^'", "'_'", "'/_'", 
			"'~'", "'/~'", "'+'", "'['", "'|'", "']'", "'######'", "'#####'", "'####'", 
			"'###'", "'##'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "STRING", "WS"
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
	public String getGrammarFileName() { return "p32.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public p32Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(p32Parser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			head();
			setState(21);
			body();
			setState(22);
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
	public static class HeadContext extends ParserRuleContext {
		public List<HeadElementContext> headElement() {
			return getRuleContexts(HeadElementContext.class);
		}
		public HeadElementContext headElement(int i) {
			return getRuleContext(HeadElementContext.class,i);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10912L) != 0)) {
				{
				{
				setState(25);
				headElement();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(T__1);
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
	public static class BodyContext extends ParserRuleContext {
		public List<BodyElementContext> bodyElement() {
			return getRuleContexts(BodyElementContext.class);
		}
		public BodyElementContext bodyElement(int i) {
			return getRuleContext(BodyElementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__2);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8741687306880L) != 0)) {
				{
				{
				setState(34);
				bodyElement();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(T__3);
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
	public static class HeadElementContext extends ParserRuleContext {
		public HeadElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headElement; }
	 
		public HeadElementContext() { }
		public void copyFrom(HeadElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TitleElementContext extends HeadElementContext {
		public TerminalNode STRING() { return getToken(p32Parser.STRING, 0); }
		public TitleElementContext(HeadElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterTitleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitTitleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitTitleElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LinkElementContext extends HeadElementContext {
		public TerminalNode STRING() { return getToken(p32Parser.STRING, 0); }
		public LinkElementContext(HeadElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterLinkElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitLinkElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitLinkElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BaseElementContext extends HeadElementContext {
		public TerminalNode STRING() { return getToken(p32Parser.STRING, 0); }
		public BaseElementContext(HeadElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterBaseElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitBaseElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitBaseElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleElementContext extends HeadElementContext {
		public TerminalNode STRING() { return getToken(p32Parser.STRING, 0); }
		public StyleElementContext(HeadElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterStyleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitStyleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitStyleElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MetaElementContext extends HeadElementContext {
		public TerminalNode STRING() { return getToken(p32Parser.STRING, 0); }
		public MetaElementContext(HeadElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterMetaElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitMetaElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitMetaElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadElementContext headElement() throws RecognitionException {
		HeadElementContext _localctx = new HeadElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_headElement);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new MetaElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(T__4);
				setState(43);
				match(STRING);
				setState(44);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new TitleElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(T__6);
				setState(46);
				match(STRING);
				setState(47);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new BaseElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(T__8);
				setState(49);
				match(STRING);
				setState(50);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new LinkElementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				match(T__10);
				setState(52);
				match(STRING);
				setState(53);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new StyleElementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				match(T__12);
				setState(55);
				match(STRING);
				setState(56);
				match(T__13);
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
	public static class BodyElementContext extends ParserRuleContext {
		public BodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyElement; }
	 
		public BodyElementContext() { }
		public void copyFrom(BodyElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrderedListElementContext extends BodyElementContext {
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public OrderedListElementContext(BodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterOrderedListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitOrderedListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitOrderedListElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnderlineTextContext extends BodyElementContext {
		public TerminalNode STRING() { return getToken(p32Parser.STRING, 0); }
		public UnderlineTextContext(BodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterUnderlineText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitUnderlineText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitUnderlineText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ItalicTextContext extends BodyElementContext {
		public TerminalNode STRING() { return getToken(p32Parser.STRING, 0); }
		public ItalicTextContext(BodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterItalicText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitItalicText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitItalicText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivElementContext extends BodyElementContext {
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public DivElementContext(BodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterDivElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitDivElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitDivElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParagraphElementContext extends BodyElementContext {
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public ParagraphElementContext(BodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterParagraphElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitParagraphElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitParagraphElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoldTextContext extends BodyElementContext {
		public TerminalNode STRING() { return getToken(p32Parser.STRING, 0); }
		public BoldTextContext(BodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterBoldText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitBoldText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitBoldText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImageElementContext extends BodyElementContext {
		public List<TerminalNode> STRING() { return getTokens(p32Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(p32Parser.STRING, i);
		}
		public ImageElementContext(BodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterImageElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitImageElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitImageElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineBreakContext extends BodyElementContext {
		public LineBreakContext(BodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterLineBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitLineBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitLineBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnorderedListElementContext extends BodyElementContext {
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public UnorderedListElementContext(BodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterUnorderedListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitUnorderedListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitUnorderedListElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HeadingElementContext extends BodyElementContext {
		public HeadingContext heading() {
			return getRuleContext(HeadingContext.class,0);
		}
		public HeadingElementContext(BodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterHeadingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitHeadingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitHeadingElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListItemElementContext extends BodyElementContext {
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public ListItemElementContext(BodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterListItemElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitListItemElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitListItemElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CodeElementContext extends BodyElementContext {
		public TerminalNode STRING() { return getToken(p32Parser.STRING, 0); }
		public CodeElementContext(BodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterCodeElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitCodeElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitCodeElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlainTextContext extends BodyElementContext {
		public TerminalNode STRING() { return getToken(p32Parser.STRING, 0); }
		public PlainTextContext(BodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterPlainText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitPlainText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitPlainText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpanElementContext extends BodyElementContext {
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public SpanElementContext(BodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterSpanElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitSpanElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitSpanElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableElementContext extends BodyElementContext {
		public TableHeaderContext tableHeader() {
			return getRuleContext(TableHeaderContext.class,0);
		}
		public List<TableRowContext> tableRow() {
			return getRuleContexts(TableRowContext.class);
		}
		public TableRowContext tableRow(int i) {
			return getRuleContext(TableRowContext.class,i);
		}
		public TableElementContext(BodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterTableElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitTableElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitTableElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HyperlinkElementContext extends BodyElementContext {
		public List<TerminalNode> STRING() { return getTokens(p32Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(p32Parser.STRING, i);
		}
		public HyperlinkElementContext(BodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterHyperlinkElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitHyperlinkElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitHyperlinkElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyElementContext bodyElement() throws RecognitionException {
		BodyElementContext _localctx = new BodyElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bodyElement);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
				_localctx = new HeadingElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				heading();
				}
				break;
			case T__6:
				_localctx = new ParagraphElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(T__6);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8741687306880L) != 0)) {
					{
					{
					setState(61);
					content();
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(67);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new DivElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(T__8);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8741687306880L) != 0)) {
					{
					{
					setState(69);
					content();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75);
				match(T__9);
				}
				break;
			case T__14:
				_localctx = new SpanElementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(T__14);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8741687306880L) != 0)) {
					{
					{
					setState(77);
					content();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new ListItemElementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				match(T__16);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8741687306880L) != 0)) {
					{
					{
					setState(85);
					content();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new UnorderedListElementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				match(T__18);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8741687306880L) != 0)) {
					{
					{
					setState(93);
					content();
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new OrderedListElementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(100);
				match(T__20);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8741687306880L) != 0)) {
					{
					{
					setState(101);
					content();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107);
				match(T__21);
				}
				break;
			case T__10:
				_localctx = new HyperlinkElementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				match(T__10);
				setState(109);
				match(STRING);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(110);
					match(T__22);
					setState(111);
					match(STRING);
					}
				}

				setState(114);
				match(T__11);
				}
				break;
			case T__23:
				_localctx = new ImageElementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(115);
				match(T__23);
				setState(116);
				match(STRING);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(117);
					match(T__22);
					setState(118);
					match(STRING);
					}
				}

				setState(121);
				match(T__24);
				}
				break;
			case T__25:
				_localctx = new BoldTextContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(122);
				match(T__25);
				setState(123);
				match(STRING);
				setState(124);
				match(T__26);
				}
				break;
			case T__27:
				_localctx = new ItalicTextContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(125);
				match(T__27);
				setState(126);
				match(STRING);
				setState(127);
				match(T__28);
				}
				break;
			case T__29:
				_localctx = new UnderlineTextContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(128);
				match(T__29);
				setState(129);
				match(STRING);
				setState(130);
				match(T__30);
				}
				break;
			case T__31:
				_localctx = new LineBreakContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(131);
				match(T__31);
				}
				break;
			case T__12:
				_localctx = new CodeElementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(132);
				match(T__12);
				setState(133);
				match(STRING);
				setState(134);
				match(T__13);
				}
				break;
			case T__32:
				_localctx = new TableElementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(135);
				match(T__32);
				setState(136);
				tableHeader();
				setState(137);
				match(T__33);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__33) {
					{
					{
					setState(138);
					tableRow();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				match(T__34);
				}
				break;
			case STRING:
				_localctx = new PlainTextContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(146);
				match(STRING);
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
	public static class HeadingContext extends ParserRuleContext {
		public HeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heading; }
	 
		public HeadingContext() { }
		public void copyFrom(HeadingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class H1Context extends HeadingContext {
		public TerminalNode STRING() { return getToken(p32Parser.STRING, 0); }
		public H1Context(HeadingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterH1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitH1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitH1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class H2Context extends HeadingContext {
		public TerminalNode STRING() { return getToken(p32Parser.STRING, 0); }
		public H2Context(HeadingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterH2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitH2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitH2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class H3Context extends HeadingContext {
		public TerminalNode STRING() { return getToken(p32Parser.STRING, 0); }
		public H3Context(HeadingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterH3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitH3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitH3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class H4Context extends HeadingContext {
		public TerminalNode STRING() { return getToken(p32Parser.STRING, 0); }
		public H4Context(HeadingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterH4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitH4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitH4(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class H5Context extends HeadingContext {
		public TerminalNode STRING() { return getToken(p32Parser.STRING, 0); }
		public H5Context(HeadingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterH5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitH5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitH5(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class H6Context extends HeadingContext {
		public TerminalNode STRING() { return getToken(p32Parser.STRING, 0); }
		public H6Context(HeadingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterH6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitH6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitH6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadingContext heading() throws RecognitionException {
		HeadingContext _localctx = new HeadingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_heading);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				_localctx = new H6Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(T__35);
				setState(150);
				match(STRING);
				}
				break;
			case T__36:
				_localctx = new H5Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__36);
				setState(152);
				match(STRING);
				}
				break;
			case T__37:
				_localctx = new H4Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(T__37);
				setState(154);
				match(STRING);
				}
				break;
			case T__38:
				_localctx = new H3Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				match(T__38);
				setState(156);
				match(STRING);
				}
				break;
			case T__39:
				_localctx = new H2Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				match(T__39);
				setState(158);
				match(STRING);
				}
				break;
			case T__40:
				_localctx = new H1Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				match(T__40);
				setState(160);
				match(STRING);
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
	public static class ContentContext extends ParserRuleContext {
		public BodyElementContext bodyElement() {
			return getRuleContext(BodyElementContext.class,0);
		}
		public TerminalNode STRING() { return getToken(p32Parser.STRING, 0); }
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_content);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				bodyElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(STRING);
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
	public static class TableHeaderContext extends ParserRuleContext {
		public List<TableCellContext> tableCell() {
			return getRuleContexts(TableCellContext.class);
		}
		public TableCellContext tableCell(int i) {
			return getRuleContext(TableCellContext.class,i);
		}
		public TableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableHeaderContext tableHeader() throws RecognitionException {
		TableHeaderContext _localctx = new TableHeaderContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tableHeader);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			tableCell();
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(168);
					match(T__33);
					setState(169);
					tableCell();
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableRowContext extends ParserRuleContext {
		public List<TableCellContext> tableCell() {
			return getRuleContexts(TableCellContext.class);
		}
		public TableCellContext tableCell(int i) {
			return getRuleContext(TableCellContext.class,i);
		}
		public TableRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterTableRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitTableRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitTableRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableRowContext tableRow() throws RecognitionException {
		TableRowContext _localctx = new TableRowContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tableRow);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__33);
			setState(176);
			tableCell();
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					match(T__33);
					setState(178);
					tableCell();
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(184);
			match(T__33);
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
	public static class TableCellContext extends ParserRuleContext {
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public TableCellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableCell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).enterTableCell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p32Listener ) ((p32Listener)listener).exitTableCell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p32Visitor ) return ((p32Visitor<? extends T>)visitor).visitTableCell(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableCellContext tableCell() throws RecognitionException {
		TableCellContext _localctx = new TableCellContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tableCell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8741687306880L) != 0)) {
				{
				{
				setState(186);
				content();
				}
				}
				setState(191);
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

	public static final String _serializedATN =
		"\u0004\u0001+\u00c1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u001b\b\u0001\n\u0001\f\u0001\u001e"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002$"+
		"\b\u0002\n\u0002\f\u0002\'\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003:\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004?\b\u0004\n\u0004\f\u0004B\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004G\b\u0004\n\u0004\f\u0004J\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004O\b\u0004\n\u0004\f\u0004"+
		"R\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004W\b\u0004\n\u0004"+
		"\f\u0004Z\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004_\b\u0004"+
		"\n\u0004\f\u0004b\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"g\b\u0004\n\u0004\f\u0004j\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004q\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004x\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u008c\b\u0004\n\u0004\f\u0004\u008f\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u0094\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a2\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00a6\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00ab\b\u0007\n\u0007\f\u0007\u00ae\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u00b4\b\b\n\b\f\b\u00b7\t\b\u0001\b\u0001\b\u0001\t"+
		"\u0005\t\u00bc\b\t\n\t\f\t\u00bf\t\t\u0001\t\u0000\u0000\n\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0000\u00dd\u0000\u0014\u0001"+
		"\u0000\u0000\u0000\u0002\u0018\u0001\u0000\u0000\u0000\u0004!\u0001\u0000"+
		"\u0000\u0000\u00069\u0001\u0000\u0000\u0000\b\u0093\u0001\u0000\u0000"+
		"\u0000\n\u00a1\u0001\u0000\u0000\u0000\f\u00a5\u0001\u0000\u0000\u0000"+
		"\u000e\u00a7\u0001\u0000\u0000\u0000\u0010\u00af\u0001\u0000\u0000\u0000"+
		"\u0012\u00bd\u0001\u0000\u0000\u0000\u0014\u0015\u0003\u0002\u0001\u0000"+
		"\u0015\u0016\u0003\u0004\u0002\u0000\u0016\u0017\u0005\u0000\u0000\u0001"+
		"\u0017\u0001\u0001\u0000\u0000\u0000\u0018\u001c\u0005\u0001\u0000\u0000"+
		"\u0019\u001b\u0003\u0006\u0003\u0000\u001a\u0019\u0001\u0000\u0000\u0000"+
		"\u001b\u001e\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001f\u0001\u0000\u0000\u0000"+
		"\u001e\u001c\u0001\u0000\u0000\u0000\u001f \u0005\u0002\u0000\u0000 \u0003"+
		"\u0001\u0000\u0000\u0000!%\u0005\u0003\u0000\u0000\"$\u0003\b\u0004\u0000"+
		"#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000"+
		"\u0000\u0000()\u0005\u0004\u0000\u0000)\u0005\u0001\u0000\u0000\u0000"+
		"*+\u0005\u0005\u0000\u0000+,\u0005*\u0000\u0000,:\u0005\u0006\u0000\u0000"+
		"-.\u0005\u0007\u0000\u0000./\u0005*\u0000\u0000/:\u0005\b\u0000\u0000"+
		"01\u0005\t\u0000\u000012\u0005*\u0000\u00002:\u0005\n\u0000\u000034\u0005"+
		"\u000b\u0000\u000045\u0005*\u0000\u00005:\u0005\f\u0000\u000067\u0005"+
		"\r\u0000\u000078\u0005*\u0000\u00008:\u0005\u000e\u0000\u00009*\u0001"+
		"\u0000\u0000\u00009-\u0001\u0000\u0000\u000090\u0001\u0000\u0000\u0000"+
		"93\u0001\u0000\u0000\u000096\u0001\u0000\u0000\u0000:\u0007\u0001\u0000"+
		"\u0000\u0000;\u0094\u0003\n\u0005\u0000<@\u0005\u0007\u0000\u0000=?\u0003"+
		"\f\u0006\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000C\u0094\u0005\b\u0000\u0000DH\u0005\t\u0000"+
		"\u0000EG\u0003\f\u0006\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IK\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000K\u0094\u0005\n\u0000\u0000LP\u0005"+
		"\u000f\u0000\u0000MO\u0003\f\u0006\u0000NM\u0001\u0000\u0000\u0000OR\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000S\u0094\u0005\u0010"+
		"\u0000\u0000TX\u0005\u0011\u0000\u0000UW\u0003\f\u0006\u0000VU\u0001\u0000"+
		"\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"[\u0094\u0005\u0012\u0000\u0000\\`\u0005\u0013\u0000\u0000]_\u0003\f\u0006"+
		"\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000c\u0094\u0005\u0014\u0000\u0000dh\u0005\u0015\u0000"+
		"\u0000eg\u0003\f\u0006\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000k\u0094\u0005\u0016\u0000\u0000"+
		"lm\u0005\u000b\u0000\u0000mp\u0005*\u0000\u0000no\u0005\u0017\u0000\u0000"+
		"oq\u0005*\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000r\u0094\u0005\f\u0000\u0000st\u0005\u0018\u0000"+
		"\u0000tw\u0005*\u0000\u0000uv\u0005\u0017\u0000\u0000vx\u0005*\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000y\u0094\u0005\u0019\u0000\u0000z{\u0005\u001a\u0000\u0000{|\u0005"+
		"*\u0000\u0000|\u0094\u0005\u001b\u0000\u0000}~\u0005\u001c\u0000\u0000"+
		"~\u007f\u0005*\u0000\u0000\u007f\u0094\u0005\u001d\u0000\u0000\u0080\u0081"+
		"\u0005\u001e\u0000\u0000\u0081\u0082\u0005*\u0000\u0000\u0082\u0094\u0005"+
		"\u001f\u0000\u0000\u0083\u0094\u0005 \u0000\u0000\u0084\u0085\u0005\r"+
		"\u0000\u0000\u0085\u0086\u0005*\u0000\u0000\u0086\u0094\u0005\u000e\u0000"+
		"\u0000\u0087\u0088\u0005!\u0000\u0000\u0088\u0089\u0003\u000e\u0007\u0000"+
		"\u0089\u008d\u0005\"\u0000\u0000\u008a\u008c\u0003\u0010\b\u0000\u008b"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e"+
		"\u0090\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0005#\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0094"+
		"\u0005*\u0000\u0000\u0093;\u0001\u0000\u0000\u0000\u0093<\u0001\u0000"+
		"\u0000\u0000\u0093D\u0001\u0000\u0000\u0000\u0093L\u0001\u0000\u0000\u0000"+
		"\u0093T\u0001\u0000\u0000\u0000\u0093\\\u0001\u0000\u0000\u0000\u0093"+
		"d\u0001\u0000\u0000\u0000\u0093l\u0001\u0000\u0000\u0000\u0093s\u0001"+
		"\u0000\u0000\u0000\u0093z\u0001\u0000\u0000\u0000\u0093}\u0001\u0000\u0000"+
		"\u0000\u0093\u0080\u0001\u0000\u0000\u0000\u0093\u0083\u0001\u0000\u0000"+
		"\u0000\u0093\u0084\u0001\u0000\u0000\u0000\u0093\u0087\u0001\u0000\u0000"+
		"\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\t\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005$\u0000\u0000\u0096\u00a2\u0005*\u0000\u0000\u0097\u0098"+
		"\u0005%\u0000\u0000\u0098\u00a2\u0005*\u0000\u0000\u0099\u009a\u0005&"+
		"\u0000\u0000\u009a\u00a2\u0005*\u0000\u0000\u009b\u009c\u0005\'\u0000"+
		"\u0000\u009c\u00a2\u0005*\u0000\u0000\u009d\u009e\u0005(\u0000\u0000\u009e"+
		"\u00a2\u0005*\u0000\u0000\u009f\u00a0\u0005)\u0000\u0000\u00a0\u00a2\u0005"+
		"*\u0000\u0000\u00a1\u0095\u0001\u0000\u0000\u0000\u00a1\u0097\u0001\u0000"+
		"\u0000\u0000\u00a1\u0099\u0001\u0000\u0000\u0000\u00a1\u009b\u0001\u0000"+
		"\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a2\u000b\u0001\u0000\u0000\u0000\u00a3\u00a6\u0003\b\u0004"+
		"\u0000\u00a4\u00a6\u0005*\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\r\u0001\u0000\u0000\u0000\u00a7"+
		"\u00ac\u0003\u0012\t\u0000\u00a8\u00a9\u0005\"\u0000\u0000\u00a9\u00ab"+
		"\u0003\u0012\t\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ad\u000f\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0005\"\u0000\u0000\u00b0\u00b5\u0003\u0012"+
		"\t\u0000\u00b1\u00b2\u0005\"\u0000\u0000\u00b2\u00b4\u0003\u0012\t\u0000"+
		"\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0005\"\u0000\u0000\u00b9\u0011\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bc\u0003\f\u0006\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0001\u0000\u0000\u0000\u00be\u0013\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u0012\u001c%9@HPX`hpw\u008d\u0093\u00a1\u00a5"+
		"\u00ac\u00b5\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}