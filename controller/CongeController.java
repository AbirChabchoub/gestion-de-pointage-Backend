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

import com.example.demo.entities.Conge;
import com.example.demo.entities.CycleTravail;
import com.example.demo.services.IConge;
import com.example.demo.services.ICycleTravail;

@RestController
@RequestMapping("/conge")
@CrossOrigin(origins = "http://localhost:3000")
public class CongeController {
	@Autowired
	IConge congService;
	
	@PostMapping(value= "/add-conge", consumes = "application/json")//fel value="/add.." nektbou url mtaa méthode post
	public Conge register(@RequestBody Conge conge) {
	return congService.saveConge(conge); }
	
	
	@GetMapping("/get-all-conges")
	public  List<Conge> plannings() {
		return congService.findAll();
	}
	
	@GetMapping("/{id}")
	Conge getcycleTravailById(@PathVariable Long id) {
        return congService.getConge(id);
    }
	
	@GetMapping("/quantity")
    int getQuantityConge() {
        return congService.getQuantityOfConge();
    }
	
	
	@DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
		congService.deleteConge(id);
        return true;
}
	
	
	
	
	
}
