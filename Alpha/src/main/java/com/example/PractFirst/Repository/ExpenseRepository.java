package com.example.PractFirst.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PractFirst.entity.Expense;
import com.example.PractFirst.entity.User2;


@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

	List<Expense> findByUser(User2 user);
	
}
