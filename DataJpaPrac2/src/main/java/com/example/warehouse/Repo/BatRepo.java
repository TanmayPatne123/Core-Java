package com.example.warehouse.Repo;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.warehouse.entity.Bat;

@Repository
public interface BatRepo extends PagingAndSortingRepository<Bat, Integer> 
{
	
}
