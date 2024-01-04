package fr.nathan.tp2;

public class Salarie {
    private Salaire salaire;
    private Identite identite;



    public Salarie(Salaire salaire, Identite identite){
        this.identite = identite;
        this.salaire = salaire ;
    }
    public void demenager(Adresse nouvelleadresse){
    this.identite.setAdresse();

    }



    public String travailler(){
        return "Le salarié "+ this.identite.getPrenom() + " " + this.identite.getNom() +
                " a travaillé 151,67 heures et a perçu " + this.salaire.payer(151.67) + " euros";

    }
    public void augmenter(double pourcentageAugmentation) {
        if (pourcentageAugmentation > 0) {
            double augmentation = (pourcentageAugmentation / 100) * this.salaire.getTauxHoraire();
            this.salaire.setTauxHoraire(pourcentageAugmentation);
            System.out.println("Le salaire a été augmenté de " + pourcentageAugmentation + "%. Nouveau salaire : " + this.salaire.getTauxHoraire());
        } else {
            System.out.println("Veuillez fournir un pourcentage d'augmentation positif.");
        }
    }
    public Salaire getSalaire() {
        return salaire;
    }

    public void setSalaire(Salaire salaire) {
        this.salaire = salaire;
    }

    public Identite getIdentite() {
        return identite;
    }

    public void setIdentite(Identite identite) {
        this.identite = identite;
    }
}
