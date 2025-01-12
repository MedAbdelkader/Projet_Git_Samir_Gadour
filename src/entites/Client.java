package entites;

import java.util.List;

public class Client {
    private String nom;

    private String email;
    private List<Commande> commandes;

    // Constructeur paramétré
    public Client(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    // Méthode pour ajouter une commande à l'historique
    public void ajouterCommande(Commande commande) {
        commandes.add(commande);
    }

    // Méthode pour afficher les informations du client
    public void afficherInfo() {
        System.out.println("Nom: " + nom + ", Email: " + email);
    }

    public String getNom() {
        return nom;
    }
}
