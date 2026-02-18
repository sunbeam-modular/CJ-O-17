package p2;

enum Account {
    SAVING, DMAT, CURRENT
}

public class Program {
    public static void main(String[] args) {
        Account[] arr = Account.values();
        for (Account a : arr) {
            System.out.println("name() - " + a.name());
            System.out.println("ordinal() - " + a.ordinal());
            System.out.println("toString() - " + a.toString());
            System.out.println("-------------------------------");
        }
    }
}
