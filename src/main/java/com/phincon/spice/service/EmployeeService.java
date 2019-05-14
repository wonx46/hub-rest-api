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
	
	public Object remainingDayOff(String session_id) {
		RestHub restHub = new RestHub();
		restHub.setMessage("10");
		restHub.setSession(session_id);
		/*Employee emp = new Employee();
		emp.setId(id);
		emp.setName("Ade Priyanto");
		emp.setEmail("ade.priyanto06@gmail.com");
		emp.setDateOfBirth(new Date());
		emp.setRemainingDaysOff(10);*/
		
		return restHub;
	}
}
