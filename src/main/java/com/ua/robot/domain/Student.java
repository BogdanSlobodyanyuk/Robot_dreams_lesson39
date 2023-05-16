package com.ua.robot.domain;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Student {

    String name;
    int age;
}
