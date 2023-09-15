package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Planning;
@Repository
public interface PlanningRepository extends JpaRepository<Planning,Long> {
	 @Query(value = "select count(*) from planning",nativeQuery = true)
	    int getQuantityOfEmploye();
	    @Query(value = "select * from planning where id= :id",nativeQuery = true)
	    Planning getEmployeByIdPlanning(@Param("id") Long id);
}
