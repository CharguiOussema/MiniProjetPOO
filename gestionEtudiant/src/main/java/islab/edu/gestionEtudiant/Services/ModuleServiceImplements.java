package islab.edu.gestionEtudiant.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import islab.edu.gestionEtudiant.Entities.Module;
import islab.edu.gestionEtudiant.Repository.ModuleRepository;

@Service
public class ModuleServiceImplements implements ModuleService {

	@Autowired
	private ModuleRepository moduleRepository;

	@Override
	public List<Module> getAll() {
		// TODO Auto-generated method stub
		return moduleRepository.findAll();
	}

	@Override
	public Module getByCode(int code) {
		// TODO Auto-generated method stub
		return moduleRepository.findOneByCode(code);
	}

	@Override
	public Module addModule(Module m) {
		// TODO Auto-generated method stub
		return moduleRepository.save(m);
	}

	@Override
	public Module updateModule(Module m) {
		// TODO Auto-generated method stub
		Module module = moduleRepository.findById(m.getCode()).orElse(null);
		if(module != null) {
			module.setCode(m.getCode());
			module.setDesignation(m.getDesignation());
			module.setCoefficient(m.getCoefficient());
			module.setType(m.getType());
		}
		
		return moduleRepository.save(module) ;
	}

	@Override
	public void deleteModule(int code) {
		// TODO Auto-generated method stub
		moduleRepository.deleteById(code);
	}
	
	
	
}
