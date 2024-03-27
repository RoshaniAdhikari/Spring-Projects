package manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import manytomany.entity.Learner;

public interface LearnerRepository extends JpaRepository<Learner, Integer> {

}
