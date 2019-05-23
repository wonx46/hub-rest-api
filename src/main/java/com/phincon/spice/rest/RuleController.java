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
import com.phincon.spice.service.RuleService;

@RestController
@RequestMapping("phincon/spice/api/rule")
public class RuleController {

	@Autowired
	RuleService ruleService;
	
	@RequestMapping(value = "/get_rule", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> loginUser(@RequestBody RestHub restHub) throws Exception{
		System.out.println("MESSAGE REQ "+restHub.getMessage());
		Object out = ruleService.getRule(restHub);
		return new ResponseEntity<Object>(out, HttpStatus.OK);
	}
}
