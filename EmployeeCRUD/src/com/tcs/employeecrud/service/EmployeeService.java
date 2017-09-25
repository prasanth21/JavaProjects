package com.tcs.employeecrud.service;

import java.util.List;

import com.tcs.employeecrud.model.Employee;

public interface EmployeeService {

	public void createEmployee(int eno,String name);
	public void updateEmployee(int eno,String newname);
	public void deleteEmployee(int eno);
	public Employee readEmployee(int eno);
	public List<Employee> readAllEmployees();
	
}
