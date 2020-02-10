package com.mindtree.classandstudentapp.service.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.classandstudentapp.dto.ClassDto;
import com.mindtree.classandstudentapp.entity.Classs;
import com.mindtree.classandstudentapp.repository.ClassRepository;
import com.mindtree.classandstudentapp.service.ClassService;

@Service
public class ClassServiceImpl implements ClassService {

	@Autowired
	private ClassRepository classRepository;
	ModelMapper mapper = new ModelMapper();

	@Override
	public String addClassDetails(ClassDto classDto) {

		Classs classs = mapper.map(classDto, Classs.class);
		classRepository.save(classs);
		return "inserted successfully";
	}

}
