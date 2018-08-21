package com.aincorp.wardrobe.springboot.service;

import com.aincorp.wardrobe.springboot.dao.UserDao;
import com.aincorp.wardrobe.springboot.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }
}
