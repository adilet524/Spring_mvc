package mvcCrud.repository.impl;

import mvcCrud.models.Student;
import mvcCrud.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class StudentRepositoryImpl implements StudentRepository {
    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public void removeStudentById(Long id) {

    }

    @Override
    public Student getById(Long id) {
        return null;
    }

    @Override
    public List<Student> getAllStudent() {
        return null;
    }

    @Override
    public void updateStudent(Long id, Student student) {

    }
}
