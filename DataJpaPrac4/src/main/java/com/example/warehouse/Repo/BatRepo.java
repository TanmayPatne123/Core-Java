package com.example.warehouse.Repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.warehouse.entity.Bat;
import com.example.warehouse.view.ResultView;

@Repository
public interface BatRepo extends JpaRepository<Bat, Integer> 
{
	
	List<ResultView> findByCostLessThan(Double cost);
	
	
	
}
