package com.oops;

import java.util.Date;

public class Encapsulation {
	private String name;
	private int age;
	private char gender;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public static void main(String[] args) {
		Date date = new Date();
	}

}
