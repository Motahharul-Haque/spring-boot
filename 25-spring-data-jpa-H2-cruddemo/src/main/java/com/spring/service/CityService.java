package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.City;
import com.spring.repository.CityRepository;

@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> findAll() {

        return (List<City>) cityRepository.findAll();
    }
}