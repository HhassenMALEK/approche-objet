package diginamic.essais;

import static diginamic.operations.Operations.calcul;

public class TestOperations {
    public static void main(String[] args) {
        double a = 12;
        double b = 20;
        System.out.println("resultat de a + b : " + calcul(a, b, '+'));
        System.out.println("resultat de a - b : " + calcul(a, b, '-'));
        System.out.println("resultat de a * b : " + calcul(a, b, '*'));
        System.out.println("resultat de a / b : " + calcul(a, b, '/'));
    }
}
