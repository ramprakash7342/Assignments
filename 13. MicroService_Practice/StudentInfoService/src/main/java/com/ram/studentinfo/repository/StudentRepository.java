package com.ram.studentinfo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ram.studentinfo.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
  public List<Student> findByStudentName(String StudentName);
}
