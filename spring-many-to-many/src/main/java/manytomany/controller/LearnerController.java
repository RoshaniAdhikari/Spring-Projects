package manytomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import manytomany.entity.Learner;
import manytomany.service.LearnerService;

@RestController
public class LearnerController {
	
	@Autowired
	 private LearnerService lrs;
	
	@GetMapping("/learner")
	public List<Learner> getLearner(){
		return this.lrs.listAll();
	}
	/* Insert data first like  below  in subject. 
	 
	 {  
    "subName":".Net"   
    }
	 
	 	then like below in learner

	 {  
    "learnerName":"Sonam",
    "learnerEmail":"sona@gmail.com",
     "subList":[
        {
            "subName":"C#"
        },
        {
            "subName":".Net"
        }
    ]
    }*/
	@PostMapping("/addlearner")
	public Learner addLearner(@RequestBody Learner l) {
		return this.lrs.addLearner(l);
	}
	}
