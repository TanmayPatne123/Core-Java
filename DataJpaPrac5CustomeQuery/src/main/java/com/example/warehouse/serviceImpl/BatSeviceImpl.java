package com.example.warehouse.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.warehouse.Repo.BatRepo;
import com.example.warehouse.entity.Bat;
import com.example.warehouse.service.BatService;

@Service
public class BatSeviceImpl implements BatService{
	
	
	@Autowired
	private BatRepo repo;

	@Override
	public List<Bat> searchByName(String name) {
		// TODO Auto-generated method stub
		return repo.searchByName(name);
	}

	@Override
	public List<String> searchBatByCost(Double startingRange, Double maxRange) {
		// TODO Auto-generated method stub
		return repo.searchBatByCost(startingRange, maxRange);
	}

	@Override
	public int updatePriceByBatName(String name, Double newPrice) {
		// TODO Auto-generated method stub
		return repo.updatePriceByBatName(name, newPrice);
	}

	

	
	
	

	
	
	
	
	
	
	
	

}
