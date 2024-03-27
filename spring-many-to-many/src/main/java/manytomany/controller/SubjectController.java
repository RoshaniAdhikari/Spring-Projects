package manytomany.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import manytomany.entity.Subject;
import manytomany.service.SubjectService;

@RestController
public class SubjectController {
	@Autowired
	private SubjectService ss;
	
	@GetMapping("/subject")
	public List<Subject> allSubject()
	{
		return this.ss.listAll();
	}

	@PostMapping("/addsubject")
	public Subject addsubject(@RequestBody Subject s)
	{
		return this.ss.addSubject(s);
	}
}
