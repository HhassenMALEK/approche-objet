package diginamic.salaire;

public abstract  class Intervenant {
    protected String nom;
    protected String prenom;
    public Intervenant(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;

    }

    public void afficherDonnees() {

            System.out.println(getType() + " " + "Nom: " + nom + " " + "Prenom: " + prenom + " Montant: " + getSalaire() + "€");

    }
    public abstract String getType();


    public abstract double getSalaire();

    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
}
