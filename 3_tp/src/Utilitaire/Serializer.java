package Utilitaire;

import Modele.Vehicule;
import Modele.VehiculeTheque;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializer implements IExport , Serializable {

    private String path;

    private VehiculeTheque vehiculeTheque;

    public Serializer (String path){
        this.path = path;
    }

    public void SerializerFicher(String path, VehiculeTheque vehiculeTheque){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(this.path))){
            out.writeObject(vehiculeTheque);
        }
        catch (IOException e){

        }

    }


}
