package com.example.PractFirst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.PractFirst.entity.Expense;
import com.example.PractFirst.service.ExpenseService;

@Controller
public class ExpenseController {
	
	
	@Autowired
	private ExpenseService service;
	
	@GetMapping("/add-expense")
	public String addExpense(Model model) {
		model.addAttribute("expense",new Expense());
		return "add-expense";
	}
	
	
	@PostMapping("/save-expense")
    public String saveExpense(@ModelAttribute Expense expense) {
        service.saveExpense(expense);
        return "redirect:/expenses";
    }
	
	@GetMapping("/expenses")
	public String viewExpenses(Model model) {

	    model.addAttribute("expenses", service.getAllExpenses());

	    return "expense-list";
	}

 	
 	@GetMapping("/delete-expense/{id}")
 	public String deleteExpense(@PathVariable Long id) {
 	    service.deleteExpense(id);
 	    return "redirect:/expenses";
 	}
 	
 	@GetMapping("/edit-expense/{id}")
 	public String showEditPage(@PathVariable Long id, Model model) {

 	    Expense expense = service.getExpenseById(id);
 	    model.addAttribute("expense", expense);
 	    return "edit-expense";
 	}
 	
 	@PostMapping("/update-expense")
 	public String updateExpense(@ModelAttribute Expense expense) {
 	    service.saveExpense(expense);
 	    return "redirect:/expenses";
 	}
	
	
	

}
