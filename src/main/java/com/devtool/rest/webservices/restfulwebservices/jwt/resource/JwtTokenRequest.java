package com.devtool.rest.webservices.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class JwtTokenRequest implements Serializable {

	private static final long serialVersionUID = -5616176897013108345L;

	private String username;
	private String password;
	
//	{
//	    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU3MTA4MzA0OCwiaWF0IjoxNTcwNDc4MjQ4fQ.xdqCz7r0LR3s5597r-jL4MU1CB1VIkMMd44xB7FD5DQ3VJaJMcH9jlKbKtDN3xzVg1o3YWWJIAmhVW3eqkSiCA"
//	}

	public JwtTokenRequest() {
		super();
	}

	public JwtTokenRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
