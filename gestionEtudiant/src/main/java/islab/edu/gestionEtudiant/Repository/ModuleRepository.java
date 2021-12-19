package islab.edu.gestionEtudiant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import islab.edu.gestionEtudiant.Entities.Module;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Integer>{

	public Module findOneByCode(int code);
}
