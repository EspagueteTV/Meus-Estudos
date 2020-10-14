package br.com.siqueira.aula04.exercicios.testes.Exercicio02;


import br.com.siqueira.aula04.exercicios.classes.exercicio02.CalculadoraEstatica;

public class TesteCalculadoraEstatica {

    public static void main(String[] args){

        CalculadoraEstatica.lerNumero1();
        CalculadoraEstatica.lerNumero2();

        System.out.println("-=-=-= Apresentação dos Dados =-=-=-");
        CalculadoraEstatica.somar();
        CalculadoraEstatica.subtrair();
        CalculadoraEstatica.multiplicar();
        CalculadoraEstatica.dividir();
    }
}
