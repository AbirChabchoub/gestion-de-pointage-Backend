package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="employe")
public class Employe {
	 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long codeEmp;
	 private String nomEmp;
	    private String prenomEmp;
	    private String sexeEmp;
	    private Date dateInscrit;
	    private int numIdEmp;
	    private int numEmp;
	    private int numCarte;
	    private String nationalite;
	    private String numTelEmp;
	   // private Titre titre;//titre est un string ou list? //classe titre employe a 1 seul titre et 1 titre a un employé
	    private String privilege;
	    private Date dateNaissance;
	    private Date dateEmbauche;
	    private float salaireEmp;
	    private String adresseEmp;
	    private String remarqueEmp;
	    private String photo;
	    //private Departement departementEmp;
	    private int CIN;
	    private String numCNSS;
	    private String ECH;
	    private String CAT;
	    private int nbEnfant;
	    
	    @ManyToOne
	   private Departement departement;
	 //   @ManyToOne
	  // private Titre titreEmp;
	   @ManyToOne
	   private Planning planning;
	 
	    public Employe() {
			
		}	 
	 
	    public Employe(Long codeEmp, String nomEmp, String prenomEmp, String sexeEmp, Date dateInscrit, int numIdEmp,
			int numEmp, int numCarte, String nationalite, String numTelEmp, String privilege, Date dateNaissance,
			Date dateEmbauche, float salaireEmp, String adresseEmp, String remarqueEmp, String photo, int cIN,
			String numCNSS, String eCH, String cAT, int nbEnfant, Departement departement) {
		super();
		this.codeEmp = codeEmp;
		this.nomEmp = nomEmp;
		this.prenomEmp = prenomEmp;
		this.sexeEmp = sexeEmp;
		this.dateInscrit = dateInscrit;
		this.numIdEmp = numIdEmp;
		this.numEmp = numEmp;
		this.numCarte = numCarte;
		this.nationalite = nationalite;
		this.numTelEmp = numTelEmp;
		this.privilege = privilege;
		this.dateNaissance = dateNaissance;
		this.dateEmbauche = dateEmbauche;
		this.salaireEmp = salaireEmp;
		this.adresseEmp = adresseEmp;
		this.remarqueEmp = remarqueEmp;
		this.photo = photo;
		this.CIN = cIN;
		this.numCNSS = numCNSS;
		this.ECH = eCH;
		this.CAT = cAT;
		this.nbEnfant = nbEnfant;
		this.departement = departement;
	}

		public long getCodeEmp() {
		return codeEmp;
	}

	public void setCodeEmp(Long codeEmp) {
		this.codeEmp = codeEmp;
	}

	public String getNomEmp() {
		return nomEmp;
	}

	public void setNomEmp(String nomEmp) {
		this.nomEmp = nomEmp;
	}

	public String getPrenomEmp() {
		return prenomEmp;
	}

	public void setPrenomEmp(String prenomEmp) {
		this.prenomEmp = prenomEmp;
	}

	public String getSexeEmp() {
		return sexeEmp;
	}

	public void setSexeEmp(String sexeEmp) {
		this.sexeEmp = sexeEmp;
	}

	public Date getDateInscrit() {
		return dateInscrit;
	}

	public void setDateInscrit(Date dateInscrit) {
		this.dateInscrit = dateInscrit;
	}

	public int getNumIdEmp() {
		return numIdEmp;
	}

	public void setNumIdEmp(int numIdEmp) {
		this.numIdEmp = numIdEmp;
	}

	public int getNumEmp() {
		return numEmp;
	}

	public void setNumEmp(int numEmp) {
		this.numEmp = numEmp;
	}

	public int getNumCarte() {
		return numCarte;
	}

	public void setNumCarte(int numCarte) {
		this.numCarte = numCarte;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public String getNumTelEmp() {
		return numTelEmp;
	}

	public void setNumTelEmp(String numTelEmp) {
		this.numTelEmp = numTelEmp;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public float getSalaireEmp() {
		return salaireEmp;
	}

	public void setSalaireEmp(float salaireEmp) {
		this.salaireEmp = salaireEmp;
	}

	public String getAdresseEmp() {
		return adresseEmp;
	}

	public void setAdresseEmp(String adresseEmp) {
		this.adresseEmp = adresseEmp;
	}

	public String getRemarqueEmp() {
		return remarqueEmp;
	}

	public void setRemarqueEmp(String remarqueEmp) {
		this.remarqueEmp = remarqueEmp;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public long getCIN() {
		return CIN;
	}

	public void setCIN(int cIN) {
		CIN = cIN;
	}

	public String getNumCNSS() {
		return numCNSS;
	}

	public void setNumCNSS(String numCNSS) {
		this.numCNSS = numCNSS;
	}

	public String getECH() {
		return ECH;
	}

	public void setECH(String eCH) {
		ECH = eCH;
	}

	public String getCAT() {
		return CAT;
	}

	public void setCAT(String cAT) {
		CAT = cAT;
	}

	public int getNbEnfant() {
		return nbEnfant;
	}

	public void setNbEnfant(int nbEnfant) {
		this.nbEnfant = nbEnfant;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

		
	    
}
