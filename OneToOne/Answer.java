package com.OneToOne;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {

	@Id
	private int AnswerId;
	private String Answer;
	
	@OneToOne
	private Question question;

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int answerId, String answer, Question question) {
		super();
		AnswerId = answerId;
		Answer = answer;
		this.question = question;
	}

	public int getAnswerId() {
		return AnswerId;
	}

	public void setAnswerId(int answerId) {
		AnswerId = answerId;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answer [AnswerId=" + AnswerId + ", Answer=" + Answer + ", question=" + question + "]";
	}
	
	
}
