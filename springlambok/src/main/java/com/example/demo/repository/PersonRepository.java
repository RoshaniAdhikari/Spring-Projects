package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{
	List<Person> findByPerName(String perName);

	@Query("select avg(perAge) from Person p")
	int getAgeAverage();
	
	@Query("select count(*) from Person p")
    int countPersons();
	
	@Query("select max(perAge)from Person p")
	int maxOfAge();
	
	@Query("select min(perAge)from Person p")
	int minOfAge();
	
	@Query("select sum(perAge)from Person p")
	int sumOf();
	
	Person findFirstByOrderByPerIdAsc();

	Person findFirstByOrderByPerIdDesc();
}
