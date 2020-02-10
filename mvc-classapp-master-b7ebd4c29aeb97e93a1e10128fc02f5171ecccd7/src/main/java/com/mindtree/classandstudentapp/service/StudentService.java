package com.mindtree.classandstudentapp.service;

import java.util.List;

import com.mindtree.classandstudentapp.dto.StudentDto;

public interface StudentService {

	String addStudentDetails(StudentDto studentDto, String section);

	List<StudentDto> getStudentDetails(String section);

}
