package diginamic.essais;

import diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Maison maison = new Maison();
        maison.ajouterPiece(new Chambre("ChambreParentale", 9, 1));
        maison.ajouterPiece(new Wc("Wc RDC", 5, 0));
        maison.ajouterPiece(new Cuisine("Cuisine", 5, 0));
        maison.ajouterPiece(new SalleDeBain("Salle de bain", 8, 0));
        maison.ajouterPiece(new Wc("Wc de l'étage", 4, 1));
        maison.ajouterPiece(new Chambre("Chambre enfant1", 10, 1));
        maison.ajouterPiece(new Chambre("Chambre enfant2", 11, 1));
        maison.ajouterPiece(new Salon("Salon", 13, 1));


    }
}
