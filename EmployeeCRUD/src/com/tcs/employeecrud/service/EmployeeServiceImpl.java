package com.tcs.employeecrud.service;

import java.io.Serializable;
import java.util.List;

import com.tcs.employeecrud.model.Employee;
import com.tcs.employeecrud.persistence.EmployeeDAO;
import com.tcs.employeecrud.persistence.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDAO dao = new EmployeeDAOImpl();
	@Override
	public void createEmployee(int eno, String name) {
		
		dao.createEmployee(eno, name);
	}

	@Override
	public void updateEmployee(int eno, String newname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int eno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee readEmployee(int eno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> readAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
