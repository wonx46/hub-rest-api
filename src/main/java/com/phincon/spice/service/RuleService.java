package com.phincon.spice.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.phincon.spice.model.RestHub;
import com.phincon.spice.model.Rule;
import com.phincon.spice.repository.RuleRepository;

@Service
public class RuleService {

	@Autowired
	RuleRepository ruleRepository;
	
	public Object getRule(RestHub restHub) {
		Map<String, Object> message = restHub.getMessage();
		String pesan = (String) message.get("pesan");
		Rule rule = null;
		if(StringUtils.hasText(pesan)) {
			rule = ruleRepository.getRule(pesan);
		}
		
		String result = null;
		if(rule != null) {
			result = rule.getDesc_1();
			if(StringUtils.hasText(rule.getDesc_2())) {
				result.concat("#").concat(rule.getDesc_2());
			}
		}
		message.put("pesan", result);
		restHub.setMessage(message);
		return restHub;
	}
}
