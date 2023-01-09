package com.example.week01.classConstrucot;

public class Main {
    public static void main(String[] args) {
        // 객체지향 프로그래밍 : 프로그래밍을 조금 더 현실 세계에 빗대어 체계적으로 해보자는 발상
        Course course = new Course();
        course.title = "웹개발의 봄, Spring";
        System.out.println(course.title);
        System.out.println(course.tutor);

        // How to use Getter, Setter
        System.out.println("------ Getter, Setter 사용 ------");
        Constructor constructor = new Constructor("프론트엔드의 꽃, 리액트", "임민영", 4);
        System.out.println(constructor.getTitle());
    }

}
