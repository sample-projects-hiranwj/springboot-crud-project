package lk.hiranwj.sprintbootrestmysqlapp.controller;

import lk.hiranwj.sprintbootrestmysqlapp.binding.Course;
import lk.hiranwj.sprintbootrestmysqlapp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/course")
    public ResponseEntity<String> createCourse(@RequestBody Course course) {
        String status = courseService.upsert(course);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }

    @GetMapping("/course/{cid}")
    public ResponseEntity<Course> getCourse(@PathVariable Integer cid) {
        Course course = courseService.getById(cid);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }

    @GetMapping("/courses")
    public ResponseEntity<List<Course>> getAllCourses() {
        List<Course> allCourses = courseService.getAllCourses();
        return new ResponseEntity<>(allCourses, HttpStatus.OK);
    }

    @PutMapping("/course")
    public ResponseEntity<String> updateCourse(@RequestBody Course course) {
        String status = courseService.upsert(course);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @DeleteMapping("/course/{cid}")
    public ResponseEntity<String> deleteCourse(@PathVariable Integer cid) {
        String status = courseService.deleteById(cid);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
}
