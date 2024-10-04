package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main (String[] args){
        Personne personne1 = new Personne();
        personne1.nom = "MALEK";
        personne1.prenom = "Hassen";
        personne1.adresse.numeroRue = 12;
        personne1.adresse.libelleRue = "Rue du Bocage";
        personne1.adresse.codePostal = "44100";
        personne1.adresse.ville = "Nantes";


        Personne personne2 = new Personne();
        personne2.nom = "MALEK";
        personne2.prenom = "ilyes";
        personne2.adresse.numeroRue = 15;
        personne2.adresse.libelleRue = "Rue de la République";
        personne2.adresse.codePostal = "85000";
        personne2.adresse.ville = "Les Herbiers";

    }
}
