package com.ua.robot.Lesson40.service;

import com.ua.robot.Lesson40.domain.City;
import com.ua.robot.Lesson40.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class CityService {

    private final CityRepository cityRepository;


    public void save (City city){
        cityRepository.save(city);
    }

    public List<City> findAll(){
        return cityRepository.findAll();
    }
}
