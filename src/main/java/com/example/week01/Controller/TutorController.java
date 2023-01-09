package com.example.week01.Controller;
;

import com.example.week01.getterSetter.Tutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TutorController {
    // REST : html, css, js 가 아니라 응답이 JSON 형식을 나타내는 것.
    // RestController 를 만든다는 것은, JSON 으로 응답하는 자동 응답기를 만든다는 뜻.

    @GetMapping("/tutors")
    public Tutor getTutor() {
        Tutor tutor = new Tutor("프론트엔드의 꽃 리액트", 1);
        tutor.setTitle("웹개발의 봄 스프링");
        tutor.setCareer(3);
        return tutor;
    }

}