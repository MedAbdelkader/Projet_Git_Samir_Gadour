package entites;

import java.util.ArrayList;
import java.util.List;

public class VenteManagement {private List<Client> clients;
    private List<Produit> produits;
    private List<Depot> depots;
    private List<Commande> commandes;

    // Constructeur
    public VenteManagement() {
        clients = new ArrayList<>();
        produits = new ArrayList<>();
        depots = new ArrayList<>();
        commandes = new ArrayList<>();
    }

    // Méthode pour ajouter un client
    public void ajouterClient(Client client) {
        clients.add(client);
    }

    // Méthode pour ajouter un produit
    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    // Méthode pour ajouter un dépôt
    public void ajouterDepot(Depot depot) {
        depots.add(depot);
    }

    // Méthode pour créer une commande
    public void creerCommande(Client client, Produit produit, int quantite) {
        Depot depot = trouverDepot(produit);
        if (depot != null && depot.getQuantiteDisponible() >= quantite) {
            double montantTotal = produit.getPrix() * quantite;
            Commande commande = new Commande(commandes.size() + 1, montantTotal, client);
            commandes.add(commande);
            client.ajouterCommande(commande);
            depot.reduireStock(quantite);
            System.out.println("Commande créée avec succès!");
        } else {
            System.out.println("Stock insuffisant pour cette commande.");
        }
    }

    // Méthode pour trouver un dépôt contenant le produit
    private Depot trouverDepot(Produit produit) {
        for (Depot depot : depots) {
            if (depot.getProduit() == produit) {
                return depot;
            }
        }
        return null;
    }

    // Méthode pour afficher toutes les commandes
    public void afficherToutesLesCommandes() {
        for (Commande commande : commandes) {
            commande.afficherDetails();
        }
    }

    // Méthode pour appliquer une remise à un produit
    public void appliquerRemiseProduit(Produit produit, double pourcentage) {
        double prixApresRemise = produit.appliquerRemise(pourcentage);
        System.out.println("Nouveau prix du produit " + produit.getNomProduit() + " après remise: " + prixApresRemise);
    }
}
