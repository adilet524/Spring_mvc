package mvcCrud.service.impl;

import mvcCrud.models.Course;
import mvcCrud.service.CourseService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class CourseServiceImpl implements CourseService {
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
