package cn.summerwaves.ThreadHelloWord;

public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
    }
}
