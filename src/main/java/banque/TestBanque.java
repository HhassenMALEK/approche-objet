package banque;

import banque.entites.Compte;
import banque.entites.CompteTaux;

public class TestBanque{
    public static void main(String[] args) {
        Compte cpt = new Compte("51544151kj7", 1500.0);
        System.out.println(cpt);

        CompteTaux pel = new CompteTaux("95683211", 2000, 3);
        CompteTaux livretA = new CompteTaux("95683211", 2000, 4);
        System.out.println(livretA);

        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte("12345", 1000.0);
        comptes[1] = new CompteTaux("95683211", 2000, 4);

        for(int i =0; i < comptes.length; i++){
            System.out.println(i+1 +"-"+  comptes[i]);
        }
    }
}