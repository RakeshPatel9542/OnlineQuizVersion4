package com.onlinequiz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator"
			)
 private String userId;
@Column	
 private int userRoleId;
 @Column(length=256)
 private String userName;
 @Column(length=512)
 private String userEmail;
 @Column(length=512)
 private String UserAddress;
 @Column(length=512)
 private String UserMobile;
 @Column(length=512)
 private String UserPassword;
 
public int getUserRoleId() {
	return userRoleId;
}
public void setUserRoleId(int userRoleId) {
	this.userRoleId = userRoleId;
}
public String getUserMobile() {
	return UserMobile;
}
public void setUserMobile(String userMobile) {
	UserMobile = userMobile;
}
public String getUserPassword() {
	return UserPassword;
}
public void setUserPassword(String userPassword) {
	UserPassword = userPassword;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
public String getUserAddress() {
	return UserAddress;
}
public void setUserAddress(String userAddress) {
	UserAddress = userAddress;
}
public User(String userId, int userRoleId, String userName, String userEmail, String userAddress, String userMobile,
		String userPassword) {
	super();
	this.userId = userId;
	this.userRoleId = userRoleId;
	this.userName = userName;
	this.userEmail = userEmail;
	UserAddress = userAddress;
	UserMobile = userMobile;
	UserPassword = userPassword;
}

 
}

