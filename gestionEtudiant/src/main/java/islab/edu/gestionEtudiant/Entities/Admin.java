package islab.edu.gestionEtudiant.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
@Entity
public class Admin extends Personne implements Serializable  {

	public Admin() {
		super();
		this.setRole("A");
	}
	

	
}
