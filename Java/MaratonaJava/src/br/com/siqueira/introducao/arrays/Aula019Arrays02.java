package br.com.siqueira.introducao.arrays;

public class Aula019Arrays02 {
    public static void main(String[] args){
        float idade[]= new float[3];

        for(int i = 0; i < idade.length; i++){
            System.out.printf("Idade %d é %f \n", i, idade[i]);
        }
    }
}
