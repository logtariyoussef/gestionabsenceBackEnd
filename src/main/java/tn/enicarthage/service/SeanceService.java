package tn.enicarthage.service;

import java.util.List;

import tn.enicarthage.model.Enseignant;
import tn.enicarthage.model.Seance;

public interface SeanceService {
    
	public Seance saveSeance(Seance seance);
	
	public Seance getSeanceById( Long id);
	
	public List<Seance>getAllSeance();
	
	public Seance updateSeance(Seance seance,Long id);
	
	//affecter un enseignant a son propre seance;
	public Seance addEnsToSeance(Seance seance,Long idEns);
	
	//get list of seance of an enseignant
	public List<Seance>findByEnseignant(Long idEns);
}
