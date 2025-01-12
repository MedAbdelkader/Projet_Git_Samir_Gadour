package entites;

public class Commande {
    private int idCommande;
    private double montantTotal;
    private Client client;
    private String status;

    // Constructeur paramétré
    public Commande(int idCommande, double montantTotal, Client client) {
        this.idCommande = idCommande;
        this.montantTotal = montantTotal;
        this.client = client;
        this.status = "En attente";
    }

    // Méthode pour afficher les détails de la commande
    public void afficherDetails() {
        System.out.println("ID Commande: " + idCommande + ", Montant Total: " + montantTotal +
                ", Client: " + client.getNom() + ", Statut: " + status);
    }

    // Méthode pour modifier le statut de la commande
    public void modifierStatut(String nouveauStatut) {
        this.status = nouveauStatut;
    }

    // Méthode pour obtenir le montant total de la commande
    public double getMontantTotal() {
        return montantTotal;
    }
}
