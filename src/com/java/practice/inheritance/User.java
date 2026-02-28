package com.java.practice.inheritance;

public class User {
	protected String userName;
	protected String emailId;
	
	public User(String userName, String emailId) {
		super();
		this.userName = userName;
		this.emailId = emailId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void displayUser() {
        System.out.println("Username: " + userName);
        System.out.println("Email ID: " + emailId);
    }

}
