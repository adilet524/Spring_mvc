package mvcCrud.repository;

import mvcCrud.models.Student;

import java.util.List;

public interface StudentRepository {
    Student saveStudent(Student student);

    void removeStudentById(Long id);

    Student getById(Long id);

    List<Student> getAllStudent();

    void updateStudent(Long id,Student student);
}
