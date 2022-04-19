package com.crudrepository.question5;

import java.util.List;


public interface EmployeeService {

	
	Employee saveEmployee(Employee employee);

	
	List<Employee> fetchEmployeeList();


	Employee updateEmployee(Employee employee, Long employeetId);

	
	void deleteEmployeeById(Long employeeId);
	
}
