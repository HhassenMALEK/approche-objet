package diginamic.salaire;

public class Pigiste extends Intervenant{
    int nbrJourTravailles;
    double montantJournalier;

    public Pigiste(String nom, String prenom, int nbrJoursTravilles, double montantJournalier){
        super(nom, prenom);
        this.nbrJourTravailles = nbrJoursTravilles;
        this.montantJournalier = montantJournalier;
    }
    @Override
    public String getType(){
        return "Pigiste";
    }
    public double getSalaire(){
        return nbrJourTravailles * montantJournalier;
    }
}
