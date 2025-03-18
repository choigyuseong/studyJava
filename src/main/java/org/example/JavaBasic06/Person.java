package org.example.JavaBasic06;

public class Person {
    private String name;
    private int age;
    private String job;
    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public Person(){}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("Hello! I'm " + name );
    }
}
