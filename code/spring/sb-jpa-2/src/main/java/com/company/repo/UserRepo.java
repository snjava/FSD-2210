package com.company.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
