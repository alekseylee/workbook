package be.intecbrussel.fileIO.opdracht2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class BuffWriter {

    public static void writeBuff() {
        Path path = Path.of("C:\\Users\\intec\\IdeaProjects\\FilesExamples\\Opdracht2.txt");
        // create parent directories
        try {
            Files.createDirectories(path.getParent());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter fileWriter = new
                FileWriter("C:\\Users\\intec\\IdeaProjects\\FilesExamples\\Opdracht2.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            System.out.println("Input some text");
            Scanner scan = new Scanner(System.in);
            String line = scan.nextLine();
            if (scan.hasNextLine()) {
                bufferedWriter.write(line);
                scan.close();
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
