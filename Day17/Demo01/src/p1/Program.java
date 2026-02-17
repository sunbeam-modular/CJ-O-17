package p1;

import java.io.File;

public class Program {
    public static void main(String[] args) {
        // File file = new File("D:/Training/Courses/Modular/CJ-O-17/CJ-O-17/Day17/Day17_Help.MD");
        File file = new File("D:/Training/Courses/Modular/CJ-O-17/CJ-O-17/Day17");
        if (file != null)
            System.out.println(file);
        // System.out.println("Is it a file ? - " + file.isFile());
        // System.out.println("Is it a directory ? - " + file.isDirectory());
        if (file.isFile()) {
            System.out.println(file.getName());
            System.out.println(file.lastModified());
            System.out.println(file.getParent());
        }
        if (file.isDirectory()) {
            String[] list = file.list();
            for (String e : list)
                System.out.println(e);
        }
    }
}
