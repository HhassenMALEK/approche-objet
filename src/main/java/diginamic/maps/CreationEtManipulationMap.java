package diginamic.maps;

import java.util.HashMap;
import java.util.Map;

public class CreationEtManipulationMap {
    public static void main(String args[]) {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put (69, "Lyon");
        mapVilles.put(59, "Lile");

        for (Integer departement : mapVilles.keySet()) {
            System.out.println(departement);
        }
        for (Map.Entry<Integer, String> entry : mapVilles.entrySet()){
            String nomVille = entry.getValue();
            System.out.println(nomVille);
        }
        System.out.println("la taille de la map : "+ mapVilles.size());

    }
}
