package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;
	public List<Person> getPerson()
	{
		return personRepository.findAll();		
	}
	public Person addPerson(Person p)
	{
		return personRepository.save(p);		
	}
	
	public Person updateData(int perId,Person p)
	{
		p.setPerId(perId);
		return personRepository.save(p);
	}
	public void deleteData(int perId)
	{
	Person p=personRepository.getById(perId);
	this.personRepository.delete(p);
	}
	
	public List<Person> searchByName(String perName)
	{
		return personRepository.findByPerName(perName);
	}
	
	public double getAverage()
	{
		 return personRepository.getAgeAverage();	
	}
	
	public int countPersons() {
        return personRepository.countPersons();
    }
	public int maxOfAge()
	{
		return personRepository.maxOfAge();
	}
	public int minOfAge()
	{
		return personRepository.minOfAge();
	}
	
	public int getSumOf()
	{
		return personRepository.sumOf();
	}
	public Person findFirstPerson() {
        return personRepository.findFirstByOrderByPerIdAsc();
    }

    public Person findLastPerson() {
        return personRepository.findFirstByOrderByPerIdDesc();
    }

}
