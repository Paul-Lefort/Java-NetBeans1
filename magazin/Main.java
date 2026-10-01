/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package magazin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author paul
 */
public class Main {
    
    
    public static List<Produit> genererProduit(){
        List<Produit> liste = new ArrayList<>();

        liste.add(new Produit(1, "Smartphone Galaxy S23", 899.99f, 15));
        liste.add(new Produit(2, "Ecouteurs Bluetooth Sony", 149.50f, 30));
        liste.add(new Produit(3, "PC Portable Dell XPS", 1299.00f, 8));
        liste.add(new Produit(4, "Clavier Mécanique RGB", 79.90f, 25));
        liste.add(new Produit(5, "Souris Sans Fil Logi", 35.00f, 40));
        liste.add(new Produit(6, "Ecran 27 pouces 4K", 349.99f, 12));
        return liste;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Magasin magasin = new Magasin(genererProduit());
        Client client = new Client(1, "LEFORT", "paul.lefort@efrei.net");    
        Scanner sc = new Scanner(System.in);
        int option = 0;
    
        while(option != 5){

            System.out.print("""
                    --- Menu Magasin ---
                    1. Afficher les produits disponibles
                    2. Ajouter un produit au panier
                    3. Afficher le panier
                    4. Passer la commande
                    5. Quitter

                    Selectionner votre option : """); 

            option = sc.nextInt();
            while(option < 0 || option > 5){
                System.out.println("veuillez selectionner une option valide");
                System.out.print("Selectionner votre option : ");
                option = sc.nextInt();
            }

            switch(option){
                case 1:
                    System.out.println(magasin.afficherPanier());
                    break;

                case 2: 
                    sc.nextLine();
                    System.out.println("Nom du produit : ");
                    String nom = sc.nextLine();
                    
                    Produit produit = magasin.trouverProduitParNom(nom);
                    if(produit == null){
                        break;
                    }
                    System.out.println("Choisissez la quantité : ");
                    int quantité = sc.nextInt();
                    
                    produit.setQuantité(quantité);
                    client.getPanier().ajouterProduit(produit);
                    break;

                case 3:
                    System.out.println(client.getPanier().afficherPanier());
                    break;

                case 4:
                    System.out.println(client.getPanier().afficherPanier());
                    System.out.println(client.getPanier().CalculerTotal());
                    break;
                    
                default:
                    IO.print("ERREUR ");
                    break;
            }

        }
    }

}
