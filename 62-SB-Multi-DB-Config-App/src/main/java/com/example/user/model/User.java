package com.example.user.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Table(name="USER_TB")
public class User {
	@Id
	private int id;
	private String userName;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + "]";
	}
	public User(int id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}
	public User() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	
}
