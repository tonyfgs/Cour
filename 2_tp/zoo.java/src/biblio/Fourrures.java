package biblio;

public class Fourrures  extends Animaux {

    private int densite;


    public Fourrures(String nom, Zone zone, int densite){
        super(nom,zone);
        this.densite = densite;
    }

    @Override
    public void StartHibernation(){
        super.StartHibernation();
        this.densite = this.densite*2;
        System.out.println(this.nom + " vois sont pelage augmenter " + this.densite);
    }

    @Override
    public void EndHibernation(){
        super.EndHibernation();
        this.densite = this.densite/2;
        System.out.println(this.nom + " vois sont pelage augmenter " + this.densite);
    }

    @Override
    public String toString(){
        if(!this.hiberner){
            return this.nom + " est un animal a furrure avec l identifiant : " + this.id + " et se trouve actuellement dans la zone " + this.zone
                    + ". Il possede une fourrure de densite " + this.densite + " et il n hiberne actuellement pas";
        }
        return this.nom + " est un animal a furrure avec l identifiant : " + this.id + " et se trouve actuellement dans la zone " + this.zone
                + ". Il possede une fourrure de densite " + this.densite + " et il hiberne";
    }
}
