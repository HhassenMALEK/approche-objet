package liste;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {
    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>();
        Collections.addAll(liste, -1, 5, -7, -3, -2, 4, -8, -5);
        System.out.println(liste);

        System.out.println("la taille de la liste: " + liste.size());

        int max = Collections.max(liste);
        int min = Collections.min(liste);
        System.out.println("le plus grand élément de la liste: " + max);

        liste.remove(Integer.valueOf(min));
        System.out.println("la liste avec petit élément: "+min+" supprimé: " +liste) ;

//        for(int valeurNegative : liste){
//            if(valeurNegative< 0){
//                int valeurPosetive =  Math.abs(valeurNegative);
//                System.out.println(valeurNegative);
//                System.out.println(valeurPosetive);
//            }
//        }


        for(int i = 0 ; i < liste.size(); i++){
            int valeurListe = liste.get(i);
            System.out.println("Valeur actuelle: " + valeurListe);

            if(valeurListe < 0){
                int valeurPositive = Math.abs(valeurListe);
                System.out.println("Valeur convertie: " + valeurPositive);

                liste.set(i, valeurPositive);
                System.out.println("Liste modifiée: " + liste);
            }

        }

    }

}
