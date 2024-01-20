import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Raj.Controller.EmployeeController;
import com.Raj.beans.EmployeeDetails;
import com.Raj.config.DataBaseConfig;

public class SpringClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new AnnotationConfigApplicationContext(DataBaseConfig.class);
		
		//Prepared EmployeeDetails to insert the data
		EmployeeDetails ed = new EmployeeDetails();
		ed.setEmpId(897);
		ed.setName("ravinder");
		ed.setEmail("raja.kayyam11@gmail.com");
		ed.setCreatedBy("raj");
		ed.setCreatedDate(LocalDate.now());
		
		//Getting Controller Object
		EmployeeController ec = context.getBean(EmployeeController.class);
		
		//calling the method to create new employee
		ec.addingNewEmployee(ed);
		
		System.out.println("================================================");
		ec.displayAllEmployees();
	}

	}

