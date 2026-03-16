package com.example.Goggins.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Goggins {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String mindset;
	private long run;
	
	
	public Goggins() {
		
	}


	public Goggins(String mindset, long run) {
		super();
		this.mindset = mindset;
		this.run = run;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getMindset() {
		return mindset;
	}


	public void setMindset(String mindset) {
		this.mindset = mindset;
	}


	public long getRun() {
		return run;
	}


	public void setRun(long run) {
		this.run = run;
	}


	@Override
	public String toString() {
		return "Goggins [id=" + id + ", mindset=" + mindset + ", run=" + run + "]";
	}
	
	
	
}
