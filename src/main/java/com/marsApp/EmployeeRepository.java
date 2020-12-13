package com.marsApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marsApp.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}