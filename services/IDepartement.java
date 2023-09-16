package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Departement;



public interface IDepartement {
	Departement saveDepartement(Departement dep);
	Departement updateDepartement(Long id);
    boolean deleteDepartement(Long id);
    List<Departement> getListDepartement();
    Departement getDepartement(Long id);
    Departement findDepartementByName(String name);
    int getQuantityOfDepartement();
    Departement getEmployeByIdDepartement(Long id);
	List<Departement> findAll();
	Departement updateDepartment(Long id, String newName, String newLocation);
}
