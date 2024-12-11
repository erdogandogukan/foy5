package com.StudentsManagementSytems.servicelmpl;


import com.StudentsManagementSytems.service.StudentService;

import com.StudentsManagementSytems.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements StudentService {

    @Autowired
    com.StudentsManagementSytems.repository.Studentrepository Studentrepository;


    @Override
    public List<Student> getAllStudents() {

        List<Student> list = Studentrepository.findAll();

        return list;
    }

    @Override
    public Student saveStudent(Student student) {
        return Studentrepository.save(student);
    }

    @Override
    public Student getById(int id) {
        return Studentrepository.findById(id).get();
    }


    public void deleteById(int id) {

        Studentrepository.deleteById(id);

    }
}
