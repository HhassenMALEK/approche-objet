package banque;

import banque.entites.Credit;
import banque.entites.Debit;
import banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {

        Operation[] operations = new Operation[4];
        operations[0] = new Debit("22/07/2024", 11500.0);
        operations[1] = new Debit("08/057/2018", 22600.0);
        operations[2] = new Credit("14/02/2051", 51200.0);
        operations[3] = new Credit("12/07/2023", 50032.0);

        double totalMontant = 0.0;

        for (int i = 0; i < operations.length; i++){
            if(operations[i].getType().equals("Credit")){
                totalMontant += operations[i].getMontant();
            }else{
                totalMontant -= operations[i].getMontant();
            }
        }

        for( Operation cpt : operations){
            System.out.println(cpt +", " + cpt.getType() +", taotal "+ cpt.getMontant());
        }
        System.out.println("Le montant global des opérations est: " + totalMontant + "€");




    }
}
