package com.company.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.entity.Task;

@Repository
public interface TaskRepo extends JpaRepository<Task, Integer> {

}
