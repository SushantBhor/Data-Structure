package com.app.repository;

import com.app.entities.Course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

	List<Course> findAllByNameIgnoreCase(String courseName);
}
