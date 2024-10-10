package diginamic.maps;

import diginamic.ville.Ville;
import java.util.HashMap;
import java.util.Map;

public class MapVilles {
    public static void main(String[] args) {

        HashMap<String, Ville> mapVille = new HashMap<>();

        mapVille.put("Paris", new Ville("Paris", 2200000));
        mapVille.put ("Nantes", new Ville("Nantes", 400000));
        mapVille.put("Marseille", new Ville("Marseille", 520000));
        mapVille.put ("Toulouse", new Ville("Toulouse", 600000));

        String villeMoinsHabitants = null;
        int minHabitants = Integer.MAX_VALUE;
        System.out.println(" les ville avant la supression");
        for(Map.Entry<String, Ville> entry : mapVille.entrySet()){
            String nom = entry.getKey();
            Ville ville = entry.getValue();
            System.out.println(nom +" " +ville);
            if (ville.getNbHabs() < minHabitants){
                minHabitants = ville.getNbHabs();
                villeMoinsHabitants = ville.getNom();
            }
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("la ville qui a moin d'habitant c'est : "+villeMoinsHabitants);

        mapVille.remove(villeMoinsHabitants);
        System.out.println("-----------------------------------------------------------------");

        System.out.println("ville restante aprés supression");
        for (Map.Entry<String, Ville> entry : mapVille.entrySet()){
            String nom = entry.getKey();
            Ville ville = entry.getValue();
            System.out.println(nom +" " +ville);
        }



    }
}
