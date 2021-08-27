package com.example.helloworld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

@RequestMapping("/")    
public String greeting()
{
    System.out.println("In the method");
 return "Hi";
}
@RequestMapping("/hello")
	public String sayHello() {
		Logger logger = LoggerFactory.getLogger(getClass());
		logger.info("Inside the method hello");
		return "Hello : this is Authorization";
	}
/* http://localhost:8089/hi?name=Raj ---> Parameter Passes */
    @RequestMapping("/hi")
	public String sayhi(@RequestParam("name") String name) {
		Logger logger = LoggerFactory.getLogger(getClass());
		logger.info("Inside the method Hi");
		return "Hi" + name  ;
	}

    	/*
	 * Request mapping will allow me to use it in url like
	 * http://localhost:8089/hello/rajesh
	 */
	@RequestMapping("/hello/{name}")
	public String sayHelloName(@PathVariable String name) {
		return "Hi " + name + " Kaise ho ?";
	}
	
    
}