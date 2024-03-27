package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	List<Employee> findByEmpName(String eName);
	List<Employee> findByDesignation(String designation);
	
	@Query("select e from Employee e where e.salary = ?1")
    List<Employee> findBySalary(int salary);
	
	@Query(name = "Employee.orderByEmpNameDesc")
	List<Employee> orderByEmpNameDesc();
	
	@Query("select e.empName,e.salary from Employee e order BY e.empName DESC")
	List<String> getFindByEmpDesc();
	
}
