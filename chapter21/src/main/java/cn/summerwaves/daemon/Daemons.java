package cn.summerwaves.daemon;

import java.util.concurrent.TimeUnit;

public class Daemons {
    //守护线程创建的线程都是守护线程
    public static void main(String[] args) throws InterruptedException {
        Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        System.out.println("d.isDaemon() = " + d.isDaemon() + " , ");
        TimeUnit.SECONDS.sleep(1);

    }
}
