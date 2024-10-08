package diginamic.salaire;

public class Salarie extends Intervenant{
    private double salaireMensuel;

    public Salarie(String nom, String prenom, double salaireMensuel){
        super(nom, prenom);
        this.salaireMensuel = salaireMensuel;
    }
    @Override
    public String getType(){
        return "Salarié";
    }



    @Override
    public double getSalaire() {
        return salaireMensuel;
    }

}
