package Utilitaire;

import Modele.VehiculeTheque;
import Modele.Vehicule;
public class Stub implements IImport{

    public static VehiculeTheque load(){
        VehiculeTheque vehiculeTheque = new VehiculeTheque();
        vehiculeTheque.add(new Vehicule("Merco", "Renault Clio", "ABC-123", 2019));
        vehiculeTheque.add(new Vehicule("Audi", "Harley Davidson", "XYZ-987", 2020));
        vehiculeTheque.add(new Vehicule("Renault", "Clio 5", "HIJ-456", 2018));

        // Retourne la collection de test
        return vehiculeTheque;
    }
}
