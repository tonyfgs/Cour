package Controleur;

import biblio.*;

import java.util.Scanner;

public class Saissiseur {

    private Scanner scanner;

    public Saison SaisirSaison(){
        Saison saison;
        System.out.println("Saisissez une saison : ");
        scanner = new Scanner(System.in);
        saison = Saison.valueOf(scanner.next());
        return saison;
    }
    public Animaux SaisisseurAnimauxNormaux() {
        String nom;
        System.out.println("Saisissez un nom : ");
        scanner = new Scanner(System.in);
        nom= scanner.next();
        return new Animaux(nom, Zone.Nord);
    }

    public Fourrures SaisisseurFourrure() {
        String nom;
        int densite;
        System.out.println("Saisissez un nom : ");
        scanner = new Scanner(System.in);
        nom= scanner.next();
        System.out.println("Saisissez la densité de la  fourrure : ");
        scanner = new Scanner(System.in);
        densite= scanner.nextInt();
        return new Fourrures(nom, Zone.Nord,densite);
    }

    public Oiseaux SaisisseurOiseau() {
        String nom;
        System.out.println("Saisissez un nom : ");
        scanner = new Scanner(System.in);
        nom= scanner.next();
        return new Oiseaux(nom, Zone.Nord);
    }
}