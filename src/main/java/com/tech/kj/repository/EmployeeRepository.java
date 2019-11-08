package com.tech.kj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.kj.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
