package com.javaex.oop.person.v1;

public class Student extends Person {
	private String schollName;
	
	public Student (String schollName) {
		this.schollName = schollName;
	}
	public Student (String name, int age, String schollName) {
		super(name,age);
		this.schollName = schollName;
	}
	public String getSchollName() {
		return schollName;
	}
	public void setSchollName(String schollName) {
		this.schollName = schollName;
	}
	@Override
	public void showInfo() {
		System.out.printf("이름:%s 나이:%d 학교:%s%n",
				this.name,
				this.age,
				this.schollName);
	}
}
