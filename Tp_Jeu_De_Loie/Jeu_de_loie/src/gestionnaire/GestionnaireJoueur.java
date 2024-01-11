package gestionnaire;

import modele.Joueur;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireJoueur {

    private  static int index = 0;

    private List<Joueur> joueurList;
    private Joueur currentJoueur;
    private int numberPion = 0;

    public GestionnaireJoueur(){
        joueurList = new ArrayList<Joueur>();

    }
    public void ajouterJoueur(){
        Joueur p = new Joueur(numberPion);
        joueurList.add(p);
        numberPion++;
        System.out.println(numberPion);
    }

    public Joueur switchCurrentPlayer(){
        index = (index +1)%joueurList.size();
        return joueurList.get(index);
    }

    public Joueur getCurrentJoueur(){
        return currentJoueur;
    }

    public Joueur InitaliseJoueur() {

        return joueurList.get(0);
    }
}
