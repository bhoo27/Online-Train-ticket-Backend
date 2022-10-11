package com.example.demo.model;

public class AuthenticationResponse {
	
	private String response;

	public AuthenticationResponse(boolean b) {
		
	}

	public AuthenticationResponse(String response) {
		this.response=response;
	}
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	

}
