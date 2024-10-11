package diginamic.maps;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        ArrayList<Pays> listPays = new ArrayList<>();

        listPays.add(new Pays("France", 65000000, "Europe"));
        listPays.add(new Pays("Allemagne", 80000000, "Europe"));
        listPays.add(new Pays("Belgique", 10000000," Europe"));
        listPays.add(new Pays("Russie", 150000000, "Asie"));
        listPays.add(new Pays("Chine", 1400000000, "Asie"));
        listPays.add(new Pays("Indonésie", 220000000, "Océanie,"));
        listPays.add(new Pays("Australie", 20000000, "Océanie"));

        HashMap<String, Integer> countPaysContinent = new HashMap<>();

        for (Pays pays : listPays){
            String continent = pays.getContinent();
            countPaysContinent.put(continent,countPaysContinent.getOrDefault(continent, 0)+1 );
        }

        Set<String> compteur = countPaysContinent.keySet();
        for (String continent :compteur ) {
            System.out.println("Continent: " + continent + ", Nombre de pays: " + countPaysContinent.get(continent));
        }

    }
}
