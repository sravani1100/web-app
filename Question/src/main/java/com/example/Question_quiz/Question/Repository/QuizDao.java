package com.example.Question_quiz.Question.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Question_quiz.Question.Modal.Quiz;

@Repository
public interface QuizDao extends JpaRepository<Quiz,Integer>
{
	
}
