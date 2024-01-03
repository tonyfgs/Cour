package modele;

public class Case {

    private Joueur currentJoueur;



    private int num;


    public Case(int num){
        currentJoueur = null;
        this.num = num;
    }


    public Joueur getCurrentJoueur() {
        return currentJoueur;
    }

    public void setCurrentJoueur(Joueur currentJoueur) {
        this.currentJoueur = currentJoueur;
    }

    public int getNum() {
        return num;
    }
    @Override
    public String toString(){

        if (currentJoueur == null){

            return "Case numéro" + getNum() + " ne contient aucun pion" ;
        }
        return "Case numéro" + getNum() + " contient le pion " + currentJoueur.getId() ;
    }
}
