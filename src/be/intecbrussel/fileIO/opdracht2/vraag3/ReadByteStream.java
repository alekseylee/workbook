package be.intecbrussel.fileIO.opdracht2.vraag3;

import java.io.*;

public class ReadByteStream {

    static String readInput() {
        StringBuffer buffer = new StringBuffer();
        try {
            FileInputStream fis = new FileInputStream("test.txt");
            InputStreamReader isr = new InputStreamReader(fis, "UTF8");
            Reader in = new BufferedReader(isr);
            int ch;
            while ((ch = in.read()) > -1) {
                buffer.append((char)ch);
            }
            in.close();
            return buffer.toString();
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
