package com.xpeer.courses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xpeer.courses.model.HelloPerson;
import com.xpeer.courses.repository.HelloPersonRepository;

@Service
public class HelloService {
	
	@Autowired
	private HelloPersonRepository helloPersonRepository;

	public String sayHello (String name) {
		String sayHello = null;
		HelloPerson person = this.helloPersonRepository.findByName(name);
		if (person != null) {
			sayHello = "Hello " + person.getName() + " " + person.getLastName() +  "!";
		} 
		return sayHello;
	}
}
