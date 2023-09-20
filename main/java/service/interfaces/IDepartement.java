package service.interfaces;

import java.util.List;

import persistance.entities.Departement;

public interface IDepartement {
	Departement saveDepartement(Departement dep);
	Departement updateDepartement(Departement dep);
    boolean deleteDepartement(Long id);
    List<Departement> getListDepartement();
    Departement getDepartement(Long id);
    Departement findDepartementByName(String name);
    int getQuantityOfDepartement();
    Departement getEmployeByIdDepartement(Long id);
	List<Departement> findAll();
}
