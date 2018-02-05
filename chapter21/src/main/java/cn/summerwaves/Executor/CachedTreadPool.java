package cn.summerwaves.Executor;

import cn.summerwaves.ThreadHelloWord.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedTreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0;i<5;i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
