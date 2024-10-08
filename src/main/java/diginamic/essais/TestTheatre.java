package diginamic.essais;

import diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("de la rue ", 100);
        theatre.inscrire(22, 15);
        theatre.inscrire(30, 15);
        theatre.inscrire(35, 15);
        theatre.inscrire(40, 15);
        System.out.println("Totale des client inscrit: " + theatre.getTotalClients());
        System.out.println("la recette totale : " + theatre.getRecetteTotale());

    }
}
