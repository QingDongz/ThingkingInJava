package cn.summerwaves.ReturnResult;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();

        for (int i = 0;i<10;i++) {
            results.add(exec.submit(new TaskWithResult(i)));
        }

        for (Future<String> future : results) {
            try {
                //检查isDone方法是在什么地方改变的
                //结论：是在使用future.get()方法后改变的
                System.out.println("before "+future.isDone());
                System.out.println(future.get());
                System.out.println("after "+future.isDone());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        exec.shutdown();
    }
}
