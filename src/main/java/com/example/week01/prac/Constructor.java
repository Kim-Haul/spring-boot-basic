package com.example.week01.prac;

public class Constructor {
    public String title;
    public String tutor;
    public int days;

    // 기본 생성자 : 생성자가 선언되어 있지 않으면, 자바에서 기본적으로 생성해주는 생성자
    public Constructor() {

    }

    // 생성자가 따로 선언되어 있으면, 기본 생성자는 없는걸로 취급
    public Constructor(String title, String tutor, int days) {
        this.title = title;
        this.tutor = tutor;
        this.days = days;
    }
}