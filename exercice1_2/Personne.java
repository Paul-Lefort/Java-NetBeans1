/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercice1;

import java.time.LocalDate;

/**
 *
 * @author paul
 */
public class Personne {
    
    private String nom;
    private String prenom;
    private int anNaissance;
    private static int compteurInstance = 0;

    public Personne(String nom, String prenom, int anNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.anNaissance = anNaissance;
        compteurInstance++;
    }

    public Personne(String prenom, int anNaissance) {
        this.nom = "inconnue";
        this.prenom = prenom;
        this.anNaissance = anNaissance;
        compteurInstance++;

    }

    public Personne() {
        this.nom = "Potter";
        this.prenom = "Harry";
        this.anNaissance = 1980;
        compteurInstance++;

    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAnNaissance() {
        return anNaissance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAnNaissance(int anNaissance) {
        this.anNaissance = anNaissance;
    }
    
    public int calculerAge(){
        int actualYear = LocalDate.now().getYear();
        int age = actualYear - this.anNaissance;
        return age;
    }

    @Override
    public String toString() {
        return "Nom: " + this.nom + "\nPrenom: " + this.prenom + "\nanNaissance: " + this.anNaissance;
    }
    
    public String mange(String nourriture){
        return this.nom +" "+this.prenom + " mange un/une " + nourriture;
    }
    
    public static int afficherNbPers(){
        return compteurInstance;
    }
    
    
    
}
