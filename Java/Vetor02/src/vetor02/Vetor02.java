/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Família
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner teclado = new Scanner(System.in);
        String mes[] = {"Jan", "Fev", "Mar", "Apr", "Mai", "Jun", "Jul", "Aug",
                        "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                    
        Calendar an = Calendar.getInstance();
            int ano = an.get(Calendar.YEAR);
        
        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            tot[1] = 29;
        }
               
        for(int c = 0; c < mes.length; c++){
            System.out.printf("O mês de %s tem %d dias ao todo \n", mes[c], tot[c]);
        }
    }
    
}
