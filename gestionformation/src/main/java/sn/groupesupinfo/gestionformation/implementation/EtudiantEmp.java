/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.gestionformation.implementation;

import java.util.ArrayList;
import java.util.List;
import sn.groupesupinfo.gestionformation.Etudiant;
import InterfaceProjet.IGestionProjet;
import controllers.GestEtudiant;
import java.util.Scanner;
//import sn.groupesupinfo.gestionformation.interfacee.IEtudiant;

/**
 *
 * @author boubadiop
 * Cette classe implemente l'interface IGestionProjet et recupere toutes les methodes abstraites
 */
public class EtudiantEmp implements IGestionProjet<Etudiant>{
        
    ArrayList<Etudiant> etudiants ;
    
    Scanner sc = new Scanner(System.in);
    public EtudiantEmp(){
        
        etudiants = new ArrayList<Etudiant>();
        
    }
    
    public EtudiantEmp(ArrayList<Etudiant> et){
        this.etudiants=et;
    }

    @Override
    public void ajout(Etudiant etudiant) {
        
            
          etudiants.add(etudiant);

    }

    @Override
    public void modif(Etudiant etudiant) {
        for(Etudiant etudiant2:etudiants) {
    		if(etudiant2.getId()==etudiant.getId()) {
    			etudiant2.setMatricule(etudiant.getMatricule());
    			etudiant2.setNom(etudiant.getNom());
    			etudiant2.setPrenom(etudiant.getPrenom());
    			etudiant2.setDateNaissance(etudiant.getDateNaissance());
                        etudiant2.setLieuNaissance(etudiant.getLieuNaissance());
                        etudiant2.setAdresse(etudiant.getAdresse());
                        etudiant2.setTelephone(etudiant.getTelephone());
                        etudiant2.setEmail(etudiant.getEmail());
                        etudiant2.setNationalite(etudiant.getNationalite());
                        etudiant2.setGenre(etudiant.getGenre());
                        etudiant2.setGroupeSanguin(etudiant.getGroupeSanguin());
                }
    	}
    }

    @Override
    public void supp(Etudiant etudiant) {
         etudiants.remove(etudiant);
    }

    @Override
    public  Etudiant getById(int i) {
        for(Etudiant etudiant:etudiants) {
    	if(etudiant.getId()==i) {
            return etudiant;
    	}
      }
        return null;
    }

    @Override
    public ArrayList<Etudiant> getAll() {
        return etudiants;
    }
}
