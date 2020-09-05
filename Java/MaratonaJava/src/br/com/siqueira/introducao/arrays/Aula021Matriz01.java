package br.com.siqueira.introducao.arrays;

public class Aula021Matriz01 {
    public static void main(String[] args){
        int[][] dias = new int[2][2];
        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[1][0] = 29;
        dias[1][1] = 28;

        for(int i = 0; i < dias.length; i++){
            for(int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("---------------------------------------------------------------------------");
        for(int[] ref:dias){    // Referência de um Array
            for(int valor: ref){
                System.out.println(valor);
            }
        }

    }
}
