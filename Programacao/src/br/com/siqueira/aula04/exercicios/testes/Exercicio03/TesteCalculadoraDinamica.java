package br.com.siqueira.aula04.exercicios.testes.Exercicio03;

import br.com.siqueira.aula04.exercicios.classes.exercicio03.CalculadoraDinamica;

public class TesteCalculadoraDinamica {
    public static void main(String[] args) {

        CalculadoraDinamica calc = new CalculadoraDinamica();

        // Leitura dos Valores
        calc.lerNumero1();
        calc.lerNumero2();

        System.out.println("-=-=-= Apresentação dos Dados =-=-=-");
        calc.somar();
        calc.subtrair();
        calc.multiplicar();
        calc.dividir();
    }
}