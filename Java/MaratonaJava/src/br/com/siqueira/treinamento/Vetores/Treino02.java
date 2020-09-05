/**  Faça um programa que preencha um vetor de tamanho 100 com os 100 primeiros naturais que não
 * são múltiplos de 7 ou que terminam com 7.
 * */
 package br.com.siqueira.treinamento.Vetores;

public class Treino02 {
    public static void main(String[] args){
        int vetor[] = new int[100];
        int cont = 1, i = 0;

        while(i < 100){
            if(cont % 7 != 0 && cont % 10 != 7){
                vetor[i] = cont;
                i++;
            }
            cont ++;
        }
        for(int v:vetor){
            System.out.println(v);
        }
    }
}
