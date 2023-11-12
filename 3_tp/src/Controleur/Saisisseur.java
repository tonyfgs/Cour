package Controleur;

import Modele.Vehicule;
import Utilitaire.Serializer;

import java.io.Serializable;
import java.util.Scanner;

public class Saisisseur implements Serializable {

    public Saisisseur(){

    }


    public Vehicule SaisirVehicule(){
        Scanner scanner = new Scanner(System.in);
        String plaque;
        String marque;
        String modele;
        int anneeProd;

        System.out.println("Saisir Marque");
        marque = scanner.next();
        System.out.println("Saisir Modele");
        modele = scanner.next();
        System.out.println("Saisir Plaque");
        plaque = scanner.next();
        System.out.println("Saisir Annee de Production");
        anneeProd = scanner.nextInt();
        Vehicule vehicule = new Vehicule(marque,modele,plaque,anneeProd);
        return vehicule;
    }
}
