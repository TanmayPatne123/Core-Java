package com.example.Goggins.Service;

import java.util.List;

import com.example.Goggins.Dto.GogginsDto;

public interface GogginsService {
	
	
	public GogginsDto create(GogginsDto gogginsDto);
	
	public GogginsDto findById(long id);
	
	public List<GogginsDto> getAll();
	
	public GogginsDto update(long id,GogginsDto gogginsDto);
	
	public String delete(long id);

}
