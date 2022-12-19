package be.intecbrussel.fileIO.Opdracht;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NewOpdracht {
    public static void main(String[] args) {
        try {
            // define path
            Path path1 = Path.of("C:\\Users\\intec\\IdeaProjects\\FilesExamples\\Opdracht.txt");
            // create parent directories
            Files.createDirectories(path1.getParent());
            // create if not exists
            if(Files.notExists(path1)) {
                Files.createFile(path1);
                System.out.println("File created");
            } else {
                System.out.println("File already exist");
            }
            // write lines of text to file
            List<String> lines = new ArrayList<>();
            lines.add("Hello Brussel");
            lines.add("Hello Paris");
            lines.add("Hello New York");
            lines.add("Hello Amsterdam");
            lines.add("Hello Monaco");
            Files.write(path1, lines, StandardCharsets.UTF_8,
                    StandardOpenOption.APPEND);
            // Read lines of text from file
            Files.lines(path1).forEach(System.out::println);

            // Rename file with another location

//            path1 = Files.move
//                    (Paths.get("C:\\Users\\intec\\IdeaProjects\\FilesExamples\\Opdracht.txt"),
//                            Paths.get("C:\\Users\\intec\\IdeaProjects\\FilesExamples\\OpdrachtMove.txt"));
//
//            if(path1 != null)
//            {
//                System.out.println("File renamed and moved successfully");
//            }
//            else
//            {
//                System.out.println("Failed to move the file");
//            }

            // print char
            String fileName = "C:\\Users\\intec\\IdeaProjects\\FilesExamples\\Opdracht.txt";
            Path file = Paths.get(fileName);
            BasicFileAttributes attr =
                    Files.readAttributes(file, BasicFileAttributes.class);

            System.out.println("creationTime: " + attr.creationTime());
            System.out.println("lastAccessTime: " + attr.lastAccessTime());
            System.out.println("lastModifiedTime: " + attr.lastModifiedTime());

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        Path path = Paths.get("C:\\Users\\intec\\IdeaProjects\\FilesExamples\\Opdracht.txt");

        // Create object having the file attribute
        FileOwnerAttributeView file = Files.getFileAttributeView(path,
                FileOwnerAttributeView.class);

        // Exception Handling to avoid any errors
        try {
            // Taking owner name from the file
            UserPrincipal user = file.getOwner();

            // Printing the owner's name
            System.out.println("Owner: " + user.getName());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
