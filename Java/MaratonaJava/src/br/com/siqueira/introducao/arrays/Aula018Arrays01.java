package br.com.siqueira.introducao.arrays;

public class Aula018Arrays01 {
    public static void main(String args[]){
        int idade[] = new int[3];
        idade[0] = 20;
        idade[1] = 21;
        idade[2] = 30;

        for(int i = 0; i < idade.length; i++){
            System.out.printf("Idade %d = %d \n", i, idade[i]);
        }


    }
}
