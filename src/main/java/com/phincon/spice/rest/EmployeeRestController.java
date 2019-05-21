package com.phincon.spice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.phincon.spice.model.RestHub;
import com.phincon.spice.service.EmployeeService;

@RestController
@RequestMapping("phincon/spice/api/employee")
public class EmployeeRestController {

	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getEmployee(@PathVariable Long id) throws Exception{
		
		Object obj = employeeService.getEmployee(id);
		return new ResponseEntity<Object>(obj, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/remaining_day_off", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> remainingDayOff(@RequestBody RestHub restHub) throws Exception{
		System.out.println("Request : "+restHub.getSession());
		Object obj = employeeService.remainingDayOff(restHub);
		return new ResponseEntity<Object>(obj, HttpStatus.OK);
	}
	
	/*@RequestMapping(value = "/get", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getEmployee(@RequestParam(value = "email") String email) throws Exception{
		
		Object obj = employeeService.getEmployee(email);
		return new ResponseEntity<Object>(obj, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getTest(@RequestHeader(value = "email") String email, @RequestHeader(value = "password") String password) throws Exception{
		
		Object obj = employeeService.getEmployee(email);
		return new ResponseEntity<Object>(obj, HttpStatus.OK);
	}*/
	
	/*@RequestMapping(value = "/get", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getTestingNyok(@RequestParam("authorization") String authString) throws Exception{
		
		Object obj = employeeService.getEmployee("ade.priyanto06@gmail.com");
		return new ResponseEntity<Object>(obj, HttpStatus.OK);
	}*/
}
