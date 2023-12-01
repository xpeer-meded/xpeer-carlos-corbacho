package com.xpeer.courses.repository;

import org.springframework.data.repository.CrudRepository;

import com.xpeer.courses.model.HelloPerson;

public interface HelloPersonRepository extends CrudRepository<HelloPerson, Long> {

	HelloPerson findByName (String name);
}
