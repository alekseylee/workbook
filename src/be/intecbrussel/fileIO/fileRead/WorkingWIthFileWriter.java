package be.intecbrussel.fileIO.fileRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.FileWriter;

public class WorkingWIthFileWriter {

    public static void writeToFile() {

        FileWriter fileWriter = null;

        try {
            Path path = Path.of("C:\\Users\\intec\\IdeaProjects\\FilesExamples\\myNewText3.txt");

            Files.createDirectories(path.getParent());

            fileWriter = new FileWriter(path.toString());
            fileWriter.write("Hi Hello Bonjour\n");
            fileWriter.write("Bye GoodBye Tot Ziens\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {

                try {
                    fileWriter.close();
                } catch (IOException a) {
                    a.printStackTrace();
                }
            }
        }

    }

}
