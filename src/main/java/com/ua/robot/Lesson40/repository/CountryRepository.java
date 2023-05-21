package com.ua.robot.Lesson40.repository;

import com.ua.robot.Lesson40.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CountryRepository extends JpaRepository <Country, Integer>{






}
