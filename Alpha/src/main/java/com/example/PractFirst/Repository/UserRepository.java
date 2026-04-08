package com.example.PractFirst.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PractFirst.entity.User2;

@Repository
public interface UserRepository extends JpaRepository<User2, Long> {

	User2 findByUsername(String username);
	
}
