/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.gestionformation.implementation;

import java.util.ArrayList;
import sn.groupesupinfo.gestionformation.Groupe;
import InterfaceProjet.IGestionProjet;
import java.util.Scanner;


/**
 *
 * @author boubadiop
 *  * Cette classe implemente l'interface IGestionProjet et recupere toutes les methodes abstraites

 */
public class GroupeImp  implements IGestionProjet<Groupe>{
    
     ArrayList<Groupe> groupes = new ArrayList<Groupe>() ;

   
    
    Scanner sc = new Scanner(System.in);
//    public GroupeImp(){
//        this.groupes = new ArrayList<Groupe>();
//    }
    
    @Override
    public void ajout(Groupe groupe) {

      groupes.add(groupe);
      
    }

    @Override
    public void modif(Groupe groupe) {
        for(Groupe groupe1:groupes) {
    		if(groupe1.getId()==groupe1.getId()) {
    			groupe1.setNomGroupe(groupe.getNomGroupe());
                        
                        
    			                        
    		}
    	} 
    }

    @Override
    public void supp(Groupe groupe) {
        groupes.remove(groupe);
    }

    @Override
    public Groupe getById(int i) {
        for(Groupe groupe:groupes) {
    	if(groupe.getId()==i) {
            return groupe;
    	}
        System.out.println("le groupe nexiste pas");
      }
        
        return null;
    }

    @Override
    public ArrayList<Groupe> getAll() {
       return groupes;
    }
    
    public boolean groupeExiste(Groupe g){
        boolean var=false;
         for(Groupe gp:groupes){
            if(gp==g){
            var = true;
            
            }else{
                var = false;
                System.out.println("le groupe existe deja");
            }
        }
         return var;
    }

}
