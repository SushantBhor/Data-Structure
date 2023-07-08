package com.app.services;

import com.app.dto.CourseDTO;
import com.app.entities.Course;
import com.app.exception.CourseNotFoundException;
import com.app.repository.CourseRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course createCourse(CourseDTO courseDTO) {
        Course course = new Course();
        BeanUtils.copyProperties(courseDTO, course);
        return courseRepository.save(course);
    }

    public Course updateCourse(Long courseId, CourseDTO courseDTO) {
        Optional<Course> optionalCourse = courseRepository.findById(courseId);
        if (optionalCourse.isPresent()) {
            Course course = optionalCourse.get();
            BeanUtils.copyProperties(courseDTO, course);
            return courseRepository.save(course);
        } else {
            throw new CourseNotFoundException("Course not found with ID: " + courseId);
        }
    }

    public List<Course> getAllCoursesByCourseName(String courseName) {
        return courseRepository.findAllByNameIgnoreCase(courseName);
    }

	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}
}
