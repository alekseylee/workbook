package be.intecbrussel.fileIO.bufferwriter_bufferreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WorkingWithBufferReader {

    public static void readWithBuff() {
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("C:\\Users\\intec\\IdeaProjects\\FilesExamples\\myNewText4.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
