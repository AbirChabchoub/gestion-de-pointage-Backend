package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="conge")
public class Conge {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long idConge;
	   private Date dateEcriture;
	   private Date dateConge;
	   private String motif;
	   private String raison;
	   private String observation;
	 @ManyToOne
	   private Employe emp;
	

	public Employe getEmp() {
			return emp;
		}

		public void setEmp(Employe emp) {
			this.emp = emp;
		}

	public Conge() {
			
		}

	public Conge(Long idConge, Employe emp, Date dateEcriture, Date dateConge, String motif, String raison, String observation) {
		super();
		this.idConge = idConge;
		this.emp = emp;
		this.dateEcriture = dateEcriture;
		this.dateConge = dateConge;
		this.motif = motif;
		this.raison = raison;
		this.observation = observation;
	}

	public Long getIdConge() {
		return idConge;
	}

	public void setIdConge(Long idConge) {
		this.idConge = idConge;
	}

	public Date getDateEcriture() {
		return dateEcriture;
	}

	public void setDateEcriture(Date dateEcriture) {
		this.dateEcriture = dateEcriture;
	}

	public Date getDateConge() {
		return dateConge;
	}

	public void setDateConge(Date dateConge) {
		this.dateConge = dateConge;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public String getRaison() {
		return raison;
	}

	public void setRaison(String raison) {
		this.raison = raison;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}
	
	
	
	
}
