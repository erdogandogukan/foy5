package com.StudentsManagementSytems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentsManagementSytems.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepository extends JpaRepository<Student,Integer> {

}
