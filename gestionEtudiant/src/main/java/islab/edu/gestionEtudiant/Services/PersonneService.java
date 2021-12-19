package islab.edu.gestionEtudiant.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import islab.edu.gestionEtudiant.Entities.Admin;
import islab.edu.gestionEtudiant.Entities.Etudiant;
import islab.edu.gestionEtudiant.Entities.Personne;

public interface PersonneService {
	
	public List<Admin> getAllAdmin();
	public Admin getAdminById(int cin);
	public Admin addAdmin(Admin a);
	
	public List<Etudiant> getAllEtudiant();
	public Etudiant getEtudiantById(int cin);
	public Etudiant addEtudiant(Etudiant e);
	public void deleteEtudiant(int cin);
	public Etudiant updateEtudiant(Etudiant e);
	public void affecterModule(int code,int cin);
	public Personne findOneByMailAndPassword(String mail, String password);

}
