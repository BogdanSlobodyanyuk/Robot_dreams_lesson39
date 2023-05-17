package com.ua.robot.Lesson39.service;

import com.ua.robot.Lesson39.domain.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class TestService {

    public List<Student> getCollectionOfRandomStudents() {

        List<String> namesForStudents = List.of("Ivan", "Petro", "Stepan", "Denis");
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 6; i++) {

            Student student = Student.builder()
                    .age(new Random().nextInt(1, 30))
                    .name(namesForStudents.get(new Random().nextInt(1, 4)))
                    .build();

            students.add(student);
        }
        return students;
    }
}
