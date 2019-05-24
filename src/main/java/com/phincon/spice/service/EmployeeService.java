package com.phincon.spice.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.phincon.spice.model.Employee;
import com.phincon.spice.model.RestHub;

@Service
public class EmployeeService {

	@Autowired
	UserService userService;
	
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
		Map<String, Object> message = restHub.getMessage();
		Map<String, Object> response = new HashMap<>();
		String username = (String) message.get("user");
		String password = (String) message.get("pwd");
		
		boolean isUser = false;
		String result = "failed";
		if(StringUtils.hasText(username) && StringUtils.hasText(password)) {
			isUser = userService.authenticate(username, password);
		}
		
		if(isUser) {
			result = "success";
		}
		response.put("status", result);
		response.put("qtyparam", 1);
		response.put("#0", "10");
		
		restHub.setMessage(response);
		return restHub;
	}
}
