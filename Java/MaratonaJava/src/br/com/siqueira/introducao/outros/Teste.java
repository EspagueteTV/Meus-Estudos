package br.com.siqueira.introducao.outros;

import java.util.Scanner;

public class Teste {

    public static double area(double larg, double comp){
        return larg * comp;
    }

    public static void main(String[] args){
        Scanner teclado= new Scanner(System.in);
        double largura, comprimento;

        System.out.print("Digite a largura do terreno: ");
            largura = teclado.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
            comprimento = teclado.nextDouble();

        double a = area(largura, comprimento);
        System.out.printf("A área total do terreno é %f", a);
        teclado.close();
    }
}