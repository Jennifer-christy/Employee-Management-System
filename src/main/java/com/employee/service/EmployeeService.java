package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService {
  void saveEmployee(Employee employee);
  List<Employee> showAllEmployee();
  Employee getEmployeeData(Integer id);
  void updateEmployee(Integer id,Employee employee);
  void deleteEmployee(Integer id);
}
