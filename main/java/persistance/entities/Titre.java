package persistance.entities;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor

public class Titre {
	 @Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long idTitre;
	    private String nomTitre;
	    private String descriptionTitre;
}
