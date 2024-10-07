package banque.entites;

public class Compte {
    String numCompt;
    double soldCompt;
    public Compte(String numCompt, double soldCompt){
        this.numCompt = numCompt;
        this.soldCompt = soldCompt;
    }

    @Override
    public String toString() {
        return  "numéro de compte c'est " +numCompt + " " + "et le solde de compte est : "+soldCompt ;
    }

    public String getNumCompt() {
        return numCompt;
    }

    public double getSoldCompt() {
        return soldCompt;
    }

    public void setNumCompt(String numCompt) {
        this.numCompt = numCompt;
    }

    public void setSoldCompt(double soldCompt) {
        this.soldCompt = soldCompt;
    }
}

