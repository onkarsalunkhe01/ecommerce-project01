package com.Spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.models.Users;
import com.Spring.services.UserService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("user")
public class UserController 
{
	@Autowired
	UserService usr;
	
	
	

	@CrossOrigin(origins={"http:/localhost:4200/"})
	@PostMapping("checkuser")
	public ResponseEntity<Boolean> checkUser(@RequestBody Users u)
	{
		try
		{			
			boolean b = usr.checkuser(u);
			if(!b)
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			
			return ResponseEntity.ok(b);
		}
		catch(Exception e)
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	
	
}


