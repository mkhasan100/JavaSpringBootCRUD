package com.example.agiletechemployeemanagement.com.example.agiletechemployeemanagement.service;

import com.example.agiletechemployeemanagement.com.example.agiletechemployeemanagement.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
