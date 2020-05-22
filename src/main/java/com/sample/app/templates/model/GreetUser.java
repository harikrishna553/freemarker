package com.sample.app.templates.model;

public class GreetUser {
	private String name;
	private String gender;

	public GreetUser(String user, String gender) {
		super();
		this.name = user;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
