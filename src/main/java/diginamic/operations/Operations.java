package diginamic.operations;

public class Operations {
    public static double calcul(double a, double b, char operateur) {
        double result = 0;
        if (operateur == '+') {
            result = a + b;
        } else if (operateur == '-') {
            result = a - b;
        } else if (operateur == '*') {
            result = a * b;
        } else if (operateur == '/') {

            result = a / b;
        }
        return result;
    }
}