package org.example.JavaBasic04;

// extends 는 상속받는다는 의미이다.
public class Kid extends Person {
    public void sayDream() {
        System.out.println(dream);
    } // Kid class 는 Person 을 상속받았기 때문에 protected 로 보호된 dream 필드에 접근이 가능하다.
}
