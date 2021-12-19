package islab.edu.gestionEtudiant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import islab.edu.gestionEtudiant.Entities.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer>{
	
	

}
