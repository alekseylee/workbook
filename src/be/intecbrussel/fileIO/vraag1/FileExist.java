package be.intecbrussel.fileIO.vraag1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class FileExist {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\intec\\IdeaProjects\\FilesExamples\\myNewText.txt");

        File file = path.toFile();
        try {
        if (file.exists()) {
            System.out.println("Yes, already exist");
        } else {
            System.out.println("No, we will create one");
            file.createNewFile();
        }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
