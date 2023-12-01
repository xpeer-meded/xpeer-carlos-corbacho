package com.xpeer.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xpeer.courses.service.HelloService;

@RestController
@RequestMapping(value = "/test")
public class HelloController {
	
	@Autowired
	HelloService helloService;

	@GetMapping("/hello")
    public String sayHello() {
        return this.helloService.sayHello("Xpeer");
    }
}
