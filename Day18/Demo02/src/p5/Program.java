package p5;

enum Weeks {
    MON(1) {
        @Override
        public String toString() {
            return "Monday";
        }
    },
    TUESDAY(2),
    WED(3),
    THURS(4),
    FRI(5),
    SAT(6),
    SUN(7) {
        @Override
        public String toString() {
            return "Sunday";
        }
    };

    private int weekValue;

    Weeks(int weekValue) {
        this.weekValue = weekValue;
    }

    public int getWeekValue() {
        return weekValue;
    }
}

class WeekConstants {
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;
}

class AccountTypeConstant {
    public static final double SAVINGS = 2.5;
    public static final double D_MAT = 0.0;
    public static final double CURRENT = 1.2;

}

public class Program {
    public static void main(String[] args) {
        Weeks[] arr = Weeks.values();
        for (Weeks a : arr) {
            System.out.println("name() - " + a.name());
            System.out.println("ordinal() - " + a.ordinal());
            System.out.println("toString() - " + a.toString());
            System.out.println("Week Value() - " + a.getWeekValue());
            System.out.println("-------------------------------");
        }
        Weeks a = Weeks.MON;
        
    }
}
