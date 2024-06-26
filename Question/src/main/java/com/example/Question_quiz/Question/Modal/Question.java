package com.example.Question_quiz.Question.Modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Question 
{
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Integer id;
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String rightoption;
	private String difficultylevel;
	private String category;
	public Integer getId() 
	{
		return id;
	}
	public void setId(Integer id) 
	{
		this.id = id;
	}
	public String getQuestion() 
	{
		return question;
	}
	public void setQuestion(String question) 
	{
		this.question = question;
	}
	public String getOption1() 
	{
		return option1;
	}
	public void setOption1(String option1) 
	{
		this.option1 = option1;
	}
	public String getOption2() 
	{
		return option2;
	}
	public void setOption2(String option2) 
	{
		this.option2 = option2;
	}
	public String getOption3() 
	{
		return option3;
	}
	public void setOption3(String option3) 
	{
		this.option3 = option3;
	}
	public String getRightoption() 
	{
		return rightoption;
	}
	public void setRightoption(String rightoption) 
	{
		this.rightoption = rightoption;
	}
	public String getDifficultylevel() 
	{
		return difficultylevel;
	}
	public void setDifficultylevel(String difficultylevel) 
	{
		this.difficultylevel = difficultylevel;
	}
	public String getCategory() 
	{
		return category;
	}
	public void setCategory(String category) 
	{
		this.category = category;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", option1=" + option1 + ", option2=" + option2
				+ ", option3=" + option3 + ", rightoption=" + rightoption + ", difficultylevel=" + difficultylevel
				+ ", category=" + category + "]";
	}
	
	
}
