package com.Spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.models.yourcourse;
import com.Spring.repositories.yourcourseRepository;
@Service
public class yourcourseServices {
	@Autowired
	yourcourseRepository pr;
	public List<yourcourse> getAllRegister(){
		return pr.findAll();
	}
	public boolean addRegister(yourcourse p) {
		pr.saveAndFlush(p);
		return true;
		
	}
}
