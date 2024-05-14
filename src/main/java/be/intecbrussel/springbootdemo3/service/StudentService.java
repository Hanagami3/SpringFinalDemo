package be.intecbrussel.springbootdemo3.service;

import be.intecbrussel.springbootdemo3.model.Student;
import be.intecbrussel.springbootdemo3.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAll() {
        return studentRepository.findAll();
    }
}
