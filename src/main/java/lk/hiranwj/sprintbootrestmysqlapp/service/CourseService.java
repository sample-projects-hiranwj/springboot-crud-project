package lk.hiranwj.sprintbootrestmysqlapp.service;

import lk.hiranwj.sprintbootrestmysqlapp.binding.Course;

import java.util.List;

public interface CourseService {

    public String upsert(Course course);

    public Course getById(Integer cid);

    public List<Course> getAllCourses();

    public String deleteById(Integer cid);
}
