/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;
// Paineis ou telas prontas
/**
 *
 * @author Família
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Mostrar texto, parecido System.out.print
//        JOptionPane.showMessageDialog(null, "Olá Mundo", "Boas Vindas", JOptionPane.WARNING_MESSAGE);
        // Pegar um valor
        //int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
        //JOptionPane.showMessageDialog(null, "Você digitou o valor " + num);
        
        int num;
        int totValor=0, totPar=0, totImp=0, acimaCem=0;
        double soma=0, media;
        
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor: \n [0 para Interromper]")); 
            if(num != 0){
                totValor++;
                if(num % 2 == 0){
                    totPar++;
                }else{
                    totImp++;
                }
                if(num > 100){
                    acimaCem++;
                }
                soma += num;
            }
        }while(num != 0);
            
            media = soma / totValor;
        JOptionPane.showMessageDialog(null, "Resultado \n -------------"+
                "\nTotal de Valores: " + totValor +
                "\n Total de Pares: " + totPar + 
                "\n Total de Ímpares: " + totImp + 
                "\n Acima de 100: " + acimaCem +
                "\n Média dos Valores: " + media);
    }
}
