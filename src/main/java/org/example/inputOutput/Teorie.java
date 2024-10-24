package org.example.inputOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Teorie {
    /*
    Input / Output

    - folosim pachetul java.nio introdus in Java 8
    - ne ajuta sa scriem / sa citim informatii in / din fisiere
    - ne ajuta sa facem noi proprile foldere direct din java

    Path ABSOLUTE
    C://Program Files/Java/Projects/java_advanced_features_76/fisierText.txt

    Path RELATIVE
    fisierText.txt
     */
    public static void main(String[] args) {
        List<String> wordsList = new ArrayList<>();

        wordsList.add("birou");
        wordsList.add("masina");
        wordsList.add("canapea");
        wordsList.add("monitor");
        wordsList.add("pc");

//        Path absotutePath = Paths.get("/Users/catalinhalic/Desktop/fisier_desktop.txt");
        Path absotutePath = Paths.get("/Users/catalinhalic/Workspace/Projects/University/java_advanced_features_76/folderText/fisier_desktop.txt");
        Path relativePath = Paths.get("words_text_file.txt");

        try {
            writeToFile(relativePath, wordsList);

            List<String> readContent = readFromFile(relativePath);
            // foreach cu lambda expression
            readContent.forEach((word) -> System.out.println(word));

        } catch (IOException e) {
            System.out.println("Error");
            System.out.println("Fisierul nu exista!");
        }
    }

    public static void writeToFile(Path path, List<String> content) throws IOException {
//        try {
//            Files.write(path, content);
//        } catch (IOException ioException) {
//            System.out.println(ioException.getMessage());
//        }

        Files.write(path, content);
    }

    public static List<String> readFromFile(Path path) throws IOException {
//        List<String> content = Files.readAllLines(path);
//
//        return content;

        return Files.readAllLines(path);
    }
}
