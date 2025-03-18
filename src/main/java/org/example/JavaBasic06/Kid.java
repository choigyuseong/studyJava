package org.example.JavaBasic06;

public class Kid extends Person {
    public void hungry() {
        System.out.println("응애");
    }
    @Override // 부모 클래스의 메서드인 sayMyName() 을 자식 클래스에서 바꾸기 위해서는 @Override 를 적어야한다.
    public void sayMyName() {
        System.out.println("응애");
    }

    // 생성자는 기본적으로 상속되지 않으므로 따로 작성해주어야한다.
    public Kid(String name, int age,  String job) {
        super(name, age, job); // super() 메서드는 부모 클래스의 생성자를 호출한다.
    }
    public Kid() {} // 부모 클래스에서 기본 생성자를 만들었다면 자식 클래스의 기본 생성자에서는 super() 를 타이핑해줄 필요는 없다.

    public void smartBabySayMyName() {
        super.sayMyName(); // 이런식으로 부모 클래스의 생성자를 호출해 그 메서드까지 사용할 수 있다.
    }
}
