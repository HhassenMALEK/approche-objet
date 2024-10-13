package diginamic.maison;

public abstract class Piece {
   String nom;
    protected double superficie;
    protected int numeroEtage;

    public Piece(String nom, double superficie, int numeroEtage){
        this.nom = nom;
        if(superficie <= 0){
            throw new IllegalArgumentException("la superficie ne peut étre iférieur à 0");
        }
        if(numeroEtage<0){
            throw new IllegalArgumentException("le numéro d'etage ne peut pas étre inférieur à 0");
        }
        this.superficie = superficie;
        this.numeroEtage = numeroEtage;
    }
    public String getNom(){
        return nom;
    }
    public double getSuperficie() {

        return superficie;
    }

    public int getNumeroEtage() {

        return numeroEtage;


    }
}
