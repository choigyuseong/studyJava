package org.example;

import java.util.ArrayList;
// 자바의 메모리에 관해서
public class JavaBasic03 {
    public static void main(String[] args) {

        // C에서는 정적 메모리는 Stack에서, 동적 메모리는 Heap 에서 관리한다.
        // 02 ArrayList 에 대해서 배우면서 ArrayList와 같이 동적 메모리를 java 에서는 어떻게 관리할까


        // 먼저, C에서는, Heap에서 메모리를 관리하기 위해서 malloc, free 와 같은 메서드로 할당 및 해제를 해준다.
        // 하지만 java에서는 JVM이 가비지 컬렉터를 통해서 관리한다.
        // 가비지 컬렉터의 원리는 Heap 메모리에 생성된 객체 중 더이상 사용(참조)되지 않는 객체는 가비지로 분리되고, 일정 간격으로 JVM이 가비지를 찾아
        // 메모리를 해체한다. C와 같이 따로 메모리를 관리하지 않아도 된다.


        // java의 메모리는 Stack, Heap, Method Area 로 나뉜다.
        // Stack 에는 원시타입 변수, 참조형 타입의 주소가 저장되고 메서드의 호출과 지역변수를 관리힌다.
        int a = 1; // Stack 에 저장
        double b = 3.14; // Stack 에 저장
        String c = "Hello"; // 실제 값은 Heap에 저장되지만 주소가 Stack 에 저장


        // 반면 Heap 에서는 모든 객체를 저장한다.
        String[] array = new String[]{"a", "b", "c"};
        for (String s : array) {
            System.out.println(s);
        } // 배열도 객체로 보아 Heap에 저장한다.

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        System.out.println(list);
        // ArrayList 객체 역시 Heap에 저장된다.
        
        // 즉, 형태가 정적이냐 동적이냐에 따라서 어느 메모리에 저장되는지가 아니고,
        // 어떤 타입이냐에 따라서 어디에 저장되는지가 나뉘게 된다.

        System.out.println(specialOne);

    }
    // Method Area 에서는 정적 변수를 저장한다.
    static String specialOne = "José Mourinho";


    // 즉, Java 에서는 JVM이 Heap 메모리를 관리해주기 때문에 따로 할당 및 해제를 해줄 필요가 없지만, 그만큼 메모리 누수에 신경을 써줘야한다.
    // 이를 이해하고 안정적으로 다룰수 있도록 해야한다.
}
