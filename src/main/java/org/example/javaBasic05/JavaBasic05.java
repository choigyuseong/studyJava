package org.example.javaBasic05;

// 객체지향 프로그래밍 1. 캡슐화

public class JavaBasic05 {
    public static void main(String[] args) {

        // 객체지향의 기본 4가지 개념은 1. 캡슐화, 2. 상속, 3. 다형성, 4. 추상화 다.
        Person p1 = new Person("Choi");
        // 우리는 p1 객체를 통해 person class 의 여러가지 필드에 접근할 수 있었다.
        // 하지만 필드에 직접적으로 접근한다면 잘못된 접근이나 의도치 않은 변경에 대비하기 쉽지 않다.
        // 그래서 class 의 필드를 기본적으로 private 으로 만들고 getter와 setter 를 만들어서 이를 통해 필드에 간접적으로 접근한다.

        System.out.println(p1.getName());

        p1.setName("John");
        System.out.println(p1.getName());


        // 이와 같이 코드를 구성했을 때 내부 구조가 변경되어도 외부 구조를 변경할 필요가 없다.
        // ex. Person 의 필드 name 을 firstName 으로 변경해도 JavaBasic05.java 를 변경할 필요 없이
        // Person.java 에서 getName() 을 변경하면 된다.
        // 또한 getName() 에 if(name == null || name.isEmpty()) {return "Name Error";} else {return name;} 과 같은 코드를 사용해
        // 검증 로직도 만들 수 있다.
    }
}
