package org.example.JavaBasic08;

// 객체지향 프로그래밍 4. 추상화
public class JavaBasic08 {
    public static void main(String[] args) {
        // 추상화는 필요한 부분만 선택해 간략화하고 중요한 핵심만 강조하는 것을 의미한다.
        // interface 와 추상 클래스를 이용하여 구현한다.


        // Person p1 = new Person();
        // Person 클래스를 추상 클래스로 선언했기 때문에 객체를 마드는 것은 불가능하다.
        Person k1 = new Kid();
        k1.introduce(); // 상속받은 추상 메서드는 반드시 자식 클래스에서 구현해야한다.

        k1.setName("John");
        System.out.println(k1.getName());
        // 추상 클래스를 상속받았다고 해도 다른 필드나 메서드도 정상적으로 사용할 수 있다.
    }
}
