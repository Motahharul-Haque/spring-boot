package com.springboot.cruddemo.crudapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.cruddemo.crudapi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer > {

}
