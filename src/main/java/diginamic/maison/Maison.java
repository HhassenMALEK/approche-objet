package diginamic.maison;

import java.util.ArrayList;
import java.util.List;

public class Maison {
    private List<Piece> pieces;

    public Maison() {
        pieces = new ArrayList<>();
    }

    public void ajouterPiece(Piece piece) {
        if (piece != null) {
            pieces.add(piece);
        } else {
            throw new IllegalArgumentException("La pièce ne peut pas être nulle.");
        }
    }

    public double calculerSuperficieEtage(int numeroEtage) {
        double superficieEtage = 0.0;
        for (Piece piece : pieces) {
            if (piece.getNumeroEtage() == numeroEtage) {
                superficieEtage += piece.getSuperficie();
            }
        }
        return superficieEtage;

    }

    public double calculerSuperficieParType(Class<? extends Piece> type) {
        double superficieGlobale = 0.0;
        for (Piece piece : pieces) {
            if (type.isInstance(piece)) {
                superficieGlobale += piece.getSuperficie();
            }
        }
        return superficieGlobale;
    }
}
