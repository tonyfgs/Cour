package Utilitaire;

import MedecinProject.Patient;

import java.util.Scanner;

public class SaisisseurPatient {

    public static Patient saisirPatient(){
        Scanner scan = new Scanner(System.in);
        Integer ageScan;
        String nomScan;
        String prenomScan;
        System.out.println("Saisissez un nom : ");
        nomScan = scan.next();
        System.out.println("Saisissez un prenom : ");
        prenomScan = scan.next();
        System.out.println("Saisissez un age : ");
        ageScan = scan.nextInt();
        return new Patient(nomScan, prenomScan, ageScan);
    }
}

