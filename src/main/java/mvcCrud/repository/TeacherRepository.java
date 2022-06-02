package mvcCrud.repository;

import mvcCrud.models.Teacher;

import java.util.List;

public interface TeacherRepository {
    Teacher saveTeacher(Teacher teacher);

    void removeTeacherById(Long id);

    Teacher getById(Long id);

    List<Teacher> getAllTeacher();

    void updateTeacher(Long id,Teacher teacher);
}
