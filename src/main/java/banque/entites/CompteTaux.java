package banque.entites;

public class CompteTaux extends Compte{
    private int tauxRenum;
    public CompteTaux(String numCompt, double soldCompt, int tauxRenum){
        super(numCompt, soldCompt);
        this.tauxRenum = tauxRenum;
    }
    public int getTauxRenum(){
        return this.tauxRenum;
    }
    public void setTauxRenum(int tauxRenum){
        this.tauxRenum = tauxRenum;
    }
    public String toString(){
        return super.toString() + " et le taux de rémunération est : " + tauxRenum + "%";
    }

}
