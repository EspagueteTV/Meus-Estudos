/**
 *  Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais elementos.
 *  Escreva ao ﬁnal a matriz obtida.
 */
package br.com.siqueira.treinamento.Matrizes;

public class Exercicio02 {
    public static void main(String[] args){
        int[][] matriz = new int[5][5];

        // Preenchimento da Matriz
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i == j){
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j] = 0;
                }
            }
        }
        // Mostrar os valores da Matriz
        for(int[] ref: matriz){
            for(int valor: ref){
                System.out.printf("%d ", valor);
            }
            System.out.println();
        }



    }
}
