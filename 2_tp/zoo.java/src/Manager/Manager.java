package Manager;

import Controleur.Afficheur;
import Controleur.Saissiseur;
import biblio.*;

import java.util.List;
import java.util.Scanner;

public class Manager {
    private Saissiseur saisisseur;
    private Afficheur afficheur;
    private AnimalThèque animaltheque;
    private Scanner scanner;
    public Manager(){
        saisisseur = new Saissiseur();
        afficheur = new Afficheur();
        animaltheque = new AnimalThèque();
        scanner = new Scanner(System.in);
    }
    public void start() {

        Saissiseur saisisseur = new Saissiseur();
        Afficheur afficheur = new Afficheur();
        AnimalThèque animauxList = new AnimalThèque();
        scanner = new Scanner(System.in);
        int select = 1;

        while (select != 9) {
            System.out.println(" --> Welcome au zoo, que souhaitez-vous faire ?");
            System.out.println("\t 1 : Ajouter un animal normal.");
            System.out.println("\t 2 : Ajouter un oiseau.");
            System.out.println("\t 3 : Ajouter un animal a fourrure.");
            System.out.println("\t 4 : Afficher la liste des animaux.");
            System.out.println("\t 5 : Annoncer changement saison.");
            System.out.println("\t 6 : Supprimer animal.");
            System.out.println("\t 9 : Quitter");
            select = scanner.nextInt();


            switch (select) {
                case 1:
                    Animaux animaux = saisisseur.SaisisseurAnimauxNormaux();
                    animauxList.addAnimal(animaux);
                    break;
                case 2:
                    Oiseaux oiseaux = saisisseur.SaisisseurOiseau();
                    animauxList.addAnimal(oiseaux);
                    break;
                case 3:
                    Fourrures fourrures = saisisseur.SaisisseurFourrure();
                    animauxList.addAnimal(fourrures);
                    break;
                case 4:
                    afficheur.affichage(animauxList.getAnimauxList());
                    break;
                case 5:
                    Saison saison = saisisseur.SaisirSaison();
                    animauxList.changementSaison(saison);
                    break;
                case 6:
                    int id;
                    System.out.println("\t Entrer l'id de l animal");
                    id = scanner.nextInt();
                    Animaux a = animauxList.searchAnimal(id);
                    if (a == null){
                        break;
                    }
                    animauxList.delAnimal(a);
                    break;
                case 9:
                    System.out.println("Sorti\n");
                    break;
                default:
                    System.out.println("Saisis non valide\n");
                    break;
            }
        }
    }
}
