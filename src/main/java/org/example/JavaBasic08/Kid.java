package org.example.JavaBasic08;

public class Kid extends Person{

    // 추상 클래스를 상속받은 자식 클래스에서는 추상메서드를 반드시 구현해야한다.
    @Override
    public void introduce() {
        System.out.println("Hello");
    }
    public Kid(String name, int age) {
        super(name, age);
    }
    public Kid() {}
}
