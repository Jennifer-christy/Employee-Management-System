package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@Controller
public class EmployeeController {
@Autowired	
private EmployeeService employeeService;

@GetMapping("/show")
public  String showIndex (Model model) {
	List<Employee> employee = employeeService.showAllEmployee();
	model.addAttribute("employees", employee);
	return "index";
}
@GetMapping("/add")
public  String showAddPage (Model model) {
	Employee emp=new Employee();
	model.addAttribute("employee",emp);
	return "add";
}
@GetMapping("/update/{id}")
    public  String showUpdatePage (@PathVariable Integer id,Model model) {
	Employee emp=employeeService.getEmployeeData(id);
	model.addAttribute("employee",emp);
	return "update";
}
@PostMapping("/add/save")
public String saveEmployeeData(@ModelAttribute Employee employee) {
	employeeService.saveEmployee(employee);
	return"redirect:/show";
}
@PostMapping("/update/save/{id}")
public String updateEmployeeData(@PathVariable Integer id,@ModelAttribute Employee employee) {
	employeeService.updateEmployee(id, employee);
	return "redirect:/show";
}

@GetMapping("/delete/{id}")
public String DeleteEmployeeData(@PathVariable Integer id) {
	employeeService.deleteEmployee(id);
	return "redirect:/show";
}


}
