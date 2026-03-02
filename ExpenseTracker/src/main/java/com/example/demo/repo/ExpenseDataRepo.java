package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ExpenseData;

@Repository
public interface ExpenseDataRepo extends JpaRepository<ExpenseData, Long> {

}
