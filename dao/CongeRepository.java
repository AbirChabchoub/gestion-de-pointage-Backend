package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Conge;
import com.example.demo.entities.CycleTravail;

public interface CongeRepository extends JpaRepository<Conge,Long>{
	@Query(value = "select count(*) from conge",nativeQuery = true)
    int getQuantityOfConge();
  
  
}
