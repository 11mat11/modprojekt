package compiler;

import grammar.p32Parser;
import grammar.p32BaseVisitor;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;

public class EmitVisitor extends p32BaseVisitor<ST> {
    private final STGroup templates;

    public EmitVisitor(STGroup templates) {
        this.templates = templates;
    }

    // Program
    @Override
    public ST visitProgram(p32Parser.ProgramContext ctx) {
        ST programTemplate = templates.getInstanceOf("program");
        programTemplate.add("head", visit(ctx.head()));
        programTemplate.add("body", visit(ctx.body()));
        return programTemplate;
    }

    // Head section
    @Override
    public ST visitHead(p32Parser.HeadContext ctx) {
        ST headTemplate = templates.getInstanceOf("head");
        ctx.headElement().forEach(element -> headTemplate.add("elements", visit(element)));
        return headTemplate;
    }

    // Body section
    @Override
    public ST visitBody(p32Parser.BodyContext ctx) {
        ST bodyTemplate = templates.getInstanceOf("body");
        ctx.bodyElement().forEach(element -> bodyTemplate.add("elements", visit(element)));
        return bodyTemplate;
    }

    // Meta element
    @Override
    public ST visitMetaElement(p32Parser.MetaElementContext ctx) {
        String content = cleanString(ctx.STRING().getText());
        return templates.getInstanceOf("metaElement")
                .add("content", content);
    }

    // Title element
    @Override
    public ST visitTitleElement(p32Parser.TitleElementContext ctx) {
        String content = cleanString(ctx.STRING().getText());
        return templates.getInstanceOf("titleElement")
                .add("content", content);
    }

    // Paragraph element
    @Override
    public ST visitParagraphElement(p32Parser.ParagraphElementContext ctx) {
        StringBuilder content = new StringBuilder();
        ctx.content().forEach(c -> content.append(cleanString(c.getText())));
        return templates.getInstanceOf("paragraphElement")
                .add("content", content.toString());
    }
    // Base element (head)
    @Override
    public ST visitBaseElement(p32Parser.BaseElementContext ctx) {
        String url = cleanString(ctx.STRING().getText());
        return templates.getInstanceOf("baseElement").add("url", url);
    }

    // Link element (head - np. CSS)
    @Override
    public ST visitLinkElement(p32Parser.LinkElementContext ctx) {
        String href = cleanString(ctx.STRING().getText());
        return templates.getInstanceOf("linkElement").add("href", href);
    }

    // Style element (head)
    @Override
    public ST visitStyleElement(p32Parser.StyleElementContext ctx) {
        String styles = cleanString(ctx.STRING().getText());
        return templates.getInstanceOf("styleElement").add("styles", styles);
    }

    // Div element
    @Override
    public ST visitDivElement(p32Parser.DivElementContext ctx) {
        StringBuilder content = new StringBuilder();
        ctx.content().forEach(c -> content.append(cleanString(c.getText())));
        return templates.getInstanceOf("divElement").add("content", content.toString());
    }

    // Hyperlink element
    @Override
    public ST visitHyperlinkElement(p32Parser.HyperlinkElementContext ctx) {
        String url = cleanString(ctx.STRING(0).getText());
        String text = ctx.STRING().size() > 1 ? cleanString(ctx.STRING(1).getText()) : url;
        return templates.getInstanceOf("hyperlinkElement")
                .add("url", url)
                .add("text", text);
    }

    // Image element
    @Override
    public ST visitImageElement(p32Parser.ImageElementContext ctx) {
        String src = cleanString(ctx.STRING(0).getText());
        String alt = ctx.STRING().size() > 1 ? cleanString(ctx.STRING(1).getText()) : "";
        return templates.getInstanceOf("imageElement")
                .add("src", src)
                .add("alt", alt);
    }

    // Text formatting
    @Override
    public ST visitBoldText(p32Parser.BoldTextContext ctx) {
        return formatTextElement(ctx.STRING().getText(), "strong");
    }

    @Override
    public ST visitItalicText(p32Parser.ItalicTextContext ctx) {
        return formatTextElement(ctx.STRING().getText(), "em");
    }

    private ST formatTextElement(String input, String tag) {
        String text = cleanString(input);
        return templates.getInstanceOf("textFormat")
                .add("tag", tag)
                .add("content", text);
    }

    // Line break
    @Override
    public ST visitLineBreak(p32Parser.LineBreakContext ctx) {
        return templates.getInstanceOf("lineBreak");
    }

    // Code element
    @Override
    public ST visitCodeElement(p32Parser.CodeElementContext ctx) {
        String code = cleanString(ctx.STRING().getText());
        return templates.getInstanceOf("codeElement").add("code", code);
    }

    // Plain text
    @Override
    public ST visitPlainText(p32Parser.PlainTextContext ctx) {
        return templates.getInstanceOf("plainText")
                .add("text", cleanString(ctx.STRING().getText()));
    }
    @Override
    public ST visitHeadingElement(p32Parser.HeadingElementContext ctx) {
        // Pobierz kontekst konkretnego nagłówka (h1-h6)
        p32Parser.HeadingContext headingCtx = ctx.heading();

        // Pobierz poziom nagłówka na podstawie liczby '#'
        int level = headingCtx.getStart().getText().length();

        String text = cleanString(headingCtx.getChild(1).getText());

        return templates.getInstanceOf("heading")
                .add("level", level)
                .add("text", text);
    }

    private String cleanString(String input) {
        // Usuń otaczające cudzysłowy i escapowanie
        return input.substring(1, input.length() - 1)
                .replace("\"", "")
                .replace("\"", "");
    }
}