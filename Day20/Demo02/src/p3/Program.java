package p3;

class BankAccount {
    int accno;
    double balance;

    public BankAccount(int accno, double balance) {
        this.accno = accno;
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
    }

    public synchronized void withdraw(double amount) {
        double newBalance = balance - amount;
        balance = newBalance;
    }
}

public class Program {
    public static void delay() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1001, 10000);

        class DepositThread extends Thread {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    b1.deposit(10000);
                    System.out.println("Balance after deposit - " + b1.balance);
                    delay();
                }
            }
        }

        class WithdrawThread extends Thread {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    b1.withdraw(10000);
                    System.out.println("Balance after withdraw - " + b1.balance);
                    delay();
                }
            }
        }

        Thread dt = new DepositThread();
        Thread wt = new WithdrawThread();

        dt.start();
        wt.start();

        try {
            dt.join();
            wt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance - " + b1.balance);
    }
}
