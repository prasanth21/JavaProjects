package com.tcs.employeecrud.frontend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.tcs.employeecrud.model.Employee;
import com.tcs.employeecrud.service.AdvancedEmployeeServiceImpl;
import com.tcs.employeecrud.service.EmployeeService;
import com.tcs.employeecrud.service.EmployeeServiceImpl;
import com.tcs.employeecrud.service.TestServiceImpl;

public class EmpCRUDMain {

	public static void main(String[] args) {
		
		BufferedReader  br = null;
		 Employee e = new Employee();
	        try {
	        	EmployeeService service ;
	        	service = new TestServiceImpl();
	        	br = new BufferedReader(new InputStreamReader(System.in));

				System.out.println("Welcom to Bonusfinder. Enter q to stop program");
	            while (true) {
	            	
	            	
	            	System.out.print("[1] - Create Employee");
	            	System.out.print("[2] - Delete Employee");
	            	System.out.print("[3] - Read Employee ");
	            	System.out.print("[4] - Read All Employees ");
	            	System.out.print("[5] - Update Employee ");
	            	
	            	System.out.print("Enter your option: ");
	            	String option = br.readLine();
	            	
	            	switch(Integer.parseInt(option)) {
	            	
	            	case 1:
	            				//Create Employ
	            				
	            				service.createEmployee(100, "surews");
	            				break;
	            				
	            				
	            				
	            	case 2:
	            				// Delete 
	            				service.deleteEmployee(100);
	            				break;
	            				
	            	case 3:
			        				// Delete 
			        				break;
			        		
	            					
	            				
	            	default:
	            		
	            				
	            	
	            	
	            	}
						
					
	            }

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException ex) {
	                    ex.printStackTrace();
	                }
	            }
	        }
	        
	       
	        

	    }


}
