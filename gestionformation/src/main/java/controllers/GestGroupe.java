/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import sn.groupesupinfo.gestionformation.Groupe;
import sn.groupesupinfo.gestionformation.implementation.GroupeImp;

/**
 *
 * @author boubadiop
 *  * Cette classe GestGroupe toutes les fonctionnalités de la gestion des groupes 
 * qui seront directement appellées dans le main

 */
public class GestGroupe {
    static Scanner sc = new Scanner(System.in);
    static GroupeImp groupeImp = new GroupeImp();
    
            
    public static String affichageMenuGestGroupe(){
        System.out.println("========Gestion Groupe============");
        String affichageMenuGestGroupe = Menu.menuGroupe();
        return affichageMenuGestGroupe;    
    }

    public static Groupe creationGroupe(){
        System.out.println("-------Creer un Grouoe-------");
        System.out.println("id");
        int id = sc.nextInt();
        System.out.println("Nom Groupe");
        String nomGroupe = sc.next();
        Groupe groupe = new Groupe(id, nomGroupe);
        groupeImp.ajout(groupe);
        System.out.println("Groupe Crée avec succès");
        
        return groupe;
    }
    
    
    
    public static void modifierGroupe(){
        System.out.println("---------Modifier un groupe-----------");
        System.out.println("Donnez l'id du groupe à modifier");
        int idModif = sc.nextInt();
        Groupe groupe = groupeImp.getById(idModif);
        System.out.println("nom groupe");
        String nomG = sc.next();
        groupe.setNomGroupe(nomG);
        groupeImp.modif(groupe);
        System.out.println("Groupe Modifié avec succès ");
        
      }
    
    public static void detailsGroupe(){
        System.out.println("---------Afficher les details du groupe-----------");
        System.out.println("id");
        int idAf = sc.nextInt();
        Groupe groupe2 = groupeImp.getById(idAf);
        System.out.println(groupe2.getNomGroupe());
        
        System.out.println("Details affichés avec succès");
    }
    public static void SuppressionGroupe(){
        System.out.println("---------Supprimer un groupe-----------");
        System.out.println("id");
        int idSup = sc.nextInt();
        Groupe groupe3 = groupeImp.getById(idSup);
        groupeImp.supp(groupe3);
        System.out.println("Groupe Supprimé avec succès");
        
    }
    
    public static void allGroupe(){
        System.out.println("----------afficher tous les groupes------------");
        ArrayList<Groupe> groupes = groupeImp.getAll();
        for (Groupe groupe4 : groupes) {
              System.out.println(groupe4.getNomGroupe());
         }
       System.out.println("Affichage des groupes");
    }

    public static GroupeImp getGroupeImp() {
        return groupeImp;
    }
    
    public static ArrayList<Groupe> groupe(){
        return groupeImp.getAll();
    }
    
    
    
 
}
