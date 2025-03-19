package org.example.JavaBasic10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// 대표적인 컬렉션과 그 사용법 및 구현
public class JavaBasic10 {
    public static void main(String[] args) {
        // 컬렉션이란 여러 데이터를 모아 관리하는 자료구조를 말한다.
        // 대표적으로 List, Set, Map 이 존재한다.
        // List 의 특징으로는 순서가 존재하며 값들의 중복이 가능하다.
        // Set 은 순서가 존재하지 않고, 값들의 중복이 불가능하다.
        // Map 은 Key 와 Value 를 가지며 Value 의 중복은 가능하지만 Key 의 중복은 불가능하다.

        // List 의 대표적인 예시로는 ArrayList, LinkedList 가 존재한다.
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        // 주로 add() 로 추가, remove() 로 제거, get() 으로 조회한다.


        System.out.println(list);



        // Set 은 HashSet 과 TreeSet 이 존재한다.
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");

        System.out.println(set);



        // Map 은 HashMap 과 TreeMap 이 존재한다.
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("b", "b");

        System.out.println(map);
    }
}
