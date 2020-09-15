package br.com.siqueira.javacore.introducaometodos.teste;


import br.com.siqueira.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(5, 5);

        calc.imprimirDoisNumerosDivididos(20, 5);
        System.out.println("Continuar.........");

        int [] numeros = new int[]{1};

        calc.somaArray(numeros);
        calc.somaVarArgs(1, 2, 3, 4, 5);


    }
}
