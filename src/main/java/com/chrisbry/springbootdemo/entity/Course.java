package com.chrisbry.springbootdemo.entity;

import javax.persistence.*;

@Entity
@Table(name="courses")
public class Course {

    @Id
    @Column(name = "course_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseId;
    @Column(name = "title")
    private String title;
    @Column(name = "instructor_name")
    private String instructorName;

    public Course() {
    }

    public Course(String title, String instructorName) {
        this.title = title;
        this.instructorName = instructorName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
}
