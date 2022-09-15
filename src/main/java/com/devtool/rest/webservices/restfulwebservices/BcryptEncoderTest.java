package com.devtool.rest.webservices.restfulwebservices;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BCryptPasswordEncoder b1 =new BCryptPasswordEncoder();

		System.out.println(b1.encode("welcome1"));
		
	}

}
