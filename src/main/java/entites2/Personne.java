package entites2;

import entites.AdressePostale;

public class Personne {

    String nom;
    String prenom;
    public  AdressePostale adresse;

    public Personne(String nom, String prenom, AdressePostale adresse ){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;

    }
}

