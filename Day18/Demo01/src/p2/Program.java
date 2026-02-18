package p2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
