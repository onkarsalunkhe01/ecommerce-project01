package com.Spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.models.feedback;

import com.Spring.services.FeedbackService;

@RestController
@RequestMapping("feedback")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FeedbackController {
	@Autowired
	FeedbackService sr;
	
	@GetMapping("/listfeedback")
	@CrossOrigin(origins="http:/localhost:4200/")
	public List<feedback> getallitems(){
		return sr.getAllRegister();
	}
	
	@PostMapping("addfeedback")
	@CrossOrigin(origins="http:/localhost:4200/")
	public String addItem(@RequestBody feedback p) {
		boolean b=sr.addRegister(p);
		return b?"record is added":"Record is not added";
	}
	
	
	@PutMapping("updatefeedback/{id}")
	@CrossOrigin(origins="http:/localhost:4200/")
	public  String updateitem(@RequestBody feedback p,int id) {
		boolean b=sr.updateRegister(p);
		return b?"record is Updated":"Record is not updated";
	}
	
	@DeleteMapping("/deletefeedback/{id}")
	@CrossOrigin(origins="http:/localhost:4200/")
	public String deleteItem(@PathVariable("id") int id) {
		boolean b=sr.deleteRegister(id);
		return b?"record is Deleted":"Record is not Deleted";
		
	}
}
