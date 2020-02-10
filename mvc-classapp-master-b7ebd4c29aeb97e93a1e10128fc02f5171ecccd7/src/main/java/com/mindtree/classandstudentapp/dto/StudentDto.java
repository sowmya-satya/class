package com.mindtree.classandstudentapp.dto;

public class StudentDto {

	private int studentId;
	private String studentName;
	private String dateOfBirth;
	private int age;
	private String section;

	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDto(int studentId, String studentName, String dateOfBirth, int age, String section) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.section = section;

	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@Override
	public String toString() {
		return "StudentDto [studentId=" + studentId + ", studentName=" + studentName + ", dateOfBirth=" + dateOfBirth
				+ ", age=" + age + ", section=" + section + "]";
	}

}
