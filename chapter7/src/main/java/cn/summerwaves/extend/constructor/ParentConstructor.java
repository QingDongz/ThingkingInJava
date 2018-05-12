package cn.summerwaves.extend.constructor;

public class ParentConstructor {
    private String fuck;
    public ParentConstructor(String fuck) {
        this.fuck = fuck;
        System.out.println("继承：父类构造器");
        System.out.println(fuck + " you");
        System.out.println("===========父类构造器分割线=========");
    }
}
