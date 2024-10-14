package diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {

        long debut = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100000; i++) {
            sb.append(i);
        }
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé avec StringBuilder : " + (fin - debut) + " millisecondes");


        long debutString = System.currentTimeMillis();
        String s = "";
        for (int i = 1; i <= 100000; i++) {
            s += i;
        }
        long finString = System.currentTimeMillis();
        System.out.println("Temps écoulé avec String et concaténation : " + (finString - debutString) + " millisecondes");
    }
}
