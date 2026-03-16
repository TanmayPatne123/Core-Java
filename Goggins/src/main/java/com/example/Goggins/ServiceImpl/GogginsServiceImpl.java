package com.example.Goggins.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Goggins.Dto.GogginsDto;
import com.example.Goggins.Mapper.GogginsMapper;
import com.example.Goggins.Model.Goggins;
import com.example.Goggins.Repo.GogginRepo;
import com.example.Goggins.Service.GogginsService;

@Service
public class GogginsServiceImpl implements GogginsService {
	
	@Autowired
	private GogginRepo repo;
	
	@Autowired
	private GogginsMapper mapper;

	@Override
	public GogginsDto create(GogginsDto gogginsDto) {
		// TODO Auto-generated method stub
		Goggins entity = mapper.toEntity(gogginsDto);
		Goggins save = repo.save(entity);
		return mapper.toDto(save);
	}

	@Override
	public GogginsDto findById(long id) {
		// TODO Auto-generated method stub
		  Goggins goggins = repo.findById(id).get();
		return mapper.toDto(goggins);
	}

	@Override
	public List<GogginsDto> getAll() {
		// TODO Auto-generated method stub
		List<Goggins> all = repo.findAll();
		List<GogginsDto> collect = all.stream().map((g)-> mapper.toDto(g)).collect(Collectors.toList());
		return collect;
	}

	@Override
	public GogginsDto update(long id, GogginsDto gogginsDto) {
		// TODO Auto-generated method stub
		Goggins entity = mapper.toEntity(gogginsDto);
		entity.setId(id);
		Goggins save = repo.save(entity);
		return mapper.toDto(save);
	}

	@Override
	public String delete(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "deleted id is " +id;
	}
	
	
	
}
