package com.ram.courseinfo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ram.courseinfo.entity.Course;

@Repository
public interface CourseRepository extends MongoRepository<Course, Integer> {
       public List<Course> findByDuration(int duration);
}
