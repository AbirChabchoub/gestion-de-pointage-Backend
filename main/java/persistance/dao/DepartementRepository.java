package persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import persistance.entities.Departement;
@Repository
public interface DepartementRepository extends JpaRepository<Departement,Long>{
	 @Query(value = "select count(*) from departement",nativeQuery = true)
	    int getQuantityOfDepartement();
	    @Query(value = "select * from gestpointage.departement where id= :id",nativeQuery = true)
	    Departement getDepartementByIdEmploye(@Param("id") long id);
		//Departement findByNom(String nomDept);
}
