package Utilitaire;

import Modele.Vehicule;
import Modele.VehiculeTheque;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializer implements IExport , Serializable {

    private VehiculeTheque vehiculeTheque;

    public Serializer (){

    }

    public void SerializerFicher(String path, VehiculeTheque vehiculeTheque){
        File file = new File(path);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("Fichier créé : " + file.getName());
                } else {
                    System.err.println("Le fichier n'a pas pu être créé.");
                    return;
                }
            } catch (IOException e) {
                System.err.println("Une erreur s'est produite lors de la création du fichier.");
                return;
            }
        }
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(vehiculeTheque);
        } catch (IOException e) {
            System.err.println("Une erreur s'est produite lors de l'écriture de l'objet dans le fichier.");
        }

    }


}
