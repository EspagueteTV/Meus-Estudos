package br.com.siqueira.introducao.outros;

import java.util.Calendar;
import java.util.Scanner;

public class Teste02 {
    public static String voto(int nasc){
        int ano = 2020;
        int idade = ano - nasc;

        if(idade < 16){
            return "Negado";
        }else if(idade < 18 || idade > 70){
            return "Opcional";
        }else{
            return "Obrigado";
        }
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int anoNasc;
        String mensagem;

        System.out.print("Informe seu ano de nascimento: ");
            anoNasc = teclado.nextInt();
        mensagem = voto(anoNasc);
        System.out.printf("Nesta eleição, seu voto é %s \n", mensagem);
        teclado.close();
    }
}
