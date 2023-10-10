package tn.enicarthage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tn.enicarthage.model.Enseignant;
import tn.enicarthage.model.Matiere;

public interface EnseignantRepo extends JpaRepository<Enseignant,Long> {
    
	
	 
	 //find enseignant by email and password
	 Enseignant findEnseignantByEmailAndPassword(String email,String password);
	 
 //find enseignanit by email;
	Enseignant findEnseignantByEmail(String email);
	    
}
