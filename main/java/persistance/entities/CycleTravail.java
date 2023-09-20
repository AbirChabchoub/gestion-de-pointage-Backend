package persistance.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class CycleTravail {
	 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private long codeCycle;
	    private String libelleCycle;
	   private int nbJourCycle;
}
