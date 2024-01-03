package modele;

public class Joueur {

    private int id;

    private Case currentCase;
    public Joueur(int id) {
        this.id = id;

    }

    public int getId() {
        return id;
    }



    public Case getCurrentCase() {
        return currentCase;
    }

    public void setCurrentCase(Case currentCase) {
        this.currentCase = currentCase;
        if (currentCase == null){
            return;
        }
        currentCase.setCurrentJoueur(this);
    }

    @Override
    public String toString() {
        return "Joueur" +
                "id " + id;
    }
}