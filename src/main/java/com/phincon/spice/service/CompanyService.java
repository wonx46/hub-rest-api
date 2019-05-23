package com.phincon.spice.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phincon.spice.common.utility.Log;
import com.phincon.spice.model.RestHub;
import com.phincon.spice.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	CompanyRepository companyRepository;
	
	public Object getCompanyProfile(RestHub restHub) {
		Map<String, Object> message = restHub.getMessage();
		String pesan = (String) message.get("pesan");
		String result = companyRepository.getProfileCompany(pesan);
		message.put("pesan", result);
		restHub.setMessage(message);
		return restHub;
		
	}
}
