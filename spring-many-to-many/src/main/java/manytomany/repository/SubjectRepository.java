package manytomany.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import manytomany.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

}
