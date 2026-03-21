package com.example.warehouse.service;

import java.util.List;

import com.example.warehouse.entity.Bat;

public interface BatService {
	
	public List<Bat> fetchByCost(Double cost);

	public List<Bat> fetchByLessThanCost(Double cost);
	
	public List<Bat> fetchByCostBetween(Double startingCost,Double endingCost);

}
