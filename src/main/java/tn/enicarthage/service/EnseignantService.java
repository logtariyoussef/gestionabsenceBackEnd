package tn.enicarthage.service;

import java.util.List;

import tn.enicarthage.model.Enseignant;
import tn.enicarthage.model.Groupe;


public interface EnseignantService {
	
   public Enseignant saveEnseignant(Enseignant enseignant);
   
   public List<Enseignant>getEnseignant();
   
   public Enseignant getEnseignantById(Long id);
   
   public Enseignant updateEnseignant(Enseignant enseignant ,Long id);
   
   public void deleteEnseignant(Long id);
  
//add list of groupe to enseignant
   public Enseignant addGroupesToEnseignant(Long idE,List<Long>idGrps);
   
   //get list of groupe of an enseignant qui etudie la matiere enseigne par l'neseignant;
   public List<Groupe>getListGroupeByEnseignant(Long idEns);
   
   //for the login to check condition;
  public Enseignant getEnseignantByEmail(String email);
  

 
}
