package entites;

import entites2.Personne;

import java.security.spec.RSAOtherPrimeInfo;

public class TestPersonne {
    public static void main (String[] args){

        Personne personne1 = new Personne("MALEK", "Hassen", new AdressePostale(12, "Rue du bocage", 44100, "Nantes"));

        Personne personne2 = new Personne("MALEK", "Ilyes", new AdressePostale(12, "Rue de la République", 85600, "Les Herbiers"));


    }
}
