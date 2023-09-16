package com.example.demo.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.services.ICycleTravail;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
public class CycleTravail {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long idCycle;
	private String codeCycle;
	    private String libelleCycle;
	   private int nbJourCycle;
	
	   public CycleTravail() {
			
		}
	
	
	public Long getIdCycle() {
		return idCycle;
	}


	public void setIdCycle(Long idCycle) {
		this.idCycle = idCycle;
	}


	public String getCodeCycle() {
		return codeCycle;
	}


	public void setCodeCycle(String codeCycle) {
		this.codeCycle = codeCycle;
	}


	public CycleTravail(Long idCycle, String codeCycle, String libelleCycle, int nbJourCycle) {
		super();
		this.idCycle = idCycle;
		this.codeCycle = codeCycle;
		this.libelleCycle = libelleCycle;
		this.nbJourCycle = nbJourCycle;
	}


	public String getLibelleCycle() {
		return libelleCycle;
	}
	public void setLibelleCycle(String libelleCycle) {
		this.libelleCycle = libelleCycle;
	}
	public int getNbJourCycle() {
		return nbJourCycle;
	}
	public void setNbJourCycle(int nbJourCycle) {
		this.nbJourCycle = nbJourCycle;
	}
	
	@ManyToMany(fetch = FetchType.EAGER)
    private List<Planning> Plannings;
	@ManyToMany(fetch = FetchType.EAGER)
    private List<ReglePresence> Regles;
	
}
