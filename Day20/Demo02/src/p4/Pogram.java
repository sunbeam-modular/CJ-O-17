package p4;

public class Pogram {
    public static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Object obj = new Object();

        class SunbeamThread extends Thread {
            @Override
            public void run() {
                String s = "Sunbeam";
                synchronized (obj) {
                    for (int i = 0; i < s.length(); i++) {
                        System.out.print(s.charAt(i));
                        delay();
                    }
                    obj.notify();
                }
            }
        }

        class InfotechThread extends Thread {
            @Override
            public void run() {
                String s = " Infotech";
                synchronized (obj) {
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for (int i = 0; i < s.length(); i++) {
                        System.out.print(s.charAt(i));
                        delay();
                    }
                }
            }
        }

        Thread st = new SunbeamThread();
        Thread it = new InfotechThread();
        it.start();
        st.start();


    }
}
