package com.person.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.person.dao.PersonRepo;
import com.person.model.Person;



@Controller
public class PersonController {
	
@Autowired
private PersonRepo personrepo;

//implementing REST API methods
		//Read operation using GET method
		//method-1
		@RequestMapping("/persons")
		@ResponseBody
		public List<Person> getPersonsList() {
			
		return (List<Person>) personrepo.findAll();
			
		}
 
		//Method 2
				@RequestMapping("/persons/{id}")
				@ResponseBody
				public Optional<Person> getPersonById(@PathVariable("id") int id) {
					return personrepo.findById(id);
				}
				
				//post method to insert data in database
				@PostMapping("/addperson")
				@ResponseBody
				public Person insertpersons(@RequestBody Person per) {
					
					personrepo.save(per);
					return per;
				}
				//delete employee
				@DeleteMapping("/deleteperson/{id}")
				@ResponseBody
				public String deletePerson1(@PathVariable("id") int id) {
					Person per = personrepo.getById(id);
					personrepo.delete(per);
					return "deletion done";
					
				}
				//update using put
				
				@PutMapping(path="/updateperson", consumes ={"application/json"})
				@ResponseBody
				public Person udpatePerson(@RequestBody Person per) {
					personrepo.save(per);
					return per;
				}	
			
	

}
