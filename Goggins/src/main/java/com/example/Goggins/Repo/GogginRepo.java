package com.example.Goggins.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Goggins.Model.Goggins;

@Repository
public interface GogginRepo extends JpaRepository<Goggins, Long> {

}
