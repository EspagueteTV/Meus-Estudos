package br.com.siqueira.introducao.arrays;

public class Aula022Matriz02 {
    public static void main(String[] args){
        // Formas de Inicialização do Vetor
        int[] array = {1, 2, 3};
        int[] array2 = new int[3];
        int[] array3 = new int[]{1, 2, 3};

        // Criando um Array multidimensional com tamanhos diferentes dos arryas - 1ª Forma
   //     int[][] dias = new int[3][];
  //      dias[0] = new int[2];       // Criando um novo array dentro do Array referência
 //       dias[1] = new int[]{1, 2, 3};
//        dias[2] = new int[4];

        // Criando um Array multidimensional com tamanhos diferentes dos arryas - 1ª Forma
        int[][] dias = {{0, 0}, {1, 2, 3}, {0, 0, 0, 0}};

        for(int[] ref:dias){
            for(int valor:ref){
                System.out.println(valor);
            }
        }
    }
}
