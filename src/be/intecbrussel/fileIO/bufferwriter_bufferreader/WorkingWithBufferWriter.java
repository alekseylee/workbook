package be.intecbrussel.fileIO.bufferwriter_bufferreader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WorkingWithBufferWriter {

    public static void writeWithBuff(){

        try (FileWriter fileWriter = new
                FileWriter("C:\\Users\\intec\\IdeaProjects\\FilesExamples\\myNewText4.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            bufferedWriter.write("Hi, It's me!\n");
            bufferedWriter.write("Bonjour!");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
