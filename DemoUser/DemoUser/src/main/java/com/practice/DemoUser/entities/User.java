package com.practice.DemoUser.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "USER_TABLE")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	//@SequenceGenerator(name = "id_Sequence")
	private long userId;
	private String userName;
	private String email;
	private String about;
	
	public User(long userId, String userName, String email, String about) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.about = about;
	}

	public User() {
		super();
	}
	

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", about=" + about + "]";
	}
		

}
