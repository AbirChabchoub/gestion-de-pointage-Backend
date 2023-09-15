package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.CycleTravail;

public interface ICycleTravail {
	CycleTravail saveCycleTravail(CycleTravail cycleTravail);
	CycleTravail updateCycleTravail(CycleTravail cycleTravail);
    boolean deleteCycleTravail(Long id);
    List<CycleTravail> getListCycleTravail();
    CycleTravail getCycleTravail(Long id);
    CycleTravail findCycleTravailByName(String name);
    int getQuantityOfCycleTravail();
    CycleTravail getEmployeByIdCycleTravail(Long id);
	List<CycleTravail> findAll();
}
