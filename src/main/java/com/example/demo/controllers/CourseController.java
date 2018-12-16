package com.example.demo.controllers;

import com.example.demo.services.CourseService;
import com.example.demo.topics.Course;
import com.example.demo.topics.Topic;
import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/topics/{tid}/courses",method = RequestMethod.GET)
    public List<Course> getAllCourses(@PathVariable String tid){
        return courseService.getAllCourses(tid);
    }

    @RequestMapping(value = "/topics/{tid}/courses/{cid}",method = RequestMethod.GET)
    public Course getCourse(@PathVariable String tid, @PathVariable int cid){
        return courseService.getCourse(cid);
    }

    @RequestMapping(value = "/topics/{tid}/courses", method = RequestMethod.POST)
    public void addCourse(@PathVariable String tid, @RequestBody Course course){
        course.setTopic(new Topic(tid,"",""));
        courseService.addCourse(course);
    }

    @RequestMapping(value = "/topics/{tid}/courses/{cid}", method = RequestMethod.PUT)
    public void updateCourse(@PathVariable String tid,@PathVariable String cid, @RequestBody Course course){
        course.setTopic(new Topic(tid,"",""));
        courseService.updateCourse(course);
    }

}
