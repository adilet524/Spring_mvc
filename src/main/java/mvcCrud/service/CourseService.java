package mvcCrud.service;

import mvcCrud.models.Course;

import java.util.List;

public interface CourseService {

    Course saveCourse(Course course);

    void removeCourseById(Long id);

    Course getById(Long id);

    List<Course> getAllCourse();

    void updateCourse( Course course);
}
