package com.crudrepository.question5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {


	@Autowired 
	private EmployeeService employeeService;


	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee)
	{

		return employeeService.saveEmployee(employee);
	}


	@GetMapping("/employees")
	public List<Employee> fetchEmployeeList()
	{

		return employeeService.fetchEmployeeList();
	}

   
	
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable("id") Long employeeId)
	{

		return employeeService.updateEmployee(employee, employeeId);
	}

	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployeeById(@PathVariable("id") Long employeeId)
	{
		employeeService.deleteEmployeeById(
				employeeId);
		return "Deleted Successfully";
	}
}
