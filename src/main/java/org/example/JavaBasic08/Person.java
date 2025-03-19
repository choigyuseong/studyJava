package org.example.JavaBasic08;


// abstract 를 이용하여 추상 클래스를 선언할 수 있다.
// 추상 클래스의 특징으로는 객체를 생성할 수 없고, 구현부가 없는 메서드를 구현할 수 있다.
abstract public class Person {
    private String name;
    private int age;

    abstract public void introduce(); // abstract 를 이용해 추상 메서드를 만들수 있고, 추상 메서드는 구현부가 필요 없다.

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person() {}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
