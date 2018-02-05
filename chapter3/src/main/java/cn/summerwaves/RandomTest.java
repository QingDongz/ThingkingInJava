package cn.summerwaves;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class RandomTest {
    @Test
    public void randomTest() {
        Random random = new Random();
//        random.setSeed(1);
        for (int i = 0; i < 10000; i++) {
            Integer randomV = random.nextInt(10);
            if (randomV >= 5) {
                System.out.println("大于等于十");
                System.out.println(randomV);
            }
        }

    }
}
