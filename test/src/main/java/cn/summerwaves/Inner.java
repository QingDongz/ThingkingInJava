package cn.summerwaves;

public class Inner implements InnerInterface{
    private String say;

    public Inner(String say) {
        this.say = say;
    }

    public void say() {
        System.out.println(say);
    }


}
