package compiler;

import grammar.p32Parser;
import grammar.p32BaseVisitor;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;

import java.util.List;
import java.util.stream.Collectors;

public class EmitVisitor extends p32BaseVisitor<ST> {
    private final STGroup templates;
    private int formLabelCounter = 0;
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

    // Przykładowe poprawki dla kilku elementów:
    @Override
    public ST visitParagraphElement(p32Parser.ParagraphElementContext ctx) {
        ST paragraph = templates.getInstanceOf("paragraphElement");
        ctx.content().forEach(c -> paragraph.add("content", visit(c)));
        return paragraph;
    }

    @Override
    public ST visitDivElement(p32Parser.DivElementContext ctx) {
        ST div = templates.getInstanceOf("divElement");
        ctx.content().forEach(c -> div.add("content", visit(c)));
        return div;
    }

    @Override
    public ST visitSpanElement(p32Parser.SpanElementContext ctx) {
        ST span = templates.getInstanceOf("spanElement");
        ctx.content().forEach(c -> span.add("content", visit(c)));
        return span;
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

    @Override
    public ST visitBoldText(p32Parser.BoldTextContext ctx) {
        String content = cleanString(ctx.STRING().getText());
        return templates.getInstanceOf("boldText").add("content", content);
    }

    @Override
    public ST visitItalicText(p32Parser.ItalicTextContext ctx) {
        String content = cleanString(ctx.STRING().getText());
        return templates.getInstanceOf("italicText").add("content", content);
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
    @Override
    public ST visitFormElement(p32Parser.FormElementContext ctx) {
        ST formElement = templates.getInstanceOf("formElement");
        ctx.content().forEach(element -> formElement.add("elements", visit(element)));
        return formElement;
    }

//    @Override
//    public ST visitFormContent(p32Parser.FormContentContext ctx) {
//        ST formContent = templates.getInstanceOf("formContent");
//        formContent.add("name", ctx.name.getText()).add("type", ctx.type.getText()).add("label_name", ctx.label_name.getText()).add("id", "form_" + formLabelCounter++);
//        return formContent;
//    }

    @Override
    public ST visitFormField(p32Parser.FormFieldContext ctx) {
        ST formContent = templates.getInstanceOf("formField");
        formContent.add("name", ctx.name.getText()).add("type", ctx.type.getText()).add("id", "form_" + formLabelCounter++);
        if (ctx.label_name != null) {
            formContent.add("label_name", cleanString(ctx.label_name.getText()));
        }
        return formContent;
    }

    @Override
    public ST visitFormButton(p32Parser.FormButtonContext ctx) {
        ST formContent = templates.getInstanceOf("formButton");
        formContent.add("value", ctx.value.getText()).add("type", ctx.type.getText());
        return formContent;
    }

    @Override
    public ST visitFormCheckBoxRadio(p32Parser.FormCheckBoxRadioContext ctx) {
        ST formContent = templates.getInstanceOf("formCheckBoxRadio");
        formContent.add("type", ctx.type.getText()).add("name", ctx.name.getText()).add("value", ctx.value.getText());
        return formContent;
    }

    @Override
    public ST visitFormJustLabel(p32Parser.FormJustLabelContext ctx) {
        ST formContent = templates.getInstanceOf("formJustLabel");
        formContent.add("label_name", cleanString(ctx.label_name.getText()));
        return formContent;
    }
    @Override
    public ST visitFooterElement(p32Parser.FooterElementContext ctx) {
        ST footer = templates.getInstanceOf("footerElement");
        ctx.content().forEach(c -> {
            if (c.bodyElement() != null) {
                footer.add("content", visit(c.bodyElement()));
            } else {
                footer.add("content", cleanString(c.getText()));
            }
        });
        return footer;
    }

    @Override
    public ST visitHeaderElement(p32Parser.HeaderElementContext ctx) {
        ST header = templates.getInstanceOf("headerElement");
        ctx.content().forEach(c -> {
            if (c.bodyElement() != null) {
                header.add("content", visit(c.bodyElement()));
            } else {
                header.add("content", cleanString(c.getText()));
            }
        });
        return header;
    }
    @Override
    public ST visitTableElement(p32Parser.TableElementContext ctx) {
        ST table = templates.getInstanceOf("table");
        ctx.tableRow().forEach(row -> table.add("rows", visit(row)));
        return table;
    }

    @Override
    public ST visitTableRow(p32Parser.TableRowContext ctx) {
        ST row = templates.getInstanceOf("tableRow");
        ctx.tableCell().forEach(cell -> row.add("cells", visit(cell)));
        return row;
    }

    @Override
    public ST visitTableCell(p32Parser.TableCellContext ctx) {
        StringBuilder content = new StringBuilder();
        ctx.content().forEach(c -> content.append(visit(c).render()));
        return templates.getInstanceOf("tableCell")
                .add("content", content.toString());
    }

    // List item element
    @Override
    public ST visitListItemElement(p32Parser.ListItemElementContext ctx) {
        StringBuilder content = new StringBuilder();
        ctx.content().forEach(c -> content.append(visit(c).render()));
        return templates.getInstanceOf("listItemElement")
                .add("content", content.toString());
    }

    // Unordered list
    @Override
    public ST visitUnorderedListElement(p32Parser.UnorderedListElementContext ctx) {
        ST listTemplate = templates.getInstanceOf("unorderedList");
        ctx.content().forEach(c -> listTemplate.add("items", visit(c)));
        return listTemplate;
    }

    // Ordered list
    @Override
    public ST visitOrderedListElement(p32Parser.OrderedListElementContext ctx) {
        ST listTemplate = templates.getInstanceOf("orderedList");
        ctx.content().forEach(c -> listTemplate.add("items", visit(c)));
        return listTemplate;
    }

    // Underline text
    @Override
    public ST visitUnderlineText(p32Parser.UnderlineTextContext ctx) {
        String text = cleanString(ctx.STRING().getText());
        return templates.getInstanceOf("underlineText")
                .add("content", text);
    }
}