package biblio;

import Controleur.Afficheur;
import Controleur.Saissiseur;

import java.util.ArrayList;
import java.util.List;

public class  AnimalThèque {



    private List<Animaux> animauxList;

        public AnimalThèque(){
            animauxList = new ArrayList<Animaux>();
        }

    public List<Animaux> getAnimauxList() {
        return animauxList;
    }
    public void addAnimal(Animaux animaux){
            animauxList.add(animaux);
        }

    public void changementSaison(Saison saison){
        for (Animaux a : animauxList){
            a.StartCycleLife(saison);
        }
    }

    public void delAnimal(Animaux animaux){
            animauxList.remove(animaux);
            System.out.println("\t Animal supprime");
    }

    public Animaux searchAnimal(int id){
        for (Animaux animaux : animauxList) {
            if (animaux.getId() == id) {
                return animaux;
            }
        }
        System.out.println("\t animal inconnue");
        return null;
    }

}
