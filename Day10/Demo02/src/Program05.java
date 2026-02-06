public class Program05 {
    public static void main(String[] args) {
        String s1 = new String("Sunbeam");
        String s2 = new String("sunbeam"); // Immutable

        s2 = new String("Infotech");

        System.out.println("s1 - " + s1);
        System.out.println("s2 - " + s2);

        if (s1 == s2)
            System.out.println("Both are equal");
        else
            System.out.println("Both are not equal");

    }
}
