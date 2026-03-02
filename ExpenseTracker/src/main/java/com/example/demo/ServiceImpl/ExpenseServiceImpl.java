package com.example.demo.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ExpenseDataDto;
import com.example.demo.entity.ExpenseData;
import com.example.demo.mapper.ExpenseMapper;
import com.example.demo.repo.ExpenseDataRepo;
import com.example.demo.service.ExpenseService;

@Service
public class ExpenseServiceImpl  implements ExpenseService {
	
	@Autowired
	private ExpenseDataRepo repo;
	
	@Autowired
	private ExpenseMapper mapper;

	@Override
	public ExpenseDataDto create(ExpenseDataDto expenseDataDto) {
		ExpenseData entity = mapper.toEntity(expenseDataDto);
		ExpenseData save = repo.save(entity);
		return mapper.toDto(save);
	}

	@Override
	public ExpenseDataDto findById(long id) {
		// TODO Auto-generated method stub
		ExpenseData expenseData = repo.findById(id).get();
		return mapper.toDto(expenseData);
	}

	@Override
	public List<ExpenseDataDto> getAll() {
		// TODO Auto-generated method stub
		List<ExpenseData> all = repo.findAll();
		List<ExpenseDataDto> collect = all.stream().map((m)->mapper.toDto(m)).collect(Collectors.toList());
		return collect;
	}

	@Override
	public ExpenseDataDto update(long id, ExpenseDataDto expenseDataDto) {
		// TODO Auto-generated method stub
		ExpenseData expenseData = repo.findById(id).get();
		expenseData.setId(id);
		ExpenseData save = repo.save(expenseData);
		return mapper.toDto(save);
	}

	@Override
	public String delete(long id) {
		// TODO Auto-generated method stub
		Optional<ExpenseData> expenseData = repo.findById(id);
		if(expenseData.isPresent()) {
			repo.deleteById(id);
			return "Data delted for id " + id;
		}
		return "Data not found with such id";
	}

	
	
	
}
