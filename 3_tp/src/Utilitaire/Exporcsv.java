package Utilitaire;

import Modele.Vehicule;
import Modele.VehiculeTheque;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.io.Serializable;

public class Exporcsv implements IExport {

        public Exporcsv(){

        }

        public void ExportFichierCSV(String path, VehiculeTheque vehiculeTheque){
            try (PrintWriter printWriter = new PrintWriter(new FileWriter(path))) {
                // Écrire l'en-tête du fichier CSV
                printWriter.println("Type,Modèle,Immatriculation,Année");

                // Écrire les données de chaque véhicule
                for (Vehicule vehicule : vehiculeTheque.getVehiculeTheque()) {
                    String ligne = String.format("%s,%s,%s,%d",
                            vehicule.getMarque(),
                            vehicule.getModele(),
                            vehicule.getPlaque(),
                            vehicule.getAnneeProd());
                    printWriter.println(ligne);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
}
