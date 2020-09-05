/**
 * Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.
 */
package br.com.siqueira.treinamento.Matrizes;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int maioresDez = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.printf("Posição [%d][%d]: ", i, j);
                    matriz[i][j] = teclado.nextInt();
                if(matriz[i][j] > 10){
                    maioresDez++;
                }
            }
            System.out.println();
        }

        System.out.printf("Ao todo, temos %d números maiores que 10.", maioresDez);
        teclado.close();
    }
}
