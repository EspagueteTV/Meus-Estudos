package br.com.siqueira.javacore.introducaometodos.teste;


import br.com.siqueira.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(5, 5);
        System.out.println("Continuar.........");
    }
}
