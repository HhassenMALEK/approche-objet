package diginamic.maison;

public abstract class Piece {
    protected double superficie;
    protected int numeroEtage;

    public Piece(double superficie, int numeroEtage){
        this.superficie = superficie;
        this.numeroEtage = numeroEtage;
    }

    public double getSuperficie() {
        return superficie;
    }

    public int getNumeroEtage() {
        return numeroEtage;
    }
}
