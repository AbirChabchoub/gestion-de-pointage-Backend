package service.impliments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistance.dao.CycleTravailRepository;
import persistance.entities.CycleTravail;
import service.interfaces.ICycleTravail;

@Service
public class CycleTravailService implements ICycleTravail {
	@Autowired
	CycleTravailRepository depRepository;
	
	@Override
	public CycleTravail saveCycleTravail(CycleTravail cylTrav) {
		// TODO Auto-generated method stub
		return depRepository.save(cylTrav);
	}

	@Override
	public CycleTravail updateCycleTravail(CycleTravail cylTrav) {
		// TODO Auto-generated method stub
		return depRepository.saveAndFlush(cylTrav);
	}

	@Override
	public boolean deleteCycleTravail(Long id) {
		// TODO Auto-generated method stub
		depRepository.deleteById(id);
		return true;
	}

	@Override
	public List<CycleTravail> getListCycleTravail() {
		// TODO Auto-generated method stub
		return  depRepository.findAll();
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
		return null;
	}

	@Override
	public int getQuantityOfCycleTravail() {
		// TODO Auto-generated method stub
		return 0;
	}
}
