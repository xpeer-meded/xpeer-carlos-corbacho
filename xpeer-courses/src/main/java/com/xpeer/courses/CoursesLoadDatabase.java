package com.xpeer.courses;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xpeer.courses.model.HelloPerson;
import com.xpeer.courses.repository.HelloPersonRepository;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class CoursesLoadDatabase {
		
	@Bean
	public CommandLineRunner initDatabase(HelloPersonRepository helloPersonRepository) {
		helloPersonRepository.save(new HelloPerson("Xpeer", "Demo"));
		return args -> {
			helloPersonRepository.findAll().forEach(person -> 
				CoursesLoadDatabase.log.info(person.toString())
			);
		};
	}
}
