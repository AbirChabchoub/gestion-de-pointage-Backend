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

import com.example.demo.entities.CycleTravail;
import com.example.demo.entities.Planning;
import com.example.demo.services.ICycleTravail;

@RestController
@RequestMapping("/cycle-travail")
@CrossOrigin(origins = "http://localhost:3000")

public class CycleTravailController {
	@Autowired
	ICycleTravail cycleTravailService;
	
	
	@PostMapping(value= "/add-cycle", consumes = "application/json")//fel value="/add.." nektbou url mtaa méthode post
	public CycleTravail register(@RequestBody CycleTravail cycleTravail) {
	return cycleTravailService.saveCycleTravail(cycleTravail); }
	
	
	@GetMapping("/get-all-cycles")
	public  List<CycleTravail> plannings() {
		return cycleTravailService.findAll();
	}
	
	@GetMapping("/{id}")
	CycleTravail getcycleTravailById(@PathVariable Long id) {
        return cycleTravailService.getCycleTravail(id);
    }
	
	@GetMapping("/quantity")
    int getQuantityCycleTravail() {
        return cycleTravailService.getQuantityOfCycleTravail();
    }
	
	//@GetMapping("/employeByName/{name}")
	//Employe getEmployeByName(@PathVariable String name) {
      //  return employeService.findEmployeByName(name);
    //}
	
	@DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
		cycleTravailService.deleteCycleTravail(id);
        return true;
}
}
