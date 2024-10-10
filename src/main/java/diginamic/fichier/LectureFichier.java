package diginamic.fichier;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws Exception {

        Path pathOrigineFile = Paths.get("/home/hmalek/Documents/01-Diginamic/01parcours/07 - Java approche POO/TP/recensement.csv");
        List<String> communes = Files.readAllLines(pathOrigineFile);

        List<Communes> lesCommunes = new ArrayList<>();

        for (int i = 1; i < communes.size(); i++) {
            String commune = communes.get(i);
            String[] tokens = commune.split(";");
            if (tokens.length >= 10) {
                String nom = tokens[6];
                String codeDepartement = tokens[2];
                String nomRegion = tokens[1];
                int populationTotale = Integer.parseInt(tokens[9].replace(" ", ""));

                Communes communeObject = new Communes(nom, codeDepartement, nomRegion, populationTotale);
                lesCommunes.add(communeObject);
            }
        }

        Path patOutFile1 = Paths.get("/home/hmalek/Documents/01-Diginamic/02-tp_diginamic/fichiers/recensementCommunes.csv");
        List<String> lignesSortie = new ArrayList<>();

        for (Communes commune : lesCommunes) {
            String ligne = commune.getNom() + ", " + commune.getCodeDepartement() + ", " + commune.getNomRegion() + ", " + commune.getPopulationTotale();
            lignesSortie.add(ligne);
        }

        Files.write(patOutFile1, lignesSortie);

        System.out.println("Traitement terminé avec succès");
    }
}