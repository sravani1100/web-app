package com.example.Question_quiz.Question.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Question_quiz.Question.Modal.Question;
@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> 
{
	List<Question>findByCategory(String category);
		
	@Query(value="Select * from question q where q.category=:category ORDER BY RANDOM() LIMIT :numQ",nativeQuery=true)
	
	List<Question> FindRandomQuestionsByCategory(String category, int numQ);
}
