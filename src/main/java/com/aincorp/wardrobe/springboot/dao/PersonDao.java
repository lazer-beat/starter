package com.aincorp.wardrobe.springboot.dao;

import com.aincorp.wardrobe.springboot.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person, Long> {
}
