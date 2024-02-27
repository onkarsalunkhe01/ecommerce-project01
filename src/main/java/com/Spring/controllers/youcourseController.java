package com.Spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.models.courses;
import com.Spring.models.feedback;
import com.Spring.models.yourcourse;
import com.Spring.services.yourcourseServices;

@RestController
@RequestMapping("yourcourse")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class youcourseController {
	@Autowired
	yourcourseServices sr;
	@GetMapping("/listyourcourse")
	@CrossOrigin(origins="http:/localhost:4200/")
	public List<yourcourse> getallitems(){
		return sr.getAllRegister();
	}
	@PostMapping("addyourcourse")
	@CrossOrigin(origins="http:/localhost:4200/")
	public String addItem(@RequestBody yourcourse p) {
		boolean b=sr.addRegister(p);
		return b?"record is added":"Record is not added";
	}

}
