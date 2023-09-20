package persistance.entities;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Date;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor

public class ReglePresence {
	 @Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long idReglePresence;
	    private String nomRegle;
	    private Date debutRegle;
	    private Date finRegle;
	    private float margeRetard;
	    private float margeDebut;
	    private Date debutEntree;
	    private Date finEntree;
	    private Date debutSortie;
	    private Date finSortie;
	    private Date jourTravaille;
	    private float travHoraire;
	    private boolean pointageEntree;
	    private boolean pointageSortie;
	    private String refRegle;
	    private Date dateDeb;
	    private Date dateFin;
	    private String joursRepos;

}
