package org.example.JavaBasic09;

// 제네릭을 사용해 클래스를 선언할 수 있다.
// 이 경우 data 의 타입은 내부에서 정해지는게 아니라 Box 의 객체를 만들 외부에서 정하게 된다.
public class Box1<T> { // 클래스 이름 옆에 <T> 로 선언해준다.
    private T data;

    public Box1(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
