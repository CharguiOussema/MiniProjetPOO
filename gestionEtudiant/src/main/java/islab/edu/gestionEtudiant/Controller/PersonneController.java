package islab.edu.gestionEtudiant.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import islab.edu.gestionEtudiant.Entities.Admin;
import islab.edu.gestionEtudiant.Entities.Etudiant;
import islab.edu.gestionEtudiant.Entities.Module;
import islab.edu.gestionEtudiant.Entities.Personne;
import islab.edu.gestionEtudiant.Services.ModuleServiceImplements;
import islab.edu.gestionEtudiant.Services.PersonneServiceImplements;

@RestController
@RequestMapping("/api")
public class PersonneController {

	@Autowired
	private PersonneServiceImplements personneServiceImplements;
	@Autowired 
	private ModuleServiceImplements moduleServiceImplements; 
	
	
	
	@PostMapping("addEtudiant")
	public Etudiant addEtudiant(@RequestBody Etudiant e) {
		return personneServiceImplements.addEtudiant(e);
	}
	
	@PostMapping("/addAdmin")
	public Admin addAdmin(@RequestBody Admin a) {
		return personneServiceImplements.addAdmin(a);
	}
	@PostMapping("/addModule")
	public Module addModule(@RequestBody Module m) {
		return moduleServiceImplements.addModule(m);
	}
	//just test
	@GetMapping("getAdminById/{cin}")
	public Admin getAdminById(@PathVariable int cin) {
		return personneServiceImplements.getAdminById(cin);
	}
	@GetMapping("getModuleById/{code}")
	public Module getById(@PathVariable int code) {
		return moduleServiceImplements.getByCode(code);
	}
	@GetMapping("getAllModule")
	public List<Module> getAll(){
		return moduleServiceImplements.getAll();
	}
	@GetMapping("getAllAdmin")
	public List<Admin> getAllAdmin(){
		return personneServiceImplements.getAllAdmin();
	}
	@GetMapping("getAllEtudiant")
	public List<Etudiant> getAllEtudiant(){
		return personneServiceImplements.getAllEtudiant();
	}
	@DeleteMapping("deleteEtudiant/{cin}")
	public void deleteEtudiant(@PathVariable int cin) {
		personneServiceImplements.deleteEtudiant(cin);
	}
	@DeleteMapping("deleteModule/{code}")
	public void deleteModule(@PathVariable int code) {
		moduleServiceImplements.deleteModule(code);
	}
	@PutMapping("updateEtudiant")
	public Etudiant updateEtudiant(@RequestBody Etudiant e) {
		return personneServiceImplements.updateEtudiant(e);
	}
	@PutMapping("updateModule")
	public Module updateModule(@RequestBody Module m) {
		return moduleServiceImplements.updateModule(m);
	}
	@GetMapping("login/{mail}/{password}")
	public Personne findOneByMailAndPassword(@PathVariable String mail,@PathVariable String password) {
		return personneServiceImplements.findOneByMailAndPassword(mail, password);
	}
	
	@GetMapping("affecter/{code}/{cin}")
	public void affecterModule(@PathVariable int code,@PathVariable int cin) {
		 personneServiceImplements.affecterModule(code, cin);
	}
}
