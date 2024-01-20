package com.Raj.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Raj.DAO.EmployeeDao;
import com.Raj.beans.EmployeeDetails;

@Service 
public class EmployeeService {
	@Autowired
	private EmployeeDao employeedao;
	public boolean BrandNewEmployee(EmployeeDetails emdetails ) {
		//creating new employee record 
		return employeedao.insertEmployeeDetails(emdetails);
	}
	public void fetchAllEmployees() {
		List<Map<String, Object>> allEmployees = employeedao.getAllEmployees();
		System.out.println("Emp-ID"+ "\t"+"Emp-Name"+"\t"+ "Emp-Email"+"\t\t"+ "Created-Date"+"\t"+ "Created By");
		//Using Java8 concept to retrieve employees
		allEmployees.forEach(eachMap -> {
			eachMap.entrySet().stream().forEach(eachEntry ->{
				System.out.print(eachEntry.getValue() +"\t");
			});
			System.out.println();
		}); 
	}

}