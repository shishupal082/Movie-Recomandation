package com.hashedin.huProject;

public class User {

	private int userId;
	private int age;
	private char gender;
	private String occupation;

	@Override
	public String toString() {
		return "userId= " + userId + ", age= " + age + ", gender= " + gender
				+ ", occupation= " + occupation;
	}

	public User(int userId, int age, char gender, String occupation) {
		super();
		this.userId = userId;
		this.age = age;
		this.gender = gender;
		this.occupation = occupation;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

}
