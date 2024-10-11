package diginamic.maps;

public class Pays {
    private String nom ;
    private int nbdHabitant;
    private String continent;

    public Pays(String nom, int nbdHabitant, String continent) {
        this.nom = nom;
        this.nbdHabitant = nbdHabitant;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public int getNbdHabitant() {
        return nbdHabitant;
    }

    public String getContinent() {
        return continent;
    }
}
