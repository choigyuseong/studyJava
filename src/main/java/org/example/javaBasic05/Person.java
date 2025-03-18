package org.example.javaBasic05;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public Person() {}

    public String getName() { // name 을 반환하는 getter
        return name;
    }
    public void setName(String name) { // name 을 받아서 바꾸는 setter
        this.name = name;
    }
}
