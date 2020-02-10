package com.mindtree.classandstudentapp.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.classandstudentapp.dto.StudentDto;
import com.mindtree.classandstudentapp.entity.Classs;
import com.mindtree.classandstudentapp.entity.Student;
import com.mindtree.classandstudentapp.repository.ClassRepository;
import com.mindtree.classandstudentapp.repository.StudentRepository;
import com.mindtree.classandstudentapp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private ClassRepository classRepository;

	ModelMapper mapper = new ModelMapper();

	@Override
	public String addStudentDetails(StudentDto studentDto, String section) {

		Classs classDetails = classRepository.findBysection(section);
		Student student = new Student();
		student.setStudentId(studentDto.getStudentId());
		student.setStudentName(studentDto.getStudentName());
		student.setSection(studentDto.getSection());
		student.setAge(studentDto.getAge());
		student.setDateOfBirth(studentDto.getDateOfBirth());

		classDetails.getStudents().add(student);
		classRepository.save(classDetails);
		return "inserted successfully";
	}

	@Override
	public List<StudentDto> getStudentDetails(String section) {

		Classs classDetails = classRepository.findBysection(section);
		List<Student> studentDetails = classDetails.getStudents();
		List<StudentDto> studentDtoDetails = new ArrayList<StudentDto>();
		for (Student s : studentDetails) {
			StudentDto studentDto = mapper.map(s, StudentDto.class);
			studentDtoDetails.add(studentDto);
		}
		return studentDtoDetails;
	}

}
