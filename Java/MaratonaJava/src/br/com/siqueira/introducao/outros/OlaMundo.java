package br.com.siqueira.introducao.outros;

import java.util.Scanner;

public class OlaMundo {

    public static void linha(int v[]){
        for(int c:v){
            System.out.println(c);
        }
    }


    public static void main(String[] args){
        int vetor[] = new int[5];
        Scanner teclado = new Scanner(System.in);

        for(int c = 0; c < 5; c++){
            System.out.printf("Digite o %dº número: ", c);
            vetor[c] = teclado.nextInt();
        }

        linha(vetor);
        teclado.close();
    }
}
