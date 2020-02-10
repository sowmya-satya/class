package com.mindtree.classandstudentapp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Classs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int classId;
	private String section;
	private String teacherName;
	private int numberOfStudents;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "classId")
	private List<Student> students;

	public Classs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classs(int classId, String section, String teacherName, int numberOfStudents, List<Student> students) {
		super();
		this.classId = classId;
		this.section = section;
		this.teacherName = teacherName;
		this.numberOfStudents = numberOfStudents;
		this.students = students;
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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Classs [classId=" + classId + ", section=" + section + ", teacherName=" + teacherName
				+ ", numberOfStudents=" + numberOfStudents + ", students=" + students + "]";
	}

}
