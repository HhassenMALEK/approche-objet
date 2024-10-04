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
    public void afficher() {
        System.out.println(this.nom.toUpperCase());
        System.out.println(this.prenom);
        System.out.println(this.adresse);

    }

    public void modifierNom(String nouveauNom) {
            this.nom = nouveauNom;

    }
    public void modifierPrenom(String nouveauPrenom) {
        this.prenom = nouveauPrenom;
    }

    public void modifierAdressePostal(AdressePostale nouvelAdressePostal){
        this.adresse = nouvelAdressePostal;
    }
}

