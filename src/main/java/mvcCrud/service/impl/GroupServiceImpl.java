package mvcCrud.service.impl;

import mvcCrud.models.Group;
import mvcCrud.service.GroupService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class GroupServiceImpl implements GroupService {
    @Override
    public Group saveGroup(Group gq) {
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
