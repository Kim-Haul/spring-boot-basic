package com.example.week01.prac;

public class Prac3 {

    // 파라미터 X, 반환값 X
    public static void simplePrint() {
        System.out.println("파라미터도 없고, 반환값도 없어요!");
    }

    // 파라미터 O, 반환값 X
    public static void simpleSum(int num1, int num2) {
        System.out.println("num1 :" + num1 + ", num2: " + num2);
    }

    // 파라미터 X, 반환값 O
    public static int simpleReturn() {
        return 3;
    }

    // 파라미터 O, 반환값 O
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {

        //  메인 함수(메소드) 안에서 특정 메소드를 실행하려면, static 이라는 키워드가 반드시 있어야함.
        simplePrint();
        simpleSum(3, 5);
        System.out.println(simpleReturn());
        System.out.println(sum(2, 3));
    }

}

