package islab.edu.gestionEtudiant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import islab.edu.gestionEtudiant.Entities.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Integer>{

	public Personne findOneByMailAndPassword(String mail, String password);
}
