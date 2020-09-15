package br.com.siqueira.javacore.introducaometodos.teste;

import br.com.siqueira.javacore.introducaometodos.classes.Calculadora;

public class ParametrosTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 5, num2 = 10;
        calc.alteraDoisNumeros(num1, num2);

        System.out.println("Fora do altera dois números");
        System.out.printf("num1 = %d, num2 = %d \n", num1, num2);
    }
}
