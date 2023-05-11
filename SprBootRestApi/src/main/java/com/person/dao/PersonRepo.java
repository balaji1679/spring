package com.person.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.person.model.Person;


public interface PersonRepo extends JpaRepository<Person, Integer> {

}
