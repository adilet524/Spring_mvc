package mvcCrud.repository.impl;

import mvcCrud.models.Course;
import mvcCrud.repository.CourseRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class CourseRepositoryImpl implements CourseRepository {
    @Override
    public Course saveCourse(Course course) {
        return null;
    }

    @Override
    public void removeCourseById(Long id) {

    }

    @Override
    public Course getById(Long id) {
        return null;
    }

    @Override
    public List<Course> getAllCourse() {
        return null;
    }

    @Override
    public void updateCourse(Course course) {

    }
}
