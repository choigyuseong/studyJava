package org.example.JavaBasic09;

import java.util.ArrayList;
import java.util.List;

// 제네릭에 대해서 ( 일반 제네릭 <T>, 와일드카드 제네릭<?> )
public class JavaBasic09 {
    public static void main(String[] args) {
        // 제네릭이란 클래스, 메서드에서 사용할 타입을 외부에서 지정하는 방법을 말한다.
        // ArrayList 를 만들 때 사용하는 방법을 보면
        List<String> list = new  ArrayList<>();
        // 와 같이 사용된다.


        // 제네릭을 사용하기 이전에는
//        ArrayList list1 = new ArrayList();
//        list1.add("Java");
//
//        String lang = (String) list1.get(0);

        // 이런식으로 사용해야했다. 제네릭 문법을 사용해 타입을 지정하면 굳이 형변환을 한 필요가 없어진다.
        // 또한 타입을 명시했기 때문에 컴파일 타임에 타입을 체크해 오류를 확인할 수 있다.


        list.add("Java");
        String lang = list.get(0);
        System.out.println(lang);


        // 제네릭을 사용한 클래스 선언을 보면 Box 클래스에서 필드로 가진 data 의 타입을 명시하지 않고 T 라는 타입으로 선언했다.
        // 이는 Box 클래스 내부에서 결정하는 것이 아니라 Box 의 객체인 dataBox 를 만드는 시점에서 data 의 타입을 결정하게 된다.
        Box1<Integer> dataBox1 = new Box1<Integer>(5);
        System.out.println(dataBox1.getData().getClass().getName());
        // 제네릭 문법에 따라 data 의 타입을 Integer 형태로 지정한 순간 객체 dataBox 의 data 의 타입은 Integer 가 된다.


        // 반대로 String 으로 선언해준다면 dataBox2 의 data 의 타입은 String 이 된다.
        Box1<String> dataBox2 = new Box1<String>("Java");
        System.out.println(dataBox2.getData().getClass().getName());


        // 같은 방법으로 element 를 1개만 받는 것이 아닌 2개 이상도 받을 수 있다. (Map 에서 사용)
        Box2<Integer, String> dataBox3 = new Box2<Integer, String>();
        dataBox3.setkey(1);
        dataBox3.setvalue("Java");
        System.out.println(dataBox3.getkey().getClass().getName() + ", " + dataBox3.getvalue().getClass().getName());


        // class 에서 제네릭을 선언 안하더라도 그 안의 메서드에서만 사용하는 것도 가능하다.
        Box3 dataBox4 = new Box3();
        dataBox4.printData("Hello");
        dataBox4.printData(1532);



        // 와일드 카드 제네릭
        // 제네릭의 상한경계
        // 제네릭을 통해서 모든 타입을 element 로 받을 수 있다. 하지만 가끔 받는 타입에 
        // 제한을 둬야할 때가 있는데 이 때 제한된 제네릭을 사용한다.

        NumerBox<Integer> dataBox5 = new NumerBox<>(25);
        dataBox5.printData();

        NumerBox<Double> dataBox6 = new NumerBox<>(5.7);
        dataBox6.printData();

//        NumerBox<String> dataBox7 = new NumerBox<>("Java");
//        dataBox6.printData();

        // NumerBox 가 Number 클래스를 extends 하였으므로 그 하위 클래스 타입인
        // Integer, Double 등.. 은 가능하지만 String 은 불가능하다.


        // 제네릭의 상한경계를 보통 사용하는 경우
        // 숫자 타입만 허용하고 싶은 경우) <T extends Number>
        // 특정 인터페이스 구현 클래스만 허용할 때) <T extends interface>
        // 특정 클래스를 상속받은 클래스만 허용할 때) <T extends class>





        // 제네릭의 하한경계는 <? super class> 와 같이 사용한다.
        List<Integer> genericList1 = new ArrayList<>();
        List<Number> genericList2 = new ArrayList<>();
        List<Object> genericList3 = new ArrayList<>();

        addList(genericList1);
        addList(genericList2);
        addList(genericList3);

        // addList(new ArrayList<Double>());
        // <? super Integer> 이므로 Integer 보다 상위 클래스로 선언된 List 들은 모두 
        // addList() 메서드가 실행 가능하지만
        // Double 타입을 가진 List 는 addList() 메서드가 실행이 불가능하다.





        // 읽기 전용 ( 상한 경계 ) vs 추가 전용 ( 하한 경계 )

        // 일반 제네릭의 경우 <T> 타입을 명시해주기 때문에 컴파일러에서 타입을 인지할 수 있다.
        // 하지만 와일드카드 제네릭의 경우 <?> 으로 타입이 정확하게 무엇인지 알 수 없다.
        // 즉 타입 안정성에 따라서 어떤 경우에 어떤 역할을 하는지가 정해진다.


        // 상한 경계의 경우 get() 을 통해 값을 읽을 때는 Number 클래스를 통해서
        // Integer, Double, Float 의 값을 안전하게 읽을 수 있다.
        // 추가의 경우 자바에서는 의도된 바가 아니라면 가장 하위 타입으로 제한하여
        // 받으려고 한다.
        // 이 경우 add() 되는 값이 Integer 인지 Double 인지 알 수 없기 때문에
        // 추가의 기능은 사용하지 않는다.

        List<? extends Number> numList1 = new ArrayList<>();
//        numList1.add(10); // 10 의 타입이 뭔지 모르기 때문에 사용 불가
        Number num =  numList1.get(0);
        // 어떤 타입이던지 상관없이 Number 라는 상위 클래스가 담아줄 수 있기 때문에
        // 사용이 가능하다.




        // 반대로 하한 경계는 get() 을 통해서 Object 인 경우에만 안전하게 읽을 수 있으므로
        // 읽는 기능은 사용하지 않는다.
        // 반대로 add() 추가 기능은 제한된 타입 중 가장 낮은 Integer 타입으로 받기 때문에
        // 안전하게 사용할 수 있다.
        List<? super Integer> numList2 = new ArrayList<>();
        numList2.add(10);
//        Object num = numList2.get(0); // Object 타입이 아닌 경우 사용 불가

    }

    public static void addList(List<? super Integer> testList) { 
        // 메서드에서 사용할 때 상한경계도 마찬가지로 <? extends class> 와 같이 사용할 수 있다.
        testList.add(1);
        testList.add(2);

    }
}
