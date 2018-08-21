package com.aincorp.wardrobe.springboot.dao;

import com.aincorp.wardrobe.springboot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
