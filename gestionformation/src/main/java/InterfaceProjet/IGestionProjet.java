/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceProjet;

import java.util.List;

/**
 *
 * @author boubadiop
 */
//t POUR TOUT GENERALISER
//Cette interface génerique qui generalise tout le projet sera implementer par toutes les classes du projet
public interface IGestionProjet <T>{
   void ajout(T etudiant);
   void modif(T etudiant);
   void supp(T etudiant);
   T getById(int i);
   List<T> getAll();
    
}

