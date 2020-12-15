package com.example.agiletechemployeemanagement.com.example.agiletechemployeemanagement.repository;

import com.example.agiletechemployeemanagement.com.example.agiletechemployeemanagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
