package br.com.siqueira.introducao.outros;

public class Aula06Exercicio02 {
    public static void main(String[] args){
        String nome = "Gabriel";
        int idade = 16;
        double salario = 3500.00;
        char sexo = 'M';
        String estadoCivil = "Solteiro";

        System.out.printf("O trabalhador(a) %s do sexo %c, idade %d, estado cívil %s e salario %.2f encontra-se empregado neste estabelecimento.", nome, sexo, idade, estadoCivil, salario);
    }
}
