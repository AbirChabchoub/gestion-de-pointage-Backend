package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Employe;

public interface IEmploye {
	Employe saveEmploye(Employe emp);
	Employe updateEmploye(Employe emp);
    boolean deleteEmploye(Long id);
    List<Employe> getListEmploye();
    Employe getEmploye(Long id);
    Employe findEmployeByName(String name);
    int getQuantityOfEmploye();
    Employe getEmployeByIdDepartement(Long id);
	List<Employe> findAll();
}
