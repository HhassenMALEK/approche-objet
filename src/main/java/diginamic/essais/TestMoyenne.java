package diginamic.essais;

import diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {

        CalculMoyenne c1 = new CalculMoyenne();
        c1.ajout(10);
        c1.ajout(3);
        c1.ajout(20);
        System.out.println("moyenne: " + c1.calcul());

        CalculMoyenne c2 = new CalculMoyenne();
        c2.ajout(30);
        c2.ajout(32);
        c2.ajout(90);
        System.out.println("moyenne: " + c2.calcul());
     }
}
