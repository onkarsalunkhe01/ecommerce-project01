package com.Spring.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.models.register;
import com.Spring.repositories.RegistersRepository;

@Service
public class RegisterService {
	@Autowired
	RegistersRepository pr;
	
	public List<register> getAllRegister(){
		return pr.findAll();
	}
	public boolean addRegister(register p) {
		pr.saveAndFlush(p);
		return true;
		
	}
	public boolean deleteRegister(int id) {
		pr.deleteById(id);
		return true;
		
	}
	
	public boolean updateRegister(register p) {
		pr.saveAndFlush(p);
		return true;
		
	}
	public boolean authenticate(String email, String password) {
	    List<register> users = pr.findAll();
	    return users.stream()
	            .filter(m -> m.getEmail() != null && m.getPassword() != null)
	            .anyMatch(m -> m.getEmail().equalsIgnoreCase(email) && m.getPassword().equalsIgnoreCase(password));
	}
}
