package cn.summerwaves.extend.constructor;

public class ChildConstructor extends ParentConstructor {

    public ChildConstructor(String test) {
        super(test);
        System.out.println("继承：子类构造器");

    }
}
