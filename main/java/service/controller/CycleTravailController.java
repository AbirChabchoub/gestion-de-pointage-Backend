package service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import persistance.entities.CycleTravail;
import service.interfaces.ICycleTravail;

@RestController
@RequestMapping("/cycleTravail")
public class CycleTravailController {
	@Autowired
	ICycleTravail cycleTravailService;
	
	
	@PostMapping(value= "/AddEmployee", consumes = "application/json")//fel value="/add.." nektbou url mtaa méthode post
	public CycleTravail register(@RequestBody CycleTravail cycleTravail) {
	return cycleTravailService.saveCycleTravail(cycleTravail); }
	
	
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
