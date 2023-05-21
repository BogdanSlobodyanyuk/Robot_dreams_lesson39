package com.ua.robot.Lesson40.service;


import com.ua.robot.Lesson40.domain.Country;
import com.ua.robot.Lesson40.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;


    public void save (Country country){
        countryRepository.save(country);
    }

    public List<Country> findAll(){
        return countryRepository.findAll();
    }
}
