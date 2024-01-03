package modele;

import gestionnaire.Deplaceur;

import java.util.ArrayList;
import java.util.List;

public class Jeu {

    private int index;
    private int numberPion = 0;
    private List<Joueur> joueurList;

    private Plateau plateau;

    private Joueur currentJoueur;

    private Desimple de;

    private Deplaceur deplaceur;
    public Jeu(){
        joueurList = new ArrayList<Joueur>();
        plateau = new Plateau();
        for (int i =0; i <= 63;i++){
            plateau.addCase(i);
        }
        ajouterJoueur();
        ajouterJoueur();
        ajouterJoueur();
        index = 0;
        currentJoueur = joueurList.get(index);
        plateau.getCaseList().get(0).setCurrentJoueur(currentJoueur);
    }

    public void jouer(){
        int val;
        val = lancerDe();
        CaseDeplacer(currentJoueur,val);
        currentJoueur = joueurList.get(index++);
    }

    public void CaseDeplacer(Joueur currentJoueur, int nombreDeplacement){
        deplaceur.deplacerJoueur(plateau.rechercheCase(currentJoueur.getCurrentCase(),nombreDeplacement),nombreDeplacement,currentJoueur);
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


    public Plateau getPlateau() {
        return plateau;
    }




}
