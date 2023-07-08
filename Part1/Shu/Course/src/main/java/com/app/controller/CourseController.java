package com.app.controller;

import com.app.dto.CourseDTO;
import com.app.entities.Course;
import com.app.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public ResponseEntity<Course> createCourse(@Validated @RequestBody CourseDTO courseDTO) {
        Course createdCourse = courseService.createCourse(courseDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCourse);
    }

    @PutMapping("/{courseId}")
    public ResponseEntity<Course> updateCourse(
            @PathVariable Long courseId, @Validated @RequestBody CourseDTO courseDTO) {
        Course updatedCourse = courseService.updateCourse(courseId, courseDTO);
        return ResponseEntity.ok(updatedCourse);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Course>> getCoursesByName(@RequestParam String courseName) {
        List<Course> courses = courseService.getAllCoursesByCourseName(courseName);
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }
    
    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        List<Course> courses = courseService.getAllCourses();
        return ResponseEntity.ok(courses);
    }
}
