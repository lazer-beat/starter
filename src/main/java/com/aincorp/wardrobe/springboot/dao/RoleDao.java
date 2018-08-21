package com.aincorp.wardrobe.springboot.dao;

import com.aincorp.wardrobe.springboot.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
