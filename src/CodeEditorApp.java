import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import compiler.StartCompiler; // Importujemy klasę StartCompiler

public class CodeEditorApp extends JFrame {
    private JTextArea codeArea;
    private JEditorPane htmlViewer;
    private static final String INPUT_FILE = "src/input.p32";
    private static final String OUTPUT_FILE = "output.html";

    public CodeEditorApp() {
        setTitle("Kompilator HTML");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Podział na edytor i podgląd HTML
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

        // Edytor kodu
        codeArea = new JTextArea();
        JScrollPane editorScrollPane = new JScrollPane(codeArea);
        splitPane.setLeftComponent(editorScrollPane);

        // Przeglądarka HTML
        htmlViewer = new JEditorPane();
        htmlViewer.setContentType("text/html");
        htmlViewer.setEditable(false);
        JScrollPane previewScrollPane = new JScrollPane(htmlViewer);
        splitPane.setRightComponent(previewScrollPane);

        add(splitPane, BorderLayout.CENTER);

        // Przycisk "Uruchom"
        JButton runButton = new JButton("Uruchom");
        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compileAndDisplay();
            }
        });

        add(runButton, BorderLayout.SOUTH);

        // Wczytaj pliki na starcie
        loadFiles();
    }

    private void loadFiles() {
        try {
            // Wczytaj `input.p32`
            if (Files.exists(Paths.get(INPUT_FILE))) {
                String inputCode = new String(Files.readAllBytes(Paths.get(INPUT_FILE)));
                codeArea.setText(inputCode);
            } else {
                codeArea.setText(""); // Jeśli pliku nie ma, pusty edytor
            }

            // Wczytaj `output.html`
            if (Files.exists(Paths.get(OUTPUT_FILE))) {
                String htmlOutput = new String(Files.readAllBytes(Paths.get(OUTPUT_FILE)));
                htmlViewer.setText(htmlOutput);
            } else {
                htmlViewer.setText("<p>Brak wygenerowanego HTML</p>");
            }
        } catch (IOException e) {
            e.printStackTrace();
            htmlViewer.setText("<p>Błąd wczytywania plików</p>");
        }
    }

    private void compileAndDisplay() {
        String code = codeArea.getText();

        try {
            // Zapisz kod do input.p32
            Files.write(Paths.get(INPUT_FILE), code.getBytes());

            // Uruchom kompilator StartCompiler
            StartCompiler.main(new String[0]); // Wywołaj metodę main z StartCompiler

            // Wczytaj wynikowy plik HTML
            loadFiles();

        } catch (Exception ex) {
            ex.printStackTrace();
            htmlViewer.setText("<p>Błąd kompilacji</p>");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CodeEditorApp().setVisible(true));
    }
}
