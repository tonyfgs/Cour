import java.util.Scanner;

import Controleur.Afficheur;
import Controleur.Saisisseur;
import Modele.Vehicule;
import Modele.VehiculeTheque;
import Utilitaire.Deserializer;
import Utilitaire.Exporcsv;
import Utilitaire.Serializer;
import Utilitaire.Stub;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;

        String cheminFichierSerialise = "vehicules.ser";
        String cheminFichierCSV = "vehicules.csv";

        VehiculeTheque vehiculeTheque = new VehiculeTheque();
        Saisisseur saisisseur = new Saisisseur();
        Afficheur afficheur = new Afficheur();
        choix = 1;
        while (choix != 9){
            System.out.println("Bienvenue dans l'application de gestion de véhicules !");
            System.out.println("Veuillez choisir une option :");
            System.out.println("1. Exporter la liste des véhicules (sérialisation)");
            System.out.println("2. Importer la liste des véhicules (désérialisation)");
            System.out.println("3. Exporter la liste des véhicules en CSV");
            System.out.println("4. Ajouter Vehicule");
            System.out.println("5. Afficher vehicule");

            System.out.print("Entrez votre choix (1-3) : ");
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    Serializer serializer = new Serializer();
                    try {
                        serializer.SerializerFicher(cheminFichierSerialise, vehiculeTheque);
                        System.out.println("La liste des véhicules a été sérialisée avec succès.");
                    } catch (Exception e) {
                        System.err.println("Erreur lors de la sérialisation : " + e.getMessage());
                    }
                    break;
                case 2:
                    Deserializer deserializer = new Deserializer();
                    try {
                        vehiculeTheque = deserializer.Deserialised(cheminFichierSerialise);
                        afficheur.AfficherVehicule(vehiculeTheque);
                    } catch (Exception e) {
                        System.err.println("Le fichier n'existe pas ou une erreur est survenue. Chargement des données du stub.");
                        vehiculeTheque = Stub.load();
                    }
                    System.out.println("La liste des véhicules a été importée avec succès.");
                    break;
                case 3:
                    Exporcsv exporcsv = new Exporcsv();
                    afficheur.AfficherVehicule(vehiculeTheque);
                    try {
                        exporcsv.ExportFichierCSV(cheminFichierCSV, vehiculeTheque);
                        System.out.println("La liste des véhicules a été exportée en CSV avec succès.");
                    } catch (Exception e) {
                        System.err.println("Erreur lors de l'exportation en CSV : " + e.getMessage());
                    }
                    break;
                case 4:
                    Vehicule vehicule = saisisseur.SaisirVehicule();
                    vehiculeTheque.add(vehicule);
                    break;
                case 5:
                    afficheur.AfficherVehicule(vehiculeTheque);
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez entrer un numéro entre 1 et 3.");
            }

        }
        scanner.close();
    }

}
