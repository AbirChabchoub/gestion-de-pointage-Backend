package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.CycleTravail;
import com.example.demo.entities.Departement;

import jakarta.transaction.Transactional;

@Repository
public interface CycleTravailRepository extends JpaRepository<CycleTravail,Long>{
	@Query(value = "select count(*) from employe",nativeQuery = true)
    int getQuantityOfEmploye();
    @Query(value = "select * from cycle_travail where id= :id",nativeQuery = true)
    CycleTravail getCycleTravail(@Param("id") Long id);
  
	
}
