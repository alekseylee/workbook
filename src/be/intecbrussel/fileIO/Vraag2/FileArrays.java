package be.intecbrussel.fileIO.Vraag2;


import java.io.File;
import java.nio.file.Path;

public class FileArrays {
    public static void main(String[] args) {

            Path path = Path.of("C:\\Users\\intec\\IdeaProjects\\FilesExamples\\");

            File aDirectory = path.toFile();
            File[] files = aDirectory.listFiles();

            for (File file : files) {

                if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getName());
                } else {
                    System.out.println("File: " + file.getName());
                }
            }
        }
    }


