package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PlanningRepository;
import com.example.demo.entities.Planning;

@Service
public class PlanningService implements IPlanning {
	@Autowired
	PlanningRepository planningRepository;

	@Override
	public Planning savePlanning(Planning planning) {
		// TODO Auto-generated method stub
		return planningRepository.save(planning);
	}

	@Override
	public Planning updatePlanning(Planning planning) {
		// TODO Auto-generated method stub
		return planningRepository.saveAndFlush(planning);
	}

	@Override
	public boolean deletePlanning(Long id) {
		// TODO Auto-generated method stub
		planningRepository.deleteById(id);
		return true;
	}

	@Override
	public List<Planning> getListPlanning() {
		// TODO Auto-generated method stub
		return  planningRepository.findAll();
	}

	@Override
	public Planning getPlanning(Long id) {
		// TODO Auto-generated method stub
		return planningRepository.findById(id).get();
	}

	@Override
	public int getQuantityOfPlanning() {
		// TODO Auto-generated method stub
		return  planningRepository.getQuantityOfEmploye();
	}

	@Override
	public Planning getPlanningByIdDepartement(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Planning> findAll() {
		// TODO Auto-generated method stub
		return this.planningRepository.findAll();
	}
}
