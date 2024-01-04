package fr.nathan.tp2;

public class Salaire {

    private float tauxHoraire;
    public Salaire(float tauxHoraire){
        this.tauxHoraire = tauxHoraire;
    }

    public void payer(int heures){
    }
    public float getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(float tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

}
