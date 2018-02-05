package cn.summerwaves;

import java.util.Objects;

public class Value {
    public int anInt;
    public int getAnInt;

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
