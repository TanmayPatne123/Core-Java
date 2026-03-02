package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ExpenseDataDto;



public interface ExpenseService {
	
	
	public ExpenseDataDto create(ExpenseDataDto expenseDataDto);
	
	public ExpenseDataDto findById(long id);
	
	public List<ExpenseDataDto> getAll();
	
	public ExpenseDataDto update(long id,ExpenseDataDto expenseDataDto);
	
	public String delete(long id);

}
