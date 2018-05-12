package cn.summerwaves;

import java.util.Objects;

public class Value {
    public int anInt;
    public int getAnInt;

    @Override
    public String toString() {
        return "Value{" +
                "anInt=" + anInt +
                ", getAnInt=" + getAnInt +
                '}';
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public int getGetAnInt() {
        return getAnInt;
    }

    public void setGetAnInt(int getAnInt) {
        this.getAnInt = getAnInt;
    }

    public void fuck() {
        System.out.println("fuck you");
    }

    public void test(Integer fuck) {

        this.anInt = fuck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Value)) return false;
        Value value = (Value) o;
        return anInt == value.anInt &&
                getAnInt == value.getAnInt;
    }

    @Override
    public int hashCode() {

        return Objects.hash(anInt, getAnInt);
    }
}
