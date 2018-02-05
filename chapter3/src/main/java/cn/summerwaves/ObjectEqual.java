package cn.summerwaves;

import org.junit.Assert;
import org.junit.Test;

public class ObjectEqual {

    /**
     * 使用"equal"的相等
     */
    @Test
    public void objectEqualByEquals() {
        Integer integer1 = 47;
        Integer integer2 = 47;
        Integer integer3 = 128;
        Integer integer4 = 128;
        Integer integer5 = new Integer(47);
        Integer integer6 = new Integer(47);

        Value value1 = new Value();
        Value value2= new Value();

        value1.anInt = value2.anInt = 100;

        System.out.println(integer1.equals(integer2));
        System.out.println(integer3.equals(integer4));
        System.out.println(integer5.equals(integer6));
        System.out.println(value1.equals(value2));

    }


    /**
     * 使用"=="的相等
     */
    @Test
    public void objectEqualByOperator() {
        Integer integer1 = 47;
        Integer integer2 = 47;
        Integer integer3 = 128;
        Integer integer4 = 128;

        System.out.println(integer1 == integer2);
        System.out.println(integer3 == integer4);
    }



}
