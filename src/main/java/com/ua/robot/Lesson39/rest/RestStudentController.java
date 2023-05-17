package com.ua.robot.Lesson39.rest;


import com.ua.robot.Lesson39.service.TestService;
import com.ua.robot.Lesson39.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RestStudentController {

    private final TestService testService;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return testService.getCollectionOfRandomStudents();
    }


}
