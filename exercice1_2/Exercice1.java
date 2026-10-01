/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercice1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paul
 */
public class Exercice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
    Personne personne1 = new Personne("Dupont", "Jean",2004);
    System.out.println(personne1);
    System.out.println(personne1.mange("Sandwitch"));
    System.out.println(personne1.calculerAge());
    System.out.println(Personne.afficherNbPers());
    
   
    Personne personne2 = new Personne("Emmanuel", 2002);
    System.out.println(personne2.mange("Sandwitch"));
    System.out.println(personne2);
    System.out.println(personne2.calculerAge());
    System.out.println(Personne.afficherNbPers());
    
    
    Personne personne3 = new Personne();
    System.out.println(personne3);
    System.out.println(personne3.mange("Sandwitch"));
    System.out.println(personne3.calculerAge());
    System.out.println(Personne.afficherNbPers());
        
        
    /*
        List<Personne> personnes;
        personnes = new ArrayList<>();
        personnes.add(new Personne("Dupont", "Jean",2004));
        personnes.add(new Personne("Emmanuel", 2002));
        personnes.add(new Personne());
       
    for ( Personne personne : personnes){
         System.out.println(personne.mange());
         System.out.println(personne.calculerAge());
         System.out.println(Personne.afficherNbPers());

    }
    */
    }
}