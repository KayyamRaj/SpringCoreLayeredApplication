package com.Raj.DAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Raj.beans.EmployeeDetails;
@Repository

public class EmployeeDao {
	@Autowired
	private JdbcTemplate jdbctemplate;
	public  boolean insertEmployeeDetails(EmployeeDetails empd) {
		int rowcount=jdbctemplate.update("insert into ashokit_emps values(?,?,?,?,?)",
                new Object[] {empd.getEmpId(),empd.getName(),empd.getEmail(),
                empd.getCreatedDate(),empd.getCreatedBy()});
		return rowcount>0 ;
		
	}
	public List<Map<String,Object>> getAllEmployees(){
		 //getting all employees
		 List<Map<String, Object>> allEmployees = jdbctemplate.queryForList("select * from ashokit_emps");
		 return allEmployees;
	}
	

}
