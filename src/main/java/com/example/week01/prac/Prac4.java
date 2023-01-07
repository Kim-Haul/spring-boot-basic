package com.example.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac4 {
    public static void main(String[] args) {

        List<String> celebs = new ArrayList<>();
        celebs.add("아이유");
        celebs.add("린다G");
        celebs.add("은비");
        celebs.add("금비");
        celebs.add("비");
        celebs.add("차은우");
        celebs.add("남주혁");
        celebs.add("수지");
        celebs.add("정우성");
        celebs.add("제니");
        celebs.add("정국");

        // 반복문
        for (int i = 0; i < celebs.size(); i++) {
            System.out.println(celebs.get(i));
        }

        // 조건문
        int age = 20;
        if (age > 19) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }
    }

}




