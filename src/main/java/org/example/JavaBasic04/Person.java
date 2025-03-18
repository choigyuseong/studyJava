package org.example.JavaBasic04;

// class 는 속성(필드)와 기능(메서드) 가 포함되어 있다.
// 이 class 를 통해서 만들어진 실체를 객체라고 한다.
public class Person {

    // class 가 가진 필드 ex. name, age
    public String name;
    public int age;


    // class 가 가진 메서드 ex. sayHello()
    public void sayHello() {
        System.out.println("Hello! My name is " + name);
    }


    // 이와 같은 것을 생성자라고 하는데, 객체를 생성함과 동시에 초기화시킨다.
    public Person(String name, int age) { // class의 필드를 element로 받아서 초기화시킨다.
        this.name = name;
        this.age = age;
    }
    public Person() {} // 아무 요소도 받지 생성자 ( 기본생성자 )
    // 기본생성자를 만들지 않으면 Person p1 = new Person(); 코드를 통해서 객체를 생성할 수 없다.


    // 접근 제어자는 기본적으로 4가지가 존재한다.
    // 1. public, 2. protected, 3. default, 4. private
    // public은 어디서나 접근이 가능한 제어자다. Person.java 파일 내에서도 사용이 가능하고, JavaBasic04.java 파일 내에서도 사용이 가능하게 한다.
    // 하지만 private 은 해당 class 내에서만 접근이 가능하도록 한다.

    private String secret = "이건 내 비밀";
    public void saySecret() {
        System.out.println(secret);
    }


    // protected 의 경우에는 상속받은 경우에만 접근이 가능하다.
    // + java 에서는 같은 패키지내에 위치한다면 상속받지 않아도 접근가능하다.
    protected String dream = "내 꿈은 뭘까..?";


    // 마지막 default 는 같은 패키지 내부에서만 사용 가능하도록 하는 제어자이며 사용이 많지는 않다.
}
