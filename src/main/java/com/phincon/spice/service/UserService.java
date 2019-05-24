package com.phincon.spice.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phincon.spice.model.RestHub;
import com.phincon.spice.model.User;
import com.phincon.spice.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public Object login(RestHub restHub) {
		Map<String, Object> message = restHub.getMessage();
		Map<String, Object> response = new HashMap<>();
		String username = (String) message.get("user");
		String password = (String) message.get("pwd");
		
		User user = userRepository.getUser(username);
		
		String result = "failed";
		if(user != null) {
			if(password.equals(user.getPassword())) {
				result = "success";
			}
		}
		response.put("status", result);
		response.put("qtyparam", 1);
		response.put("#0", user.getName());
		restHub.setMessage(response);
		return restHub;
	}
	
	public boolean authenticate(String username, String password) {
		User user = userRepository.getUser(username);
		
		boolean result = false;
		if(user != null) {
			if(password.equals(user.getPassword())) {
				result = true;
			}
		}
		return result;
	}
}
