package com.aincorp.wardrobe.starter.dao;

import com.aincorp.wardrobe.starter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
}
