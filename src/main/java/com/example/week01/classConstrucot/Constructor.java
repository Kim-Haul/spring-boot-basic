package com.example.week01.classConstrucot;

public class Constructor {
    // 대부분의 클래스는 자신의 멤버 변수들을 private 로 설정해 줌. 밖에서 함부로 못 바꾸도록.
    private String title;
    private String tutor;
    private int days;

    // 기본 생성자 : 생성자가 선언되어 있지 않으면, 자바에서 기본적으로 생성해주는 생성자
    public Constructor() {

    }

    // 생성자가 따로 선언되어 있으면, 기본 생성자는 없는걸로 취급
    public Constructor(String title, String tutor, int days) {
        this.title = title;
        this.tutor = tutor;
        this.days = days;
    }

    // private 로 선언된 멤버 변수를 바꾸는 방법 : Setter
    public void setTitle(String title) {
        this.title = title;
    }

    // private 로 선언된 멤버 변수를 호출하는 방법 : Getter
    public String getTitle() {
        return this.title;
    }

    // private 로 선언된 멤버 변수는 위와 같은 메소드를 통해서만 접근이 가능.
}