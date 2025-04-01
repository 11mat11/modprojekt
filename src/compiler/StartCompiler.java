package compilar;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import grammar.p32Lexer;
import grammar.p32Parser;
import java.io.FileWriter;
import java.io.IOException;

public class StartCompiler {
    public static void main(String[] args) {
        CharStream inp;
        try {
            inp = CharStreams.fromFileName("src/input.p32");
        } catch (IOException e) {
            throw new RuntimeException("Error reading input file", e);
        }

        p32Lexer lexer = new p32Lexer(inp);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        p32Parser parser = new p32Parser(tokens);
        ParseTree tree = parser.program();

        STGroup group = new STGroupFile("src/compiler/templates.stg");
        EmitVisitor visitor = new EmitVisitor(group);
        ST result = visitor.visit(tree);
        
        try (FileWriter writer = new FileWriter("output.html")) {
            writer.write(result.render());
        } catch (IOException e) {
            throw new RuntimeException("Error writing output file", e);
        }

        System.out.println("HTML generated successfully.");
    }
}
