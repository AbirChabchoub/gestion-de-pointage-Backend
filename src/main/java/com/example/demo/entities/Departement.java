package com.example.demo.entities;



import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
 
@Table(name="departement")
public class Departement {
	 @Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idDept;
	    private String nomDept;
	    private String descriptionDept;
		public Departement(String nomDept, String descriptionDept) {
			super();
			this.nomDept = nomDept;
			this.descriptionDept = descriptionDept;
		}
		public Departement() {
		
		}
		public Departement(Long idDept, String nomDept, String descriptionDept) {
			super();
			this.idDept = idDept;
			this.nomDept = nomDept;
			this.descriptionDept = descriptionDept;
		}

		@Override
		public String toString() {
			return "Departement [nomDept=" + nomDept + ", descriptionDept=" + descriptionDept + "]";
		}

		public Long getIdDept() {
			return idDept;
		}
		public void setIdDept(Long idDept) {
			this.idDept = idDept;
		}
		public String getNomDept() {
			return nomDept;
		}
		public void setNomDept(String nomDept) {
			this.nomDept = nomDept;
		}
		public String getDescriptionDept() {
			return descriptionDept;
		}
		public void setDescriptionDept(String descriptionDept) {
			this.descriptionDept = descriptionDept;
		}
		
		@OneToMany(mappedBy="departement",fetch=FetchType.LAZY)
		  private List<Employe>employeList;  
	    

}
