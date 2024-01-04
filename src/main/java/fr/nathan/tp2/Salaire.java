package fr.nathan.tp2;

public class Salaire  {

    private double tauxHoraire;
    public Salaire(double tauxHoraire){
        this.tauxHoraire = tauxHoraire;
    }

    public double payer(double heures){
        double debutDesHeuresSupplementaires = 151.67;
        double tauxSupplementaires = 1.25;

        double heuresNormales = Math.min(heures, debutDesHeuresSupplementaires);
        double heuresSupplementaires = Math.max(heures - debutDesHeuresSupplementaires,0);

        double salaire = (heuresNormales * tauxHoraire) +
                (heuresSupplementaires * tauxHoraire * (tauxSupplementaires));

        return salaire;


    }
    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

}
