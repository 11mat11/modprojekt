// Generated from /home/mateusz/IdeaProjects/modprojekt/src/grammar/p32.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link p32Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface p32Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link p32Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(p32Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link p32Parser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(p32Parser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link p32Parser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(p32Parser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metaElement}
	 * labeled alternative in {@link p32Parser#headElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetaElement(p32Parser.MetaElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code titleElement}
	 * labeled alternative in {@link p32Parser#headElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitleElement(p32Parser.TitleElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseElement}
	 * labeled alternative in {@link p32Parser#headElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseElement(p32Parser.BaseElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code linkElement}
	 * labeled alternative in {@link p32Parser#headElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkElement(p32Parser.LinkElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styleElement}
	 * labeled alternative in {@link p32Parser#headElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElement(p32Parser.StyleElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code headingElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadingElement(p32Parser.HeadingElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paragraphElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraphElement(p32Parser.ParagraphElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivElement(p32Parser.DivElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code spanElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpanElement(p32Parser.SpanElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listItemElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListItemElement(p32Parser.ListItemElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unorderedListElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnorderedListElement(p32Parser.UnorderedListElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orderedListElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedListElement(p32Parser.OrderedListElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hyperlinkElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHyperlinkElement(p32Parser.HyperlinkElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imageElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageElement(p32Parser.ImageElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boldText}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoldText(p32Parser.BoldTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code italicText}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalicText(p32Parser.ItalicTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code underlineText}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnderlineText(p32Parser.UnderlineTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineBreak}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineBreak(p32Parser.LineBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codeElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeElement(p32Parser.CodeElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableElement}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElement(p32Parser.TableElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plainText}
	 * labeled alternative in {@link p32Parser#bodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainText(p32Parser.PlainTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code h6}
	 * labeled alternative in {@link p32Parser#heading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH6(p32Parser.H6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code h5}
	 * labeled alternative in {@link p32Parser#heading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH5(p32Parser.H5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code h4}
	 * labeled alternative in {@link p32Parser#heading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH4(p32Parser.H4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code h3}
	 * labeled alternative in {@link p32Parser#heading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH3(p32Parser.H3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code h2}
	 * labeled alternative in {@link p32Parser#heading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH2(p32Parser.H2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code h1}
	 * labeled alternative in {@link p32Parser#heading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH1(p32Parser.H1Context ctx);
	/**
	 * Visit a parse tree produced by {@link p32Parser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(p32Parser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link p32Parser#tableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableHeader(p32Parser.TableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link p32Parser#tableRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRow(p32Parser.TableRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link p32Parser#tableCell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableCell(p32Parser.TableCellContext ctx);
}