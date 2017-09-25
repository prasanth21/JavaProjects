package com.tcs.employeecrud.persistence;

import java.util.List;

import com.tcs.employeecrud.model.Employee;

public interface EmployeeDAO {

	public void createEmployee(int eno,String name);
	public void updateEmployee(int eno,String newname);
	public void deleteEmployee(int eno);
	public Employee readEmployee(int eno);
	public List<Employee> readAllEmployees();
	
}
