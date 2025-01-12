package testes;

import entites.Client;
import entites.Depot;
import entites.Produit;
import entites.VenteManagement;

public class VenteTest {
    public static void main(String[] args) {
    // Création des objets produits
    Produit produit1 = new Produit("Ordinateur", 1000.0, "Informatique");
    Produit produit2 = new Produit("Téléphone", 500.0, "Électronique");
    Produit produit3 = new Produit("Clavier", 500.0, "Informatique");

    // Création des objets clients
    Client client1 = new Client("Jean Dupont", "jean@example.com");
    Client client2 = new Client("Marie Martin", "marie@example.com");
    Client client3 = new Client("Client 1", "Client@example.com");

    // Création des objets dépôt
    Depot depot1 = new Depot("Entrepôt A", 20, produit1);
    Depot depot2 = new Depot("Entrepôt B", 15, produit2);
    Depot depot3 = new Depot("Entrepôt C", 15, produit3);

    // Création de la gestion des ventes
    VenteManagement venteManagement = new VenteManagement();

    // Ajouter des produits, clients et dépôts
    venteManagement.ajouterProduit(produit1);
    venteManagement.ajouterProduit(produit2);
    venteManagement.ajouterProduit(produit3);
    venteManagement.ajouterClient(client1);
    venteManagement.ajouterClient(client2);
    venteManagement.ajouterClient(client3);
    venteManagement.ajouterDepot(depot1);
    venteManagement.ajouterDepot(depot2);
    venteManagement.ajouterDepot(depot3);

    // Créer des commandes
    venteManagement.creerCommande(client1, produit1, 2);
    venteManagement.creerCommande(client2, produit2, 5);
    venteManagement.creerCommande(client3, produit3, 5);

    // Afficher les commandes
    venteManagement.afficherToutesLesCommandes();

    // Appliquer une remise
    venteManagement.appliquerRemiseProduit(produit1, 10);

    venteManagement.appliquerRemiseProduit(produit3, 10);


    venteManagement.appliquerRemiseProduit(produit2, 10);

}
}

