package be.intecbrussel.springbootdemo3.repository;

import be.intecbrussel.springbootdemo3.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
