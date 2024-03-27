package manytomany.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;

@Entity
public class Learner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int learnerId;
	
	private String learnerName;
	
	private String learnerEmail;
	
	@ManyToMany(targetEntity = Subject.class,cascade = CascadeType.ALL)
    private Set<Subject> subList  = new HashSet<>();

	public int getLearnerId() {
		return learnerId;
	}

	public void setLearnerId(int learnerId) {
		this.learnerId = learnerId;
	}

	public String getLearnerName() {
		return learnerName;
	}

	public void setLearnerName(String learnerName) {
		this.learnerName = learnerName;
	}

	public String getLearnerEmail() {
		return learnerEmail;
	}

	public void setLearnerEmail(String learnerEmail) {
		this.learnerEmail = learnerEmail;
	}

	public Set<Subject> getSubList() {
		return subList;
	}

	public void setSubList(Set<Subject> subList) {
		this.subList = subList;
	}
}
