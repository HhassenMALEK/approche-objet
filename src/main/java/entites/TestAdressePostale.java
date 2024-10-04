package entites;

public class TestAdressePostale {
     public static void main (String[] args){
         AdressePostale adr1 = new AdressePostale();
         adr1.numeroRue = 12;
         adr1.libelleRue= "Rue du Bocage";
         adr1.codePostal = "44100";
         adr1.ville = "Nantes";

         AdressePostale adr2 = new AdressePostale();
         adr1.numeroRue = 15;
         adr1.libelleRue= "Rue de la République";
         adr1.codePostal = "85600";
         adr1.ville = "Les Herbiers";

     }
}
