package mvcCrud.repository.impl;

import mvcCrud.models.Group;
import mvcCrud.repository.GroupRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class GroupRepositoryImpl implements GroupRepository {
    @Override
    public Group saveGroup(Group group) {
        return null;
    }

    @Override
    public void removeGroupById(Long id) {

    }

    @Override
    public Group getById(Long id) {
        return null;
    }

    @Override
    public List<Group> getAllGroup() {
        return null;
    }

    @Override
    public void updateGroup(Long id, Group group) {

    }
}
