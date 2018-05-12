package cn.summerwaves;

public class Main {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("一个新的线程")).start();
    }
}

