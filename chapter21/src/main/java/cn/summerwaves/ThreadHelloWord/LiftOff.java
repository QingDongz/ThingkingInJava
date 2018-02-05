package cn.summerwaves.ThreadHelloWord;

public class LiftOff implements Runnable{
    public int countDown = 10;
    public static int taskCount = 0;
    public final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "线程已结束") + "), ";
    }


    public void run() {
        while (countDown-- > 0) {
            System.out.print(status());
            Thread.yield();
        }
        System.out.println();
    }
}
