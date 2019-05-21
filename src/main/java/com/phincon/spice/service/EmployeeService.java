package com.phincon.spice.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.phincon.spice.model.Employee;
import com.phincon.spice.model.RestHub;

@Service
public class EmployeeService {

	
	public Employee getEmployee(Long id) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName("Ade Priyanto");
		emp.setEmail("ade.priyanto06@gmail.com");
		emp.setDateOfBirth(new Date());
		emp.setRemainingDaysOff(10);
		
		return emp;
	}
	
	public Employee getEmployee(String email) {
		Employee emp = new Employee();
		emp.setId(new Long(1));
		emp.setName("Ade Priyanto");
		emp.setEmail("ade.priyanto06@gmail.com");
		emp.setDateOfBirth(new Date());
		emp.setRemainingDaysOff(10);
		
		return emp;
	}
	
	public Object remainingDayOff(RestHub restHub) {
		String message [] = restHub.getMessage().split("#");
		String email = message [0];
		String pass =  message[1];
		System.out.println("Email : "+email);
		System.out.println("Password : "+pass);
		restHub.setMessage("10");
		/*Employee emp = new Employee();
		emp.setId(id);
		emp.setName("Ade Priyanto");
		emp.setEmail("ade.priyanto06@gmail.com");
		emp.setDateOfBirth(new Date());
		emp.setRemainingDaysOff(10);*/
		
		return restHub;
	}
}
