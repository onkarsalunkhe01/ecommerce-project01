package com.Spring.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.Spring.models.courses;

import com.Spring.services.CoursesServices;


@RestController
@RequestMapping("courses")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CoursesController {
	@Autowired
	CoursesServices sr;
	
	@GetMapping("/listcourses")
	@CrossOrigin(origins="http:/localhost:4200/")
	public List<courses> getallitems(){
		return sr.getAllRegister();
	}
	
	@PostMapping("addcourses")
	@CrossOrigin(origins="http:/localhost:4200/")
	public String addItem(@RequestPart("data") courses pt,@RequestPart("img")  MultipartFile pic) {
		try {				
			pt.setImg(pic.getBytes());					
		} 
		catch (IOException e) {			
			e.printStackTrace();
		}
		
		
		
		
		
		
		System.out.println("add");
		boolean b=sr.addRegister(pt);
		return b?"record is added":"Record is not added";
	}
	
	@PutMapping("/updatecourses/{id}")
	@CrossOrigin(origins = "http://localhost:4200/")
	public String updateItem(@PathVariable("id") int id, @RequestBody courses courseDetails) {
	    boolean isUpdated = sr.updateRegister(id, courseDetails);
	    return isUpdated ? "Record is updated" : "Record is not updated";
	}

	
	
	@DeleteMapping("/deletecourses/{id}")
	@CrossOrigin(origins="http:/localhost:4200/")
	public String deleteItem(@PathVariable("id") int id) {
		
		boolean b=sr.deleteRegister(id);
		return b?"record is Deleted":"Record is not Deleted";
		
	}
	
	@Autowired
    private CoursesServices coursesServices;

    @GetMapping("/courses")
    @CrossOrigin(origins="http:/localhost:4200/")
    public ResponseEntity<List<courses>> getAllCourses() {
        List<courses> courses = coursesServices.getAllRegister();
        return ResponseEntity.ok(courses);
    }
}
