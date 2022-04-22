package com.company.reposity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
