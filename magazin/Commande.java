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
public class Commande {
    private int idCommande;
    private Client client;
    private Panier produitsCommandes;
    private float total;

    public Commande(int idCommande, Client client, int total) {
        this.idCommande = idCommande;
        this.client = client;
        this.produitsCommandes = new Panier();
        this.total = total;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Produit> getProduitsCommandes() {
        return produitsCommandes.getPanier();
    }

    public void setProduitsCommandes(List<Produit> produitsCommandes) {
        this.produitsCommandes.setPanier(produitsCommandes);
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    public String afficherDetailsCommande(){
        String ensemblePanier = "";
        for(Produit produit : this.produitsCommandes.getPanier()){
            ensemblePanier += produit.getNom() +" "+produit.getQuantité() + "\n";
        }
        ensemblePanier += "Total : " + this.total;
        return ensemblePanier;
    }

}

