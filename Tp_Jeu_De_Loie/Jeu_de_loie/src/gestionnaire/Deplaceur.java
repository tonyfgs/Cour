package gestionnaire;
import modele.Case;
import modele.Joueur;

public class Deplaceur {

    public Deplaceur(){}

    public void alternerPosition(Joueur joueurActuel, Joueur joueurSuivant){
        Joueur tmp = joueurActuel;
        joueurActuel.setCurrentCase(joueurSuivant.getCurrentCase());
        joueurSuivant.setCurrentCase(tmp.getCurrentCase());
    }

    public void deplacerJoueur(Case newCase, int nombreDeplacement, Joueur currentJoueur){
        if(newCase == null)
            return;
        if (newCase.getCurrentJoueur() != null){
            alternerPosition(currentJoueur, newCase.getCurrentJoueur());
        }
        currentJoueur.setCurrentCase(newCase);
    }
}
