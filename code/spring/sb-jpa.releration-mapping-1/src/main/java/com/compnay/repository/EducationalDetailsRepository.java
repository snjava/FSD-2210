package com.compnay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compnay.entity.EducationalDetails;

@Repository
public interface EducationalDetailsRepository extends JpaRepository<EducationalDetails, Integer> {

}
