package com.aincorp.wardrobe.starter.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Person extends JpaRepository<Person, Long> {
}
