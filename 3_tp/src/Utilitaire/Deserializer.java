package Utilitaire;

import java.io.*;
import Modele.VehiculeTheque;
public class Deserializer implements IImport, Serializable {


    public Deserializer(){
    }
    public VehiculeTheque Deserialised(String path) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path))) {
           VehiculeTheque vehiculeTheque = (VehiculeTheque) inputStream.readObject();
            return vehiculeTheque;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Fichier non trouvé: " + path, e);
        } catch (IOException e) {
            throw new RuntimeException("Erreur d'entrée/sortie lors de la désérialisation", e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Classe de l'objet désérialisé non trouvée", e);
        }

    }
}
