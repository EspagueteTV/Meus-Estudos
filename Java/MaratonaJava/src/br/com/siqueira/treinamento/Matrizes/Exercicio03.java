/**
 *  Fac¸a um programa que preenche uma matriz 4 x 4 com o produto do valor da linha e da coluna de cada elemento.
 *  Em seguida, imprima na tela a matriz.
 */

package br.com.siqueira.treinamento.Matrizes;

public class Exercicio03 {
    public static void main(String[] args){
        int[][] matriz = new int[4][4];

        // Preenchimento da matriz
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = i * j;
            }
        }

        // Mostrar a Matriz
        for(int[] ref: matriz){
            for(int valor: ref){
                System.out.printf("%d ", valor);
            }
            System.out.println();
        }
    }
}
