package cn.summerwaves.Executor;

import cn.summerwaves.ThreadHelloWord.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedTreadPool {
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0;i<5;i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
        Long end = System.currentTimeMillis();
        System.out.println("CachedTreadPool运行共用了 " + (end - start) + " ms");
    }
}
