package com.example.demo.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.example.demo.dto.ExpenseDataDto;
import com.example.demo.entity.ExpenseData;



@Configuration
public class ExpenseMapper {
	
	@Autowired
	private Mapper mapper;
	
	public ExpenseData toEntity(ExpenseDataDto expenseDataDto) {
		return mapper.modelMapper().map(expenseDataDto, ExpenseData.class);
	}
	
	
	public ExpenseDataDto toDto(ExpenseData expenseData) {
		return mapper.modelMapper().map(expenseData, ExpenseDataDto.class);
	}

}
