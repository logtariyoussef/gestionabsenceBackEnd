
package tn.enicarthage.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.model.Etudiant;
import tn.enicarthage.model.Matiere;
import tn.enicarthage.repository.EtudiantRepo;
import tn.enicarthage.repository.MatiereRepo;
import tn.enicarthage.service.EtudiantService;

@Service

public class EtudiantServiceImpl implements EtudiantService {
	   @Autowired
     private  EtudiantRepo etudrepo;
	
	   

 	
 	//method save user
	@Override
	public Etudiant saveEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		return etudrepo.save(etudiant) ;
	}
	//method get all user
	@Override
	public List<Etudiant> getEtudiant() {
		// TODO Auto-generated method stub
		return etudrepo.findAll() ;
	}
	
	//method get etudiant by id
	@Override
	public Etudiant getEtudiantById(Long id) {
		 Etudiant existuser= etudrepo.findById(id).orElse(null);
		 return existuser;
		
		
		
	}

	
	//method delete etudiant
	
	@Override
	public void deleteEtudiant(Long id) {
		// TODO Auto-generated method stub
		etudrepo.deleteById(id);
		
	}
	
	//method update etudiant
	@Override
	public Etudiant updateEtudiant(Etudiant etudiant, Long id) {
		// TODO Auto-generated method stub
		Etudiant existetud=etudrepo.findById(id).orElse(null);
		existetud.setFirstName(etudiant.getFirstName());
		existetud.setLastName(etudiant.getLastName());
		existetud.setPassword(etudiant.getPassword());
		existetud.setImageUrl(etudiant.getImageUrl());
		existetud.setGroupe(etudiant.getGroupe());
		etudrepo.save(existetud);
		return existetud;
	}
	
	



}
