package diginamic.entites;

public class Theatre {
    private String nom;
    private int capaciteMax;
    private int totalClients;
    private double recetteTotale;
    public Theatre(String nom, int capaciteMax){
        this.nom = nom;
        this. capaciteMax = capaciteMax;
        this.totalClients = 0;
        this.recetteTotale = 0;
    }
    public void inscrire(int nbrClients, double prixPlace){
        if(totalClients +  nbrClients <= capaciteMax){
            totalClients += nbrClients;
            recetteTotale += totalClients * prixPlace;
        }else {
            System.out.println("Erreur : La capacité maximale du théâtre est atteinte.");
        }

    }

    public double getRecetteTotale() {
        return recetteTotale;
    }

    public int getTotalClients() {
        return totalClients;
    }
        @Override
        public String toString () {
            return "Théâtre : " + nom + ", Capacité maximale : " + capaciteMax +
                    ", Total de clients inscrits : " + totalClients +
                    ", Recette totale : " + recetteTotale;

    }
}
