package service.interfaces;

import java.util.List;

import persistance.entities.Planning;

public interface IPlanning {
	Planning savePlanning(Planning planning);
	Planning updatePlanning(Planning planning);
    boolean deletePlanning(Long id);
    List<Planning> getListPlanning();
    Planning getPlanning(Long id);
  //  Employe findEmployeByName(String name);
    int getQuantityOfPlanning();
    Planning getPlanningByIdDepartement(Long id);
}
