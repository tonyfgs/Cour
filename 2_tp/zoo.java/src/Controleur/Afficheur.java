package Controleur;

import biblio.Animaux;

import java.util.List;

public class Afficheur {
    public Afficheur() {}
    public void afficherAnimal(Animaux a){
        System.out.print(a);
        System.out.println();
    }

    public void affichage(List<Animaux> animauxList){
        int tmp = 1;
        for (Animaux a : animauxList){
            System.out.println(tmp + "- ");
            afficherAnimal((a));
            tmp++;
        }
    }
}
