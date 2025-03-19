package org.example.JavaBasic09;

public class Box2<T, E> {
    private T key;
    private E value;

    public Box2(T key, E value) {
        this.key = key;
        this.value = value;
    }

    public Box2() {}

    public T getkey() {
        return key;
    }

    public E getvalue() {
        return value;
    }

    public void setkey(T key) {
        this.key = key;
    }

    public void setvalue(E value) {
        this.value = value;
    }
}
