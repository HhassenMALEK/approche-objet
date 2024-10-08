package banque.entites;

public abstract class Operation {
    protected String date;
    protected double montant;

    public Operation(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }

    public String toString(){
        return "la date: " + date + ", le montant: " +  montant;
    }
    public String getDate() {
        return date;
    }

    public double getMontant() {
        return montant;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
    public abstract String getType();

}
