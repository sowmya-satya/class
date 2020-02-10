package com.mindtree.classandstudentapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.classandstudentapp.dto.ClassDto;
import com.mindtree.classandstudentapp.dto.StudentDto;
import com.mindtree.classandstudentapp.service.ClassService;
import com.mindtree.classandstudentapp.service.StudentService;

@Controller
public class AppController {

	@Autowired
	private ClassService classService;
	@Autowired
	private StudentService studentService;

	@RequestMapping("/")
	private String home() {
		return "menu";
	}

	@RequestMapping("/class")
	public String classs() {
		return "addclass";
	}

	@RequestMapping(path = "/addClass")
	public String addClass(ClassDto classDto) {
		classService.addClassDetails(classDto);
		return "menu";
	}

	@RequestMapping(path = "/student")
	public String student() {
		return "addstudent";
	}

	@RequestMapping(path = "/addStudent")
	public String addStudent(StudentDto studentDto, @RequestParam String section) {
		studentService.addStudentDetails(studentDto, section);
		return "menu";
	}

	@RequestMapping(path = "/viewDetails")
	public String view() {
		return "viewdetails";
	}

	@RequestMapping(path = "/get-student-details")
	public String viewStudentDetails(Model model, @RequestParam String section) {

		model.addAttribute("student", studentService.getStudentDetails(section));
		
		return "viewdetails";
	}

}
