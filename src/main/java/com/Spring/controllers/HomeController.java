package com.Spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.models.LoginModel;
import com.Spring.models.register;
import com.Spring.services.RegisterService;

@RestController
@RequestMapping("register")

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HomeController {
	
	@Autowired
	RegisterService sr;
	
	@GetMapping("/list")
	@CrossOrigin(origins="http:/localhost:4200/")
	public List<register> getallitems(){
		return sr.getAllRegister();
	}
	
	@PostMapping("add")
	@CrossOrigin(origins="http:/localhost:4200/")
	public String addItem(@RequestBody register p) {
		boolean b=sr.addRegister(p);
		return b?"record is added":"Record is not added";
	}
	
	
	@PutMapping("update/{id}")
	@CrossOrigin(origins="http:/localhost:4200/")
	public  String updateitem(@RequestBody register p,int id) {
		boolean b=sr.updateRegister(p);
		return b?"record is Updated":"Record is not updated";
	}
	
	@DeleteMapping("/delete/{id}")
	@CrossOrigin(origins="http:/localhost:4200/")
	public String deleteItem(@PathVariable("id") int id) {
		boolean b=sr.deleteRegister(id);
		return b?"record is Deleted":"Record is not Deleted";
		
	}
	@PostMapping("/login")
	
	public ResponseEntity<?> login(@RequestBody register loginModel) {
	    boolean isAuthenticated = sr.authenticate(loginModel.getEmail(), loginModel.getPassword());
	    if (isAuthenticated) {
	        return ResponseEntity.ok().build(); // Optionally, return user details or a JWT token here
	    } else {
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
	    }
	}


}
