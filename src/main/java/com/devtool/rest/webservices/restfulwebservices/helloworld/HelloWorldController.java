package com.devtool.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {
	
	//@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World!!!");
	}
	
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorld(@PathVariable String name) {
		//throw new RuntimeException("Something Went wrong");
		return new HelloWorldBean("Hello, "+name);
	}

}
