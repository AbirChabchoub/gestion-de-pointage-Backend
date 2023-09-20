package persistance.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor

public class Departement {
	 @Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long idDept;
	    private String nomDept;
	    private String descriptionDept;
	    
	  @OneToMany(mappedBy="departement",fetch=FetchType.LAZY)
		  private List<Employe>employeList;
}
