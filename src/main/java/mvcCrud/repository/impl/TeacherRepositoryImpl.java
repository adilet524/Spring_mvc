package mvcCrud.repository.impl;

import mvcCrud.models.Teacher;
import mvcCrud.repository.TeacherRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class TeacherRepositoryImpl implements TeacherRepository {
    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return null;
    }

    @Override
    public void removeTeacherById(Long id) {

    }

    @Override
    public Teacher getById(Long id) {
        return null;
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return null;
    }

    @Override
    public void updateTeacher(Long id, Teacher teacher) {

    }
}
