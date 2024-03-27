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

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/all")
	public List<Student> getStud()
	{
		return studentService.getStud();		
	}
	
	@PostMapping("/add")
	public Student addStud(@RequestBody Student s)
	{
		return studentService.addStud(s);
	}
	
	@GetMapping("/findbyid/{sId}")
	public Student findById(@PathVariable int sId)
	{
		return studentService.getStudById(sId);
	}
	@DeleteMapping("delete/{sId}")
	public void deleteById(@PathVariable int sId)
	{
		this.studentService.deleteStudById(sId);
	}
	@PutMapping("update/{sId}")
	public Student updateStud(@PathVariable int sId,@RequestBody Student s)
	{
		return this.studentService.updateStudent(sId, s);
	}
	
	@GetMapping("/searchcity/{studCity}")
	public List<Student> searchBystudCity(@PathVariable String studCity)
	{
		return this.studentService.searchByStudCity(studCity);
	}
	@GetMapping("/search/{studName}")
	public List<Student> searchBystudName(@PathVariable String studName)
	{
		return this.studentService.searchByStudName(studName);
	}
	

}
