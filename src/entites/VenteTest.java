package entites;

public class VenteTest {
    public static void main(String[] args) {
    // Création des objets produits
    Produit produit1 = new Produit("Ordinateur", 1000.0, "Informatique");
    Produit produit2 = new Produit("Téléphone", 500.0, "Électronique");

    // Création des objets clients
    Client client1 = new Client("Jean Dupont", "jean@example.com");
    Client client2 = new Client("Marie Martin", "marie@example.com");

    // Création des objets dépôt
    Depot depot1 = new Depot("Entrepôt A", 20, produit1);
    Depot depot2 = new Depot("Entrepôt B", 15, produit2);

    // Création de la gestion des ventes
    VenteManagement venteManagement = new VenteManagement();

    // Ajouter des produits, clients et dépôts
    venteManagement.ajouterProduit(produit1);
    venteManagement.ajouterProduit(produit2);
    venteManagement.ajouterClient(client1);
    venteManagement.ajouterClient(client2);
    venteManagement.ajouterDepot(depot1);
    venteManagement.ajouterDepot(depot2);

    // Créer des commandes
    venteManagement.creerCommande(client1, produit1, 2);
    venteManagement.creerCommande(client2, produit2, 5);

    // Afficher les commandes
    venteManagement.afficherToutesLesCommandes();

    // Appliquer une remise
    venteManagement.appliquerRemiseProduit(produit1, 10);
}
}

