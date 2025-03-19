package org.example.JavaBasic08;

public class Dog implements Animal {

    // implements 를 사용해서 Animal interface 를 구현할 수 있다.
    // 추상 클래스와 비슷하게 interface 에서 만든 메서드들은 오버라이딩을 통해서 구현부를 만들어야한다.
    @Override
    public void behave() {
        System.out.println("Brrrrr...");
    }
    @Override
    public void eat() {
        System.out.println("Eat...");
    }

}
