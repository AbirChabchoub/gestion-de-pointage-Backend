package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.CycleTravail;
import com.example.demo.entities.Planning;
import com.example.demo.entities.ReglePresence;

@Repository

public interface ReglePresenceRepository extends JpaRepository<ReglePresence,Long>  {
	@Query(value = "select count(*) from employe",nativeQuery = true)
    int getQuantityOfEmploye();
    @Query(value = "select * from employe where id= :id",nativeQuery = true)
    CycleTravail getEmployeByIdDepartement(@Param("id") Long id);
}
