package modele;

import gestionnaire.Deplaceur;

import java.util.ArrayList;
import java.util.List;

public class Jeu {

    private  static int index = 0;
    private int numberPion = 0;
    private List<Joueur> joueurList;

    private Plateau plateau;

    private Joueur currentJoueur;

    private Desimple de;

    private Deplaceur deplaceur;
    public Jeu(){
        joueurList = new ArrayList<Joueur>();
        plateau = new Plateau();
        de = new Desimple();
        deplaceur = new Deplaceur();

        //initialisation des cases du plateau
        for (int i =0; i <= 63;i++){
            plateau.addCase(i);
        }

        // ajout joueur
        ajouterJoueur();
        ajouterJoueur();
        ajouterJoueur();
        currentJoueur = joueurList.get(0);
    }

    public void jouer(){
        int val;
        val = lancerDe();
        System.out.println("Valeur dé " + 2);
        if (val == 0){
            return;
        }
        CaseDeplacer(currentJoueur,2);
        currentJoueur = switchCurrentPlayer();
    }

    public void CaseDeplacer(Joueur currentJoueur, int nombreDeplacement){
        System.out.println("Tour au joueur  " + currentJoueur);

        deplaceur.deplacerJoueur(plateau.rechercheCase(currentJoueur.getCurrentCase(),nombreDeplacement),currentJoueur);
    }
    public void ajouterJoueur(){
        Joueur p = new Joueur(numberPion);
        joueurList.add(p);
        numberPion++;
    }

    public int lancerDe(){
        int val;
        return val = de.lancer();
    }

    private Joueur switchCurrentPlayer(){
        index = (index +1)%joueurList.size();
        return joueurList.get(index);
    }

    public Plateau getPlateau() {
        return plateau;
    }




}
