package mvcCrud.service.impl;

import mvcCrud.models.Teacher;
import mvcCrud.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class TeacherServiceImpl implements TeacherService {
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
