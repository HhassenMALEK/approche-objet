package diginamic.chaines;

import diginamic.entites.Salarie;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";
        char premierCaractere = chaine.charAt(0);
        int tailleChaine = chaine.length();
        char caractere = ';';
        int index = chaine.indexOf(caractere);
        String portionChiane = chaine.substring(0, 15);
        String nomFamille = chaine.substring(0, index);
        String nomFamilleMaj = nomFamille.toUpperCase();
        String[] partiesChaine = chaine.split(";");

        System.out.println("Premier caractère: " + premierCaractere);
        System.out.println("la longueur de la chaine " + tailleChaine);
        System.out.println("l'index du carractére ';' est n° " + index);
        System.out.println("Voici une portion de la chaine entre l'index 0 et 15 : " + portionChiane);
        System.out.println(nomFamille);
        System.out.println(nomFamilleMaj);
        System.out.println(nomFamilleMaj.toLowerCase());

        for (int i = 0; i < partiesChaine.length; i++) {
            System.out.println("Partie " + i + ": " + partiesChaine[i]);
        }

        String partieNom = partiesChaine[0];
        String partiePrenom = partiesChaine[1];
        String partieSalaire = partiesChaine[2];



        partieSalaire = partieSalaire.replace(" ", "");
        double montantSalaire = Double.parseDouble(partieSalaire);

        Salarie salaire1 = new Salarie(partieNom, partiePrenom,montantSalaire );
        System.out.println(salaire1);
    }
}
