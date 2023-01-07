package com.example.week01.prac;


import java.util.ArrayList;
import java.util.List;

public class Prac5 {

    public static int countFruit(String fruit) {
        List<String> fruits = new ArrayList<>();
        fruits.add("감");
        fruits.add("배");
        fruits.add("감");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("감");

        int cnt = 0;
        for(int j = 0; j < fruits.size(); j++ ) {
            if(fruits.get(j) == fruit) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int gam = countFruit("감");
        int subak = countFruit("수박");
        int strw = countFruit("딸기");
        System.out.println(gam);
        System.out.println(subak);
        System.out.println(strw);
    }
}