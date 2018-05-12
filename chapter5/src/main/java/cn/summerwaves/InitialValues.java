package cn.summerwaves;

public class InitialValues {
    private boolean aBoolean;
    private byte aByte;
    private short aShort;
    private int anInt;
    private long aLong;
    private char aChar;
    private float aFloat;
    private double aDouble;
    private InitialValues reference;

    private void printInitialValues() {
        System.out.println("数据类型:boolean    初始值: " + aBoolean);
        System.out.println("数据类型:byte    初始值: " + aByte);
        System.out.println("数据类型:short    初始值: " + aShort);
        System.out.println("数据类型:int    初始值: " + anInt);
        System.out.println("数据类型:long    初始值: " + aLong);
        System.out.println("数据类型:char    初始值: " + aChar);
        System.out.println("数据类型:float    初始值: " + aFloat);
        System.out.println("数据类型:double    初始值: " + aDouble);
        System.out.println("数据类型:reference    初始值: " + reference);

    }

    public static void main(String[] args) {
        InitialValues initialValues = new InitialValues();
        initialValues.printInitialValues();
    }
}
