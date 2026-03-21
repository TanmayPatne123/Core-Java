package com.example.warehouse.Repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.warehouse.entity.Bat;


@Repository
public interface BatRepo extends JpaRepository<Bat, Integer> 
{
	public List<Bat> findByCost(Double cost);
	
	public List<Bat> findByCostLessThanEqual(Double cost);
	
	public List<Bat> findByCostBetween(Double startingCost,Double endingCost);
}