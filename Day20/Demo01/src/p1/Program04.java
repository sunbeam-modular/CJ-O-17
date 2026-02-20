package p1;


public class Program04 {

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
                for (int i = 1; i <= 7; i++) {
                    System.out.println("MyRunnable - " + i);
                    delay();
                }
            }
        }
        MyRunnable myRunnable = new MyRunnable();
        Thread t2 = new Thread(myRunnable);
        t2.setDaemon(true);
        t2.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main - " + i);
            delay();
        }

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program Finished");
    }
}
