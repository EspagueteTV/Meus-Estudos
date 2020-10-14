package br.com.siqueira.aula04.exercicios.classes.exercicio02;

import java.util.Scanner;

public class CalculadoraEstatica {

    static Scanner teclado = new Scanner(System.in);

    static double numero1;
    static double numero2;

    public static void lerNumero1(){
        System.out.print("Informe o Primeiro Valor: ");
            numero1 = teclado.nextDouble();
    }

    public static void lerNumero2(){
        System.out.print("Informe o Segundo Valor: ");
            numero2 = teclado.nextDouble();
    }

    public static void somar(){
        double soma = numero1 + numero2;
        System.out.printf("A soma entre %.2f e %.2f é %.2f \n", numero1, numero2, soma);
    }

    public static void subtrair(){
        double menos = numero1 - numero2;
        System.out.printf("A soma entre %.2f e %.2f é %.2f \n", numero1, numero2, menos);
    }

    public static void multiplicar(){
        double produto = numero1 * numero2;
        System.out.printf("O produto entre %.2f e %.2f é %.2f \n", numero1, numero2, produto);
    }

    public static void dividir(){
        double divisao = numero1 / numero2;
        System.out.printf("A divisão entre %.2f e %.2f é %.2f \n", numero1, numero2, divisao);
    }
}
