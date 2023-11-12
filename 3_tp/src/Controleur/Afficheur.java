package Controleur;

import Modele.Vehicule;
import Modele.VehiculeTheque;

public class Afficheur {

    public Afficheur(){

    }

    public void AfficherVehicule(VehiculeTheque vehiculeTheque){
        if (vehiculeTheque == null){
            System.out.println("Liste Vide");
        }
        for (Vehicule v : vehiculeTheque.getVehiculeTheque()){
            System.out.println(v);
        }
    }
}
