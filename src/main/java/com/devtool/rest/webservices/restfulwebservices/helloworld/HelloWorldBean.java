package com.devtool.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {

	private String message;

	public HelloWorldBean(String string) {
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
