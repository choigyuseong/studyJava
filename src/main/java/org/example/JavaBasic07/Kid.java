package org.example.JavaBasic07;

public class Kid extends Person{
    public void introduce() {
        System.out.println("안녕.");
    }

    @Override
    public void dance() {
        System.out.println("꿈틀거린다.");
    }
    // 어노테이션을 사용하지 않아도 java 에서 새로운 메서드를 추가한 것으로 간주하여 에러를 알려주지 않고 실행한다.
    // 어노테이션을 사용하면 컴파일 타임에 에러를 알려주기 때문에 ex. 스펠링 실수, 매개변수에 대한 잘못된 입력 등..
    // 개발자의 의도를 나타내기에도 더 좋다.
}
