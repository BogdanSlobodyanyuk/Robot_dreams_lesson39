package com.ua.robot.Lesson39.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
@AllArgsConstructor
public class Student {

    String name;
    int age;
}
