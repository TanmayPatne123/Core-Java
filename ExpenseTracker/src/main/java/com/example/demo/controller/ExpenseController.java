package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ExpenseDataDto;
import com.example.demo.service.ExpenseService;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {
	
	
	private ExpenseService service;
	
	
	@Autowired
	public void setService(ExpenseService service) {
		this.service = service;
	}

	@PostMapping("/create")
	public ResponseEntity<ExpenseDataDto> create(@RequestBody ExpenseDataDto expenseDataDto) {
		// TODO Auto-generated method stub
		ExpenseDataDto expenseDataDto2 = service.create(expenseDataDto);
		return new ResponseEntity<ExpenseDataDto>(expenseDataDto2, HttpStatus.CREATED);
	}

	@GetMapping("/findById/{id}")
	public ExpenseDataDto findById(@PathVariable long id) {
		// TODO Auto-generated method stub
		return service.findById(id);
	}

	@GetMapping("/findAll")
	public List<ExpenseDataDto> getAll() {
		// TODO Auto-generated method stub
		return service.getAll();
	}

	@PutMapping("/update/{id}")
	public ExpenseDataDto update(@PathVariable long id,@RequestBody ExpenseDataDto expenseDataDto) {
		// TODO Auto-generated method stub
		return service.update(id, expenseDataDto);
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable long id) {
		// TODO Auto-generated method stub
		return service.delete(id);
	}

}
