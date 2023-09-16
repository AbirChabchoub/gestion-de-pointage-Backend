package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Conge;
import com.example.demo.entities.CycleTravail;

public interface IConge {
	Conge saveConge(Conge conge);
	Conge updateConge(Conge Conge);
    boolean deleteConge(Long id);
    List<Conge> getListConge();
    Conge getConge(Long id);
    Conge findCongeByName(String name);
    int getQuantityOfCongeTravail();
    Conge getEmployeByIdConge(Long id);
	List<Conge> findAll();
	int getQuantityOfConge();
}
