package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CongeRepository;
import com.example.demo.dao.CycleTravailRepository;
import com.example.demo.entities.Conge;
import com.example.demo.entities.CycleTravail;

@Service
public class CongeService  implements IConge {
	
	@Autowired
	CongeRepository congeRepository;
	
	@Override
	public Conge saveConge(Conge conge) {
		// TODO Auto-generated method stub
		return congeRepository.save(conge);
	}

	@Override
	public Conge updateConge(Conge conge) {
		// TODO Auto-generated method stub
		return congeRepository.saveAndFlush(conge);
	}

	@Override
	public boolean deleteConge(Long id) {
		// TODO Auto-generated method stub
		congeRepository.deleteById(id);
		return true;
	}

	@Override
	public List<Conge> getListConge() {
		// TODO Auto-generated method stub
		return  congeRepository.findAll();
	}

	@Override
	public Conge getConge(Long id) {
		// TODO Auto-generated method stub
		return  null;
	}

	@Override
	public Conge findCongeByName(String name) {
		// TODO Auto-generated method stub
	//	return  depRepository.findByNom(name);
		return null;
	}

	

	@Override
	public Conge getEmployeByIdConge(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Conge> findAll() {
		// TODO Auto-generated method stub
		return this.congeRepository.findAll();
	}

	@Override
	public int getQuantityOfConge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getQuantityOfCongeTravail() {
		// TODO Auto-generated method stub
		return 0;
	}

}
