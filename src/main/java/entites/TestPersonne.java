package entites;

import entites2.Personne;

import java.security.spec.RSAOtherPrimeInfo;

public class TestPersonne {
    public static void main (String[] args){

        AdressePostale adr1 = new AdressePostale(12, "Rue du bocage", 44100, "Nantes");
        AdressePostale adr2 = new AdressePostale(12, "Rue de la République", 85600, "Les Herbiers");

        Personne personne1 = new Personne("MALEK", "Hassen", adr1);

        Personne personne2 = new Personne("MALEK", "Ilyes", adr2);
    }
}
