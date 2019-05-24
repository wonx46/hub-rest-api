package com.phincon.spice.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phincon.spice.model.RestHub;
import com.phincon.spice.repository.HolidayRepository;

@Service
public class HolidayService {

	
	@Autowired
	HolidayRepository holidayRepository;
	
	public Object listHoliday(RestHub restHub) {
		Map<String, Object> response = new HashMap<>();
		
		List<String> list = holidayRepository.listHoliday();
		if(list.size() == 0) {
			response.put("status", "failed");
		}else {
			response.put("status", "success");
		}
		
		response.put("qtyparam", 1);
		response.put("#0", list);
		restHub.setMessage(response);
		return restHub;
	}
}
