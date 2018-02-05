package cn.summerwaves.Executor;

import cn.summerwaves.ThreadHelloWord.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixThreadPool {
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i=0;i<5;i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
        Long end = System.currentTimeMillis();
        System.out.println("FixThreadPool运行共用了 " + (end - start) + " ms");
    }
}
