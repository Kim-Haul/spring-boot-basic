package com.example.week01.getterSetter;

public class Main {
    public static void main(String[] args) {

        Tutor tutor = new Tutor("김삿갓", 2);
        System.out.println(tutor.getTitle());
        tutor.setCareer(5);
        System.out.println(tutor.getCareer());
    }
}
