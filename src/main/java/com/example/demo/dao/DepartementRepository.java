package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Departement;

import jakarta.transaction.Transactional;
@Repository
public interface DepartementRepository extends JpaRepository<Departement,Long>{
	  @Query(value = "select count(*) from departement",nativeQuery = true)
	    int getQuantityOfDepartement();
	    @Query(value = "select * from departement where id= :id",nativeQuery = true)
	    Departement getDepartementByIdEmploye(@Param("id") long id);
		//Departement findByNom(String nomDept);
	    @Modifying
	    @Transactional
	    @Query(value ="UPDATE departement  SET nom_dept =?2 , description_dept=?3 WHERE id_dept=?1", nativeQuery = true)
		int updateDepartement(Long id,String nomDept , String desDept);
	 

}


