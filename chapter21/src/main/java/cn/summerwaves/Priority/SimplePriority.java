package cn.summerwaves.Priority;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimplePriority implements Runnable {
    private int countDown = 5;
    private volatile double d;
    private int priority;


    public SimplePriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return Thread.currentThread() + ": " + countDown;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        while (true) {
            //进行这些运算是毫无意义的，只是进行浮点运算，增加开销，以便看出优先级效果
            for (int i = 0;i < 100000;i++) {
                d += (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0) {
                    Thread.yield();
                }
            }
//            Thread.yield();
            System.out.println(this);
            if (--countDown == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i =0;i<5;i++) {
            exec.execute(new SimplePriority(Thread.MIN_PRIORITY));
        }
        exec.execute(new SimplePriority(Thread.MAX_PRIORITY));
        exec.shutdown();
    }
}
