package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DepartementRepository;
import com.example.demo.entities.Departement;

import jakarta.persistence.EntityNotFoundException;



@Service
public class DepartementService implements IDepartement{
	@Autowired
	DepartementRepository depRepository;
	
	@Override
	public Departement saveDepartement(Departement departement) {
		// TODO Auto-generated method stub
		System.out.println("hhh"+departement.toString());
		return depRepository.saveAndFlush(departement);
	}

	//@Override
	//public Departement updateDepartement(Departement departement) {
		// TODO Auto-generated method stub
	////	return depRepository.saveAndFlush(departement);
//	}

	@Override
	public boolean deleteDepartement(Long id) {
		// TODO Auto-generated method stub
		depRepository.deleteById(id);
		return true;
	}

	@Override
	public List<Departement> getListDepartement() {
		// TODO Auto-generated method stub
		return  depRepository.findAll();
	}

	@Override
	public Departement getDepartement(Long id) {
		// TODO Auto-generated method stub
		return  null;
	}

	@Override
	public Departement findDepartementByName(String name) {
		// TODO Auto-generated method stub
	//	return  depRepository.findByNom(name);
		return null;
	}


	@Override
	public Departement getEmployeByIdDepartement(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Departement> findAll() {
		// TODO Auto-generated method stub
		return this.depRepository.findAll();
	}

	@Override
	public int getQuantityOfDepartement() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Departement updateDepartment(Long id, String newName, String newLocation) {
        // Retrieve the existing department by ID
        Departement existingDepartment = depRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Department not found with id: " + id));

        // Update the existing department with the new data
        existingDepartment.setNomDept(newName);
        existingDepartment.setDescriptionDept(newLocation);

        // Save the updated department to the database using the save method
        return depRepository.save(existingDepartment);
    }

	@Override
	public Departement updateDepartement(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
