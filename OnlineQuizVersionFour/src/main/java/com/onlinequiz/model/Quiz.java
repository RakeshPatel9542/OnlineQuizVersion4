package com.onlinequiz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="quiz")
public class Quiz {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator"
			)
private String quizId;
	@Column(nullable=false)
private String userCreatedId;
	@Column(length=256)
private String quizName;
	
public String getQuizId() {
	return quizId;
}
public void setQuizId(String quizId) {
	this.quizId = quizId;
}
public String getUserCreatedId() {
	return userCreatedId;
}
public void setUserCreatedId(String userCreatedId) {
	this.userCreatedId = userCreatedId;
}
public String getQuizName() {
	return quizName;
}
public void setQuizName(String quizName) {
	this.quizName = quizName;
}
public Quiz(String quizId, String userCreatedId, String quizName) {
	super();
	this.quizId = quizId;
	this.userCreatedId = userCreatedId;
	this.quizName = quizName;
}


}

