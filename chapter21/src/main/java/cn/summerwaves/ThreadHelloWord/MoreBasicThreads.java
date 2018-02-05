package cn.summerwaves.ThreadHelloWord;

import static java.lang.System.out;

public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0;i < 5;i++) {
            new Thread(new LiftOff()).start();
        }
    }
}
