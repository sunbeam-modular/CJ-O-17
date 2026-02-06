public class Program06 {
    public static void main(String[] args) {
        String s1 = "sunbeam";
        // String s2 = "sun" + "beam"; // "sunbeam" // compile time operation
        String s2 = "sun"; // Immutable
        String s3 = s2 + "beam"; // run time operation will always create new object

        System.out.println("s1 - " + s1);
        System.out.println("s2 - " + s2);
        System.out.println("s2 - " + s3);

//        if (s1 == s2)
        if (s1 == s3)
            System.out.println("Both are equal");
        else
            System.out.println("Both are not equal");

    }
}
