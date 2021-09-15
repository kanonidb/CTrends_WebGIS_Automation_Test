package com.ctrend.assignment.model;

import static javax.persistence.GenerationType.IDENTITY;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BaseEntity implements java.io.Serializable  {
	

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id")
	private int id;


	@Column(name = "userName")
	private String userName;
	@Column(name = "password")
	private String password;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
