package diginamic.essais;

import diginamic.automates.JeuDeLaVie;

import java.util.Scanner;

public class JeuDeLaVieTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre de lignes : ");
        int lignes = scanner.nextInt();

        System.out.print("Entrez le nombre de colonnes : ");
        int colonnes = scanner.nextInt();

        System.out.print("Entrez le pourcentage de cellules vivantes (0-100) : ");
        int probCelluleVivante = scanner.nextInt();

        JeuDeLaVie jeu = new JeuDeLaVie(lignes, colonnes);
        jeu.initialisationCellulesVivantes(probCelluleVivante);


        for (int generation = 0; generation < 10; generation++) {
            System.out.println("Génération " + (generation + 1) + ":");
            afficherCellules(jeu);
            jeu.nouvelleGeneraion();
            System.out.println();
        }

        scanner.close();
    }

    private static void afficherCellules(JeuDeLaVie jeu) {
        for (int i = 0; i < jeu.getLigne(); i++) {
            for (int j = 0; j < jeu.getColonne(); j++) {
                System.out.print(jeu.getCellule()[i][j] == 1 ? "■ " : "□ ");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Le thread a été interrompu");
                }
            }
            System.out.println();
        }
    }
}

