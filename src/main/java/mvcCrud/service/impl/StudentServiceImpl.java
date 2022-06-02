package mvcCrud.service.impl;

import mvcCrud.models.Student;
import mvcCrud.service.StudentService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class StudentServiceImpl implements StudentService {
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
