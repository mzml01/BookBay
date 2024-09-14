package com.youtube.bookbay.service;

import com.youtube.bookbay.dao.RoleDao;
import com.youtube.bookbay.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
