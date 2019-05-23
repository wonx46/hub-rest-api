package com.phincon.spice.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestHub {
	
	@JsonProperty("session")
	private String session;
	
	@JsonProperty("message")
	private Map<String, Object> message = new HashMap<>();

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public Map<String, Object> getMessage() {
		return message;
	}

	public void setMessage(Map<String, Object> message) {
		this.message = message;
	}
	
}
