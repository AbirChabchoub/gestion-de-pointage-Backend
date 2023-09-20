package service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import persistance.entities.Planning;
import service.interfaces.IDepartement;
import service.interfaces.IPlanning;
@RestController
@RequestMapping("/api/planning")
public class PlanningController {

	
	@Autowired
	IPlanning planningService;
	
	
	@PostMapping(value= "/AddPlanning", consumes = "application/json")//fel value="/add.." nektbou url mtaa méthode post
	public Planning register(@RequestBody Planning planning) {
	return planningService.savePlanning(planning); }
	
	
	@GetMapping("/{id}")
	Planning getPlanningById(@PathVariable Long id) {
        return planningService.getPlanning(id);
    }
	
	@GetMapping("/quantity")
    int getQuantityEmploye() {
        return planningService.getQuantityOfPlanning();
    }
	
	//@GetMapping("/employeByName/{name}")
	//Employe getEmployeByName(@PathVariable String name) {
      //  return employeService.findEmployeByName(name);
    //}
	
	@DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
		planningService.deletePlanning(id);
        return true;
    }
	
	
	
	
}
