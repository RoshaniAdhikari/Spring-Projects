package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/person")
public class PersonController {
	@Autowired
	private PersonService personService;
  @GetMapping("/all")	
  public List<Person> getPer()
  {
	return personService.getPerson() ;
  }
  @PostMapping("/add")
  public Person addPer(@Valid@RequestBody Person p)
  {
	return personService.addPerson(p);	  
  }
    
  @PutMapping("/update/{perId}")
  public Person updatePer(@PathVariable int perId,@RequestBody Person p)
  {
	  return personService.updateData(perId, p);
  }
  @DeleteMapping("/delete/{perId}")
  public void deleteById(@PathVariable int perId) {
		this.personService.deleteData(perId);
  }
  @GetMapping("/search/{perName}")
  public List<Person> searchByPerName(@PathVariable String perName){
	return this.personService.searchByName(perName);
  }
  
  @GetMapping("/avg")
  public double ageAvg()
  {
	return personService.getAverage();
  }
  
  @GetMapping("/count")
  public int countPersons() {
      return personService.countPersons();
  }
  @GetMapping("/maxage")
  public int maxAge()
  {
	  return personService.maxOfAge();
  }
  @GetMapping("/sum")
  public int displaySumOf()
  {
	  return personService.getSumOf();
  }
  @GetMapping("/firstrow")
  public Person findFirstPerson() {
      return personService.findFirstPerson();
  }

  @GetMapping("/lastrow")
  public Person findLastPerson() {
      return personService.findLastPerson();
  }
}
