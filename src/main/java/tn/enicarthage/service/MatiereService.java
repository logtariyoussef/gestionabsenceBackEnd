package tn.enicarthage.service;

import java.util.List;

import tn.enicarthage.model.Matiere;

public interface MatiereService {
	
        public Matiere saveMatiere(Matiere matiere);
        
        public List<Matiere>getAllMatieres();
        
        public Matiere getMatierById(Long id);
        
        public Matiere updateMatiere(Matiere matiere ,Long id);
        
        public void deleteMatiere(Long id);
        
        //getlist matiere from their id to put it in form select when we added list of matiere to a group
        public List<Matiere>getMatiereByIDs(List<Long>idMats);
        
        
        //get list of matiere from the absence table
        public List<Matiere>getMatEtd(Long etd);
}
