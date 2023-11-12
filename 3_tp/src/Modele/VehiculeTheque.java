package Modele;

import java.util.ArrayList;
import java.util.List;

public class VehiculeTheque {

    private List<Vehicule> vehiculeList;

    public VehiculeTheque(){
        this.vehiculeList = new ArrayList<Vehicule>();
    }

    public List<Vehicule> getVehiculeTheque(){
        return this.vehiculeList;
    }

}
