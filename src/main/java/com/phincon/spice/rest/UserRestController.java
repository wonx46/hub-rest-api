package com.phincon.spice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.phincon.spice.model.RestHub;
import com.phincon.spice.service.UserService;

@RestController
@RequestMapping("phincon/spice/api/user")
public class UserRestController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> loginUser(@RequestBody RestHub restHub) throws Exception{
		System.out.println("MESSAGE REQ "+restHub.getMessage());
		Object out = userService.login(restHub);
		return new ResponseEntity<Object>(out, HttpStatus.OK);
	}
	
}
