package service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import persistance.entities.Departement;
import service.interfaces.IDepartement;

@RestController
@RequestMapping("/api/departement")
public class DepartementController {
	@Autowired
	IDepartement departementService;
	
	
	//@RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
 //   Departement save(@RequestBody Departement dep) {	
		//  System.out.println("*******save ***********");
	////	  Departement p=departementService.saveDepartement(dep);
    //    return p ;
  //  }

	@PostMapping(value= "/AddDepartement", consumes = "application/json")//fel value="/add.." nektbou url mtaa méthode post
	public Departement register(@RequestBody Departement player) {
	return departementService.saveDepartement(player); }
	
	@GetMapping("/getAllDepartments")
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
}
