package com.example.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        String course1 = "웹 개발의 봄 Spring";
        String course2 = "프론트엔드의 꽃 Recat";
        myList.add(course1);
        myList.add(course2);
        System.out.println(myList);
        System.out.println(myList.get(1));
        System.out.println(myList);
        System.out.println(myList.remove(1));
        System.out.println(myList);
    }
}
