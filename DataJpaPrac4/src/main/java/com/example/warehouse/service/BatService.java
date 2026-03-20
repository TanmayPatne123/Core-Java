package com.example.warehouse.service;

import java.util.List;

import com.example.warehouse.entity.Bat;
import com.example.warehouse.view.ResultView;

public interface BatService {
	
	
	public List<ResultView> fetchByCost(Double cost);

	
	

}
