package be.intecbrussel.fileIO.opdracht2.vraag3;

import static be.intecbrussel.fileIO.opdracht2.vraag3.ReadByteStream.readInput;
import static be.intecbrussel.fileIO.opdracht2.vraag3.WriteByteStream.writeOutput;

public class MainApp {
    public static void main(String[] args) {

        String jaString = new String("\u0042\u0065\u006C\u0067\u0069\u0065");
        writeOutput(jaString);
        String inputString = readInput();
        String displayString = jaString + " " + inputString;
        new ShowString(displayString, "Conversion Demo");

    }
}
