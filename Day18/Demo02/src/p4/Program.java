package p4;

enum Account {
    SAVING(2.5) {
        @Override
        public String toString() {
            return "SALARY SAVINGS ACCOUNT";
        }
    }, DMAT(0) {
        @Override
        public String toString() {
            return "D-MAT";
        }
    }, CURRENT(1.2) {
        @Override
        public String toString() {
            return "GOLD CURRENT ACCOUNT";
        }
    };

    private double roi;

    Account(double roi) {
        this.roi = roi;
    }

    public double getRoi() {
        return roi;
    }
}

public class Program {
    public static void main(String[] args) {
        Account[] arr = Account.values();
        for (Account a : arr) {
            System.out.println("name() - " + a.name());
            System.out.println("ordinal() - " + a.ordinal());
            System.out.println("toString() - " + a.toString());
            System.out.println("ROI() - " + a.getRoi());
            System.out.println("-------------------------------");
        }
    }
}
