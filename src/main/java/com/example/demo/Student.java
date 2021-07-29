// This class id callded Model class
package com.example.demo;

public class Student {
	private int StuId = 000;
	private String name;
	private String address;
	
	
	
	public int getStuId() {
		return StuId;
	}
	public void setStuId(int stuId) {
		StuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Student addStudent(Student stu) {
		return stu;
		
	}
	
	

}
