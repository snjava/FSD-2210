package com.company.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.company.entity.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {
	
	//@Query("from Answer a where a.User.id= :id" ) //HQL
	@Query(nativeQuery = true, value = "select * from ans where uid_id= :id" ) //SQL
	public List<Answer> getuserAnswers(@Param("id") int userId);
}
