package com.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}