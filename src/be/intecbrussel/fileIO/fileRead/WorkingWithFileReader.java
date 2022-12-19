package be.intecbrussel.fileIO.fileRead;

import java.io.FileReader;
import java.io.IOException;

public class WorkingWithFileReader {

    public static void readTheFile() {

        //example 1
//        FileReader fileReader = null;
//
//        try  {
//
//            fileReader = new FileReader("C:\\Users\\intec\\IdeaProjects\\FilesExamples\\myNewText3.txt");
//            int position;
//
//            while ((position = fileReader.read()) != -1 ) {
//                System.out.println((char) position);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (fileReader != null) {
//                    fileReader.close();
//                }
//            } catch (IOException a) {
//                a.printStackTrace();
//            }
//        }


        //example 2
        try (FileReader fileReader = new FileReader("C:\\Users\\intec\\IdeaProjects\\FilesExamples\\myNewText3.txt")) {

            int position;

            while ((position = fileReader.read()) != -1 ) {
                System.out.println((char) position);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
