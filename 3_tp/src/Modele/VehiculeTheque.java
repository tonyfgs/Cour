package Modele;

import Utilitaire.IExport;
import Utilitaire.IImport;

import java.util.ArrayList;
import java.util.List;

public class VehiculeTheque implements IExport, IImport {
    private static final long serialVersionUID = 1L; // Assure une compatibilité de sérialisation

    private List<Vehicule> vehiculeList;

    public VehiculeTheque(){
        this.vehiculeList = new ArrayList<Vehicule>();
    }

    public List<Vehicule> getVehiculeTheque(){
        return this.vehiculeList;
    }

    public void add(Vehicule vehicule){
        vehiculeList.add(vehicule);
    }

    public StringBuilder toCSV(){
        StringBuilder sb = new StringBuilder();
        for (Vehicule v : vehiculeList){
            sb.append(v.toString());
        }
        return sb;
    }

}
