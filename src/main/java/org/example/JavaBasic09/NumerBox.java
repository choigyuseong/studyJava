package org.example.JavaBasic09;

// extends 를 사용해서 Number 의 하위 클래스 타입만 가능만 T 의 타입으로 기능할 수 있게
// 제한할 수 있다.
public class NumerBox <T extends Number>{
    private T data;
    public NumerBox(T data){
        this.data = data;
    }
    public double square() {
        return data.doubleValue() *  data.doubleValue();
    }

    public void printData() {
        System.out.println(data);
    }

}
