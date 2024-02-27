package com.Spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.models.feedback;

import com.Spring.repositories.FeedbackRepository;


@Service
public class FeedbackService {
	@Autowired
	FeedbackRepository pr;
	
	public List<feedback> getAllRegister(){
		return pr.findAll();
	}
	public boolean addRegister(feedback p) {
		pr.saveAndFlush(p);
		return true;
		
	}
	public boolean deleteRegister(int id) {
		pr.deleteById(id);
		return true;
		
	}
	
	public boolean updateRegister(feedback p) {
		pr.saveAndFlush(p);
		return true;
		
	}
}
