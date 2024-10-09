package liste;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<String>();
        Collections.addAll(liste, "Nantes", "Nice", "Carcassonne","Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");

        String villePlusLongue = "";
        int longeurVilleMax = 0;
        for(String ville : liste){
            int longeurVille = ville.length();
            if(longeurVilleMax < longeurVille){
                longeurVilleMax= longeurVille;
                villePlusLongue = ville;
            }
        }

        System.out.println("la ville qui a le  plus grand nombre de lettres: " + villePlusLongue + "qui a: "+longeurVilleMax+" lettres!");

        ArrayList<String> listeMaj = new ArrayList<String>();
        for(String ville : liste){
            listeMaj.add(ville.toUpperCase());

        }
        System.out.println("Liste des villes en majuscules : " + listeMaj);

        Iterator<String> iterator = liste.iterator();


        while(iterator.hasNext()){
            String ville = iterator.next();
            if(ville.startsWith("N")) {
                iterator.remove();
            }
        }
        System.out.println("Liste après suppression des villes commençant par 'N' : " + liste);
    }
}