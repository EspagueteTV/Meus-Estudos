package br.com.siqueira.introducao.arrays;

public class Aula019Arrays03 {
    public static void main(String[] args){
        String nome[] = new String[5];
        nome[0] = "Maria";
        nome[1] = "João";
        nome[2] = "Tony";
        nome[3] = "Steve";
        nome[4] = "Bruce";

        for(int i = 0; i < nome.length; i++){
            System.out.print(nome[i] + "\n");
        }
    }
}
