package com.phincon.spice.service;

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
		String result = companyRepository.getProfileCompany(restHub.getMessage());
		restHub.setMessage(result);
		return restHub;
		
	}
}
