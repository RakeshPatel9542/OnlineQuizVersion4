package com.onlinequiz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="score")
public class ScoreModel {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator"
			)
	String scoreId;
	@Column(updatable=false,nullable=false)
	String studentId;
	@Column(updatable=false,nullable=false)
	String quizId;
	@Column(length=256)
	String scoreOfStudent;
	
public String getScoreId() {
	return scoreId;
}
public void setScoreId(String scoreId) {
	this.scoreId = scoreId;
}
public String getStudentId() {
	return studentId;
}
public void setStudentId(String studentId) {
	this.studentId = studentId;
}
public String getQuizId() {
	return quizId;
}
public void setQuizId(String quizId) {
	this.quizId = quizId;
}
public String getScoreOfStudent() {
	return scoreOfStudent;
}
public void setScoreOfStudent(String scoreOfStudent) {
	this.scoreOfStudent = scoreOfStudent;
}
public ScoreModel(String scoreId, String studentId, String quizId, String scoreOfStudent) {
	super();
	this.scoreId = scoreId;
	this.studentId = studentId;
	this.quizId = quizId;
	this.scoreOfStudent = scoreOfStudent;
}




}

