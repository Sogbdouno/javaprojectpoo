/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import java.util.Scanner;
import sn.groupesupinfo.gestionformation.Professeur;
import sn.groupesupinfo.gestionformation.implementation.ProfesseurImp;

/**
 *
 * @author boubadiop
 *  * Cette classe Gest toutes les fonctionnalités de la gestion des professeurs 
 * qui seront directement appelées dans le main

 */
public class GestProfesseur {
    static Scanner sc = new Scanner(System.in);
    static ProfesseurImp professeurImp = new ProfesseurImp();
    
            
    public static String affichageMenuProfesseur(){
        System.out.println("==============Gestion Professeur==============");
        String affichageMenuProfesseur = Menu.menuProfesseur();
        return affichageMenuProfesseur;    
    }

    public static Professeur ajouterProfesseur(){
        System.out.println("------------Ajouter un professeur------------");
        System.out.println("id");
        int id = sc.nextInt();
        System.out.println("matricule");
        String matricule = sc.next();
        System.out.println("nom");
        String nom = sc.next();
        System.out.println("prenom");
        String prenom = sc.next();
        System.out.println("date naissance");
        String dateNaissance = sc.next();
        System.out.println("lieu naissance");
        String lieuNaissance = sc.next();
        System.out.println("adresse");
        String adresse = sc.next();
        System.out.println("telephone");
        String telephone = sc.next();
        System.out.println("email");
        String email = sc.next();
        System.out.println("nationalite");
        String nationalite = sc.next();
        System.out.println("genre");
        String genre = sc.next();
        System.out.println("specialite");
        String specialite = sc.next();
        Professeur professeur = new Professeur(id, matricule, nom, prenom, dateNaissance,
                              lieuNaissance, adresse, telephone, email, nationalite,
                               genre,specialite);

        professeurImp.ajout(professeur);
         System.out.println("Professeur ajouté avec succès"); 
         return professeur;
    }
    
    public static void modifierProfesseur(){
        System.out.println("*-------------Modifier un professeur--------------*");
        System.out.println("id");
        int idMod = sc.nextInt();
        Professeur professeur = professeurImp.getById(idMod);
        System.out.println("matricule");
        String matriculeP = sc.next();
        professeur.setMatricule(matriculeP);
        System.out.println("nom");
        String nomP = sc.next();
        professeur.setNom(nomP);
        System.out.println("prenom");
        String prenomP = sc.next();
        professeur.setPrenom(prenomP);
        System.out.println("date naissance");
        String dateNaissanceP = sc.next();
        professeur.setDateNaissance(dateNaissanceP);
        System.out.println("lieu naissance");
        String lieuNaissanceP = sc.next();
        professeur.setLieuNaissance(lieuNaissanceP);
        System.out.println("adresse");
        String adresseP = sc.next();
        professeur.setAdresse(adresseP);
        System.out.println("telephone");
        String telephoneP = sc.next();
        professeur.setTelephone(telephoneP);
        System.out.println("email");
        String emailP = sc.next();
        professeur.setEmail(emailP);
        System.out.println("nationalite");
        String nationaliteP = sc.next();
        professeur.setNationalite(nationaliteP);
        System.out.println("genre");
        String genreP = sc.next();
        professeur.setGenre(genreP);
        System.out.println("specialite");
        String specialiteP = sc.next();
        professeur.setSpecialite(specialiteP);
        professeurImp.modif(professeur);
        
        System.out.println("Professeur Modifié avec succès");
        
      }
    
    public static void detailsProfesseur(){
        System.out.println("*--------------Afficher les details d'un professeur---------------*");
        System.out.println("id");
        int idAf = sc.nextInt();
        Professeur prof = professeurImp.getById(idAf);
        System.out.println(prof.getMatricule());
        System.out.println(prof.getNom());
        System.out.println(prof.getPrenom());
        System.out.println(prof.getAdresse());
        System.out.println(prof.getEmail());
        System.out.println(prof.getSpecialite());
        
        System.out.println("Details affichés avec succès");
    }
    public static void SuppressionProfesseur(){
        System.out.println("*---------Supprimer un professeur-----------*");
        System.out.println("id");
        int idSup = sc.nextInt();
        Professeur professeur2 = professeurImp.getById(idSup);
        professeurImp.supp(professeur2);
        
        System.out.println("Professeur Supprimé avec succès");
        
    }
    
    public static void allProfesseur(){
        System.out.println("*----------afficher tous les professeurs------------*");
        List<Professeur> professeurs = professeurImp.getAll();
        for(Professeur professeur3 : professeurs) {
                System.out.println("Nom du professeur:"+professeur3.getNom());
                System.out.println("Prenom du professeur:"+professeur3.getPrenom());
                
        }
        
        System.out.println("Affichage reussie");
    }
}
