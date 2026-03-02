package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ExpenseData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String expensename;
	
	private Double amount;
	
	private LocalDate date;
	
	private String description;
	
	
	public ExpenseData() {
		
	}


	public ExpenseData(String expensename, Double amount, LocalDate date, String description) {
		super();
		this.expensename = expensename;
		this.amount = amount;
		this.date = date;
		this.description = description;
	}

		
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getExpensename() {
		return expensename;
	}


	public void setExpensename(String expensename) {
		this.expensename = expensename;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "ExpenseData [id=" + id + ", expensename=" + expensename + ", amount=" + amount + ", date=" + date
				+ ", description=" + description + "]";
	}
	
	

}
