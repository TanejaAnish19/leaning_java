package com.rakuten.training.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.training.domain.Greeting;

@RestController
public class GreetingController {

	
	List<Greeting> allGreetings = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		allGreetings.add(new Greeting("morning", "Good morning"));
		allGreetings.add(new Greeting("noon", "Good afternoon"));
		allGreetings.add(new Greeting("evening", "Howdy!"));
		
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/greetings")
	public List<Greeting> getAllGreetings() {
//		return "Good Afternoon, Good Evening and If I don't see you again, good night";
		return allGreetings;
	}
	
	@PostMapping("/greetings")
	public Greeting addGreetings(@RequestBody Greeting toBeAdded){
		allGreetings.add(toBeAdded);
		return toBeAdded;
	}
}
