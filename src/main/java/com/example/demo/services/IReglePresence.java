package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Planning;
import com.example.demo.entities.ReglePresence;

public interface IReglePresence  {
	ReglePresence saveReglePresence(ReglePresence Regle);
	Planning updateRegle(ReglePresence Regle);
    boolean deleteRegle(Long id);
    List<ReglePresence> getListRegle();
    ReglePresence getReglePresence(Long id);
  //  Employe findEmployeByName(String name);
    int getQuantityOfReglePresence();
    ReglePresence getReglePresenceByIdDepartement(Long id);
	List<ReglePresence> findAll();
}
