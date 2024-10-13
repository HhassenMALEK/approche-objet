package diginamic.automates;

import java.util.Random;

public class JeuDeLaVie {
    private int[][] cellule;
    private int ligne;
    private int colonne;

    public JeuDeLaVie(int ligne, int colonne) {
        this.ligne = ligne;
        this.colonne = colonne;
        cellule = new int[ligne][colonne];
    }

    public int[][] getCellule() {
        return cellule;
    }

    public int getLigne() {
        return ligne;
    }

    public int getColonne() {
        return colonne;
    }

    public void initialisationCellulesVivantes(int probCelVivante) {
        Random random = new Random();
        for (int i = 0; i < ligne; i++) {
            for (int j = 0; j < colonne; j++) {
                cellule[i][j] = random.nextInt(100) < probCelVivante ? 1 : 0;
            }
        }
    }

    public void nouvelleGeneraion() {
        int[][] nouvelleCellule = new int[ligne][colonne];

        for (int i = 0; i < ligne; i++) {
            for (int j = 0; j < colonne; j++) {
                int voisinsVivants = nbrVoisinsVivants(i, j);
                if (cellule[i][j] == 1) {
                    if (voisinsVivants < 2 || voisinsVivants > 3) {
                        nouvelleCellule[i][j] = 0;
                    } else {
                        nouvelleCellule[i][j] = 1;
                    }
                } else {
                    if (voisinsVivants == 3) {
                        nouvelleCellule[i][j] = 1;
                    }
                }
            }
        }
        cellule = nouvelleCellule;
    }

    private int nbrVoisinsVivants(int ligne, int colonne) {
        int nbrVoisins= 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                int voisinLigne = ligne + i;
                int voisinColonne = colonne + j;
                if (voisinLigne >= 0 && voisinLigne < cellule.length && voisinColonne >= 0 && voisinColonne < cellule[0].length) {
                    nbrVoisins+= cellule[voisinLigne][voisinColonne];
                }
            }
        }
        return nbrVoisins;
    }

}
