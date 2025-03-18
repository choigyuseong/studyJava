package org.example;

import java.util.ArrayList;
import java.util.Arrays;

// 배열
public class JavaBasic02 {
    public static void main(String[] args) {

        // 배열을 ArrayList로, ArrayList 를 배열로 전환하는 법
//        String[] array = new String[]{"a", "b", "c"};
//
//        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
//        System.out.println(arrayList);
//
//
//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("a");
//        arrayList2.add("b");
//
//        String[] array2 = arrayList2.toArray(new String[0]);
//        for (String s : array2) {
//            System.out.println(s);
//        }
        // ArrayList 는 println 을 통해서 쉽게 출력할 수 있지만, 배열은 그렇지 않다.
        // ArrayList 내부에 toString() 이 오버라이딩 되어 있어서 그렇다.
        // 배열은 그렇지 않으므로, 따로 정의해주거나 import.java.util.Arrays; 후에 Arrays.toString() 으로 출력할 수 있다.



        // ArrayList 의 다양한 메서드
//        ArrayList<String> fruitsList = new ArrayList<>();
//        fruitsList.add("Apple");
//        fruitsList.add("Banana");
//        fruitsList.add("Orange");
//        fruitsList.add("kiwi");
//        // java 에서 배열을 생성할 때 크기가 정해진다. 크기 이상으로 요소를 추가하거나 삭제할 수 없다.
//        // 그래서 동적으로 크기가 변경되는 배열이 필요하다면 ArrayList 를 사용한다.
//
         // 정적 (Static) vs 동적 (Dynamic) 의 개념
        // 정적(Static) 은 프로그램 실행 전(컴파일 타임)에 크기 혹은 메모리 공간이 확정되어 실행 중에 변경되지 않는 방식이다.
        // 반대로 동적(Dynamic) 은 실행 중에 크기를 변경시킬수 있는 방식이다.
        // 정적은 메모리 낭비가 없고, 처리 속도가 빠르다는 장점이 있고, 동적은 상황에 따른 유연함이 장점이다.
        // 정해진 크기의 데이터를 관리할 때는 정적으로(ex. 공간 좌표), 크기가 변하는 데이터는 동적으로 관리하는게 정석이다.(ex. DB)



//        System.out.println(fruitsList.get(0));
//        // .get(index) 를 통해 요소에 접근할 수 있다.
//
//        fruitsList.set(3, "Watermelon"); // .set(index, element) 를 통해 요소를 바꿀 수 있다.
//        fruitsList.remove("Orange"); // .remove()는 index, element 둘 모두 사용가능하다.
//
//        for (String fruit : fruitsList) {
//            System.out.println(fruit);
//        }
//
//        if(fruitsList.contains("Watermelon")) {
//            System.out.println("There is watermelon");
//        } // .contains(element) 를 통해서 요소가 존재하는지 알 수 있다.
//
//        System.out.println(fruitsList.size()); //.size()를 통해서 크기를 알 수 있다.
//        fruitsList.clear(); // .clear() 를 통해서 Arraylist 초기화 가능
//
//        System.out.println(fruitsList.size());




//        int[] nums = {1, 2, 3, 4, 5}; // 기초적인 배열 선언 및 초기화 방법
//        String[] fruits = new String[] {"apple", "banana",  "orange", "kiwi"}; // 배열을 매개변수로 전달할 때 사용하는 방법
//
//        for ( int i = 0; i < nums.length; ++i) {
//            System.out.println(nums[i]);
//        }
//
//        for (int num : nums) {
//            System.out.println(num);
//        } // 기존 for 문보다 향상된 for 문을 사용할 수 있다.


    }
}
