package entites;

import entites2.Personne;

import java.security.spec.RSAOtherPrimeInfo;

public class TestPersonne {
    public static void main (String[] args){

        AdressePostale adr1 = new AdressePostale(12, "Rue du bocage", 44100, "Nantes");
        AdressePostale adr2 = new AdressePostale(12, "Rue de la République", 85600, "Les Herbiers");

        Personne personne1 = new Personne("MALEK", "Hassen", adr1);

        Personne personne2 = new Personne("MALEK", "Ilyes", adr2);

        personne1.afficher();

        personne1.setNom("girard");
        personne1.afficher();

        AdressePostale adr3 = new AdressePostale(12, "rue de la libérté", 75004, "PARIS");
        personne1.setAdresse(adr3);
        personne1.afficher();
        personne1.setPrenom("Anne Laure");
        personne1.afficher();

        /*personne1.modifierNom("GIRARD");
        personne1.modifierPrenom("Anne Laure");
        personne1.afficher();

        personne1.modifierAdressePostal(adr2);
        personne1.afficher();
        */

    }

}
