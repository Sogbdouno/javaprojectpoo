/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package sn.groupesupinfo.menu;
import controllers.GestGroupe;
import controllers.Menu;
import controllers.GestEtudiant;
import controllers.GestProfesseur;
import java.util.ArrayList;
import java.util.Scanner;
import sn.groupesupinfo.gestionformation.Groupe;
import sn.groupesupinfo.gestionformation.implementation.EtudiantEmp;
import sn.groupesupinfo.gestionformation.implementation.GroupeEtudiantImple;
import sn.groupesupinfo.gestionformation.implementation.GroupeImp;
//import sn.groupesupinfo.gestionformation.implementation.GroupeEtudiantImple;


/**
 *
 * @author boubadiop Permet de tester les differentes fonctionnalités du menu
 * La classe TesMenu represente la classe main de notre apllication qui gère 
 * la gestion des etudiants,des professeurs
 * des groupes et la gestion des etdiants dans differents.
 * 
 * 
 */
public class TestMenu {

    public static void main(String[] args) {
       
        boolean var = true;
        while (var) {
            System.out.println("*************************Gestion Formaton************************");

            System.out.println("===========Menu Principal===========");
            String affichageMP = Menu.menuPrincipal();
            System.out.println(affichageMP);
            System.out.println("Faites votre choix");
            Scanner sc = new Scanner(System.in);
            int choix = sc.nextInt();
            switch (choix) {
                case 1:
                    boolean var1 = true;
                    while (var1) {
                        String affichageMG = Menu.menuGroupe();
                        System.out.println(affichageMG);
                        System.out.println("Faites un choix");
                        int choixGroupe = sc.nextInt();
                        switch (choixGroupe) {
                            case 1:
                                 GestGroupe.creationGroupe();
                                break;
                            
                            case 2:
                                GestGroupe.modifierGroupe();
                                break;

                            case 3:
                                GestGroupe.detailsGroupe();
                                break;

                            case 4:
                                GestGroupe.SuppressionGroupe();
                                break;

                            case 5:
                                GestGroupe.allGroupe();
                                break;
                                
                            case 6:
                                System.out.println("Merci d'avoir quitter");
                                var1 = false;
                                var = true;
                                break;
                            default:
                                System.out.println("choix ibvalide");
                        }
                    }

                break;

                case 2:
                    boolean var2 = true;
                    while (var2) {
                        String affichageEt = Menu.menuEtudiant();
                        System.out.println(affichageEt);

                        System.out.println("Faites un choix");
                        int choixEtudiant = sc.nextInt();
                        switch (choixEtudiant) {
                            case 1:
                                GestEtudiant.ajouterEtudiant();
                                break;
                            case 2:
                                GestEtudiant.modifierEtudiant();
                                break;
                                
                            case 3:
                               GestEtudiant.detailsEtudiant();
                               break;
                               
                            case 4:
                                GestEtudiant.SuppressionEtudiant();
                                break;
                            
                            case 5:
                                GestEtudiant.allEtudiant();
                                break;
                                
                            case 6:
                                System.out.println("Merci d'avoir quitter");
                                var2 = false;
                                var = true;
                                break;
                            default:
                                System.out.println("choix ibvalide");
                        }
                    }
                    break;

                case 3:
                    boolean var3 = true;
                    while (var3) {
                        String affichagePr = Menu.menuProfesseur();
                        System.out.println(affichagePr);

                        System.out.println("Faites un choix");
                        int choixProfesseur = sc.nextInt();
                        switch (choixProfesseur) {
                            case 1:
                                GestProfesseur.ajouterProfesseur();
                                break;
                                
                            case 2:
                                GestProfesseur.modifierProfesseur();
                                break;
                                
                            case 3:
                                GestProfesseur.detailsProfesseur();
                                break;
                                
                            case 4:
                                GestProfesseur.SuppressionProfesseur();
                                break;
                                
                            case 5:
                                GestProfesseur.allProfesseur();
                                break;
                                
                            case 6:
                                System.out.println("Merci d'avoir quitter");
                                var3 = false;
                                var = true;
                                break;
                            default:
                                System.out.println("choix invalide");
                        }
                    }
                    break;

                case 4:
                    EtudiantEmp etudiantImp = new EtudiantEmp();
                    Groupe grp = new Groupe();
                    GroupeImp groupeImp = new GroupeImp();
                    
                    

                    boolean var4 = true;
                    while (var4) {
                        String affichageMGroupeEt = Menu.menuGroupeEtudiant();
//                        GestEtudiant.allEtudiant();
//                        GestGroupe.allGroupe();
                        System.out.println("Donner l'id du groupe a gerer");
                         int id = sc.nextInt();
                         grp = groupeImp.getById(id);
                         System.out.println(affichageMGroupeEt);
                        System.out.println("Faites votre choix");
                        int choixGroupeEt = sc.nextInt();
                        switch (choixGroupeEt) {
                            case 1:
                               System.out.println("*--------Ajouter un etudiant dans un groupr----------*");
                               System.out.println("Donner l'id de l'etudiant a ajouter dans le groupe");
                               int idEt = sc.nextInt();
                               etudiantImp.getById(idEt);
                              GroupeEtudiantImple grpEtImp = new GroupeEtudiantImple(grp,GestEtudiant.getEtudiantImp().getAll(),GestGroupe.getGroupeImp().getAll());

                               grpEtImp.ajoutEtudiant(idEt);
                               System.out.println("Etudiant ajoute avec succès");
                                
                                break;
                            case 2:
                                
                                break;
                            case 3:
                                System.out.println("*--------Afficher tous les etudiant dans un groupr----------*");
//                                grpEtImp.afficherEtudiant();

                                System.out.println("********Affigchage terminé**************");
                                break;
                            case 4:
                                 System.out.println("Merci d'avoir quitter");
                                var4 = false;
                                var = true;
                                break;
                            default:
                                System.out.println("Choix invalide");
                        }
                    }
                    break;

                case 5:
                    System.out.println("===========Quitter le système==============");
                    System.exit(0);
                    break;
                default:
                    System.out.println("choix invalide");
            }
        }
    }

}
