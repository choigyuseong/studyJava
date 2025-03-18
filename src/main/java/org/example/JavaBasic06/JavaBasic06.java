package org.example.JavaBasic06;

// 객체지향 프로그래밍 2. 상속
public class JavaBasic06 {
    public static void main(String[] args) {
        // 앞서 protected 를 학습하면서 extends class 를 붙이면 상속된다는 것을 확인했다.
        // 상속에는 부모 클래스와 자식 클래스가 있는데,
        // class1 extends class2 에서 class1 이 자식 클래스 class2 가 부모 클래스가 된다.
        // 이 때 자식 클래스는 부모 클래스를 기반으로 생성되게 된다.


        Person p1 = new Person("Choi", 25, "student");
        Kid k1 = new Kid("John", 1, "baby"); // Person 의 필드인 name, age, job 을 따로 만들어주지 않아도 가지고 있다.


        p1.sayMyName();
        k1.sayMyName();
        k1.smartBabySayMyName();


        // java 에서는 단일 상속, 하나의 클래스는 하나의 클래스만을 상속하는 것이 원칙이다. 만약 여러개의 클래스의 기능을 포함하고 싶다면
        // 인터페이스를 이용해야한다.


    }
}
