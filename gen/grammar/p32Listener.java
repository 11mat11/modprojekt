// Generated from /home/mateusz/IdeaProjects/modprojekt/src/grammar/p32.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link p32Parser}.
 */
public interface p32Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link p32Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(p32Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link p32Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(p32Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link p32Parser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(p32Parser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link p32Parser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(p32Parser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link p32Parser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(p32Parser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link p32Parser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(p32Parser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code metaElement}
	 * labeled alternative in {@link p32Parser#headElement}.
	 * @param ctx the parse tree
	 */
	void enterMetaElement(p32Parser.MetaElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code metaElement}
	 * labeled alternative in {@link p32Parser#headElement}.
	 * @param ctx the parse tree
	 */
	void exitMetaElement(p32Parser.MetaElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code titleElement}
	 * labeled alternative in {@link p32Parser#headElement}.
	 * @param ctx the parse tree
	 */
	void enterTitleElement(p32Parser.TitleElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code titleElement}
	 * labeled alternative in {@link p32Parser#headElement}.
	 * @param ctx the parse tree
	 */
	void exitTitleElement(p32Parser.TitleElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code baseElement}
	 * labeled alternative in {@link p32Parser#headElement}.
	 * @param ctx the parse tree
	 */
	void enterBaseElement(p32Parser.BaseElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code baseElement}
	 * labeled alternative in {@link p32Parser#headElement}.
	 * @param ctx the parse tree
	 */
	void exitBaseElement(p32Parser.BaseElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code linkElement}
	 * labeled alternative in {@link p32Parser#headElement}.
	 * @param ctx the parse tree
	 */
	void enterLinkElement(p32Parser.LinkElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code linkElement}
	 * labeled alternative in {@link p32Parser#headElement}.
	 * @param ctx the parse tree
	 */
	void exitLinkElement(p32Parser.LinkElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styleElement}
	 * labeled alternative in {@link p32Parser#headElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElement(p32Parser.StyleElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styleElement}
	 * labeled alternative in {@link p32Parser#headElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElement(p32Parser.StyleElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headingElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void enterHeadingElement(p32Parser.HeadingElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headingElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void exitHeadingElement(p32Parser.HeadingElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paragraphElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void enterParagraphElement(p32Parser.ParagraphElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paragraphElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void exitParagraphElement(p32Parser.ParagraphElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void enterDivElement(p32Parser.DivElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void exitDivElement(p32Parser.DivElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code spanElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void enterSpanElement(p32Parser.SpanElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code spanElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void exitSpanElement(p32Parser.SpanElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listItemElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void enterListItemElement(p32Parser.ListItemElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listItemElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void exitListItemElement(p32Parser.ListItemElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unorderedListElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void enterUnorderedListElement(p32Parser.UnorderedListElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unorderedListElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void exitUnorderedListElement(p32Parser.UnorderedListElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orderedListElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void enterOrderedListElement(p32Parser.OrderedListElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orderedListElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void exitOrderedListElement(p32Parser.OrderedListElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hyperlinkElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void enterHyperlinkElement(p32Parser.HyperlinkElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hyperlinkElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void exitHyperlinkElement(p32Parser.HyperlinkElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imageElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void enterImageElement(p32Parser.ImageElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imageElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void exitImageElement(p32Parser.ImageElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boldText}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void enterBoldText(p32Parser.BoldTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boldText}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void exitBoldText(p32Parser.BoldTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code italicText}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void enterItalicText(p32Parser.ItalicTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code italicText}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void exitItalicText(p32Parser.ItalicTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code underlineText}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void enterUnderlineText(p32Parser.UnderlineTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code underlineText}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void exitUnderlineText(p32Parser.UnderlineTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineBreak}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void enterLineBreak(p32Parser.LineBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineBreak}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void exitLineBreak(p32Parser.LineBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code codeElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void enterCodeElement(p32Parser.CodeElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code codeElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void exitCodeElement(p32Parser.CodeElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void enterTableElement(p32Parser.TableElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void exitTableElement(p32Parser.TableElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plainText}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void enterPlainText(p32Parser.PlainTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plainText}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void exitPlainText(p32Parser.PlainTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code h6}
	 * labeled alternative in {@link p32Parser#heading}.
	 * @param ctx the parse tree
	 */
	void enterH6(p32Parser.H6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code h6}
	 * labeled alternative in {@link p32Parser#heading}.
	 * @param ctx the parse tree
	 */
	void exitH6(p32Parser.H6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code h5}
	 * labeled alternative in {@link p32Parser#heading}.
	 * @param ctx the parse tree
	 */
	void enterH5(p32Parser.H5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code h5}
	 * labeled alternative in {@link p32Parser#heading}.
	 * @param ctx the parse tree
	 */
	void exitH5(p32Parser.H5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code h4}
	 * labeled alternative in {@link p32Parser#heading}.
	 * @param ctx the parse tree
	 */
	void enterH4(p32Parser.H4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code h4}
	 * labeled alternative in {@link p32Parser#heading}.
	 * @param ctx the parse tree
	 */
	void exitH4(p32Parser.H4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code h3}
	 * labeled alternative in {@link p32Parser#heading}.
	 * @param ctx the parse tree
	 */
	void enterH3(p32Parser.H3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code h3}
	 * labeled alternative in {@link p32Parser#heading}.
	 * @param ctx the parse tree
	 */
	void exitH3(p32Parser.H3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code h2}
	 * labeled alternative in {@link p32Parser#heading}.
	 * @param ctx the parse tree
	 */
	void enterH2(p32Parser.H2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code h2}
	 * labeled alternative in {@link p32Parser#heading}.
	 * @param ctx the parse tree
	 */
	void exitH2(p32Parser.H2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code h1}
	 * labeled alternative in {@link p32Parser#heading}.
	 * @param ctx the parse tree
	 */
	void enterH1(p32Parser.H1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code h1}
	 * labeled alternative in {@link p32Parser#heading}.
	 * @param ctx the parse tree
	 */
	void exitH1(p32Parser.H1Context ctx);
	/**
	 * Enter a parse tree produced by {@link p32Parser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(p32Parser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link p32Parser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(p32Parser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link p32Parser#tableHeader}.
	 * @param ctx the parse tree
	 */
	void enterTableHeader(p32Parser.TableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link p32Parser#tableHeader}.
	 * @param ctx the parse tree
	 */
	void exitTableHeader(p32Parser.TableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link p32Parser#tableRow}.
	 * @param ctx the parse tree
	 */
	void enterTableRow(p32Parser.TableRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link p32Parser#tableRow}.
	 * @param ctx the parse tree
	 */
	void exitTableRow(p32Parser.TableRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link p32Parser#tableCell}.
	 * @param ctx the parse tree
	 */
	void enterTableCell(p32Parser.TableCellContext ctx);
	/**
	 * Exit a parse tree produced by {@link p32Parser#tableCell}.
	 * @param ctx the parse tree
	 */
	void exitTableCell(p32Parser.TableCellContext ctx);
}