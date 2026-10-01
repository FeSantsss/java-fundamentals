package com.saint.springStudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saint.springStudy.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
