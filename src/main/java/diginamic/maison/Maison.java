package diginamic.maison;

import java.util.ArrayList;
import java.util.List;

public class Maison{
    private List<Piece> pieces;



    public Maison() {
        pieces = new ArrayList<>();
    }

   public void ajouterPiece(Piece piece){
        if(piece != null) {
            pieces.add(piece);
        }
        else{
            throw new IllegalArgumentException("La pièce ne peut pas être nulle.");
        }

    }
}
