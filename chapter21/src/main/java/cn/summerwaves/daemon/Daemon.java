package cn.summerwaves.daemon;

public class Daemon implements Runnable{
    private Thread[] t = new Thread[10];

    @Override
    public void run() {
        //这个线程启动后会创建十个线程
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new DaemonSpawn());
            t[i].start();
            System.out.println("DaemonSpawn " + i + " started, ");
        }

        for (int i = 0; i < t.length; i++) {
            System.out.println("t[" + i + "].isDaemon() = " + t[i].isDaemon() + ", ");
        }
        while (true) {
            Thread.yield();
        }

    }




}
