package edu.miu.cs.cs425.eregistrar.service.impl;

import edu.miu.cs.cs425.eregistrar.model.Student;
import edu.miu.cs.cs425.eregistrar.repository.StudentRepository;
import edu.miu.cs.cs425.eregistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

//    @Autowired
//    public StudentServiceImpl(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }



    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll(Sort.by(Sort.Direction.ASC, "firstName"));
    }
}

