package org.example.JavaBasic10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// 대표적인 컬렉션과 그 사용법 및 구현
public class JavaBasic10 {
    public static void main(String[] args) {
        // 컬렉션은 여러 데이터를 모아 관리하는 자료구조다.
        // 대표적으로 List, Set, Map 이 존재한다.


        // List 의 특징으로는 순서가 존재하며 값들의 중복이 가능하다.
        // List 에는 ArrayList, LinkedList, Vector 이 존재한다.

        // 1. ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("list1");
        arrayList.add("list2");
        System.out.println(arrayList);
        arrayList.remove("list2");
        String str = (arrayList.get(0));
        // 주로 add() 로 추가, remove() 로 제거, get() 으로 조회한다.
        System.out.println(arrayList + ", "  + str);



        // 2. LinkedList
        //


        // Set 은 순서가 존재하지 않고, 값들의 중복이 불가능하다.
        // Set 은 HashSet 과 LinkedHashSet, TreeSet 이 존재한다.
        HashSet<String> set = new HashSet<>();
        set.add("set1");
        set.add("set2");

        System.out.println(set);


        // Map 은 Key 와 Value 를 가지며 Value 의 중복은 가능하지만 Key 의 중복은 불가능하다.
        // Map 은 HashMap 과 LinkedHashMap, TreeMap 이 존재한다.
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        System.out.println(map);
    }
}
