package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CycleTravailRepository;
import com.example.demo.entities.CycleTravail;

@Service
public class CycleTravailService implements ICycleTravail{
	@Autowired
	CycleTravailRepository cycleTravRepository;
	
	@Override
	public CycleTravail saveCycleTravail(CycleTravail cyclTrav) {
		// TODO Auto-generated method stub
		return cycleTravRepository.save(cyclTrav);
	}

	@Override
	public CycleTravail updateCycleTravail(CycleTravail cylTrav) {
		// TODO Auto-generated method stub
		return cycleTravRepository.saveAndFlush(cylTrav);
	}

	@Override
	public boolean deleteCycleTravail(Long id) {
		// TODO Auto-generated method stub
		cycleTravRepository.deleteById(id);
		return true;
	}

	@Override
	public List<CycleTravail> getListCycleTravail() {
		// TODO Auto-generated method stub
		return  cycleTravRepository.findAll();
	}

	@Override
	public CycleTravail getCycleTravail(Long id) {
		// TODO Auto-generated method stub
		return  null;
	}

	@Override
	public CycleTravail findCycleTravailByName(String name) {
		// TODO Auto-generated method stub
	//	return  depRepository.findByNom(name);
		return null;
	}

	

	@Override
	public CycleTravail getEmployeByIdCycleTravail(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CycleTravail> findAll() {
		// TODO Auto-generated method stub
		return this.cycleTravRepository.findAll();
	}

	@Override
	public int getQuantityOfCycleTravail() {
		// TODO Auto-generated method stub
		return 0;
	}
}
