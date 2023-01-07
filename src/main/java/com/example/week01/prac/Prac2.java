package com.example.week01.prac;

public class Prac2 {

    // 명령을 내릴 것 들의 모음에 이름을 붙여서 사용하는것을, 메소드.
    // 메소드는 항상 특정 클래스 안에 존재.
    public static void printInfo() {
        String title = "웹개발의 봄 Spring";
        String tutor = "남병관";
        int weeks = 5;
        float ratings = 5.0f;

        System.out.println("제목: " + title);
        System.out.println("튜터: " + tutor);
        System.out.println("주차: " + weeks);
        System.out.println("별점: " + ratings);
    }

    //    -------- method 란 ? --------
    //    public (반환타입) 메소드명(파라미터) {
    //        명령 모음;
    //        return 결과값(return 값이 있는 경우);
    //    }

    public static void main(String[] args) {
        printInfo();
    }

}
