package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	public List<Student> getStud()
	{
		return studentRepository.findAll();
	}
	public Student addStud(Student s)
	{
		return studentRepository.save(s);
	}
	public Student getStudById(int studId)
	{
		return studentRepository.findById(studId).get();
		
	}
	public void deleteStudById(int studId)
	{
		Student s=studentRepository.getById(studId);
		this.studentRepository.delete(s);
	}
	public Student updateStudent(int studId,Student  s)
	{
		s.setStudId(studId);
		return studentRepository.save(s);
	}
	
	public List<Student> searchByStudName(String studName)
	{
		return studentRepository.findByStudName(studName);
	}
	public List<Student> searchByStudCity(String studCity)
	{
		return studentRepository.findByStudCity(studCity);
	}
}
