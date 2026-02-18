package p3;

enum Account {
    SAVING {
        @Override
        public String toString() {
            return "SALARY SAVINGS ACCOUNT";
        }
    }, DMAT {
        @Override
        public String toString() {
            return "D-MAT";
        }
    }, CURRENT {
        @Override
        public String toString() {
            return "GOLD CURRENT ACCOUNT";
        }
    };
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
