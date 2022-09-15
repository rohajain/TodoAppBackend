package com.devtool.rest.basic.auth;

public class AuthenticationBean {

	private String message;

	public AuthenticationBean(String string) {
		// TODO Auto-generated constructor stub
		this.message = string;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

}
