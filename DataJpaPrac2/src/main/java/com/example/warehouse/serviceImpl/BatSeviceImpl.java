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
public class BatSeviceImpl implements BatService {
	
	@Autowired
	public BatRepo repo;
	

	@Override
	public Iterable<Bat> fetchDetailsBySorting(boolean status, String... properties) {
		Sort sort = Sort.by(status?Direction.ASC:Direction.DESC, properties);
		return repo.findAll(sort);
	}


	@Override
	public List<Bat> fetchDetailsByPagination(int pgNo, int pgSize, boolean status, String... properties) {
		// TODO Auto-generated method stub
		Sort sort = Sort.by(status?Direction.ASC:Direction.DESC, properties);
		PageRequest pageable = PageRequest.of(pgNo, pgSize, sort);
		Page<Bat> page = repo.findAll(pageable);
		return page.getContent();
	}
	
	
	
	

}
