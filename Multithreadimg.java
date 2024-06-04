import java.util.*;

// public staic void main(String[] args) {

//     float a = 7/4.0f * 9/2.0f;
//     System.out.println(a);
// }

class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                System.out.println("Even number : " + i);
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd number: " + i);
            }
        }
    }
}

class MyThread implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

public class Multithreadimg {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread th = new Thread(t);
        th.start() ;

        MyThread1 t1 = new MyThread1();
        t1.start();

        MyThread2 t2 = new MyThread2();
        t2.start();
    }
}
