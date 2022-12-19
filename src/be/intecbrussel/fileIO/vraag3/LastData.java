package be.intecbrussel.fileIO.vraag3;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class LastData {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\intec\\IdeaProjects\\FilesExamples\\myNewText2.txt";

        try {

            Path file = Paths.get(fileName);
            BasicFileAttributes attr =
                    Files.readAttributes(file, BasicFileAttributes.class);

            System.out.println("creationTime: " + attr.creationTime());
            System.out.println("lastAccessTime: " + attr.lastAccessTime());
            System.out.println("lastModifiedTime: " + attr.lastModifiedTime());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}