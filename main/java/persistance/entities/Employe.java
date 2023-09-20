package persistance.entities;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import java.util.Date;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor

public class Employe {
	
	 @Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long codeEmp;
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
	 // private Departement departementEmp;
	    private long CIN;
	    private String numCNSS;
	    private String ECH;
	    private String CAT;
	    private int nbEnfant;
	    
	    @ManyToOne
	   private Departement departement;
	    @ManyToOne
	   private Titre titreEmp;
	    @ManyToOne
	   private Planning planning;
	    
}
