package p1;

public class Program {
    public static void main(String[] args) {
        // 3 ways to get the meta data of the classes
        try {
            // way-1
            Class c1 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // way-2
        // if the class is present inside the current classpath
        Class c2 = String.class;

        // way-3
        // If already the object of the classes are present then
        // use the methoid getClass() from Object to get the Class Information
        String s = "sunbeam";
        Class c3 = s.getClass();
    }
}
