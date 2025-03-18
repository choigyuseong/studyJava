package org.example.JavaBasic07;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person() {}

    public void introduce() {
        System.out.println("안녕하세요.");
    }

    public void dance() {
        System.out.println("춤을 춘다.");
    }
}
