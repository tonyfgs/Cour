package main;

import MedecinProject.*;

import Utilitaire.Affichage;
import Utilitaire.SaisisseurPatient;

import java.util.List;

import static Utilitaire.Affichage.afficher;
import static Utilitaire.SaisisseurPatient.saisirPatient;


public class Main {
    public static void main(String[] args){
        Patienthèque lesPatient = new Patienthèque();
        for (int i = 0; i < 2; i++) {
            Patient patient = saisirPatient();
            lesPatient.addPatient(patient);
        }
        afficher(lesPatient.toString());
    }
}
