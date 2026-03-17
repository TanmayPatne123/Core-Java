package com.example.warehouse.service;

import java.util.List;

import com.example.warehouse.entity.Bat;

public interface BatService {
	
	
	public Iterable<Bat> fetchDetailsBySorting(boolean status, String...properties);
	
	public List<Bat> fetchDetailsByPagination(int pgNo, int pgSize, boolean status, String...properties);
	
	

}
