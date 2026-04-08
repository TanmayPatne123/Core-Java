package com.example.PractFirst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PractFirst.Repository.ExpenseRepository;
import com.example.PractFirst.entity.Expense;
import com.example.PractFirst.entity.User2;

@Service
public class ExpenseService {
	
	@Autowired
	private ExpenseRepository repository;
	
	
	public Expense saveExpense(Expense expense) {
		return repository.save(expense);
	}
	
	
	public List<Expense> getUserExpenses(User2 user){
	    return repository.findByUser(user);
	}
	
	public List<Expense> getAllExpenses(){
	    return repository.findAll();
	}
	
	public void deleteExpense(Long id) {
		repository.deleteById(id);
	}
	
	
	public Expense getExpenseById(Long id) 
	{
	    return repository.findById(id).orElse(null);
	}

	
	

}
