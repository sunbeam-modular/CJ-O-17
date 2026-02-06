public class Program04 {
    public static void main(String[] args) {
        String s1 = "sunbeam";
        String s2 = "sunbeam"; // Immutable

        s2 = "infotech";

        System.out.println("s1 - " + s1);
        System.out.println("s2 - " + s2);

        if (s1 == s2)
            System.out.println("Both are equal");
        else
            System.out.println("Both are not equal");

    }
}
