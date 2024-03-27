package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import com.fasterxml.jackson.annotation.JacksonInject.Value;

//@RestController  //insted of this we can use controller and requestmapping its same
@Controller
@ResponseBody
@RequestMapping("/api/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	//@GetMapping("/all")  we can also use requestmapping  instead of this 
	@RequestMapping(value="/all",method = RequestMethod.GET)
	public List<Employee> getEmp() {
		return employeeService.getEmp();
	}
//localhost:8080/api/employee/add
	//post
	@PostMapping("/add")
	public Employee addEmp(@RequestBody Employee e) {
		return employeeService.addEmployee(e);
	}
	//localhost:8080/api/employee/findbyid/4
	//get
	@GetMapping("/findbyid/{eId}")
	public Employee finfById(@PathVariable int eId) {
		return employeeService.getEmployeeById(eId);
	}
	//localhost:8080/api/Employee/delete/3
	//delete
//	@DeleteMapping("delete/{eId}")
	@RequestMapping(value="delete/{eId}",method = RequestMethod.DELETE)
	public void deleteById(@PathVariable int eId) {
		this.employeeService.deleteEmpById(eId);
	}
//localhost:8080/api/employee/update/2
	//put
	@PutMapping("update/{eId}")
	public Employee updateEmp(@PathVariable int eId, @RequestBody Employee e) {
		return this.employeeService.updateEmployee(eId, e);
	}
	//localhost:8080/api/employee/search/python
	//get
	@GetMapping("/search/{eName}")
	public List<Employee> searchByEName(@PathVariable String eName)
	{
		return this.employeeService.searchByName(eName);
	}
	//localhost:8080/api/employee/searchbydes/python
	//get
	@GetMapping("/searchbydes/{designation}")
	public List<Employee> searchByDesignation(@PathVariable String designation)
	{
		return this.employeeService.searchByDesignationame(designation);
	}
	//localhost:8080/api/employee/salary/40000
	//get
	 @GetMapping("/salary/{salary}")
	    public List<Employee> getEmployeeBySalary(@PathVariable int salary) {
	        return employeeService.findEmployeeBySalary(salary);
	    }
	 @GetMapping("/namedesc")
	    public List<Employee> getAllEmployeesSortedByEmpNameDesc() {
	        return employeeService.findOrderByEmpNameDesc();
	    }
	 
	 //localhost:8080/api/employee/descname
	 @GetMapping("/descname")
	 public List<String> getSortedEmplyee()
	 {
		return employeeService.findEmpNameDesc();
		 
	 }
}