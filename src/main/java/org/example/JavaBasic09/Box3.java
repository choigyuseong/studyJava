package org.example.JavaBasic09;

public class Box3 {

    // 클래스에서는 제네릭을 선언하지 않았지만 그 안의 메서드에서만 선언할 수도 있다.
    public <T> void printData(T data) {
        System.out.println(data);
    }
}
