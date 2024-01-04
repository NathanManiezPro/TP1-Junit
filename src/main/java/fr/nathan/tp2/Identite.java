package fr.nathan.tp2;

public class Identite {
    private String nom;
    private String prenom;
    private Adresse adresse;

    public Identite(String nom, String prenom, Adresse adresse){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    @Override
    public String toString() {
        return "Identite{" +
                "nom='" + this.nom + '\'' +
                ", prenom='" + this.prenom+ '\'' +
                ", adresse=" + this.adresse +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse() {
        this.adresse = adresse;
    }
}
