package com.example.PractFirst.entity;



import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(unique = true,nullable = false)
	private String username;
	
	private String password;
	
	@Column(unique = true)
	private String email;
	
	private String fullName;
	
	
	@OneToMany(mappedBy = "user")
	private List<Expense> expenses;
	
	
	public User2() {
		
	}

	
	public User2(String username, String password, String email, String fullName, List<Expense> expenses) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.fullName = fullName;
		this.expenses = expenses;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	
	

	public List<Expense> getExpenses() {
		return expenses;
	}


	public void setExpenses(List<Expense> expenses) {
		this.expenses = expenses;
	}


	@Override
	public String toString() {
		return "User2 [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", fullName=" + fullName + ", expenses=" + expenses + "]";
	}
	
	
	
	

}
