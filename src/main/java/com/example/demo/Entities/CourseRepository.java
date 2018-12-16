package com.example.demo.Entities;

import com.example.demo.topics.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Integer> {
    public List<Course> findByTopicId(String tid);
}
