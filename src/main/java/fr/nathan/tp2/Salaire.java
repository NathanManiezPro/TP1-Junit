package fr.nathan.tp2;

public class Salaire {

    private double tauxHoraire;
    public Salaire(double tauxHoraire){
        this.tauxHoraire = tauxHoraire;
    }

    public void payer(int heures){
        double heuresMax = 151.67;
        final double heuresSupplémentaires = 1.25;
        if(heures>heuresMax) {
            tauxHoraire = getTauxHoraire() * heuresSupplémentaires;
        }gu
    }
    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

}
