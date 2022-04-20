package com.compnay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compnay.entity.AddressDetails;

@Repository
public interface AddressDetailsRepository extends JpaRepository<AddressDetails, Integer> {
}
