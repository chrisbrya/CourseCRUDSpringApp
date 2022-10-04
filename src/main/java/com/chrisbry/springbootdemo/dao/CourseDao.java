package com.chrisbry.springbootdemo.dao;

import com.chrisbry.springbootdemo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository<Course, Integer> {
}
