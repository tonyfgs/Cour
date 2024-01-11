package modele;

import gestionnaire.Deplaceur;
import gestionnaire.GestionnaireJoueur;

import java.util.ArrayList;
import java.util.List;

public class Jeu {


    private Plateau plateau;

    private GestionnaireJoueur gestionnaireJoueur;
    private Joueur currentJoueur;
    private Desimple de;

    private Deplaceur deplaceur;
    public Jeu(){
        plateau = new Plateau();
        de = new Desimple();
        deplaceur = new Deplaceur();
        gestionnaireJoueur = new GestionnaireJoueur();
        //initialisation des cases du plateau
        for (int i =1; i <= 64;i++){
            plateau.addCase(i);
        }

        // ajout joueur
        gestionnaireJoueur.ajouterJoueur();
        gestionnaireJoueur.ajouterJoueur();
        gestionnaireJoueur.ajouterJoueur();
        currentJoueur = gestionnaireJoueur.InitaliseJoueur();

    }

    public void jouer(){
        int val;
        val = lancerDe();
        System.out.println("Valeur dé " + val);
        if (val == 0){
            return;
        }
        CaseDeplacer(currentJoueur,val);
        currentJoueur = gestionnaireJoueur.switchCurrentPlayer();
    }

    public void CaseDeplacer(Joueur currentJoueur, int nombreDeplacement){
        System.out.println("Tour au joueur  " + currentJoueur);

        deplaceur.deplacerJoueur(plateau.rechercheCase(currentJoueur.getCurrentCase(),nombreDeplacement),currentJoueur);
    }


    public int lancerDe(){
        int val;
        return val = de.lancer();
    }


    public Plateau getPlateau() {
        return plateau;
    }




}
