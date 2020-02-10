package com.mindtree.classandstudentapp.dto;

import java.util.List;

public class ClassDto {
	private int classId;
	private String section;
	private String teacherName;
	private int numberOfStudents;
	private List<StudentDto> studentDto;

	public ClassDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassDto(int classId, String section, String teacherName, int numberOfStudents,
			List<StudentDto> studentDto) {
		super();
		this.classId = classId;
		this.section = section;
		this.teacherName = teacherName;
		this.numberOfStudents = numberOfStudents;
		this.studentDto = studentDto;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public List<StudentDto> getStudentDto() {
		return studentDto;
	}

	public void setStudentDto(List<StudentDto> studentDto) {
		this.studentDto = studentDto;
	}

	@Override
	public String toString() {
		return "ClassDto [classId=" + classId + ", section=" + section + ", teacherName=" + teacherName
				+ ", numberOfStudents=" + numberOfStudents + ", studentDto=" + studentDto + "]";
	}

}
