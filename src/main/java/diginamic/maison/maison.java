package diginamic.maison;

import java.util.ArrayList;
import java.util.List;

public class maison {
    private List<Piece> pieces;
    public maison(){
        pieces = new ArrayList<>();
    }
    public void ajouterPiece(Piece piece){
        pieces.add(piece);
    }
}
