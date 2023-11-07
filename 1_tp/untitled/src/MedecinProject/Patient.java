package MedecinProject;

public record Patient(String nom, String prenom, int age) {


    @Override
    public String nom() {
        return nom;
    }

    @Override
    public String prenom() {
        return prenom;
    }

    @Override
    public int age() {
        return age;
    }

    @Override
    public String toString() {
        return "- Patient :" + nom() + " " + prenom() + " agé de : " + age() + " ans";
    }
}