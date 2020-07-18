/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;
        
/**
 *
 * @author Família
 */
public class ProgramaIdade {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Em que ano você nasceu: ");
            int nasc = teclado.nextInt();
        int i = 2020 - nasc;
        
        System.out.printf("Sua idade é %d \n", i);
        if(i >= 18){
            System.out.print("Maior de Idade \n");
        }else{
            System.out.print("Menor de Idade \n");
        }
        
    }
    
}
