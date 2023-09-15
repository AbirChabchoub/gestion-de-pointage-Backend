package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Departement;
import com.example.demo.entities.Planning;
import com.example.demo.services.IPlanning;

@RestController
@RequestMapping("/planning")
@CrossOrigin(origins = "http://localhost:3000")

public class PlanningController {
	@Autowired
	IPlanning planningService;
	
	
	@PostMapping(value= "/add-planning", consumes = "application/json")//fel value="/add.." nektbou url mtaa méthode post
	public Planning register(@RequestBody Planning planning) {
	return planningService.savePlanning(planning); }
	
	@GetMapping("/get-all-plannings")
	public  List<Planning> plannings() {
		return planningService.findAll();
	}
	
	@GetMapping("/{id}")
	Planning getEmployeById(@PathVariable Long id) {
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
