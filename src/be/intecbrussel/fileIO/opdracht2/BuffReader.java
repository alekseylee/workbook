package be.intecbrussel.fileIO.opdracht2;

import java.io.*;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class BuffReader {

    public static void readBuff() {
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("C:\\Users\\intec\\IdeaProjects\\FilesExamples\\Opdracht2.txt"))) {

//            Scanner scanner = new Scanner(bufferedReader);
//            String line = scanner.nextLine();
//            if(scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//            } else {
//                scanner.close();
//            }
            Scanner scan = new Scanner(bufferedReader);
        while(scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }

        scan.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }




    }



}
