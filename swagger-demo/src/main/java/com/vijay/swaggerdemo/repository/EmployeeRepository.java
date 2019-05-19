package com.vijay.swaggerdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vijay.swaggerdemo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
