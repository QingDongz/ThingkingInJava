package cn.summerwaves.daemon;

public class DaemonsDontRunFinally {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ADaemon());
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(1000);

    }
}
