package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	Employee findByUsername(String username);
}
