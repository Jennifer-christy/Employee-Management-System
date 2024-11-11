package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(Employee employee) {
		
		employeeRepository.save(employee);
	}

	@Override
	public List<Employee> showAllEmployee() {
		
		return employeeRepository.findAll();
	}

	@Override
	public void updateEmployee(Integer id,Employee employee) {
	   Employee emp=employeeRepository.findById(id).orElseThrow();
	   emp.setName(employee.getName());
	   emp.setEmail(employee.getEmail());
	   emp.setPlace(employee.getPlace());
	   emp.setPhone_no(employee.getPhone_no());
	   employeeRepository.save(emp);
	   
	}

	@Override
	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
		
	}

	@Override
	public Employee getEmployeeData(Integer id) {
		return employeeRepository.findById(id).orElseThrow();
		
	}
	

}
