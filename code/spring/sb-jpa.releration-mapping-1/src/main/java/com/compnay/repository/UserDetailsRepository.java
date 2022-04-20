package com.compnay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compnay.entity.UserDetails;

@Repository("userRepo")
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {
}
