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
import com.example.demo.entities.Employe;
import com.example.demo.services.IEmploye;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeController {
	@Autowired
	IEmploye employeService;
	
	
	@PostMapping(value= "/add-employee", consumes = "application/json")
	public Employe register(@RequestBody Employe employe) {
	return employeService.saveEmploye(employe); }
	
	
	@GetMapping("/{id}")
	Employe getEmployeById(@PathVariable Long id) {
        return employeService.getEmploye(id);
    }
	
	@GetMapping("/get-all-employees")
	public  List<Employe> departments() {
		return employeService.findAll();
	}
	
	@GetMapping("/quantity")
    int getQuantityEmploye() {
        return employeService.getQuantityOfEmploye();
    }
	
	//@GetMapping("/employeByName/{name}")
	//Employe getEmployeByName(@PathVariable String name) {
      //  return employeService.findEmployeByName(name);
    //}
	
	@DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
		employeService.deleteEmploye(id);
        return true;
    }
}
