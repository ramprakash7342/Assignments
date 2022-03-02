package com.crudrepository.question5;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository; 
	
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> fetchEmployeeList() {
		
		return  (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee, Long employeeId) {
		
		Employee empDB = employeeRepository.findById(employeeId).get();

		if (Objects.nonNull(employee.getEmployeeName()) && !"".equalsIgnoreCase(employee.getEmployeeName())) {
			empDB.setEmployeeName(employee.getEmployeeName());
		}

		if (Objects.nonNull(employee.getEmployeeDepartment()) && !"".equalsIgnoreCase(employee.getEmployeeDepartment())) {
			empDB.setEmployeeDepartment(employee.getEmployeeDepartment());
		}

		if (Objects.nonNull(employee.getEmployeeDesignation()) && !"".equalsIgnoreCase(employee.getEmployeeDesignation())) {
			empDB.setEmployeeDesignation(employee.getEmployeeDesignation());
		}
		if (Objects.nonNull(employee.getEmployeeSalary()) ) {
			empDB.setEmployeeSalary(employee.getEmployeeSalary());
		}

		return employeeRepository.save(empDB);
		
	}

	@Override
	public void deleteEmployeeById(Long employeeId) {
		employeeRepository.deleteById(employeeId);
		
		
		
	}

}
