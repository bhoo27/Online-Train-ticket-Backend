package com.example.demo.model;

public class AuthenticationRequest {

	private String username;
	private String password;
	private String role;
	
	public AuthenticationRequest() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

		public String getRole() {
			return role;
		}

	public AuthenticationRequest(String role) {
			this.role = role;
		}
	
	
	
}
