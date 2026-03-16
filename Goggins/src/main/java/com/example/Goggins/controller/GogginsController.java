package com.example.Goggins.controller;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Goggins.Dto.GogginsDto;
import com.example.Goggins.Model.Users;
import com.example.Goggins.Repo.UserRepo;
import com.example.Goggins.Service.GogginsService;

@RestController
@RequestMapping("/api/g")
public class GogginsController  {

	@Autowired
	private GogginsService service;
	
	
	BCryptPasswordEncoder bCryptPasswordEncoder =  new BCryptPasswordEncoder(12);
	
	@Autowired
	private UserRepo repo;
	
	@PostMapping("/create")
	public GogginsDto create(@RequestBody GogginsDto gogginsDto) {
		// TODO Auto-generated method stub
		return service.create(gogginsDto);
	}

	@GetMapping("/findById/{id}")
	public GogginsDto findById(@PathVariable long id) {
		// TODO Auto-generated method stub
		return service.findById(id);
	}

	@GetMapping("/getAll")
	public List<GogginsDto> getAll() {
		// TODO Auto-generated method stub
		return service.getAll();
	}

	@PutMapping("/update/{id}")
	public GogginsDto update(@PathVariable long id,@RequestBody GogginsDto gogginsDto) {
		// TODO Auto-generated method stub
		return service.update(id, gogginsDto);
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable long id) {
		// TODO Auto-generated method stub
		return service.delete(id);
	}
	
	
	@PostMapping("/register")
	public Users register(@RequestBody Users users) 
	{
		@Nullable
		String encode = bCryptPasswordEncoder.encode(users.getPassword());
		users.setPassword(encode);
	  return repo.save(users);
	}
	

}
