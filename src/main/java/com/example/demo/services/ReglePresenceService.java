package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DepartementRepository;
import com.example.demo.dao.ReglePresenceRepository;
import com.example.demo.entities.Departement;
import com.example.demo.entities.Planning;
import com.example.demo.entities.ReglePresence;

import jakarta.persistence.EntityNotFoundException;
@Service
public class ReglePresenceService implements IReglePresence {
	@Autowired
	ReglePresenceRepository regPrRepository;
	
	@Override
	public ReglePresence saveReglePresence(ReglePresence reglePr) {
		// TODO Auto-generated method stub
		return regPrRepository.saveAndFlush(reglePr);
	}

	//@Override
	//public Departement updateDepartement(Departement departement) {
		// TODO Auto-generated method stub
	////	return depRepository.saveAndFlush(departement);
//	}

	@Override
	public boolean deleteRegle(Long id) {
		// TODO Auto-generated method stub
		regPrRepository.deleteById(id);
		return true;
	}

	@Override
	public List<ReglePresence> getListRegle() {
		// TODO Auto-generated method stub
		return  regPrRepository.findAll();
	}

	@Override
	public ReglePresence getReglePresence(Long id) {
		// TODO Auto-generated method stub
		return  null;
	}



	@Override
	public ReglePresence getReglePresenceByIdDepartement(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReglePresence> findAll() {
		// TODO Auto-generated method stub
		return this.regPrRepository.findAll();
	}

	@Override
	public int getQuantityOfReglePresence() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Planning updateRegle(ReglePresence Regle) {
		// TODO Auto-generated method stub
		return null;
	}
}


	
