package manytomany.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import manytomany.entity.Learner;
import manytomany.repository.LearnerRepository;

@Service
public class LearnerService {
	
	@Autowired
	private LearnerRepository lr;
	
	public List<Learner> listAll(){
		return lr.findAll();
	}
	public Learner addLearner(Learner l) {
		return lr.save(l);
	}

}
