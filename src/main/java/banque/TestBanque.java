package banque;

import banque.entites.Compte;

public class TestBanque{
    public static void main(String[] args) {
        Compte cpt = new Compte("51544151kj7", 1500.0);
        System.out.println(cpt);
    }
}