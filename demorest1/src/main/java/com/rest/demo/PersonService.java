package com.rest.demo;

import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.stereotype.Service;

//@Service
@RestController
public class PersonService{
	
	@RequestMapping("/persons")
	public List<Person> getPersons(){
	List<Person> persons = new ArrayList<Person>();
	//public PersonService() {
		Person p = new Person();
		p.setId("1");
		p.setName("niharika");
		p.setAge(21);
		persons.add(p);
		
		Person p2 = new Person();
		p2.setId("1");
		p2.setName("sai");
		p2.setAge(19);
		persons.add(p2);
		
		return persons;
	
}
	
	
	

}
