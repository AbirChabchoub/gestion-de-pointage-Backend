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

import com.example.demo.entities.Planning;
import com.example.demo.entities.ReglePresence;
import com.example.demo.services.IPlanning;
import com.example.demo.services.IReglePresence;

@RestController
@RequestMapping("/regle-presence")
@CrossOrigin(origins = "http://localhost:3000")
public class ReglePresenceController {
	@Autowired
	IReglePresence regPrService;
	
	
	@PostMapping(value= "/add-regle-presence", consumes = "application/json")//fel value="/add.." nektbou url mtaa méthode post
	public ReglePresence register(@RequestBody ReglePresence regPr) {
	return regPrService.saveReglePresence(regPr); }
	
	@GetMapping("/get-all-regle-presence")
	public  List<ReglePresence> regles() {
		return regPrService.findAll();
	}
	
	@GetMapping("/{id}")
	ReglePresence getReglePresenceById(@PathVariable Long id) {
        return regPrService.getReglePresence(id);
    }
	
	@GetMapping("/quantity")
    int getQuantityEmploye() {
        return regPrService.getQuantityOfReglePresence();
    }
	
	//@GetMapping("/employeByName/{name}")
	//Employe getEmployeByName(@PathVariable String name) {
      //  return employeService.findEmployeByName(name);
    //}
	
	@DeleteMapping("/delete/{id}")
    boolean delete(@PathVariable Long id) {
		regPrService.deleteRegle(id);
        return true;
    }
}
