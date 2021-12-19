package islab.edu.gestionEtudiant.Services;

import java.util.List;

import islab.edu.gestionEtudiant.Entities.Module;

public interface ModuleService {

	public List<Module> getAll();
	public Module getByCode(int code);
	public Module addModule(Module m);
	public Module updateModule(Module m);
	public void deleteModule(int code);
	
}
