/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.gestionformation.implementation;



import java.util.ArrayList;
import sn.groupesupinfo.gestionformation.Etudiant;
import sn.groupesupinfo.gestionformation.Groupe;



//G

/**
 *
 * @author boubadiop
 * Cette classe permet d'afficher  la liste des etudiants dans un Group,a
 * jouter un etudiant dans un groupe donné et egalement le modifié
 */
public class GroupeEtudiantImple{
    Groupe groupe;
    GroupeImp allGroup;
    ArrayList<Groupe> allGroupe;
    ArrayList<Etudiant> etudiantsGrp;
    ArrayList<Etudiant> allEtudiants; 
    public GroupeEtudiantImple(){
        
    }
    
    public GroupeEtudiantImple(Groupe gp,ArrayList<Etudiant> et,ArrayList<Groupe> grou){//Etudiant e
       
        this.groupe = gp;
        this.allGroupe = grou;
        this.allEtudiants = et;
        this.etudiantsGrp = gp.getListetudiants();//g/listEtudiant.add(e);
    }
    
    public void ajoutEtudiant(int id) {
        boolean var = false;
        Etudiant et = new Etudiant();
        for(Etudiant etudts:allEtudiants){
            if(etudts.getId()==id){
                et=etudts;
                var = true;
                etudiantsGrp.add(et);
            }
        }
        if(var){
            System.out.println("L'etudiant"+et.getNom()+"a ete ajoute au groupe");
        }else{
            System.out.println("Etudiiant introuvable");
        }
    }


    public void suppEtudiant(int id) {
       boolean var = false;
        Etudiant et = new Etudiant();
        for(Etudiant etudts:allEtudiants){
            if(etudts.getId()==id){
                et=etudts;
                var = true;
                etudiantsGrp.remove(etudiantsGrp.indexOf(et));
            }
        }
        if(var){
            System.out.println("L'etudiant"+et.getNom()+"a ete supprimé hau groupe");
        }else{
            System.out.println("Etudiiant introuvable");
        }
    }


    public void afficherEtudiant() {
         for(Etudiant etudts:etudiantsGrp){
             System.out.println(etudts.toString());
         }
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }
    
 }


