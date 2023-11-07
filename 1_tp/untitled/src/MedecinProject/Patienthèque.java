package MedecinProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Patienthèque {
    private List<Patient> listePatient;

    public Patienthèque(){
        listePatient = new ArrayList<Patient>();
    }

    public void addPatient(Patient patient){
        listePatient.add(patient);
    }

    @Override
    public String toString() {
        StringBuilder chaineDeCaractere = new StringBuilder();
        for (Patient patient : listePatient){
            chaineDeCaractere.append(patient.toString());
        }
        return chaineDeCaractere.toString();
    }
}
