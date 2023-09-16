package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Departement;
import com.example.demo.entities.Employe;
@Repository
public interface EmployeRepository extends JpaRepository<Employe,Long>{
	  @Query(value = "select count(*) from employe",nativeQuery = true)
	    int getQuantityOfEmploye();
	    @Query(value = "select * from employe where id= :id",nativeQuery = true)
	    Departement getDepartementByIdEmploye(@Param("id") long id);
		//Departement findByNom(String nomDept);
}
