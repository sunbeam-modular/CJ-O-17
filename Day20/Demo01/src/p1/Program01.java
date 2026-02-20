package p1;

class Person extends Thread {
    @Override
    public void run() {
        super.run();
    }
}

class Employee {

}

class Manager extends Employee implements Runnable {

    @Override
    public void run() {

    }
}

public class Program01 {

    public static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        class MyThread extends Thread {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("MyThread - " + i);
                    delay();
                }
            }
        }
        MyThread t1 = new MyThread();
        t1.start();

        class MyRunnable implements Runnable {
            @Override
            public void run() {
                for (int i = 11; i <= 20; i++) {
                    System.out.println("MyRunnable - " + i);
                    delay();
                }
            }
        }
        MyRunnable myRunnable = new MyRunnable();
        Thread t2 = new Thread(myRunnable);
        t2.start();

        for (int i = 21; i <= 30; i++) {
            System.out.println("Main - " + i);
            delay();
        }
    }
}
