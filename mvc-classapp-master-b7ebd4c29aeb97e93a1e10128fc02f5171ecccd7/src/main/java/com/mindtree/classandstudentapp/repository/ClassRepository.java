package com.mindtree.classandstudentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.classandstudentapp.entity.Classs;

@Repository
public interface ClassRepository extends JpaRepository<Classs, Integer> {

	Classs findBysection(String section);

}
