package p3;

import java.io.FileReader;
import java.nio.charset.Charset;

public class Program {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data3.txt", Charset.forName("UTF-16BE"))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
