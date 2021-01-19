/**
 * 
 */
package com.javalearning.springdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@author Thara
 *Created date and time : 30 Dec 2020 11:33:26 am
 */
@RestController
@RequestMapping("/test")
public class DemoRestController {
	
	//add code for the "/hello" endpoint
	
	/**
	 * code for the "/hello" endpoint
	 */
	@GetMapping("/rest")
	public String sayHello() {
		return "Rest World!";
	}

}
