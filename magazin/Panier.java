/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package magazin;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paul
 */
public class Panier {
    
    private List<Produit> panier;

    public Panier(List<Produit> panier) {
        this.panier = panier;
    }
    
    public Panier() {
        this.panier = new ArrayList<>() ;
    }

    public List<Produit> getPanier() {
        return panier;
    }

    public void setPanier(List<Produit> panier) {
        this.panier = panier;
    }

    public void ajouterProduit(Produit produit){
        this.panier.add(produit);
    }
    
    public void SupprimerProduit(Produit produit){
        this.panier.remove(produit);
    }
    
    public String afficherPanier(){
        String ensemblePanier = "";
        for(Produit produit : this.panier){
            ensemblePanier += produit.getNom() + " x" + produit.getQuantité() + "\n";
        }
        return ensemblePanier;
    }

    public float CalculerTotal(){
        float Total = 0;
        for(Produit produit : this.panier){
            Total += produit.getPrix();
        }
        return Total;
    }
    


}
