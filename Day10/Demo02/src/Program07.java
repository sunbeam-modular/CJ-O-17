public class Program07 {
    public static void main(String[] args) {
        String s1 = "sunbeam"; // Immutable
        // String s1 = new String("sunbeam"); // Immutable

        //s1.toUpperCase(); // It creates an another String object
        String s2 = s1.toUpperCase();
        // Any runtime operation on the string creates a new String object

        System.out.println("s1 - " + s1);
        System.out.println("s2 - " + s2);


    }
}
