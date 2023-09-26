package com.amdocs.jenkin_demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class demo_jenkin {

	@GetMapping("/in")
	public String show() {
	    String s = "Hello , Harika Welcome to spring boot and jenkins";
		return s +"\n Id : 12890";
		
	}

}

