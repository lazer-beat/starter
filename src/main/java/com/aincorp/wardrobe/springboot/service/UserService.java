package com.aincorp.wardrobe.springboot.service;

import com.aincorp.wardrobe.springboot.models.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User save(User user);

    User findByEmail(String email);
}
