package mvcCrud.service;

import mvcCrud.models.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);

    void removeStudentById(Long id);

    Student getById(Long id);

    List<Student> getAllStudent();

    void updateStudent(Long id,Student student);
}
