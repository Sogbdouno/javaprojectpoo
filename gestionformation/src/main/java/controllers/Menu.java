/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author boubadiop
 * Regroupe tous les menus de l'application
 * Cette classe Menu regroupe le menu principal et tous les sous menu de notre application, ils seront
 * directement appelés dans le main
 */
public class Menu {
    
     public static String menuPrincipal(){
         String menuP = "1.Gestion Groupe\n";
                menuP+="2.Gestion Etudiant\n";
                menuP+="3.Gestion Professeur\n";
                menuP+="4.Gestion Groupe Etudiant\n";
                menuP+="5.Quitter";

                
         return menuP;
     }
     
     public static String menuGroupe(){
         System.out.println("========Gestion Groupe============");
         String menuG = "1.Creer un groupe\n";
                menuG+="2.Modifier un Groupe\n";
                menuG+="3.Voir les  details d'un groupe\n";
                menuG+="4.Supprimer un Groupe\n";
                menuG+="5.Afficher tous les Groupes\n";
                menuG+="6.Quitter";

                
         return menuG;
     }
     
     public static String menuEtudiant(){
        System.out.println("========Gestion Etudiant============");
        String menuEt = "1.Ajouter un Etudiant\n";
                menuEt+="2.Modifier un Etudiant\n";
                menuEt+="3.Voir les  details d'un Etudiant\n";
                menuEt+="4.Supprimer un Etudiant\n";
                menuEt+="5.Afficher tous les Etudiants\n";
                menuEt+="6.Quitter";

                
         return menuEt;
     }
     
     public static String menuProfesseur(){
         System.out.println("=========Gestion Professeur=================");
         String menuProf = "1.Ajouter un Professeur\n";
                menuProf+="2.Modifier un Professeur\n";
                menuProf+="3.Voir les  details d'un Professeur\n";
                menuProf+="4.Supprimer un professeur\n";
                menuProf+="5.Afficher tous les professeurn\n";
                menuProf+="6.Quitter";
                
         return menuProf;
     }
     
     public static String menuGroupeEtudiant(){
         System.out.println("============Gesion Groupe Etudiant===========");
         String menuGestEt = "1.Ajouter un étudiant dans ce groupe\n";
                menuGestEt+="2.Supprimer un etudiant dans ce groupe\n";
                menuGestEt+="3.Afficher tous les étudiants de ce groupe\n";
                menuGestEt+="4.Quitter";
                
         return menuGestEt;
     }
}
