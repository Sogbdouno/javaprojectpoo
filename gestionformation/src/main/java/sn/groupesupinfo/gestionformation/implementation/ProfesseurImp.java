/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.gestionformation.implementation;

import java.util.ArrayList;
import java.util.List;

import sn.groupesupinfo.gestionformation.Professeur;
import InterfaceProjet.IGestionProjet;


/**
 *
 * @author boubadiop
 *  * Cette classe implemente l'interface IGestionProjet et recupere toutes les methodes abstraites

 */
public class ProfesseurImp implements IGestionProjet<Professeur> {

    ArrayList<Professeur> professeurs = new ArrayList<Professeur>();
    @Override
    public void ajout(Professeur professeur) {
        professeurs.add(professeur);
    }

    @Override
    public void modif(Professeur professeur) {
       for(Professeur professeur1:professeurs) {
    		if(professeur1.getId()==professeur.getId()) {
    			professeur1.setMatricule(professeur.getMatricule());
    			professeur1.setNom(professeur.getNom());
    			professeur1.setPrenom(professeur.getPrenom());
    			professeur1.setDateNaissance(professeur.getDateNaissance());
                        professeur1.setLieuNaissance(professeur.getLieuNaissance());
                        professeur1.setAdresse(professeur.getAdresse());
                        professeur1.setTelephone(professeur.getTelephone());
                        professeur1.setEmail(professeur.getEmail());
                        professeur1.setNationalite(professeur.getNationalite());
                        professeur1.setGenre(professeur.getGenre());
                        professeur1.setSpecialite(professeur.getSpecialite());
                        
                        
    		}
    	}
    }

    @Override
    public void supp(Professeur professeur) {
       professeurs.remove(professeur);
    }

    @Override
    public Professeur getById(int i) {
           for(Professeur professeur:professeurs) {
    	if(professeur.getId()==i) {
            return professeur;
    	}
      }
        return null;
    }

    @Override
    public List<Professeur> getAll() {
      return professeurs;  
    }
    
}
