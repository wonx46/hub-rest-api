package com.phincon.spice.service;

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
		String message[] = restHub.getMessage().split("#");
		String username = message[0];
		String password = message[1];
		System.out.println(message);
		User user = userRepository.getUser(username);
		
		String result = "failed";
		if(user != null) {
			if(password.equals(user.getPassword())) {
				result = "success";
			}
		}
		restHub.setMessage(result);
		return restHub;
	}
}
