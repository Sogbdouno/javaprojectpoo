/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.gestionformation;

import java.util.ArrayList;


/**
 *
 * @author boubadiop
 * Cette classe enregistre les informations sur un groupe donné
 */
public class Groupe {
    private int id;
    private String nomGroupe;
    ArrayList<Etudiant> listetudiants;    //Gestion Groupe
                                                  //
    
    public Groupe(){
        super();
    }
    public Groupe(int id,String nomGroupe){
        this.id = id;
        this.nomGroupe = nomGroupe;
        this.listetudiants = new ArrayList<Etudiant>();
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public ArrayList<Etudiant> getListetudiants() {
        return listetudiants;
    }

    public void setListetudiants(ArrayList<Etudiant> listetudiants) {
        this.listetudiants = listetudiants;
    }
    
    

    @Override
    public String toString() {
        return "Groupe{" + "id=" + id + ", nomGroupe=" + nomGroupe +'}';
    }
    
}







