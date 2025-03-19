package org.example.JavaBasic08;

public interface Animal {

    // interface 는 선언만하고 구현되지 않은 메서드를 주로 가진다.
    // 접근 제어자를 따로 타이핑하지 않아도 자동으로 public abstract 가 붙는다.
    // 필드도 만들 수 있지만 타입은 public static final 로(상수로) 고정된다.
    void behave();
    void eat();

}
