package lk.hiranwj.sprintbootrestmysqlapp.service.impl;

import lk.hiranwj.sprintbootrestmysqlapp.binding.Course;
import lk.hiranwj.sprintbootrestmysqlapp.repository.CourseRepository;
import lk.hiranwj.sprintbootrestmysqlapp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public String upsert(Course course) { // upsert (insert / update based on PK)
        courseRepository.save(course);
        return "Success";
    }

    @Override
    public Course getById(Integer cid) {
        Optional<Course> findById = courseRepository.findById(cid);

        if (findById.isPresent()) {
            return findById.get();
        }
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        return  courseRepository.findAll();
    }

    @Override
    public String deleteById(Integer cid) {
        if (courseRepository.existsById(cid)) {
            courseRepository.deleteById(cid);
            return "Delete success!";
        }else {
            return "No record found!";
        }
    }
}
