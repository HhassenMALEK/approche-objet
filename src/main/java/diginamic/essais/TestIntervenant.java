package diginamic.essais;

import diginamic.salaire.Pigiste;
import diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {

        Salarie salarie = new Salarie("Arnaud", "DEFONTAINE", 2500);
      salarie.afficherDonnees();

        Pigiste pigiste =new Pigiste("Maxime", "DELATUILLERIE", 25, 80);
       pigiste.afficherDonnees();
    }
}
