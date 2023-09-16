package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity

public class Planning {
	 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long codePlaning;
	    private String libellePlanning;
	    private boolean cachePlanning; // boolean ou liste
	    
	  @OneToMany(mappedBy="planning",fetch=FetchType.LAZY)
		  private List<Employe>employeList;

	public long getCodePlaning() {
		return codePlaning;
	}

	public void setCodePlaning(Long codePlaning) {
		this.codePlaning = codePlaning;
	}

	public String getLibellePlanning() {
		return libellePlanning;
	}

	public void setLibellePlanning(String libellePlanning) {
		this.libellePlanning = libellePlanning;
	}

	public boolean isCachePlanning() {
		return cachePlanning;
	}

	public void setCachePlanning(boolean cachePlanning) {
		this.cachePlanning = cachePlanning;
	}

	public List<Employe> getEmployeList() {
		return employeList;
	}

	public void setEmployeList(List<Employe> employeList) {
		this.employeList = employeList;
	}

	public Planning(Long codePlaning, String libellePlanning, boolean cachePlanning, List<Employe> employeList) {
		super();
		this.codePlaning = codePlaning;
		this.libellePlanning = libellePlanning;
		this.cachePlanning = cachePlanning;
		this.employeList = employeList;
	}
	  
	  
	public Planning() {
		
	}
	  
	@ManyToMany(fetch = FetchType.EAGER)
    private List<CycleTravail> cycles;
	  
	  
}

