/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import sn.groupesupinfo.gestionformation.Etudiant;
import sn.groupesupinfo.gestionformation.implementation.EtudiantEmp;

/**
 *
 * @author boubadiop
 * Cette classe GestEtudiant toutes les fonctionnalités de la gestion des Etudiants
 * qui seront directement appelées  dans le main
 */
public class GestEtudiant {
    static Scanner sc = new Scanner(System.in);
    static EtudiantEmp etudiantImp = new EtudiantEmp();

    public static EtudiantEmp getEtudiantImp() {
        return etudiantImp;
    }
    
    
    
    
        
    
            
    public static String affichageMenuEtudiant(){
        System.out.println("========Gestion Etudiant============");
        String affichageMenuEtudiant = Menu.menuEtudiant();
        return affichageMenuEtudiant;    
    }

    public static Etudiant ajouterEtudiant(){
        System.out.println("------------Ajouter un étudiant------------");
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
        System.out.println("groupe sanguin");
        String groupeSanguin = sc.next();
        
        Etudiant etudiant = new Etudiant(id, matricule, nom, prenom, dateNaissance,
                              lieuNaissance, adresse, telephone, email, nationalite,
                               genre, groupeSanguin);

        etudiantImp.ajout(etudiant);
         System.out.println("etudiant ajouté avec succès"); 
         return etudiant;
    }
    
    public static void modifierEtudiant(){
        System.out.println("*-------------Modifier un etudiant--------------*");
        System.out.println("id");
        int idMod = sc.nextInt();
        Etudiant etudiant2 = etudiantImp.getById(idMod);
        System.out.println("matricule");
        String matriculeE = sc.next();
        etudiant2.setMatricule(matriculeE);
        System.out.println("nom");
        String nomE = sc.next();
        etudiant2.setNom(nomE);
        System.out.println("prenom");
        String prenomE = sc.next();
        etudiant2.setPrenom(prenomE);
        System.out.println("date naissance");
        String dateNaissanceE = sc.next();
        etudiant2.setDateNaissance(dateNaissanceE);
        System.out.println("lieu naissance");
        String lieuNaissanceE = sc.next();
        etudiant2.setLieuNaissance(lieuNaissanceE);
        System.out.println("adresse");
        String adresseE = sc.next();
        etudiant2.setAdresse(adresseE);
        System.out.println("telephone");
        String telephoneE = sc.next();
        etudiant2.setTelephone(telephoneE);
        System.out.println("email");
        String emailE = sc.next();
        etudiant2.setEmail(emailE);
        System.out.println("nationalite");
        String nationaliteE = sc.next();
        etudiant2.setNationalite(nationaliteE);
        System.out.println("genre");
        String genreE = sc.next();
        etudiant2.setGenre(genreE);
        System.out.println("groupe sanguin");
        String groupeSanguinE = sc.next();
        etudiant2.setGroupeSanguin(groupeSanguinE);
        etudiantImp.modif(etudiant2);
        
        System.out.println("Etudiant Modifié avec succès");
        
      }
    
    public static void detailsEtudiant(){
        System.out.println("*--------------Afficher les details d'un etudiant---------------*");
        System.out.println("id");
        int idAf = sc.nextInt();
        Etudiant etudiant3 = etudiantImp.getById(idAf);
        System.out.println(etudiant3.getMatricule());
        System.out.println(etudiant3.getNom());
        System.out.println(etudiant3.getPrenom());
        System.out.println(etudiant3.getAdresse());
        System.out.println(etudiant3.getEmail());
        System.out.println(etudiant3.getGroupeSanguin());
        
        System.out.println("Details affichés avec succès");
    }
    public static void SuppressionEtudiant(){
        System.out.println("*---------Supprimer un etudiant-----------*");
        System.out.println("Donnez l'id de l'ertudiant à supprimer ");
        int idSup = sc.nextInt();
        Etudiant etudiant4 = etudiantImp.getById(idSup);
        etudiantImp.supp(etudiant4);
        
        System.out.println("Etudiant Supprimé avec succès");
        
    }
    
    public static void allEtudiant(){
        System.out.println("*----------afficher tous les Etudiants------------*");
        List<Etudiant> etudiants = etudiantImp.getAll();
        for (Etudiant etudiant5 : etudiants) {
            System.out.println(etudiant5.getNom());
            System.out.println(etudiant5.getPrenom());
            System.out.println(etudiant5.getMatricule());
            
        }
        
        System.out.println("Affichage reussie");
    }
}
