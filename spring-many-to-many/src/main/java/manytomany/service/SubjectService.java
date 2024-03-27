package manytomany.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import manytomany.entity.Subject;
import manytomany.repository.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
	private SubjectRepository sr;
	
	public List<Subject> listAll(){
		return sr.findAll();
	}
	public Subject addSubject(Subject s) {
		return sr.save(s);
	}

}
