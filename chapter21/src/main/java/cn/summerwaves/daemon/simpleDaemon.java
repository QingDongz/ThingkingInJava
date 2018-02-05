package cn.summerwaves.daemon;

import java.util.concurrent.TimeUnit;

public class simpleDaemon implements Runnable {


    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            System.out.println("sleep() interrupted");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0 ;i < 10 ;i++) {
            Thread daemon = new Thread(new simpleDaemon());
            daemon.setDaemon(true);
            daemon.start();
        }
        //主线程还在，守护线程就不会停止，主线程停止，守护线程就会随之停止
        System.out.println("all daemon started");
        TimeUnit.MILLISECONDS.sleep(10000);
    }
}
