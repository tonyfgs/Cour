package biblio;

public class Animaux {

    protected int id;
    protected String nom;
    protected Zone zone;
    protected boolean hiberner;
    private static int compteur = 0;
    public Animaux(String nom,Zone zone){
        this.id = compteur++;
        this.nom = nom;
        this.zone = zone;
        hiberner = false;
    }

    public void StartHibernation(){
        setHiberner(true);
    }

    public void EndHibernation(){
        setHiberner(false);
    }
    public void StartCycleLife(Saison saison){
        if(saison == Saison.Hiver){
            StartHibernation();
        }
        else{
            EndHibernation();
        }
    }
    public String getNom(){
        return this.nom;
    }

    public int getId() {
        return id;
    }

    public Zone getZone() {
        return zone;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public boolean isHiberner() {
        return hiberner;
    }
    public void  setHiberner(boolean hiberner) {
        this.hiberner = hiberner;
    }

    public String toString(){
        return this.nom + " est un animal avec l identifiant : " + this.id + " et se trouve actuellement dans la zone " + this.zone;
    }
}
