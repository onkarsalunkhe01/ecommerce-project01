package com.Spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.models.courses;

import com.Spring.repositories.CoursesRepository;

@Service
public class CoursesServices {
	@Autowired
	CoursesRepository pr;
	
	public List<courses> getAllRegister(){
		return pr.findAll();
	}
	public boolean addRegister(courses p) {
		pr.saveAndFlush(p);
		return true;
		
	}
	public boolean deleteRegister(int id) {
		pr.deleteById(id);
		return true;
		
	}
	
	public boolean updateRegister(int id, courses p) {
		pr.saveAndFlush(p);
		return true;
		
	}
}
