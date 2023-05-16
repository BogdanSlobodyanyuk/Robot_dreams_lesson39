package com.ua.robot.rest;


import com.ua.robot.domain.Student;
import com.ua.robot.service.TestService;
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
