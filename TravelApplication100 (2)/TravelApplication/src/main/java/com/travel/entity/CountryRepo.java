package com.travel.entity;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

public interface CountryRepo extends JpaRepository<Country,Integer>{

}
