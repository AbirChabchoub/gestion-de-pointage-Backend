package service.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistance.dao.DepartementRepository;
import persistance.entities.Departement;
import service.interfaces.IDepartement;

@Service
public class DepartementService implements IDepartement{
	@Autowired
	DepartementRepository depRepository;
	
	@Override
	public Departement saveDepartement(Departement departement) {
		// TODO Auto-generated method stub
		return depRepository.save(departement);
	}

	@Override
	public Departement updateDepartement(Departement departement) {
		// TODO Auto-generated method stub
		return depRepository.saveAndFlush(departement);
	}

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
	public int getQuantityOfDepartement() {
		// TODO Auto-generated method stub
		return  depRepository.getQuantityOfDepartement();
	}

	@Override
	public Departement getEmployeByIdDepartement(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Departement> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
