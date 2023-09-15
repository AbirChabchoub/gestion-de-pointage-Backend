package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Departement;
import com.example.demo.services.IDepartement;



@RestController
@RequestMapping("/departement")
@CrossOrigin(origins = "http://localhost:3000")
public class DepartementController {
	@Autowired
	IDepartement departementService;
	

	@PostMapping(value= "/add-departement")
	public Departement register(@RequestBody Departement dep) {
	return departementService.saveDepartement(dep); }
	
	@GetMapping("/get-all-departments")
	public  List<Departement> departments() {
		return departementService.findAll();
	}
	
	
	@GetMapping("/{id}")
    Departement getDepartementById(@PathVariable Long id) {
        return departementService.getDepartement(id);
    }
	
	@GetMapping("/quantity")
    int getQuantityDepartement() {
        return departementService.getQuantityOfDepartement();
    }
	
	@GetMapping("/departementByName/{name}")
    Departement getDepartementByName(@PathVariable String name) {
        return departementService.findDepartementByName(name);
    }
	
	@DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
		departementService.deleteDepartement(id);
        return true;
    }
	
	@PutMapping("/update-departement/{id}")
	Departement updateDepartement(@PathVariable Long id,@RequestBody Departement dep) {
		return  departementService.updateDepartement(id);
	}
	
	
	
	
}
