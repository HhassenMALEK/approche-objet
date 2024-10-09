package liste;

import java.util.ArrayList;

public class CreateListe {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList();
            for (int i = 1; i <= 100; i++){
                liste.add(i);
            }
        System.out.println(liste);

    }
}
