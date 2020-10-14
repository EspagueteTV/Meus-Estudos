package br.com.siqueira.aula04.exercicios.classes.exercicio03;

import java.util.Scanner;

public class CalculadoraDinamica {

    Scanner teclado = new Scanner(System.in);

    double numero1;
    double numero2;

    public void lerNumero1() {
        System.out.print("Informe o Primeiro Valor: ");
            numero1 = teclado.nextDouble();
    }

    public void lerNumero2() {
        System.out.print("Informe o Segundo Valor: ");
            numero2 = teclado.nextDouble();
    }

    public void somar() {
        double soma = numero1 + numero2;
        System.out.printf("Soma: %.2f + %.2f = %.2f \n", numero1, numero2, soma);
    }

    public void subtrair() {
        double subt = numero1 - numero2;
        System.out.printf("Subtração: %.2f - %.2f = %.2f \n", numero1, numero2, subt);
    }

    public void multiplicar() {
        double mult = numero1 * numero2;
        System.out.printf("Multiplicação: %.2f * %.2f = %.2f \n", numero1, numero2, mult);
    }

    public void dividir() {
        double div = numero1 / numero2;
        System.out.printf("Divisão: %.2f / %.2f = %.2f \n", numero1, numero2, div);
    }
}
