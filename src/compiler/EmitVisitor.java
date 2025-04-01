package compilar;

import grammar.p32BaseVisitor;
import grammar.p32Parser;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;

public class EmitVisitor extends p32BaseVisitor<ST> {
    private final STGroup templates;

    public EmitVisitor(STGroup templates) {
        this.templates = templates;
    }

    @Override
    public ST visitProgram(p32Parser.ProgramContext ctx) {
        ST template = templates.getInstanceOf("html");
        template.add("head", visit(ctx.head()));
        template.add("body", visit(ctx.body()));
        return template;
    }

    @Override
    public ST visitHead(p32Parser.HeadContext ctx) {
        ST template = templates.getInstanceOf("head");
        for (var element : ctx.headElement()) {
            template.add("elements", visit(element));
        }
        return template;
    }

    @Override
    public ST visitBody(p32Parser.BodyContext ctx) {
        ST template = templates.getInstanceOf("body");
        for (var element : ctx.bodyElement()) {
            template.add("elements", visit(element));
        }
        return template;
    }

    @Override
    public ST visitH1(p32Parser.H1Context ctx) {
        ST template = templates.getInstanceOf("h1");
        template.add("content", ctx.STRING().getText().replace("\"", ""));
        return template;
    }

    @Override
    public ST visitParagraphElement(p32Parser.ParagraphElementContext ctx) {
        ST template = templates.getInstanceOf("p");
        for (var content : ctx.content()) {
            template.add("content", visit(content));
        }
        return template;
    }

    @Override
    public ST visitPlainText(p32Parser.PlainTextContext ctx) {
        ST template = templates.getInstanceOf("text");
        template.add("content", ctx.STRING().getText().replace("\"", ""));
        return template;
    }
}
