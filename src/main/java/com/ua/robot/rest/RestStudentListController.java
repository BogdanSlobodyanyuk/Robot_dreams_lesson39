package com.ua.robot.rest;


import com.ua.robot.domain.Student;
import com.ua.robot.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestStudentListController {

    @GetMapping("/get")
    public List<Student> getStudents() {
        return new TestService().getCollectionOfRandomStudents();
    }


}
