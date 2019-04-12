package com.shynn.models;

public class UserModel {
	private String userName;
	private String fullName;
	
	
	public UserModel() {
		super();
	}
	public UserModel(String userName, String fullName) {
		super();
		this.userName = userName;
		this.fullName = fullName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
}
