package entites;

public class Depot {
    private String nomDepot;
    private int quantiteDisponible;
    private Produit produit;

    // Constructeur paramétré
    public Depot(String nomDepot, int quantiteDisponible, Produit produit) {
        this.nomDepot = nomDepot;
        this.quantiteDisponible = quantiteDisponible;
        this.produit = produit;
    }

    // Méthode pour afficher les informations du dépôt
    public void afficherInfo() {
        System.out.println("Dépôt: " + nomDepot + ", Quantité disponible: " + quantiteDisponible +
                ", Produit: " + produit.getNomProduit());
    }

    // Méthode pour réduire la quantité en stock
    public void reduireStock(int quantite) {
        if (quantiteDisponible >= quantite) {
            quantiteDisponible -= quantite;
        } else {
            System.out.println("Stock insuffisant");
        }
    }

    public int getQuantiteDisponible() {
        return quantiteDisponible;
    }

    public Produit getProduit() {
        return produit;
    }
}
