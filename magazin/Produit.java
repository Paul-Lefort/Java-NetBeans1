/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package magazin;

/**
 *
 * @author paul
 */
public class Produit {
    
    private int id;
    private String nom;
    private float prix;
    private int quantité;

    public Produit(int id, String nom, float prix, int quantité) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantité = quantité;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getQuantité() {
        return quantité;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    @Override
    public String toString() {
        return "id: " + id + "\nnom: " + nom + "\nprix=" + prix + "\nquantit\u00e9=" + quantité;
    }
    
    
}
