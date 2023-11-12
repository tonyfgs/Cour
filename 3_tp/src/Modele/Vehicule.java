package Modele;

import java.io.Serializable;

public class Vehicule implements Serializable {

    private static final long serialVersionUID = 1L; // Assure une compatibilité de sérialisation

    private String plaque;
    private String marque;
    private String modele;
    private int anneeProd;

    public Vehicule( String marque,String modele,String plaque,  int anneeProd){
        this.plaque = plaque;
        this.marque = marque;
        this.modele = modele;
        this.anneeProd = anneeProd;
    }
    public String getPlaque() {
        return plaque;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getAnneeProd() {
        return anneeProd;
    }
    public String toString(){
        return "Vehicule de la marque " + this.marque + ", modele: " + this.modele + ", de l'annee " + Integer.toString(this.anneeProd) + ". Plaque:" + this.plaque;
    }
}
