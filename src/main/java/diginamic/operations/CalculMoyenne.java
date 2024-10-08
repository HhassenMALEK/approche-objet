package diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
    private double[] valeurs;
    private int taille;

    public CalculMoyenne() {
        this.valeurs = new double[0];
        this.taille = 0;
    }

    public void ajout(double valeur) {
        valeurs = Arrays.copyOf(valeurs, taille + 1);
        valeurs[taille] = valeur;
        taille++;
    }
    public double calcul(){
        double somme = 0;
        for (double valeur : valeurs){
            somme += valeur;
        }
        return somme / taille;
    }


}
