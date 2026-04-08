package com.example.PractFirst.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.PractFirst.Repository.UserRepository;
import com.example.PractFirst.entity.User2;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	
	public User2 findByUsername(String username) {
		return repository.findByUsername(username);
	}
	
	
    public boolean validateUser(String username,String password) {
		
		User2 user2 = repository.findByUsername(username);
		
		if(user2==null) {
			return false;
		}
		return passwordEncoder.matches(password, user2.getPassword());
		
	}
    
    
    public User2 registerUser(User2  user2) 
    {
    	user2.setPassword(passwordEncoder.encode(user2.getPassword()));
    	return repository.save(user2);
    }
    
	

}
