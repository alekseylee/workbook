package be.intecbrussel.fileIO.opdracht2.vraag3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriteByteStream {
    static void writeOutput(String str) {
        try {
            FileOutputStream fos = new FileOutputStream("test.txt");
            Writer out = new OutputStreamWriter(fos, "UTF8");
            out.write(str);
            out.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
