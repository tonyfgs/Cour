package biblio;

public class Oiseaux extends Animaux {


    public Oiseaux(String nom, Zone zone){

        super(nom, zone);
    }

    @Override
    public void StartHibernation(){
        super.StartHibernation();
        System.out.println(this.nom + " migre vers le " + this.zone);
        this.setZone(Zone.Sud);
    }

    @Override
    public void EndHibernation(){
        super.EndHibernation();
        System.out.println(this.nom + " migre vers le " + this.zone);
        this.setZone(Zone.Nord);
    }

    @Override
    public String toString(){
        return this.nom + " est un oiseau avec l identifiant : " + this.id + " et se trouve actuellement dans la zone " + this.zone;
    }


}
