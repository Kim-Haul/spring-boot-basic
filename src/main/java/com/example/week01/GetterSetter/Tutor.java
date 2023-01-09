package com.example.week01.GetterSetter;

public class Tutor {
    private String title;
    private int career;

    // 기본 생성자
    public Tutor() {}

    // alt + insert
    // 매개변수를 가지는 생성자를 하나 이상 정의한 후, 기본 생성자를 호출하면 오류 발생.
    public Tutor(String title, int career) {
        this.title = title;
        this.career = career;
    }

    // alt + insert
    // Getter
    public String getTitle() {
        return title;
    }

    public int getCareer() {
        return career;
    }

    // alt + insert
    // Setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCareer(int career) {
        this.career = career;
    }
}
