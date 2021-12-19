package islab.edu.gestionEtudiant.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import islab.edu.gestionEtudiant.Entities.Admin;
import islab.edu.gestionEtudiant.Entities.Adresse;
import islab.edu.gestionEtudiant.Entities.Etudiant;
import islab.edu.gestionEtudiant.Entities.Module;
import islab.edu.gestionEtudiant.Entities.Personne;
import islab.edu.gestionEtudiant.Repository.AdminRepository;
import islab.edu.gestionEtudiant.Repository.EtudiantRepository;
import islab.edu.gestionEtudiant.Repository.ModuleRepository;
import islab.edu.gestionEtudiant.Repository.PersonneRepository;
@Service
public class PersonneServiceImplements implements PersonneService{
	
	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private EtudiantRepository etudiantRepository;
	@Autowired 
	private PersonneRepository personneRepository;
	@Autowired 
	private ModuleRepository moduleRepository;
	@Override
	public List<Etudiant> getAllEtudiant() {
		return etudiantRepository.findAll();
	}

	@Override
	public List<Admin> getAllAdmin() {
		return adminRepository.findAll();
	}

	@Override
	public Admin getAdminById(int cin) {
		// TODO Auto-generated method stub
		return adminRepository.getById(cin);
	}

	
	@Override
	public Etudiant getEtudiantById(int cin) {
		// TODO Auto-generated method stub
		return etudiantRepository.getById(cin);
	}


	@Override
	public void deleteEtudiant(int cin) {
		
		etudiantRepository.deleteById(cin);
	}

	@Override
	public Admin addAdmin(Admin a) {
		// TODO Auto-generated method stub
		return adminRepository.save(a);
	}

	

	@Override
	public Etudiant addEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		return etudiantRepository.save(e);
	}

	@Override
	public Etudiant updateEtudiant(Etudiant e) {
		Etudiant etudiant = etudiantRepository.findById(e.getCin()).orElse(null);
		if(etudiant != null) {
			etudiant.setCin(e.getCin());
			etudiant.setNom(e.getNom());
			etudiant.setPrenom(e.getPrenom());
			etudiant.setMail(e.getMail());
			etudiant.setDateNaissance(e.getDateNaissance());
			etudiant.setPassword(e.getPassword());
			Adresse a = etudiant.getAdresse();
			a.setRue(e.getAdresse().getRue());
			a.setVille(e.getAdresse().getVille());
			a.setCodePostal(e.getAdresse().getCodePostal());
			etudiant.setAdresse(a);
		}
		return etudiantRepository.save(etudiant);
	}

	
	public Personne findOneByMailAndPassword(String mail, String password) {
		// TODO Auto-generated method stub
		
		Personne p=	personneRepository.findOneByMailAndPassword(mail, password);
			if(p == null)
				return null;
			
			return p;
			
	}

	@Override
	public void affecterModule(int code, int cin) {
		// TODO Auto-generated method stub
		Etudiant etudiant = etudiantRepository.findById(cin).orElse(null);
		if(etudiant != null) {
			Module module = moduleRepository.findById(code).orElse(null);
			if(module != null) {
				List<Module> list = new ArrayList<Module>();
				list.add(module);
				etudiant.setModule(list);
				//System.err.println("test test "+etudiant.getModule());
			}
		}
		//System.err.println();
		//System.err.println();
		etudiantRepository.save(etudiant);
	}

	



}
