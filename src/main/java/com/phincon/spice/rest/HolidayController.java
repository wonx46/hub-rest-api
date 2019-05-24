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
import com.phincon.spice.service.HolidayService;

@RestController
@RequestMapping("phincon/spice/api/holiday")
public class HolidayController {

	@Autowired
	HolidayService holidayService;
	
	@RequestMapping(value = "/list_holiday", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> companyProfile(@RequestBody RestHub restHub) throws Exception{
		
		Object  out = holidayService.listHoliday(restHub);
		return new ResponseEntity<Object>(out, HttpStatus.OK);
		
	}
}
