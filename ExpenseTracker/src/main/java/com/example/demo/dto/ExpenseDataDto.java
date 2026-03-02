package com.example.demo.dto;

import java.time.LocalDate;



public class ExpenseDataDto {
	
	
	
	private long id;
	
	private String expensename;
	
	private Double amount;
	
	private LocalDate date;
	
	private String description;
	
	
	
		
	
	
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
