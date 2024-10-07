package entites;

public class TestAdressePostale {
     public static void main (String[] args){

         AdressePostale adr1 = new AdressePostale(12, "Rue du bocage", 44100, "Nantes");

         AdressePostale adr2 = new AdressePostale(18,"Rue de la République", 85600, "Les Herbiers");
        System.out.println(adr2);
     }
}
