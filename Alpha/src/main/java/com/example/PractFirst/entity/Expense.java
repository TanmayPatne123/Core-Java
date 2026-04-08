package com.example.PractFirst.entity;

import java.time.LocalDate;


import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Expense {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	
	private String expenseName;

	
    private double amount;

    private LocalDate date;

    private String description;
	
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User2 user;
    
    public Expense() {
    	
    }


    public Expense(String expenseName, double amount, LocalDate date, String description, User2 user) {
    	super();
    	this.expenseName = expenseName;
    	this.amount = amount;
    	this.date = date;
    	this.description = description;
    	this.user = user;
    }
    
    
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getExpenseName() {
		return expenseName;
	}


	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
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


	public User2 getUser() {
		return user;
	}


	public void setUser(User2 user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Expense [id=" + id + ", expenseName=" + expenseName + ", amount=" + amount + ", date=" + date
				+ ", description=" + description + ", user=" + user + "]";
	}



    
    

}
