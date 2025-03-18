package org.example.JavaBasic07;

public class Calculator {

    // 메서드 오버로딩이란 같은 클래스에서 element의 타입이나 개수가 달라서 이름이 같아도 서로 구분되는 메서드를 만드는 방식이다.
    int add(int x, int y) {
        return x + y;
    }

    double add(double x, double y) {
        return x + y;
    }

    int add(int x, int y, int z) {
        return x + y + z;
    }
}
