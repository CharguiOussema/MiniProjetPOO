package islab.edu.gestionEtudiant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import islab.edu.gestionEtudiant.Entities.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
