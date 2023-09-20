package persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import persistance.entities.Employe;
import persistance.entities.Planning;
@Repository
public interface PlanningRepository extends JpaRepository<Planning,Long> {
	 @Query(value = "select count(*) from employe",nativeQuery = true)
	    int getQuantityOfEmploye();
	    @Query(value = "select * from employe where id= :id",nativeQuery = true)
	    Employe getEmployeByIdDepartement(@Param("id") Long id);
}
