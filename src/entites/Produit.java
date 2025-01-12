package entites;

public class Produit {
    private String nomProduit;
    private double prix;
    private String categorie;

    // Constructeur paramétré
    public Produit(String nomProduit, double prix, String categorie) {
        this.nomProduit = nomProduit;
        this.prix = prix;
        this.categorie = categorie;
    }

    // Méthode pour afficher les détails du produit
    public void afficherDetails() {
        System.out.println("Produit: " + nomProduit + ", Prix: " + prix + ", Catégorie: " + categorie);
    }

    // Méthode pour appliquer une remise au produit
    public double appliquerRemise(double pourcentage) {
        return prix - (prix * pourcentage / 100);
    }

    // Méthode pour obtenir le prix du produit
    public double getPrix() {
        return prix;
    }
    public String getNomProduit() {
        return nomProduit;
    }
}
