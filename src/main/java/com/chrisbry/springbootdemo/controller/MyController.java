package com.chrisbry.springbootdemo.controller;

import com.chrisbry.springbootdemo.entity.Course;
import com.chrisbry.springbootdemo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
//    These are examples
//    @GetMapping("/")
//    public String home() {
//        return "<HTML><H1>Welcome to My First Page</H1></HTML>";
//    }
//
//    @RequestMapping("home")
//    public String home(@RequestParam(value = "name", defaultValue = "Chris") String name, @RequestParam(value = "msg", defaultValue = "Good Morning!") String msg){
//
//        return "Hello "+name +" "+ msg;
//    }

    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String home() {

        return "<HTML><H1>Welcome to Course Application</H1></HTML>";
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getAllCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourseById(@PathVariable String courseId) {
        return this.courseService.getCourseById(Integer.parseInt(courseId));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public String deleteCourse(@PathVariable String courseId) {
        return this.courseService.deleteCourseById(Integer.parseInt(courseId));
    }
}
