package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	public List<Employee> getEmp()
	{
		return employeeRepository.findAll();
	}
	
	public Employee addEmployee(Employee e)
	{
		return employeeRepository.save(e);
	}
	public Employee getEmployeeById(int eId)
	{
		return employeeRepository.findById(eId).get();
	}
	public void deleteEmpById(int eId)
	{
		Employee e=employeeRepository.getById(eId);
		this.employeeRepository.delete(e);
	}
	
	public Employee updateEmployee(int eId,Employee  e)
	{
		e.setEmpId(eId);
		return employeeRepository.save(e);
	}
	
	public List<Employee> searchByName(String eName)
	{
		return employeeRepository.findByEmpName(eName);
	}
	public List<Employee> searchByDesignationame(String designation)
	{
		return employeeRepository.findByDesignation(designation);
	}
	public List<Employee> findEmployeeBySalary(int salary) 
	{
        return employeeRepository.findBySalary(salary);
    }
	public List<Employee> findOrderByEmpNameDesc() {
        return employeeRepository.orderByEmpNameDesc();
    }
	public List<String> findEmpNameDesc()
	{
		return employeeRepository.getFindByEmpDesc();
	}
	

}
