package com.Raj.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Raj.Service.EmployeeService;
import com.Raj.beans.EmployeeDetails;
@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService EmpService;
	
	public void addingNewEmployee(EmployeeDetails empDetails) {
		boolean empCreatedStatus = EmpService.BrandNewEmployee(empDetails);
		if(empCreatedStatus) {
			System.out.println("Employee Record got Created.....");
		}else {
			System.out.println("There is Problem while creating record.....");
		}
	}

	public void displayAllEmployees() {
		// TODO Auto-generated method stub
		 EmpService.fetchAllEmployees();

		
	}

	
		
	
	


}
