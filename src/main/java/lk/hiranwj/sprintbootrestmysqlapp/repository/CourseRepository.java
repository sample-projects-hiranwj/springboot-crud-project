package lk.hiranwj.sprintbootrestmysqlapp.repository;

import lk.hiranwj.sprintbootrestmysqlapp.binding.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
