package islab.edu.gestionEtudiant.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Etudiant extends Personne implements Serializable {

	public Etudiant() {
		super();
		this.setRole("E");
		// TODO Auto-generated constructor stub
	}
	

	
	

}
