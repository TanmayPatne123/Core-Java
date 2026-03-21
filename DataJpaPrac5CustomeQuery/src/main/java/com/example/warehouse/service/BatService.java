package com.example.warehouse.service;

import java.util.List;

import com.example.warehouse.entity.Bat;

public interface BatService {
	
	public List<Bat> searchByName(String name);
	
	public List<String> searchBatByCost(Double startingRange,Double maxRange);
	
	public int updatePriceByBatName(String name,Double newPrice);

}
