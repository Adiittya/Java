import java.util.ArrayList;
import java.util.List;

public class JavaFileSelector {
    public static void main(String[] args) {
        // Given list of files (you can modify this list as needed)
        String[] files = {
            "Example.java",
            "Test.txt",
            "Demo.class",
            "Sample.java",
            "Image.png",
            "Main.java",
            "Document.docx",
            "Notes.java"
        };

        // List to hold selected Java files
        List<String> javaFiles = new ArrayList<>();

        // Select .java files from the list
        for (String file : files) {
            if (file.endsWith(".java")) {
                javaFiles.add(file);
            }
        }

        // Print the selected Java files
        System.out.println("Java files selected:");
        for (String javaFile : javaFiles) {
            System.out.println(javaFile);
        }
    }
}
