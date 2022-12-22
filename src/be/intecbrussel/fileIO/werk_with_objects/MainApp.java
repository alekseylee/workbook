package be.intecbrussel.fileIO.werk_with_objects;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainApp {
    public static void main(String[] args) {

        Person person1 = new Person("Henk", 77);
        Person person2 = new Person("Bill", 5);
        Person person3 = new Person("Larry", 35);

        //create directories and file
        Path path = Path.of("myfolder/innerfolder/myfile.txt");

        File file = path.toFile();

        if (!Files.exists(path.getParent())) {
            try {
                Files.createDirectories(path.getParent());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
//                new FileOutputStream("myfolder/innerfolder/myfile.txt"))) {
//            objectOutputStream.writeObject(person1);
//        } catch (IOException ioException) {
//            ioException.printStackTrace();
//        }


        //write Person to file
        try (ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("myfolder/innerfolder/myfile.txt"))) {

            Person someone = (Person) objectInputStream.readObject();
            System.out.println(someone);

            } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
            }

        //read all Persons in the file
        try (ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("myfolder/innerfolder/myfile.txt"))) {
            Person someone;
            while ((someone = (Person) objectInputStream.readObject()) != null) {
                System.out.println(someone);
            }
        } catch (EOFException eofException) {
            System.out.println("Reached the end of the file.");
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
