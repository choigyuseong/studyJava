package org.example.JavaBasic07;

// 객체지향 프로그래밍 3. 다형성
public class JavaBasic07 {
    public  static void main(String[] args) {

        // 다형성이란 하나의 객체가 여러가지 형태를 가질 수 있는 능력을 말한다.
        // 크게 오버라이딩, 오버로딩의 형태로 나뉘는데

        // 먼저 다형성의 기본형태는
        Person p1 = new Person();
        Kid k1 = new Kid();

        p1.introduce();
        k1.introduce();
        // 같은 메서드를 호출했지만 상속받은 관계에서 어떻게 정의하느냐에 따라서 결과가 다르다.


        // 어노테이션을 통해 @Override 오버라이딩한 메서드를 실행하면 자식클래스에서 오버라이딩된 메서드가 실행된다.
        Person p2 = new Kid();
        p2.dance();



        Calculator c1 = new  Calculator();

        System.out.println(c1.add(1, 2));
        System.out.println(c1.add(3.5, 4.5));
        System.out.println(c1.add(1, 2, 3));
        // 메서드 오버로딩을 통해서 이름이 같은 add() 메서드를 실행하지만 서로 다른 기능을 갖는다.

        // 부모클래스의 코드를 재사용한다는 점에서 코드 중복을 최소화 시킬수 있다.

    }
}
