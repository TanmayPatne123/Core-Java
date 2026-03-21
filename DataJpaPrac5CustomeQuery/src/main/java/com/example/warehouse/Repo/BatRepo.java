package com.example.warehouse.Repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.warehouse.entity.Bat;


@Repository
public interface BatRepo extends JpaRepository<Bat, Integer> 
{
	@Query("from Bat where name=:name")
	public List<Bat> searchByName(String name);
	
	@Query("select name,cost,city from Bat where cost between :startingRange and :maxRange")
	public List<String> searchBatByCost(Double startingRange,Double maxRange);
	
	
	@Transactional
	@Modifying
	@Query("update Bat set cost=newPrice where name=name")
	public int updatePriceByBatName(String name,Double newPrice);
	
	
}