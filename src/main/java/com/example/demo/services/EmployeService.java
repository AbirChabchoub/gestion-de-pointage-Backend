package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DepartementRepository;
import com.example.demo.dao.EmployeRepository;
import com.example.demo.entities.Departement;
import com.example.demo.entities.Employe;

@Service
public class EmployeService implements IEmploye {
	@Autowired
	EmployeRepository empRepository;
	
	@Override
	public Employe saveEmploye(Employe emp) {
		// TODO Auto-generated method stub
		System.out.println("hhh"+emp.toString());
		return empRepository.saveAndFlush(emp);
	}

	@Override
	public Employe updateEmploye(Employe employe) {
		// TODO Auto-generated method stub
		return empRepository.saveAndFlush(employe);
	}

	@Override
	public boolean deleteEmploye(Long id) {
		// TODO Auto-generated method stub
		empRepository.deleteById(id);
		return true;
	}

	@Override
	public List<Employe> getListEmploye() {
		// TODO Auto-generated method stub
		return  empRepository.findAll();
	}

	@Override
	public Employe getEmploye(Long id) {
		// TODO Auto-generated method stub
		return empRepository.findById(id).get();
	}

	//@Override
	//public Employe findEmployeByName(String name) {
		// TODO Auto-generated method stub
		//return  empRepository.findByNom(name);
	//}

	@Override
	public int getQuantityOfEmploye() {
		// TODO Auto-generated method stub
		return  empRepository.getQuantityOfEmploye();
	}

	@Override
	public Employe getEmployeByIdDepartement(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employe findEmployeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employe> findAll() {
		// TODO Auto-generated method stub
		return this.empRepository.findAll();
	}

	
}
