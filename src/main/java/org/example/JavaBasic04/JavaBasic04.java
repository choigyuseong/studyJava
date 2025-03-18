package org.example.JavaBasic04;

// class 와 객체 기본 및 접근 제어자
public class JavaBasic04 {
    public static void main(String[] args) {
        Person p1 = new Person(); // Person.java 에서 만든 class 를 통해서 p1을 만들었고 이 p1이 객체가 된다.

        p1.name = "Choi"; // 객체를 통해 클래스의 필드에 접근할 수 있고,
        p1.age = 25;

        p1.sayHello(); // 객체를 통해 클래스의 메서드도 사용할 수 있다.


        Person p2 = new Person("Kim", 15); // Person class 에서 만든 생성자를 이런식으로 사용할 수 있다.

        // p1.secret = "아무것도 없다.";
        // 이런식으로 Person.java 에서 secret 필드를 private 으로 작성했기 때문에 직접 접근할 수 없다.
        p1.saySecret(); // 대신 saySecret() 은 public 으로 작성했기 때문에 간접적으로 Secret에 접근할 수 있다.
        // 이를 이용해서 Getter, Setter 를 만들어서 필드에 접근한다.



        Kid k1 = new Kid();
        k1.dream = "내 꿈은 네이버 개발자!"; // 상속받이 않았지만 같은 class 내에 위치하기 때문에 접근이 가능하다.
        k1.sayDream();
    }
}
