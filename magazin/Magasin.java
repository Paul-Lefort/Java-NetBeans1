/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package magazin;

import java.util.List;

/**
 *
 * @author paul
 */
public class Magasin {
    
    private List<Produit> produits;

    public Magasin(List<Produit> produits) {
        this.produits = produits;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
    
    public void ajouterProduit(Produit produit){
        produits.add(produit);
    }
    
    public String afficherPanier(){
        String ensembleProduits = "";
        for(Produit produit : this.produits){
            if (produit.getQuantité() > 1 ){
                ensembleProduits += produit.getNom() + "\n";
            }
        }
        return ensembleProduits;
    }

        

    public Produit trouverProduitParNom(String nom){
        for(Produit produit : this.produits){
            if (produit.getNom().equals(nom)){
                return produit;
            }
        }
        return null;
    } 
}
