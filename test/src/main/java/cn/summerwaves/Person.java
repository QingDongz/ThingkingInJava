package cn.summerwaves;

public class Person implements Human {
    private InnerInterface inner;

    public Person(InnerInterface inner) {
        this.inner = inner;
    }

    public Person() {
        System.out.println("fuck");
    }





    public void speak() {

    }

    @Override
    public void say() {
        inner.say();
    }
}
