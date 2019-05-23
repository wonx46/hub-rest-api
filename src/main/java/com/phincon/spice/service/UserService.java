package com.phincon.spice.service;

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
		String username = (String) message.get("user");
		String password = (String) message.get("pwd");
		
		User user = userRepository.getUser(username);
		
		String result = "failed";
		if(user != null) {
			if(password.equals(user.getPassword())) {
				result = "success";
			}
		}
		message.put("pesan", result);
		restHub.setMessage(message);
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
